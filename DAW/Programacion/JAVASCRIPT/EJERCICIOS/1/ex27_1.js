"use strict";
let contrasenya
let intents = parseInt(5)


contrasenya = prompt("Quina es la contrasenya?")

while (contrasenya != 1231 && intents !== 0) {
    alert("Et queden " + intents + " intents.")
    contrasenya = prompt("Quina es la contrasenya?: ")
        --intents;


}

if (intents == 0) {
    alert("T'has quedat sense intents")
    document.getElementById("imagen2").style.display = "block"
} else {
    alert("Contrasenya correcta!")
    document.getElementById("imagen").style.display = "block"
}