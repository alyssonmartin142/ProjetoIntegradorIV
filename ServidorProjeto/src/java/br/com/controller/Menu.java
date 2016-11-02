package br.com.controller;

/**
 *
 * @author Alysson Martin
 */
public class Menu {
    
    public String MostrarMenu(){
        String menu = "<div class=\"w3-top\">\n" +
"            <ul class=\"w3-navbar w3-black w3-card-2 w3-left-align\">\n" +
"                <li><a href=\"/ServidorProjeto/index.jsp\" class=\"w3-hover-none w3-hover-text-grey w3-padding-large\">HOME</a></li>\n" +
"                <li class=\"w3-hide-small\"><a href=\"/ServidorProjeto/paginaProfessor.jsp\" class=\"w3-padding-large\">Professores</a></li>\n" +
"                <li class=\"w3-hide-small\"><a href=\"/ServidorProjeto/paginaDisciplina.jsp\" class=\"w3-padding-large\">Disciplinas</a></li>\n" +
"            </ul>\n" +
"        </div>";
        return menu;
    }
}
