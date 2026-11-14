package ads_mobile_sdk;

import android.widget.Toolbar;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;
import dev.epro.r0.Z5089078543653785389;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kk3 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ pk3 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk3(pk3 pk3Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = pk3Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        pk3 pk3Var = this.b;
        switch (b) {
            case 0:
                return new kk3(pk3Var, r4833348786910499294, (byte) 0);
            default:
                return new kk3(pk3Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        pk3 pk3Var = this.b;
        switch (b) {
            case 0:
                return new kk3(pk3Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new kk3(pk3Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        pk3 pk3Var = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (z) {
                    if (z) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                Toolbar toolbar = pk3Var.x;
                if (toolbar == null) {
                    return o9245300239821758723;
                }
                Z5089078543653785389 z5089078543653785389 = pk3Var.F;
                this.a = true;
                return z5089078543653785389.a(toolbar, xr0.b, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            default:
                boolean z2 = this.a;
                if (z2) {
                    if (z2) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                tx0 tx0Var = pk3Var.V;
                if (tx0Var != null) {
                    this.a = true;
                    return pk3Var.b(tx0Var, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
                }
                S10823041268949770285.b0("previousWebView");
                throw null;
        }
    }
}
