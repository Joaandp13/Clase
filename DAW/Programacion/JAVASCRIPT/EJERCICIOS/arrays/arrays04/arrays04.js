import {
    arraynumerosrandom
} from "../../../libreria.js";


let array1 = arraynumerosrandom(1, 100, 10);
let array2 = arraynumerosrandom(1, 100, 10);
let arraycombi = []
for (let i = 0; i < 10; ++i) {
    arraycombi.push(array1[i] + array2[i])
}
console.log(array1)
console.log(array2)
console.log(arraycombi)