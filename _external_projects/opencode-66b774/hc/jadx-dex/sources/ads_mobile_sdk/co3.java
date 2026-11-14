package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class co3 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ java.util.Map a;
    public final /* synthetic */ ads_mobile_sdk.sy0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co3(java.util.Map map, ads_mobile_sdk.sy0 sy0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = map;
        this.b = sy0Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.sy0 sy0Var = this.b;
        java.util.Map map = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.co3(map, sy0Var, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.co3(map, sy0Var, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.sy0 sy0Var = this.b;
        java.util.Map map = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.co3(map, sy0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                new ads_mobile_sdk.co3(map, sy0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.t) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                java.lang.String str = (java.lang.String) this.a.get("currentTime");
                if (str == null) {
                    ads_mobile_sdk.zi3.a(6, "CurrentTime parameter missing from timeupdate video GMSG: " + this.a, null);
                    return dev.epro.r0.O9245300239821758723.a;
                }
                try {
                    ads_mobile_sdk.sy0 sy0Var = this.b;
                    java.lang.Float.parseFloat(str);
                    synchronized (sy0Var.f) {
                        break;
                    }
                } catch (java.lang.NumberFormatException e) {
                    ads_mobile_sdk.zi3.a(4, "Could not parse currentTime from timeupdate video GMSG: ".concat(str), e);
                }
                return dev.epro.r0.O9245300239821758723.a;
            default:
                dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
                dev.epro.r0.A18119328133183277592 a18119328133183277592 = this.b.e;
                dev.epro.r0.E17665849472693074628.k(obj);
                java.util.Map map = this.a;
                java.lang.String str2 = (java.lang.String) map.get("src");
                if (str2 == null || dev.epro.r0.M8927913404651150384.Y(str2)) {
                    ads_mobile_sdk.zi3.a(6, "Src parameter missing from video GMSG: " + map, null);
                    a18119328133183277592.S((java.lang.Object) null);
                } else {
                    a18119328133183277592.S(str2);
                }
                return o9245300239821758723;
        }
    }
}
