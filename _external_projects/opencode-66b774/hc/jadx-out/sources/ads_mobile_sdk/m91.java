package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class m91 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ s91 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m91(s91 s91Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = s91Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        s91 s91Var = this.a;
        switch (b) {
            case 0:
                return new m91(s91Var, r4833348786910499294, (byte) 0);
            case 1:
                return new m91(s91Var, r4833348786910499294, (byte) 1);
            default:
                return new m91(s91Var, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        s91 s91Var = this.a;
        switch (b) {
            case 0:
                new m91(s91Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new m91(s91Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            default:
                new m91(s91Var, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        s91 s91Var = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                s91Var.F.a(null);
                break;
            case 1:
                E17665849472693074628.k(obj);
                s91Var.F.a(w81.P);
                break;
            default:
                E17665849472693074628.k(obj);
                s91Var.F.a(w81.P);
                break;
        }
        return o9245300239821758723;
    }
}
