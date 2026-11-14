package ads_mobile_sdk;

import dev.epro.r0.A5401921815192175371;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R15192661853924864744;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class wm extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ dr0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm(dr0 dr0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = dr0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        dr0 dr0Var = this.b;
        switch (b) {
            case 0:
                return new wm(dr0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new wm(dr0Var, r4833348786910499294, (byte) 1);
            default:
                return new wm(dr0Var, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        dr0 dr0Var = this.b;
        switch (b) {
            case 0:
                return new wm(dr0Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new wm(dr0Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                return new wm(dr0Var, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        dr0 dr0Var = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    qq0 qq0Var = dr0Var.c;
                    this.a = true;
                    if (((A5401921815192175371) qq0Var.a.get()).a(new R15192661853924864744(2, null, (byte) 2), this) == z3437138737604933638) {
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
            case 1:
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (dr0Var.a((a70) null, this) == z3437138737604933638) {
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
            default:
                boolean z3 = this.a;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (dr0Var.a((a70) null, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z3) {
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
