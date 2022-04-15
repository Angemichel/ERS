/**
 * 
 */
 
 function reqReply(){
	window.location.href = "manageranswer.html";
}
 function ansRequest() {
	
	fetch('http://localhost:8080/pending')
	.then(response => response.json())
	.then(json=> displayData(json))
	.catch(err => console.log('Request Failed', err));
}

function putRequest(){
	var ERname = document.getElementById('ERname');
	var ERreason = document.getElementById('ERreason');
	var ERstatus = document.getElementById('ERstatus');
	//console.log(Ename.value);
	
	fetch('http://localhost:8080/employees/status',{
		method: 'PUT',
		headers: {'Content-Type': 'application/json'},
		body: JSON.stringify({
			name: ERname.value,
			reason: ERreason.value,
			status: ERstatus.value
		
		})
	})
}

function vLogin(){
	//window.location.href = "http://localhost:8080/em";
	//window.location.href = "http://localhost:8080/empl";
	//document.write("Let's see !!!'");
	//window.location.href = "allresquests.html";
	
	var user = sessionStorage.getItem("User");
	var ap = "http://localhost:8080/emp/"+user;
	fetch(ap)
	.then(response => response.json())
	.then(json=> dData(json))
	.catch(err => console.log('Request Failed', err));
	
}

function dData(response) {
    
   
   var tabl = document.getElementById('allDataDiv');
  	
   for(i=0;i<response.length;i++){
  
        var row = tabl.insertRow(i)
        
	    var cel1 = row.insertCell(0);
	    var cel2 = row.insertCell(1);
	    var cel3 = row.insertCell(2);
	    var cel4 = row.insertCell(3);
	    cel1.innerHTML = response[i].name;
	    cel2.innerHTML = response[i].amount;
	    cel3.innerHTML = response[i].reason;
	    cel4.innerHTML = response[i].status;
	    
  
   
 }
 tabl;
 }
	     	



function gotoemp(){
	window.location.href = "emprequests.html";
	//var username=document.getElementById("username").value;
	
}

