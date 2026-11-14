package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q3521869144606538118 implements M15459437176959963354 {
    public final M15459437176959963354 a;
    public final long b;

    public Q3521869144606538118(A10693687560045094360 a10693687560045094360, long j) {
        this.a = a10693687560045094360;
        this.b = j;
    }

    @Override // dev.epro.r0.M15459437176959963354
    public final V9266657454036696449 a(R3937090736490516115 r3937090736490516115) {
        return new Z1105243899363477492(this.a.a(r3937090736490516115), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q3521869144606538118)) {
            return false;
        }
        Q3521869144606538118 q3521869144606538118 = (Q3521869144606538118) obj;
        return q3521869144606538118.b == this.b && S10823041268949770285.t(q3521869144606538118.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
