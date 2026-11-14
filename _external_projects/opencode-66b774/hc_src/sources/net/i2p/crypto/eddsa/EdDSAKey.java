package net.i2p.crypto.eddsa;

import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public interface EdDSAKey {
    public static final String KEY_ALGORITHM = "EdDSA";

    EdDSAParameterSpec getParams();
}
