package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q5955270991419754356 extends R15896830329318850690 implements D10205225622993155321 {
    public static final J9175738298638467342 r = new J9175738298638467342();

    /* renamed from: o, reason: collision with root package name */
    public E13074456978433253839 f455o;
    public V12816289154094534935 p;
    public R7000310675073492254 q;

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        Z17471428274427141949 d = g17613326942144185441.d(j);
        return i5164649337253478959.m(d.a, d.b, X9852054718446117252.a, new Y17164194448930251553(d, (byte) 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.q == dev.epro.r0.R7000310675073492254.a) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.q == dev.epro.r0.R7000310675073492254.b) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h1(dev.epro.r0.Q14128584391259813747 r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L6
            goto L9
        L6:
            r0 = 6
            if (r6 != r0) goto L10
        L9:
            dev.epro.r0.R7000310675073492254 r0 = r4.q
            dev.epro.r0.R7000310675073492254 r3 = dev.epro.r0.R7000310675073492254.b
            if (r0 != r3) goto L24
            goto L3b
        L10:
            r0 = 3
            if (r6 != r0) goto L14
            goto L17
        L14:
            r0 = 4
            if (r6 != r0) goto L1e
        L17:
            dev.epro.r0.R7000310675073492254 r0 = r4.q
            dev.epro.r0.R7000310675073492254 r3 = dev.epro.r0.R7000310675073492254.a
            if (r0 != r3) goto L24
            goto L3b
        L1e:
            if (r6 != r2) goto L21
            goto L24
        L21:
            r0 = 2
            if (r6 != r0) goto L3c
        L24:
            boolean r6 = r4.i1(r6)
            if (r6 == 0) goto L36
            int r5 = r5.b
            dev.epro.r0.E13074456978433253839 r4 = r4.f455o
            int r4 = r4.a()
            int r4 = r4 - r2
            if (r5 >= r4) goto L3b
            goto L3a
        L36:
            int r4 = r5.a
            if (r4 <= 0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        L3c:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q5955270991419754356.h1(dev.epro.r0.Q14128584391259813747, int):boolean");
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
            int ordinal = R7033599853981556291.R(this).z.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            Z3383101362411723454.g();
            return false;
        }
        if (i != 4) {
            S10973172697741180971.m("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = R7033599853981556291.R(this).z.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        Z3383101362411723454.g();
        return false;
    }
}
