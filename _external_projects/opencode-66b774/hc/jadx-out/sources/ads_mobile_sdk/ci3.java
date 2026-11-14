package ads_mobile_sdk;

import ads_mobile_sdk.ci3;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.C1290752467339106930;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.K9808832422180718119;
import dev.epro.r0.N12893830608069839869;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O17574792317020433029;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T9511376708243583971;
import dev.epro.r0.U12539945048130217525;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.U2722688686349128662;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X2485016533998461232;
import dev.epro.r0.X9852054718446117252;
import dev.epro.r0.Z13168519540281190457;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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

    public final void a(W5797197595347441198 w5797197595347441198) {
        String str;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo packageInfo;
        ao aoVar = ao.a$14;
        Double dValueOf = Double.valueOf(0.1d);
        Double dValueOf2 = Double.valueOf(0.03d);
        w5797197595347441198.getClass();
        fi0 fi0Var = this.j;
        fi0Var.b();
        xv.a = this;
        jr0 jr0Var = this.b;
        Integer numC = O17574792317020433029.c(jr0Var, "gads:max_duplicate_crash:amount", 10);
        P10813970601447104553 p10813970601447104553 = (P10813970601447104553) jr0Var.a;
        this.q = ((Number) jr0Var.a("gads:max_duplicate_crash:amount", numC, ao.a$18)).intValue();
        Context context = this.a;
        String packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (packageManager2 == null || (packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 128)) == null || (str = packageInfo.versionName) == null) {
            str = "";
        }
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) ? null : bundle.getString("com.google.unity.ads.UNITY_VERSION");
        T9511376708243583971 t9511376708243583971O = ew0.o();
        t9511376708243583971O.getClass();
        t9511376708243583971O.b();
        ew0 ew0Var = (ew0) t9511376708243583971O.b;
        ew0Var.getClass();
        ew0Var.os_ = 1;
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).q();
        String str3 = Build.MODEL;
        str3.getClass();
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).l(str3);
        int i = Build.VERSION.SDK_INT;
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).targetVersion_ = i;
        String str4 = this.g;
        str4.getClass();
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).z(str4);
        String str5 = this.h;
        str5.getClass();
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).h(str5);
        packageName.getClass();
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).e(packageName);
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).f(str);
        String country = Locale.getDefault().getCountry();
        country.getClass();
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).j(country);
        b41 b41Var = this.f;
        b41Var.a();
        Object obj = fi0Var.b.get();
        obj.getClass();
        t9511376708243583971O.b();
        ew0 ew0Var2 = (ew0) t9511376708243583971O.b;
        ew0Var2.getClass();
        ew0Var2.deviceAdvertisedMemTier_ = ((ph0) obj).getNumber();
        Object obj2 = fi0Var.c.get();
        obj2.getClass();
        t9511376708243583971O.b();
        ew0 ew0Var3 = (ew0) t9511376708243583971O.b;
        ew0Var3.getClass();
        ew0Var3.deviceAvailableProcessorTier_ = ((rh0) obj2).getNumber();
        qh0 qh0VarA = fi0Var.a();
        qh0VarA.getClass();
        t9511376708243583971O.b();
        ew0 ew0Var4 = (ew0) t9511376708243583971O.b;
        ew0Var4.getClass();
        ew0Var4.deviceAvailableMemoryTier_ = qh0VarA.getNumber();
        boolean z = ((dr0) p10813970601447104553).r;
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).isFirstSessionAfterInstall_ = z;
        boolean z2 = ((dr0) p10813970601447104553).p;
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).hadCachedFlags_ = z2;
        boolean z3 = ((dr0) p10813970601447104553).q;
        t9511376708243583971O.b();
        ((ew0) t9511376708243583971O.b).wereCachedFlagsReset_ = z3;
        if (string != null) {
            t9511376708243583971O.b();
            ((ew0) t9511376708243583971O.b).E(string);
        }
        ew0 ew0Var5 = (ew0) t9511376708243583971O.a();
        K9808832422180718119 k9808832422180718119P = kv0.p();
        k9808832422180718119P.getClass();
        k9808832422180718119P.b();
        kv0 kv0Var = (kv0) k9808832422180718119P.b;
        kv0Var.getClass();
        kv0Var.os_ = X2485016533998461232.c(2);
        str2.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).p$1();
        str3.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).j(str3);
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).targetVersion_ = i;
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).t(str5);
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).d(str4);
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).f(packageName);
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).g(str);
        String country2 = Locale.getDefault().getCountry();
        country2.getClass();
        k9808832422180718119P.b();
        ((kv0) k9808832422180718119P.b).i(country2);
        if (string != null) {
            k9808832422180718119P.b();
            ((kv0) k9808832422180718119P.b).y(string);
        }
        b41Var.a();
        kv0 kv0Var2 = (kv0) k9808832422180718119P.a();
        U12539945048130217525 u12539945048130217525 = C1290752467339106930.b;
        this.k = u12539945048130217525.d() < ((Number) jr0Var.a("gads:cui_monitoring_session_sample_rate", dValueOf2, aoVar)).doubleValue();
        this.l = u12539945048130217525.d() < ((Number) jr0Var.a("gads:trapped_exception_monitoring_session_sample_rate", dValueOf2, aoVar)).doubleValue();
        this.m = u12539945048130217525.d() < ((Number) jr0Var.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf, aoVar)).doubleValue();
        this.n = u12539945048130217525.d() < ((Number) jr0Var.a("gads:cui_monitoring_trace_failure_stacktrace_rate", Double.valueOf(0.01d), aoVar)).doubleValue();
        Map mapL0 = jr0Var.l0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(E4951175994894594588.u0(mapL0.size()));
        for (Map.Entry entry : mapL0.entrySet()) {
            linkedHashMap.put(entry.getKey(), Boolean.valueOf(C1290752467339106930.b.d() < ((Number) entry.getValue()).doubleValue()));
        }
        this.f20o = linkedHashMap;
        hs hsVar = (hs) this.i.get();
        double dDoubleValue = ((Number) jr0Var.a("gads:cui_monitoring_session_sample_rate", dValueOf2, aoVar)).doubleValue();
        oi3 oi3Var = this.d;
        oi3Var.l = dDoubleValue;
        oi3Var.m = jr0Var.l0();
        hsVar.getClass();
        oi3Var.a(w5797197595347441198, ew0Var5, hsVar);
        dl0 dl0Var = this.e;
        dl0Var.getClass();
        jr0 jr0Var2 = dl0Var.c;
        jr0Var2.getClass();
        if (((Number) jr0Var2.a("gads:trapped_exception_monitoring_session_sample_rate", dValueOf2, aoVar)).doubleValue() > 0.0d) {
            dl0Var.l = (long) (1.0d / ((Number) jr0Var2.a("gads:trapped_exception_monitoring_session_sample_rate", dValueOf2, aoVar)).doubleValue());
        }
        if (((Number) jr0Var2.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf, aoVar)).doubleValue() > 0.0d) {
            dl0Var.m = (long) (1.0d / ((Number) jr0Var2.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf, aoVar)).doubleValue());
        }
        dl0Var.a(w5797197595347441198, kv0Var2, hsVar);
        b41Var.a();
        boolean zBooleanValue = ((Boolean) jr0Var.a("gads:uncaught_exception_handler", Boolean.FALSE, ao.a$11)).booleanValue();
        this.p = zBooleanValue;
        if (zBooleanValue) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: dev.epro.r0.Z7841511883603133531
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    ci3 ci3Var = this.a;
                    ci3Var.getClass();
                    try {
                        th.getClass();
                        ci3Var.a(th);
                        if (uncaughtExceptionHandler == null) {
                            return;
                        }
                    } catch (Throwable unused2) {
                        if (uncaughtExceptionHandler == null) {
                            return;
                        }
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
            Thread thread = Looper.getMainLooper().getThread();
            thread.getClass();
            thread.setUncaughtExceptionHandler(new xh3(this, thread.getUncaughtExceptionHandler()));
        }
    }

    public final void b(Throwable th) throws Throwable {
        th.getClass();
        byte b = 1;
        if (this.m) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                StackTraceElement[] stackTrace = cause.getStackTrace();
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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

    public final void a(Throwable th) throws Throwable {
        if (this.p) {
            Throwable thJ = U1554499319261669842.j(th);
            boolean z = false;
            while (thJ != null) {
                StackTraceElement[] stackTrace = thJ.getStackTrace();
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
                Throwable cause = thJ.getCause();
                thJ = cause != null ? U1554499319261669842.j(cause) : null;
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
                    String string = stringWriter.toString();
                    string.getClass();
                    String strI = U1554499319261669842.i(string);
                    if (strI == null) {
                        strI = "";
                    }
                    if (hashSet.contains(strI)) {
                        return;
                    } else {
                        hashSet.add(strI);
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
