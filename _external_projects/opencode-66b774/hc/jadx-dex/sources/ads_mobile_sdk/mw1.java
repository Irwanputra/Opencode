package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mw1 implements dev.epro.r0.Z17140323912468745023 {
    public final ads_mobile_sdk.jp0 a;
    public final ads_mobile_sdk.c7 b;

    public mw1(ads_mobile_sdk.jp0 jp0Var) {
        jp0Var.getClass();
        this.a = jp0Var;
        this.b = new ads_mobile_sdk.c7((byte) 13, false);
    }

    public final java.lang.Object a(boolean z, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        android.widget.FrameLayout frameLayoutC;
        if (z) {
            ads_mobile_sdk.c7 c7Var = this.b;
            if (c7Var.a != null && (frameLayoutC = ((ads_mobile_sdk.ew1) ((dev.epro.r0.W1307410158614224409) c7Var.a("The backing field has not yet been initialized."))).c()) != null) {
                java.util.Map mapB = ((ads_mobile_sdk.ew1) ((dev.epro.r0.W1307410158614224409) c7Var.a("The backing field has not yet been initialized."))).b();
                android.widget.ImageView.ScaleType scaleTypeE = ((ads_mobile_sdk.ew1) ((dev.epro.r0.W1307410158614224409) c7Var.a("The backing field has not yet been initialized."))).e();
                if (scaleTypeE == null) {
                    scaleTypeE = ads_mobile_sdk.iw1.i;
                }
                android.widget.ImageView.ScaleType scaleType = scaleTypeE;
                ads_mobile_sdk.jp0 jp0Var = this.a;
                jp0Var.getClass();
                scaleType.getClass();
                boolean z2 = true;
                if (!jp0Var.a.getAndSet(true)) {
                    dev.epro.r0.W5797197595347441198 w5797197595347441198 = jp0Var.h;
                    dev.epro.r0.R7033599853981556291.E(w5797197595347441198, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.xo0(jp0Var, null, (byte) 1), 3);
                    ads_mobile_sdk.vv1 vv1VarC = dev.epro.r0.G7713175901684004489.c(jp0Var.n, jp0Var.f62o, jp0Var.l, frameLayoutC, mapB, scaleType);
                    java.lang.String strA = jp0Var.a(frameLayoutC);
                    if (jp0Var.w.q0) {
                        jp0Var.x.a();
                    } else {
                        z2 = false;
                    }
                    dev.epro.r0.R7033599853981556291.E(w5797197595347441198, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.U9077732032884938013(jp0Var, vv1VarC, strA, z2, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 3);
                }
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
