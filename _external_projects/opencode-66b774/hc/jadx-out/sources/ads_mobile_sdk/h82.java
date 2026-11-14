package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.J12078565427869724451;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class h82 extends R14062301455140331524 implements J12078565427869724451 {
    public /* synthetic */ m6 a;
    public final /* synthetic */ i82 b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h82(i82 i82Var, View view, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.b = i82Var;
        this.c = view;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h82 h82Var = new h82(this.b, this.c, (R4833348786910499294) obj3);
        h82Var.a = (m6) obj2;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        h82Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        m6 m6Var = this.a;
        i82 i82Var = this.b;
        x52 x52Var = i82Var.f;
        View view = this.c;
        x52Var.a(m6Var, view);
        i82Var.n.add(view);
        return O9245300239821758723.a;
    }
}
