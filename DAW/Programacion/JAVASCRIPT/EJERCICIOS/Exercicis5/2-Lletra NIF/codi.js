"use strict";


const boton = document.getElementById("boto");
const resultat = document.getElementById("resultat");


//Fer que mostri només la opció seleccionada després de confirmar

boton.addEventListener("click", () => {
    // Get the value from the input (assuming there's an input with id="ndni")
    const dniInput = document.getElementById("ndni");
    if (!dniInput) {
        resultat.textContent = "No s'ha trobat el camp del número.";
        return;
    }
    const dniNumber = dniInput.value.trim();
    if (!/^\d{8}$/.test(dniNumber)) {
        resultat.textContent = "Introdueix un número de 8 dígits.";
        return;
    }
    const letters = "TRWAGMYFPDXBNJZSQVHLCKE";
    const index = parseInt(dniNumber, 10) % 23;
    const letter = letters.charAt(index);
    resultat.textContent = `El teu NIF és ${dniNumber}-${letter}`;
});