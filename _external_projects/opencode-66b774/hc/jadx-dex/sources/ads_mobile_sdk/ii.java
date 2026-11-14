package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ii implements dev.epro.r0.P7827270438547540384, dev.epro.r0.K3711868874634114208 {
    public static ads_mobile_sdk.ii c;
    public java.lang.Object a;
    public java.lang.Object b;

    public ii(android.content.Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public void a(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        boolean zCommit;
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.b;
        if (obj instanceof java.lang.String) {
            zCommit = sharedPreferences.edit().putString(str, (java.lang.String) obj).commit();
        } else if (obj instanceof java.lang.Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((java.lang.Long) obj).longValue()).commit();
        } else if (obj instanceof java.lang.Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((java.lang.Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof java.lang.Integer)) {
                obj.getClass().toString();
                java.lang.StringBuilder sbG = dev.epro.r0.X2485016533998461232.g("Failed to store ", str, " for app ");
                sbG.append((java.lang.String) this.a);
                throw new java.io.IOException(sbG.toString());
            }
            zCommit = sharedPreferences.edit().putInt(str, ((java.lang.Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        java.lang.StringBuilder sbG2 = dev.epro.r0.X2485016533998461232.g("Failed to store ", str, " for app ");
        sbG2.append((java.lang.String) this.a);
        throw new java.io.IOException(sbG2.toString());
    }

    public java.lang.Object b(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        if (!((java.util.concurrent.atomic.AtomicBoolean) this.b).getAndSet(true)) {
            ads_mobile_sdk.ql1 ql1Var = ((ads_mobile_sdk.xj) this.a).a;
            ql1Var.c = ql1Var.b.decrementAndGet();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public java.lang.Object getValue(java.lang.Object obj, dev.epro.r0.D15596191924284547207 d15596191924284547207) {
        java.lang.Object obj2;
        obj.getClass();
        d15596191924284547207.getClass();
        synchronized (this) {
            obj2 = this.b;
        }
        return obj2;
    }

    public void onComplete(dev.epro.r0.S14461012662136963693 s14461012662136963693) {
        if (s14461012662136963693.d()) {
            dev.epro.r0.R122968600551594484 r122968600551594484 = (dev.epro.r0.R122968600551594484) s14461012662136963693.c();
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            ((ads_mobile_sdk.ji) this.a).c.getClass();
            ((dev.epro.r0.H7219028874700587498) this.b).resumeWith(new ads_mobile_sdk.xu0(new ads_mobile_sdk.uq(r122968600551594484, dev.epro.r0.M9216324016624295870.a0(android.os.SystemClock.elapsedRealtime(), dev.epro.r0.N13798149404328803870.d))));
            return;
        }
        if (s14461012662136963693.d) {
            ((ads_mobile_sdk.ji) this.a).b.a("AppSet Id task was cancelled", (java.lang.Throwable) new java.util.concurrent.CancellationException("AppSet Id task was cancelled"));
            ((dev.epro.r0.H7219028874700587498) this.b).resumeWith(new ads_mobile_sdk.tu0("Gms Task for getting AppSetId was cancelled", 1));
            return;
        }
        java.lang.Exception excB = s14461012662136963693.b();
        if (excB == null) {
            excB = new java.lang.Exception("AppSet Id task wasn't successful or cancelled, but had no exception.");
        }
        ((ads_mobile_sdk.ji) this.a).b.a("Task failed while getting AppSet Id", (java.lang.Throwable) excB);
        ((dev.epro.r0.H7219028874700587498) this.b).resumeWith(new ads_mobile_sdk.qu0(excB, 0, null, 6));
    }

    public void setValue(java.lang.Object obj, dev.epro.r0.D15596191924284547207 d15596191924284547207, java.lang.Object obj2) {
        obj.getClass();
        d15596191924284547207.getClass();
        synchronized (this) {
            this.b = obj2;
            dev.epro.r0.F4096073349764486348 f4096073349764486348 = (dev.epro.r0.F4096073349764486348) this.a;
            if (f4096073349764486348 != null) {
                f4096073349764486348.invoke(obj2);
            }
        }
    }

    public /* synthetic */ ii(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ii(android.webkit.WebView webView, dev.epro.r0.A6650193808056408155 a6650193808056408155) {
        if (webView != null) {
            this.a = webView;
            this.b = a6650193808056408155;
        } else {
            dev.epro.r0.S10973172697741180971.j("WebView is null");
            throw null;
        }
    }

    public ii(int i, int i2) {
        this.a = dev.epro.r0.O14838623545224379975.j(i);
        this.b = dev.epro.r0.O14838623545224379975.j(i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m8a() {
        android.webkit.WebView webView = (android.webkit.WebView) this.a;
        dev.epro.r0.A6650193808056408155 a6650193808056408155 = (dev.epro.r0.A6650193808056408155) this.b;
        try {
            if (!dev.epro.r0.Q6344330807969154194.b(androidx.webkit.WebViewFeature.WEB_MESSAGE_LISTENER)) {
                a6650193808056408155.b();
                return;
            }
            try {
                androidx.webkit.WebViewCompat.removeWebMessageListener(webView, a6650193808056408155.a());
                androidx.webkit.WebViewCompat.addWebMessageListener(webView, a6650193808056408155.a(), new java.util.HashSet(java.util.Arrays.asList("*")), new ads_mobile_sdk.c7((java.lang.Object) this, (byte) 23));
            } catch (java.lang.Exception unused) {
                a6650193808056408155.b();
            }
        } catch (java.lang.NoClassDefFoundError unused2) {
            a6650193808056408155.b();
        }
    }

    public void a(dev.epro.r0.V2597580950516131749 v2597580950516131749) {
        ((java.util.List) this.a).add(v2597580950516131749);
    }

    public ads_mobile_sdk.r33 a() {
        return new ads_mobile_sdk.r33((java.util.List) this.a, (java.util.List) this.b);
    }

    public static ads_mobile_sdk.ii a(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (!android.text.TextUtils.isEmpty(str2)) {
                return new ads_mobile_sdk.ii(str, str2);
            }
            dev.epro.r0.S10973172697741180971.j("Version is null or empty");
            return null;
        }
        dev.epro.r0.S10973172697741180971.j("Name is null or empty");
        return null;
    }

    public void a(java.lang.String str) throws java.io.IOException {
        if (((android.content.SharedPreferences) this.b).edit().remove(str).commit()) {
            return;
        }
        java.lang.StringBuilder sbG = dev.epro.r0.X2485016533998461232.g("Failed to remove ", str, " for app ");
        sbG.append((java.lang.String) this.a);
        throw new java.io.IOException(sbG.toString());
    }
}
