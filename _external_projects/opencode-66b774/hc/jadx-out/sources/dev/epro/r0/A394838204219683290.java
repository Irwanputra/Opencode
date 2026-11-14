package dev.epro.r0;

import ads_mobile_sdk.f7;
import ads_mobile_sdk.qc3;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.vi3;
import ads_mobile_sdk.yk0;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A394838204219683290 implements R3171298526896875739 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ A394838204219683290(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // dev.epro.r0.R3171298526896875739
    public final D16915945238461757356 apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                qc3 qc3Var = (qc3) obj3;
                vi3 vi3Var = qc3Var.d;
                yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA;
                H8027516537527559298 h8027516537527559298A = qc3Var.a.a((rm2) obj2);
                vi3Var.a(yk0Var, (L7743116545240101509) h8027516537527559298A);
                return h8027516537527559298A;
            case 1:
                qc3 qc3Var2 = (qc3) obj3;
                vi3 vi3Var2 = qc3Var2.d;
                yk0 yk0Var2 = yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA;
                H8027516537527559298 h8027516537527559298A2 = qc3Var2.a.a((rm2) obj2);
                vi3Var2.a(yk0Var2, (L7743116545240101509) h8027516537527559298A2);
                return h8027516537527559298A2;
            default:
                return ((K17751841687800543607) ((f7) obj3).b.f.get()).a((Context) obj2);
        }
    }
}
