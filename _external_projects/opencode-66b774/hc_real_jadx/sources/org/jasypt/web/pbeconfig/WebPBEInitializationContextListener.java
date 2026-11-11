package org.jasypt.web.pbeconfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionInitializationException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class WebPBEInitializationContextListener implements ServletContextListener {
    public static final String INIT_PARAM_INITIALIZER_CLASS_NAME = "webPBEInitializerClassName";
    public static /* synthetic */ Class class$org$jasypt$web$pbeconfig$WebPBEInitializer;

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String initParameter = servletContextEvent.getServletContext().getInitParameter(INIT_PARAM_INITIALIZER_CLASS_NAME);
        if (CommonUtils.isEmpty(initParameter)) {
            throw new EncryptionInitializationException("webPBEInitializerClassName context initialization parameter not set in web.xml");
        }
        try {
            Class<?> loadClass = Thread.currentThread().getContextClassLoader().loadClass(initParameter);
            Class cls = class$org$jasypt$web$pbeconfig$WebPBEInitializer;
            if (cls == null) {
                cls = class$("org.jasypt.web.pbeconfig.WebPBEInitializer");
                class$org$jasypt$web$pbeconfig$WebPBEInitializer = cls;
            }
            if (cls.isAssignableFrom(loadClass)) {
                try {
                    ((WebPBEInitializer) loadClass.newInstance()).initializeWebPBEConfigs();
                    return;
                } catch (IllegalAccessException e) {
                    throw new EncryptionInitializationException(e);
                } catch (InstantiationException e2) {
                    throw new EncryptionInitializationException(e2);
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Class ");
            stringBuffer.append(initParameter);
            stringBuffer.append(" does not implement interface ");
            Class cls2 = class$org$jasypt$web$pbeconfig$WebPBEInitializer;
            if (cls2 == null) {
                cls2 = class$("org.jasypt.web.pbeconfig.WebPBEInitializer");
                class$org$jasypt$web$pbeconfig$WebPBEInitializer = cls2;
            }
            stringBuffer.append(cls2.getName());
            throw new EncryptionInitializationException(stringBuffer.toString());
        } catch (ClassNotFoundException e3) {
            throw new EncryptionInitializationException(e3);
        }
    }
}
