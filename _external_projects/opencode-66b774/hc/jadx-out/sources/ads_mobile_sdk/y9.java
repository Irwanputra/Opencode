package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.G10308367458345557237;
import dev.epro.r0.G16562784700295586616;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ qo3 e;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(String str, Object obj, R4833348786910499294 r4833348786910499294, qo3 qo3Var, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.c = str;
        this.d = obj;
        this.e = qo3Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new y9(this.c, this.d, r4833348786910499294, this.e, (byte) 0);
            default:
                return new y9(this.c, this.d, r4833348786910499294, this.e, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((y9) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((y9) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        qo3 qo3Var = this.e;
        Object obj2 = this.d;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (((G16562784700295586616) obj2).a(qo3Var, this) == z3437138737604933638) {
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
                    this.a = true;
                    if (((G10308367458345557237) obj2).b(qo3Var, this) == z3437138737604933638) {
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
