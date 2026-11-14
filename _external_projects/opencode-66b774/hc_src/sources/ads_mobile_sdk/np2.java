package ads_mobile_sdk;

import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class np2 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ dq2 a;
    public final /* synthetic */ byte t;

    static {
        izmyclvb.oeynnivvrnts0(1085);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np2(dq2 dq2Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = dq2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        dq2 dq2Var = this.a;
        switch (b) {
            case 0:
                return new np2(dq2Var, r4833348786910499294, (byte) 0);
            default:
                return new np2(dq2Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        dq2 dq2Var = this.a;
        switch (b) {
            case 0:
                new np2(dq2Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new np2(dq2Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);
}
