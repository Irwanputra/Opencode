package dev.epro.r0;

import ads_mobile_sdk.fm2;
import ads_mobile_sdk.gm2;
import ads_mobile_sdk.oc3;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.yk0;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B14005646809672080128 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc3 b;

    public /* synthetic */ B14005646809672080128(oc3 oc3Var, byte b) {
        this.a = b;
        this.b = oc3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        oc3 oc3Var = this.b;
        switch (b) {
            case 0:
                gm2 gm2Var = oc3Var.a;
                rm2 rm2VarA = gm2Var.a(1);
                if (rm2VarA == null) {
                    gm2Var.e.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_GET_PROGRAM_BYTECODE_NOT_FOUND);
                    return null;
                }
                String strR = rm2VarA.r().r();
                File fileD = L12240044716294895599.d(gm2Var.a(), strR, "pcam.jar");
                fileD.getClass();
                if (!fileD.exists()) {
                    fileD = L12240044716294895599.d(gm2Var.a(), strR, "pcam");
                    fileD.getClass();
                }
                File fileD2 = L12240044716294895599.d(gm2Var.a(), strR, "pcopt");
                fileD2.getClass();
                File fileD3 = L12240044716294895599.d(gm2Var.a(), strR, "pcbc");
                fileD3.getClass();
                return new fm2(rm2VarA.r(), fileD, fileD3, fileD2);
            default:
                rm2 rm2VarA2 = oc3Var.a.a(1);
                return rm2VarA2 == null ? rm2.q() : rm2VarA2;
        }
    }
}
