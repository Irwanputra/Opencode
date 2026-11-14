package dev.epro.r0;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z17200250803442165189 implements B15682441012508903446 {
    public final T15985366153370019177 a;
    public final M10634075818626712574 b;
    public long c;
    public final CopyOnWriteArrayList d;
    public final LinkedBlockingDeque e;

    public Z17200250803442165189(T15985366153370019177 t15985366153370019177, M10634075818626712574 m10634075818626712574) {
        m10634075818626712574.getClass();
        this.a = t15985366153370019177;
        this.b = m10634075818626712574;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new LinkedBlockingDeque();
    }

    @Override // dev.epro.r0.B15682441012508903446
    public final H3726261569308128079 a() throws IOException {
        J14476340649358081657 j14476340649358081657D;
        long j;
        J14476340649358081657 j14476340649358081657;
        IOException iOException = null;
        while (true) {
            try {
                if (this.d.isEmpty() && !this.a.a(null)) {
                    break;
                }
                if (this.a.k.q) {
                    throw new IOException("Canceled");
                }
                M9197813449740923653 m9197813449740923653 = this.b.a;
                long jNanoTime = System.nanoTime();
                long j2 = this.c - jNanoTime;
                if (this.d.isEmpty() || j2 <= 0) {
                    j14476340649358081657D = d();
                    j = 250000000;
                    this.c = jNanoTime + 250000000;
                } else {
                    j = j2;
                    j14476340649358081657D = null;
                }
                if (j14476340649358081657D == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.d;
                    if (copyOnWriteArrayList.isEmpty() || (j14476340649358081657 = (J14476340649358081657) this.e.poll(j, timeUnit)) == null) {
                        j14476340649358081657D = null;
                    } else {
                        copyOnWriteArrayList.remove(j14476340649358081657.a);
                        j14476340649358081657D = j14476340649358081657;
                    }
                    if (j14476340649358081657D == null) {
                    }
                }
                boolean z = false;
                if (j14476340649358081657D.b == null && j14476340649358081657D.c == null) {
                    b();
                    if (!j14476340649358081657D.a.e()) {
                        j14476340649358081657D = j14476340649358081657D.a.c();
                    }
                    if (j14476340649358081657D.b == null && j14476340649358081657D.c == null) {
                        z = true;
                    }
                    if (z) {
                        H3726261569308128079 h3726261569308128079D = j14476340649358081657D.a.d();
                        b();
                        return h3726261569308128079D;
                    }
                }
                Throwable th = j14476340649358081657D.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        O8620973563946607355.m(iOException, th);
                    }
                    if (((IOException) th) instanceof A9104873785792518488) {
                        break;
                    }
                }
                P11191550465322624469 p11191550465322624469 = j14476340649358081657D.b;
                if (p11191550465322624469 != null) {
                    this.a.p.addFirst(p11191550465322624469);
                }
            } catch (Throwable th2) {
                b();
                throw th2;
            }
        }
        b();
        iOException.getClass();
        throw iOException;
    }

    public final void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            P11191550465322624469 p11191550465322624469 = (P11191550465322624469) it.next();
            p11191550465322624469.cancel();
            P11191550465322624469 p11191550465322624469A = p11191550465322624469.a();
            if (p11191550465322624469A != null) {
                this.a.p.addLast(p11191550465322624469A);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // dev.epro.r0.B15682441012508903446
    public final T15985366153370019177 c() {
        return this.a;
    }

    public final J14476340649358081657 d() {
        P11191550465322624469 a12270298036511864110;
        T15985366153370019177 t15985366153370019177 = this.a;
        if (t15985366153370019177.a(null)) {
            try {
                a12270298036511864110 = t15985366153370019177.b();
            } catch (Throwable th) {
                a12270298036511864110 = new A12270298036511864110(th);
            }
            if (a12270298036511864110.e()) {
                return new J14476340649358081657(a12270298036511864110, (Throwable) null, 6);
            }
            if (a12270298036511864110 instanceof A12270298036511864110) {
                return ((A12270298036511864110) a12270298036511864110).a;
            }
            this.d.add(a12270298036511864110);
            this.b.d().c(new Y2467716061294949505(C14766148968941961570.b + " connect " + t15985366153370019177.i.h.f(), a12270298036511864110, this), 0L);
        }
        return null;
    }
}
