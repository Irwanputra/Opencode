package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;
import dev.epro.r0.D16457379462628768197;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H14305894327539119220;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.I3887072968740112330;
import dev.epro.r0.J10770752472956524045;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.Y12917327898100101934;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class e80 extends I3887072968740112330 {
    public final W5797197595347441198 a;
    public final O16637889491137121389 b;
    public final jr0 c;
    public final Object e;
    public boolean f;
    public X7175349259954592591 g;
    public long h;
    public long i;
    public final P16422848101170923038 m;
    public final List n;

    public e80(W5797197595347441198 w5797197595347441198, O16637889491137121389 o16637889491137121389, jr0 jr0Var, n53 n53Var) {
        P16422848101170923038 p16422848101170923038;
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        jr0Var.getClass();
        n53Var.getClass();
        this.a = w5797197595347441198;
        this.b = o16637889491137121389;
        this.c = jr0Var;
        this.e = new Object();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.h = 0L;
        this.i = 0L;
        try {
            p16422848101170923038 = (P16422848101170923038) new F14240031463097426304().b(P16422848101170923038.class, (String) jr0Var.a("gads:pact_active_exp_id:enabled", "[]", ao.a$6));
        } catch (Exception e) {
            zi3.a(e);
            p16422848101170923038 = null;
        }
        this.m = p16422848101170923038 == null ? new P16422848101170923038() : p16422848101170923038;
        jr0 jr0Var2 = this.c;
        jr0Var2.getClass();
        this.n = (List) jr0Var2.a("gads:pact_navigation_event_to_request_channel", K5751602218013079365.U("1"), ao.a$23);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ads_mobile_sdk.e80 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.y70
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.y70 r0 = (ads_mobile_sdk.y70) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.y70 r0 = new ads_mobile_sdk.y70
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r0 = r0.d
            r1 = 0
            if (r0 == 0) goto L2c
            r6 = 1
            if (r0 == r6) goto L28
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return
        L28:
            dev.epro.r0.E17665849472693074628.k(r7)
            throw r1
        L2c:
            dev.epro.r0.E17665849472693074628.k(r7)
            java.lang.Object r7 = r6.e
            monitor-enter(r7)
            boolean r0 = r6.f     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L58
            dev.epro.r0.E17149812035295265804 r0 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Throwable -> L56
            dev.epro.r0.O16637889491137121389 r0 = r6.b     // Catch: java.lang.Throwable -> L56
            r0.getClass()     // Catch: java.lang.Throwable -> L56
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L56
            dev.epro.r0.N13798149404328803870 r0 = dev.epro.r0.N13798149404328803870.MILLISECONDS     // Catch: java.lang.Throwable -> L56
            long r2 = dev.epro.r0.M9216324016624295870.a0(r2, r0)     // Catch: java.lang.Throwable -> L56
            long r4 = r6.i     // Catch: java.lang.Throwable -> L56
            int r6 = dev.epro.r0.E17093345031926825464.c(r2, r4)     // Catch: java.lang.Throwable -> L56
            if (r6 <= 0) goto L50
            goto L58
        L50:
            java.lang.String r6 = "session"
            dev.epro.r0.S10823041268949770285.b0(r6)     // Catch: java.lang.Throwable -> L56
            throw r1     // Catch: java.lang.Throwable -> L56
        L56:
            r6 = move-exception
            goto L5a
        L58:
            monitor-exit(r7)
            return
        L5a:
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e80.a(ads_mobile_sdk.e80, dev.epro.r0.K14749510448791472029):void");
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void extraCallback(String str) {
        str.getClass();
        synchronized (this.e) {
        }
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void extraCallbackWithResult(String str) {
        str.getClass();
        synchronized (this.e) {
        }
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void onActivityResized(Bundle bundle) {
        bundle.getClass();
        try {
            synchronized (this.e) {
            }
        } catch (Throwable unused) {
        }
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void onMessageChannelReady() {
        synchronized (this.e) {
            this.f = false;
        }
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void onNavigationEvent(int i) {
        long j;
        synchronized (this.e) {
            try {
                this.f = false;
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                this.b.getClass();
                this.h = M9216324016624295870.a0(System.currentTimeMillis(), N13798149404328803870.MILLISECONDS);
                if (this.n.contains(String.valueOf(i))) {
                    long j2 = this.h;
                    jr0 jr0Var = this.c;
                    jr0Var.getClass();
                    if (((Boolean) jr0Var.a("gads:pact_polling_forever:enabled", Boolean.FALSE, ao.a$11)).booleanValue()) {
                        j = E17093345031926825464.c;
                    } else {
                        jr0 jr0Var2 = this.c;
                        jr0Var2.getClass();
                        j = ((E17093345031926825464) jr0Var2.a("gads:pact_polling_duration_ms", new E17093345031926825464(M9216324016624295870.Z(60, N13798149404328803870.SECONDS)), ao.a)).a;
                    }
                    this.i = E17093345031926825464.h(j2, j);
                    X7175349259954592591 x7175349259954592591 = this.g;
                    if (x7175349259954592591 == null || x7175349259954592591.p()) {
                        W5797197595347441198 w5797197595347441198 = this.a;
                        N4024785987441166868 n4024785987441166868 = new N4024785987441166868(this, null, (byte) 3);
                        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
                        w5797197595347441198.getClass();
                        this.g = R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(n4024785987441166868, null, (byte) 1), 2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void onPostMessage(String str) {
        I16631908410500040363 i16631908410500040363;
        str.getClass();
        try {
            i16631908410500040363 = (I16631908410500040363) new F14240031463097426304().b(I16631908410500040363.class, str);
        } catch (Exception e) {
            ArrayList arrayList = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            i16631908410500040363 = null;
        }
        if (i16631908410500040363 == null || d62.a(i16631908410500040363, "gpa", -1) != 0) {
            synchronized (this.e) {
            }
            return;
        }
        synchronized (this.e) {
            this.f = true;
        }
        d62.a(i16631908410500040363, "paw_id", "");
        synchronized (this.e) {
            J10770752472956524045 j10770752472956524045 = H14305894327539119220.i;
            H14305894327539119220 h14305894327539119220 = new H14305894327539119220(false);
            Object obj = this.m;
            if (obj == null) {
                obj = Y12917327898100101934.a;
            }
            h14305894327539119220.put("eids", obj);
            h14305894327539119220.put("gsppack", new D16457379462628768197(Boolean.TRUE));
            String valueOf = String.valueOf(E17093345031926825464.e(this.h));
            h14305894327539119220.put("fpt", valueOf == null ? Y12917327898100101934.a : new D16457379462628768197(valueOf));
            S10823041268949770285.b0("session");
            throw null;
        }
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void onRelationshipValidationResult(Uri uri) {
        uri.getClass();
        synchronized (this.e) {
        }
    }
}
