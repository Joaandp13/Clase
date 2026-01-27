"use strict";

function demanarope() {
    let ope = (prompt("Introdueix una operació de les seguents (+, -, *, /):"));
    return ope;
}

function obtenirnum(pregunta) {
    let n
    do {
        n = parseInt(prompt(pregunta));
        if (isNaN(n) || n == null) {
            alert("Introdueix un número vàlid")
        }
    } while (isNaN(n))
    return n;
}

function operacio() {
    let a = obtenirnum("Introdueix el primer número: ")
    let o = demanarope()
    let b = obtenirnum("Introdueix el segon número: ")

    try {
        switch (o) {
            case "+":
                let suma = a + b;
                console.log("El resultat és: " + suma);
                break;

            case "-":
                let resta = a - b;
                console.log("El resultat és: " + resta);
                break;

            case "*":
                let multiplicacio = a * b;
                console.log("El resultat és: " + multiplicacio);
                break;

            case "/":
                if (b === 0) {
                    console.log("No es pot dividir per zero!");
                } else {
                    let divisio = a / b;
                    console.log("El resultat és: " + divisio);
                }
                break;

            default:
                console.log("Operació no vàlida");
        }
    } catch (error) {
        console.error("S'ha produït un error: " + error.message);
    }
}
let ask
do {
    operacio()
} while (ask == ("Si") || ask == ("si"))