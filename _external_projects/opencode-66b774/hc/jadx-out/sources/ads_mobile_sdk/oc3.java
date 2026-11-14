package ads_mobile_sdk;

import dev.epro.r0.B14005646809672080128;
import dev.epro.r0.B6805403844224311194;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.L14212451929911798515;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.W4600430837258405808;
import dev.epro.r0.Z15337348271744322997;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class oc3 implements Z15337348271744322997 {
    public final gm2 a;
    public final ExecutorService b;
    public final vi3 c;

    public oc3(gm2 gm2Var, ExecutorService executorService, vi3 vi3Var) {
        this.a = gm2Var;
        this.b = executorService;
        this.c = vi3Var;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final H8027516537527559298 a() {
        yk0 yk0Var = yk0.EVENT_ID_DG_STORAGE_GET_METADATA;
        H8027516537527559298 h8027516537527559298X = M9216324016624295870.X(new B14005646809672080128(this, (byte) 1), this.b);
        this.c.a(yk0Var, (L7743116545240101509) h8027516537527559298X);
        return h8027516537527559298X;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final B6805403844224311194 c() {
        return M9216324016624295870.J(Boolean.TRUE);
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final D16915945238461757356 a(rm2 rm2Var, byte[] bArr) {
        yk0 yk0Var = yk0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE;
        H8027516537527559298 h8027516537527559298X = M9216324016624295870.X(new L14212451929911798515(this, rm2Var, bArr, (byte) 3), this.b);
        this.c.a(yk0Var, (L7743116545240101509) h8027516537527559298X);
        return h8027516537527559298X;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final D16915945238461757356 a(rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        yk0 yk0Var = yk0.EVENT_ID_DG_STORAGE_UPDATE_VM_AND_PROGRAM_BYTECODE;
        H8027516537527559298 h8027516537527559298X = M9216324016624295870.X(new W4600430837258405808(this, rm2Var, bArr, bArr2), this.b);
        this.c.a(yk0Var, (L7743116545240101509) h8027516537527559298X);
        return h8027516537527559298X;
    }
}
