package dev.epro.r0;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E17338338377881930138 extends M13516036924505351271 {
    public final A17493290252326224231 j;
    public final J4250663911053539605 k;
    public final J4250663911053539605 l;
    public final Integer m;

    public E17338338377881930138(A17493290252326224231 a17493290252326224231, J4250663911053539605 j4250663911053539605, J4250663911053539605 j42506639110535396052, Integer num) {
        this.j = a17493290252326224231;
        this.k = j4250663911053539605;
        this.l = j42506639110535396052;
        this.m = num;
    }

    public static E17338338377881930138 e0(D14731132657808549702 d14731132657808549702, J4250663911053539605 j4250663911053539605, Integer num) {
        J4250663911053539605 a;
        byte[] bArr = j4250663911053539605.a;
        A17493290252326224231 a17493290252326224231 = new A17493290252326224231(d14731132657808549702);
        D14731132657808549702 d147311326578085497022 = D14731132657808549702.M;
        if (d14731132657808549702 != d147311326578085497022 && num == null) {
            throw new GeneralSecurityException(G6547577305291411977.s("For given Variant ", String.valueOf(d14731132657808549702), " the value of idRequirement must be non-null"));
        }
        if (d14731132657808549702 == d147311326578085497022 && num != null) {
            W4415201450379021245.c("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            throw new GeneralSecurityException(G6547577305291411977.n(bArr.length, "Ed25519 key must be constructed with key of length 32 bytes, not "));
        }
        if (d14731132657808549702 == d147311326578085497022) {
            a = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.K || d14731132657808549702 == D14731132657808549702.L) {
            a = H3219070247167520574.a(num.intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.J) {
                S10973172697741180971.m("Unknown Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            a = H3219070247167520574.b(num.intValue());
        }
        return new E17338338377881930138(a17493290252326224231, j4250663911053539605, a, num);
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final Integer I() {
        return this.m;
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final T5990920249823963282 N() {
        return this.j;
    }

    @Override // dev.epro.r0.M13516036924505351271
    public final J4250663911053539605 d0() {
        return this.l;
    }
}
