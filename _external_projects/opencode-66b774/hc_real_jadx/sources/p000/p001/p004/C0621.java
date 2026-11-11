package p000.p001.p004;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p000.EnumC0721;
import p000.p001.C0629;
import p000.p001.p006.AbstractC0638;
import p000.p001.p006.C0637;
import p000.p001.p006.C0639;
import p000.p001.p006.InterfaceC0640;
import p243.C2819;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0621 extends C0626 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C0623 f4314;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C0625<Socket> f4315;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Class<?> f4316;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C0625<Socket> f4317;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C0625<Socket> f4318;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0625<Socket> f4319;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static final class C0622 implements InterfaceC0640 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Method f4320;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final X509TrustManager f4321;

        public C0622(X509TrustManager x509TrustManager, Method method) {
            this.f4320 = method;
            this.f4321 = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0622)) {
                return false;
            }
            C0622 c0622 = (C0622) obj;
            return this.f4321.equals(c0622.f4321) && this.f4320.equals(c0622.f4320);
        }

        public int hashCode() {
            return (this.f4320.hashCode() * 31) + this.f4321.hashCode();
        }

        @Override // p000.p001.p006.InterfaceC0640
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public X509Certificate mo1794(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f4320.invoke(this.f4321, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C0629.m1812("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public static final class C0623 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Method f4322;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Method f4323;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Method f4324;

        public C0623(Method method, Method method2, Method method3) {
            this.f4324 = method;
            this.f4322 = method2;
            this.f4323 = method3;
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0624 extends AbstractC0638 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Method f4325;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Object f4326;

        public C0624(Object obj, Method method) {
            this.f4326 = obj;
            this.f4325 = method;
        }

        public boolean equals(Object obj) {
            return obj instanceof C0624;
        }

        public int hashCode() {
            return 0;
        }

        @Override // p000.p001.p006.AbstractC0638
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public List<Certificate> mo1795(List<Certificate> list, String str) {
            try {
                return (List) this.f4325.invoke(this.f4326, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }
    }

    public C0621(Class<?> cls, C0625<Socket> c0625, C0625<Socket> c06252, C0625<Socket> c06253, C0625<Socket> c06254) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f4314 = new C0623(method3, method2, method);
        this.f4316 = cls;
        this.f4319 = c0625;
        this.f4317 = c06252;
        this.f4318 = c06253;
        this.f4315 = c06254;
    }

    @Override // p000.p001.p004.C0626
    @Nullable
    /* renamed from: 〳ぜぞぜべっ */
    public String mo1781(SSLSocket sSLSocket) {
        byte[] bArr;
        C0625<Socket> c0625 = this.f4318;
        if (c0625 == null) {
            return null;
        }
        if ((c0625.m1798(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f4318.m1799(sSLSocket, new Object[0])) != null) {
            return new String(bArr, C0629.f4354);
        }
        return null;
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean mo1786(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m1787(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw C0629.m1812("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C0629.m1812("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C0629.m1812("unable to determine cleartext support", e);
        }
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final boolean m1787(String str, Class<?> cls, Object obj) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC0638 mo1788(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0624(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new C0639(mo1791(x509TrustManager));
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: づざかべべ */
    public void mo1784(SSLSocket sSLSocket, String str, List<EnumC0721> list) {
        if (str != null) {
            this.f4319.m1797(sSLSocket, Boolean.TRUE);
            this.f4317.m1797(sSLSocket, str);
        }
        C0625<Socket> c0625 = this.f4315;
        if (c0625 != null) {
            if (c0625.m1798(sSLSocket.getClass()) != null) {
                Object[] objArr = new Object[1];
                C2819 c2819 = new C2819();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    EnumC0721 enumC0721 = list.get(i);
                    if (enumC0721 != EnumC0721.HTTP_1_0) {
                        c2819.m4927(enumC0721.f4784.length());
                        c2819.m4916(enumC0721.f4784);
                    }
                }
                objArr[0] = c2819.m4917();
                this.f4315.m1799(sSLSocket, objArr);
            }
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo1789(String str, Object obj) {
        C0623 c0623 = this.f4314;
        c0623.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                c0623.f4323.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        mo1793(5, str, null);
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo1790(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C0629.m1821(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public InterfaceC0640 mo1791(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0622(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new C0637(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: へぬ〴づぞ */
    public X509TrustManager mo1785(SSLSocketFactory sSLSocketFactory) {
        Object m1801 = C0626.m1801(sSLSocketFactory, this.f4316, "sslParameters");
        if (m1801 == null) {
            try {
                m1801 = C0626.m1801(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.mo1785(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) C0626.m1801(m1801, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) C0626.m1801(m1801, X509TrustManager.class, "trustManager");
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Object mo1792(String str) {
        C0623 c0623 = this.f4314;
        Method method = c0623.f4324;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            c0623.f4322.invoke(invoke, str);
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo1793(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }
}
