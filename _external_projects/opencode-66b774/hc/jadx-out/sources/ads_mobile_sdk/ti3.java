package ads_mobile_sdk;

import dev.epro.r0.G17379711782311227394;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H7323971265464188398;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.R12081023847482212386;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U11450443558875589191;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ti3 implements G17379711782311227394 {
    public static final U11450443558875589191 b = new U11450443558875589191((byte) 13);
    public final c7 a;

    public ti3() {
        c7 c7Var = new c7((byte) 10, false);
        c7Var.a = ji3.b().a;
        this.a = c7Var;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final Object fold(L12639328004344855510 l12639328004344855510, Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.I(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.H7323971265464188398
    public final R12081023847482212386 getKey() {
        return b;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.M(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 plus(G8001132634698687269 g8001132634698687269) {
        return S10823041268949770285.O(this, g8001132634698687269);
    }

    @Override // dev.epro.r0.G17379711782311227394
    public final void restoreThreadContext(G8001132634698687269 g8001132634698687269, Object obj) {
        gi3 gi3Var = (gi3) obj;
        g8001132634698687269.getClass();
        gi3Var.getClass();
        ii3 ii3VarB = ji3.b();
        ii3VarB.c = null;
        ji3.a(ii3VarB, gi3Var.a);
        ii3VarB.c = gi3Var.b;
    }

    @Override // dev.epro.r0.G17379711782311227394
    public final Object updateThreadContext(G8001132634698687269 g8001132634698687269) {
        g8001132634698687269.getClass();
        ii3 ii3VarB = ji3.b();
        c7 c7Var = this.a;
        gi3 gi3Var = new gi3(ji3.a(ii3VarB, (th3) c7Var.a), ii3VarB.c);
        ii3VarB.c = c7Var;
        return gi3Var;
    }
}
