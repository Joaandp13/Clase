"use strict";
let password;

function validarPassword() {
    let pasvalid = false;

    while (pasvalid == false) {

        do {
            password = prompt("Introdueix una contrasenya:");
        } while (password.length < 8)

        let mayus = false;
        let minus = false;
        let digit = false;

        for (let i = 0; i < password.length; i++) {
            let c = password.charAt(i)
            if (c >= 'A' && c <= 'Z') mayus = true;
            if (c >= 'a' && c <= 'z') minus = true;
            if (c >= '0' && c <= '9') digit = true;
        }

        if (mayus && minus && digit) {
            pasvalid = true
        } else {
            alert("La contrasenya ha de tenir majúscules, minúscules i números");
        }
    }
    return pasvalid;
}

let passwordvalid;
let menuop;

function mostrarmenu() {
    passwordvalid = false;
    while (passwordvalid === false) {
        passwordvalid = validarPassword()
    }
    do {
        menuop = prompt("Selecciona un dels següents:" + "\n" + "A - Valoració d'Usuari" + "\n" + "B - Buscar paraula" + "\n" + "C - Participar en un sorteig" + "\n" + "Z - Sortir del programa").toUpperCase().trim()
    } while (menuop !== "A" && menuop !== "B" && menuop !== "C" && menuop !== "Z")

    switch (menuop) {
        case "A":
            funca()
            break;
        case "B":
            funcb(prompt("Introdueix text:"), prompt("Paraula a buscar:"))
            break;
        case "C":
            funcc()
            break;
        case "Z":
            break;
    }
}

let horesset;

function funca() {
    horesset = parseInt(prompt("Hores setmanals:"))
    if (horesset >= 0 && horesset <= 10) alert("Casual")
    else if (horesset > 10 && horesset <= 30) alert("Fan")
    else if (horesset > 30 && horesset <= 60) alert("Superfan")
    else alert("Adicte")
}

function funcb(text, paraula) {
    let comptador = 0;
    let espais = "";

    for (let i = 0; i < text.length; i++) {
        let lletra = text.charAt(i);
        if (lletra !== " ") {
            espais = espais + lletra;
        } else {
            if (espais === paraula) comptador++;
            espais = "";
        }
    }

    if (espais === paraula) comptador++;

    console.log("La lletra conté la paraula " + paraula + " " + comptador + " vegades")
}

let num1, num2, num3;
let conteig1 = 0,
    conteigall = 0;

function funcc() {
    do {
        num1 = parseInt(prompt("Introdueix el primer número: "))
        num2 = parseInt(prompt("Introdueix el segon número: "))
        num3 = parseInt(prompt("Introdueix el tercer número: "))
    } while (num1 < 0 || num1 > 99 || num2 < 0 || num2 > 99 || num3 < 0 || num3 > 99 || isNaN(num1) || isNaN(num2) || isNaN(num3))

    sorteig(num1, num2, num3)
}

function sorteig(n1, n2, n3) {
    let aleatori = -1
    conteig1 = 0
    conteigall = 0

    do {
        aleatori = Math.floor(Math.random() * 100)
        conteig1++
    } while (aleatori != n1)

    aleatori = -1

    do {
        aleatori = Math.floor(Math.random() * 100)
        conteigall++
    } while (aleatori != n1 && aleatori != n2 && aleatori != n3)

    alert("Per un número: " + conteig1 + "\n" + "Per tots: " + conteigall)
}

mostrarmenu()