package dev.epro.r0;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.util.CloseGuard;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W13501784783056305158 extends X4422675003582389573 implements G12005847563586305646 {
    public static final boolean d;
    public Context b;
    public final ArrayList c;

    static {
        d = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W13501784783056305158() {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        ArrayList B0 = O5378677881740157249.B0(new W17944177835232834043[]{i >= 37 ? new V15403875886700419536((byte) 1) : null, i >= 29 ? new V15403875886700419536(0 == true ? 1 : 0) : null, new D3724400017864063475(V6488306180078902881.e), new D3724400017864063475(T3734674749879861389.a), new D3724400017864063475(W8058067029478696854.a)});
        ArrayList arrayList = new ArrayList();
        int size = B0.size();
        while (i2 < size) {
            Object obj = B0.get(i2);
            i2++;
            if (((W17944177835232834043) obj).d()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // dev.epro.r0.G12005847563586305646
    public final void a(Context context) {
        this.b = context;
    }

    @Override // dev.epro.r0.G12005847563586305646
    public final Context b() {
        return this.b;
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final M2066880349381062048 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        J12926241681621720267 j12926241681621720267 = x509TrustManagerExtensions != null ? new J12926241681621720267(x509TrustManager, x509TrustManagerExtensions) : null;
        if (j12926241681621720267 != null) {
            return j12926241681621720267;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new K3446433118769489612(new G4819971007006730851((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final void d(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((W17944177835232834043) obj).b(sSLSocket)) {
                break;
            }
        }
        W17944177835232834043 w17944177835232834043 = (W17944177835232834043) obj;
        if (w17944177835232834043 != null) {
            w17944177835232834043.c(sSLSocket, str, list, p5124777957357031757);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r3 = dev.epro.r0.K5395552668562208334.d(r4).getPublicHostname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r4 = r4.toBytes();
     */
    @Override // dev.epro.r0.X4422675003582389573
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Y5942596939223382942 f(javax.net.ssl.SSLException r4) {
        /*
            r3 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 37
            r1 = 0
            if (r3 < r0) goto L52
            boolean r3 = dev.epro.r0.K5395552668562208334.h(r4)
            if (r3 != 0) goto Le
            goto L52
        Le:
            android.net.ssl.EchConfigMismatchException r3 = dev.epro.r0.K5395552668562208334.d(r4)
            java.lang.String r3 = dev.epro.r0.K5395552668562208334.e(r3)
            if (r3 != 0) goto L19
            goto L52
        L19:
            dev.epro.r0.H5336160545165318150 r0 = dev.epro.r0.Y5942596939223382942.c
            android.net.ssl.EchConfigMismatchException r4 = dev.epro.r0.K5395552668562208334.d(r4)
            android.net.ssl.EchConfigList r4 = dev.epro.r0.K5395552668562208334.b(r4)
            if (r4 == 0) goto L32
            byte[] r4 = dev.epro.r0.K5395552668562208334.i(r4)
            if (r4 == 0) goto L32
            dev.epro.r0.P5124777957357031757 r0 = dev.epro.r0.P5124777957357031757.d
            dev.epro.r0.P5124777957357031757 r4 = dev.epro.r0.J3301701597851028733.y(r4)
            goto L33
        L32:
            r4 = r1
        L33:
            java.lang.String r0 = dev.epro.r0.A4349945402702183291.b(r3)
            if (r0 != 0) goto L3a
            goto L52
        L3a:
            dev.epro.r0.H5336160545165318150 r2 = dev.epro.r0.A4349945402702183291.a
            boolean r2 = r2.f(r0)
            if (r2 == 0) goto L43
            goto L52
        L43:
            dev.epro.r0.H5336160545165318150 r2 = dev.epro.r0.Y5942596939223382942.c
            boolean r0 = r2.f(r0)
            if (r0 == 0) goto L4c
            goto L52
        L4c:
            dev.epro.r0.Y5942596939223382942 r0 = new dev.epro.r0.Y5942596939223382942
            r0.<init>(r4, r3)
            return r0
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W13501784783056305158.f(javax.net.ssl.SSLException):dev.epro.r0.Y5942596939223382942");
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((W17944177835232834043) obj).b(sSLSocket)) {
                break;
            }
        }
        W17944177835232834043 w17944177835232834043 = (W17944177835232834043) obj;
        if (w17944177835232834043 != null) {
            return w17944177835232834043.a(sSLSocket);
        }
        return null;
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            Level level = Level.FINE;
            return null;
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final void k(String str, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            super.k(str, obj);
        } else {
            obj.getClass();
            Q10109392975126564544.h(obj).warnIfOpen();
        }
    }
}
