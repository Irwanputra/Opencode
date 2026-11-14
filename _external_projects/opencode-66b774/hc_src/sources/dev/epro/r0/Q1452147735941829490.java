package dev.epro.r0;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q1452147735941829490 extends L15643109466764766419 {
    public final Q17410559678825476760 j;
    public final J4250663911053539605 k;
    public final Integer l;

    public Q1452147735941829490(Q17410559678825476760 q17410559678825476760, J4250663911053539605 j4250663911053539605, Integer num) {
        this.j = q17410559678825476760;
        this.k = j4250663911053539605;
        this.l = num;
    }

    public static Q1452147735941829490 e0(Q17410559678825476760 q17410559678825476760, Integer num) {
        J4250663911053539605 a;
        D14731132657808549702 d14731132657808549702 = q17410559678825476760.b;
        if (d14731132657808549702 == D14731132657808549702.U) {
            if (num == null) {
                W4415201450379021245.c("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            a = J4250663911053539605.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (d14731132657808549702 != D14731132657808549702.V) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(d14731132657808549702)));
            }
            if (num != null) {
                W4415201450379021245.c("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            a = J4250663911053539605.a(new byte[0]);
        }
        return new Q1452147735941829490(q17410559678825476760, a, num);
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
