package dev.epro.r0;

import android.os.Bundle;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z12547059477375952878 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ F4673815160636847046 c;

    public /* synthetic */ Z12547059477375952878(F4673815160636847046 f4673815160636847046, String str, Bundle bundle, byte b) {
        this.a = b;
        this.c = f4673815160636847046;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.b;
        F4673815160636847046 f4673815160636847046 = this.c;
        switch (b) {
            case 0:
                f4673815160636847046.b.extraCallback(str);
                break;
            default:
                f4673815160636847046.b.onPostMessage(str);
                break;
        }
    }
}
