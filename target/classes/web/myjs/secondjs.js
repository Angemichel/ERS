/**
 * 
 */
 function ansRequest() {
	window.location.href = "manageranswer.html";
	fetch('http://localhost:8080/em')
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