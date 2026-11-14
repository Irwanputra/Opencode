package ads_mobile_sdk;

import android.widget.FrameLayout;
import dev.epro.r0.L15364388172060466559;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qw1 {
    public final L15364388172060466559 a;
    public final mw1 b;
    public final zy1 c;

    public qw1(L15364388172060466559 l15364388172060466559, mw1 mw1Var, zy1 zy1Var) {
        l15364388172060466559.getClass();
        mw1Var.getClass();
        zy1Var.getClass();
        this.a = l15364388172060466559;
        this.b = mw1Var;
        this.c = zy1Var;
    }

    public final void a(ew1 ew1Var) {
        c7 c7Var = this.b.b;
        synchronized (c7Var) {
            c7Var.a = ew1Var;
        }
        c7 c7Var2 = this.c.d;
        synchronized (c7Var2) {
            c7Var2.a = ew1Var;
        }
        FrameLayout frameLayoutC = ew1Var.c();
        if (frameLayoutC != null) {
            L15364388172060466559 l15364388172060466559 = this.a;
            l15364388172060466559.getClass();
            l15364388172060466559.i = frameLayoutC;
            l15364388172060466559.j = true;
            l15364388172060466559.a(frameLayoutC);
        }
    }
}
