package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class af0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ android.app.AlertDialog.Builder a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(android.app.AlertDialog.Builder builder, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = builder;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        android.app.AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.af0(builder, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.af0(builder, r4833348786910499294, (byte) 1);
            case 2:
                return new ads_mobile_sdk.af0(builder, r4833348786910499294, (byte) 2);
            default:
                return new ads_mobile_sdk.af0(builder, r4833348786910499294, (byte) 3);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        android.app.AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                new ads_mobile_sdk.af0(builder, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new ads_mobile_sdk.af0(builder, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                new ads_mobile_sdk.af0(builder, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ads_mobile_sdk.af0(builder, (dev.epro.r0.R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        android.app.AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                builder.create().show();
                break;
            case 1:
                dev.epro.r0.E17665849472693074628.k(obj);
                builder.create().show();
                break;
            case 2:
                dev.epro.r0.E17665849472693074628.k(obj);
                builder.create().show();
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                builder.create().show();
                break;
        }
        return o9245300239821758723;
    }
}
