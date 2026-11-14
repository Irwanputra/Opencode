package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B4739506393801054036 extends Y14161449526678499798 implements L13148442655056575112 {
    public final B13729205492206812220 b;
    public final L9201360080215238538 c;
    public Y5595560268505326605 d = new Y5595560268505326605(D459204867321966484.h().g());

    public B4739506393801054036(B13729205492206812220 b13729205492206812220, L9201360080215238538 l9201360080215238538) {
        this.b = b13729205492206812220;
        this.c = l9201360080215238538;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 a() {
        return this.d;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final void c(T9533098554585011700 t9533098554585011700) {
        this.d = (Y5595560268505326605) t9533098554585011700;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Y5595560268505326605 g(dev.epro.r0.Y5595560268505326605 r21, dev.epro.r0.M4722199849958580248 r22, boolean r23, dev.epro.r0.B13729205492206812220 r24) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B4739506393801054036.g(dev.epro.r0.Y5595560268505326605, dev.epro.r0.M4722199849958580248, boolean, dev.epro.r0.B13729205492206812220):dev.epro.r0.Y5595560268505326605");
    }

    @Override // dev.epro.r0.L13148442655056575112
    public final Object getValue() {
        F4096073349764486348 f4096073349764486348E = D459204867321966484.h().e();
        if (f4096073349764486348E != null) {
            f4096073349764486348E.invoke(this);
        }
        M4722199849958580248 m4722199849958580248H = D459204867321966484.h();
        return g((Y5595560268505326605) D459204867321966484.g(this.d, m4722199849958580248H), m4722199849958580248H, true, this.b).f;
    }

    public final Y5595560268505326605 h() {
        M4722199849958580248 m4722199849958580248H = D459204867321966484.h();
        return g((Y5595560268505326605) D459204867321966484.g(this.d, m4722199849958580248H), m4722199849958580248H, false, this.b);
    }

    public final String toString() {
        Y5595560268505326605 y5595560268505326605 = (Y5595560268505326605) D459204867321966484.f(this.d);
        return "DerivedState(value=" + (y5595560268505326605.d(this, D459204867321966484.h()) ? String.valueOf(y5595560268505326605.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
