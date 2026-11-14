package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y3820226838464518618 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = Y3398285834625198673.a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fI = S2941385686793915703.I(layout, lineForOffset, paint) + S2941385686793915703.H(layout, lineForOffset, paint);
            if (fI == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(fI, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
