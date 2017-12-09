
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear lista de libros</title>
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
    <h2>Lista de libros </h2>
    <form method="get" action="crearlistade_libros" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>no_solicitud</label>
                <input type="text" name="no_solicitud" placeholder="no_solicitud"/>
            </div>
            <div class="col s4">
                <label>ISBN</label>
                <input type="text" name="isbn" placeholder="isbn"/>
            </div>
            <div class="col s4">
                <label>asignatura</label>
                <input type="text" name="asignatura" placeholder="asignatura"/>
            </div>

        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
