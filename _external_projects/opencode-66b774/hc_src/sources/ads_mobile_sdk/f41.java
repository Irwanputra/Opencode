package ads_mobile_sdk;

import dev.epro.r0.D1753571785825534567;
import dev.epro.r0.O12043144740933444288;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class f41 implements D1753571785825534567 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;

    public /* synthetic */ f41(w81 w81Var, Object obj, byte b) {
        this.c = b;
        this.a = obj;
        this.b = w81Var;
    }

    @Override // dev.epro.r0.D1753571785825534567
    public final void a() {
        switch (this.c) {
            case 0:
                ((zj1) this.a).p = (fz) this.b;
                return;
            case 1:
                g0 g0Var = (g0) this.a;
                Set set = (Set) this.b;
                synchronized (g0Var) {
                    g0Var.h.addAll(set);
                }
                return;
            case 2:
                ((O12043144740933444288) this.a).a((w81) this.b);
                return;
            case 3:
                ((O12043144740933444288) this.a).a((hs) this.b);
                return;
            case 4:
                ((nd2) this.a).g = (pe2) this.b;
                return;
            default:
                ((yp3) this.a).r = (w81) this.b;
                return;
        }
    }

    public /* synthetic */ f41(Object obj, Object obj2, byte b) {
        this.c = b;
        this.a = obj;
        this.b = obj2;
    }
}
