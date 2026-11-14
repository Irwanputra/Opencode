package dev.epro.r0;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D8470282021971048884 extends S13562717617822485216 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ I6301446377683660838 f;

    public /* synthetic */ D8470282021971048884(I6301446377683660838 i6301446377683660838, byte b) {
        this.e = b;
        this.f = i6301446377683660838;
    }

    @Override // dev.epro.r0.P5210161598916505319
    public final void a() {
        View view;
        byte b = this.e;
        I6301446377683660838 i6301446377683660838 = this.f;
        switch (b) {
            case 0:
                if (i6301446377683660838.f297o && (view = i6301446377683660838.g) != null) {
                    view.setTranslationY(0.0f);
                    i6301446377683660838.d.setTranslationY(0.0f);
                }
                i6301446377683660838.d.setVisibility(8);
                i6301446377683660838.d.setTransitioning(false);
                i6301446377683660838.s = null;
                W8455343525638953052 w8455343525638953052 = i6301446377683660838.k;
                if (w8455343525638953052 != null) {
                    w8455343525638953052.I(i6301446377683660838.j);
                    i6301446377683660838.j = null;
                    i6301446377683660838.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = i6301446377683660838.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = W10240872260424387225.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                i6301446377683660838.s = null;
                i6301446377683660838.d.requestLayout();
                break;
        }
    }
}
