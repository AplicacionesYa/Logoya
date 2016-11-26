<%-- 
    Document   : businessForm
    Created on : 26-nov-2016, 11:38:21
    Author     : sebas
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="elements/head.html"/>
 <link rel="icon" type="image/ico" href="../images/favico.ico" />
<form>
    <div class="card-panel  white hoverable">
        <h3>Estamos por terminar</h3>
        <div class="row">
            <div class="input-field col s12 m6">
                <input id="nombre" type="text" class="" name="nombre" required=""  onkeypress="sololetras()" >
                <label id="lblnm" for="nombre">Nombre contacto:</label>
                <div id="vldrNombre" style="color:#f57c00;"> </div>
            </div>
            <div class="input-field col s6 m6">
                <input id="correo" type="text"  name="correo" required="" class="" >
                <label id="lblmail" for="correo" >Correo:</label>
                <div id="vldrDocumento" style="color:#f57c00;;"> </div>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s6 m4">
                <input id="celular" type="text" class="" name="celular" required="" onkeypress="solonum()">
                <label id="lblcel" for="celular">Celular:</label>
                <div id="vldrNombre" style="color:#f57c00;"> </div>
            </div>
            <div class="input-field col s6 m4">
                <input id="clave" type="password"  name="clave" required="" class="" >
                <label id="lblpass" for="clave" >Contraseña:</label>
                <div id="vldrDocumento" style="color:#f57c00;;"> </div>
            </div>
            <div class="input-field col s12 m4">
                <input id="reclave" type="password" class="" name="reclave" required="" onpaste=" return false">
                <label id="lblpass2" for="reclave">Confirmar contraseña:</label>
                <div id="vldrNombre" style="color:#f57c00;"> </div>
            </div>
        </div>
        <h3>Pendiente, no creo que valla aqui</h3>
         
        <div>
            <input class=" btn" type="submit" value="Finalizar">
        </div>
    </div>
</form>
<jsp:include page="elements/footer.html"/>
