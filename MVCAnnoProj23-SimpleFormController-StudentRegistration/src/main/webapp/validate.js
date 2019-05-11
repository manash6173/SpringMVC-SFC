/**
 * 
 */

function validate(frm){
	alert("Client side form validation is enabled");
	frm.vflag.value="yes";
	//read form data
	let name=frm.sname.value;
	let addr=frm.addr.value;
	let course=frm.course.value;
	let mob=frm.mob.value;
	let email=frm.email.value;
	
	//empty the error message
	document.getElementById("nameError").innerHTML="";
	document.getElementById("addrError").innerHTML="";
	document.getElementById("courseError").innerHTML="";
	document.getElementById("mobError").innerHTML="";
	document.getElementById("emailError").innerHTML="";
	
	
	if(name.length==0 || name==null || name==""){
		document.getElementById("nameError").innerHTML="Name is mandatory";
		frm.sname.focus();
		return false;
	}
	else if(!isNaN(name)){
		document.getElementById("nameError").innerHTML="Name must contains words";
		frm.sname.focus();
		return false;	
	}
	else if(name.length>20){
		 document.getElementById("nameError").innerHTML="Name  must contains in the range of 20 char";
			frm.sname.focus();
			return false;
	}
	
	
	if(addr.length==0 || addr==null || addr==""){
	
		document.getElementById("addrError").innerHTML="Address is mandatory";
		frm.addr.focus();
		return false;
	}
	else if(!isNaN(addr)){
		document.getElementById("addrError").innerHTML="Address must contains words";
		frm.addr.focus();
		return false;	
	}
	else if(addr.length>20){
		 document.getElementById("addrError").innerHTML="Address  must contains in the range of 20 char";
			frm.addr.focus();
			return false;
	}
	
	
	if(course.length==0 || course==null || course==""){
		document.getElementById("courseError").innerHTML="course is required";
		frm.course.focus();
		return false;
	}
	else if(!isNaN(course)){
		document.getElementById("courseError").innerHTML="Course must contains words";
		frm.course.focus();
		return false;	
	}
	else if(course.length>20){
		 document.getElementById("courseError").innerHTML="Course  must contains in the range of 20 char";
			frm.course.focus();
			return false;
	}
	
	
	
	if(mob.length==0){
		document.getElementById("mobError").innerHTML="Mobile Number is required";
		frm.mob.focus();
		return false;
	}
	else if(isNaN(mob)){
		document.getElementById("mobError").innerHTML="MobileNumber must contains only digits";
		frm.mob.focus();
		return false;
	}
	else if(mob.length!=10){
		document.getElementById("mobError").innerHTML="MobileNumber must contains only 10 digits";
		frm.mob.focus();
		return false;
	}
	
	
	if(email.length==0 || email==null || email==""){
		document.getElementById("emailError").innerHTML="Email is required";
		frm.email.focus();
		return false;
	}	
	else if(email.length>20){
		document.getElementById("emailError").innerHTML="Email must contains in the range of 20 char";
		frm.email.focus();
		return false;
	}	
	return true;
}