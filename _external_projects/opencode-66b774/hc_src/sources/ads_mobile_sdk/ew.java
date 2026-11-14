package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ew extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ vw b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew(vw vwVar, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = vwVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        vw vwVar = this.b;
        switch (b) {
            case 0:
                return new ew(vwVar, r4833348786910499294, (byte) 0);
            case 1:
                return new ew(vwVar, r4833348786910499294, (byte) 1);
            case 2:
                return new ew(vwVar, r4833348786910499294, (byte) 2);
            case 3:
                return new ew(vwVar, r4833348786910499294, (byte) 3);
            default:
                return new ew(vwVar, r4833348786910499294, (byte) 4);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        vw vwVar = this.b;
        switch (b) {
            case 0:
                return new ew(vwVar, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new ew(vwVar, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new ew(vwVar, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new ew(vwVar, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            default:
                return new ew(vwVar, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        vw vwVar = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    sb sbVar = vwVar.j;
                    this.a = true;
                    sbVar.getClass();
                    if (sb.b(sbVar, this) == z3437138737604933638) {
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
                    sb sbVar2 = vwVar.j;
                    this.a = true;
                    sbVar2.getClass();
                    if (sb.b(sbVar2, this) == z3437138737604933638) {
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
                    fz fzVar = vwVar.f118o;
                    this.a = true;
                    Pattern pattern = fz.P;
                    fzVar.getClass();
                    if (fz.b(fzVar, true, true, this) == z3437138737604933638) {
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
                    sb sbVar3 = vwVar.j;
                    this.a = true;
                    sbVar3.getClass();
                    if (sb.b(sbVar3, this) == z3437138737604933638) {
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
            default:
                boolean z5 = this.a;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (R7033599853981556291.d0(vwVar.c, new nw(vwVar, true, null, null), this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z5) {
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
