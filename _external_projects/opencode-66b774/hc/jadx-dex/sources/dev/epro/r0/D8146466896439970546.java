package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D8146466896439970546 extends dev.epro.r0.E686369837194379706 {
    public final java.lang.CharSequence j;
    public final android.text.TextPaint k;

    public D8146466896439970546(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        this.j = charSequence;
        this.k = textPaint;
    }

    @Override // dev.epro.r0.E686369837194379706
    public final int D(int i) {
        java.lang.CharSequence charSequence = this.j;
        return this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // dev.epro.r0.E686369837194379706
    public final int J(int i) {
        java.lang.CharSequence charSequence = this.j;
        return this.k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
