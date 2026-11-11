package p000.p001.p004;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p000.EnumC0721;
import p000.p001.C0629;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0620 extends C0626 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Method f4312;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Method f4313;

    public C0620(Method method, Method method2) {
        this.f4312 = method;
        this.f4313 = method2;
    }

    @Override // p000.p001.p004.C0626
    @Nullable
    /* renamed from: 〳ぜぞぜべっ */
    public String mo1781(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f4313.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0629.m1812("unable to get selected protocols", e);
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: づざかべべ */
    public void mo1784(SSLSocket sSLSocket, String str, List<EnumC0721> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = (ArrayList) C0626.m1800(list);
            this.f4312.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0629.m1812("unable to set ssl parameters", e);
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: へぬ〴づぞ */
    public X509TrustManager mo1785(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
