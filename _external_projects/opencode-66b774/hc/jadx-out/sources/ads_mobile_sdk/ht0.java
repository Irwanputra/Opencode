package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;
import dev.epro.r0.Z5089078543653785389;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ kt0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht0(kt0 kt0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = kt0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        kt0 kt0Var = this.b;
        switch (b) {
            case 0:
                return new ht0(kt0Var, r4833348786910499294, (byte) 0);
            default:
                return new ht0(kt0Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        kt0 kt0Var = this.b;
        switch (b) {
            case 0:
                return new ht0(kt0Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new ht0(kt0Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        kt0 kt0Var = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    Z5089078543653785389 z5089078543653785389 = kt0Var.F;
                    this.a = true;
                    if (z5089078543653785389.m(this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o9245300239821758723;
            default:
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    y2 y2Var = kt0Var.N;
                    this.a = true;
                    y2Var.g(this);
                    if (o9245300239821758723 == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o9245300239821758723;
        }
    }
}
