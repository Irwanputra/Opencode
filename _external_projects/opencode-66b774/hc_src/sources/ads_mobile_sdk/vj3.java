package ads_mobile_sdk;

import android.os.Binder;
import dev.epro.r0.B1049225300677980478;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.G16472559273103586035;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.T3920948503184368030;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class vj3 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ yj3 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj3(yj3 yj3Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = yj3Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        yj3 yj3Var = this.a;
        switch (b) {
            case 0:
                return new vj3(yj3Var, r4833348786910499294, (byte) 0);
            default:
                return new vj3(yj3Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        yj3 yj3Var = this.a;
        switch (b) {
            case 0:
                new vj3(yj3Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new vj3(yj3Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        yj3 yj3Var = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                yj3Var.g.set(true);
                G16472559273103586035 g16472559273103586035 = yj3Var.d;
                if (g16472559273103586035.isConnected() || g16472559273103586035.isConnecting()) {
                    g16472559273103586035.disconnect();
                }
                Binder.flushPendingCommands();
                break;
            default:
                E17665849472693074628.k(obj);
                try {
                    B1049225300677980478 b1049225300677980478 = (B1049225300677980478) yj3Var.d.getService();
                    String packageName = yj3Var.b.getPackageName();
                    packageName.getClass();
                    ((T3920948503184368030) b1049225300677980478).e(new gg0(packageName), yj3Var);
                    break;
                } catch (Throwable th) {
                    qu0 qu0Var = new qu0(th, 0, null, 6);
                    int i = yj3.j;
                    if (!yj3Var.f.getAndSet(true)) {
                        yj3Var.h.S(qu0Var);
                    }
                    yj3Var.c.a("Throwable caught getting trustless token", th);
                    break;
                }
        }
        return o9245300239821758723;
    }
}
