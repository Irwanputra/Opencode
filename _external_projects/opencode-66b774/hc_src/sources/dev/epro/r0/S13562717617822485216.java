package dev.epro.r0;

import android.widget.LinearLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class S13562717617822485216 implements P5210161598916505319, H8032588520594078423 {
    @Override // dev.epro.r0.H8032588520594078423
    public void a(AdActivity adActivity) {
        LinearLayout linearLayout = new LinearLayout(adActivity);
        adActivity.setContentView(linearLayout);
        a(adActivity, linearLayout);
    }

    public abstract void a(AdActivity adActivity, LinearLayout linearLayout);

    @Override // dev.epro.r0.P5210161598916505319
    public void d() {
    }

    @Override // dev.epro.r0.P5210161598916505319
    public void f() {
    }
}
