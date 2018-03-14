package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>LarryCMS后台登录</title>\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\t\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\t\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\t\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\t\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\t\r\n");
      out.write("\t<!-- load css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"common/layui/css/layui.css\" media=\"all\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\" media=\"all\">\r\n");
      out.write("\t\t<script src=\"js/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-canvs\"></div>\r\n");
      out.write("<form action=\"\" method=\"post\">\r\n");
      out.write("<div class=\"layui-layout layui-layout-login\">\r\n");
      out.write("\t<h1>\r\n");
      out.write("\t\t <strong>LarryCMS管理系统后台</strong>\r\n");
      out.write("\t\t <em>Management System</em>\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t<div class=\"layui-user-icon larry-login\">\r\n");
      out.write("\t\t <input type=\"text\" name=\"uname\" placeholder=\"账号\" class=\"login_txtbx\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"layui-pwd-icon larry-login\">\r\n");
      out.write("\t\t <input type=\"password\"  name=\"upwd\" placeholder=\"密码\" class=\"login_txtbx\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"layui-val-icon larry-login\">\r\n");
      out.write("    \t<div class=\"layui-code-box\">\r\n");
      out.write("    \t\t<input type=\"text\" id=\"code\" name=\"code\" placeholder=\"验证码\" maxlength=\"4\" class=\"login_txtbx\">\r\n");
      out.write("            <img src=\"images/verifyimg.png\" alt=\"\" class=\"verifyImg\" id=\"verifyImg\" onClick=\"javascript:this.src='xxx'+Math.random();\">\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-submit larry-login\">\r\n");
      out.write("    \t<input type=\"button\" value=\"立即登陆\" class=\"submit_btn\"/>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-login-text\">\r\n");
      out.write("    \t<p>© 2016-2017 Larry 版权所有</p>\r\n");
      out.write("        <p>鄂xxxxxx</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" src=\"common/layui/lay/dest/layui.all.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jsplug/jparticle.jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\".layui-canvs\").jParticle({\r\n");
      out.write("\t\tbackground: \"#141414\",\r\n");
      out.write("\t\tcolor: \"#E6E6E6\"\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("//登录链接测试，使用时可删除\r\n");
      out.write("$(\".submit_btn\").click(function(){\r\n");
      out.write("  document.forms[0].action=\"LoginServlet?state=login\";\r\n");
      out.write("  document.forms[0].submit();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
