const Values = [1,3,4,2,6,5,"JRR" ,"Pescar",0,-1,-2,-3,-60];
//función que valida si es numero
function DepuraNumber(caract) {
return caract.filter(x => (typeof x === "number" && x > -1) );
}
//El sort ordena
console.log(DepuraNumber(Values).sort())