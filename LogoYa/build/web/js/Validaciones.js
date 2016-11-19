/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// validacion para escribir solo  letras
function sololetras() {
    if (((event.keyCode >= 33) && (event.keyCode < 65)) || ((event.keyCode > 90) && (event.keyCode < 97)) || ((event.keyCode > 122) && (event.keyCode < 193)))
        event.returnValue = false;
}//fin validacion solo letras

// validacion para escribir solo  numeros
function solonum() {
    if ((event.keyCode < 48) || (event.keyCode > 57))
        event.returnValue = false;
}//fin validacion solo numeros

//validacion de correo
function ValidarCorreo(correo) {
    var tstCorreo = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-]+)\.)+([a-zA-Z0-9{2,4}])+$/;
    return tstCorreo.test(correo);
}//fin validacion correo

//valicion nombre y apellidos
function ValidarNom(nombre) {
    var tstnom = /^([a-zA-Z])/;
    return tstnom.test(nombre);
}//fin validacion nombre y apellidos