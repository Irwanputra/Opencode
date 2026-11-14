package dev.epro.r0;

import android.os.Bundle;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F3433091394670544721 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public F3433091394670544721(Z102412548944701279 z102412548944701279, int i) {
        this.c = z102412548944701279;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((F4673815160636847046) obj).b.onNavigationEvent(i);
                break;
            default:
                ((Z102412548944701279) obj).f(i);
                break;
        }
    }

    public F3433091394670544721(F4673815160636847046 f4673815160636847046, int i, Bundle bundle) {
        this.c = f4673815160636847046;
        this.b = i;
    }
}
