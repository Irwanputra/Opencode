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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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

    /* renamed from: o, reason: collision with root package name */
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
        IOException iOException2;
        Socket i;
        TimeZone timeZone = C14766148968941961570.a;
        H3726261569308128079 h3726261569308128079 = this.i;
        if (h3726261569308128079 != null) {
            synchronized (h3726261569308128079) {
                i = i();
            }
            if (this.i == null) {
                if (i != null) {
                    C14766148968941961570.c(i);
                }
                this.d.getClass();
            } else if (i != null) {
                S10973172697741180971.m("Check failed.");
                return null;
            }
        }
        if (!this.j && this.e.i()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        Q16536459847538462718 q16536459847538462718 = this.d;
        if (iOException == null) {
            q16536459847538462718.getClass();
            return iOException2;
        }
        iOException2.getClass();
        q16536459847538462718.getClass();
        return iOException2;
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

    public final P10917817599008460069 f() {
        ArrayList arrayList = new ArrayList();
        P17571903987102865660.n0(arrayList, this.a.b);
        arrayList.add(new E3521001867988454901((byte) 4));
        arrayList.add(new E3521001867988454901((byte) 2));
        arrayList.add(new E3521001867988454901((byte) 3));
        arrayList.add(E3521001867988454901.c);
        P17571903987102865660.n0(arrayList, this.a.c);
        arrayList.add(E3521001867988454901.b);
        G842859980338292746 g842859980338292746 = this.b;
        K5458285210510848811 k5458285210510848811 = this.a;
        g842859980338292746.getClass();
        k5458285210510848811.getClass();
        N4061146215511977314 n4061146215511977314 = new N4061146215511977314(this, arrayList, 0, null, g842859980338292746, k5458285210510848811.w, k5458285210510848811.x, k5458285210510848811.y, k5458285210510848811.g, k5458285210510848811.t, k5458285210510848811.D, k5458285210510848811.j, k5458285210510848811.k, k5458285210510848811.s, k5458285210510848811.m, k5458285210510848811.l, k5458285210510848811.e, k5458285210510848811.n, k5458285210510848811.f333o, k5458285210510848811.p, k5458285210510848811.u);
        boolean z = false;
        try {
            try {
                P10917817599008460069 b = n4061146215511977314.b(this.b);
                if (this.q) {
                    L14928198200995638215.b(b);
                    throw new IOException("Canceled");
                }
                h(null);
                return b;
            } catch (IOException e) {
                z = true;
                IOException h = h(e);
                h.getClass();
                throw h;
            }
        } catch (Throwable th) {
            if (!z) {
                h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException g(dev.epro.r0.T558270488962777544 r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
        /*
            r3 = this;
            r4.getClass()
            dev.epro.r0.T558270488962777544 r0 = r3.r
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld
            goto L78
        Ld:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L19
            boolean r1 = r3.l     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            goto L19
        L17:
            r4 = move-exception
            goto L59
        L19:
            if (r6 == 0) goto L1f
            boolean r1 = r3.m     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L1f:
            if (r8 == 0) goto L25
            boolean r1 = r3.n     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L25:
            if (r7 == 0) goto L5b
            boolean r1 = r3.f545o     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L5b
        L2b:
            if (r5 == 0) goto L2f
            r3.l = r0     // Catch: java.lang.Throwable -> L17
        L2f:
            if (r6 == 0) goto L33
            r3.m = r0     // Catch: java.lang.Throwable -> L17
        L33:
            if (r8 == 0) goto L37
            r3.n = r0     // Catch: java.lang.Throwable -> L17
        L37:
            if (r7 == 0) goto L3b
            r3.f545o = r0     // Catch: java.lang.Throwable -> L17
        L3b:
            boolean r5 = r3.l     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.m     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.n     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.f545o     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L55
            boolean r6 = r3.p     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L55
            r0 = r4
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.r = r6
            dev.epro.r0.H3726261569308128079 r6 = r3.i
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.m     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.m = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r3 = r3.b(r9)
            return r3
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V5252629055842691065.g(dev.epro.r0.T558270488962777544, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
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
