package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.J12078565427869724451;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class d82 extends R14062301455140331524 implements J12078565427869724451 {
    public boolean a;
    public /* synthetic */ tx0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d82(int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(i, r4833348786910499294);
        this.t = b;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        int i = 3;
        switch (b) {
            case 0:
                d82 d82Var = new d82(i, (R4833348786910499294) obj3, (byte) 0);
                d82Var.b = (tx0) obj;
                return d82Var.invokeSuspend(o9245300239821758723);
            default:
                d82 d82Var2 = new d82(i, (R4833348786910499294) obj3, (byte) 1);
                d82Var2.b = (tx0) obj;
                return d82Var2.invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var = this.b;
                    I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
                    this.a = true;
                    if (tx0Var.a(i16631908410500040363, "onSdkAdUserInteractionClick", this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var2 = this.b;
                    I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
                    this.a = true;
                    if (tx0Var2.a(i166319084105000403632, "onSdkImpression", this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
