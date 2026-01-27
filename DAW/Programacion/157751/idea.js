let numpeces;
let pecesnumerades = [];

do {
    pecesnumerades = [];

    numpeces = parseInt(prompt("Numpeces?"));
    if (numpeces === 0) break;

    for (let i = 1; i <= numpeces; ++i) {
        let numero = parseInt(prompt("Introdueix número:"));
        if (numero == 0) break;
        pecesnumerades.push(numero);
    }

    for (let i = 1; i <= numpeces; ++i) {
        if (!pecesnumerades.includes(i)) {
            console.log(i);
        }
    }

} while (numpeces != 0);