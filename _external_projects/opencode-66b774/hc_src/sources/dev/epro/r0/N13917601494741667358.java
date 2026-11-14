package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N13917601494741667358 extends H5732944296146006561 {
    public final int a;
    public final int b;
    public final D14731132657808549702 c;
    public final K18164101509571580779 d;

    public N13917601494741667358(int i, int i2, D14731132657808549702 d14731132657808549702, K18164101509571580779 k18164101509571580779) {
        this.a = i;
        this.b = i2;
        this.c = d14731132657808549702;
        this.d = k18164101509571580779;
    }

    public static J15730374346044043770 b() {
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((byte) 10, false);
        j15730374346044043770.b = null;
        j15730374346044043770.c = null;
        j15730374346044043770.d = null;
        j15730374346044043770.e = D14731132657808549702.Q;
        return j15730374346044043770;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.c != D14731132657808549702.Q;
    }

    public final int c() {
        D14731132657808549702 d14731132657808549702 = D14731132657808549702.Q;
        int i = this.b;
        D14731132657808549702 d147311326578085497022 = this.c;
        if (d147311326578085497022 == d14731132657808549702) {
            return i;
        }
        if (d147311326578085497022 == D14731132657808549702.N) {
            return i + 5;
        }
        if (d147311326578085497022 == D14731132657808549702.O) {
            return i + 5;
        }
        if (d147311326578085497022 == D14731132657808549702.P) {
            return i + 5;
        }
        S10973172697741180971.m("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N13917601494741667358)) {
            return false;
        }
        N13917601494741667358 n13917601494741667358 = (N13917601494741667358) obj;
        return n13917601494741667358.a == this.a && n13917601494741667358.c() == c() && n13917601494741667358.c == this.c && n13917601494741667358.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(N13917601494741667358.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder y = G6547577305291411977.y("HMAC Parameters (variant: ", String.valueOf(this.c), ", hashType: ", String.valueOf(this.d), ", ");
        y.append(this.b);
        y.append("-byte tags, and ");
        y.append(this.a);
        y.append("-byte key)");
        return y.toString();
    }
}
