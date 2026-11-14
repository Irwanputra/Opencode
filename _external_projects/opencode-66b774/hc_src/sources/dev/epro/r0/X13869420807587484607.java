package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X13869420807587484607 {
    public final String a;
    public final P8646985343900033725 b;

    public X13869420807587484607(String str, P8646985343900033725 p8646985343900033725) {
        this.a = str;
        this.b = p8646985343900033725;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X13869420807587484607)) {
            return false;
        }
        X13869420807587484607 x13869420807587484607 = (X13869420807587484607) obj;
        return this.a.equals(x13869420807587484607.a) && this.b.equals(x13869420807587484607.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
