package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.J12078565427869724451;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class r72 extends R14062301455140331524 implements J12078565427869724451 {
    public /* synthetic */ m6 a;
    public final /* synthetic */ i82 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ xr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r72(i82 i82Var, View view, xr0 xr0Var, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.b = i82Var;
        this.c = view;
        this.d = xr0Var;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = this.c;
        xr0 xr0Var = this.d;
        r72 r72Var = new r72(this.b, view, xr0Var, (R4833348786910499294) obj3);
        r72Var.a = (m6) obj2;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        r72Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        m6 m6Var = this.a;
        x52 x52Var = this.b.f;
        x52Var.getClass();
        m6Var.getClass();
        View view = this.c;
        view.getClass();
        ci3 ci3Var = x52Var.f;
        f52 f52Var = new f52(m6Var, view, this.d, (byte) 0);
        ci3Var.getClass();
        try {
            f52Var.invoke();
        } catch (Exception e) {
            ci3Var.a("AddFriendlyObstructionToAdsession", (Throwable) e);
        }
        return O9245300239821758723.a;
    }
}
