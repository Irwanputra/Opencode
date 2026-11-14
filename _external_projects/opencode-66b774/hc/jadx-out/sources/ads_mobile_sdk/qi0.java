package ads_mobile_sdk;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ qj3 b;

    public qi0(qj3 qj3Var, float f) {
        this.b = qj3Var;
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p72 p72Var = ((si0) this.b.a).e;
        float f = this.a;
        p72Var.a = f;
        n6 n6Var = p72Var.e;
        if (n6Var == null) {
            n6Var = n6.c;
            p72Var.e = n6Var;
        }
        Iterator it = Collections.unmodifiableCollection(n6Var.b).iterator();
        while (it.hasNext()) {
            o6 o6Var = ((m6) it.next()).d;
            d62.a.a((WebView) o6Var.b.get(), "setDeviceVolume", Float.valueOf(f), o6Var.a);
        }
    }
}
