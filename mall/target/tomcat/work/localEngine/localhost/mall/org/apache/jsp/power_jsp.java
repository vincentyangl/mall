package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class power_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"ztree/css/zTreeStyle/zTreeStyle.css\"/>\r\n");
      out.write("<script src=\"js/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"ztree/js/jquery.ztree.all.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("\t   var setting = {\r\n");
      out.write("\t\t\t   /* view : {\r\n");
      out.write("\t\t            showIcon : false,\r\n");
      out.write("\t\t            selectedMulti : true,     //可以多选\r\n");
      out.write("\t\t            showLine : false,\r\n");
      out.write("\t\t            expandSpeed : 'fast',\r\n");
      out.write("\t\t            dblClickExpand : false\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        check : {\r\n");
      out.write("\t\t            enable : true,\r\n");
      out.write("\t\t            chkStyle : \"checkbox\",    //复选框\r\n");
      out.write("\t\t            chkboxType : {\r\n");
      out.write("\t\t                \"Y\" : \"s\",\r\n");
      out.write("\t\t                \"N\" : \"ps\"\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        }, */\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tsimpleData : {\r\n");
      out.write("\t\t\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\t\t\tidKey : \"pid\",\r\n");
      out.write("\t\t\t\t\t\tpIdKey : \"powerId\",\r\n");
      out.write("\t\t\t\t\t\trootPId : \"0\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\tkey: {\r\n");
      out.write("\t\t\t\t\t\tname: \"powerName\"\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t   $.post(\"IndexServlet?state=getPower\",function(data){\r\n");
      out.write("\t   \t$.fn.zTree.init($(\"#myTree\"),setting,data);\r\n");
      out.write("\t   },\"json\");\r\n");
      out.write("\t   \r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div><ul class=\"ztree\" id=\"myTree\"></ul></div>\r\n");
      out.write("\r\n");
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
