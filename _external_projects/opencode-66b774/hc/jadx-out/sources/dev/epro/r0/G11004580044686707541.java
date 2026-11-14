package dev.epro.r0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G11004580044686707541 extends R15896830329318850690 implements O15099455688051794795 {
    @Override // dev.epro.r0.O15099455688051794795
    public final void N(C13258628320776285546 c13258628320776285546) {
        View viewI = O8620973563946607355.I(this);
        c13258628320776285546.c(this.a.n && O8620973563946607355.I(this).hasFocusable());
        View viewFindFocus = viewI.findFocus();
        if (viewFindFocus != null) {
            c13258628320776285546.b(U13290528641708548929.a(viewFindFocus, viewI));
        }
    }
}
