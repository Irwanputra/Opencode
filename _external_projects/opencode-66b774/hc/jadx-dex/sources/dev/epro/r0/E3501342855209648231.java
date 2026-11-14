package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E3501342855209648231 implements dev.epro.r0.P11864007600649976263, dev.epro.r0.S17787728937930228535 {
    public final /* synthetic */ androidx.appcompat.widget.Toolbar a;

    public void f(dev.epro.r0.T8605657386197958581 t8605657386197958581) {
        androidx.appcompat.widget.Toolbar toolbar = this.a;
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = toolbar.a.t;
        if (t1878852318042345820 == null || !t1878852318042345820.g()) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) toolbar.G.d).iterator();
            while (it.hasNext()) {
                ((dev.epro.r0.F5958934288633973125) it.next()).a.r();
            }
        }
    }

    public boolean l(dev.epro.r0.T8605657386197958581 t8605657386197958581, android.view.MenuItem menuItem) {
        return false;
    }
}
