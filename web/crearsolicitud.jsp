<%@ page import="Controlador.ControladorSolicitud" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear Solicitud</title>
    <link href="css/materialize.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<div class="container">
    <h2>Solicitud</h2>
    <form method="get" action="crear_solicitud" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Fecha</label>
                <input type="text" name="fecha_solicitud" placeholder="Fecha"/>
            </div>
            <div class="col s4">
                <label>Nombre Academia</label>
                <input type="text" name="nombre_acad" placeholder="Nombre Academia"/>
            </div>
            <div class="col s4">
                <label>Clave del ciclo</label>
                <input type="text" name="clave_ciclo" placeholder="Clave del ciclo"/>
            </div>
        </div>
        <div class="row">
            <div class="col s6">
                <label>Nombre departamento</label>
                <input type="text" name="nombre_departamento" placeholder="Nombre departamento"/>
            </div>
            <div class="row">
                <div class="col s6">
                    <label>docente_RfcDoce</label>
                    <input type="text" name="docente_RfcDoce" placeholder="docente_RfcDoce"/>
                </div>

        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
