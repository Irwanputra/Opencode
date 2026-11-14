package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.X5670102799181443745;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mh2 extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ Object a;
    public final /* synthetic */ z03 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh2(z03 z03Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = z03Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        z03 z03Var = this.b;
        switch (b) {
            case 0:
                mh2 mh2Var = new mh2(z03Var, r4833348786910499294, (byte) 0);
                mh2Var.a = obj;
                return mh2Var;
            default:
                mh2 mh2Var2 = new mh2(z03Var, r4833348786910499294, (byte) 1);
                mh2Var2.a = obj;
                return mh2Var2;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        z03 z03Var = this.b;
        switch (b) {
            case 0:
                mh2 mh2Var = new mh2(z03Var, (R4833348786910499294) obj2, (byte) 0);
                mh2Var.a = (tx0) obj;
                mh2Var.invokeSuspend(o9245300239821758723);
                break;
            default:
                mh2 mh2Var2 = new mh2(z03Var, (R4833348786910499294) obj2, (byte) 1);
                mh2Var2.a = (tx0) obj;
                mh2Var2.invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                ((tx0) this.a).b().u = this.b;
                break;
            default:
                E17665849472693074628.k(obj);
                tx0 tx0Var = (tx0) this.a;
                tx0Var.b().u = this.b;
                tx0Var.setOnClickListener(new X5670102799181443745(this.b, (byte) 1));
                final z03 z03Var = this.b;
                tx0Var.setOnTouchListener(new View.OnTouchListener() { // from class: dev.epro.r0.N12300934049512334304
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        z03Var.g.set(true);
                        view.performClick();
                        return false;
                    }
                });
                break;
        }
        return O9245300239821758723.a;
    }
}
