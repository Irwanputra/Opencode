package dev.epro.r0;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K7613050519047686686 implements Executor {
    public final D11883231851729262595 a;

    public K7613050519047686686(D11883231851729262595 d11883231851729262595) {
        this.a = d11883231851729262595;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D11883231851729262595 d11883231851729262595 = this.a;
        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
        if (d11883231851729262595.B(i3826119971291161142)) {
            d11883231851729262595.z(i3826119971291161142, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
