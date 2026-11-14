package ads_mobile_sdk;

import dev.epro.r0.B6805403844224311194;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.P190945702497543440;
import dev.epro.r0.S4524717722777659713;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class x31 implements P190945702497543440 {
    public final ExecutorService a;
    public final vi3 b;

    public x31(ExecutorService executorService, vi3 vi3Var) {
        this.a = executorService;
        this.b = vi3Var;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final H8027516537527559298 a() {
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_GET_STATIC_PROGRAM_METADATA;
        H8027516537527559298 X = M9216324016624295870.X(new S4524717722777659713((byte) 1), this.a);
        this.b.a(yk0Var, (L7743116545240101509) X);
        return X;
    }

    @Override // dev.epro.r0.P190945702497543440
    public final H8027516537527559298 b() {
        return d();
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final B6805403844224311194 c() {
        return M9216324016624295870.J(Boolean.TRUE);
    }

    @Override // dev.epro.r0.P190945702497543440
    public final H8027516537527559298 d() {
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_GET_STATIC_PROGRAM_BYTECODE;
        H8027516537527559298 X = M9216324016624295870.X(new S4524717722777659713((byte) 2), this.a);
        this.b.a(yk0Var, (L7743116545240101509) X);
        return X;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final D16915945238461757356 a(rm2 rm2Var, byte[] bArr) {
        return B6805403844224311194.b;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final D16915945238461757356 a(rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        return B6805403844224311194.b;
    }
}
