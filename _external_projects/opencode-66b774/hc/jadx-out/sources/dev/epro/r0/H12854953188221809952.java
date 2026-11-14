package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H12854953188221809952 extends X15704888339466534077 {
    public final E17338338377881930138 j;
    public final M9197813449740923653 k;

    public H12854953188221809952(E17338338377881930138 e17338338377881930138, M9197813449740923653 m9197813449740923653) {
        this.j = e17338338377881930138;
        this.k = m9197813449740923653;
    }

    public static H12854953188221809952 f0(E17338338377881930138 e17338338377881930138, M9197813449740923653 m9197813449740923653) throws GeneralSecurityException {
        J4250663911053539605 j4250663911053539605 = (J4250663911053539605) m9197813449740923653.b;
        if (j4250663911053539605.a.length != 32) {
            throw new GeneralSecurityException(G6547577305291411977.n(j4250663911053539605.a.length, "Ed25519 key must be constructed with key of length 32 bytes, not "));
        }
        if (Arrays.equals(e17338338377881930138.k.b(), D15445857918358799638.X(D15445857918358799638.H(j4250663911053539605.b())).R())) {
            return new H12854953188221809952(e17338338377881930138, m9197813449740923653);
        }
        W4415201450379021245.c("Ed25519 keys mismatch");
        return null;
    }

    @Override // dev.epro.r0.Z1953481206310471956
    public final T5990920249823963282 N() {
        return this.j.j;
    }

    @Override // dev.epro.r0.X15704888339466534077
    public final M13516036924505351271 e0() {
        return this.j;
    }
}
