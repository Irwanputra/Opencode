package ads_mobile_sdk;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class w13 {
    public static final w13 d;
    public WeakReference a;
    public boolean b;
    public boolean c;

    static {
        w13 w13Var = new w13();
        w13Var.b = false;
        w13Var.c = false;
        d = w13Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(n6.c.a).iterator();
        while (it.hasNext()) {
            o6 o6Var = ((m6) it.next()).d;
            boolean z3 = z2 || z;
            if (o6Var.b.get() != 0) {
                d62.a.a((WebView) o6Var.b.get(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }
}
