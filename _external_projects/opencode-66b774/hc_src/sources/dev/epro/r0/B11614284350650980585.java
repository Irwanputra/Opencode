package dev.epro.r0;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B11614284350650980585 extends R7033599853981556291 {
    public final /* synthetic */ R7033599853981556291 u;
    public final /* synthetic */ ThreadPoolExecutor v;

    public B11614284350650980585(R7033599853981556291 r7033599853981556291, ThreadPoolExecutor threadPoolExecutor) {
        this.u = r7033599853981556291;
        this.v = threadPoolExecutor;
    }

    @Override // dev.epro.r0.R7033599853981556291
    public final void G(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.v;
        try {
            this.u.G(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // dev.epro.r0.R7033599853981556291
    public final void H(J15730374346044043770 j15730374346044043770) {
        ThreadPoolExecutor threadPoolExecutor = this.v;
        try {
            this.u.H(j15730374346044043770);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
