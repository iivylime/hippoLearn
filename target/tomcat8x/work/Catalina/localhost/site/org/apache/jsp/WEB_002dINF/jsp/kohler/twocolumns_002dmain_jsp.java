/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-07-18 06:59:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.kohler;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class twocolumns_002dmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("jar:file:/D:/eclipse/eclipse-nenon-x64/workspace/kohler/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("/WEB-INF/lib/hst-client-4.0.1.jar", Long.valueOf(1466669468000L));
    _jspx_dependants.put("/WEB-INF/jsp/include/imports.jsp", Long.valueOf(1467785144000L));
    _jspx_dependants.put("jar:file:/D:/eclipse/eclipse-nenon-x64/workspace/kohler/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/fn.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("jar:file:/D:/eclipse/eclipse-nenon-x64/workspace/kohler/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/fmt.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("jar:file:/D:/eclipse/eclipse-nenon-x64/workspace/kohler/target/tomcat8x/webapps/site/WEB-INF/lib/hst-client-4.0.1.jar!/META-INF/hst-core.tld", Long.valueOf(1466576720000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1466669526000L));
    _jspx_dependants.put("jar:file:/D:/eclipse/eclipse-nenon-x64/workspace/kohler/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/x.tld", Long.valueOf(1384339662000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody;

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
    _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      //  hst:defineObjects
      org.hippoecm.hst.core.component.HstRequest hstRequest = null;
      org.hippoecm.hst.core.component.HstResponse hstResponse = null;
      java.util.List hstResponseChildContentNames = null;
      org.hippoecm.hst.core.request.HstRequestContext hstRequestContext = null;
      org.hippoecm.hst.tag.DefineObjectsTag _jspx_th_hst_005fdefineObjects_005f0 = (org.hippoecm.hst.tag.DefineObjectsTag) _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.get(org.hippoecm.hst.tag.DefineObjectsTag.class);
      _jspx_th_hst_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_hst_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_hst_005fdefineObjects_005f0 = _jspx_th_hst_005fdefineObjects_005f0.doStartTag();
      hstRequest = (org.hippoecm.hst.core.component.HstRequest) _jspx_page_context.findAttribute("hstRequest");
      hstResponse = (org.hippoecm.hst.core.component.HstResponse) _jspx_page_context.findAttribute("hstResponse");
      hstResponseChildContentNames = (java.util.List) _jspx_page_context.findAttribute("hstResponseChildContentNames");
      hstRequestContext = (org.hippoecm.hst.core.request.HstRequestContext) _jspx_page_context.findAttribute("hstRequestContext");
      if (_jspx_th_hst_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.reuse(_jspx_th_hst_005fdefineObjects_005f0);
        return;
      }
      hstRequest = (org.hippoecm.hst.core.component.HstRequest) _jspx_page_context.findAttribute("hstRequest");
      hstResponse = (org.hippoecm.hst.core.component.HstResponse) _jspx_page_context.findAttribute("hstResponse");
      hstResponseChildContentNames = (java.util.List) _jspx_page_context.findAttribute("hstResponseChildContentNames");
      hstRequestContext = (org.hippoecm.hst.core.request.HstRequestContext) _jspx_page_context.findAttribute("hstRequestContext");
      _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.reuse(_jspx_th_hst_005fdefineObjects_005f0);
      out.write("<section class=\"product-category article\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<section class=\"m-b-20\"> \r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-4 side-nav\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"prod-name\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>SINK FAUCETS</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>135 products</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"action-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"sort-by\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">Sort by</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">Name A-Z</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">Name Z-A</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<button><img src=\"");
      if (_jspx_meth_hst_005fwebfile_005f0(_jspx_page_context))
        return;
      out.write("\" alt=\"print\"></button>\r\n");
      out.write("\t\t\t\t\t\t\t<button><img src=\"");
      if (_jspx_meth_hst_005fwebfile_005f1(_jspx_page_context))
        return;
      out.write("\" alt=\"Share\"></button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"m-t-20\">\r\n");
      out.write("\t\t\t\t<div class=\"row \">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-4\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t ");
      if (_jspx_meth_hst_005finclude_005f0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t ");
      if (_jspx_meth_hst_005finclude_005f1(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</section>");
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

  private boolean _jspx_meth_hst_005fwebfile_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:webfile
    org.hippoecm.hst.tag.HstWebFileTag _jspx_th_hst_005fwebfile_005f0 = (org.hippoecm.hst.tag.HstWebFileTag) _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstWebFileTag.class);
    _jspx_th_hst_005fwebfile_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fwebfile_005f0.setParent(null);
    // /WEB-INF/jsp/kohler/twocolumns-main.jsp(19,25) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fwebfile_005f0.setPath("/images/print.png");
    int _jspx_eval_hst_005fwebfile_005f0 = _jspx_th_hst_005fwebfile_005f0.doStartTag();
    if (_jspx_th_hst_005fwebfile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005fwebfile_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005fwebfile_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005fwebfile_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:webfile
    org.hippoecm.hst.tag.HstWebFileTag _jspx_th_hst_005fwebfile_005f1 = (org.hippoecm.hst.tag.HstWebFileTag) _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstWebFileTag.class);
    _jspx_th_hst_005fwebfile_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fwebfile_005f1.setParent(null);
    // /WEB-INF/jsp/kohler/twocolumns-main.jsp(20,25) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fwebfile_005f1.setPath("/images/share.png");
    int _jspx_eval_hst_005fwebfile_005f1 = _jspx_th_hst_005fwebfile_005f1.doStartTag();
    if (_jspx_th_hst_005fwebfile_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005fwebfile_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fwebfile_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005fwebfile_005f1);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f0 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f0.setParent(null);
    // /WEB-INF/jsp/kohler/twocolumns-main.jsp(28,7) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f0.setRef("left");
    int _jspx_eval_hst_005finclude_005f0 = _jspx_th_hst_005finclude_005f0.doStartTag();
    if (_jspx_th_hst_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f1 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f1.setParent(null);
    // /WEB-INF/jsp/kohler/twocolumns-main.jsp(32,8) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f1.setRef("right");
    int _jspx_eval_hst_005finclude_005f1 = _jspx_th_hst_005finclude_005f1.doStartTag();
    if (_jspx_th_hst_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
    return false;
  }
}
