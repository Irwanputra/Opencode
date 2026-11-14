package dev.epro.r0;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P16078978668947144669 implements D16915945238461757356 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(P16078978668947144669.class.getName());
    public static final O8620973563946607355 f;
    public static final Object g;
    public volatile Object a;
    public volatile H3067108644890218695 b;
    public volatile G10471708993481961957 c;

    static {
        O8620973563946607355 u8993188073258667056;
        try {
            u8993188073258667056 = new I5973747629859153606(AtomicReferenceFieldUpdater.newUpdater(G10471708993481961957.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(G10471708993481961957.class, G10471708993481961957.class, "b"), AtomicReferenceFieldUpdater.newUpdater(P16078978668947144669.class, G10471708993481961957.class, "c"), AtomicReferenceFieldUpdater.newUpdater(P16078978668947144669.class, H3067108644890218695.class, "b"), AtomicReferenceFieldUpdater.newUpdater(P16078978668947144669.class, Object.class, "a"));
            th = false;
        } catch (Throwable th) {
            th = th;
            u8993188073258667056 = new U8993188073258667056();
        }
        f = u8993188073258667056;
        if (th) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.getClass();
        }
        g = new Object();
    }

    public static void c(P16078978668947144669 p16078978668947144669) {
        G10471708993481961957 g10471708993481961957;
        H3067108644890218695 h3067108644890218695;
        H3067108644890218695 h30671086448902186952;
        H3067108644890218695 h30671086448902186953;
        do {
            g10471708993481961957 = p16078978668947144669.c;
        } while (!f.v(p16078978668947144669, g10471708993481961957, G10471708993481961957.c));
        while (true) {
            h3067108644890218695 = null;
            if (g10471708993481961957 == null) {
                break;
            }
            Thread thread = g10471708993481961957.a;
            if (thread != null) {
                g10471708993481961957.a = null;
                LockSupport.unpark(thread);
            }
            g10471708993481961957 = g10471708993481961957.b;
        }
        do {
            h30671086448902186952 = p16078978668947144669.b;
        } while (!f.t(p16078978668947144669, h30671086448902186952, H3067108644890218695.d));
        while (true) {
            h30671086448902186953 = h3067108644890218695;
            h3067108644890218695 = h30671086448902186952;
            if (h3067108644890218695 == null) {
                break;
            }
            h30671086448902186952 = h3067108644890218695.c;
            h3067108644890218695.c = h30671086448902186953;
        }
        while (h30671086448902186953 != null) {
            H3067108644890218695 h30671086448902186954 = h30671086448902186953.c;
            Runnable runnable = h30671086448902186953.a;
            Executor executor = h30671086448902186953.b;
            try {
                executor.execute(runnable);
            } catch (RuntimeException unused) {
                Logger logger = e;
                Level level = Level.SEVERE;
                Objects.toString(runnable);
                Objects.toString(executor);
                logger.getClass();
            }
            h30671086448902186953 = h30671086448902186954;
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof H1338852860419971224) {
            Throwable th = ((H1338852860419971224) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof R12437101039299916896) {
            throw new ExecutionException(((R12437101039299916896) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // dev.epro.r0.D16915945238461757356
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        H3067108644890218695 h3067108644890218695 = this.b;
        H3067108644890218695 h30671086448902186952 = H3067108644890218695.d;
        if (h3067108644890218695 != h30671086448902186952) {
            H3067108644890218695 h30671086448902186953 = new H3067108644890218695(runnable, executor);
            do {
                h30671086448902186953.c = h3067108644890218695;
                if (f.t(this, h3067108644890218695, h30671086448902186953)) {
                    return;
                } else {
                    h3067108644890218695 = this.b;
                }
            } while (h3067108644890218695 != h30671086448902186952);
        }
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            Logger logger = e;
            Level level = Level.SEVERE;
            Objects.toString(runnable);
            Objects.toString(executor);
            logger.getClass();
        }
    }

    public final void b(StringBuilder sb) {
        try {
            Object objE = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(objE == this ? "this future" : String.valueOf(objE));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.u(this, obj, d ? new H1338852860419971224(new CancellationException("Future.cancel() was called."), z) : z ? H1338852860419971224.b : H1338852860419971224.c)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(G10471708993481961957 g10471708993481961957) {
        g10471708993481961957.a = null;
        while (true) {
            G10471708993481961957 g104717089934819619572 = this.c;
            if (g104717089934819619572 == G10471708993481961957.c) {
                return;
            }
            G10471708993481961957 g104717089934819619573 = null;
            while (g104717089934819619572 != null) {
                G10471708993481961957 g104717089934819619574 = g104717089934819619572.b;
                if (g104717089934819619572.a != null) {
                    g104717089934819619573 = g104717089934819619572;
                } else if (g104717089934819619573 != null) {
                    g104717089934819619573.b = g104717089934819619574;
                    if (g104717089934819619573.a == null) {
                        break;
                    }
                } else if (!f.v(this, g104717089934819619572, g104717089934819619574)) {
                    break;
                }
                g104717089934819619572 = g104717089934819619574;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        G10471708993481961957 g10471708993481961957 = G10471708993481961957.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            G10471708993481961957 g104717089934819619572 = this.c;
            if (g104717089934819619572 != g10471708993481961957) {
                G10471708993481961957 g104717089934819619573 = new G10471708993481961957();
                do {
                    O8620973563946607355 o8620973563946607355 = f;
                    o8620973563946607355.S(g104717089934819619573, g104717089934819619572);
                    if (o8620973563946607355.v(this, g104717089934819619572, g104717089934819619573)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(g104717089934819619573);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(g104717089934819619573);
                    } else {
                        g104717089934819619572 = this.c;
                    }
                } while (g104717089934819619572 != g10471708993481961957);
            }
            return d(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbR = E12098517352909843120.r("Waited ", " ", j);
        sbR.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbR.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(G6547577305291411977.s(string3, " for ", string));
    }

    public boolean h(Throwable th) {
        if (!f.u(this, null, new R12437101039299916896(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof H1338852860419971224;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String strF;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof H1338852860419971224) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strF = f();
            } catch (RuntimeException e2) {
                strF = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strF != null && !strF.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strF);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        G10471708993481961957 g10471708993481961957 = G10471708993481961957.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return d(obj2);
            }
            G10471708993481961957 g104717089934819619572 = this.c;
            if (g104717089934819619572 != g10471708993481961957) {
                G10471708993481961957 g104717089934819619573 = new G10471708993481961957();
                do {
                    O8620973563946607355 o8620973563946607355 = f;
                    o8620973563946607355.S(g104717089934819619573, g104717089934819619572);
                    if (o8620973563946607355.v(this, g104717089934819619572, g104717089934819619573)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(g104717089934819619573);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    g104717089934819619572 = this.c;
                } while (g104717089934819619572 != g10471708993481961957);
            }
            return d(this.a);
        }
        throw new InterruptedException();
    }
}
