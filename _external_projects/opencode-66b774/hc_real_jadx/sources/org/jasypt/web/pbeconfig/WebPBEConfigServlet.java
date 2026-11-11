package org.jasypt.web.pbeconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.WebPBEConfig;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class WebPBEConfigServlet extends HttpServlet {
    private static final long serialVersionUID = -7201635392816652667L;

    private void execute(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String createConfigurationDoneHtml;
        try {
            WebPBEConfigRegistry webPBEConfigRegistry = WebPBEConfigRegistry.getInstance();
            if (webPBEConfigRegistry.isWebConfigurationDone()) {
                createConfigurationDoneHtml = WebPBEConfigHtmlUtils.createConfigurationDoneHtml();
            } else {
                int i = 0;
                if (CommonUtils.isEmpty(httpServletRequest.getParameter(WebPBEConfigHtmlUtils.PASSWORD_SETTING_FLAG))) {
                    createConfigurationDoneHtml = WebPBEConfigHtmlUtils.createInputFormHtml(httpServletRequest, false);
                } else {
                    List<WebPBEConfig> configs = webPBEConfigRegistry.getConfigs();
                    int i2 = 0;
                    int i3 = 0;
                    for (WebPBEConfig webPBEConfig : configs) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(WebPBEConfigHtmlUtils.VALIDATION_PREFIX);
                        stringBuffer.append(i3);
                        String parameter = httpServletRequest.getParameter(stringBuffer.toString());
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(WebPBEConfigHtmlUtils.PASSWORD_PREFIX);
                        stringBuffer2.append(i3);
                        String parameter2 = httpServletRequest.getParameter(stringBuffer2.toString());
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(WebPBEConfigHtmlUtils.PASSWORD_RETYPED_PREFIX);
                        stringBuffer3.append(i3);
                        String parameter3 = httpServletRequest.getParameter(stringBuffer3.toString());
                        if (!CommonUtils.isEmpty(parameter) && !CommonUtils.isEmpty(parameter2) && parameter2.equals(parameter3) && webPBEConfig.getValidationWord().equals(parameter)) {
                            i2++;
                        }
                        i3++;
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                    Calendar calendar = Calendar.getInstance();
                    if (i2 < configs.size()) {
                        ServletContext servletContext = getServletContext();
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("Failed attempt to set PBE Configuration from ");
                        stringBuffer4.append(httpServletRequest.getRemoteAddr());
                        stringBuffer4.append(" [");
                        stringBuffer4.append(simpleDateFormat.format(calendar.getTime()));
                        stringBuffer4.append("]");
                        servletContext.log(stringBuffer4.toString());
                        createConfigurationDoneHtml = WebPBEConfigHtmlUtils.createInputFormHtml(httpServletRequest, true);
                    } else {
                        for (WebPBEConfig webPBEConfig2 : configs) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append(WebPBEConfigHtmlUtils.PASSWORD_PREFIX);
                            stringBuffer5.append(i);
                            webPBEConfig2.setPassword(httpServletRequest.getParameter(stringBuffer5.toString()));
                            i++;
                        }
                        webPBEConfigRegistry.setWebConfigurationDone(true);
                        ServletContext servletContext2 = getServletContext();
                        StringBuffer stringBuffer6 = new StringBuffer();
                        stringBuffer6.append("PBE Configuration succesfully set from ");
                        stringBuffer6.append(httpServletRequest.getRemoteAddr());
                        stringBuffer6.append(" [");
                        stringBuffer6.append(simpleDateFormat.format(calendar.getTime()));
                        stringBuffer6.append("]");
                        servletContext2.log(stringBuffer6.toString());
                        createConfigurationDoneHtml = WebPBEConfigHtmlUtils.createConfigurationDoneHtml();
                    }
                }
            }
            writeResponse(createConfigurationDoneHtml, httpServletResponse);
        } catch (IOException e) {
            getServletContext().log("Exception raised during servlet execution", e);
            throw e;
        } catch (Throwable th) {
            getServletContext().log("Exception raised during servlet execution", th);
            throw new ServletException(th);
        }
    }

    private void writeResponse(String str, HttpServletResponse httpServletResponse) {
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write(str);
        writer.flush();
    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        execute(httpServletRequest, httpServletResponse);
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        execute(httpServletRequest, httpServletResponse);
    }
}
