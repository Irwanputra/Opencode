package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class b01 implements dev.epro.r0.Y4798753258822141670, dev.epro.r0.E1738554508920355622 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final ads_mobile_sdk.t02 b;
    public final dev.epro.r0.V2597580950516131749 c;

    public b01(dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.t02 t02Var, dev.epro.r0.V2597580950516131749 v2597580950516131749) {
        w5797197595347441198.getClass();
        t02Var.getClass();
        this.a = w5797197595347441198;
        this.b = t02Var;
        this.c = v2597580950516131749;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.R7033599853981556291.E(this.a, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.E13942609761711486177((java.lang.Object) tx0Var, (java.lang.Object) this, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 3);
        ads_mobile_sdk.t02 t02Var = this.b;
        android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) t02Var.b.get();
        android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (android.view.ViewTreeObserver.OnScrollChangedListener) t02Var.c.get();
        if (onScrollChangedListener == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            ads_mobile_sdk.zi3.a(6, "Failed to detach scroll changed listener.", null);
        } else {
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        }
        t02Var.a = new java.lang.ref.WeakReference(null);
        t02Var.b = new java.lang.ref.WeakReference(null);
        t02Var.c = new java.lang.ref.WeakReference(null);
        java.lang.Object objA = tx0Var.a(r4833348786910499294);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 50;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objA;
        ads_mobile_sdk.tx0 tx0Var = (ads_mobile_sdk.tx0) this.b.d.get();
        return (tx0Var != null && (objA = a(tx0Var, (java.util.Map) dev.epro.r0.X9852054718446117252.a, r4833348786910499294)) == dev.epro.r0.Z3437138737604933638.a) ? objA : dev.epro.r0.O9245300239821758723.a;
    }
}
