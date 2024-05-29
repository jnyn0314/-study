function getCustomerInfo() {
	var phone = $("#phone").val();
	if (phone == "") {
		$("#address").val("");
		$("#order").val("");
	} // 전화번호를 입력했을 때 실행됨
	else {
		$.ajax({
	 		//type: "GET",
	 		type : "POST",
			// url: "lookupCustomer_xml.jsp?phone=" + phone,
			url: "lookupCustomer_xml.jsp", 
			data: {"phone": phone},   
			dataType: "xml",
			success: updatePage,
			error: function(jqXHR) {
				var message = jqXHR.getResponseHeader("Status");
				if ((message == null) || (message.length <= 0)) {
					alert("Error! Request status is " + jqXHR.status);
				} else {
					alert(message);	
				}
			}
		});
	}
}

function updatePage(xmlDoc) {
	alert("response: " + xmlDoc);
	/* Update the HTML web form */
	// dom api 이름과 address 받아서
	// $("#address").find(address)
	var name = xmlDoc.getElementsByTagName("name")[0].textContent;
	var street = xmlDoc.getElementsByTagName("street")[0].textContent;
	var city = xmlDoc.getElementsByTagName("city")[0].textContent;
	var state = xmlDoc.getElementsByTagName("state")[0].textContent;
	var zipCode = xmlDoc.getElementsByTagName("zipCode")[0].textContent;
	
	var address = name + "\n" + street + "\n" + city + "\n" + state + "\n" + zipCode + "\n";
	$("#address").val(address);
	
	document.getElementById("address").innerHTML = address;
}	

function submitOrder() {
	var data = {
		phone: $("#phone").val(), 
		address: $("#address").val(), 
		order: $("#order").val()
	};
	$.ajax({
 		type: "POST",
		url: "placeOrder_xml.jsp",
		contentType: "application/x-www-form-urlencoded; charset=UTF-8", // default(생략 가능)
		data: data,	
		dataType: "text",
		success: showConfirmation,
		error: function(jqXHR) {
			var message = jqXHR.getResponseHeader("Status");
			if ((message == null) || (message.length <= 0)) {
				alert("Error! Request status is " + jqXHR.status);
			} else {
				alert(message);	
			}
		}
	});
}

function showConfirmation(response) {
	// Create some confirmation text
	var p = document.createElement("p");
	p.innerHTML = `Your order should arrive within ${response} minutes. Enjoy your pizza!`;
	var span = document.createElement("span");
	$(span).append(p);
	$("#main-page > span").remove();
	$("#main-page").append(span);
	
	// Or you can replace the form with the confirmation as below:
	// $("#order-form").replaceWith(p);	
}