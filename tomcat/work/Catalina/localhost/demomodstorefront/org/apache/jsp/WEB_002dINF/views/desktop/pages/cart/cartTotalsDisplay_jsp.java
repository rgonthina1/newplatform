/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2016-06-20 14:19:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.desktop.pages.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartTotalsDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(10);
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/implicit.tld", Long.valueOf(1466418958111L));
    _jspx_dependants.put("/WEB-INF/tags/shared/format/implicit.tld", Long.valueOf(1466418958251L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/taxExtimate.tag", Long.valueOf(1466418958048L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/cartTotals.tag", Long.valueOf(1466418958048L));
    _jspx_dependants.put("/WEB-INF/tags/shared/theme/implicit.tld", Long.valueOf(1466418958251L));
    _jspx_dependants.put("/WEB-INF/tags/shared/format/price.tag", Long.valueOf(1466418958251L));
    _jspx_dependants.put("/WEB-INF/common/tld/cmstags.tld", Long.valueOf(1466418958017L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/ajaxCartTotals.tag", Long.valueOf(1466418958033L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1466418958017L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/implicit.tld", Long.valueOf(1466418958048L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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

      if (_jspx_meth_cart_005fcartTotals_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_cart_005fajaxCartTotals_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_cart_005fcartTotals_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cart:cartTotals
    org.apache.jsp.tag.webdesktop.cart.cartTotals_tag _jspx_th_cart_005fcartTotals_005f0 = (new org.apache.jsp.tag.webdesktop.cart.cartTotals_tag());
    _jsp_instancemanager.newInstance(_jspx_th_cart_005fcartTotals_005f0);
    _jspx_th_cart_005fcartTotals_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/desktop/pages/cart/cartTotalsDisplay.jsp(3,0) name = cartData type = de.hybris.platform.commercefacades.order.data.CartData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_cart_005fcartTotals_005f0.setCartData((de.hybris.platform.commercefacades.order.data.CartData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartData}", de.hybris.platform.commercefacades.order.data.CartData.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/desktop/pages/cart/cartTotalsDisplay.jsp(3,0) name = showTaxEstimate type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_cart_005fcartTotals_005f0.setShowTaxEstimate((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taxEstimationEnabled}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_cart_005fcartTotals_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_cart_005fcartTotals_005f0);
    return false;
  }

  private boolean _jspx_meth_cart_005fajaxCartTotals_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cart:ajaxCartTotals
    org.apache.jsp.tag.webdesktop.cart.ajaxCartTotals_tag _jspx_th_cart_005fajaxCartTotals_005f0 = (new org.apache.jsp.tag.webdesktop.cart.ajaxCartTotals_tag());
    _jsp_instancemanager.newInstance(_jspx_th_cart_005fajaxCartTotals_005f0);
    _jspx_th_cart_005fajaxCartTotals_005f0.setJspContext(_jspx_page_context);
    _jspx_th_cart_005fajaxCartTotals_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_cart_005fajaxCartTotals_005f0);
    return false;
  }
}
