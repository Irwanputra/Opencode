package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.N5158094851646208854;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bj implements B8427392651679410143 {
    public final hb1 a;
    public final rg0 b;
    public final /* synthetic */ byte c;

    public bj(rg0 rg0Var, hb1 hb1Var) {
        this.c = (byte) 2;
        this.b = rg0Var;
        this.a = hb1Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.c;
        rg0 rg0Var = this.b;
        hb1 hb1Var = this.a;
        switch (b) {
            case 0:
                Context context = (Context) hb1Var.a;
                ci3 ci3Var = (ci3) rg0Var.get();
                context.getClass();
                ci3Var.getClass();
                ri riVar = new ri();
                riVar.c = 1.0f;
                return riVar;
            case 1:
                return new di0((Context) hb1Var.a, (ci3) rg0Var.get());
            case 2:
                return new kl((y2) rg0Var.get(), (z1) hb1Var.a);
            case 3:
                Context context2 = (Context) hb1Var.a;
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) rg0Var.get();
                context2.getClass();
                w5797197595347441198.getClass();
                return N5158094851646208854.f(n1.a, w5797197595347441198, new ef(context2, (byte) 2));
            case 4:
                z1 z1Var = (z1) hb1Var.a;
                b01 b01Var = (b01) rg0Var.get();
                z1Var.getClass();
                b01Var.getClass();
                return new a91(b01Var, (byte) 5);
            default:
                return new pr((Context) hb1Var.a, (ci3) rg0Var.get());
        }
    }

    public /* synthetic */ bj(hb1 hb1Var, rg0 rg0Var, byte b) {
        this.c = b;
        this.a = hb1Var;
        this.b = rg0Var;
    }
}
