package com.google.android.gms.internal;

import java.lang.Thread;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzzr implements Thread.UncaughtExceptionHandler {
    private /* synthetic */ zzzp zzcmi;
    private /* synthetic */ Thread.UncaughtExceptionHandler zzcmj;

    public zzzr(zzzp zzzpVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzcmi = zzzpVar;
        this.zzcmj = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzcmi.zza(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzcmj;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            zzakb.e("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzcmj;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
