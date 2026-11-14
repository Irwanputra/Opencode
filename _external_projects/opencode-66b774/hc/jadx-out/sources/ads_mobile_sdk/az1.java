package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.F2482801574426107508;
import dev.epro.r0.J4422749016291691854;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P17493338506140929634;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.V5431423861497278836;
import dev.epro.r0.Z14316276734425062790;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class az1 implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final V2597580950516131749 b;
    public final hb1 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ az1(hb1 hb1Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, byte b) {
        this.d = b;
        this.c = hb1Var;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.d;
        V2597580950516131749 v2597580950516131749 = this.b;
        V2597580950516131749 v25975809505161317492 = this.a;
        hb1 hb1Var = this.c;
        switch (b) {
            case 0:
                return new zy1((jr0) v25975809505161317492.get(), (jp0) v2597580950516131749.get(), (qw2) hb1Var.a);
            case 1:
                return new bp3((Context) v25975809505161317492.get(), (O16637889491137121389) v2597580950516131749.get(), (ExecutorService) hb1Var.a);
            case 2:
                return new dj0((Context) hb1Var.a, (g0) v25975809505161317492.get(), (jr0) v2597580950516131749.get());
            case 3:
                return new s92((O16637889491137121389) v25975809505161317492.get(), (vi3) v2597580950516131749.get(), ((j7) hb1Var.a).L().s());
            case 4:
                Context context = (Context) hb1Var.a;
                return new gm2(context, context.getSharedPreferences("pcvmspf2", 0), gj0.a(v25975809505161317492), (vi3) v2597580950516131749.get());
            case 5:
                return new ja2((Context) hb1Var.a, ((Integer) v25975809505161317492.get()).intValue(), (b41) v2597580950516131749.get());
            case 6:
                hv hvVar = (hv) hb1Var.a;
                hvVar.getClass();
                if (hvVar.u) {
                    Object obj = v2597580950516131749.get();
                    obj.getClass();
                    return (J4422749016291691854) obj;
                }
                Object obj2 = v25975809505161317492.get();
                obj2.getClass();
                return (J4422749016291691854) obj2;
            case 7:
                return new kw2((iw2) v25975809505161317492.get(), (U4857089234315512256) hb1Var.a, (qw2) v2597580950516131749.get());
            case 8:
                return new ln3((Context) hb1Var.a, (String) v25975809505161317492.get(), (qq0) v2597580950516131749.get());
            case 9:
                hv hvVar2 = (hv) hb1Var.a;
                hvVar2.getClass();
                v25975809505161317492.getClass();
                v2597580950516131749.getClass();
                if (hvVar2.u) {
                    Object obj3 = v2597580950516131749.get();
                    obj3.getClass();
                    return (et0) obj3;
                }
                Object obj4 = v25975809505161317492.get();
                obj4.getClass();
                return (et0) obj4;
            case 10:
                P17493338506140929634 p17493338506140929634 = ((j7) hb1Var.a).x() ? (P17493338506140929634) gj0.a(v25975809505161317492).get() : (P17493338506140929634) gj0.a(v2597580950516131749).get();
                Z14316276734425062790.e(p17493338506140929634);
                return p17493338506140929634;
            case 11:
                return new oc3((gm2) v25975809505161317492.get(), (ExecutorService) hb1Var.a, (vi3) v2597580950516131749.get());
            case 12:
                return new op3((Context) hb1Var.a, (bs3) v25975809505161317492.get(), (jr0) v2597580950516131749.get());
            case 13:
                return new ql1((jr0) v25975809505161317492.get(), (Context) hb1Var.a, (fi0) v2597580950516131749.get());
            default:
                return new F2482801574426107508("JnKlh6qRr9Q9w0ne7V+3ZmP88d0S4hOBZW6VJY9+TenJpQccO7Nfzmt8LyU8YTNl", "lY7HeDO3WqFVABSCibQAUaeQQmrbgI8tZ44V9b84yFY=", (V5431423861497278836) hb1Var.a, (rp1) v25975809505161317492.get(), ((vi3) v2597580950516131749.get()).a(yk0.EVENT_ID_DEVICE_INFO_SIGNALS_TASK));
        }
    }

    public /* synthetic */ az1(V2597580950516131749 v2597580950516131749, hb1 hb1Var, V2597580950516131749 v25975809505161317492, byte b) {
        this.d = b;
        this.a = v2597580950516131749;
        this.c = hb1Var;
        this.b = v25975809505161317492;
    }

    public /* synthetic */ az1(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, hb1 hb1Var, byte b) {
        this.d = b;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.c = hb1Var;
    }
}
