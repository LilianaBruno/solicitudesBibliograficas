<%@ page import="Controlador.ControladorLibro" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear libro</title>
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
    <h2>Libro</h2>
    <form method="get" action="crear_libro" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Nombre del Libro</label>
                <input type="text" name="nombre_libro" placeholder="Nombre del Libro"/>
            </div>
            <div class="col s4">
                <label>Nombre de  los Autores</label>
                <input type="text" name="autores_libro" placeholder="Nombre de  los Autores"/>
            </div>
            <div class="col s4">
                <label>Nombre de  la Editorial</label>
                <input type="text" name="editorial_libro" placeholder="Nombre de  la Editorial"/>
            </div>
            <div class="col s4">
                <label>Año</label>
                <input type="text" name="año" placeholder="Año"/>
            </div>
        </div>
        <div class="row">
            <div class="col s6">
                <label>ISBN</label>
                <input type="text" name="isbn_libro" placeholder="ISBN"/>
            </div>
            <div class="col s6">
                <label>Edicion</label>
                <input type="text" name="edicion_libro" placeholder="Edicion"/>
            </div>
        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
