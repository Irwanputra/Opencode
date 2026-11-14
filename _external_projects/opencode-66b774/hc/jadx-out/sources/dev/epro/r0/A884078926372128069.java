package dev.epro.r0;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A884078926372128069 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ A884078926372128069(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                try {
                    runnable.run();
                } catch (RuntimeException unused) {
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
