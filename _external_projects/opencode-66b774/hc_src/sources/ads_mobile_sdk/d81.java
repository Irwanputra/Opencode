package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W8915717454800732848;
import dev.epro.r0.Z3437138737604933638;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class d81 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ w81 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d81(w81 w81Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = w81Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        w81 w81Var = this.b;
        switch (b) {
            case 0:
                return new d81(w81Var, r4833348786910499294, (byte) 0);
            default:
                return new d81(w81Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        w81 w81Var = this.b;
        switch (b) {
            case 0:
                return new d81(w81Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new d81(w81Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        p71 p71Var = p71.c;
        w81 w81Var = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    W8915717454800732848 w8915717454800732848 = new W8915717454800732848();
                    this.a = true;
                    w81Var.getClass();
                    if (w81.a(w81Var, p71Var, w8915717454800732848, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    W8915717454800732848 w89157174548007328482 = new W8915717454800732848();
                    this.a = true;
                    w81Var.getClass();
                    if (w81.a(w81Var, p71Var, w89157174548007328482, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
        }
        return z3437138737604933638;
    }
}
