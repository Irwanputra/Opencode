package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y421220047597273239 extends M8065676928355175142 {
    private volatile /* synthetic */ int consumed$volatile;
    public final E5386183571211952538 d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(Y421220047597273239.class, "consumed$volatile");
    }

    public /* synthetic */ Y421220047597273239(E5386183571211952538 e5386183571211952538) {
        this(e5386183571211952538, I3826119971291161142.a, -3, T1542296375665870064.a);
    }

    @Override // dev.epro.r0.M8065676928355175142
    public final String b() {
        return "channel=" + this.d;
    }

    @Override // dev.epro.r0.M8065676928355175142
    public final Object c(A2558500182237595544 a2558500182237595544, R4833348786910499294 r4833348786910499294) {
        Object objU = R7033599853981556291.u(new U8261505478335382944(a2558500182237595544), this.d, false, r4833348786910499294);
        return objU == Z3437138737604933638.a ? objU : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.M8065676928355175142, dev.epro.r0.J12043550928838212009
    public final Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294) {
        int i = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (i == -3) {
            Object objU = R7033599853981556291.u(s7864201625552763331, this.d, false, r4833348786910499294);
            if (objU == z3437138737604933638) {
                return objU;
            }
        } else {
            Object objCollect = super.collect(s7864201625552763331, r4833348786910499294);
            if (objCollect == z3437138737604933638) {
                return objCollect;
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.M8065676928355175142
    public final M8065676928355175142 d(G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        return new Y421220047597273239(this.d, g8001132634698687269, i, t1542296375665870064);
    }

    @Override // dev.epro.r0.M8065676928355175142
    public final J12043550928838212009 e() {
        return new Y421220047597273239(this.d);
    }

    @Override // dev.epro.r0.M8065676928355175142
    public final E5386183571211952538 f(W5797197595347441198 w5797197595347441198) {
        return this.b == -3 ? this.d : super.f(w5797197595347441198);
    }

    public Y421220047597273239(E5386183571211952538 e5386183571211952538, G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        super(g8001132634698687269, i, t1542296375665870064);
        this.d = e5386183571211952538;
        this.consumed$volatile = 0;
    }
}
