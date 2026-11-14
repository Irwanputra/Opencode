package ads_mobile_sdk;

import dev.epro.r0.U1864172318023436692;
import dev.epro.r0.Z3383101362411723454;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mz2 extends U1864172318023436692 {
    public final oz2 a;
    public jq b;

    public mz2(pz2 pz2Var) {
        super((byte) 2);
        oz2 oz2Var = new oz2(pz2Var);
        this.a = oz2Var;
        this.b = oz2Var.hasNext() ? new jq(oz2Var.next()) : null;
    }

    @Override // dev.epro.r0.U1864172318023436692
    public final byte a() {
        jq jqVar = this.b;
        if (jqVar == null) {
            Z3383101362411723454.u();
            return (byte) 0;
        }
        byte bA = jqVar.a();
        if (!this.b.hasNext()) {
            oz2 oz2Var = this.a;
            this.b = oz2Var.hasNext() ? new jq(oz2Var.next()) : null;
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
