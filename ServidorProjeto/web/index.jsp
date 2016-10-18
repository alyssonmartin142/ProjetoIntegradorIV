<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="consulta" class="br.com.controller.Consulta"/>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem Vindo!</title>
        <link rel="shortcut icon" href="img/logo.png" type="image/x-png">
        
        <!-- JS -->
        <script type="text/javascript" src="js/lib/jquery-3.1.1.min.js"></script>
        <script type="text/javascript" src="js/lib/bootstrap.min.js"></script>

        <!-- CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/custom.css">
    </head>
    <body>
        <div class="container">
            <CENTER><img src=" 
            <%out.print(consulta.ConsultarBanco("imagens", "id_img", "caminho_img", 1));%>
            " height="250" width="300"></CENTER>
        </div>
        <h1>Bem Vindo!</h1>
        <h2>Apresentação Trabalho Integrador do Projeto Integrador IV</h2>
        <h2>Faculdade Integrado</h2>
        <div class="container">
        <center>
            <a href="http://localhost:8084/ServidorProjeto/paginaProfessor.jsp" class="btn btn-default" role="button">Professores</a>
            <a href="http://localhost:8084/ServidorProjeto/paginaDisciplina.jsp" class="btn btn-default" role="button">Disciplinas</a>
        </center>
        </div>
        
    </body>
</html>
