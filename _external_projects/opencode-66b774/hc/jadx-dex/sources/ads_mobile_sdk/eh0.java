package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class eh0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.ih0 a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh0(dev.epro.r0.R4833348786910499294 r4833348786910499294, ads_mobile_sdk.ih0 ih0Var, java.lang.String str, java.lang.String str2, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = ih0Var;
        this.b = str;
        this.c = str2;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new ads_mobile_sdk.eh0(r4833348786910499294, this.a, this.b, this.c, (byte) 0);
            default:
                return new ads_mobile_sdk.eh0(r4833348786910499294, this.a, this.b, this.c, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            default:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.G14522929311705694578 g14522929311705694578;
        dev.epro.r0.G14522929311705694578 g145229293117056945782;
        switch (this.t) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.ih0 ih0Var = this.a;
                synchronized (ih0Var) {
                    g14522929311705694578 = ih0Var.e;
                }
                if (g14522929311705694578 != null) {
                    g14522929311705694578.a(this.b);
                }
                return dev.epro.r0.O9245300239821758723.a;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.ih0 ih0Var2 = this.a;
                synchronized (ih0Var2) {
                    g145229293117056945782 = ih0Var2.e;
                }
                if (g145229293117056945782 != null) {
                    g145229293117056945782.a(this.b);
                }
                return dev.epro.r0.O9245300239821758723.a;
        }
    }
}
