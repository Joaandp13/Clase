// Funció que demana un número enter vàlid
function demanarEnter(pregunta) {
    let numero;

    while (true) {
        let entrada = prompt(pregunta);

        // Comprovar si és un número enter
        numero = Number(entrada);
        if (Number.isInteger(numero)) {
            return numero; // surt del bucle i retorna el número
        } else {
            alert("❌ Error: has d'introduir un número enter.");
        }
    }
}

// Funció que demana un número enter dins d’un rang
function demanarEnterEnRang(pregunta, min, max) {
    // Intercanviar si min > max
    if (min > max) {
        let temp = min;
        min = max;
        max = temp;
    }

    let numero;
    while (true) {
        numero = demanarEnter(pregunta + ` (entre ${min} i ${max})`);
        if (numero >= min && numero <= max) {
            return numero;
        } else {
            alert(`❌ Error: el número ha d'estar entre ${min} i ${max}.`);
        }
    }
}

// Exemple d'ús:
let edat = demanarEnterEnRang("Introdueix la teva edat", 0, 120);
alert(`✅ Has introduït ${edat}`);