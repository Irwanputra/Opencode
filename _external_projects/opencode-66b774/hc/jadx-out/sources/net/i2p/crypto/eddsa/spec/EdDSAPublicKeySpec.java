package net.i2p.crypto.eddsa.spec;

import dev.epro.r0.S10973172697741180971;
import java.security.spec.KeySpec;
import net.i2p.crypto.eddsa.math.GroupElement;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class EdDSAPublicKeySpec implements KeySpec {
    private final GroupElement A;
    private GroupElement Aneg = null;
    private final EdDSAParameterSpec spec;

    public EdDSAPublicKeySpec(byte[] bArr, EdDSAParameterSpec edDSAParameterSpec) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 8) {
            S10973172697741180971.j("public-key length is wrong");
            throw null;
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
        GroupElement groupElementNegate = this.A.negate();
        this.Aneg = groupElementNegate;
        return groupElementNegate;
    }

    public EdDSAParameterSpec getParams() {
        return this.spec;
    }

    public EdDSAPublicKeySpec(GroupElement groupElement, EdDSAParameterSpec edDSAParameterSpec) {
        this.A = groupElement;
        this.spec = edDSAParameterSpec;
    }
}
