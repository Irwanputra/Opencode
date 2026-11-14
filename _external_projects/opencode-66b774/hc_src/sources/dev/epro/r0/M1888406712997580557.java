package dev.epro.r0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M1888406712997580557 extends ClickableSpan {
    public final int a;
    public final P11546267793636643785 b;
    public final int c;

    public M1888406712997580557(int i, P11546267793636643785 p11546267793636643785, int i2) {
        this.a = i;
        this.b = p11546267793636643785;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
