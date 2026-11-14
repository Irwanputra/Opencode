package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class r62 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ w62 a;
    public final /* synthetic */ m6 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r62(w62 w62Var, m6 m6Var, View view, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.a = w62Var;
        this.b = m6Var;
        this.c = view;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                View view = this.c;
                new r62(this.a, this.b, view, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            default:
                View view2 = this.c;
                return new r62(this.a, this.b, view2, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        View view = this.c;
        m6 m6Var = this.b;
        w62 w62Var = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                w62Var.e.a(m6Var, view);
                return O9245300239821758723.a;
            default:
                E17665849472693074628.k(obj);
                return w62Var.e.a(m6Var, view);
        }
    }
}
