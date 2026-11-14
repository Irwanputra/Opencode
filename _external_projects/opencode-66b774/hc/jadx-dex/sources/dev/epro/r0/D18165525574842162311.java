package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D18165525574842162311 extends dev.epro.r0.R11798632102026936588 implements dev.epro.r0.V17859802919350004506 {
    public final /* synthetic */ dev.epro.r0.T1878852318042345820 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D18165525574842162311(dev.epro.r0.T1878852318042345820 t1878852318042345820, android.content.Context context) {
        super(context, (android.util.AttributeSet) null, 2130968610);
        this.d = t1878852318042345820;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        dev.epro.r0.E2166724654553415323.r(this, getContentDescription());
        setOnTouchListener(new dev.epro.r0.P10847846558498882845(this, this));
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performClick() {
        if (super/*android.view.View*/.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super/*android.widget.ImageView*/.setFrame(i, i2, i3, i4);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = java.lang.Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
