function getCustomerInfo() {
    var phone = $("#phone").val();
    if (phone == "") {
        $("#address").val("");
        $("#order").val("");
    } else {
        $.ajax({
            type: "GET",
            url: "lookupCustomer_json.jsp?phone=" + phone,
            dataType: "json",
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

function updatePage(json) {
    var obj = JSON.parse(json);
    document.getElementById("greeting").innerHTML = obj.name; 
    var address = obj.address; 
    
    if (address) {
        $("#address").val(address.street + "\n" + address.city + ", " + address.state + " " + address.zipCode);
    } else {
        $("#address").val(""); 
    }
}


function submitOrder() {
    var data = {
        phone: $("#phone").val(),
        address: $("#address").val(),
        order: $("#order").val()
    };
    
    var jsonStr = JSON.stringify(data);

    $.ajax({
        type: "POST",
        url: "placeOrder_json.jsp",
        contentType: "application/json; charset=UTF-8", 
        data: jsonStr, 
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
    var p = document.createElement("p");
    p.innerHTML = `Your order should arrive within ${response} minutes. Enjoy your pizza!`;
    var span = document.createElement("span");
    $(span).append(p);
    $("#main-page > span").remove();
    $("#main-page").append(span);
    
    // Or you can replace the form with the confirmation as below:
    // $("#order-form").replaceWith(p);    
}