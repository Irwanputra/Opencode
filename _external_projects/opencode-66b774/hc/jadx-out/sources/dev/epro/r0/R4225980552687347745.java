package dev.epro.r0;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R4225980552687347745 implements D16915945238461757356 {
    public static final boolean d;
    public static final Logger e;
    public static final T18016951143603335921 f;
    public static final Object g;
    public volatile Object a;
    public volatile G5604827203694114189 b;
    public volatile R14797178970429462271 c;

    static {
        boolean z;
        T18016951143603335921 f5481334767959162899;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(R4225980552687347745.class.getName());
        Object obj = null;
        try {
            try {
                f5481334767959162899 = new R12381712935798668268();
            } catch (Error | RuntimeException e2) {
                obj = e2;
                f5481334767959162899 = new F5481334767959162899();
            }
        } catch (Error | RuntimeException unused2) {
            f5481334767959162899 = new V1540328691236583783(AtomicReferenceFieldUpdater.newUpdater(R14797178970429462271.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(R14797178970429462271.class, R14797178970429462271.class, "b"), AtomicReferenceFieldUpdater.newUpdater(R4225980552687347745.class, R14797178970429462271.class, "c"), AtomicReferenceFieldUpdater.newUpdater(R4225980552687347745.class, G5604827203694114189.class, "b"), AtomicReferenceFieldUpdater.newUpdater(R4225980552687347745.class, Object.class, "a"));
        }
        f = f5481334767959162899;
        if (obj != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.getClass();
        }
        g = new Object();
    }

    public static void e(R4225980552687347745 r4225980552687347745, boolean z) {
        G5604827203694114189 g5604827203694114189 = null;
        while (true) {
            for (R14797178970429462271 r14797178970429462271F = f.F(r4225980552687347745); r14797178970429462271F != null; r14797178970429462271F = r14797178970429462271F.b) {
                Thread thread = r14797178970429462271F.a;
                if (thread != null) {
                    r14797178970429462271F.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                r4225980552687347745.h();
                z = false;
            }
            r4225980552687347745.c();
            G5604827203694114189 g56048272036941141892 = g5604827203694114189;
            G5604827203694114189 g5604827203694114189E = f.E(r4225980552687347745);
            G5604827203694114189 g56048272036941141893 = g56048272036941141892;
            while (g5604827203694114189E != null) {
                G5604827203694114189 g56048272036941141894 = g5604827203694114189E.c;
                g5604827203694114189E.c = g56048272036941141893;
                g56048272036941141893 = g5604827203694114189E;
                g5604827203694114189E = g56048272036941141894;
            }
            while (g56048272036941141893 != null) {
                g5604827203694114189 = g56048272036941141893.c;
                Runnable runnable = g56048272036941141893.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof Y16077468175112876371) {
                    Y16077468175112876371 y16077468175112876371 = (Y16077468175112876371) runnable;
                    r4225980552687347745 = y16077468175112876371.a;
                    if (r4225980552687347745.a == y16077468175112876371) {
                        if (f.w(r4225980552687347745, y16077468175112876371, g(y16077468175112876371.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = g56048272036941141893.b;
                    Objects.requireNonNull(executor);
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
                g56048272036941141893 = g5604827203694114189;
            }
            return;
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof P421411870588928118) {
            Throwable th = ((P421411870588928118) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof W16379344379560342442) {
            throw new ExecutionException(((W16379344379560342442) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object g(D16915945238461757356 d16915945238461757356) {
        Object obj;
        Throwable thN;
        if (d16915945238461757356 instanceof E10764231691588948031) {
            Object p421411870588928118 = ((R4225980552687347745) d16915945238461757356).a;
            if (p421411870588928118 instanceof P421411870588928118) {
                P421411870588928118 p4214118705889281182 = (P421411870588928118) p421411870588928118;
                if (p4214118705889281182.a) {
                    p421411870588928118 = p4214118705889281182.b != null ? new P421411870588928118(p4214118705889281182.b, false) : P421411870588928118.d;
                }
            }
            Objects.requireNonNull(p421411870588928118);
            return p421411870588928118;
        }
        if ((d16915945238461757356 instanceof R4225980552687347745) && (thN = ((R4225980552687347745) d16915945238461757356).n()) != null) {
            return new W16379344379560342442(thN);
        }
        boolean zIsCancelled = d16915945238461757356.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            P421411870588928118 p4214118705889281183 = P421411870588928118.d;
            Objects.requireNonNull(p4214118705889281183);
            return p4214118705889281183;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = d16915945238461757356.get();
                        break;
                    } catch (Error e2) {
                        e = e2;
                        return new W16379344379560342442(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | RuntimeException e3) {
                e = e3;
                return new W16379344379560342442(e);
            } catch (CancellationException e4) {
                if (zIsCancelled) {
                    return new P421411870588928118(e4, false);
                }
                return new W16379344379560342442(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + d16915945238461757356, e4));
            } catch (ExecutionException e5) {
                if (!zIsCancelled) {
                    return new W16379344379560342442(e5.getCause());
                }
                return new P421411870588928118(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + d16915945238461757356, e5), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? g : obj;
        }
        return new P421411870588928118(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + d16915945238461757356), false);
    }

    @Override // dev.epro.r0.D16915945238461757356
    public void a(Runnable runnable, Executor executor) {
        G5604827203694114189 g5604827203694114189;
        G5604827203694114189 g56048272036941141892 = G5604827203694114189.d;
        if (executor == null) {
            Z3383101362411723454.k("Executor was null.");
            return;
        }
        if (!isDone() && (g5604827203694114189 = this.b) != g56048272036941141892) {
            G5604827203694114189 g56048272036941141893 = new G5604827203694114189(runnable, executor);
            do {
                g56048272036941141893.c = g5604827203694114189;
                if (f.v(this, g5604827203694114189, g56048272036941141893)) {
                    return;
                } else {
                    g5604827203694114189 = this.b;
                }
            } while (g5604827203694114189 != g56048272036941141892);
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
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        P421411870588928118 p421411870588928118;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof Y16077468175112876371)) {
            return false;
        }
        if (d) {
            p421411870588928118 = new P421411870588928118(new CancellationException("Future.cancel() was called."), z);
        } else {
            p421411870588928118 = z ? P421411870588928118.c : P421411870588928118.d;
            Objects.requireNonNull(p421411870588928118);
        }
        boolean z2 = false;
        while (true) {
            if (f.w(this, obj, p421411870588928118)) {
                e(this, z);
                if (!(obj instanceof Y16077468175112876371)) {
                    break;
                }
                D16915945238461757356 d16915945238461757356 = ((Y16077468175112876371) obj).b;
                if (!(d16915945238461757356 instanceof E10764231691588948031)) {
                    d16915945238461757356.cancel(z);
                    break;
                }
                this = (R4225980552687347745) d16915945238461757356;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof Y16077468175112876371)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof Y16077468175112876371)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        R14797178970429462271 r14797178970429462271 = R14797178970429462271.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof Y16077468175112876371))) {
            return f(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            R14797178970429462271 r147971789704294622712 = this.c;
            if (r147971789704294622712 != r14797178970429462271) {
                R14797178970429462271 r147971789704294622713 = new R14797178970429462271();
                z = true;
                while (true) {
                    T18016951143603335921 t18016951143603335921 = f;
                    t18016951143603335921.U(r147971789704294622713, r147971789704294622712);
                    if (t18016951143603335921.x(this, r147971789704294622712, r147971789704294622713)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                j(r147971789704294622713);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof Y16077468175112876371))) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(r147971789704294622713);
                    } else {
                        long j4 = j3;
                        r147971789704294622712 = this.c;
                        if (r147971789704294622712 == r14797178970429462271) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof Y16077468175112876371))) {
                return f(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(G6547577305291411977.s(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof P421411870588928118;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof Y16077468175112876371)) & (this.a != null);
    }

    public final void j(R14797178970429462271 r14797178970429462271) {
        r14797178970429462271.a = null;
        while (true) {
            R14797178970429462271 r147971789704294622712 = this.c;
            if (r147971789704294622712 == R14797178970429462271.c) {
                return;
            }
            R14797178970429462271 r147971789704294622713 = null;
            while (r147971789704294622712 != null) {
                R14797178970429462271 r147971789704294622714 = r147971789704294622712.b;
                if (r147971789704294622712.a != null) {
                    r147971789704294622713 = r147971789704294622712;
                } else if (r147971789704294622713 != null) {
                    r147971789704294622713.b = r147971789704294622714;
                    if (r147971789704294622713.a == null) {
                        break;
                    }
                } else if (!f.x(this, r147971789704294622712, r147971789704294622714)) {
                    break;
                }
                r147971789704294622712 = r147971789704294622714;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.w(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!f.w(this, null, new W16379344379560342442(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    public final void m(D16915945238461757356 d16915945238461757356) {
        W16379344379560342442 w16379344379560342442;
        d16915945238461757356.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (d16915945238461757356.isDone()) {
                if (f.w(this, null, g(d16915945238461757356))) {
                    e(this, false);
                    return;
                }
                return;
            }
            Y16077468175112876371 y16077468175112876371 = new Y16077468175112876371(this, d16915945238461757356);
            if (f.w(this, null, y16077468175112876371)) {
                try {
                    d16915945238461757356.a(y16077468175112876371, Z886113521968091188.a);
                    return;
                } catch (Error | RuntimeException e2) {
                    try {
                        w16379344379560342442 = new W16379344379560342442(e2);
                    } catch (Error | RuntimeException unused) {
                        w16379344379560342442 = W16379344379560342442.b;
                    }
                    f.w(this, y16077468175112876371, w16379344379560342442);
                    return;
                }
            }
            obj = this.a;
        }
        if (obj instanceof P421411870588928118) {
            d16915945238461757356.cancel(((P421411870588928118) obj).a);
        }
    }

    public final Throwable n() {
        if (!(this instanceof E10764231691588948031)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof W16379344379560342442) {
            return ((W16379344379560342442) obj).a;
        }
        return null;
    }

    public final boolean o() {
        Object obj = this.a;
        return (obj instanceof P421411870588928118) && ((P421411870588928118) obj).a;
    }

    public String toString() {
        String strI;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof Y16077468175112876371) {
                sb.append(", setFuture=[");
                D16915945238461757356 d16915945238461757356 = ((Y16077468175112876371) obj).b;
                try {
                    if (d16915945238461757356 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(d16915945238461757356);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strI = i();
                    if (T3803022700175900929.a(strI)) {
                        strI = null;
                    }
                } catch (RuntimeException | StackOverflowError e4) {
                    strI = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strI != null) {
                    sb.append(", info=[");
                    sb.append(strI);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    public void h() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        R14797178970429462271 r14797178970429462271 = R14797178970429462271.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof Y16077468175112876371))) {
                return f(obj2);
            }
            R14797178970429462271 r147971789704294622712 = this.c;
            if (r147971789704294622712 != r14797178970429462271) {
                R14797178970429462271 r147971789704294622713 = new R14797178970429462271();
                do {
                    T18016951143603335921 t18016951143603335921 = f;
                    t18016951143603335921.U(r147971789704294622713, r147971789704294622712);
                    if (t18016951143603335921.x(this, r147971789704294622712, r147971789704294622713)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(r147971789704294622713);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof Y16077468175112876371))));
                        return f(obj);
                    }
                    r147971789704294622712 = this.c;
                } while (r147971789704294622712 != r14797178970429462271);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        throw new InterruptedException();
    }
}
