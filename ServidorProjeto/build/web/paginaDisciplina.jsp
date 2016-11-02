<jsp:useBean id="consulta" class="br.com.controller.Consulta"/>  
<jsp:useBean id="con" class="br.com.controller.DisciplinasController"/> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas</title>
        
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
        
        <h2>Tabela com todas as disciplinas e semestres do curso</h2>
        <div class="container" id="disciplina">
            <table class="table">

            <tr>
                <td><b>Matéria</b></td>
            <td><b>Semestre da materia</b></td>
            </tr>
            <%
            for(int i = 0; i <= con.Quantidade(); i++){
                    out.print("<tr> <td> " + 
                            consulta.ConsultarBanco("disciplinas", "id_disciplina", "nome_disciplina", i) + 
                            " </td>");
                    out.print("<td> " +
                        consulta.ConsultarBanco("disciplinas", "id_disciplina", "semestre", i) + 
                        " </td> </tr>");
                }
            %>
            
            </table>
        </div>
    </body>
</html>
