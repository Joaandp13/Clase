"use strict";


const boton = document.getElementById("boto");
const resultat = document.getElementById("resultat");


//Fer que mostri només la opció seleccionada després de confirmar

boton.addEventListener("click", () => {
    let seleccionada = document.querySelector('input[name="menu"]:checked');
    if (seleccionada) {
        resultat.textContent = "Has triat l'opció " + seleccionada.parentElement.textContent.trim();
    } else {
        resultat.textContent = "No has triat cap opció.";
    }
});