package net.i2p.crypto.eddsa.spec;

import java.security.spec.KeySpec;
import net.i2p.crypto.eddsa.math.GroupElement;

/* loaded from: /tmp/opencode/hc_real.dex */
public class EdDSAPublicKeySpec implements KeySpec {
    private final GroupElement A;
    private GroupElement Aneg = null;
    private final EdDSAParameterSpec spec;

    public EdDSAPublicKeySpec(GroupElement groupElement, EdDSAParameterSpec edDSAParameterSpec) {
        this.A = groupElement;
        this.spec = edDSAParameterSpec;
    }

    public EdDSAPublicKeySpec(byte[] bArr, EdDSAParameterSpec edDSAParameterSpec) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 8) {
            throw new IllegalArgumentException("public-key length is wrong");
        }
        this.A = new GroupElement(edDSAParameterSpec.getCurve(), bArr);
        this.spec = edDSAParameterSpec;
    }

    public GroupElement getA() {
        return this.A;
    }

    public GroupElement getNegativeA() {
        GroupElement groupElement = this.Aneg;
        if (groupElement != null) {
            return groupElement;
        }
        GroupElement negate = this.A.negate();
        this.Aneg = negate;
        return negate;
    }

    public EdDSAParameterSpec getParams() {
        return this.spec;
    }
}
