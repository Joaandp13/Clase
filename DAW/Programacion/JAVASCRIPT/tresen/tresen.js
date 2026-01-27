// Función para generar un array bidimensional
function generarArrayBi(f, c, valor = 1) {
    let a = [];
    for (let i = 0; i < f; ++i) {
        a[i] = [];
        for (let j = 0; j < c; ++j) {
            a[i][j] = valor;
        }
    }
    return a;
}

// Función para mostrar cualquier array bidimensional como tabla
function actualizarTabla(array) {
    const terminal = document.getElementById("terminal");

    let html = "";
    for (let i = 0; i < array.length; i++) {
        html += "<tr>";
        for (let j = 0; j < array[i].length; j++) {
            html += "<td>" + array[i][j] + "</td>";
        }
        html += "</tr>";
    }

    terminal.innerHTML = html;
}

// --- Ejemplo de uso inicial ---
let tauler = generarArrayBi(3, 3);

let player=1;
let estado;

function preguntarmov() {
    let mov = prompt("Introdueix on vols posar la següent peça: "); // ejemplo: "A1"

    let ejex = mov.charCodeAt(0) - 65; // 'A' → 0, 'B' → 1 ...
    let ejey = parseInt(mov[1]) - 1; // '1' → 0, '2' → 1 ...

    console.log("Fila:", ejey, "Columna:", ejex);
    return [ejey, ejex]; // devuelve coordenadas para usar en el array
}


function aplicarmov(jugador, coords) {

}

while (estado != "x" || estado != "o" || estado != "draw") {
    






    player++
}