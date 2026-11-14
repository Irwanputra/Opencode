package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O12229768880637238015 {
    public static final P5124777957357031757 d;
    public static final P5124777957357031757 e;
    public static final P5124777957357031757 f;
    public static final P5124777957357031757 g;
    public static final P5124777957357031757 h;
    public static final P5124777957357031757 i;
    public final P5124777957357031757 a;
    public final P5124777957357031757 b;
    public final int c;

    static {
        P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
        d = J3301701597851028733.u(":");
        e = J3301701597851028733.u(":status");
        f = J3301701597851028733.u(":method");
        g = J3301701597851028733.u(":path");
        h = J3301701597851028733.u(":scheme");
        i = J3301701597851028733.u(":authority");
    }

    public O12229768880637238015(P5124777957357031757 p5124777957357031757, P5124777957357031757 p51247779573570317572) {
        p5124777957357031757.getClass();
        p51247779573570317572.getClass();
        this.a = p5124777957357031757;
        this.b = p51247779573570317572;
        this.c = p51247779573570317572.b() + p5124777957357031757.b() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O12229768880637238015)) {
            return false;
        }
        O12229768880637238015 o12229768880637238015 = (O12229768880637238015) obj;
        return S10823041268949770285.t(this.a, o12229768880637238015.a) && S10823041268949770285.t(this.b, o12229768880637238015.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.l() + ": " + this.b.l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O12229768880637238015(String str, String str2) {
        this(J3301701597851028733.u(str), J3301701597851028733.u(str2));
        P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O12229768880637238015(P5124777957357031757 p5124777957357031757, String str) {
        this(p5124777957357031757, J3301701597851028733.u(str));
        p5124777957357031757.getClass();
        str.getClass();
        P5124777957357031757 p51247779573570317572 = P5124777957357031757.d;
    }
}
