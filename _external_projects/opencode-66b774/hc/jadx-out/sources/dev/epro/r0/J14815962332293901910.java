package dev.epro.r0;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J14815962332293901910 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ J14815962332293901910(String str, Runnable runnable, byte b) {
        this.a = b;
        this.b = str;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                U1748733558996603759.b("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
                try {
                    runnable.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                U1748733558996603759.b("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
                try {
                    runnable.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
