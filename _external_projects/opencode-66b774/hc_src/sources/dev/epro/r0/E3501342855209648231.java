package dev.epro.r0;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E3501342855209648231 implements P11864007600649976263, S17787728937930228535 {
    public final /* synthetic */ Toolbar a;

    public /* synthetic */ E3501342855209648231(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // dev.epro.r0.S17787728937930228535
    public void f(T8605657386197958581 t8605657386197958581) {
        Toolbar toolbar = this.a;
        T1878852318042345820 t1878852318042345820 = toolbar.a.t;
        if (t1878852318042345820 == null || !t1878852318042345820.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.G.d).iterator();
            while (it.hasNext()) {
                ((F5958934288633973125) it.next()).a.r();
            }
        }
    }

    @Override // dev.epro.r0.S17787728937930228535
    public boolean l(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        return false;
    }
}
