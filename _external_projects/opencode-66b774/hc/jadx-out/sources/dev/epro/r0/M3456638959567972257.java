package dev.epro.r0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M3456638959567972257 extends MetricAffectingSpan {
    public final float a;

    public M3456638959567972257(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }
}
