package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      br.com.controller.Consulta consulta = null;
      synchronized (_jspx_page_context) {
        consulta = (br.com.controller.Consulta) _jspx_page_context.getAttribute("consulta", PageContext.PAGE_SCOPE);
        if (consulta == null){
          consulta = new br.com.controller.Consulta();
          _jspx_page_context.setAttribute("consulta", consulta, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      br.com.controller.Menu menu = null;
      synchronized (_jspx_page_context) {
        menu = (br.com.controller.Menu) _jspx_page_context.getAttribute("menu", PageContext.PAGE_SCOPE);
        if (menu == null){
          menu = new br.com.controller.Menu();
          _jspx_page_context.setAttribute("menu", menu, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bem Vindo!</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/logo.png\" type=\"image/x-png\">\n");
      out.write("        \n");
      out.write("        <!-- JS -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lib/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://www.w3schools.com/lib/w3.css\">\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        ");

            out.print(menu.MostrarMenu());
        
      out.write("\n");
      out.write("        <div class=\"w3-content\" style=\"margin-left: 15%; margin-top:46px\">\n");
      out.write("            <CENTER><img src=\" \n");
      out.write("            ");
out.print(consulta.ConsultarBanco("imagens", "id_img", "caminho_img", 1));
      out.write("\n");
      out.write("            \" height=\"250\" width=\"300\"></CENTER>\n");
      out.write("        </div>\n");
      out.write("        <h1>Bem Vindo!</h1>\n");
      out.write("        <h2>Apresentação Trabalho Integrador do Projeto Integrador IV</h2>\n");
      out.write("        <h2>Faculdade Integrado</h2>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
