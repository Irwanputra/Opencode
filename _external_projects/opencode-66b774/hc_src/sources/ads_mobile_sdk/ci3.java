package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.N12893830608069839869;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.U2722688686349128662;
import dev.epro.r0.X9852054718446117252;
import dev.epro.r0.Z13168519540281190457;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ci3 {
    public final Context a;
    public final jr0 b;
    public final O16637889491137121389 c;
    public final oi3 d;
    public final dl0 e;
    public final b41 f;
    public final String g;
    public final String h;
    public final A8094652504661216977 i;
    public final fi0 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public Map f20o;
    public boolean p;
    public int q;
    public final HashSet r;

    public ci3(Context context, jr0 jr0Var, O16637889491137121389 o16637889491137121389, oi3 oi3Var, dl0 dl0Var, b41 b41Var, String str, String str2, A8094652504661216977 a8094652504661216977, fi0 fi0Var) {
        context.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        oi3Var.getClass();
        dl0Var.getClass();
        b41Var.getClass();
        str.getClass();
        str2.getClass();
        a8094652504661216977.getClass();
        fi0Var.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = o16637889491137121389;
        this.d = oi3Var;
        this.e = dl0Var;
        this.f = b41Var;
        this.g = str;
        this.h = str2;
        this.i = a8094652504661216977;
        this.j = fi0Var;
        this.f20o = X9852054718446117252.a;
        this.r = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(dev.epro.r0.W5797197595347441198 r23) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ci3.a(dev.epro.r0.W5797197595347441198):void");
    }

    public final void b(Throwable th) {
        th.getClass();
        byte b = 1;
        if (this.m) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                stackTrace.getClass();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (Z13168519540281190457.F(className, "com.google.android.libraries.ads.mobile.sdk", false)) {
                        z = true;
                    }
                    if (S10823041268949770285.t(stackTraceElement.getClassName(), ci3.class.getName()) || S10823041268949770285.t(stackTraceElement.getClassName(), dl0.class.getName())) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z && !z2) {
                this.c.getClass();
                this.e.a(new fl0(th, "UNTRAPPED_EXCEPTION", null, false, System.currentTimeMillis(), -1, false));
            }
        }
        J8045362843799184672.r0(U2722688686349128662.b, new N12893830608069839869(this, null, b));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ci3 r4, java.lang.String r5, dev.epro.r0.W6980246436852868685 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.vh3
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.vh3 r0 = (ads_mobile_sdk.vh3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.vh3 r0 = new ads_mobile_sdk.vh3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.lang.String r5 = r0.b
            ads_mobile_sdk.ci3 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)     // Catch: java.lang.Exception -> L2a
            return r7
        L2a:
            r6 = move-exception
            goto L45
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L32:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r4     // Catch: java.lang.Exception -> L2a
            r0.b = r5     // Catch: java.lang.Exception -> L2a
            r0.e = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r4 = r6.invoke(r0)     // Catch: java.lang.Exception -> L2a
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L44
            return r5
        L44:
            return r4
        L45:
            r4.a(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ci3.a(ads_mobile_sdk.ci3, java.lang.String, dev.epro.r0.W6980246436852868685, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void a(Throwable th) {
        if (this.p) {
            Throwable j = U1554499319261669842.j(th);
            boolean z = false;
            while (j != null) {
                StackTraceElement[] stackTrace = j.getStackTrace();
                stackTrace.getClass();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (ci3.class.getName().equals(stackTraceElement.getClassName())) {
                        return;
                    }
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    jr0 jr0Var = this.b;
                    jr0Var.getClass();
                    List list = (List) jr0Var.a("gads:uncaught_exception_handler_prefix", K5751602218013079365.V("com.google", "ads_mobile_sdk", "org.chromium", "android.webkit"), ao.a$23);
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Z13168519540281190457.F(className, (String) it.next(), false)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                Throwable cause = j.getCause();
                j = cause != null ? U1554499319261669842.j(cause) : null;
            }
            if (z) {
                if (this.q > 0) {
                    HashSet hashSet = this.r;
                    if (hashSet.size() >= this.q) {
                        return;
                    }
                    U1554499319261669842.j(th).getClass();
                    StringWriter stringWriter = new StringWriter();
                    new PrintWriter(stringWriter);
                    String stringWriter2 = stringWriter.toString();
                    stringWriter2.getClass();
                    String i = U1554499319261669842.i(stringWriter2);
                    if (i == null) {
                        i = "";
                    }
                    if (hashSet.contains(i)) {
                        return;
                    } else {
                        hashSet.add(i);
                    }
                }
                b(th);
            }
        }
    }

    public final void a(String str, Throwable th) {
        str.getClass();
        if (this.l) {
            dl0 dl0Var = this.e;
            th3 th3Var = ji3.b().a;
            mi3 mi3Var = th3Var != null ? th3Var.a : null;
            this.c.getClass();
            dl0Var.a(new fl0(th, str, mi3Var, true, System.currentTimeMillis(), -1, false));
        }
    }

    public final void a(String str, Exception exc) {
        dl0 dl0Var = this.e;
        th3 th3Var = ji3.b().a;
        mi3 mi3Var = th3Var != null ? th3Var.a : null;
        this.c.getClass();
        dl0Var.a(new fl0(exc, str, mi3Var, true, System.currentTimeMillis(), -1, true));
    }
}
