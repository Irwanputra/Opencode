package dev.epro.r0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V5252629055842691065 implements V16360509766617756755, Cloneable {
    public final K5458285210510848811 a;
    public final G842859980338292746 b;
    public final J9884070742191057945 c;
    public volatile Q16536459847538462718 d;
    public final T9236348891615457635 e;
    public final AtomicBoolean f;
    public Object g;
    public B15682441012508903446 h;
    public H3726261569308128079 i;
    public boolean j;
    public T558270488962777544 k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f545o;
    public boolean p;
    public volatile boolean q;
    public volatile T558270488962777544 r;
    public final CopyOnWriteArrayList s;

    static {
        AtomicReferenceFieldUpdater.newUpdater(V5252629055842691065.class, Q16536459847538462718.class, "d");
    }

    public V5252629055842691065(K5458285210510848811 k5458285210510848811, G842859980338292746 g842859980338292746) {
        k5458285210510848811.getClass();
        g842859980338292746.getClass();
        this.a = k5458285210510848811;
        this.b = g842859980338292746;
        this.c = (J9884070742191057945) k5458285210510848811.D.b;
        k5458285210510848811.d.getClass();
        this.d = Q16536459847538462718.a;
        T9236348891615457635 t9236348891615457635 = new T9236348891615457635(this);
        t9236348891615457635.g(k5458285210510848811.v);
        this.e = t9236348891615457635;
        this.f = new AtomicBoolean();
        this.p = true;
        this.s = new CopyOnWriteArrayList();
        new AtomicReference(g842859980338292746.e);
    }

    public final void a(H3726261569308128079 h3726261569308128079) {
        h3726261569308128079.getClass();
        TimeZone timeZone = C14766148968941961570.a;
        if (this.i != null) {
            S10973172697741180971.m("Check failed.");
        } else {
            this.i = h3726261569308128079;
            h3726261569308128079.p.add(new F3664753522621099204(this, this.g));
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketI;
        TimeZone timeZone = C14766148968941961570.a;
        H3726261569308128079 h3726261569308128079 = this.i;
        if (h3726261569308128079 != null) {
            synchronized (h3726261569308128079) {
                socketI = i();
            }
            if (this.i == null) {
                if (socketI != null) {
                    C14766148968941961570.c(socketI);
                }
                this.d.getClass();
            } else if (socketI != null) {
                S10973172697741180971.m("Check failed.");
                return null;
            }
        }
        if (!this.j && this.e.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        Q16536459847538462718 q16536459847538462718 = this.d;
        if (iOException == null) {
            q16536459847538462718.getClass();
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        q16536459847538462718.getClass();
        return interruptedIOException;
    }

    public final void c() {
        if (this.q) {
            return;
        }
        this.q = true;
        T558270488962777544 t558270488962777544 = this.r;
        if (t558270488962777544 != null) {
            ((R8365488887580997185) t558270488962777544.d).cancel();
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((P11191550465322624469) it.next()).cancel();
        }
        this.d.getClass();
    }

    public final Object clone() {
        return new V5252629055842691065(this.a, this.b);
    }

    public final void d(H17290033108192114773 h17290033108192114773) {
        if (!this.f.compareAndSet(false, true)) {
            S10973172697741180971.m("Already Executed");
            return;
        }
        X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
        this.g = X4422675003582389573.a.h();
        this.d.getClass();
        J15730374346044043770 j15730374346044043770 = this.a.a;
        C12173677222265696772 c12173677222265696772 = new C12173677222265696772(this, h17290033108192114773);
        j15730374346044043770.getClass();
        J15730374346044043770.R(j15730374346044043770, c12173677222265696772, null, 6);
    }

    public final void e(boolean z) {
        T558270488962777544 t558270488962777544;
        synchronized (this) {
            if (!this.p) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (t558270488962777544 = this.r) != null) {
            ((R8365488887580997185) t558270488962777544.d).cancel();
            ((V5252629055842691065) t558270488962777544.b).g(t558270488962777544, true, true, true, true, null);
        }
        this.k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.P10917817599008460069 f() {
        /*
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            dev.epro.r0.K5458285210510848811 r0 = r1.a
            java.util.List r0 = r0.b
            dev.epro.r0.P17571903987102865660.n0(r2, r0)
            dev.epro.r0.E3521001867988454901 r0 = new dev.epro.r0.E3521001867988454901
            r3 = 4
            r0.<init>(r3)
            r2.add(r0)
            dev.epro.r0.E3521001867988454901 r0 = new dev.epro.r0.E3521001867988454901
            r3 = 2
            r0.<init>(r3)
            r2.add(r0)
            dev.epro.r0.E3521001867988454901 r0 = new dev.epro.r0.E3521001867988454901
            r3 = 3
            r0.<init>(r3)
            r2.add(r0)
            dev.epro.r0.E3521001867988454901 r0 = dev.epro.r0.E3521001867988454901.c
            r2.add(r0)
            dev.epro.r0.K5458285210510848811 r0 = r1.a
            java.util.List r0 = r0.c
            dev.epro.r0.P17571903987102865660.n0(r2, r0)
            dev.epro.r0.E3521001867988454901 r0 = dev.epro.r0.E3521001867988454901.b
            r2.add(r0)
            dev.epro.r0.N4061146215511977314 r0 = new dev.epro.r0.N4061146215511977314
            dev.epro.r0.G842859980338292746 r5 = r1.b
            dev.epro.r0.K5458285210510848811 r3 = r1.a
            r5.getClass()
            r3.getClass()
            int r6 = r3.w
            int r7 = r3.x
            int r8 = r3.y
            dev.epro.r0.P2382941533350862833 r9 = r3.g
            dev.epro.r0.F12905216483416502853 r10 = r3.t
            dev.epro.r0.H12843822278061842084 r11 = r3.D
            dev.epro.r0.P2382941533350862833 r12 = r3.j
            dev.epro.r0.C1934509054487712083 r13 = r3.k
            javax.net.ssl.HostnameVerifier r14 = r3.s
            dev.epro.r0.P2382941533350862833 r15 = r3.m
            java.net.ProxySelector r4 = r3.l
            r16 = r0
            boolean r0 = r3.e
            r17 = r0
            javax.net.SocketFactory r0 = r3.n
            r18 = r0
            javax.net.ssl.SSLSocketFactory r0 = r3.f333o
            r19 = r0
            javax.net.ssl.X509TrustManager r0 = r3.p
            dev.epro.r0.M2066880349381062048 r3 = r3.u
            r21 = r3
            r3 = 0
            r20 = r0
            r0 = r16
            r16 = r4
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 0
            r3 = 0
            dev.epro.r0.G842859980338292746 r4 = r1.b     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            dev.epro.r0.P10917817599008460069 r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            boolean r4 = r1.q     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            if (r4 != 0) goto L8b
            r1.h(r2)
            return r0
        L8b:
            dev.epro.r0.L14928198200995638215.b(r0)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            throw r0     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
        L96:
            r0 = move-exception
            goto La2
        L98:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r1.h(r0)     // Catch: java.lang.Throwable -> L96
            r0.getClass()     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        La2:
            if (r3 != 0) goto La7
            r1.h(r2)
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V5252629055842691065.f():dev.epro.r0.P10917817599008460069");
    }

    public final IOException g(T558270488962777544 t558270488962777544, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        t558270488962777544.getClass();
        if (t558270488962777544.equals(this.r)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.l) {
                            if ((z2 || !this.m) && ((!z4 || !this.n) && (!z3 || !this.f545o))) {
                            }
                        }
                        if (z) {
                            this.l = false;
                        }
                        if (z2) {
                            this.m = false;
                        }
                        if (z4) {
                            this.n = false;
                        }
                        if (z3) {
                            this.f545o = false;
                        }
                        boolean z7 = (this.l || this.m || this.n || this.f545o) ? false : true;
                        if (z7) {
                            if (!this.p) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.r = null;
                H3726261569308128079 h3726261569308128079 = this.i;
                if (h3726261569308128079 != null) {
                    synchronized (h3726261569308128079) {
                        h3726261569308128079.m++;
                    }
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.p) {
                this.p = false;
                if (!this.l && !this.m && !this.n) {
                    if (!this.f545o) {
                        z = true;
                    }
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket i() {
        H3726261569308128079 h3726261569308128079 = this.i;
        h3726261569308128079.getClass();
        TimeZone timeZone = C14766148968941961570.a;
        ArrayList arrayList = h3726261569308128079.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (S10823041268949770285.t(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            S10973172697741180971.m("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.i = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        h3726261569308128079.q = System.nanoTime();
        J9884070742191057945 j9884070742191057945 = this.c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) j9884070742191057945.e;
        TimeZone timeZone2 = C14766148968941961570.a;
        if (!h3726261569308128079.j && j9884070742191057945.a != 0) {
            ((Z9658010704151025794) j9884070742191057945.c).c((E17483539623558463245) j9884070742191057945.d, 0L);
            return null;
        }
        h3726261569308128079.j = true;
        concurrentLinkedQueue.remove(h3726261569308128079);
        if (concurrentLinkedQueue.isEmpty()) {
            Z9658010704151025794 z9658010704151025794 = (Z9658010704151025794) j9884070742191057945.c;
            synchronized (z9658010704151025794.a) {
                if (z9658010704151025794.a()) {
                    z9658010704151025794.a.c(z9658010704151025794);
                }
            }
        }
        return h3726261569308128079.e;
    }
}
