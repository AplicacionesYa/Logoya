package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulariodise_002b_00a6adores1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.html", out, false);
      out.write("\n");
      out.write("<script src=\"js/Validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Ajax.js\" type=\"text/javascript\"></script>\n");
      out.write("<form>\n");
      out.write("    <div class=\"card-panel  white hoverable\">\n");
      out.write("        <h3>Completa tu registro</h3>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s12 m6\">\n");
      out.write("        <input id=\"nombre\" type=\"text\" class=\"\" name=\"nombre\" required=\"\"  onkeypress=\"sololetras()\" >\n");
      out.write("        <label id=\"lblnm\" for=\"nombre\">Nombre completo:</label>\n");
      out.write("        <div  style=\"color:#f57c00;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"input-field col s6 m6\">\n");
      out.write("        <input id=\"correo\" type=\"text\"  name=\"correo\" required=\"\" class=\"\" >\n");
      out.write("        <label id=\"lblmail\" for=\"correo\" >Correo:</label>\n");
      out.write("        <div id=\"vldrDocumento\" style=\"color:#f57c00;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6 m4\">\n");
      out.write("        <input id=\"celular\" type=\"text\" class=\"\" name=\"celular\" required=\"\" onkeypress=\"solonum()\">\n");
      out.write("        <label id=\"lblcel\" for=\"celular\">Celular:</label>\n");
      out.write("        <div id=\"vldrNombre\" style=\"color:#f57c00;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"input-field col s6 m4\">\n");
      out.write("        <input id=\"clave\" type=\"password\"  name=\"clave\" required=\"\" class=\"\" onpaste=\" return false\" oncopy=\"return false\">\n");
      out.write("        <label id=\"lblpass\" for=\"clave\" >Contraseña:</label>\n");
      out.write("        <div id=\"vldrpass\" style=\"color:#f57c00;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"input-field col s12 m4\">\n");
      out.write("        <input id=\"reclave\" type=\"password\" class=\"\" name=\"reclave\" required=\"\" onpaste=\" return false\" oncopy=\"return false\">\n");
      out.write("        <label id=\"lblpass2\" for=\"reclave\">Confirmar contraseña:</label>\n");
      out.write("        <div id=\"vldrpass2\" style=\"color:#f57c00;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <!--div class=\"row\">\n");
      out.write("    <div class=\"input-field col s6 m4\">\n");
      out.write("        <input id=\"banco\" type=\"text\"  name=\"banco\" required=\"\" class=\"\" >\n");
      out.write("        <label id=\"lblban\" for=\"banco\" >Banco:</label>\n");
      out.write("        <div id=\"vldrDocumento\" style=\"color:#f57c00;;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"input-field col s12 m4\">\n");
      out.write("        <input id=\"cuenta\" type=\"text\" class=\"\" name=\"cuenta\" required=\"\" onkeypress=\"solonum()\" >\n");
      out.write("        <label id=\"lblcuen\" for=\"cuenta\">Número de cuenta:</label>\n");
      out.write("        <div id=\"vldrNombre\" style=\"color:#f57c00;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"input-field col s6 m4\">\n");
      out.write("        <input id=\"titular\" type=\"text\"  name=\"titular\" required=\"\" class=\"\" >\n");
      out.write("        <label id=\"lbltit\" for=\"titular\" >Titular de la cuenta</label>\n");
      out.write("        <div id=\"vldrDocumento\" style=\"color:#f57c00;;\"> </div>\n");
      out.write("    </div>\n");
      out.write("    </div-->\n");
      out.write("    <div>\n");
      out.write("        <input class=\" btn\" type=\"submit\" value=\"Continuar\" id=\"btnenviarFreenlace\" onclick=\" inserFreelance()\">\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write('\n');
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
