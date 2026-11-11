package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p034.p035.p045.C1096;
import p034.p050.C1148;
import p034.p050.p053.C1209;
import p034.p050.p055.p056.C1266;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f408;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f409;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f410;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int[] f411;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f412;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f413;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f414;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f415;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Drawable f416;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f417;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f418;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f419;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f420;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f421;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int[] f422;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f423;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float f424;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f423 = -1;
            this.f424 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f423 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.LinearLayoutCompat_Layout);
            this.f424 = obtainStyledAttributes.getFloat(C1148.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f423 = obtainStyledAttributes.getInt(C1148.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f423 = -1;
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        this.f409 = true;
        this.f414 = -1;
        this.f419 = 0;
        this.f417 = 8388659;
        int[] iArr = C1148.LinearLayoutCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C1096.m2493(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = obtainStyledAttributes.getInt(C1148.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(C1148.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(C1148.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f408 = obtainStyledAttributes.getFloat(C1148.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f414 = obtainStyledAttributes.getInt(C1148.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f421 = obtainStyledAttributes.getBoolean(C1148.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = C1148.LinearLayoutCompat_divider;
        setDividerDrawable((!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) ? obtainStyledAttributes.getDrawable(i4) : C1266.m2928(context, resourceId));
        this.f413 = obtainStyledAttributes.getInt(C1148.LinearLayoutCompat_showDividers, 0);
        this.f412 = obtainStyledAttributes.getDimensionPixelSize(C1148.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f414 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f414;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f414 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f419;
        if (this.f415 == 1 && (i = this.f417 & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f410) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f410;
            }
        }
        return i3 + ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f414;
    }

    public Drawable getDividerDrawable() {
        return this.f416;
    }

    public int getDividerPadding() {
        return this.f412;
    }

    public int getDividerWidth() {
        return this.f418;
    }

    public int getGravity() {
        return this.f417;
    }

    public int getOrientation() {
        return this.f415;
    }

    public int getShowDividers() {
        return this.f413;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f408;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f416 == null) {
            return;
        }
        int i2 = 0;
        if (this.f415 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m173(i2)) {
                    m171(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.f420);
                }
                i2++;
            }
            if (m173(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m171(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f420 : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m2693 = C1209.m2693(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m173(i2)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                m167(canvas, m2693 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f418);
            }
            i2++;
        }
        if (m173(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (m2693) {
                    left = childAt4.getLeft();
                    i = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                    right = (left - i) - this.f418;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                }
            } else if (m2693) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.f418;
            }
            m167(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c8, code lost:
    
        if (r13 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x075a, code lost:
    
        if (r7 < 0) goto L337;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0703  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f409 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f414 = i;
            return;
        }
        StringBuilder m4207 = C2098.m4207("base aligned child index out of range (0, ");
        m4207.append(getChildCount());
        m4207.append(")");
        throw new IllegalArgumentException(m4207.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f416) {
            return;
        }
        this.f416 = drawable;
        if (drawable != null) {
            this.f418 = drawable.getIntrinsicWidth();
            this.f420 = drawable.getIntrinsicHeight();
        } else {
            this.f418 = 0;
            this.f420 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f412 = i;
    }

    public void setGravity(int i) {
        if (this.f417 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f417 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f417;
        if ((8388615 & i3) != i2) {
            this.f417 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f421 = z;
    }

    public void setOrientation(int i) {
        if (this.f415 != i) {
            this.f415 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f413) {
            requestLayout();
        }
        this.f413 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f417;
        if ((i3 & 112) != i2) {
            this.f417 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f408 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: 〳ぜぞぜべっ, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f415;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m167(Canvas canvas, int i) {
        this.f416.setBounds(i, getPaddingTop() + this.f412, this.f418 + i, (getHeight() - getPaddingBottom()) - this.f412);
        this.f416.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: いいにぽつ, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int m168() {
        return 0;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m169(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int m170() {
        return 0;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m171(Canvas canvas, int i) {
        this.f416.setBounds(getPaddingLeft() + this.f412, i, (getWidth() - getPaddingRight()) - this.f412, this.f420 + i);
        this.f416.draw(canvas);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int m172() {
        return 0;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m173(int i) {
        if (i == 0) {
            return (this.f413 & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f413 & 4) != 0;
        }
        if ((this.f413 & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: ぺぁあねじ, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int m174() {
        return 0;
    }
}
