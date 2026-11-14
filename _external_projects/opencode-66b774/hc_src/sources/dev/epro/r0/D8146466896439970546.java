package dev.epro.r0;

import android.text.TextPaint;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D8146466896439970546 extends E686369837194379706 {
    public final CharSequence j;
    public final TextPaint k;

    public D8146466896439970546(CharSequence charSequence, TextPaint textPaint) {
        this.j = charSequence;
        this.k = textPaint;
    }

    @Override // dev.epro.r0.E686369837194379706
    public final int D(int i) {
        int textRunCursor;
        CharSequence charSequence = this.j;
        textRunCursor = this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // dev.epro.r0.E686369837194379706
    public final int J(int i) {
        int textRunCursor;
        CharSequence charSequence = this.j;
        textRunCursor = this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
