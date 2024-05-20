package mondial;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import java.io.*;
import java.security.KeyStore.Entry.Attribute;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;

public class processMondial {
	static final String inputFile = "mondial/mondial.xml"; // 나중에 "mondial/mondial.xml"로 변경해서 테스트
	static final String outputFile = "mondial/result.xml";

	// 대륙별 인구 계산 및 출력을 위해 대륙 이름들을 저장한 배열 정의
	static final String continent[] = new String[] { "Africa", "America", "Asia", "Australia", "Europe" };

	static long pop[] = new long[5]; // 각 대륙의 인구 값을 저장할 배열 선언(대륙의 순서는 위 배열과 동일)

	public static void main(String[] args) throws Exception {
		// DOM 파서 생성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder = factory.newDocumentBuilder();

		// XML 문서 파싱하기
		Document document = builder.parse(inputFile);

		Element mondial = document.getDocumentElement();

		// 대륙별 인구를 계산 및 출력 (3번)
		computePopulationsOfContinents(mondial);

		// 종교별 신자 수를 계산 및 출력 (4번)
		// computeBelieversOfReligions(mondial);

		// 국가별 정보 검색 및 출력 (1번)
		processCountries1(mondial);

		// 국가별 정보 검색 및 DOM 트리 수정 (2번)
		processCountries2(mondial);

		// 처리 결과 출력을 위한 변환기 생성
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();

		// 출력 포맷 설정: XML 선언과 문서 유형 선언 내용 설정하기
		transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		// transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,
		// "mondial.dtd");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

		// DOMSource 객체 생성
		DOMSource source = new DOMSource(document);

		// StreamResult 객체 생성
		StreamResult result = new StreamResult(new File(outputFile));

		// 파일로 저장하기
		transformer.transform(source, result);

		System.out.println();
		System.out.println(outputFile + "로 저장되었습니다.");
	}

	public static void processCountries1(Element mondial) {
		// 여기서부터...
		for (Node ch = mondial.getFirstChild(); ch != null; ch = ch.getNextSibling()) {
			if (ch.getNodeName().equals("country")) {
				Node name = ch.getFirstChild(); // <name>
				String countryName = name.getFirstChild().getNodeValue();
				System.out.println(countryName);

				Node pop = name.getNextSibling();
				String popName = pop.getFirstChild().getNodeValue();
				System.out.println(popName); // population

				/*
				 * NamedNodeMap mp = ch.getAttributes(); mp.getNamedItem("area").getNodeValue();
				 * 바로 밑에 한줄이랑 같은 코드임. 두번째 경우가 더 좋아
				 */

				String area = ((Element) ch).getAttribute("area");

				// 수도
				String captialId = ((Element) ch).getAttribute("capital");
				if (!captialId.isEmpty()) {
					Element cap = ch.getOwnerDocument().getElementById(captialId);
					// 첫번째 자식 엘리먼트가 name. 그 name 찾아서...

					Node capital = cap.getFirstChild();
					String capName = capital.getFirstChild().getNodeValue();
					System.out.println(capName);
				} // captial이 없고 값이 null일 경우.
			}
		}
	}

	public static void processCountries2(Element mondial) {

		NodeList list = mondial.getElementsByTagName("country");

		for (int i = 0; i < list.getLength(); i++) {
			Element country = (Element) list.item(i);
			// 각 <country> element에 대해

			// 2-1 <code>를 생성해서 <name>다음에 추가
			// country의 car_code속성 값을 구함

			Document doc = mondial.getOwnerDocument(); // 현재 노드가 속한 문서를 반환
			// code element 노드를 생성한다
			Element code = doc.createElement("code");

			String carCodeAttribute = country.getAttribute("car_code");
			// text element 생성
			Text codeText = doc.createTextNode(carCodeAttribute);

			// element와 text를 부모 자식으로 연결
			code.appendChild(codeText);

			// country의 두번째 자식 노드를 구하고, 그 앞에 code 삽입
			Node nameNode = country.getElementsByTagName("name").item(0);
			country.insertBefore(code, nameNode.getNextSibling());
		}

		// 2-2 수도에 해당하는 <city> 및 그 subtree를 dom 트리에서 찾아 미리 제거해 둠
		// country의 captial 속성 값을 구함

		NodeList countries = mondial.getElementsByTagName("country");
		Element capitalCity = null;

		for (int i = 0; i < list.getLength(); i++) {
			Element country = (Element) list.item(i);

			String capitalId = country.getAttribute("capital");

			if (!capitalId.isEmpty()) {
	            // capital city를 해당 country 요소의 자식 노드에서 찾음
	            NodeList cities = country.getElementsByTagName("city");
	            for (int j = 0; j < cities.getLength(); j++) {
	                Element city = (Element) cities.item(j);
	                if (city.getAttribute("id").equals(capitalId)) {
	                    capitalCity = city;
	                    break;
	                }
	            }

	            // capital city가 없으면 건너뜀
	            if (capitalCity == null) {
	                continue;
	            }

	            // capital city 및 subtree를 DOM 트리에서 제거
	            capitalCity.getParentNode().removeChild(capitalCity);
	        }
		}

		// 2-3 <population> 이후의 형제 노드들을 모두 삭제
		for (Node ch = mondial.getFirstChild(); ch != null; ch = ch.getNextSibling()) {
			if (ch.getNodeName().equals("country")) {
				Node pop = ch.getFirstChild().getNextSibling();
				Node nextSibling = pop.getNextSibling();

				while (nextSibling != null) {
					Node deleteNode = nextSibling;
					nextSibling = nextSibling.getNextSibling();
					ch.removeChild(deleteNode);
				}

				// 2-4 앞에서 제거해 둔 수도에 해당하는 <city>및 그 서브트리를 <country>의 마지막 자식으로 추가
				ch.appendChild(capitalCity.cloneNode(true));

				// city의 id를 제외한 모든 속성들을 삭제

				Element city2 = (Element) ch.getLastChild();
				NamedNodeMap attribute = city2.getAttributes();

				for (int j = attribute.getLength() - 1; j >= 0; j--) {
					Node attribute2 = attribute.item(j);
					if (!attribute2.getNodeName().equals("id")) {
						city2.removeAttribute(attribute2.getNodeName());
					}
				}
			}
			// 2-5 <country>의 모든 속성들을 삭제
			// removeAttributeNode 써야 돼 -> Attr 속성인데
			NamedNodeMap attr = ch.getAttributes();
			for (int k = attr.getLength() - 1; k >= 0; k--) {
				Node removeAttr = attr.item(k);
				((Element) ch).removeAttributeNode((Attr) removeAttr);
			}
			// 2-6 <country> 외의 다른 노드들을 모두 삭제
			Node ch2 = mondial.getFirstChild();
			if (!ch2.getNodeName().equals("country")) {
				Node nextNode = ch2.getNextSibling();
				mondial.removeChild(ch);
				ch = nextNode;
			} else {
				ch = ch.getNextSibling();
			}
		}
	}

	public static void computePopulationsOfContinents(Node mondial) {
        long[] continentPopulations = new long[5]; 

        NodeList countryList = mondial.getChildNodes();
        for (int i = 0; i < countryList.getLength(); i++) {
            Node countryNode = countryList.item(i);
            if (countryNode.getNodeType() == Node.ELEMENT_NODE) {
                Element countryElement = (Element) countryNode;

                long countryPop = 0;
                NodeList populationList = countryElement.getElementsByTagName("population");
                // 주의!! <population>이 존재하지 않을 수도 있음
                if (populationList.getLength() > 0) {
                    Element populationElement = (Element) populationList.item(0);
                    countryPop = Long.parseLong(populationElement.getTextContent());
                } // lonf type
                

                NodeList encompassedList = countryElement.getElementsByTagName("encompassed");
                String maxContinent = "";
                double maxPercentage = 0.0;

                for (int j = 0; j < encompassedList.getLength(); j++) {
                    Element encompassedE = (Element) encompassedList.item(j);
                    String continent = encompassedE.getAttribute("continent");
                    double percentage = Double.parseDouble(encompassedE.getAttribute("percentage"));

                    //   단, 최대 값에 대응되는 continent 값을 구해야 하므로 
                    //   미리 percentage의 max 값을 저장할 변수와 percentage가 max일 때의 continent 값을 저장할 변수를
                    //   선언하고 두 변수 값을 함께 update함
                    
                    if (percentage > maxPercentage) {
                        maxContinent = continent;
                        maxPercentage = percentage;
                    }
                }
                switch (maxContinent) {
                    case "europe":
                        continentPopulations[0] += countryPop;
                        break;
                    case "asia":
                        continentPopulations[1] += countryPop;
                        break;
                    case "america":
                        continentPopulations[2] += countryPop;
                        break;
                    case "africa":
                        continentPopulations[3] += countryPop;
                        break;
                    case "australia":
                        continentPopulations[4] += countryPop;
                        break;
                    default:
                        break;
                }
            }
        }
        printPopulationsOfContinents(continentPopulations);
    }

    public static void printPopulationsOfContinents(long[] continentPopulations) {
    	String[] continents = {"Europe", "Asia", "America", "Africa", "Australia"};
    	
        for (int i = 0; i < continentPopulations.length; i++) {
            System.out.println("Population of " + continents[i] + ": " + continentPopulations[i]);
        }
    }
    
    
    // 4번 추가문제
    
    public static void ReligionCount(Node mondial) {
        Map<String, Long> religioners = new HashMap<>();

        NodeList countryList = mondial.getChildNodes();
        for (int i = 0; i < countryList.getLength(); i++) {
            Node countryNode = countryList.item(i);
            if (countryNode.getNodeType() == Node.ELEMENT_NODE) {
                Element countryElement = (Element) countryNode;

                NodeList religionList = countryElement.getElementsByTagName("religions");
                
                for (int j = 0; j < religionList.getLength(); j++) {
                    Element religionElement = (Element) religionList.item(j);
                    String religionName = religionElement.getTextContent();
                    
                    double percentage = Double.parseDouble(religionElement.getAttribute("percentage"));
                    long countryPopulation = getCountryPopulation(countryElement);
                    long followers = (long) (countryPopulation * (percentage / 100));

                    if (religioners.containsKey(religionName)) {
                        long currentFollowers = religioners.get(religionName);
                        religioners.put(religionName, currentFollowers + followers);
                    } else {
                        religioners.put(religionName, followers);
                    }
                    
                }
            }
        }

        List<Map.Entry<String, Long>> sortedReligions = new ArrayList<>(religioners.entrySet());
        sortedReligions.sort(Map.Entry.<String, Long>comparingByValue().reversed());

        System.out.println("종교");
        
        for (Map.Entry<String, Long> entry : sortedReligions) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } // key, value로 받아야 함
    }

    // 이건 똑같이 하면 돼
    private static long getCountryPopulation(Element countryElement) {
        NodeList populationList = countryElement.getElementsByTagName("population");
        
        if (populationList.getLength() > 0) {
            Element populationElement = (Element) populationList.item(0);
            return Long.parseLong(populationElement.getTextContent());
        }
        
        return 0;
    }
    
    
    
}