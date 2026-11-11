package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p086.p087.p088.C1544;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Placeholder extends View {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f954;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public View f955;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f956;

    public Placeholder(Context context) {
        super(context);
        this.f954 = -1;
        this.f955 = null;
        this.f956 = 4;
        m322(null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f954 = -1;
        this.f955 = null;
        this.f956 = 4;
        m322(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f954 = -1;
        this.f955 = null;
        this.f956 = 4;
        m322(attributeSet);
    }

    public View getContent() {
        return this.f955;
    }

    public int getEmptyVisibility() {
        return this.f956;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(Base64.BASELENGTH, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f954 == i) {
            return;
        }
        View view = this.f955;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f955.getLayoutParams()).f891 = false;
            this.f955 = null;
        }
        this.f954 = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f956 = i;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m321() {
        if (this.f955 == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f955.getLayoutParams();
        layoutParams2.f923.f7217 = 0;
        C1544.EnumC1545 m3424 = layoutParams.f923.m3424();
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.FIXED;
        if (m3424 != enumC1545) {
            layoutParams.f923.m3416(layoutParams2.f923.m3438());
        }
        if (layoutParams.f923.m3430() != enumC1545) {
            layoutParams.f923.m3421(layoutParams2.f923.m3418());
        }
        layoutParams2.f923.f7217 = 8;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m322(AttributeSet attributeSet) {
        super.setVisibility(this.f956);
        this.f954 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ConstraintLayout_placeholder_content) {
                    this.f954 = obtainStyledAttributes.getResourceId(index, this.f954);
                } else if (index == C1575.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f956 = obtainStyledAttributes.getInt(index, this.f956);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
