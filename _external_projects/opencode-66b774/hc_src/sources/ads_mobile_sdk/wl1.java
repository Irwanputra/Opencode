package ads_mobile_sdk;

import android.webkit.WebSettings;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class wl1 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ tx0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zl1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl1(tx0 tx0Var, int i, int i2, zl1 zl1Var, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.a = tx0Var;
        this.b = i;
        this.c = i2;
        this.d = zl1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new wl1(this.a, this.b, this.c, this.d, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        wl1 wl1Var = (wl1) create((R4833348786910499294) obj2, (W5797197595347441198) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        wl1Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        fs3 fs3Var = new fs3(2, this.b, this.c, 8);
        tx0 tx0Var = this.a;
        tx0Var.a(fs3Var);
        WebSettings settings = tx0Var.getSettings();
        jr0 jr0Var = this.d.a;
        jr0Var.getClass();
        Boolean bool = Boolean.FALSE;
        ao aoVar = ao.a$11;
        settings.setUseWideViewPort(((Boolean) jr0Var.a("gads:use_wide_viewport:enabled", bool, aoVar)).booleanValue());
        WebSettings settings2 = tx0Var.getSettings();
        jr0Var.getClass();
        settings2.setLoadWithOverviewMode(((Boolean) jr0Var.a("gads:load_with_overview_mode:enabled", bool, aoVar)).booleanValue());
        return O9245300239821758723.a;
    }
}
