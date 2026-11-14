package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ai2 implements dev.epro.r0.Y4798753258822141670 {
    public java.lang.Object a;
    public final dev.epro.r0.Y4798753258822141670 b;
    public final /* synthetic */ byte c;

    public ai2(ads_mobile_sdk.z1 z1Var, dev.epro.r0.Y4798753258822141670 y4798753258822141670, byte b) {
        this.c = b;
        switch (b) {
            case 1:
                z1Var.getClass();
                this.b = y4798753258822141670;
                ads_mobile_sdk.k61 k61Var = z1Var.I;
                this.a = k61Var != null ? k61Var.e : null;
                break;
            default:
                this.a = z1Var;
                this.b = y4798753258822141670;
                break;
        }
    }

    public final void a(java.lang.String str) {
        switch (this.c) {
            case 0:
                str.getClass();
                this.b.a(str);
                break;
            default:
                str.getClass();
                this.a = str;
                break;
        }
    }

    public final int b() {
        byte b = this.c;
        dev.epro.r0.Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.b();
    }

    public final boolean c() {
        byte b = this.c;
        dev.epro.r0.Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.c();
    }

    public final java.lang.String d() {
        switch (this.c) {
            case 0:
                ads_mobile_sdk.k61 k61Var = ((ads_mobile_sdk.z1) this.a).I;
                if (k61Var != null) {
                    return k61Var.e;
                }
                return null;
            default:
                return (java.lang.String) this.a;
        }
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        byte b = this.c;
        dev.epro.r0.Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.a(tx0Var, map, r4833348786910499294);
    }

    public final dev.epro.r0.Y4798753258822141670 a() {
        byte b = this.c;
        dev.epro.r0.Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.a();
    }
}
