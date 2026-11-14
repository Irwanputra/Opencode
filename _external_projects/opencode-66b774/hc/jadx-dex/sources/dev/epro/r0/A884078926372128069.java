package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A884078926372128069 implements java.lang.Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Runnable b;

    public /* synthetic */ A884078926372128069(java.lang.Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        java.lang.Runnable runnable = this.b;
        switch (b) {
            case 0:
                java.lang.Thread.currentThread().setName("JavaCronetEngine");
                android.os.Process.setThreadPriority(0);
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                try {
                    runnable.run();
                } catch (java.lang.RuntimeException unused) {
                    return;
                }
                break;
        }
    }

    public java.lang.String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
