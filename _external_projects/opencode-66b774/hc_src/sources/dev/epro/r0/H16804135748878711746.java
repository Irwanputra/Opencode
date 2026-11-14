package dev.epro.r0;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H16804135748878711746 extends H18172316468146598624 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final L14793767707362067090 i;

    public H16804135748878711746(Context context, Q13914734507241918864 q13914734507241918864) {
        super(context, q13914734507241918864);
        Object systemService = ((Context) this.b).getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new L14793767707362067090(this, (byte) 3);
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final Object c() {
        return J16202216050578767584.a(this.f, this.h);
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final void e() {
        try {
            B14824868959299866349 n = B14824868959299866349.n();
            int i = J16202216050578767584.a;
            n.getClass();
            ConnectivityManager connectivityManager = this.f;
            L14793767707362067090 l14793767707362067090 = this.i;
            connectivityManager.getClass();
            l14793767707362067090.getClass();
            connectivityManager.registerDefaultNetworkCallback(l14793767707362067090);
        } catch (IllegalArgumentException unused) {
            B14824868959299866349 n2 = B14824868959299866349.n();
            int i2 = J16202216050578767584.a;
            n2.getClass();
        } catch (SecurityException unused2) {
            B14824868959299866349 n3 = B14824868959299866349.n();
            int i3 = J16202216050578767584.a;
            n3.getClass();
        }
    }

    @Override // dev.epro.r0.H18172316468146598624
    public final void f() {
        try {
            B14824868959299866349 n = B14824868959299866349.n();
            int i = J16202216050578767584.a;
            n.getClass();
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException unused) {
            B14824868959299866349 n2 = B14824868959299866349.n();
            int i2 = J16202216050578767584.a;
            n2.getClass();
        } catch (SecurityException unused2) {
            B14824868959299866349 n3 = B14824868959299866349.n();
            int i3 = J16202216050578767584.a;
            n3.getClass();
        }
    }
}
