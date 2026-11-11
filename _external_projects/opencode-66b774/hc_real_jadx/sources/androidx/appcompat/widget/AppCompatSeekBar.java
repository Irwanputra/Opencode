package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p034.p050.C1264;
import p034.p050.p053.C1252;
import p034.p050.p053.C1259;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1259 f364;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1252.m2892(this, getContext());
        C1259 c1259 = new C1259(this);
        this.f364 = c1259;
        c1259.mo2676(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1259 c1259 = this.f364;
        Drawable drawable = c1259.f6158;
        if (drawable != null && drawable.isStateful() && drawable.setState(c1259.f6160.getDrawableState())) {
            c1259.f6160.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f364.f6158;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f364.m2908(canvas);
    }
}
