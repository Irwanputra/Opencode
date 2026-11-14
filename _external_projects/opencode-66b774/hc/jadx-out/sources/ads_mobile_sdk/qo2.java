package ads_mobile_sdk;

import dev.epro.r0.D16573472668995260995;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.J12078565427869724451;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.Q3791352212346016950;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.V16504496955554646429;
import dev.epro.r0.X2485016533998461232;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qo2 extends R14062301455140331524 implements J12078565427869724451 {
    public boolean a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ wo2 c;
    public final /* synthetic */ G8001132634698687269 d;
    public final /* synthetic */ V16504496955554646429 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo2(wo2 wo2Var, G8001132634698687269 g8001132634698687269, V16504496955554646429 v16504496955554646429, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.c = wo2Var;
        this.d = g8001132634698687269;
        this.e = v16504496955554646429;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        G8001132634698687269 g8001132634698687269 = this.d;
        V16504496955554646429 v16504496955554646429 = this.e;
        qo2 qo2Var = new qo2(this.c, g8001132634698687269, v16504496955554646429, (R4833348786910499294) obj3);
        qo2Var.b = (Throwable) obj2;
        return qo2Var.invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        byte b = 1;
        R4833348786910499294 r4833348786910499294 = null;
        if (!z) {
            E17665849472693074628.k(obj);
            qu0 qu0Var = new qu0(this.b, 0, null, 6);
            this.c.getClass();
            oo2 oo2Var = new oo2(new D16573472668995260995(X2485016533998461232._a(qu0Var.d), Q3791352212346016950.d(qu0Var), null), this.e, r4833348786910499294, b);
            this.a = true;
            Object objD0 = R7033599853981556291.d0(this.d, oo2Var, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (objD0 == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
        }
        return O9245300239821758723.a;
    }
}
