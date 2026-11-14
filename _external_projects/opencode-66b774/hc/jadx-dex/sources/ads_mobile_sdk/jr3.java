package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jr3 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.bs3 a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr3(ads_mobile_sdk.bs3 bs3Var, java.lang.String str, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = bs3Var;
        this.b = str;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        java.lang.String str = this.b;
        ads_mobile_sdk.bs3 bs3Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.jr3(bs3Var, str, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.jr3(bs3Var, str, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.String str = this.b;
        ads_mobile_sdk.bs3 bs3Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.jr3(bs3Var, str, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                new ads_mobile_sdk.jr3(bs3Var, str, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        java.lang.String str = this.b;
        ads_mobile_sdk.bs3 bs3Var = this.a;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                bs3Var.j.getClass();
                if (!dev.epro.r0.Q6344330807969154194.o.b()) {
                    throw dev.epro.r0.Q6344330807969154194.a();
                }
                dev.epro.r0.F6942723054099263096 f6942723054099263096 = dev.epro.r0.F6942723054099263096.c;
                if (f6942723054099263096 == null) {
                    f6942723054099263096 = new dev.epro.r0.F6942723054099263096(dev.epro.r0.G17481180015085314196.a.getProfileStore(), (byte) 29);
                    dev.epro.r0.F6942723054099263096.c = f6942723054099263096;
                }
                return f6942723054099263096.h(str);
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                try {
                    bs3Var.j.getClass();
                    str.getClass();
                } catch (java.lang.Throwable unused) {
                }
                if (!dev.epro.r0.Q6344330807969154194.o.b()) {
                    throw dev.epro.r0.Q6344330807969154194.a();
                }
                dev.epro.r0.F6942723054099263096 f69427230540992630962 = dev.epro.r0.F6942723054099263096.c;
                if (f69427230540992630962 == null) {
                    f69427230540992630962 = new dev.epro.r0.F6942723054099263096(dev.epro.r0.G17481180015085314196.a.getProfileStore(), (byte) 29);
                    dev.epro.r0.F6942723054099263096.c = f69427230540992630962;
                }
                bs3Var.m = f69427230540992630962.h(str);
                return dev.epro.r0.O9245300239821758723.a;
        }
    }
}
