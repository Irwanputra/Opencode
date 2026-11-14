package dev.epro.r0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F7726944745480145994 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ B18380949320309934747 a;

    public F7726944745480145994(B18380949320309934747 b18380949320309934747) {
        this.a = b18380949320309934747;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        B18380949320309934747 b18380949320309934747 = this.a;
        b18380949320309934747.g.a.clear();
        Y1947707678054676053 y1947707678054676053 = b18380949320309934747.h;
        synchronized (y1947707678054676053) {
            y1947707678054676053.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        B18380949320309934747 b18380949320309934747 = this.a;
        b18380949320309934747.g.a.clear();
        Y1947707678054676053 y1947707678054676053 = b18380949320309934747.h;
        synchronized (y1947707678054676053) {
            y1947707678054676053.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.t.a.setValue(Boolean.valueOf(z));
    }
}
