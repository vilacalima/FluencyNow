/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2023-04-21 13:08:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("\r\n");
      out.write("<spring:url value=\"resources/css/all.min.css\" var=\"allminCSS\" />\r\n");
      out.write("<spring:url value=\"resources/index.css\" var=\"indexCSS\" />\r\n");
      out.write("\r\n");
      out.write(" <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Exemplo de cabeÃ§alho responsivo</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allminCSS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${indexCSS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("  <!-- <link rel=\"stylesheet\" href=\"reset.css\"> -->\r\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Montserrat&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- //FONTE NOVA -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <header>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-light bg-light\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <!-- Logotipo na parte esquerda -->\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("          <img src=\"resources/images/Logo.png\" alt=\"Logo\" style=\"height: 150px;\">\r\n");
      out.write("        </a>\r\n");
      out.write(" \r\n");
      out.write("        <!-- BotÃ£o de administrador no canto superior direito -->\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"admin-btn\" href=\"login\">Administrador</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-6\">\r\n");
      out.write("        <h2>Procurar Alunos</h2>\r\n");
      out.write("      <table class=\"table\">\r\n");
      out.write("        <form class=\"row row-cols-lg-auto g-3 align-items-center\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"table-responsive\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">#</th>\r\n");
      out.write("      <th scope=\"col\"> Nome </th>\r\n");
      out.write("      <th scope=\"col\"> CPF </th>\r\n");
      out.write("      <th scope=\"col\"> E-mail </th>\r\n");
      out.write("      <th scope=\"col\"> Horario </th>\r\n");
      out.write("      <th scope=\"col\"> Semanal </th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <table class=\"table table-hover\">\r\n");
      out.write("     <table class=\"table table-bordered\">\r\n");
      out.write("      <th scope=\"row\">1</th>\r\n");
      out.write("      <td>JoÃ£o Silva</td>\r\n");
      out.write("      <td> 468.494.858-78</td>\r\n");
      out.write("      <td> joaosilva@hotmail.com</td>\r\n");
      out.write("      <td>07h as 08h</td>\r\n");
      out.write("      <td> Quinta - feira </td>\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">2</th>\r\n");
      out.write("      <td>Miguel Pereira</td>\r\n");
      out.write("      <td>495.478.698-89</td>\r\n");
      out.write("      <td>migueljose@hotmail.com</td>\r\n");
      out.write("       <td>11h as 12h</td>\r\n");
      out.write("      <td> Segunda - feira </td>\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">3</th>\r\n");
      out.write("      <td colspan=\"2\">Maria Eduarda</td>\r\n");
      out.write("      <td>555.478.745-88</td>\r\n");
      out.write("      <td>meduarda@hotmail.com</td>\r\n");
      out.write("       <td>11h as 13h</td>\r\n");
      out.write("      <td> TerÃ§a - feira </td\r\n");
      out.write("    </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("      <th scope=\"row\">4</th>\r\n");
      out.write("      <td colspan=\"2\">JosÃ© Eduardo</td>\r\n");
      out.write("      <td>512.123.745-89</td>\r\n");
      out.write("      <td>jdeduardo@hotmail.com</td>\r\n");
      out.write("       <td>13h as 14h</td>\r\n");
      out.write("      <td> Sexta - feira </td\r\n");
      out.write("    </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          \r\n");
      out.write("      <th scope=\"row\">5</th>\r\n");
      out.write("      <td colspan=\"2\"> Ana Beatriz</td>\r\n");
      out.write("      <td>879.984.875-86</td>\r\n");
      out.write("      <td>anabeatriz@hotmail.com</td>\r\n");
      out.write("       <td>15h as 16h</td>\r\n");
      out.write("      <td> Quarta - feira </td\r\n");
      out.write("    </tr>\r\n");
      out.write("        \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h1>Cadastro</h1>\r\n");
      out.write("<div class=\"col-md-6\">\r\n");
      out.write("        <form class=\"formulario-contato\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"nome\"></label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"cadastronome\" placeholder=\"Nome\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"CPF\"></label>\r\n");
      out.write("            <input type=\"cpf\" class=\"form-control\" id=\"cadastroCPF\" placeholder=\"468-787-898-85\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"data-nascimento\"></label>\r\n");
      out.write("            <input type=\"date\" textarea class=\"form-control\" id=\"cadastrodata-nascimento\"\r\n");
      out.write("              placeholder=\"00/00/00\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"endereco\"></label>\r\n");
      out.write("            <input type=\"address\" textarea class=\"form-control\" id=\"cadastroendereco\"\r\n");
      out.write("              placeholder=\"Rua FluencyNow\"></textarea>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("            <label for=\"numero\"></label>\r\n");
      out.write("            <input type=\"addressnumber\" textarea class=\"form-control\" id=\"cadastronumendereco\"\r\n");
      out.write("              placeholder=\"01\"></textarea>\r\n");
      out.write("    </div>\r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("            <label for=\"email\"></label>\r\n");
      out.write("            <input type=\"emailcadastro\" textarea class=\"form-control\" id=\"cadastroemail\"\r\n");
      out.write("              placeholder=\"fluency@now.com.br\"</textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("    \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"telefone\"></label>\r\n");
      out.write("            <input type=\"number\" textarea class=\"form-control\" id=\"cadastrotelefone\"\r\n");
      out.write("              placeholder=\"(11) 12345-859\"></textarea>\r\n");
      out.write("    <div>\r\n");
      out.write("            <a href=\"https://wa.me/5511945390855\" class=\"btn btn-primary btn-cadastrar\"> Cadastrar Aula <div class=\"botaocadastrar\">\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("              <a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <h1>Procurar Plano de Aula</h1>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("     <table class=\"table\">\r\n");
      out.write("       \r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">#Id</th>\r\n");
      out.write("      <th scope=\"col\">Nome</th>\r\n");
      out.write("      <th scope=\"col\">Valor</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <table class=\"table table-hover\">\r\n");
      out.write("        <table class=\"table table-bordered\">\r\n");
      out.write("      <th scope=\"row\">1</th>\r\n");
      out.write("      <td>Canada 2 dias da semana</td>\r\n");
      out.write("      <td>teste@gmail.com</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">2</th>\r\n");
      out.write("     <td>Meexico 2 dias da semana</td>\r\n");
      out.write("      <td>teste@gmail.com</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">3</th>\r\n");
      out.write("   <td>Mexico 2 dias da semana</td>\r\n");
      out.write("      <td>teste@gmail.com</td> \r\n");
      out.write("    </tr>\r\n");
      out.write("    <th scope=\"row\">3</th>\r\n");
      out.write("   <td>EUA 1 dia da semana - Grupo</td>\r\n");
      out.write("      <td>teste@gmail.com</td> \r\n");
      out.write("    </tr>\r\n");
      out.write("       <th scope=\"row\">3</th>\r\n");
      out.write("   <td>Espanha 1 dia da semana - Grupo</td>\r\n");
      out.write("      <td>teste@gmail.com</td> \r\n");
      out.write("    </tr>\r\n");
      out.write("     <th scope=\"row\">3</th>\r\n");
      out.write("   <td>Inglaterra 1 dia da semana - Grupo</td>\r\n");
      out.write("      <td>teste@gmail.com</td> \r\n");
      out.write("    </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("  <div class=\"container-2\">\r\n");
      out.write("    <h1>Cadastro Plano</h1>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("  <div class=\"col\">\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"Eua - 1 dia da semana\" aria-label=\"First name\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col\">\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"R4160,00\" aria-label=\"Last name\">\r\n");
      out.write("      <div class=\"btn btn-primary btn-cadastraraula\"> Cadastrar Plano <div class=\"botaocadastraraula\">\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("              <a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>      \r\n");
      out.write("    </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"footer\" style=\"background-color: #8CB3FD;\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row align-items-center\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("          <img src=\"resources/images/Logo.png\" alt=\"Logo\" style=\"height: 150px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 text-center\">\r\n");
      out.write("          <p class=\"mb-0\">Baixe nosso aplicativo</p>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-android fa-2x\"></i></a>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-apple fa-2x\"></i></a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3 text-right\">\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-facebook fa-2x\"></i></a>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-twitter fa-2x\"></i></a>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-whatsapp fa-2x\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12 text-center\">\r\n");
      out.write("          <p>&copy; 2023 Todos os direitos reservados.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Scripts do Bootstrap -->\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"\r\n");
      out.write("    integrity=\"sha384-wiJyZO0jX6hh60ggnIh0YzZU6QIXx4jI0gblZWfD0yE6fr5XhLgB1CxojrbjzlzF\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    position: relative;\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  body::before {\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    background-image: url('\\images\\img-background.jpg');\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    opacity: 0.4;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    z-index: -1;\r\n");
      out.write("    text-rendering: auto;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(".container-fluid {\r\n");
      out.write("    background-color: #8CB3FD;\r\n");
      out.write("    height: 200px;\r\n");
      out.write("    /* margin: 0px; */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".navbar-text {\r\n");
      out.write("    font-family: 'Montserrat', sans-serif;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-weight: 800;\r\n");
      out.write("    font-size: 60px;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("    text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);\r\n");
      out.write("    padding-top: 30px;\r\n");
      out.write("    padding-left: 10%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".admin-btn {\r\n");
      out.write("    color: #fff; /* Define a cor do texto como branco */\r\n");
      out.write("    background-color:   #3C22DC;\r\n");
      out.write("    font-size: 15px ;\r\n");
      out.write("    padding: 5px 10px;\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write(".nav-item{\r\n");
      out.write("    margin-top: -90px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".texto-principal{\r\n");
      out.write("    width: 500px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container{\r\n");
      out.write("    padding-top: 50px;\r\n");
      out.write("}\r\n");
      out.write(".container h2{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container p{\r\n");
      out.write("    text-align: justify;\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".btn-primary{\r\n");
      out.write("    color: black;\r\n");
      out.write("    background-color: #81D589;\r\n");
      out.write("    margin: 50px 100px;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    text-aling: center;\r\n");
      out.write("    width: 200px;\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".form-control {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    item-aling: center;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-radius: 7px;\r\n");
      out.write("    padding: 100px;\r\n");
      out.write("    box-shadow: 10px 10px 40px rgba(0, 0, 0, 0.4);\r\n");
      out.write("    gap: 5px;\r\n");
      out.write("    margin: 5px 500px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-border{\r\n");
      out.write(" margin: 50px 100px 0px;\r\n");
      out.write(" font-family: 'Montserrat', sans-serif;\r\n");
      out.write("font-style: normal;\r\n");
      out.write("font-weight: 400;\r\n");
      out.write("font-size: 20px;\r\n");
      out.write("line-height: 47px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".card{\r\n");
      out.write("    margin-top: 90px;\r\n");
      out.write("    border: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".col-md-4{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin-left:-10px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  .container-2 h1{\r\n");
      out.write("text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(" .card-box{\r\n");
      out.write("    background-color: #003BAE;\r\n");
      out.write("    height: 440px;\r\n");
      out.write("/* width: 291px; */\r\n");
      out.write("/* left: 49px; */\r\n");
      out.write("top: 1561px;\r\n");
      out.write("border-radius: 37px;\r\n");
      out.write("opacity: 80%;\r\n");
      out.write("margin-bottom: 20px;\r\n");
      out.write("color:#fff ;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" }    \r\n");
      out.write(".col{\r\n");
      out.write("margin-left: 500px 50px 50px;  \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(" .container h1{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: 46px;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .card-title h2 {\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .card-title p{\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-top: 25px;\r\n");
      out.write("    opacity: 99%;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" .footer {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 40px 0;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .footer img {\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  .footer a:hover i {\r\n");
      out.write("    color: #2413be;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .footer hr {\r\n");
      out.write("    border-top: 1px solid #fff;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .footer p {\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    margin-bottom: 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  @media (max-width: 991px) {\r\n");
      out.write("    .card-box {\r\n");
      out.write("      margin-bottom: 30px;\r\n");
      out.write("    }\r\n");
      out.write("  }");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
