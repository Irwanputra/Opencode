package ads_mobile_sdk;

import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.K17751841687800543607;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N5587541019643124865;
import dev.epro.r0.R3171298526896875739;
import dev.epro.r0.U6389045311587420009;
import dev.epro.r0.Z886113521968091188;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ca3 implements R3171298526896875739 {
    public final /* synthetic */ da3 a;

    public ca3(da3 da3Var) {
        this.a = da3Var;
    }

    @Override // dev.epro.r0.R3171298526896875739
    public final D16915945238461757356 apply(Object obj) {
        K17751841687800543607 k17751841687800543607 = (K17751841687800543607) obj;
        if (k17751841687800543607 != null) {
            return M9216324016624295870.J(k17751841687800543607);
        }
        da3 da3Var = this.a;
        da3Var.f.b(yk0.EVENT_ID_INIT_FALLBACK_TO_DEFAULT_COLLECTOR);
        return B11509606741455062017.r(I13152720973475179368.q(M9216324016624295870.X(new N5587541019643124865(da3Var, da3Var.g), da3Var.e)), new U6389045311587420009(), Z886113521968091188.a);
    }
}
