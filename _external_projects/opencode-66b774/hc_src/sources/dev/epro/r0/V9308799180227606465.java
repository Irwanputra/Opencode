package dev.epro.r0;

import ads_mobile_sdk.km2;
import ads_mobile_sdk.oc3;
import ads_mobile_sdk.vi3;
import ads_mobile_sdk.w53;
import ads_mobile_sdk.yk0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class V9308799180227606465 implements R3171298526896875739 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ V9308799180227606465(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.R3171298526896875739
    public final D16915945238461757356 apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((km2) obj2).c.a();
            default:
                oc3 oc3Var = ((w53) obj2).b;
                vi3 vi3Var = oc3Var.c;
                yk0 yk0Var = yk0.EVENT_ID_DG_STORAGE_GET_PROGRAM;
                H8027516537527559298 X = M9216324016624295870.X(new B14005646809672080128(oc3Var, (byte) 0), oc3Var.b);
                vi3Var.a(yk0Var, (L7743116545240101509) X);
                return X;
        }
    }
}
