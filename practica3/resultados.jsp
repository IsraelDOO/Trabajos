<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <%
        String nombrej= request.getParameter("nombre"); 
        String contrasenaj= request.getParameter("contrasena");
        String correoj= request.getParameter("correo");
        String fechaj= request.getParameter("fecha");
        String Resultadosj= nombrej + "\n" + contrasenaj + "\n" + correoj + "\n"
        + fechaj + "\n";
        %>
        <h1> Resultados </h1>
        <h2> <%=Resultadosj%> </h2>
    </body>
</html>
