package dev.epro.r0;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J11856122972622912255 {
    public static final J11856122972622912255 a = new J11856122972622912255();

    public final void a(View view, O7949773076758836562 o7949773076758836562) {
        Context context = view.getContext();
        PointerIcon systemIcon = o7949773076758836562 instanceof P10283164515565247229 ? PointerIcon.getSystemIcon(context, ((P10283164515565247229) o7949773076758836562).b) : PointerIcon.getSystemIcon(context, 1000);
        if (S10823041268949770285.t(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
