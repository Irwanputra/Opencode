package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O10635330630771259783 extends H5732944296146006561 {
    public final D14731132657808549702 a;
    public final H5270339962551858100 b;
    public final D14731132657808549702 c;
    public final D14731132657808549702 d;

    public O10635330630771259783(D14731132657808549702 d14731132657808549702, H5270339962551858100 h5270339962551858100, D14731132657808549702 d147311326578085497022, D14731132657808549702 d147311326578085497023) {
        this.a = d14731132657808549702;
        this.b = h5270339962551858100;
        this.c = d147311326578085497022;
        this.d = d147311326578085497023;
    }

    public static J15730374346044043770 b() {
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((byte) 8, false);
        j15730374346044043770.c = null;
        j15730374346044043770.d = null;
        j15730374346044043770.e = null;
        j15730374346044043770.b = D14731132657808549702.I;
        return j15730374346044043770;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.d != D14731132657808549702.I;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O10635330630771259783)) {
            return false;
        }
        O10635330630771259783 o10635330630771259783 = (O10635330630771259783) obj;
        return o10635330630771259783.a == this.a && o10635330630771259783.b == this.b && o10635330630771259783.c == this.c && o10635330630771259783.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(O10635330630771259783.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.c);
        return G6547577305291411977.w(G6547577305291411977.y("ECDSA Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", encoding: "), String.valueOf(this.a), ", curve: ", String.valueOf(this.b), ")");
    }
}
