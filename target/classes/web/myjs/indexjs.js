/**
 * 
 */
 function validate()
{
var username=document.getElementById("username").value;
var password=document.getElementById("password").value;
if(username=="a"&& password=="b")
{
    //alert("login succesfully");
    if (document.getElementById('employee').checked == true)
    {
        window.open("employee.html");
    }else (document.getElementById('manager').checked == true)
    {
        window.open("manager.html");
    }
    
}
else
{
    alert("login failed");
}


}

function getall(){
	window.open("http://localhost:8080/em");
}