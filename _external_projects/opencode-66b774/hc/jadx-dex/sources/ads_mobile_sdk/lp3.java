package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class lp3 {
    public static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(true);
    public static final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(true);
    public static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(true);
    public static final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(true);

    public static void a(android.content.Context context, java.util.concurrent.Executor executor, boolean z, java.util.Set set, ads_mobile_sdk.gq3 gq3Var) {
        context.getClass();
        if (!a.compareAndSet(false, true)) {
            if (gq3Var != null) {
                gq3Var.a.resumeWith(new ads_mobile_sdk.xu0(new dev.epro.r0.H5857976276688519753()));
                return;
            }
            return;
        }
        try {
            androidx.webkit.WebViewStartUpConfig.Builder builder = new androidx.webkit.WebViewStartUpConfig.Builder(executor);
            builder.setShouldRunUiThreadStartUpTasks(z);
            try {
                builder.setProfilesToLoadDuringStartup(set);
            } catch (java.lang.Throwable unused) {
            }
            androidx.webkit.WebViewCompat.startUpWebView(context, builder.build(), new ads_mobile_sdk.c7((java.lang.Object) gq3Var, (byte) 16));
        } catch (java.lang.Throwable unused2) {
            if (gq3Var != null) {
                gq3Var.a.resumeWith(new ads_mobile_sdk.xu0(new dev.epro.r0.H5857976276688519753()));
            }
        }
    }
}
