package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S14520841167617591865 implements M15459437176959963354 {
    public final N12402914283838705413 a;
    public final T14358595426441148744 b;

    public S14520841167617591865(N12402914283838705413 n12402914283838705413, T14358595426441148744 t14358595426441148744) {
        this.a = n12402914283838705413;
        this.b = t14358595426441148744;
        if (n12402914283838705413 instanceof J15264501749816156841) {
            J15264501749816156841 j15264501749816156841 = (J15264501749816156841) n12402914283838705413;
            if (j15264501749816156841.a != 0 || j15264501749816156841.b != 0) {
                return;
            }
        } else if (n12402914283838705413 instanceof B10503278808216759809) {
            if (((B10503278808216759809) n12402914283838705413).a != 0) {
                return;
            }
        } else if (!(n12402914283838705413 instanceof P14774717930487319108) || ((P14774717930487319108) n12402914283838705413).a.a != 0) {
            return;
        }
        S10973172697741180971.j("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // dev.epro.r0.M15459437176959963354
    public final V9266657454036696449 a(R3937090736490516115 r3937090736490516115) {
        return new L405259260506140193(this.a.a(r3937090736490516115), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S14520841167617591865)) {
            return false;
        }
        S14520841167617591865 s14520841167617591865 = (S14520841167617591865) obj;
        return s14520841167617591865.a.equals(this.a) && s14520841167617591865.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
