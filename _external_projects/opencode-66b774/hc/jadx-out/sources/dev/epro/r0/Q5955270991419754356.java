package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q5955270991419754356 extends R15896830329318850690 implements D10205225622993155321 {
    public static final J9175738298638467342 r = new J9175738298638467342();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E13074456978433253839 f455o;
    public V12816289154094534935 p;
    public R7000310675073492254 q;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(j);
        return i5164649337253478959.m(z17471428274427141949D.a, z17471428274427141949D.b, X9852054718446117252.a, new Y17164194448930251553(z17471428274427141949D, (byte) 9));
    }

    public final boolean h1(Q14128584391259813747 q14128584391259813747, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.q != R7000310675073492254.a) {
                }
            } else if (i != 1 && i != 2) {
                S10973172697741180971.m("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (i1(i) ? q14128584391259813747.a > 0 : q14128584391259813747.b < this.f455o.a() - 1) {
                return true;
            }
        } else if (this.q != R7000310675073492254.b) {
            if (i1(i)) {
            }
        }
        return false;
    }

    public final boolean i1(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = R7033599853981556291.R(this).z.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            Z3383101362411723454.g();
            return false;
        }
        if (i != 4) {
            S10973172697741180971.m("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = R7033599853981556291.R(this).z.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        Z3383101362411723454.g();
        return false;
    }
}
