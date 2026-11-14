package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ga3 implements dev.epro.r0.L17385865533161060024 {
    public final ads_mobile_sdk.j7 a;
    public final ads_mobile_sdk.da3 b;
    public final ads_mobile_sdk.qm1 c;
    public final java.util.concurrent.ExecutorService d;
    public final ads_mobile_sdk.vi3 e;
    public final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();

    public ga3(ads_mobile_sdk.j7 j7Var, ads_mobile_sdk.da3 da3Var, ads_mobile_sdk.qm1 qm1Var, java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.vi3 vi3Var) {
        this.a = j7Var;
        this.b = da3Var;
        this.c = qm1Var;
        this.d = executorService;
        this.e = vi3Var;
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        ads_mobile_sdk.j7 j7Var = this.a;
        int iM = j7Var.M();
        boolean zO = j7Var.o();
        ads_mobile_sdk.da3 da3Var = this.b;
        da3Var.getClass();
        dev.epro.r0.I13152720973475179368 i13152720973475179368Q = dev.epro.r0.I13152720973475179368.q(dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.N5587541019643124865(da3Var, iM), da3Var.e));
        dev.epro.r0.U6389045311587420009 u6389045311587420009 = new dev.epro.r0.U6389045311587420009();
        dev.epro.r0.Z886113521968091188 z886113521968091188 = dev.epro.r0.Z886113521968091188.a;
        dev.epro.r0.V9379369092627242728 v9379369092627242728R = dev.epro.r0.B11509606741455062017.r(i13152720973475179368Q, u6389045311587420009, z886113521968091188);
        if (zO && iM != da3Var.g) {
            v9379369092627242728R = dev.epro.r0.B11509606741455062017.r(dev.epro.r0.I13152720973475179368.q(v9379369092627242728R).p(java.lang.Throwable.class, new dev.epro.r0.A14169635274474290551((byte) 1), z886113521968091188), new ads_mobile_sdk.ca3(da3Var), z886113521968091188);
        }
        dev.epro.r0.T7468265282056741718 t7468265282056741718S = dev.epro.r0.B11509606741455062017.s(dev.epro.r0.I13152720973475179368.q(v9379369092627242728R), new dev.epro.r0.M15292376008478569006(this, (byte) 1), z886113521968091188);
        t7468265282056741718S.a(new dev.epro.r0.I3863025946240164840(t7468265282056741718S, new ads_mobile_sdk.c7((java.lang.Object) this, (byte) 8), (byte) 0), this.d);
        return t7468265282056741718S;
    }
}
