package ads_mobile_sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.L14793767707362067090;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.W5797197595347441198;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class q22 {
    public final Context a;
    public final W5797197595347441198 b;
    public final O16637889491137121389 c;
    public final ci3 d;
    public final Set e;
    public ConnectivityManager f;
    public L14793767707362067090 g;
    public final H15186625828076266306 h;
    public boolean i;
    public long j;
    public ce3 k;
    public final AtomicBoolean l;
    public final AtomicInteger m;
    public final AtomicInteger n;

    public q22(Context context, W5797197595347441198 w5797197595347441198, O16637889491137121389 o16637889491137121389, ci3 ci3Var, Set set) {
        context.getClass();
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        ci3Var.getClass();
        set.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = o16637889491137121389;
        this.d = ci3Var;
        this.e = set;
        this.h = new H15186625828076266306();
        this.i = true;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.j = E17093345031926825464.g(0L, M9216324016624295870.Z(1, N13798149404328803870.SECONDS));
        this.l = new AtomicBoolean(true);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0159 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d A[Catch: all -> 0x0182, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0182, blocks: (B:61:0x0151, B:65:0x015d, B:69:0x0177), top: B:102:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:78:0x019d, B:80:0x01ad, B:84:0x01b3, B:86:0x01bc, B:88:0x01c0), top: B:100:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:78:0x019d, B:80:0x01ad, B:84:0x01b3, B:86:0x01bc, B:88:0x01c0), top: B:100:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4 A[LOOP:0: B:91:0x01ce->B:93:0x01d4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r26, android.net.Network r28, android.net.NetworkCapabilities r29, boolean r30, dev.epro.r0.K14749510448791472029 r31) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q22.a(long, android.net.Network, android.net.NetworkCapabilities, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q22.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ads_mobile_sdk.c22
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.c22 r0 = (ads_mobile_sdk.c22) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.c22 r0 = new ads_mobile_sdk.c22
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r11 = r0.b
            ads_mobile_sdk.q22 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r12)
            r12 = r11
            r11 = r0
            goto L46
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r12)
            r0.a = r11
            dev.epro.r0.H15186625828076266306 r12 = r11.h
            r0.b = r12
            r0.e = r2
            java.lang.Object r0 = r12.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.ce3 r0 = r11.k     // Catch: java.lang.Throwable -> L96
            android.content.Context r11 = r11.a
            r12.b(r3)
            if (r0 != 0) goto L95
            ads_mobile_sdk.ce3 r4 = new ads_mobile_sdk.ce3
            r11.getClass()
            java.lang.Class<android.telephony.TelephonyManager> r12 = android.telephony.TelephonyManager.class
            java.lang.Object r0 = r11.getSystemService(r12)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r5 = r0.getNetworkOperator()
            r5.getClass()
            int r6 = dev.epro.r0.J10256772239794345968.b(r11, r3)
            int r7 = dev.epro.r0.J10256772239794345968.f(r11)
            java.lang.Object r12 = r11.getSystemService(r12)
            android.telephony.TelephonyManager r12 = (android.telephony.TelephonyManager) r12
            int r8 = r12.getPhoneType()
            java.lang.String r12 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r12 = dev.epro.r0.J10256772239794345968.c(r11, r12)
            if (r12 == 0) goto L8b
            java.lang.Class<android.net.ConnectivityManager> r12 = android.net.ConnectivityManager.class
            java.lang.Object r12 = r11.getSystemService(r12)
            android.net.ConnectivityManager r12 = (android.net.ConnectivityManager) r12
            boolean r12 = r12.isActiveNetworkMetered()
        L89:
            r9 = r12
            goto L8d
        L8b:
            r12 = 0
            goto L89
        L8d:
            int r10 = dev.epro.r0.J10256772239794345968.a(r11)
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L95:
            return r0
        L96:
            r0 = move-exception
            r11 = r0
            r12.b(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q22.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
