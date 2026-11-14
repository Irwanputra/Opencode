package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P6521802441400280983 extends M8065676928355175142 {
    public final J12043550928838212009 d;

    public P6521802441400280983(int i, T1542296375665870064 t1542296375665870064, G8001132634698687269 g8001132634698687269, J12043550928838212009 j12043550928838212009) {
        super(g8001132634698687269, i, t1542296375665870064);
        this.d = j12043550928838212009;
    }

    @Override // dev.epro.r0.M8065676928355175142
    public final Object c(A2558500182237595544 a2558500182237595544, R4833348786910499294 r4833348786910499294) {
        Object objI = i(new U8261505478335382944(a2558500182237595544), r4833348786910499294);
        return objI == Z3437138737604933638.a ? objI : O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // dev.epro.r0.M8065676928355175142, dev.epro.r0.J12043550928838212009
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(dev.epro.r0.S7864201625552763331 r6, dev.epro.r0.R4833348786910499294 r7) {
        /*
            r5 = this;
            int r0 = r5.b
            r1 = -3
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L6f
            dev.epro.r0.G8001132634698687269 r0 = r7.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            dev.epro.r0.X4712621039624176170 r3 = new dev.epro.r0.X4712621039624176170
            r4 = 25
            r3.<init>(r4)
            dev.epro.r0.G8001132634698687269 r4 = r5.a
            java.lang.Object r1 = r4.fold(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
            dev.epro.r0.G8001132634698687269 r1 = r0.plus(r4)
            goto L2c
        L27:
            r1 = 0
            dev.epro.r0.G8001132634698687269 r1 = dev.epro.r0.E12775674050813925581.x(r0, r4, r1)
        L2c:
            boolean r3 = dev.epro.r0.S10823041268949770285.t(r1, r0)
            if (r3 == 0) goto L39
            java.lang.Object r5 = r5.i(r6, r7)
            if (r5 != r2) goto L76
            return r5
        L39:
            dev.epro.r0.T13350664027331345869 r3 = dev.epro.r0.T13350664027331345869.s
            dev.epro.r0.H7323971265464188398 r4 = r1.get(r3)
            dev.epro.r0.H7323971265464188398 r0 = r0.get(r3)
            boolean r0 = dev.epro.r0.S10823041268949770285.t(r4, r0)
            if (r0 == 0) goto L6f
            dev.epro.r0.G8001132634698687269 r0 = r7.getContext()
            boolean r3 = r6 instanceof dev.epro.r0.U8261505478335382944
            if (r3 != 0) goto L5c
            boolean r3 = r6 instanceof dev.epro.r0.A17905745867001606746
            if (r3 == 0) goto L56
            goto L5c
        L56:
            dev.epro.r0.J4301161590161457380 r3 = new dev.epro.r0.J4301161590161457380
            r3.<init>(r6, r0)
            r6 = r3
        L5c:
            dev.epro.r0.Y14354959068095823168 r0 = new dev.epro.r0.Y14354959068095823168
            r3 = 0
            r4 = 10
            r0.<init>(r5, r3, r4)
            java.lang.Object r5 = dev.epro.r0.S10823041268949770285.a0(r1)
            java.lang.Object r5 = dev.epro.r0.C775827382551829194.d0(r1, r6, r5, r0, r7)
            if (r5 != r2) goto L76
            return r5
        L6f:
            java.lang.Object r5 = super.collect(r6, r7)
            if (r5 != r2) goto L76
            return r5
        L76:
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P6521802441400280983.collect(dev.epro.r0.S7864201625552763331, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public Object i(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294) {
        Object objCollect = this.d.collect(s7864201625552763331, r4833348786910499294);
        return objCollect == Z3437138737604933638.a ? objCollect : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.M8065676928355175142
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
