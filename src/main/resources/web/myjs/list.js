/**
 * 
 */
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