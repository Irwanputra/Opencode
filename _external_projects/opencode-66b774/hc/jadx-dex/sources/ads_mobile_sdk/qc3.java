package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qc3 implements dev.epro.r0.P190945702497543440 {
    public final ads_mobile_sdk.fm0 a;
    public final ads_mobile_sdk.fm0 b;
    public final dev.epro.r0.A8094652504661216977 c;
    public final ads_mobile_sdk.vi3 d;
    public final java.util.concurrent.ExecutorService e;

    public qc3(ads_mobile_sdk.fm0 fm0Var, ads_mobile_sdk.fm0 fm0Var2, dev.epro.r0.A8094652504661216977 a8094652504661216977, java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.vi3 vi3Var) {
        this.a = fm0Var;
        this.b = fm0Var2;
        this.c = a8094652504661216977;
        this.d = vi3Var;
        this.e = executorService;
    }

    public final dev.epro.r0.D16915945238461757356 a(ads_mobile_sdk.rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_VM;
        dev.epro.r0.D16915945238461757356 d16915945238461757356A = ((ads_mobile_sdk.fm0) this.c.get()).a(bArr);
        ads_mobile_sdk.vi3 vi3Var = this.d;
        vi3Var.a(yk0Var, (dev.epro.r0.L7743116545240101509) d16915945238461757356A);
        ads_mobile_sdk.yk0 yk0Var2 = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE;
        dev.epro.r0.D16915945238461757356 d16915945238461757356A2 = this.b.a(bArr2);
        vi3Var.a(yk0Var2, (dev.epro.r0.L7743116545240101509) d16915945238461757356A2);
        dev.epro.r0.H13215157385046624211 h13215157385046624211 = dev.epro.r0.N7756202525712935399.b;
        java.lang.Object[] objArr = (java.lang.Object[]) new dev.epro.r0.D16915945238461757356[]{d16915945238461757356A, d16915945238461757356A2}.clone();
        dev.epro.r0.E3422549137300678133.M(objArr.length, objArr);
        return dev.epro.r0.B11509606741455062017.r(dev.epro.r0.I13152720973475179368.q(new dev.epro.r0.W10763134803956330397(dev.epro.r0.N7756202525712935399.m(objArr.length, objArr))), new dev.epro.r0.A394838204219683290(this, rm2Var, (byte) 1), dev.epro.r0.Z886113521968091188.a);
    }

    public final dev.epro.r0.H8027516537527559298 b() {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_GET_PROGRAM_BYTECODE;
        ads_mobile_sdk.fm0 fm0Var = this.b;
        fm0Var.getClass();
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.J5800360223679855765(fm0Var, (byte) 5), fm0Var.b);
        this.d.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }

    public final dev.epro.r0.B6805403844224311194 c() {
        return dev.epro.r0.M9216324016624295870.J(java.lang.Boolean.TRUE);
    }

    public final dev.epro.r0.H8027516537527559298 d() {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_GET_STATIC_PROGRAM_BYTECODE;
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.S4524717722777659713((byte) 0), this.e);
        this.d.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }

    public final dev.epro.r0.D16915945238461757356 a(ads_mobile_sdk.rm2 rm2Var, byte[] bArr) {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE;
        dev.epro.r0.L7743116545240101509 l7743116545240101509A = this.b.a(bArr);
        this.d.a(yk0Var, l7743116545240101509A);
        return dev.epro.r0.B11509606741455062017.r(dev.epro.r0.I13152720973475179368.q(l7743116545240101509A), new dev.epro.r0.A394838204219683290(this, rm2Var, (byte) 0), dev.epro.r0.Z886113521968091188.a);
    }

    public final dev.epro.r0.H8027516537527559298 a() {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_GET_METADATA;
        ads_mobile_sdk.fm0 fm0Var = this.a;
        fm0Var.getClass();
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.J5800360223679855765(fm0Var, (byte) 5), fm0Var.b);
        this.d.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }
}
