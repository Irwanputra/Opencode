package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H2607093550274855851;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.X2485016533998461232;
import dev.epro.r0.X7410747940286448830;
import dev.epro.r0.Z1953481206310471956;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class um0 {
    public final Context a;
    public final ci3 b;
    public final kz2 c;
    public final jr0 d;
    public final O12494175665883759871 e;
    public final H15186625828076266306 f;
    public String g;

    public um0(Context context, ci3 ci3Var, kz2 kz2Var, jr0 jr0Var) {
        context.getClass();
        ci3Var.getClass();
        kz2Var.getClass();
        jr0Var.getClass();
        this.a = context;
        this.b = ci3Var;
        this.c = kz2Var;
        this.d = jr0Var;
        this.e = new O12494175665883759871(new H2607093550274855851(this, (byte) 9));
        this.f = new H15186625828076266306();
    }

    public static void a(um0 um0Var, int i, Bundle bundle, String str) {
        kz2 kz2Var = um0Var.c;
        wv0 wv0Var = wv0.CUI_NAME_LOG_EVENT_TO_FIREBASE_ANALYTICS;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        mi3 a = X7410747940286448830.a();
        if (ji3.b().a == null) {
            em2 a2 = kz2.a(kz2Var, wv0Var, o2161699089510411363, a);
            try {
                try {
                    if (um0Var.e.getValue() != null) {
                        Method method = Class.forName(um0Var.d.Q()).getMethod("logEvent", String.class, String.class, Bundle.class);
                        Bundle bundle2 = bundle.getBundle(X2485016533998461232.a(i));
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putLong("_aeid", Long.parseLong(str));
                        if (X2485016533998461232.a(i).equals("_ac")) {
                            bundle2.putInt("_r", 1);
                        }
                        method.invoke(um0Var.e.getValue(), "am", X2485016533998461232.a(i), bundle2);
                    }
                } catch (Exception e) {
                    zi3.a(4, "Exception while calling Firebase Analytics SDK logEvent method", e);
                    um0Var.b.a("FirebaseAnalyticsAdapter.invokeMethod logEvent for ".concat(X2485016533998461232.l(i)), (Throwable) e);
                }
                a2.close();
                return;
            } catch (Throwable th) {
                try {
                    a2.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        a2.a(th);
                    }
                    if (th instanceof P2480554073835519965) {
                        throw new lw0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new du0(th);
                    }
                    if (!(th instanceof dv0)) {
                        throw new iu0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        Z1953481206310471956.z(a2, th2);
                        throw th3;
                    }
                }
            }
        }
        th3 a3 = ji3.a(wv0Var, o2161699089510411363, true);
        try {
            try {
                if (um0Var.e.getValue() != null) {
                    Method method2 = Class.forName(um0Var.d.Q()).getMethod("logEvent", String.class, String.class, Bundle.class);
                    Bundle bundle3 = bundle.getBundle(X2485016533998461232.a(i));
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putLong("_aeid", Long.parseLong(str));
                    if (X2485016533998461232.a(i).equals("_ac")) {
                        bundle3.putInt("_r", 1);
                    }
                    method2.invoke(um0Var.e.getValue(), "am", X2485016533998461232.a(i), bundle3);
                }
            } catch (Exception e2) {
                zi3.a(4, "Exception while calling Firebase Analytics SDK logEvent method", e2);
                um0Var.b.a("FirebaseAnalyticsAdapter.invokeMethod logEvent for ".concat(X2485016533998461232.l(i)), (Throwable) e2);
            }
            a3.close();
        } catch (Throwable th4) {
            try {
                a3.b(th4);
                if (th4 instanceof N340633841638932414) {
                    throw th4;
                }
                if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                    a3.a(th4);
                }
                if (th4 instanceof P2480554073835519965) {
                    throw new lw0(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new du0(th4);
                }
                if (!(th4 instanceof dv0)) {
                    throw new iu0(th4);
                }
                throw th4;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    Z1953481206310471956.z(a3, th5);
                    throw th6;
                }
            }
        }
    }

    public final Object a(String str) {
        O12494175665883759871 o12494175665883759871 = this.e;
        try {
            if (o12494175665883759871.getValue() != null) {
                return Class.forName(this.d.Q()).getMethod(str, null).invoke(o12494175665883759871.getValue(), null);
            }
            return null;
        } catch (Exception e) {
            zi3.a(4, "Exception while calling Firebase Analytics SDK method", e);
            this.b.a("FirebaseAnalyticsAdapter.invokeMethod ".concat(str), (Throwable) e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x0046, B:17:0x004b, B:19:0x0053, B:20:0x005b), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.um0 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.tm0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.tm0 r0 = (ads_mobile_sdk.tm0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.tm0 r0 = new ads_mobile_sdk.tm0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.um0 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.f
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            java.lang.String r0 = r4.g     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L4b
            goto L5d
        L4b:
            java.lang.String r0 = "getGmpAppId"
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L58
            goto L5b
        L58:
            r4 = move-exception
            goto L61
        L5a:
            r0 = r3
        L5b:
            r4.g = r0     // Catch: java.lang.Throwable -> L58
        L5d:
            r5.b(r3)
            return r0
        L61:
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.um0.a(ads_mobile_sdk.um0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
