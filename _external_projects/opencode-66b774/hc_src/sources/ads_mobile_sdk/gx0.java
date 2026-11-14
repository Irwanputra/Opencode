package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gx0 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ tx0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx0(tx0 tx0Var, String str, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = tx0Var;
        this.b = str;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        String str = this.b;
        tx0 tx0Var = this.a;
        switch (b) {
            case 0:
                return new gx0(tx0Var, str, r4833348786910499294, (byte) 0);
            case 1:
                return new gx0(tx0Var, str, r4833348786910499294, (byte) 1);
            default:
                return new gx0(tx0Var, str, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        String str = this.b;
        tx0 tx0Var = this.a;
        switch (b) {
            case 0:
                new gx0(tx0Var, str, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new gx0(tx0Var, str, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            default:
                new gx0(tx0Var, str, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        String str = this.b;
        tx0 tx0Var = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                tx0Var.evaluateJavascript(str, null);
                break;
            case 1:
                E17665849472693074628.k(obj);
                tx0Var.loadUrl(str);
                break;
            default:
                E17665849472693074628.k(obj);
                tx0Var.e.a(str, (Throwable) new Exception(str));
                break;
        }
        return o9245300239821758723;
    }
}
