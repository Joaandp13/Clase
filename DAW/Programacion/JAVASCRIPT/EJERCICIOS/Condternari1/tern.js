"use strict";

const notaIn = document.getElementById("mark");

const boton = document.getElementById("confirm")

const terminal = document.getElementById("terminal")

boton.addEventListener("click", executar);

function executar() {
    const nota = Number(notaIn.value);

    if (nota >= 0 && nota <= 10) {
        if (nota < 5) terminal.innerHTML = "Suspés"
        else terminal.innerHTML = "Aprovat!"
    } else terminal.innerHTML = "La nota ha de ser un valor entre 0 i 10"
}