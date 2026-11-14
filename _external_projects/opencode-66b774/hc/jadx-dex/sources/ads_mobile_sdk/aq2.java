package ads_mobile_sdk;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class aq2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.dq2 a;
    public final /* synthetic */ dev.epro.r0.M16184408391440927034 b;
    public final /* synthetic */ dev.epro.r0.F11004654978627682545 c;
    public final /* synthetic */ byte t;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(40);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq2(dev.epro.r0.F11004654978627682545 f11004654978627682545, ads_mobile_sdk.dq2 dq2Var, dev.epro.r0.M16184408391440927034 m16184408391440927034, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = dq2Var;
        this.b = m16184408391440927034;
        this.c = f11004654978627682545;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new ads_mobile_sdk.aq2(this.c, this.a, this.b, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.aq2(this.c, this.a, this.b, r4833348786910499294, (byte) 1);
            default:
                return new ads_mobile_sdk.aq2(this.c, this.a, this.b, r4833348786910499294, (byte) 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            default:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final native java.lang.Object invokeSuspend(java.lang.Object obj);
}
