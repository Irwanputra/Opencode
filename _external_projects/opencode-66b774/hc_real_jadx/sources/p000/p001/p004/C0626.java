package p000.p001.p004;

import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p000.C0706;
import p000.EnumC0721;
import p000.p001.p006.AbstractC0638;
import p000.p001.p006.C0637;
import p000.p001.p006.C0639;
import p000.p001.p006.InterfaceC0640;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0626 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Logger f4330;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C0626 f4331;

    static {
        Class<?> cls;
        C0626 c0626;
        boolean z;
        C0625 c0625;
        C0625 c06252;
        C0627 c0627 = null;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                c0626 = null;
            }
        } catch (ClassNotFoundException unused2) {
            cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
        }
        Class<?> cls2 = cls;
        C0625 c06253 = new C0625(null, "setUseSessionTickets", Boolean.TYPE);
        C0625 c06254 = new C0625(null, "setHostname", String.class);
        if (Security.getProvider("GMSCore_OpenSSL") == null) {
            try {
                Class.forName("android.net.Network");
            } catch (ClassNotFoundException unused3) {
                z = false;
            }
        }
        z = true;
        if (z) {
            c0625 = new C0625(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            c06252 = new C0625(null, "setAlpnProtocols", byte[].class);
        } else {
            c0625 = null;
            c06252 = null;
        }
        c0626 = new C0621(cls2, c06253, c06254, c0625, c06252);
        if (c0626 == null) {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (c0626 = C0619.m1780()) == null) {
                try {
                    c0626 = new C0620(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
                } catch (NoSuchMethodException unused4) {
                    c0626 = null;
                }
                if (c0626 == null) {
                    try {
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        c0627 = new C0627(cls3.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                    c0626 = c0627 != null ? c0627 : new C0626();
                }
            }
        }
        f4331 = c0626;
        f4330 = Logger.getLogger(C0706.class.getName());
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static List<String> m1800(List<EnumC0721> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC0721 enumC0721 = list.get(i);
            if (enumC0721 != EnumC0721.HTTP_1_0) {
                arrayList.add(enumC0721.f4784);
            }
        }
        return arrayList;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static <T> T m1801(Object obj, Class<T> cls, String str) {
        Object m1801;
        for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null && cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (m1801 = m1801(obj, Object.class, "delegate")) == null) {
            return null;
        }
        return (T) m1801(m1801, cls, str);
    }

    @Nullable
    /* renamed from: 〳ぜぞぜべっ */
    public String mo1781(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: ぁごぐすすぃ */
    public SSLContext mo1782() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: いいにぽつ */
    public boolean mo1786(String str) {
        return true;
    }

    /* renamed from: くし〴〺ぅ */
    public AbstractC0638 mo1788(X509TrustManager x509TrustManager) {
        return new C0639(mo1791(x509TrustManager));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1802(SSLSocket sSLSocket) {
    }

    /* renamed from: づざかべべ */
    public void mo1784(SSLSocket sSLSocket, String str, List<EnumC0721> list) {
    }

    /* renamed from: てぜきぽく */
    public void mo1789(String str, Object obj) {
        if (obj == null) {
            str = C2098.m4205(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo1793(5, str, (Throwable) obj);
    }

    /* renamed from: なぎぱいぢぎ */
    public void mo1790(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: びぐびあび */
    public InterfaceC0640 mo1791(X509TrustManager x509TrustManager) {
        return new C0637(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: へぬ〴づぞ */
    public X509TrustManager mo1785(SSLSocketFactory sSLSocketFactory) {
        try {
            Object m1801 = m1801(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (m1801 == null) {
                return null;
            }
            return (X509TrustManager) m1801(m1801, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ぺぁあねじ */
    public Object mo1792(String str) {
        if (f4330.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: ぺふねづ〺 */
    public void mo1793(int i, String str, Throwable th) {
        f4330.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }
}
