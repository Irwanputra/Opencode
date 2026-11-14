package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J4075899935222861919 extends H5732944296146006561 {
    public final int a;
    public final int b;
    public final D14731132657808549702 c;

    public J4075899935222861919(int i, int i2, D14731132657808549702 d14731132657808549702) {
        this.a = i;
        this.b = i2;
        this.c = d14731132657808549702;
    }

    public static Q7316561721656982910 b() {
        Q7316561721656982910 q7316561721656982910 = new Q7316561721656982910((byte) 3, false);
        q7316561721656982910.b = null;
        q7316561721656982910.c = null;
        q7316561721656982910.d = D14731132657808549702.f;
        return q7316561721656982910;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.c != D14731132657808549702.f;
    }

    public final int c() {
        D14731132657808549702 d14731132657808549702 = D14731132657808549702.f;
        int i = this.b;
        D14731132657808549702 d147311326578085497022 = this.c;
        if (d147311326578085497022 == d14731132657808549702) {
            return i;
        }
        if (d147311326578085497022 == D14731132657808549702.c) {
            return i + 5;
        }
        if (d147311326578085497022 == D14731132657808549702.d) {
            return i + 5;
        }
        if (d147311326578085497022 == D14731132657808549702.e) {
            return i + 5;
        }
        S10973172697741180971.m("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J4075899935222861919)) {
            return false;
        }
        J4075899935222861919 j4075899935222861919 = (J4075899935222861919) obj;
        return j4075899935222861919.a == this.a && j4075899935222861919.c() == c() && j4075899935222861919.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(J4075899935222861919.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return E12098517352909843120.n(G6547577305291411977.x(this.b, "AES-CMAC Parameters (variant: ", String.valueOf(this.c), ", ", "-byte tags, and "), this.a, "-byte key)");
    }
}
