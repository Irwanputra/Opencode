package dev.epro.r0;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y13622109983022104692 extends Q16288694989151008459 {
    @Override // dev.epro.r0.Q16288694989151008459
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // dev.epro.r0.Q16288694989151008459
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
