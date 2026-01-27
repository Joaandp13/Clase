"use strict";

let nom = "peter";
let cognom = "SOFT";
let primeraLletra = nom.charAt(0).toUpperCase();
let altresLletres = nom.substring(1).toLowerCase();
nom = primeraLletra + altresLletres;
primeraLletra = cognom.charAt(0).toUpperCase();
altresLletres = cognom.substring(1).toLowerCase();;
cognom = primeraLletra + altresLletres;
alert(nom + " " + cognom);