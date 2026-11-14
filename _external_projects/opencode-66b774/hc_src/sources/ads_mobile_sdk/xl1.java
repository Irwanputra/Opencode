package ads_mobile_sdk;

import android.view.WindowManager;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xl1 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ WindowManager a;
    public final /* synthetic */ tx0 b;
    public final /* synthetic */ WindowManager.LayoutParams c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl1(WindowManager windowManager, tx0 tx0Var, WindowManager.LayoutParams layoutParams, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = windowManager;
        this.b = tx0Var;
        this.c = layoutParams;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new xl1(this.a, this.b, this.c, r4833348786910499294, (byte) 0);
            default:
                return new xl1(this.a, this.b, this.c, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((xl1) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            default:
                ((xl1) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        WindowManager.LayoutParams layoutParams = this.c;
        tx0 tx0Var = this.b;
        WindowManager windowManager = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                windowManager.updateViewLayout(tx0Var, layoutParams);
                break;
            default:
                E17665849472693074628.k(obj);
                windowManager.updateViewLayout(tx0Var, layoutParams);
                break;
        }
        return o9245300239821758723;
    }
}
