let vector = 7
let numero1 = 1, numero2=2
let resultado = 0
console.log(numero1)
for (let index = 1; index <= vector; index++) 
    {    resultado = numero1 + numero2    
         numero1 = numero2    
         numero2 = resultado    
         console.log(resultado)
    }

