<%@page import="Modelo.LoginDTO"%>
<%
    LoginDTO userHome = (LoginDTO)session.getAttribute("user");
%>
<html>
    <head>
        <title> Bienvenido</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
    </head>
    <body>
        <section class ="cabeza">
            <header>
                <nav>
                    <ul>
                        <li><a href="bienvenido.jsp"> Home </a></li>                        
                        <li><a href="index.html"> Cerrar Sesion </a></li>
                    </ul>
                </nav>
            </header>
        </section>
        <section class="contenido">
            <h1>Bienvenido <%= userHome.getUsuario() %></h1>
            
            <br>
            
        </section>        
        <section class="footer">
            <p> ESTADISTICAS ACTUALIZADAS LEAGUE OF LEGENDS <P>
            <br> <img src="Sin título1.png" alt=""/>
           <br> <img src="Sin título2.png" alt=""/>
            
          <br> <img src="Sin título3.png" alt=""/><br><br>
          <img src="1bef251de00335ecac32024aba98185cfc609589_hq.jpg" alt=""/>
        </section>    
    </body>
</html>
