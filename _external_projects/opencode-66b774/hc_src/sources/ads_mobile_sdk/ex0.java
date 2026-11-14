package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ex0 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ tx0 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex0(tx0 tx0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = tx0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        tx0 tx0Var = this.a;
        switch (b) {
            case 0:
                return new ex0(tx0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new ex0(tx0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new ex0(tx0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new ex0(tx0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new ex0(tx0Var, r4833348786910499294, (byte) 4);
            case 5:
                return new ex0(tx0Var, r4833348786910499294, (byte) 5);
            case 6:
                return new ex0(tx0Var, r4833348786910499294, (byte) 6);
            case 7:
                return new ex0(tx0Var, r4833348786910499294, (byte) 7);
            case 8:
                return new ex0(tx0Var, r4833348786910499294, (byte) 8);
            case 9:
                return new ex0(tx0Var, r4833348786910499294, (byte) 9);
            default:
                return new ex0(tx0Var, r4833348786910499294, (byte) 10);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        tx0 tx0Var = this.a;
        switch (b) {
            case 0:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 1:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 2:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 3:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 4:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 5:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 6:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 7:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 8:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 9:
                return new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 9).invokeSuspend(o9245300239821758723);
            default:
                new ex0(tx0Var, (R4833348786910499294) obj2, (byte) 10).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        tx0 tx0Var = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                tx0Var.loadUrl("about:blank");
                return o9245300239821758723;
            case 1:
                E17665849472693074628.k(obj);
                tx0Var.destroy();
                return o9245300239821758723;
            case 2:
                E17665849472693074628.k(obj);
                tx0Var.destroy();
                return o9245300239821758723;
            case 3:
                E17665849472693074628.k(obj);
                tx0Var.requestLayout();
                return o9245300239821758723;
            case 4:
                E17665849472693074628.k(obj);
                tx0Var.destroy();
                return o9245300239821758723;
            case 5:
                E17665849472693074628.k(obj);
                tx0Var.onResume();
                return o9245300239821758723;
            case 6:
                E17665849472693074628.k(obj);
                tx0Var.onPause();
                return o9245300239821758723;
            case 7:
                E17665849472693074628.k(obj);
                tx0Var.destroy();
                return o9245300239821758723;
            case 8:
                E17665849472693074628.k(obj);
                tx0Var.destroy();
                return o9245300239821758723;
            case 9:
                E17665849472693074628.k(obj);
                return new xu0(new jy0(tx0Var));
            default:
                E17665849472693074628.k(obj);
                tx0Var.setVisibility(0);
                return o9245300239821758723;
        }
    }
}
