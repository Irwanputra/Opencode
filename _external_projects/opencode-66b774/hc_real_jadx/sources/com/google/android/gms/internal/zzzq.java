package com.google.android.gms.internal;

import java.lang.Thread;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzzq implements Thread.UncaughtExceptionHandler {
    private /* synthetic */ Thread.UncaughtExceptionHandler zzcmh;
    private /* synthetic */ zzzp zzcmi;

    public zzzq(zzzp zzzpVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzcmi = zzzpVar;
        this.zzcmh = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzcmi.zza(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzcmh;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            zzakb.e("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzcmh;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
