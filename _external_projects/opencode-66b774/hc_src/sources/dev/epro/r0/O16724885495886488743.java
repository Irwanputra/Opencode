package dev.epro.r0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O16724885495886488743 extends SeekBar {
    public final R5155493920167969557 a;

    public O16724885495886488743(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        X170853990943489827.a(this, getContext());
        R5155493920167969557 r5155493920167969557 = new R5155493920167969557(this);
        this.a = r5155493920167969557;
        r5155493920167969557.E(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R5155493920167969557 r5155493920167969557 = this.a;
        O16724885495886488743 o16724885495886488743 = r5155493920167969557.e;
        Drawable drawable = r5155493920167969557.f;
        if (drawable != null && drawable.isStateful() && drawable.setState(o16724885495886488743.getDrawableState())) {
            o16724885495886488743.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.R(canvas);
    }
}
