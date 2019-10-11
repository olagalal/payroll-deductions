function setCppDisabled() {
	var zero = '0.00';
	
	var str1 = document.getElementById("yearToDatePeAmount").value
		
	var indexDot = str1.indexOf(".");
	var indexComma = str1.indexOf(",");
	
	if (indexDot>0) {
		var decimalChr = ".";
		var decimalValue=1;
	} else {
		if (indexComma>0) {
			var decimalChr = ",";
			var decimalValue=1;
		} else {
			var decimalChr = "";
			var decimalValue=0;
		}
	}
	
	if (decimalValue>0) {
		var val1= zero.replace(".",decimalChr);
	} else {
		var val1 = '0';
	}
	
	var str2 = document.getElementById("yearToDateCPPAmount").value
		
	indexDot = str2.indexOf(".");
	indexComma = str2.indexOf(",");
	
	if (indexDot>0) {
		decimalChr = ".";
		decimalValue=1;
	} else {
		if (indexComma>0) {
			decimalChr = ",";
			decimalValue=1;
		} else {
			decimalChr = "";
			decimalValue=0;
		}
	}
	
	if (decimalValue>0) {
		var val2= zero.replace(".",decimalChr);
	} else {
		var val2 = '0';
	}
	
	document.getElementById("yearToDatePeAmount").value=val1;
	document.getElementById("yearToDateCPPAmount").value=val2;
	document.getElementById("yearToDatePeAmount").disabled = true;
	document.getElementById("yearToDateCPPAmount").disabled = true;
}
function setCppUnable() {
	document.getElementById("yearToDatePeAmount").disabled = false;
	document.getElementById("yearToDateCPPAmount").disabled = false;
}
function setEiDisabled() {
	var zero = '0.00';
	
	var str1 = document.getElementById("yearToDateIeAmount").value
		
	var indexDot = str1.indexOf(".");
	var indexComma = str1.indexOf(",");
	
	if (indexDot>0) {
		var decimalChr = ".";
		var decimalValue=1;
	} else {
		if (indexComma>0) {
			var decimalChr = ",";
			var decimalValue=1;
		} else {
			var decimalChr = "";
			var decimalValue=0;
		}
	}
	
	if (decimalValue>0) {
		var val1= zero.replace(".",decimalChr);
	} else {
		var val1 = '0';
	}
	
	var str2 = document.getElementById("yearToDateEIAmount").value
		
	indexDot = str2.indexOf(".");
	indexComma = str2.indexOf(",");
	
	if (indexDot>0) {
		decimalChr = ".";
		decimalValue=1;
	} else {
		if (indexComma>0) {
			decimalChr = ",";
			decimalValue=1;
		} else {
			decimalChr = "";
			decimalValue=0;
		}
	}
	
	if (decimalValue>0) {
		var val2= zero.replace(".",decimalChr);
	} else {
		var val2 = '0';
	}
	
	document.getElementById("yearToDateIeAmount").value=val1;
	document.getElementById("yearToDateEIAmount").value=val2;
	document.getElementById("yearToDateIeAmount").disabled = true;
	document.getElementById("yearToDateEIAmount").disabled = true;
}
function setEiUnable() {
	document.getElementById("yearToDateIeAmount").disabled = false;
	document.getElementById("yearToDateEIAmount").disabled = false;
}