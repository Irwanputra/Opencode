package dev.epro.r0;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W1433264446200197743 extends R15896830329318850690 implements K4700587928988752109 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F4096073349764486348 f554o;
    public F4096073349764486348 p;

    @Override // dev.epro.r0.K4700587928988752109
    public final boolean j0(KeyEvent keyEvent) {
        F4096073349764486348 f4096073349764486348 = this.f554o;
        if (f4096073349764486348 != null) {
            return ((Boolean) f4096073349764486348.invoke(new Q16871679788547714558(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // dev.epro.r0.K4700587928988752109
    public final boolean p(KeyEvent keyEvent) {
        F4096073349764486348 f4096073349764486348 = this.p;
        if (f4096073349764486348 != null) {
            return ((Boolean) f4096073349764486348.invoke(new Q16871679788547714558(keyEvent))).booleanValue();
        }
        return false;
    }
}
