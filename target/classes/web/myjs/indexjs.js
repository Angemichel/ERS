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
	window.location.href = "http://localhost:8080/em";
	//window.location.href = "http://localhost:8080/empl";
	//document.write("Let's see !!!'");
	fetch('http://localhost:8080/em')
	.then(response => response.json())
	.then(data => console.log(data));
	
}

async function totable(url, table){
	const tableHead = table.querySelector("thead");
	const tableBody = table.querySelector("tbody");
	const reponse = await fetch(url);
	
	const {headers,rows} = await reponse.json();
	
	tableHead.innerHTML = "<tr></tr>";
	tableBody.innerHTML = "";
	
	for (const headerText of headers) {
		const headerElement = document.createElement("th");
		
		header.Element.textContent = headerText;
		tableHead.querySelector("tr").appendChild(headElement);
	}
	
	for (const row of rows) {
		const rowElement = document.createElement("tr");
		
		for (const cellText of row){
			const cellElement = document.createElment("td");
			
			cellElement.textContent = cellText;
			rowElement.appendChild(rowElement);
		}
		tableBody.appendChild(rowElement);
	}
	
	
}

totable("http://localhost:8080/em", document.querySelector("table"));