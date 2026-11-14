package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class az1 implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final ads_mobile_sdk.hb1 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ az1(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, byte b) {
        this.d = b;
        this.c = hb1Var;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
    }

    public final java.lang.Object get() {
        byte b = this.d;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.b;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.a;
        ads_mobile_sdk.hb1 hb1Var = this.c;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.zy1((ads_mobile_sdk.jr0) v25975809505161317492.get(), (ads_mobile_sdk.jp0) v2597580950516131749.get(), (ads_mobile_sdk.qw2) hb1Var.a);
            case 1:
                return new ads_mobile_sdk.bp3((android.content.Context) v25975809505161317492.get(), (dev.epro.r0.O16637889491137121389) v2597580950516131749.get(), (java.util.concurrent.ExecutorService) hb1Var.a);
            case 2:
                return new ads_mobile_sdk.dj0((android.content.Context) hb1Var.a, (ads_mobile_sdk.g0) v25975809505161317492.get(), (ads_mobile_sdk.jr0) v2597580950516131749.get());
            case 3:
                return new ads_mobile_sdk.s92((dev.epro.r0.O16637889491137121389) v25975809505161317492.get(), (ads_mobile_sdk.vi3) v2597580950516131749.get(), ((ads_mobile_sdk.j7) hb1Var.a).L().s());
            case 4:
                android.content.Context context = (android.content.Context) hb1Var.a;
                return new ads_mobile_sdk.gm2(context, context.getSharedPreferences("pcvmspf2", 0), ads_mobile_sdk.gj0.a(v25975809505161317492), (ads_mobile_sdk.vi3) v2597580950516131749.get());
            case 5:
                return new ads_mobile_sdk.ja2((android.content.Context) hb1Var.a, ((java.lang.Integer) v25975809505161317492.get()).intValue(), (ads_mobile_sdk.b41) v2597580950516131749.get());
            case 6:
                ads_mobile_sdk.hv hvVar = (ads_mobile_sdk.hv) hb1Var.a;
                hvVar.getClass();
                if (hvVar.u) {
                    java.lang.Object obj = v2597580950516131749.get();
                    obj.getClass();
                    return (dev.epro.r0.J4422749016291691854) obj;
                }
                java.lang.Object obj2 = v25975809505161317492.get();
                obj2.getClass();
                return (dev.epro.r0.J4422749016291691854) obj2;
            case 7:
                return new ads_mobile_sdk.kw2((ads_mobile_sdk.iw2) v25975809505161317492.get(), (dev.epro.r0.U4857089234315512256) hb1Var.a, (ads_mobile_sdk.qw2) v2597580950516131749.get());
            case 8:
                return new ads_mobile_sdk.ln3((android.content.Context) hb1Var.a, (java.lang.String) v25975809505161317492.get(), (ads_mobile_sdk.qq0) v2597580950516131749.get());
            case 9:
                ads_mobile_sdk.hv hvVar2 = (ads_mobile_sdk.hv) hb1Var.a;
                hvVar2.getClass();
                v25975809505161317492.getClass();
                v2597580950516131749.getClass();
                if (hvVar2.u) {
                    java.lang.Object obj3 = v2597580950516131749.get();
                    obj3.getClass();
                    return (ads_mobile_sdk.et0) obj3;
                }
                java.lang.Object obj4 = v25975809505161317492.get();
                obj4.getClass();
                return (ads_mobile_sdk.et0) obj4;
            case 10:
                dev.epro.r0.P17493338506140929634 p17493338506140929634 = ((ads_mobile_sdk.j7) hb1Var.a).x() ? (dev.epro.r0.P17493338506140929634) ads_mobile_sdk.gj0.a(v25975809505161317492).get() : (dev.epro.r0.P17493338506140929634) ads_mobile_sdk.gj0.a(v2597580950516131749).get();
                dev.epro.r0.Z14316276734425062790.e(p17493338506140929634);
                return p17493338506140929634;
            case 11:
                return new ads_mobile_sdk.oc3((ads_mobile_sdk.gm2) v25975809505161317492.get(), (java.util.concurrent.ExecutorService) hb1Var.a, (ads_mobile_sdk.vi3) v2597580950516131749.get());
            case 12:
                return new ads_mobile_sdk.op3((android.content.Context) hb1Var.a, (ads_mobile_sdk.bs3) v25975809505161317492.get(), (ads_mobile_sdk.jr0) v2597580950516131749.get());
            case 13:
                return new ads_mobile_sdk.ql1((ads_mobile_sdk.jr0) v25975809505161317492.get(), (android.content.Context) hb1Var.a, (ads_mobile_sdk.fi0) v2597580950516131749.get());
            default:
                return new dev.epro.r0.F2482801574426107508("JnKlh6qRr9Q9w0ne7V+3ZmP88d0S4hOBZW6VJY9+TenJpQccO7Nfzmt8LyU8YTNl", "lY7HeDO3WqFVABSCibQAUaeQQmrbgI8tZ44V9b84yFY=", (dev.epro.r0.V5431423861497278836) hb1Var.a, (ads_mobile_sdk.rp1) v25975809505161317492.get(), ((ads_mobile_sdk.vi3) v2597580950516131749.get()).a(ads_mobile_sdk.yk0.EVENT_ID_DEVICE_INFO_SIGNALS_TASK));
        }
    }

    public /* synthetic */ az1(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v25975809505161317492, byte b) {
        this.d = b;
        this.a = v2597580950516131749;
        this.c = hb1Var;
        this.b = v25975809505161317492;
    }

    public /* synthetic */ az1(dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, ads_mobile_sdk.hb1 hb1Var, byte b) {
        this.d = b;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.c = hb1Var;
    }
}
