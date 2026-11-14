package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K1668948882989868493 implements I1722681268793429505 {
    public final I1722681268793429505 a;
    public final I1722681268793429505 b;

    public K1668948882989868493(I1722681268793429505 i1722681268793429505, I1722681268793429505 i17226812687934295052) {
        this.a = i1722681268793429505;
        this.b = i17226812687934295052;
    }

    @Override // dev.epro.r0.I1722681268793429505
    public final Object b(L12639328004344855510 l12639328004344855510, Object obj) {
        return this.b.b(l12639328004344855510, this.a.b(l12639328004344855510, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K1668948882989868493)) {
            return false;
        }
        K1668948882989868493 k1668948882989868493 = (K1668948882989868493) obj;
        return this.a.equals(k1668948882989868493.a) && S10823041268949770285.t(this.b, k1668948882989868493.b);
    }

    @Override // dev.epro.r0.I1722681268793429505
    public final boolean g(F4096073349764486348 f4096073349764486348) {
        return this.a.g(f4096073349764486348) && this.b.g(f4096073349764486348);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) b(new H4191455248956457601((byte) 17), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
