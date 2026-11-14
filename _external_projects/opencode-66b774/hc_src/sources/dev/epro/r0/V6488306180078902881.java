package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class V6488306180078902881 implements W17944177835232834043 {
    public static final J3301701597851028733 e = new J3301701597851028733(0);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public V6488306180078902881(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final String a(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, F16059529287866721367.a);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !S10823041268949770285.t(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e3);
                }
            }
        }
        return null;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final void c(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
                method.invoke(sSLSocket, J3301701597851028733.r(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean d() {
        boolean z = U14277333103553537283.d;
        return U14277333103553537283.d;
    }
}
