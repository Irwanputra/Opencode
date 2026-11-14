package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D8470282021971048884 extends dev.epro.r0.S13562717617822485216 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ dev.epro.r0.I6301446377683660838 f;

    public /* synthetic */ D8470282021971048884(dev.epro.r0.I6301446377683660838 i6301446377683660838, byte b) {
        this.e = b;
        this.f = i6301446377683660838;
    }

    public final void a() {
        android.view.View view;
        byte b = this.e;
        dev.epro.r0.I6301446377683660838 i6301446377683660838 = this.f;
        switch (b) {
            case 0:
                if (i6301446377683660838.o && (view = i6301446377683660838.g) != null) {
                    view.setTranslationY(0.0f);
                    i6301446377683660838.d.setTranslationY(0.0f);
                }
                i6301446377683660838.d.setVisibility(8);
                i6301446377683660838.d.setTransitioning(false);
                i6301446377683660838.s = null;
                dev.epro.r0.W8455343525638953052 w8455343525638953052 = i6301446377683660838.k;
                if (w8455343525638953052 != null) {
                    w8455343525638953052.I(i6301446377683660838.j);
                    i6301446377683660838.j = null;
                    i6301446377683660838.k = null;
                }
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = i6301446377683660838.c;
                if (actionBarOverlayLayout != null) {
                    java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                i6301446377683660838.s = null;
                i6301446377683660838.d.requestLayout();
                break;
        }
    }
}
