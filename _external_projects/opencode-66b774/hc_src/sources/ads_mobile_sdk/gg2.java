package ads_mobile_sdk;

import dev.epro.r0.P17493338506140929634;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gg2 implements P17493338506140929634 {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    @Override // dev.epro.r0.P17493338506140929634
    public final void a(Runnable runnable, long j) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // dev.epro.r0.P17493338506140929634
    public final void a() {
    }
}
