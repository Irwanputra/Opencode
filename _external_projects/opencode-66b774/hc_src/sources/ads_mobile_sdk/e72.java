package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class e72 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ m72 a;
    public final /* synthetic */ dj1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ xr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e72(m72 m72Var, dj1 dj1Var, View view, xr0 xr0Var, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.a = m72Var;
        this.b = dj1Var;
        this.c = view;
        this.d = xr0Var;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        View view = this.c;
        xr0 xr0Var = this.d;
        return new e72(this.a, this.b, view, xr0Var, (R4833348786910499294) obj).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        x52 x52Var = this.a.c;
        x52Var.getClass();
        dj1 dj1Var = this.b;
        dj1Var.getClass();
        View view = this.c;
        view.getClass();
        xr0 xr0Var = this.d;
        xr0Var.getClass();
        ci3 ci3Var = x52Var.f;
        f52 f52Var = new f52(dj1Var, view, xr0Var, (byte) 1);
        ci3Var.getClass();
        try {
            f52Var.invoke();
            return O9245300239821758723.a;
        } catch (Exception e) {
            ci3Var.a("AddFriendlyObstructionToJavaScriptSessionService", (Throwable) e);
            return null;
        }
    }
}
