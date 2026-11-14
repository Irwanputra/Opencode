package dev.epro.r0;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H11662549649512977837 extends L15643109466764766419 {
    public final T16846362121353535418 j;
    public final J4250663911053539605 k;
    public final Integer l;

    public H11662549649512977837(T16846362121353535418 t16846362121353535418, J4250663911053539605 j4250663911053539605, Integer num) {
        this.j = t16846362121353535418;
        this.k = j4250663911053539605;
        this.l = num;
    }

    public static H11662549649512977837 e0(T16846362121353535418 t16846362121353535418, Integer num) throws GeneralSecurityException {
        J4250663911053539605 j4250663911053539605B;
        D14731132657808549702 d14731132657808549702 = t16846362121353535418.a;
        if (d14731132657808549702 == D14731132657808549702.d0) {
            if (num != null) {
                W4415201450379021245.c("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            j4250663911053539605B = H3219070247167520574.a;
        } else {
            if (d14731132657808549702 != D14731132657808549702.c0) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(d14731132657808549702)));
            }
            if (num == null) {
                W4415201450379021245.c("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            j4250663911053539605B = H3219070247167520574.b(num.intValue());
        }
        return new H11662549649512977837(t16846362121353535418, j4250663911053539605B, num);
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final Integer I() {
        return this.l;
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final T5990920249823963282 N() {
        return this.j;
    }

    @Override // dev.epro.r0.L15643109466764766419
    public final J4250663911053539605 d0() {
        return this.k;
    }
}
