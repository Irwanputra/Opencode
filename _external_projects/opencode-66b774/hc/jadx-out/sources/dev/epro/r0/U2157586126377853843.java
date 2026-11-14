package dev.epro.r0;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U2157586126377853843 extends Z1953481206310471956 {
    public final I1581330382723795749 j;

    public U2157586126377853843(I1581330382723795749 i1581330382723795749) {
        this.j = i1581330382723795749;
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final Integer I() {
        return (Integer) this.j.e;
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final T5990920249823963282 N() {
        I1581330382723795749 i1581330382723795749 = this.j;
        return new H8672454968185340994((String) i1581330382723795749.a, (D14731132657808549702) i1581330382723795749.d);
    }

    public final J4250663911053539605 d0() throws GeneralSecurityException {
        I1581330382723795749 i1581330382723795749 = this.j;
        D14731132657808549702 d14731132657808549702 = (D14731132657808549702) i1581330382723795749.d;
        Integer num = (Integer) i1581330382723795749.e;
        if (d14731132657808549702 == D14731132657808549702.m0) {
            return J4250663911053539605.a(new byte[0]);
        }
        if (d14731132657808549702 == D14731132657808549702.k0) {
            return H3219070247167520574.b(num.intValue());
        }
        if (d14731132657808549702 == D14731132657808549702.l0 || d14731132657808549702 == D14731132657808549702.n0) {
            return H3219070247167520574.a(num.intValue());
        }
        W4415201450379021245.c("Unknown output prefix type");
        return null;
    }
}
