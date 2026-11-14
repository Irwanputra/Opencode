package ads_mobile_sdk;

import android.view.ViewTreeObserver;
import dev.epro.r0.E13942609761711486177;
import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X9852054718446117252;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class b01 implements Y4798753258822141670, E1738554508920355622 {
    public final W5797197595347441198 a;
    public final t02 b;
    public final V2597580950516131749 c;

    public b01(W5797197595347441198 w5797197595347441198, t02 t02Var, V2597580950516131749 v2597580950516131749) {
        w5797197595347441198.getClass();
        t02Var.getClass();
        this.a = w5797197595347441198;
        this.b = t02Var;
        this.c = v2597580950516131749;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        R7033599853981556291.E(this.a, null, null, new E13942609761711486177(tx0Var, this, (R4833348786910499294) null, (byte) 1), 3);
        t02 t02Var = this.b;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) t02Var.b.get();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) t02Var.c.get();
        if (onScrollChangedListener == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            zi3.a(6, "Failed to detach scroll changed listener.", null);
        } else {
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        }
        t02Var.a = new WeakReference(null);
        t02Var.b = new WeakReference(null);
        t02Var.c = new WeakReference(null);
        Object a = tx0Var.a(r4833348786910499294);
        return a == Z3437138737604933638.a ? a : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 50;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object a(R4833348786910499294 r4833348786910499294) {
        Object a;
        tx0 tx0Var = (tx0) this.b.d.get();
        return (tx0Var != null && (a = a(tx0Var, X9852054718446117252.a, r4833348786910499294)) == Z3437138737604933638.a) ? a : O9245300239821758723.a;
    }
}
