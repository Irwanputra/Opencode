package ads_mobile_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import dev.epro.r0.G7713175901684004489;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.U9077732032884938013;
import dev.epro.r0.W1307410158614224409;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z17140323912468745023;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mw1 implements Z17140323912468745023 {
    public final jp0 a;
    public final c7 b;

    public mw1(jp0 jp0Var) {
        jp0Var.getClass();
        this.a = jp0Var;
        this.b = new c7((byte) 13, false);
    }

    @Override // dev.epro.r0.Z17140323912468745023
    public final Object a(boolean z, R4833348786910499294 r4833348786910499294) throws IOException {
        FrameLayout frameLayoutC;
        if (z) {
            c7 c7Var = this.b;
            if (c7Var.a != null && (frameLayoutC = ((ew1) ((W1307410158614224409) c7Var.a("The backing field has not yet been initialized."))).c()) != null) {
                Map mapB = ((ew1) ((W1307410158614224409) c7Var.a("The backing field has not yet been initialized."))).b();
                ImageView.ScaleType scaleTypeE = ((ew1) ((W1307410158614224409) c7Var.a("The backing field has not yet been initialized."))).e();
                if (scaleTypeE == null) {
                    scaleTypeE = iw1.i;
                }
                ImageView.ScaleType scaleType = scaleTypeE;
                jp0 jp0Var = this.a;
                jp0Var.getClass();
                scaleType.getClass();
                boolean z2 = true;
                if (!jp0Var.a.getAndSet(true)) {
                    W5797197595347441198 w5797197595347441198 = jp0Var.h;
                    R7033599853981556291.E(w5797197595347441198, null, null, new xo0(jp0Var, null, (byte) 1), 3);
                    vv1 vv1VarC = G7713175901684004489.c(jp0Var.n, jp0Var.f62o, jp0Var.l, frameLayoutC, mapB, scaleType);
                    String strA = jp0Var.a(frameLayoutC);
                    if (jp0Var.w.q0) {
                        jp0Var.x.a();
                    } else {
                        z2 = false;
                    }
                    R7033599853981556291.E(w5797197595347441198, null, null, new U9077732032884938013(jp0Var, vv1VarC, strA, z2, null, (byte) 1), 3);
                }
            }
        }
        return O9245300239821758723.a;
    }
}
