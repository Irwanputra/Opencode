package dev.epro.r0;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L17135154094566932700 implements U16840712152025914198 {
    public final ScheduledFuture a;

    public L17135154094566932700(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // dev.epro.r0.U16840712152025914198
    public final void a() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
