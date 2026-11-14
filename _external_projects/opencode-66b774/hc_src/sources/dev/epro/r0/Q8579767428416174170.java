package dev.epro.r0;

import android.os.Bundle;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q8579767428416174170 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ F4673815160636847046 b;

    public Q8579767428416174170(F4673815160636847046 f4673815160636847046, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.a = (byte) 3;
        this.b = f4673815160636847046;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        F4673815160636847046 f4673815160636847046 = this.b;
        switch (b) {
            case 0:
                f4673815160636847046.b.getClass();
                break;
            case 1:
                f4673815160636847046.b.onMessageChannelReady();
                break;
            case 2:
                f4673815160636847046.b.getClass();
                break;
            case 3:
                f4673815160636847046.b.getClass();
                break;
            default:
                f4673815160636847046.b.getClass();
                break;
        }
    }

    public /* synthetic */ Q8579767428416174170(F4673815160636847046 f4673815160636847046, Bundle bundle, byte b) {
        this.a = b;
        this.b = f4673815160636847046;
    }
}
