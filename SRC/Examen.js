//Ejercicio 1
var numero1 = 5;
var numero2 = 8;

if(numero1 <= numero2) {s
console.log("numero1 no es mayor que numero2");
}
if(numero2 > 0) {
console.log("numero2 es positivo");
}
if(numero1 > 0) {
console.log("numero1 es negativo o distinto de cero");
}

numero1= numero1 + 1
if(numero1< numero2) {
console.log (numero1)
console.log (numero2)
console.log("Incrementar en 1 unidad el valor de numero1 no lo hace mayor o igual que numero2");
}

//Ejercicio 2
var b = 8;
function sacafactorial (n) {
	var total = 1;
	for ( var i=1; i<=n; i++) {
		total = total * i; 
	}
	return total; 
}
console.log(sacafactorial(8));

//Ejercicio 3

var x = 6;
function sacaparoimpar(num) {
    if (num % 2 == 0){
       return "este numero es Par";
    }
   else{
       return "Este numero es Impar";
   }
}
console.log(sacaparoimpar(x));

//Ejercicio 4

function palindromo(str) {
    //validacion de expresiones regulares
    var re = /[\W_]/g;
    
    //validacion de mayusculas, y remplazo
    var inicio = str.toLowerCase().replace(re, '');
    //valdiacion de vacios, validacion de alreves y la union
    var alreves = inicio.split('').reverse().join('');
    return alreves === inicio;
    }
    console.log(palindromo("A man, a plan, a canal. Panama"))