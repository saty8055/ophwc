/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-04-05 00:07:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class assignProjectsToUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"page-wrapper\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<h3 class=\"page-header\">Users List</h3>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t<h5>Users List</h5>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- /.panel-heading -->\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"dataTables-example_wrapper\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dataTables_wrapper form-inline dt-bootstrap no-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table width=\"100%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"table table-striped table-bordered table-hover dataTable no-footer dtr-inline\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"dataTables-example\" role=\"grid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-describedby=\"dataTables-example_info\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr role=\"row\" class=\"bg-warning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_asc\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-sort=\"ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column descending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 171px;\">S.NO</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-sort=\"ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column descending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 171px;\">User Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 207px;\">First Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 207px;\">Last Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 207px;\">Mobile Number</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 207px;\">Email Id</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 207px;\">User Type</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 207px;\">Division</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-controls=\"dataTables-example\" rowspan=\"1\" colspan=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Browser: activate to sort column ascending\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 207px;\">Assign</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/assignProjectsToUser.jsp(82,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("user");
      // /WEB-INF/views/assignProjectsToUser.jsp(82,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/assignProjectsToUser.jsp(82,11) '${usersList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${usersList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/assignProjectsToUser.jsp(82,11) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("counter");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"gradeA odd\" role=\"row\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"sorting_1\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${counter.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.firstName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.lastName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phoneNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.emailId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userTypes.typeName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.divisions.divisionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
            out.print(request.getContextPath());
            out.write("/project/assignNature/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-plus-sign\"></span>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a></td>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.table-responsive -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.panel-body -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.panel -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.col-lg-12 -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- ... Your content goes here ... -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#dataTables-example').DataTable({\r\n");
      out.write("\t\t\tresponsive : true,\r\n");
      out.write("\t\t\tstateSave: true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
