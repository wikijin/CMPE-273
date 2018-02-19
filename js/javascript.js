/**	CMPE 273 - HW1
 * 	Yu Fu
 * JavaScript
 */ 

/** 1. variable
*/
var a= "This ";
var b= "is ";
var c=	1;
console.log (a+b+c + ".");


/**	2. Objects
*/

var mbp = {
		name: "MacBook", year: 2016,
		display:"12 inch",
		processor: "1.1GHz dual-core Intel Core m3 processor",
		memory: "8GB",storage: "256GB",price: "$1299" 
};

console.log ("Name: " + mbp.name);
console.log ("Year: " + mbp.year);
console.log ("Display: " + mbp.display);
console.log ("Processor: " + mbp.processor);
console.log ("Memory: " + mbp.memory);
console.log ("Storage: " + mbp.storage);
console.log ("Price: " + mbp.price);


/**	3. Functions
*/

function mathFunc(startNumber, finishNumber)
{
	var total =0;
	for(i =startNumber; i<=finishNumber;i++)
	{
		total=total + i;
	}
	return total;
}

var total=mathFunc(1,10);
console.log("Add all numbers from 1 to 10 is : " + total);

/**	4. Event 
*/
// in HTML file

/** 5. Arrays
 */

var mb = new Array ("macBook", 2016,"8GB","12 inch","$1299");
console.log("Name: "+ mb[0]);
console.log("Year: "+ mb[1]);
console.log("Memory: "+ mb[2]);
console.log("Display: "+ mb[3]);
console.log("price: " +mb[4]);
/**
 * 6. inheritance
*/



function personInfo(firstName,lastName,BoD,tel,email)
{
	this.firstName= firstName;
	this.lastName=lastName;
	this.BoD=BoD;
	this.tel=tel;
	this.email=email;
	}

var yu = new personInfo ("Yu","Fu","Nov 19,1992",
		"(800)-800-8000","abc@abc.com");
console.log("Print Yu's personal Information:");
console.log("Name: "+yu.firstName+' ' + yu.lastName);
console.log("Birthday: " +yu.BoD);
console.log("telephone number: " + yu.tel);
console.log("e-Mail: "+ yu.email);

/**	7. Conditions
 */
function compareNumber(firstNumber,secondNumber)
{
	if (firstNumber>secondNumber)
	{
		console.log(firstNumber +" > "+ secondNumber);
	}
	else if (firstNumber<secondNumber)
	{
		console.log(firstNumber +" < "+ secondNumber);
	}
	else
	{
		console.log(firstNumber +" = "+ secondNumber);
	}
}

compareNumber(1,2);
compareNumber(15,2);
compareNumber(15,15);

/**	8. Regular Expression
 */

var string= "Helow World!";

console.log(string.replace(/Helow/i,"Hello"));

/** 9. Strict mode
 *
 */

function func(){
	 'use strict';
	var x=1;
	 }
func();

/** 10. Error
 */

try {
    Daste(); //Date()
}
catch(err) {
    console.log("error")
}

/**	11. Type Conversion
 */
var x = 1234567; 
var y =String(x);
console.log(typeof x);
console.log(typeof y);

/** 12. JSON
 * 
 */

var mb = '{"name": "New MacBook",'+
	'"year": 2016,'+
	'"display":"12 inch",'+
	'"processor": "1.1GHz dual-core Intel Core m3 processor",'+
	'"memory": "8 GB",'+
	'"storage": "256 GB",'+
	'"price": "$1299"}';

var obj = JSON.parse(mb);

console.log(obj.name);
console.log(obj.year);
console.log(obj.display);
console.log(obj.processor);
console.log(obj.memory);
console.log(obj.storage);
console.log(obj.price);


