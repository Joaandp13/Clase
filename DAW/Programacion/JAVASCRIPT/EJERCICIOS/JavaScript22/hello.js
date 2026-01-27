"use strict";

// El mètode alert() serveix per mostrar missatges i dades
//alert("Hello World");
//document.body.innerHTML = "<h1>Hello World</h1>";
//document.body.innerHTML += "<p>La meva primera pàgina web</p>";


//Obté l'element a partir del seu ID
let p1 = document.getElementById("p1");
let p2 = document.getElementById("p2");


p1.innerHTML = "Aquest es el meu segon paràgraf"

p2.innerHTML = "Tercer paragraf"

//Variables:
//Para declarar una variable hay que utilizar el Let, esto dara a una palabra un valor
let edat = 10
//Depende del tipo de dato que pongamos, se lo tomarà de una manera u otra, si ponemos "" siempre serà texto, igual que '', pero se recomienda usar el "", ya que si utilizamos un apostrofe en algun momento dentro de '' el programa nos darà error.
let lugar_nacimiento = "L'hospital del mar"
let pueblo = 'Montgat'
//Estas variables se sobreescriben si las ponemos de nuevo
//let pueblo = 'badalona'
//Si queremos poner una variable que no se sobreescriba, usaremos el tipo de dato const, que es una constante, es decir, que no cambia
const ciudad = "Barcelona"


//Para hacer un cambio de variables, necesitaremos una extra, ya que , si sobreescribimos una variable, la anterior se pierde

let min = 9;
let max = 11;
//Intercambio

let temporal = min;

min = max;

max = temporal;

alert(min)