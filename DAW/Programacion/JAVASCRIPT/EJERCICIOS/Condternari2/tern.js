"use strict";

const diaIn = document.getElementById("dia");

const boton = document.getElementById("confirm")

const terminal = document.getElementById("terminal")

boton.addEventListener("click", executar);

function executar() {
    const dia = Number(diaIn.value);

    if (dia === 1) {
        terminal.innerHTML = "Avui és Dilluns";
    } else if (dia === 2) {
        terminal.innerHTML = "Avui és Dimarts";
    } else if (dia === 3) {
        terminal.innerHTML = "Avui és Dimecres";
    } else if (dia === 4) {
        terminal.innerHTML = "Avui és Dijous";
    } else if (dia === 5) {
        terminal.innerHTML = "Avui és Divendres";
    } else if (dia === 6) {
        terminal.innerHTML = "Avui és Dissabte";
    } else if (dia === 7) {
        terminal.innerHTML = "Avui és Diumenge";
    } else if (dia === null) {
        terminal.innerHTML = "Has d'entrar un número"
    } else {
        terminal.innerHTML = "No hi ha dia " + dia
    }

}