function lletrarandom() {
    let lletra = Math.floor((Math.random() * 26) + 65);
    alert(String.fromCharCode(lletra))

}

function RangoRandom(inici, fin) {
    let lletra1 = inici.toUpperCase().charCodeAt(0)
    let lletra2 = fin.toUpperCase().charCodeAt(0)
    let bypass
    if (inici > fin) {
        let bypass = inici
        let inici = fin
        let fin = bypass
    }
    let lletra = Math.floor(Math.random() * (lletra2 - lletra1 + 1)) + lletra1;

    alert(String.fromCharCode(lletra));
}

lletrarandom();

let inici = prompt("Escolleix la primera lletra (A,Z)");
let fin = prompt("Escolleix la segona lletra (A,Z)")
RangoRandom(inici, fin);