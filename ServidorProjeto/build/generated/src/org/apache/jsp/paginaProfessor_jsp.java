package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class paginaProfessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      br.com.controller.ProfessoresController con = null;
      synchronized (_jspx_page_context) {
        con = (br.com.controller.ProfessoresController) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new br.com.controller.ProfessoresController();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      br.com.controller.Consulta consulta = null;
      synchronized (_jspx_page_context) {
        consulta = (br.com.controller.Consulta) _jspx_page_context.getAttribute("consulta", PageContext.PAGE_SCOPE);
        if (consulta == null){
          consulta = new br.com.controller.Consulta();
          _jspx_page_context.setAttribute("consulta", consulta, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Professores</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/logo.png\" type=\"image/x-png\">\n");
      out.write("        \n");
      out.write("        <!-- JS -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <a href=\"http://localhost:8084/ServidorProjeto/index.jsp\" class=\"btn btn-default\" role=\"button\">Voltar</a>\n");
      out.write("            <h1>Analise e Desenvolvimento de Sistemas!</h1>\n");
      out.write("            <h2>Lista de Professores</h2>\n");
      out.write("            <div class=\"container\" id=\"professor\">\n");
      out.write("                \n");
      out.write("                <ul class=\"list-group\">\n");
      out.write("                    ");

                        for (int i = 1; i <= con.Quantidade(); i++) {
                            out.print("<li class=\"list-group-item\">" + 
                                    consulta.ConsultarBanco("professores", "id_professor", "nome_professor", i) + "<br/>" + 
                                      "</li>");
                        }
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
