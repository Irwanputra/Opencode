package ads_mobile_sdk;

import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class i6 extends zj {
    public static final i6 d = new i6();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.zj
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(n6.c.a).iterator();
        while (it.hasNext()) {
            o6 o6Var = ((m6) it.next()).d;
            if (o6Var.b.get() != 0) {
                d62.a.a((WebView) o6Var.b.get(), "setState", z ? "foregrounded" : "backgrounded", o6Var.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.zj
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(n6.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((m6) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
