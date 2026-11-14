package dev.epro.r0;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F12537504531154619859 extends U12539945048130217525 implements Serializable {
    public final SecureRandom c;

    public F12537504531154619859(SecureRandom secureRandom) {
        this.c = secureRandom;
    }

    @Override // dev.epro.r0.U12539945048130217525
    public final Random j() {
        return this.c;
    }
}
