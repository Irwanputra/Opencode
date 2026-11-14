package dev.epro.r0;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J17843656891628349757 extends T8346709655775060714 implements A2558500182237595544, E5386183571211952538 {
    public final H17686692708284905246 d;

    public J17843656891628349757(G8001132634698687269 g8001132634698687269, H17686692708284905246 h17686692708284905246) {
        super(g8001132634698687269, true);
        this.d = h17686692708284905246;
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final void A(CancellationException cancellationException) {
        this.d.e(cancellationException, true);
        z(cancellationException);
    }

    @Override // dev.epro.r0.N13814068345032586384
    public final Object a(Object obj) {
        return this.d.a(obj);
    }

    @Override // dev.epro.r0.U4020053660465689583, dev.epro.r0.Q15035754882231748864, dev.epro.r0.E5386183571211952538
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new M7201253877242528483(C(), null, this);
        }
        A(cancellationException);
    }

    @Override // dev.epro.r0.T8346709655775060714
    public final void f0(Throwable th, boolean z) {
        if (this.d.e(th, false) || z) {
            return;
        }
        C9869900372345142877.I(this.c, th);
    }

    @Override // dev.epro.r0.T8346709655775060714
    public final void g0(Object obj) {
        this.d.d(null);
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final J15730374346044043770 i() {
        return this.d.i();
    }

    public final void i0(L13891208534469225493 l13891208534469225493) {
        Unsafe unsafe;
        Unsafe unsafe2;
        H17686692708284905246 h17686692708284905246 = this.d;
        h17686692708284905246.getClass();
        long j = H17686692708284905246.j;
        do {
            unsafe = T5284056093300834442.a;
            if (unsafe.compareAndSwapObject(h17686692708284905246, H17686692708284905246.j, (Object) null, l13891208534469225493)) {
                return;
            }
        } while (unsafe.getObjectVolatile(h17686692708284905246, j) == null);
        while (true) {
            Object objectVolatile = T5284056093300834442.a.getObjectVolatile(h17686692708284905246, j);
            D14731132657808549702 d14731132657808549702 = J11102083402305026174.q;
            if (objectVolatile != d14731132657808549702) {
                if (objectVolatile == J11102083402305026174.r) {
                    S10973172697741180971.m("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    Q11088980322693754445.i("Another handler is already registered: ", objectVolatile);
                    return;
                }
            }
            D14731132657808549702 d147311326578085497022 = J11102083402305026174.r;
            do {
                unsafe2 = T5284056093300834442.a;
                if (unsafe2.compareAndSwapObject(h17686692708284905246, H17686692708284905246.j, d14731132657808549702, d147311326578085497022)) {
                    l13891208534469225493.invoke(h17686692708284905246.p());
                    return;
                }
            } while (unsafe2.getObjectVolatile(h17686692708284905246, j) == d14731132657808549702);
        }
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final F8228714002503597451 iterator() {
        H17686692708284905246 h17686692708284905246 = this.d;
        h17686692708284905246.getClass();
        return new F8228714002503597451(h17686692708284905246);
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final Object l(L9506193609949700881 l9506193609949700881) {
        H17686692708284905246 h17686692708284905246 = this.d;
        h17686692708284905246.getClass();
        return H17686692708284905246.G(h17686692708284905246, l9506193609949700881);
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final Object m() {
        return this.d.m();
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final Object n(R4833348786910499294 r4833348786910499294) {
        return this.d.n(r4833348786910499294);
    }

    @Override // dev.epro.r0.N13814068345032586384
    public final Object r(R4833348786910499294 r4833348786910499294, Object obj) {
        return this.d.r(r4833348786910499294, obj);
    }
}
