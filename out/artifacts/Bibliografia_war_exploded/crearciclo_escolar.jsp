
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear Ciclo escolar</title>
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
    <h2>Ciclo escolar</h2>
    <form method="get" action="crearCiclo_escolar" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Clave</label>
                <input type="text" name="clave_cicloescolar" placeholder="Clave Ciclo"/>
            </div>
            <div class="col s4">
                <label>Nombre</label>
                <input type="text" name="nombre_cicloescolar" placeholder="Nombre Ciclo"/>
            </div>

        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
