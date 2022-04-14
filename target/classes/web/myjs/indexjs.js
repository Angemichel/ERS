/**
 * 
 */
 function validate()
{
var username=document.getElementById("username").value;
var password=document.getElementById("password").value;
if(username=="a"&& password=="b" && document.getElementById("employee").checked == true )
{
        //window.open("employee.html");
        window.location.href = "employee.html";
    
} else if (username=="a" && password=="b" && document.getElementById("manager").checked == true){ 
    //window.open("manager.html");
    window.location.href = "manager.html";
}
else
{
    alert("login failed");
}

}


function getall(){
	//window.location.href = "http://localhost:8080/em";
	//window.location.href = "http://localhost:8080/empl";
	//document.write("Let's see !!!'");
	window.location.href = "allresquests.html";
	
	//fetch('http://localhost:8080/em')
	//.then(response => response.json())
	//.then(json=> displayData(json))
	//.catch(err => console.log('Request Failed', err));
	
}


function getit(){
	//window.location.href = "http://localhost:8080/em";
	//window.location.href = "http://localhost:8080/empl";
	//document.write("Let's see !!!'");
	//window.location.href = "allresquests.html";
	fetch('http://localhost:8080/em')
	.then(response => response.json())
	.then(json=> displayData(json))
	.catch(err => console.log('Request Failed', err));
	
}

function displayData(response) {
    //var dataSection = document.getElementById('allDataDiv');
    var tabl = document.getElementById('allDataDiv');
    
   //alert(response.length)
   //var list=document.createElement("ul");
   
   	//var list=document.createElement("tr");
   	
   	
   for(i=0;i<response.length;i++){
    //var item=document.createElement("li");
     //var item=document.createElement("td");
     
 
	 //item.innerHTML=response[i].name +"     "+response[i].amount+"     "+response[i].reason+"     "+response[i].status;
		
        var row = tabl.insertRow(i)
        
	    var cel1 = row.insertCell(0);
	    var cel2 = row.insertCell(1);
	    var cel3 = row.insertCell(2);
	    var cel4 = row.insertCell(3);
	    cel1.innerHTML = response[i].name;
	    cel2.innerHTML = response[i].amount;
	    cel3.innerHTML = response[i].reason;
	    cel4.innerHTML = response[i].status;
	    
	    

        
       //alert(response[i].id +" "+response[i].name);
       /*
      	 item.innerHTML= response[i].name;
      	 
         item.innerHTML= response[i].amount;
         
         item.innerHTML= response[i].reason;
         
         item.innerHTML= response[i].status;
         */
        
        //list.appendChild(item);
   }
  
   //dataSection.appendChild(list);
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