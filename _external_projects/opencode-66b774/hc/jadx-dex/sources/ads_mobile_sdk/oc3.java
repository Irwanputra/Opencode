package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class oc3 implements dev.epro.r0.Z15337348271744322997 {
    public final ads_mobile_sdk.gm2 a;
    public final java.util.concurrent.ExecutorService b;
    public final ads_mobile_sdk.vi3 c;

    public oc3(ads_mobile_sdk.gm2 gm2Var, java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.vi3 vi3Var) {
        this.a = gm2Var;
        this.b = executorService;
        this.c = vi3Var;
    }

    public final dev.epro.r0.H8027516537527559298 a() {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_GET_METADATA;
        final byte b = 1;
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new java.util.concurrent.Callable(this) { // from class: dev.epro.r0.B14005646809672080128
            public final /* synthetic */ ads_mobile_sdk.oc3 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                byte b2 = b;
                ads_mobile_sdk.oc3 oc3Var = this.b;
                switch (b2) {
                    case 0:
                        ads_mobile_sdk.gm2 gm2Var = oc3Var.a;
                        ads_mobile_sdk.rm2 rm2VarA = gm2Var.a(1);
                        if (rm2VarA == null) {
                            gm2Var.e.b(ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_GET_PROGRAM_BYTECODE_NOT_FOUND);
                            return null;
                        }
                        java.lang.String strR = rm2VarA.r().r();
                        java.io.File fileD = dev.epro.r0.L12240044716294895599.d(gm2Var.a(), strR, "pcam.jar");
                        fileD.getClass();
                        if (!fileD.exists()) {
                            fileD = dev.epro.r0.L12240044716294895599.d(gm2Var.a(), strR, "pcam");
                            fileD.getClass();
                        }
                        java.io.File fileD2 = dev.epro.r0.L12240044716294895599.d(gm2Var.a(), strR, "pcopt");
                        fileD2.getClass();
                        java.io.File fileD3 = dev.epro.r0.L12240044716294895599.d(gm2Var.a(), strR, "pcbc");
                        fileD3.getClass();
                        return new ads_mobile_sdk.fm2(rm2VarA.r(), fileD, fileD3, fileD2);
                    default:
                        ads_mobile_sdk.rm2 rm2VarA2 = oc3Var.a.a(1);
                        return rm2VarA2 == null ? ads_mobile_sdk.rm2.q() : rm2VarA2;
                }
            }
        }, this.b);
        this.c.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }

    public final dev.epro.r0.B6805403844224311194 c() {
        return dev.epro.r0.M9216324016624295870.J(java.lang.Boolean.TRUE);
    }

    public final dev.epro.r0.D16915945238461757356 a(ads_mobile_sdk.rm2 rm2Var, byte[] bArr) {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE;
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.L14212451929911798515(this, rm2Var, bArr, (byte) 3), this.b);
        this.c.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }

    public final dev.epro.r0.D16915945238461757356 a(ads_mobile_sdk.rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_UPDATE_VM_AND_PROGRAM_BYTECODE;
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.W4600430837258405808(this, rm2Var, bArr, bArr2), this.b);
        this.c.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }
}
