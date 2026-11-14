package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.P17493338506140929634;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.V5431423861497278836;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class er0 implements B8427392651679410143 {
    public final hb1 a;
    public final V2597580950516131749 b;
    public final V2597580950516131749 c;
    public final V2597580950516131749 d;
    public final V2597580950516131749 e;
    public final /* synthetic */ byte f;

    public er0(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, hb1 hb1Var, V2597580950516131749 v25975809505161317493, V2597580950516131749 v25975809505161317494) {
        this.f = (byte) 2;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.a = hb1Var;
        this.d = v25975809505161317493;
        this.e = v25975809505161317494;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.f;
        V2597580950516131749 v2597580950516131749 = this.e;
        hb1 hb1Var = this.a;
        V2597580950516131749 v25975809505161317492 = this.d;
        V2597580950516131749 v25975809505161317493 = this.c;
        V2597580950516131749 v25975809505161317494 = this.b;
        switch (b) {
            case 0:
                return new dr0((Context) hb1Var.a, (qq0) v25975809505161317494.get(), (h70) v25975809505161317493.get(), (e23) v25975809505161317492.get(), (ti) v2597580950516131749.get());
            case 1:
                return new q((V5431423861497278836) v25975809505161317494.get(), (rp1) v25975809505161317493.get(), (sb3) v25975809505161317492.get(), (Map) hb1Var.a, (vi3) v2597580950516131749.get());
            case 2:
                return new nd2((j1) v25975809505161317494.get(), (c6) v25975809505161317493.get(), (Context) hb1Var.a, (P10813970601447104553) v25975809505161317492.get(), (B7506245556754967052) v2597580950516131749.get());
            case 3:
                return new q((V5431423861497278836) v25975809505161317494.get(), (rp1) v25975809505161317493.get(), (DisplayMetrics) v25975809505161317492.get(), (View) hb1Var.a, (vi3) v2597580950516131749.get());
            case 4:
                return new qc3((fm0) v25975809505161317494.get(), (fm0) v25975809505161317493.get(), gj0.a(v25975809505161317492), (ExecutorService) hb1Var.a, (vi3) v2597580950516131749.get());
            case 5:
                Context context = (Context) v25975809505161317494.get();
                P17493338506140929634 p17493338506140929634 = (P17493338506140929634) v25975809505161317493.get();
                ExecutorService executorService = (ExecutorService) v25975809505161317492.get();
                j11 j11Var = (j11) v2597580950516131749.get();
                j7 j7Var = (j7) hb1Var.a;
                return new qm1(context, p17493338506140929634, executorService, j11Var, new Random(), j7Var.I().s(), j7Var.I().p(), j7Var.I().q(), j7Var.I().r(), j7Var.F(), j7Var.E(), G6547577305291411977.g(j7Var.M()));
            default:
                return new m61((V5431423861497278836) v25975809505161317494.get(), (rp1) v25975809505161317493.get(), (Map) v25975809505161317492.get(), (Context) hb1Var.a, (vi3) v2597580950516131749.get(), (byte) 1);
        }
    }

    public /* synthetic */ er0(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, hb1 hb1Var, V2597580950516131749 v25975809505161317494, byte b) {
        this.f = b;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
        this.a = hb1Var;
        this.e = v25975809505161317494;
    }

    public er0(hb1 hb1Var, V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, V2597580950516131749 v25975809505161317494) {
        this.f = (byte) 0;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
        this.e = v25975809505161317494;
    }

    public er0(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, V2597580950516131749 v25975809505161317494, hb1 hb1Var) {
        this.f = (byte) 5;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
        this.e = v25975809505161317494;
        this.a = hb1Var;
    }
}
