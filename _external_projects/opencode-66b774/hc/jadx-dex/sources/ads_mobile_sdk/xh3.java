package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xh3 implements java.lang.Thread.UncaughtExceptionHandler {
    public final /* synthetic */ ads_mobile_sdk.ci3 a;
    public final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler b;

    public xh3(ads_mobile_sdk.ci3 ci3Var, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = ci3Var;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        thread.getClass();
        th.getClass();
        try {
            this.a.a(th);
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (java.lang.Throwable unused) {
            if (uncaughtExceptionHandler == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
