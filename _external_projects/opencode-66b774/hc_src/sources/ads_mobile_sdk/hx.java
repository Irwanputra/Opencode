package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class hx extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ fz b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx(fz fzVar, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = fzVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        fz fzVar = this.b;
        switch (b) {
            case 0:
                return new hx(fzVar, r4833348786910499294, (byte) 0);
            case 1:
                return new hx(fzVar, r4833348786910499294, (byte) 1);
            case 2:
                return new hx(fzVar, r4833348786910499294, (byte) 2);
            case 3:
                return new hx(fzVar, r4833348786910499294, (byte) 3);
            case 4:
                return new hx(fzVar, r4833348786910499294, (byte) 4);
            default:
                return new hx(fzVar, r4833348786910499294, (byte) 5);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        fz fzVar = this.b;
        switch (b) {
            case 0:
                return new hx(fzVar, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new hx(fzVar, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new hx(fzVar, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new hx(fzVar, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new hx(fzVar, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            default:
                return new hx(fzVar, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        fz fzVar = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    pe2 pe2Var = fzVar.v;
                    this.a = true;
                    pe2Var.getClass();
                    if (pe2.a(pe2Var, qc2.CLEAR_REASON_CONSENT_ALLOWLIST_CHANGED, true, (K14749510448791472029) this) == z3437138737604933638) {
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
                    pe2 pe2Var2 = fzVar.v;
                    this.a = true;
                    pe2Var2.getClass();
                    if (pe2.a(pe2Var2, qc2.CLEAR_REASON_CONSENT_DENIED, false, (K14749510448791472029) this) == z3437138737604933638) {
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
            case 2:
                boolean z3 = this.a;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (fz.b(fzVar, false, true, this) == z3437138737604933638) {
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
            case 3:
                boolean z4 = this.a;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (fz.a(fzVar, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            case 4:
                boolean z5 = this.a;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    obj = fzVar.y(this);
                    if (obj == z3437138737604933638) {
                        break;
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z6 = this.a;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    obj = fz.i(fzVar, this);
                    if (obj == z3437138737604933638) {
                        break;
                    }
                } else if (!z6) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return o9245300239821758723;
    }
}
