package dev.epro.r0;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y979168416190219423 {
    public final S12944751221596631194 a;
    public final Y5209789131793062978 b;
    public final M3727281027331139839 c;
    public final L12639328004344855510 d;
    public final boolean e;
    public final Z5153954235810715664 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(Z3361759032029918772.c);
    public long i = Q9282725956684299602.g();
    public E13273723708836014930 j;
    public final E1005111105761972824 k;
    public final D9359986064522891875 l;

    public Y979168416190219423(S12944751221596631194 s12944751221596631194, Y5209789131793062978 y5209789131793062978, M3727281027331139839 m3727281027331139839, V8500408966188516816 v8500408966188516816, L12639328004344855510 l12639328004344855510, boolean z, Z5153954235810715664 z5153954235810715664, Object obj) {
        this.a = s12944751221596631194;
        this.b = y5209789131793062978;
        this.c = m3727281027331139839;
        this.d = l12639328004344855510;
        this.e = z;
        this.f = z5153954235810715664;
        this.g = obj;
        E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
        e13273723708836014930.getClass();
        this.j = e13273723708836014930;
        E1005111105761972824 e1005111105761972824 = new E1005111105761972824((byte) 0);
        e1005111105761972824.j(v8500408966188516816, m3727281027331139839.A());
        this.k = e1005111105761972824;
        this.l = new D9359986064522891875(z5153954235810715664.c);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((Z3361759032029918772) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    Z3361759032029918772 z3361759032029918772 = Z3361759032029918772.f;
                    Z3361759032029918772 z33617590320299187722 = Z3361759032029918772.g;
                    while (!atomicReference.compareAndSet(z3361759032029918772, z33617590320299187722)) {
                        if (atomicReference.get() != z3361759032029918772) {
                            L4738636499147270068.b("Unexpected state change from: " + z3361759032029918772 + " to: " + z33617590320299187722 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new M8821877208104636290();
            }
        } catch (Exception e) {
            atomicReference.set(Z3361759032029918772.a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                } finally {
                    this.k.c();
                    this.a.q = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((Z3361759032029918772) this.h.get()).compareTo(Z3361759032029918772.f) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        Z3361759032029918772 z3361759032029918772;
        Z3361759032029918772 z33617590320299187722;
        do {
            atomicReference = this.h;
            z3361759032029918772 = Z3361759032029918772.d;
            z33617590320299187722 = Z3361759032029918772.f;
            if (atomicReference.compareAndSet(z3361759032029918772, z33617590320299187722)) {
                return;
            }
        } while (atomicReference.get() == z3361759032029918772);
        L4738636499147270068.b("Unexpected state change from: " + z3361759032029918772 + " to: " + z33617590320299187722 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e(Y16033830328113725410 y16033830328113725410) throws Exception {
        Z3361759032029918772 z3361759032029918772 = Z3361759032029918772.e;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((Z3361759032029918772) atomicReference.get()).ordinal();
            Z3361759032029918772 z33617590320299187722 = Z3361759032029918772.d;
            S12944751221596631194 s12944751221596631194 = this.a;
            Y5209789131793062978 y5209789131793062978 = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    M3727281027331139839 m3727281027331139839 = this.c;
                    boolean z = this.e;
                    if (z) {
                        m3727281027331139839.z = 0;
                        m3727281027331139839.y = true;
                    }
                    this.j = y5209789131793062978.b(s12944751221596631194, y16033830328113725410, this.d);
                    if (z) {
                        if (m3727281027331139839.F || m3727281027331139839.z != 0) {
                            L4738636499147270068.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        m3727281027331139839.z = -1;
                        m3727281027331139839.y = false;
                    }
                    Z3361759032029918772 z33617590320299187723 = Z3361759032029918772.c;
                    while (true) {
                        if (!atomicReference.compareAndSet(z33617590320299187723, z33617590320299187722)) {
                            if (atomicReference.get() != z33617590320299187723) {
                                L4738636499147270068.b("Unexpected state change from: " + z33617590320299187723 + " to: " + z33617590320299187722 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(z33617590320299187722, z3361759032029918772)) {
                            if (atomicReference.get() != z33617590320299187722) {
                                L4738636499147270068.b("Unexpected state change from: " + z33617590320299187722 + " to: " + z3361759032029918772 + ".");
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = Q9282725956684299602.g();
                        this.j = y5209789131793062978.q(s12944751221596631194, y16033830328113725410, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(z3361759032029918772, z33617590320299187722)) {
                                if (atomicReference.get() != z3361759032029918772) {
                                    L4738636499147270068.b("Unexpected state change from: " + z3361759032029918772 + " to: " + z33617590320299187722 + ".");
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(z3361759032029918772, z33617590320299187722)) {
                                if (atomicReference.get() != z3361759032029918772) {
                                    L4738636499147270068.b("Unexpected state change from: " + z3361759032029918772 + " to: " + z33617590320299187722 + ".");
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    N2332913310205178802.b("Recursive call to resume()");
                    throw new M8821877208104636290();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new M8821877208104636290();
            }
        } catch (Exception e) {
            atomicReference.set(Z3361759032029918772.a);
            throw e;
        }
    }
}
