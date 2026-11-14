package dev.epro.r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N18249742966722306189 extends Q9039728214998424519 implements W8575158046285589709 {
    public final Executor c;

    public N18249742966722306189(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // dev.epro.r0.Q9039728214998424519
    public final Executor D() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // dev.epro.r0.W8575158046285589709
    public final U16840712152025914198 d(long j, Runnable runnable, G8001132634698687269 g8001132634698687269) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                J8045362843799184672.v(g8001132634698687269, cancellationException);
            }
        }
        return scheduledFuture != null ? new L17135154094566932700(scheduledFuture) : Y8284122368275782397.k.d(j, runnable, g8001132634698687269);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof N18249742966722306189) && ((N18249742966722306189) obj).c == this.c;
    }

    @Override // dev.epro.r0.W8575158046285589709
    public final void h(long j, H7219028874700587498 h7219028874700587498) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            I3863025946240164840 i3863025946240164840 = new I3863025946240164840(this, h7219028874700587498, (byte) 14);
            G8001132634698687269 g8001132634698687269 = h7219028874700587498.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(i3863025946240164840, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                J8045362843799184672.v(g8001132634698687269, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            h7219028874700587498.w(new T5499530138885127132(scheduledFuture, (byte) 0));
        } else {
            Y8284122368275782397.k.h(j, h7219028874700587498);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final String toString() {
        return this.c.toString();
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            J8045362843799184672.v(g8001132634698687269, cancellationException);
            Y10288379321248498973 y10288379321248498973 = M979257876727257621.a;
            N11611180034702960692.c.z(g8001132634698687269, runnable);
        }
    }
}
