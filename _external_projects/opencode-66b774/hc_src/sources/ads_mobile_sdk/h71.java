package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class h71 implements B8427392651679410143 {
    public final rg0 a;
    public final rg0 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ h71(rg0 rg0Var, rg0 rg0Var2, byte b) {
        this.c = b;
        this.a = rg0Var;
        this.b = rg0Var2;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.c;
        rg0 rg0Var = this.b;
        rg0 rg0Var2 = this.a;
        switch (b) {
            case 0:
                return new g71((sb) rg0Var2.get(), (ci3) rg0Var.get());
            case 1:
                zj1 zj1Var = (zj1) rg0Var2.get();
                fz fzVar = (fz) rg0Var.get();
                zj1Var.getClass();
                fzVar.getClass();
                return new f41(zj1Var, fzVar, (byte) 0);
            default:
                return new tm3((fz) rg0Var2.get(), (ci3) rg0Var.get());
        }
    }
}
