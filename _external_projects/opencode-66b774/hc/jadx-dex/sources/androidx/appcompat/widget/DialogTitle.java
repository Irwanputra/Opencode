package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class DialogTitle extends dev.epro.r0.Q6854864344654328121 {
    public DialogTitle(android.content.Context context) {
        super(context, (android.util.AttributeSet) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        android.text.Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, dev.epro.r0.Y17304307076558258116.v, android.R.attr.textAppearanceMedium, android.R.style.TextAppearance.Medium);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        super.onMeasure(i, i2);
    }

    public DialogTitle(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
