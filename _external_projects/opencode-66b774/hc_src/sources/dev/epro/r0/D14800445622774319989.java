package dev.epro.r0;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class D14800445622774319989 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ D14800445622774319989(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                J17018592638074147698 j17018592638074147698 = toolbar.L;
                I4217019646703278835 i4217019646703278835 = j17018592638074147698 == null ? null : j17018592638074147698.b;
                if (i4217019646703278835 != null) {
                    i4217019646703278835.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
