
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Menu Desplegable</title>
  <style type="text/css">

    * {
      margin:0px;
      padding:0px;
    }

    #header {
      margin:auto;
      width:500px;
      font-family:Arial, Helvetica, sans-serif;
    }

    ul, ol {
      list-style:none;
    }

    .nav > li {
      float:left;
    }

    .nav li a {
      background-color:#000;
      color:#fff;
      text-decoration:none;
      padding:10px 12px;
      display:block;
    }

    .nav li a:hover {
      background-color:#434343;
    }

    .nav li ul {
      display:none;
      position:absolute;
      min-width:140px;
    }

    .nav li:hover > ul {
      display:block;
    }

    .nav li ul li {
      position:relative;
    }

    .nav li ul li ul {
      right:-140px;
      top:0px;
    }

  </style>
</head>
<body>
<div id="header">
  <ul class="nav">
    <li><a href="">Inicio</a></li>
    <li><a href="">Servicios</a>
      <ul>
        <li><a href="crearasignatura.jsp">Asignatura</a></li>
        <li><a href="crearacademia.jsp">Academia</a></li>
        <li><a href="crearcarrera.jsp">Carrera</a></li>
        <li><a href="crearciclo_escolar.jsp">ciclo escolar</a></li>
        <li><a href="creardepartamento.jsp">Departamento</a></li>
        <li><a href="creardocente.jsp">Docente</a></li>
        <li><a href="crearinstituto.jsp">ciclo escolar</a></li>
        <li><a href="crearlibro.jsp">Libro</a></li>
        <li><a href="crearlistade_libros.jsp">lista de libros</a></li>
        <li><a href="crearsolicitud.jsp">Solicitud</a></li>

          <ul>
            <li><a href="">Submenu1</a></li>
            <li><a href="">Submenu2</a></li>
            <li><a href="">Submenu3</a></li>
            <li><a href="">Submenu4</a></li>
          </ul>
        </li>
      </ul>
    </li>
    <li><a href="">Acerca de</a>
      <ul>
        <li><a href="">Submenu1</a></li>
        <li><a href="">Submenu2</a></li>
        <li><a href="">Submenu3</a></li>
        <li><a href="">Submenu4</a></li>
      </ul>
    </li>
    <li><a href="">Contacto</a></li>
  </ul>
</div>
</body>
