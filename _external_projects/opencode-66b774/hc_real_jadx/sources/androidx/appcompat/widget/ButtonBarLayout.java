package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p034.p035.p045.C1096;
import p034.p050.C1148;
import p034.p050.C1268;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f396;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f397;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f397 = -1;
        int[] iArr = C1148.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C1096.m2493(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f396 = obtainStyledAttributes.getBoolean(C1148.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C1268.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f396) {
            if (size > this.f397 && m164()) {
                setStacked(false);
            }
            this.f397 = size;
        }
        if (m164() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f396 && !m164()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m165 = m165(0);
        if (m165 >= 0) {
            View childAt = getChildAt(m165);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m164()) {
                int m1652 = m165(m165 + 1);
                i4 = m1652 >= 0 ? getChildAt(m1652).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        if (C1096.m2485(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f396 != z) {
            this.f396 = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m164() {
        return getOrientation() == 1;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int m165(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
