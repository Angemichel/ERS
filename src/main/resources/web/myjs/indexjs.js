/**
 * 
 */

 function validate()
{
var username=document.getElementById("username").value;
var password=document.getElementById("password").value;
sessionStorage.setItem("User", username);
if(username=="Kyrie Irving"&& password=="ki" && document.getElementById("employee").checked == true )
{
        //window.open("employee.html");
        window.location.href = "employee.html";
        
    
} else if (username=="Kevin Durant" && password=="kd" && document.getElementById("employee").checked == true){ 
    //window.open("manager.html");
    //window.location.href = "manager.html";
    window.location.href = "employee.html";
}
else if (username=="Steve Nash" && password=="sn" && document.getElementById("manager").checked == true){ 
    //window.open("manager.html");
    window.location.href = "manager.html";
    
}else if (username=="Steve Kerr" && password=="sk" && document.getElementById("manager").checked == true){ 
    //window.open("manager.html");
    window.location.href = "manager.html";
}
else if (username=="Josh" && password=="j" && document.getElementById("employee").checked == true){ 
    //window.open("manager.html");
    window.location.href = "employee.html";
}
else if (username=="Ben Simmons" && password=="bs" && document.getElementById("employee").checked == true){ 
    //window.open("manager.html");
    //window.location.href = "manager.html";
    window.location.href = "employee.html";
}
else
{
    alert("login failed");
}

}


function getall(){
	
	window.location.href = "allresquests.html";
	
	
	
}


function getit(){
	
	fetch('http://localhost:8080/em')
	.then(response => response.json())
	.then(json=> displayData(json))
	.catch(err => console.log('Request Failed', err));
	
}

function displayData(response) {
   
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

function newRequest() {
	window.location.href = "newrequest.html";
	
}

function postOne(){
	var Ename = document.getElementById('Rname');
	var Eamount = document.getElementById('Ramount');
	var Ereason = document.getElementById('Rreason');
	//console.log(Ename.value);
	
	fetch('http://localhost:8080/employees',{
		method: 'POST',
		headers: {'Content-Type': 'application/json'},
		body: JSON.stringify({
			name: Ename.value,
			amount: Eamount.value,
			reason: Ereason.value
		
		})
	})
}

function afterRequest() {
	window.location.href = "afterrequest.html";
	
}

function goBack(){
	window.location.href = "employee.html";
}

function goManager(){
	window.location.href = "manager.html";
}
function getone(){
	
	fetch('http://localhost:8080/emp',{
		method: 'GET',
		headers: {'Content-Type': 'application/json'},
		body: JSON.stringify({
			name: 'Ange',
			amount: '',
			status: ''
			
	})
	})
	.then(response => response.json())
	.then(json=> displayData(json))
	.catch(err => console.log('Request Failed', err));
	
}

function gotologin(){
	window.location.href = "http://localhost:8080/";
}
