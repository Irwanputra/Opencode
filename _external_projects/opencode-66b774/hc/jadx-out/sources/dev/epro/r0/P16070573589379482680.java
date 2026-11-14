package dev.epro.r0;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P16070573589379482680 extends F7878618420024429111 implements ScheduledExecutorService {
    public final ScheduledExecutorService c;

    public P16070573589379482680(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        H8027516537527559298 h8027516537527559298 = new H8027516537527559298(Executors.callable(runnable, null));
        return new R6673509759805675097(h8027516537527559298, this.c.schedule(h8027516537527559298, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        B9360715651329413082 b9360715651329413082 = new B9360715651329413082(runnable);
        return new R6673509759805675097(b9360715651329413082, this.c.scheduleAtFixedRate(b9360715651329413082, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        B9360715651329413082 b9360715651329413082 = new B9360715651329413082(runnable);
        return new R6673509759805675097(b9360715651329413082, this.c.scheduleWithFixedDelay(b9360715651329413082, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        H8027516537527559298 h8027516537527559298 = new H8027516537527559298(callable);
        return new R6673509759805675097(h8027516537527559298, this.c.schedule(h8027516537527559298, j, timeUnit));
    }
}
