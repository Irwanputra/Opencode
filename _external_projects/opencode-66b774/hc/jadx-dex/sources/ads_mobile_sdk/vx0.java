package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vx0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.iy0 b;
    public final /* synthetic */ android.net.Uri c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx0(ads_mobile_sdk.iy0 iy0Var, android.net.Uri uri, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = iy0Var;
        this.c = uri;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        android.net.Uri uri = this.c;
        ads_mobile_sdk.iy0 iy0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.vx0(iy0Var, uri, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.vx0(iy0Var, uri, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        android.net.Uri uri = this.c;
        ads_mobile_sdk.iy0 iy0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.vx0(iy0Var, uri, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.vx0(iy0Var, uri, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.t) {
            case 0:
                dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.z03 z03Var = this.b.u;
                    if (z03Var != null) {
                        java.lang.String string = this.c.toString();
                        string.getClass();
                        this.a = true;
                        if (z03Var.b(string, this) == z3437138737604933638) {
                        }
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                dev.epro.r0.Z3437138737604933638 z34371387376049336382 = dev.epro.r0.Z3437138737604933638.a;
                boolean z2 = this.a;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.iy0 iy0Var = this.b;
                    dev.epro.r0.C9731525580007922156 c9731525580007922156 = iy0Var.a;
                    ads_mobile_sdk.tx0 tx0Var = iy0Var.b;
                    android.net.Uri uri = this.c;
                    this.a = true;
                    if (c9731525580007922156.a(tx0Var, uri, this) == z34371387376049336382) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
