package dev.epro.r0;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F1091364834390067043 extends T12670249092619324354 {
    public P13515607228063833704 p;

    @Override // dev.epro.r0.R4225980552687347745
    public final void h() {
        P13515607228063833704 p13515607228063833704 = this.p;
        if (p13515607228063833704 != null) {
            p13515607228063833704.c();
        }
    }

    @Override // dev.epro.r0.T12670249092619324354
    public final void s() {
        P13515607228063833704 p13515607228063833704 = this.p;
        if (p13515607228063833704 != null) {
            try {
                p13515607228063833704.run();
            } catch (RejectedExecutionException e) {
                p13515607228063833704.c.l(e);
            }
        }
    }

    @Override // dev.epro.r0.T12670249092619324354
    public final void v(int i) {
        if (i == 0) {
            throw null;
        }
        this.l = null;
        if (i == 1) {
            this.p = null;
        }
    }
}
