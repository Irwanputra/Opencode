package net.i2p.crypto.eddsa.spec;

import net.i2p.crypto.eddsa.math.Curve;
import net.i2p.crypto.eddsa.math.GroupElement;
import net.i2p.crypto.eddsa.math.ScalarOps;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class EdDSANamedCurveSpec extends EdDSAParameterSpec {
    private final String name;

    public EdDSANamedCurveSpec(String str, Curve curve, String str2, ScalarOps scalarOps, GroupElement groupElement) {
        super(curve, str2, scalarOps, groupElement);
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
