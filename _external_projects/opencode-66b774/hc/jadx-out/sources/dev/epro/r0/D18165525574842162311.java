package dev.epro.r0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D18165525574842162311 extends R11798632102026936588 implements V17859802919350004506 {
    public final /* synthetic */ T1878852318042345820 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D18165525574842162311(T1878852318042345820 t1878852318042345820, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = t1878852318042345820;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        E2166724654553415323.r(this, getContentDescription());
        setOnTouchListener(new P10847846558498882845(this, this));
    }

    @Override // dev.epro.r0.V17859802919350004506
    public final boolean b() {
        return false;
    }

    @Override // dev.epro.r0.V17859802919350004506
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
