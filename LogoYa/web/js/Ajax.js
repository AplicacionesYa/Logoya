/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Funcion para validar correo.
 * @param {type} correo
 * @returns {Boolean}
 */
function ValidarCorreo(correo) {
    var tstCorreo = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-]+)\.)+([a-zA-Z0-9{2,4}])+$/;
    return tstCorreo.test(correo);
}//fin validacion correo


/**
 * funcion para insertar  datos del freelance con ajax
 * @returns {Boolean}
 */
function  inserFreelance() {
    //variables
    this.name = document.getElementById("nombre").value;
    this.email = document.getElementById("correo").value;
    this.cell_phone = document.getElementById("celular").value;
    this.password = document.getElementById("clave").value;
    this.password2 = document.getElementById("reclave").value;

    //remover espacios en blanco al principio y al final
    name = name.trim();
    email = email.trim();
    password = password.trim();
    password2 = password2.trim();
    alert(name + email + cell_phone + password + password2);
    //validacion de los campos formulario diseñadores 1
    if (name === "") {
        $("#nombre").focus();
        $("#lblnm").html("Ingrese nombre completo.").slideDown(500);
        return false;
    } else if (name.length > 50) {
        $("#lblnm").html("El nombre es muy largo.").slideDown(500);
        $("#lnombre").focus();
        $("#vldrnm").html("El nombre es muy largo.").slideDown(500);
        return false;
    } else {
        $("#lblnm").html("Nombre:");
        $("#vldrnm").html("").slideUp(30);
    }
    if (email === "") {
        $("#correo").focus();
        $("#lblmail").html("Ingrese correo.").slideDown(500);
        return false;
    } else if (email.length > 100) {
        $("#lblmail").html("El correo es muy largo.").slideDown(500);
        $("#correo").focus();
        $("#vldrmail").html("El correo es muy largo.").slideDown(500);
        return false;
    } else if (ValidarCorreo(email) === false) {
        $("#correo").focus();
        $("#vldrmail").html("El formato del correo no es valido.").slideDown(500);
        return false;
    } else {
        $("#lblmail").html("Correo:");
        $("#vldrmail").html("").slideUp(30);
    }
    if (cell_phone === "") {
        $("#celular").focus();
        $("#lblcel").html("Ingrese  numero de celular.").slideDown(500);
        return false;
    } else if (cell_phone.length > 15) {
        $("#lblcel").html("El numero de celular es muy largo").slideDown(500);
        $("#celular").focus();
        $("#vldrcel").html("El numero de celular es muy largo.").slideDown(500);
        return false;
    } else {
        $("#lblcel").html("Celular:");
        $("#vldrcel").html("").slideUp(30);
    }
    if (password === "") {
        $("#clave").focus();
        $("#lblpass").html("Ingrese  clave.").slideDown(500);
        return  false;
    } else if (password.length > 45) {
        $("#lblpass").html("Ia clave es muy larga.").slideDown(500);
        $("#clave").focus();
        $("#vldrpass").html("Ia clave es muy larga.").slideDown(500);
        return false;
    } else {
        $("#lblpass").html("Clave:");
        $("#vldrpass").html("").slideUp(30);
    }
    if (password2 === "") {
        $("#reclave").focus();
        $("#lblpass2").html("Ingrese  confirmar clave.").slideDown(500);
    } else if (password2.length > 45) {
        $("#lblpass2").html("Confirmar clave es muy larga.").slideDown(500);
        $("#reclave").focus();
        $("#vldrpass2").html("Confirmar clave es muy larga.").slideDown(500);
        return false;
    } else {
        $("#lblpass2").html("Confirmar clave:");
        $("#vldrpass2").html("").slideUp(30);
    }
    //preguntar si las claves son diferentes 
    if (password != password2) {
        $("#lblpass").html("Ias claves no coinciden.").slideDown(500);
        $("#lblpass2").html("Ias claves no coinciden.").slideDown(500);
        $("#vldrpass").html("Ias claves no coinciden.").slideDown(500);
        $("#vldrpass2").html("Ias claves no coinciden.").slideDown(500);
        $("#clave").focus();
        return false;
    } else {
        $("#lblpass").html("Clave:");
        $("#lblpass2").html("Confirmar clave:");
        $("#vldrpass").html("").slideUp(30);
        $("#vldrpass2").html("").slideUp(30);
    }

// Fin validacion de los campos formulario diseñadores 1
//-------------------------------------------------------->>> AJAX INSERTAR DATOS FREELANCE <<<---------------------------------------------------------
   
    $.ajax({method: "POST",
        url: "ServletFreelance",
        data: {
            validation: "insertFrelance",
            name: name,
            email: email,
            cell_phone: cell_phone,
            password: password
        }, success: function (data, textStatus, jqXHR) {
            alert(data+" "+textStatus+" "+ jqXHR);
        }, error: function (jqXHR, textStatus, errorThrown) {
            alert("error: " + errorThrown);
        }
    });

}// fi funcion insertar Freelance
