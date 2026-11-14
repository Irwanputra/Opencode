package ads_mobile_sdk;

import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class aq2 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ dq2 a;
    public final /* synthetic */ M16184408391440927034 b;
    public final /* synthetic */ F11004654978627682545 c;
    public final /* synthetic */ byte t;

    static {
        izmyclvb.oeynnivvrnts0(40);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq2(F11004654978627682545 f11004654978627682545, dq2 dq2Var, M16184408391440927034 m16184408391440927034, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = dq2Var;
        this.b = m16184408391440927034;
        this.c = f11004654978627682545;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new aq2(this.c, this.a, this.b, r4833348786910499294, (byte) 0);
            case 1:
                return new aq2(this.c, this.a, this.b, r4833348786910499294, (byte) 1);
            default:
                return new aq2(this.c, this.a, this.b, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((aq2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                ((aq2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            default:
                ((aq2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);
}
