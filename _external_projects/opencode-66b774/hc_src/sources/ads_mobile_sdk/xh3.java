package ads_mobile_sdk;

import java.lang.Thread;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xh3 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ ci3 a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;

    public xh3(ci3 ci3Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = ci3Var;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        thread.getClass();
        th.getClass();
        try {
            this.a.a(th);
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable unused) {
            if (uncaughtExceptionHandler == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
