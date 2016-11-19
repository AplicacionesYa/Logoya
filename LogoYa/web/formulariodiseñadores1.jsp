<%-- 
    Document   : formulariodiseñadores1
    Created on : 18-oct-2016, 1:47:57
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="head.html"/>
<script src="js/Validaciones.js" type="text/javascript"></script>
<script src="js/Ajax.js" type="text/javascript"></script>
<form>
    <div class="card-panel  white hoverable">
        <h3>Completa tu registro</h3>
    <div class="row">
    <div class="input-field col s12 m6">
        <input id="nombre" type="text" class="" name="nombre" required="" length="50" onkeypress="sololetras()" >
        <label id="lblnm" for="nombre">Nombre completo:</label>
        <div  id="vldrnm" style="color:#f44336;"> </div>
    </div>
    <div class="input-field col s6 m6">
        <input id="correo" type="text"  name="correo" required="" length="100" class="" placeholder="ejemploLogoya@gmail.com" title="Ingrese un correo ejemploLogoya@gmail.com">
        <label id="lblmail" for="correo" >Correo:</label>
        <div id="vldrmail" style="color:#f44336;"> </div>
    </div>
    </div>
    <div class="row">
    <div class="input-field col s6 m4">
        <input id="celular" type="text" class="" name="celular" required="" length="15" onkeypress="solonum()">
        <label id="lblcel" for="celular">Celular:</label>
        <div id="vldrcel" style="color:#f44336;"> </div>
    </div>
    <div class="input-field col s6 m4">
        <input id="clave" type="password"  name="clave" required="" class="" length="45" onpaste=" return false" oncopy="return false">
        <label id="lblpass" for="clave" >Clave:</label>
        <div id="vldrpass" style="color:#f44336;"> </div>
    </div>
    <div class="input-field col s12 m4">
        <input id="reclave" type="password" class="" name="reclave" required="" length="45" onpaste=" return false" oncopy="return false">
        <label id="lblpass2" for="reclave">Confirmar Clave:</label>
        <div id="vldrpass2" style="color:#f44336;"> </div>
    </div>
    </div>
    <!--div class="row">
    <div class="input-field col s6 m4">
        <input id="banco" type="text"  name="banco" required="" class="" >
        <label id="lblban" for="banco" >Banco:</label>
        <div id="vldrDocumento" style="color:#f57c00;;"> </div>
    </div>
    <div class="input-field col s12 m4">
        <input id="cuenta" type="text" class="" name="cuenta" required="" onkeypress="solonum()" >
        <label id="lblcuen" for="cuenta">Número de cuenta:</label>
        <div id="vldrNombre" style="color:#f57c00;"> </div>
    </div>
    <div class="input-field col s6 m4">
        <input id="titular" type="text"  name="titular" required="" class="" >
        <label id="lbltit" for="titular" >Titular de la cuenta</label>
        <div id="vldrDocumento" style="color:#f57c00;;"> </div>
    </div>
    </div-->
    <div>
        <input class=" btn" type="button" value="Continuar" id="btnenviarFreenlace" onclick=" inserFreelance()">
    </div>
    </div>
</form>
<jsp:include page="footer.html"/>
