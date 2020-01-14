/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2020-01-14 04:47:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.identity.application.authentication.endpoint.util.UserRegistrationAdminServiceClient;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.user.registration.stub.dto.UserFieldDTO;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import java.net.URLEncoder;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/localize.jsp", Long.valueOf(1536688742000L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

 /**
* Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/ 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write('\n');

    String forwardTo;
    String username = request.getParameter("reg_username");

    try {
        UserRegistrationAdminServiceClient registrationClient = new UserRegistrationAdminServiceClient();
        boolean isExistingUser = registrationClient.isUserExist(username);

        if (StringUtils.equals(request.getParameter("is_validation"), "true")) {
            if (isExistingUser) {
                out.write("User Exist");
            } else {
                out.write("Ok");
            }
            return;
        }

        if (isExistingUser) {
            throw new Exception("User exist");
        }
        List<UserFieldDTO> fields = (List<UserFieldDTO>) session.getAttribute("fields");

        for(UserFieldDTO userFieldDTO : fields) {
            userFieldDTO.setFieldValue(request.getParameter(userFieldDTO.getFieldName()));
        }
        char [] password = request.getParameter("reg_password").toCharArray();
        registrationClient.addUser(username, password, fields);
        forwardTo = "../dashboard/index.jag";
    } catch (Exception e) {
        String error = URLEncoder.encode(AuthenticationEndpointUtil.i18n(resourceBundle, "internal.error.occurred"),"utf-8");
        response.sendRedirect("create-account.jsp?sessionDataKey=" + request.getParameter("sessionDataKey") +
                "&failedPrevious=true&errorCode=" + error);
        return;
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <link href=\"libs/bootstrap_3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div id=\"infoModel\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    <h4 class=\"modal-title\">\n");
      out.write("                        ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "information"));
      out.write("\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <p>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "user.details.submitted"));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">\n");
      out.write("                        ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "close"));
      out.write("\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"libs/jquery_1.11.3/jquery-1.11.3.js\"></script>\n");
      out.write("<script src=\"libs/bootstrap_3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"application/javascript\" >\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        var infoModel = $(\"#infoModel\");\n");
      out.write("        infoModel.modal(\"show\");\n");
      out.write("        infoModel.on('hidden.bs.modal', function() {\n");
      out.write("            location.href = \"");
      out.print( Encode.forJavaScriptBlock(forwardTo) );
      out.write("\";\n");
      out.write("        })\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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