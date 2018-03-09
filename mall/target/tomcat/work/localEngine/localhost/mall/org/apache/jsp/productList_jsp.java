package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("      \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>个人信息</title>\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\t\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\t\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\t\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\t\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\t\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"common/layui/css/layui.css\" media=\"all\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"common/bootstrap/css/bootstrap.css\" media=\"all\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"common/global.css\" media=\"all\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/personal.css\" media=\"all\">\r\n");
      out.write("\t<script src=\"js/jquery.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<section class=\"layui-larry-box\">\r\n");
      out.write("\t<div class=\"larry-personal\">\r\n");
      out.write("\t    <div class=\"layui-tab\">\r\n");
      out.write("            <blockquote class=\"layui-elem-quote news_search\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t    <div class=\"layui-input-inline\">\r\n");
      out.write("\t\t    \t<input value=\"\" placeholder=\"请输入关键字\" class=\"layui-input search_input\" type=\"text\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <a class=\"layui-btn search_btn\">查询</a>\r\n");
      out.write("\t\t</div><div class=\"layui-inline\">\r\n");
      out.write("\t\t\t<a class=\"layui-btn layui-btn-normal newsAdd_btn\">添加文章</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t<a class=\"layui-btn recommend\" style=\"background-color:#5FB878\">推荐文章</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t<a class=\"layui-btn audit_btn\">审核文章</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t<a class=\"layui-btn layui-btn-danger batchDel\">批量删除</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t<div class=\"layui-form-mid layui-word-aux\">本页面刷新后除新添加的文章外所有操作无效，关闭页面所有数据重置</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</blockquote>\r\n");
      out.write("            \r\n");
      out.write("\t\t    <div class=\"layui-tab-content larry-personal-body clearfix mylog-info-box\">\r\n");
      out.write("\t\t         <!-- 操作日志 -->\r\n");
      out.write("                <div class=\"layui-tab-item layui-field-box layui-show\">\r\n");
      out.write("                     <table class=\"layui-table table-hover\" lay-even=\"\" lay-skin=\"nob\">\r\n");
      out.write("                          <thead>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                  <th><input type=\"checkbox\" id=\"selected-all\"></th>\r\n");
      out.write("                                  <th>ID</th>\r\n");
      out.write("                                  <th>商品名称</th>\r\n");
      out.write("                                  <th>商品价格</th>\r\n");
      out.write("                                  <th>销售数量</th>\r\n");
      out.write("                                  <th>商品详情</th>\r\n");
      out.write("                                  <th>商品图片</th>\r\n");
      out.write("                                  <th>商品类别</th>\r\n");
      out.write("                                  <th>操作</th>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                          </thead>\r\n");
      out.write("                          <tbody>\r\n");
      out.write("                          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                          </tbody>\r\n");
      out.write("                     </table>\r\n");
      out.write("                     <div class=\"larry-table-page clearfix\">\r\n");
      out.write("                          <a href=\"javascript:;\" class=\"layui-btn layui-btn-small\"><i class=\"iconfont icon-shanchu1\"></i>删除</a>\r\n");
      out.write("\t\t\t\t          <div id=\"page\" class=\"page\"></div>\r\n");
      out.write("\t\t\t         </div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t     <!-- 登录日志 -->\r\n");
      out.write("\t\t\t    <div class=\"layui-tab-item layui-field-box\">\r\n");
      out.write("\t\t\t          <table class=\"layui-table table-hover\" lay-even=\"\" lay-skin=\"nob\">\r\n");
      out.write("                           <thead>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                  <th><input type=\"checkbox\" id=\"selected-all\"></th>\r\n");
      out.write("                                  <th>ID</th>\r\n");
      out.write("                                  <th>管理员账号</th>\r\n");
      out.write("                                  <th>状态</th>\r\n");
      out.write("                                  <th>最后登录时间</th>\r\n");
      out.write("                                  <th>上次登录IP</th>\r\n");
      out.write("                                  <th>登录IP</th>\r\n");
      out.write("                                  <th>IP所在位置</th>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><input type=\"checkbox\"></td>\r\n");
      out.write("                                <td>110</td>\r\n");
      out.write("                                <td>admin</td>\r\n");
      out.write("                                <td>后台登录成功</td>\r\n");
      out.write("                                <td>2016-12-19 14:26:03</td>\r\n");
      out.write("                                <td>127.0.0.1</td>\r\n");
      out.write("                                <td>127.0.0.1</td>\r\n");
      out.write("                                <td>Unknown</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("\t\t\t          </table>\r\n");
      out.write("\t\t\t          <div class=\"larry-table-page clearfix\">\r\n");
      out.write("                          <a href=\"javascript:;\" class=\"layui-btn layui-btn-small\"><i class=\"iconfont icon-shanchu1\"></i>删除</a>\r\n");
      out.write("\t\t\t\t          <div id=\"page2\" class=\"page\"></div>\r\n");
      out.write("\t\t\t         </div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<script type=\"text/javascript\" src=\"common/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tlayui.use(['jquery','layer','element','laypage'],function(){\r\n");
      out.write("\t      window.jQuery = window.$ = layui.jquery;\r\n");
      out.write("\t      window.layer = layui.layer;\r\n");
      out.write("          var element = layui.element(),\r\n");
      out.write("              laypage = layui.laypage;\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          laypage({\r\n");
      out.write("\t\t\t\t\tcont: 'page',\r\n");
      out.write("\t\t\t\t\tpages: 10 //总页数\r\n");
      out.write("\t\t\t\t\t\t,\r\n");
      out.write("\t\t\t\t\tgroups: 5 //连续显示分页数\r\n");
      out.write("\t\t\t\t\t\t,\r\n");
      out.write("\t\t\t\t\tjump: function(obj, first) {\r\n");
      out.write("\t\t\t\t\t\t//得到了当前页，用于向服务端请求对应数据\r\n");
      out.write("\t\t\t\t\t\tvar curr = obj.curr;\r\n");
      out.write("\t\t\t\t\t\tif(!first) {\r\n");
      out.write("\t\t\t\t\t\t\t//layer.msg('第 '+ obj.curr +' 页');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("          laypage({\r\n");
      out.write("\t\t\t\t\tcont: 'page2',\r\n");
      out.write("\t\t\t\t\tpages: 10 //总页数\r\n");
      out.write("\t\t\t\t\t\t,\r\n");
      out.write("\t\t\t\t\tgroups: 5 //连续显示分页数\r\n");
      out.write("\t\t\t\t\t\t,\r\n");
      out.write("\t\t\t\t\tjump: function(obj, first) {\r\n");
      out.write("\t\t\t\t\t\t//得到了当前页，用于向服务端请求对应数据\r\n");
      out.write("\t\t\t\t\t\tvar curr = obj.curr;\r\n");
      out.write("\t\t\t\t\t\tif(!first) {\r\n");
      out.write("\t\t\t\t\t\t\t//layer.msg('第 '+ obj.curr +' 页');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("    });\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /productList.jsp(67,26) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${products }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /productList.jsp(67,26) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("p");
    // /productList.jsp(67,26) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("statu");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                              <tr>\r\n");
          out.write("                                <td><input type=\"checkbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statu.index+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.price }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.saleCount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.descript }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pimg }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.productType.ptname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td><a href=\"/ProductServlet?state=del&pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-default \">删除</a><a href=\"/ProductServlet?state=toUpdate&pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-default\">修改</a></td>\r\n");
          out.write("                              </tr>\r\n");
          out.write("                              ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}