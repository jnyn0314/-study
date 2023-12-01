// 20220803 컴퓨터학과 정여진
package jspbook.pr32;

import java.util.ArrayList;

public class AddrManager {
	public ArrayList<AddrBean> AddrList;
	
	AddrManager(){
		this.AddrList = new ArrayList<AddrBean>();
	} // 기본 생성자로 arrayList 객체 생성
	
	public ArrayList<AddrBean> getAddrList(){
		return AddrList;
	}
	public void setAddrList(ArrayList<AddrBean> AddrList) {
		this.AddrList = AddrList;
	}
	public void add(AddrBean ab) {
		AddrList.add(ab);
	}
}
