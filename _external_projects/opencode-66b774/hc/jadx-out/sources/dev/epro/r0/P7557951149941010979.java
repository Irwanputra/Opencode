package dev.epro.r0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P7557951149941010979 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ E3889562084885881810 b;
    public final /* synthetic */ H11725168162114556860 c;

    public /* synthetic */ P7557951149941010979(E3889562084885881810 e3889562084885881810, H11725168162114556860 h11725168162114556860, byte b) {
        this.a = b;
        this.b = e3889562084885881810;
        this.c = h11725168162114556860;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsB;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        H11725168162114556860 h11725168162114556860 = this.c;
        E3889562084885881810 e3889562084885881810 = this.b;
        switch (b) {
            case 0:
                Q13169198992966610970.a0(e3889562084885881810, h11725168162114556860);
                ((S7974369370986781936) e3889562084885881810.c).D = true;
                int[] iArr = e3889562084885881810.n;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = e3889562084885881810.b;
                view.getLocationOnScreen(iArr);
                long j = e3889562084885881810.f388o;
                long jN = ((B1029012102904255937) obj).N();
                e3889562084885881810.f388o = jN;
                N3121440022506799205 n3121440022506799205 = e3889562084885881810.p;
                if (n3121440022506799205 != null && ((i != iArr[0] || i2 != iArr[1] || !Q13254524308163418711.a(j, jN)) && (windowInsetsB = e3889562084885881810.k(n3121440022506799205).b()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
            case 1:
                View view2 = e3889562084885881810.b;
                Y633750919412282388 y633750919412282388 = (Y633750919412282388) obj;
                S7974369370986781936 s7974369370986781936 = y633750919412282388 instanceof S7974369370986781936 ? (S7974369370986781936) y633750919412282388 : null;
                if (s7974369370986781936 != null) {
                    s7974369370986781936.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(e3889562084885881810, h11725168162114556860);
                    s7974369370986781936.getAndroidViewsHandler$ui().addView(e3889562084885881810);
                    s7974369370986781936.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(h11725168162114556860, e3889562084885881810);
                    e3889562084885881810.setImportantForAccessibility(1);
                    W10240872260424387225.j(e3889562084885881810, new J12475019169984880394(s7974369370986781936, h11725168162114556860, s7974369370986781936));
                }
                if (view2.getParent() != e3889562084885881810) {
                    e3889562084885881810.addView(view2);
                }
                break;
            default:
                Q13169198992966610970.a0(e3889562084885881810, h11725168162114556860);
                break;
        }
        return o9245300239821758723;
    }
}
