<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="consulta" class="br.com.controller.Consulta"/>  
<jsp:useBean id="menu" class="br.com.controller.Menu"/>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem Vindo!</title>
        <link rel="shortcut icon" href="img/logo.png" type="image/x-png">
        
        <!-- JS -->
        <script type="text/javascript" src="js/lib/jquery-3.1.1.min.js"></script>
        <script type="text/javascript" src="js/lib/bootstrap.min.js"></script>
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">

        <!-- CSS -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/custom.css">
    </head>
    <body>
        <!-- Navbar -->
        <%
            out.print(menu.MostrarMenu());
        %>
        <div class="w3-content" style="margin-left: 15%; margin-top:46px">
            <CENTER><img src=" 
            <%out.print(consulta.ConsultarBanco("imagens", "id_img", "caminho_img", 1));%>
            " height="250" width="300"></CENTER>
        </div>
        <h1>Bem Vindo!</h1>
        <h2>Apresentação Trabalho Integrador do Projeto Integrador IV</h2>
        <h2>Faculdade Integrado</h2>
        <div class="container">
        </div>
        </div>
    </body>
</html>
