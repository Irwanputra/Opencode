package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D11138356156783438498 extends android.widget.RatingBar {
    public final dev.epro.r0.W8455343525638953052 a;

    public D11138356156783438498(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969667);
        dev.epro.r0.X170853990943489827.a(this, getContext());
        dev.epro.r0.W8455343525638953052 w8455343525638953052 = new dev.epro.r0.W8455343525638953052(this, (byte) 1);
        this.a = w8455343525638953052;
        w8455343525638953052.E(attributeSet, 2130969667);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
