package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p034.p050.C1264;
import p034.p050.p053.C1200;
import p034.p050.p053.C1252;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1200 f363;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1252.m2892(this, getContext());
        C1200 c1200 = new C1200(this);
        this.f363 = c1200;
        c1200.mo2676(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f363.f5943;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
