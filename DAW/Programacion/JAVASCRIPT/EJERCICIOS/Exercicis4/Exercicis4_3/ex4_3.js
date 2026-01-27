"use strict";

let lletra = '0';
let lletra2 = 0;
let sonIguals = lletra == lletra2;
alert("Son iguals?=" + sonIguals) //No, ja que el 0 com lletra , equival a 48
lletra = 'A';
lletra2 = 65;
sonIguals = lletra == lletra2;
alert("Son iguals?=" + sonIguals) //SI
    ++lletra;
lletra = '0' + '1';