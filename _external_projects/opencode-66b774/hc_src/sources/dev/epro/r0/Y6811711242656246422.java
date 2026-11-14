package dev.epro.r0;

import ads_mobile_sdk.yk0;
import ads_mobile_sdk.yl0;
import ads_mobile_sdk.ym3;
import ads_mobile_sdk.zm3;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class Y6811711242656246422 implements R3171298526896875739 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zm3 b;

    public /* synthetic */ Y6811711242656246422(zm3 zm3Var, byte b) {
        this.a = b;
        this.b = zm3Var;
    }

    @Override // dev.epro.r0.R3171298526896875739
    public final D16915945238461757356 apply(Object obj) {
        byte b = this.a;
        zm3 zm3Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    return zm3Var.c(0);
                }
                zm3Var.d.b(yk0.EVENT_ID_PRIMARY_UPDATE_PROGRAM_NOOP_LOCAL_PROGRAM_STILL_VALID);
                return M9216324016624295870.J(ym3.b);
            default:
                yl0 yl0Var = (yl0) obj;
                Z15337348271744322997 z15337348271744322997 = zm3Var.c;
                if (yl0Var.q$1() == 2) {
                    return z15337348271744322997.a(yl0Var.p(), yl0Var.o().c());
                }
                if (yl0Var.q$1() == 3) {
                    return z15337348271744322997.a(yl0Var.p(), yl0Var.r().c(), yl0Var.o().c());
                }
                throw new AssertionError("Unreachable");
        }
    }
}
