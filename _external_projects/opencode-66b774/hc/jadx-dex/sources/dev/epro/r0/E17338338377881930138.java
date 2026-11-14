package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E17338338377881930138 extends dev.epro.r0.M13516036924505351271 {
    public final dev.epro.r0.A17493290252326224231 j;
    public final dev.epro.r0.J4250663911053539605 k;
    public final dev.epro.r0.J4250663911053539605 l;
    public final java.lang.Integer m;

    public E17338338377881930138(dev.epro.r0.A17493290252326224231 a17493290252326224231, dev.epro.r0.J4250663911053539605 j4250663911053539605, dev.epro.r0.J4250663911053539605 j42506639110535396052, java.lang.Integer num) {
        this.j = a17493290252326224231;
        this.k = j4250663911053539605;
        this.l = j42506639110535396052;
        this.m = num;
    }

    public static dev.epro.r0.E17338338377881930138 e0(dev.epro.r0.D14731132657808549702 d14731132657808549702, dev.epro.r0.J4250663911053539605 j4250663911053539605, java.lang.Integer num) throws java.security.GeneralSecurityException {
        dev.epro.r0.J4250663911053539605 j4250663911053539605A;
        byte[] bArr = j4250663911053539605.a;
        dev.epro.r0.A17493290252326224231 a17493290252326224231 = new dev.epro.r0.A17493290252326224231(d14731132657808549702);
        dev.epro.r0.D14731132657808549702 d147311326578085497022 = dev.epro.r0.D14731132657808549702.M;
        if (d14731132657808549702 != d147311326578085497022 && num == null) {
            throw new java.security.GeneralSecurityException(dev.epro.r0.G6547577305291411977.s("For given Variant ", java.lang.String.valueOf(d14731132657808549702), " the value of idRequirement must be non-null"));
        }
        if (d14731132657808549702 == d147311326578085497022 && num != null) {
            dev.epro.r0.W4415201450379021245.c("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            throw new java.security.GeneralSecurityException(dev.epro.r0.G6547577305291411977.n(bArr.length, "Ed25519 key must be constructed with key of length 32 bytes, not "));
        }
        if (d14731132657808549702 == d147311326578085497022) {
            j4250663911053539605A = dev.epro.r0.H3219070247167520574.a;
        } else if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.K || d14731132657808549702 == dev.epro.r0.D14731132657808549702.L) {
            j4250663911053539605A = dev.epro.r0.H3219070247167520574.a(num.intValue());
        } else {
            if (d14731132657808549702 != dev.epro.r0.D14731132657808549702.J) {
                dev.epro.r0.S10973172697741180971.m("Unknown Variant: ".concat(java.lang.String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605A = dev.epro.r0.H3219070247167520574.b(num.intValue());
        }
        return new dev.epro.r0.E17338338377881930138(a17493290252326224231, j4250663911053539605, j4250663911053539605A, num);
    }

    public final java.lang.Integer I() {
        return this.m;
    }

    public final dev.epro.r0.T5990920249823963282 N() {
        return this.j;
    }

    public final dev.epro.r0.J4250663911053539605 d0() {
        return this.l;
    }
}
