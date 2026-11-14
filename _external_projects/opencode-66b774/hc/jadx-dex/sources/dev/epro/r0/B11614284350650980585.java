package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B11614284350650980585 extends dev.epro.r0.R7033599853981556291 {
    public final /* synthetic */ dev.epro.r0.R7033599853981556291 u;
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor v;

    public B11614284350650980585(dev.epro.r0.R7033599853981556291 r7033599853981556291, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        this.u = r7033599853981556291;
        this.v = threadPoolExecutor;
    }

    public final void G(java.lang.Throwable th) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.v;
        try {
            this.u.G(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void H(dev.epro.r0.J15730374346044043770 j15730374346044043770) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.v;
        try {
            this.u.H(j15730374346044043770);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
