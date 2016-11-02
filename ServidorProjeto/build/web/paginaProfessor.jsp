<%@page import="java.util.ArrayList"%>
<jsp:useBean id="con" class="br.com.controller.ProfessoresController"/>  
<jsp:useBean id="consulta" class="br.com.controller.Consulta"/>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Professores</title>
        
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
            <h1>Analise e Desenvolvimento de Sistemas!</h1>
            <h2>Lista de Professores</h2>
            <div class="container" id="professor">
                
                <ul class="list-group">
                    <%
                        for (int i = 1; i <= con.Quantidade(); i++) {
                            out.print("<li class=\"list-group-item\">" + 
                                    consulta.ConsultarBanco("professores", "id_professor", "nome_professor", i) + "<br/>" + 
                                      "</li>");
                        }
                    %>
                </ul>
            </div>
        </body>
</html>