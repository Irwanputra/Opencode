package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ti3 implements dev.epro.r0.G17379711782311227394 {
    public static final dev.epro.r0.U11450443558875589191 b = new dev.epro.r0.U11450443558875589191((byte) 13);
    public final ads_mobile_sdk.c7 a;

    public ti3() {
        ads_mobile_sdk.c7 c7Var = new ads_mobile_sdk.c7((byte) 10, false);
        c7Var.a = ads_mobile_sdk.ji3.b().a;
        this.a = c7Var;
    }

    public final java.lang.Object fold(dev.epro.r0.L12639328004344855510 l12639328004344855510, java.lang.Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    public final dev.epro.r0.H7323971265464188398 get(dev.epro.r0.R12081023847482212386 r12081023847482212386) {
        return dev.epro.r0.S10823041268949770285.I(this, r12081023847482212386);
    }

    public final dev.epro.r0.R12081023847482212386 getKey() {
        return b;
    }

    public final dev.epro.r0.G8001132634698687269 minusKey(dev.epro.r0.R12081023847482212386 r12081023847482212386) {
        return dev.epro.r0.S10823041268949770285.M(this, r12081023847482212386);
    }

    public final dev.epro.r0.G8001132634698687269 plus(dev.epro.r0.G8001132634698687269 g8001132634698687269) {
        return dev.epro.r0.S10823041268949770285.O(this, g8001132634698687269);
    }

    public final void restoreThreadContext(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Object obj) {
        ads_mobile_sdk.gi3 gi3Var = (ads_mobile_sdk.gi3) obj;
        g8001132634698687269.getClass();
        gi3Var.getClass();
        ads_mobile_sdk.ii3 ii3VarB = ads_mobile_sdk.ji3.b();
        ii3VarB.c = null;
        ads_mobile_sdk.ji3.a(ii3VarB, gi3Var.a);
        ii3VarB.c = gi3Var.b;
    }

    public final java.lang.Object updateThreadContext(dev.epro.r0.G8001132634698687269 g8001132634698687269) {
        g8001132634698687269.getClass();
        ads_mobile_sdk.ii3 ii3VarB = ads_mobile_sdk.ji3.b();
        ads_mobile_sdk.c7 c7Var = this.a;
        ads_mobile_sdk.gi3 gi3Var = new ads_mobile_sdk.gi3(ads_mobile_sdk.ji3.a(ii3VarB, (ads_mobile_sdk.th3) c7Var.a), ii3VarB.c);
        ii3VarB.c = c7Var;
        return gi3Var;
    }
}
