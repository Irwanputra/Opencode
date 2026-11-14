package dev.epro.r0;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X17251871386643959137 extends L15643109466764766419 {
    public final H358978911853820691 j;
    public final M9197813449740923653 k;
    public final J4250663911053539605 l;
    public final Integer m;

    public X17251871386643959137(H358978911853820691 h358978911853820691, M9197813449740923653 m9197813449740923653, J4250663911053539605 j4250663911053539605, Integer num) {
        this.j = h358978911853820691;
        this.k = m9197813449740923653;
        this.l = j4250663911053539605;
        this.m = num;
    }

    public static X17251871386643959137 e0(D14731132657808549702 d14731132657808549702, M9197813449740923653 m9197813449740923653, Integer num) throws GeneralSecurityException {
        J4250663911053539605 j4250663911053539605B;
        J4250663911053539605 j4250663911053539605 = (J4250663911053539605) m9197813449740923653.b;
        D14731132657808549702 d147311326578085497022 = D14731132657808549702.B0;
        if (d14731132657808549702 != d147311326578085497022 && num == null) {
            throw new GeneralSecurityException(G6547577305291411977.s("For given Variant ", String.valueOf(d14731132657808549702), " the value of idRequirement must be non-null"));
        }
        if (d14731132657808549702 == d147311326578085497022 && num != null) {
            W4415201450379021245.c("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (j4250663911053539605.a.length != 32) {
            throw new GeneralSecurityException(G6547577305291411977.n(j4250663911053539605.a.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        H358978911853820691 h358978911853820691 = new H358978911853820691(d14731132657808549702);
        if (d14731132657808549702 == d147311326578085497022) {
            j4250663911053539605B = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.A0) {
            j4250663911053539605B = H3219070247167520574.a(num.intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.z0) {
                S10973172697741180971.m("Unknown Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605B = H3219070247167520574.b(num.intValue());
        }
        return new X17251871386643959137(h358978911853820691, m9197813449740923653, j4250663911053539605B, num);
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final Integer I() {
        return this.m;
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final T5990920249823963282 N() {
        return this.j;
    }

    @Override // dev.epro.r0.L15643109466764766419
    public final J4250663911053539605 d0() {
        return this.l;
    }
}
