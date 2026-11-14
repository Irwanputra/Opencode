package ads_mobile_sdk;

import dev.epro.r0.A394838204219683290;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.B6805403844224311194;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.E3422549137300678133;
import dev.epro.r0.H13215157385046624211;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.J5800360223679855765;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N7756202525712935399;
import dev.epro.r0.P190945702497543440;
import dev.epro.r0.S4524717722777659713;
import dev.epro.r0.W10763134803956330397;
import dev.epro.r0.Z886113521968091188;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qc3 implements P190945702497543440 {
    public final fm0 a;
    public final fm0 b;
    public final A8094652504661216977 c;
    public final vi3 d;
    public final ExecutorService e;

    public qc3(fm0 fm0Var, fm0 fm0Var2, A8094652504661216977 a8094652504661216977, ExecutorService executorService, vi3 vi3Var) {
        this.a = fm0Var;
        this.b = fm0Var2;
        this.c = a8094652504661216977;
        this.d = vi3Var;
        this.e = executorService;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final D16915945238461757356 a(rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_VM;
        H8027516537527559298 a = ((fm0) this.c.get()).a(bArr);
        vi3 vi3Var = this.d;
        vi3Var.a(yk0Var, (L7743116545240101509) a);
        yk0 yk0Var2 = yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE;
        H8027516537527559298 a2 = this.b.a(bArr2);
        vi3Var.a(yk0Var2, (L7743116545240101509) a2);
        H13215157385046624211 h13215157385046624211 = N7756202525712935399.b;
        Object[] objArr = (Object[]) new D16915945238461757356[]{a, a2}.clone();
        E3422549137300678133.M(objArr.length, objArr);
        return B11509606741455062017.r(I13152720973475179368.q(new W10763134803956330397(N7756202525712935399.m(objArr.length, objArr))), new A394838204219683290(this, rm2Var, (byte) 1), Z886113521968091188.a);
    }

    @Override // dev.epro.r0.P190945702497543440
    public final H8027516537527559298 b() {
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_GET_PROGRAM_BYTECODE;
        fm0 fm0Var = this.b;
        fm0Var.getClass();
        H8027516537527559298 X = M9216324016624295870.X(new J5800360223679855765(fm0Var, (byte) 5), fm0Var.b);
        this.d.a(yk0Var, (L7743116545240101509) X);
        return X;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final B6805403844224311194 c() {
        return M9216324016624295870.J(Boolean.TRUE);
    }

    @Override // dev.epro.r0.P190945702497543440
    public final H8027516537527559298 d() {
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_GET_STATIC_PROGRAM_BYTECODE;
        H8027516537527559298 X = M9216324016624295870.X(new S4524717722777659713((byte) 0), this.e);
        this.d.a(yk0Var, (L7743116545240101509) X);
        return X;
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final D16915945238461757356 a(rm2 rm2Var, byte[] bArr) {
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE;
        H8027516537527559298 a = this.b.a(bArr);
        this.d.a(yk0Var, (L7743116545240101509) a);
        return B11509606741455062017.r(I13152720973475179368.q(a), new A394838204219683290(this, rm2Var, (byte) 0), Z886113521968091188.a);
    }

    @Override // dev.epro.r0.Z15337348271744322997
    public final H8027516537527559298 a() {
        yk0 yk0Var = yk0.EVENT_ID_ORCAS_STORAGE_GET_METADATA;
        fm0 fm0Var = this.a;
        fm0Var.getClass();
        H8027516537527559298 X = M9216324016624295870.X(new J5800360223679855765(fm0Var, (byte) 5), fm0Var.b);
        this.d.a(yk0Var, (L7743116545240101509) X);
        return X;
    }
}
