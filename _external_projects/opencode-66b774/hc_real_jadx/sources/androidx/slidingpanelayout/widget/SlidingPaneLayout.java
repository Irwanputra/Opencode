package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p043.C1067;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p063.p064.C1357;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public View f1621;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f1622;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f1623;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f1624;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f1625;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public InterfaceC0245 f1626;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final C1357 f1627;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f1628;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f1629;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final Rect f1630;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final ArrayList<RunnableC0242> f1631;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f1632;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Drawable f1633;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f1634;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Method f1635;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f1636;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f1637;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f1638;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Drawable f1639;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public Field f1640;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f1641;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f1642;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f1643;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public static final int[] f1644 = {R.attr.layout_weight};

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f1645;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f1646;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float f1647;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Paint f1648;

        public LayoutParams() {
            super(-1, -1);
            this.f1647 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1647 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1644);
            this.f1647 = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1647 = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1647 = 0.0f;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0241();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1649;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0241 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, null);
            this.f1649 = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f1649 ? 1 : 0);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0242 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final View f1650;

        public RunnableC0242(View view) {
            this.f1650 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1650.getParent() == SlidingPaneLayout.this) {
                this.f1650.setLayerType(0, null);
                SlidingPaneLayout.this.m961(this.f1650);
            }
            SlidingPaneLayout.this.f1631.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$くし〴〺ぅ, reason: contains not printable characters */
    public class C0243 extends C1357.AbstractC1359 {
        public C0243() {
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: 〳ぜぞぜべっ */
        public void mo458(View view, int i) {
            SlidingPaneLayout.this.m957();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: 〺つふすそ */
        public int mo459(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: いいにぽつ */
        public void mo461(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f1621 == null) {
                slidingPaneLayout.f1642 = 0.0f;
            } else {
                boolean m963 = slidingPaneLayout.m963();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f1621.getLayoutParams();
                int width = slidingPaneLayout.f1621.getWidth();
                if (m963) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((m963 ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (m963 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f1643;
                slidingPaneLayout.f1642 = paddingRight;
                if (slidingPaneLayout.f1637 != 0) {
                    slidingPaneLayout.m959(paddingRight);
                }
                if (layoutParams.f1646) {
                    slidingPaneLayout.m958(slidingPaneLayout.f1621, slidingPaneLayout.f1642, slidingPaneLayout.f1622);
                }
                View view2 = slidingPaneLayout.f1621;
                InterfaceC0245 interfaceC0245 = slidingPaneLayout.f1626;
                if (interfaceC0245 != null) {
                    interfaceC0245.m969(view2, slidingPaneLayout.f1642);
                }
            }
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: くし〴〺ぅ */
        public int mo462(View view) {
            return SlidingPaneLayout.this.f1643;
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: げつ〴ぬぐ */
        public int mo463(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f1621.getLayoutParams();
            if (!SlidingPaneLayout.this.m963()) {
                int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f1643 + paddingLeft);
            }
            int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f1621.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f1643);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: づざかべべ */
        public void mo464(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f1627.m3060(slidingPaneLayout.f1621, i2);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: てぜきぽく */
        public boolean mo465(View view, int i) {
            if (SlidingPaneLayout.this.f1634) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f1645;
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺぁあねじ */
        public void mo469(int i) {
            SlidingPaneLayout slidingPaneLayout;
            boolean z;
            SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
            if (slidingPaneLayout2.f1627.f6484 == 0) {
                if (slidingPaneLayout2.f1642 == 0.0f) {
                    slidingPaneLayout2.m960(slidingPaneLayout2.f1621);
                    SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
                    View view = slidingPaneLayout3.f1621;
                    InterfaceC0245 interfaceC0245 = slidingPaneLayout3.f1626;
                    if (interfaceC0245 != null) {
                        interfaceC0245.m968(view);
                    }
                    slidingPaneLayout3.sendAccessibilityEvent(32);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = false;
                } else {
                    View view2 = slidingPaneLayout2.f1621;
                    InterfaceC0245 interfaceC02452 = slidingPaneLayout2.f1626;
                    if (interfaceC02452 != null) {
                        interfaceC02452.m967(view2);
                    }
                    slidingPaneLayout2.sendAccessibilityEvent(32);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = true;
                }
                slidingPaneLayout.f1632 = z;
            }
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺふねづ〺 */
        public void mo470(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m963()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f1642 > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f1643;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f1621.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f1642 > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f1643;
                }
            }
            SlidingPaneLayout.this.f1627.m3052(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0244 extends C1102 {

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Rect f1654 = new Rect();

        public C0244() {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: くし〴〺ぅ */
        public void mo430(View view, AccessibilityEvent accessibilityEvent) {
            this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: なぎぱいぢぎ */
        public boolean mo457(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.m965(view)) {
                return false;
            }
            return this.f5594.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(c1084.f5550);
            this.f5594.onInitializeAccessibilityNodeInfo(view, obtain);
            Rect rect = this.f1654;
            obtain.getBoundsInParent(rect);
            c1084.f5550.setBoundsInParent(rect);
            obtain.getBoundsInScreen(rect);
            c1084.f5550.setBoundsInScreen(rect);
            int i = Build.VERSION.SDK_INT;
            c1084.m2449(i >= 16 ? obtain.isVisibleToUser() : false);
            c1084.f5550.setPackageName(obtain.getPackageName());
            c1084.f5550.setClassName(obtain.getClassName());
            c1084.f5550.setContentDescription(obtain.getContentDescription());
            c1084.f5550.setEnabled(obtain.isEnabled());
            c1084.f5550.setClickable(obtain.isClickable());
            c1084.f5550.setFocusable(obtain.isFocusable());
            c1084.f5550.setFocused(obtain.isFocused());
            c1084.m2458(i >= 16 ? obtain.isAccessibilityFocused() : false);
            c1084.f5550.setSelected(obtain.isSelected());
            c1084.f5550.setLongClickable(obtain.isLongClickable());
            c1084.f5550.addAction(obtain.getActions());
            int movementGranularities = i >= 16 ? obtain.getMovementGranularities() : 0;
            if (i >= 16) {
                c1084.f5550.setMovementGranularities(movementGranularities);
            }
            obtain.recycle();
            c1084.f5550.setClassName(SlidingPaneLayout.class.getName());
            c1084.f5549 = -1;
            c1084.f5550.setSource(view);
            AtomicInteger atomicInteger = C1096.f5578;
            Object parentForAccessibility = i >= 16 ? view.getParentForAccessibility() : view.getParent();
            if (parentForAccessibility instanceof View) {
                c1084.m2465((View) parentForAccessibility);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i2);
                if (!SlidingPaneLayout.this.m965(childAt) && childAt.getVisibility() == 0) {
                    C1096.m2505(childAt, 1);
                    c1084.f5550.addChild(childAt);
                }
            }
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0245 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        void m967(View view);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        void m968(View view);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m969(View view, float f);
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1622 = -858993460;
        this.f1638 = true;
        this.f1630 = new Rect();
        this.f1631 = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f1636 = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C1096.m2490(this, new C0244());
        C1096.m2505(this, 1);
        C1357 m3049 = C1357.m3049(this, 0.5f, new C0243());
        this.f1627 = m3049;
        m3049.f6495 = f * 400.0f;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f1627.m3054(true)) {
            if (!this.f1624) {
                this.f1627.m3061();
                return;
            }
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = m963() ? this.f1633 : this.f1639;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (m963()) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f1624 && !layoutParams.f1645 && this.f1621 != null) {
            canvas.getClipBounds(this.f1630);
            if (m963()) {
                Rect rect = this.f1630;
                rect.left = Math.max(rect.left, this.f1621.getRight());
            } else {
                Rect rect2 = this.f1630;
                rect2.right = Math.min(rect2.right, this.f1621.getLeft());
            }
            canvas.clipRect(this.f1630);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f1629;
    }

    public int getParallaxDistance() {
        return this.f1637;
    }

    public int getSliderFadeColor() {
        return this.f1622;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1638 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1638 = true;
        int size = this.f1631.size();
        for (int i = 0; i < size; i++) {
            this.f1631.get(i).run();
        }
        this.f1631.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f1624 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f1632 = !this.f1627.m3058(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f1624 || (this.f1634 && actionMasked != 0)) {
            this.f1627.m3051();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f1627.m3051();
            return false;
        }
        if (actionMasked == 0) {
            this.f1634 = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f1641 = x;
            this.f1628 = y;
            if (this.f1627.m3058(this.f1621, (int) x, (int) y) && m965(this.f1621)) {
                z = true;
                return this.f1627.m3057(motionEvent) || z;
            }
        } else if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float abs = Math.abs(x2 - this.f1641);
            float abs2 = Math.abs(y2 - this.f1628);
            C1357 c1357 = this.f1627;
            if (abs > c1357.f6477 && abs2 > abs) {
                c1357.m3051();
                this.f1634 = true;
                return false;
            }
        }
        z = false;
        if (this.f1627.m3057(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean m963 = m963();
        C1357 c1357 = this.f1627;
        if (m963) {
            c1357.f6480 = 2;
        } else {
            c1357.f6480 = 1;
        }
        int i10 = i3 - i;
        int paddingRight = m963 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = m963 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f1638) {
            this.f1642 = (this.f1624 && this.f1632) ? 1.0f : 0.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f1645) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13 - this.f1636) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f1643 = min;
                    int i14 = m963 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f1646 = (measuredWidth / 2) + ((i11 + i14) + min) > i13;
                    int i15 = (int) (min * this.f1642);
                    i5 = i14 + i15 + i11;
                    this.f1642 = i15 / min;
                    i6 = 0;
                } else if (!this.f1624 || (i7 = this.f1637) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.f1642) * i7);
                    i5 = paddingRight;
                }
                if (m963) {
                    i9 = (i10 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i11 = i5;
                paddingRight = childAt.getWidth() + paddingRight;
            }
        }
        if (this.f1638) {
            if (this.f1624) {
                if (this.f1637 != 0) {
                    m959(this.f1642);
                }
                if (((LayoutParams) this.f1621.getLayoutParams()).f1646) {
                    m958(this.f1621, this.f1642, this.f1622);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    m958(getChildAt(i16), 0.0f, this.f1622);
                }
            }
            m960(this.f1621);
        }
        this.f1638 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        if (savedState.f1649) {
            m964(0);
        } else {
            m962(0);
        }
        this.f1632 = savedState.f1649;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z = this.f1624;
        savedState.f1649 = z ? !z || this.f1642 == 1.0f : this.f1632;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f1638 = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1624) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1627.m3064(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f1641 = x;
            this.f1628 = y;
        } else if (actionMasked == 1 && m965(this.f1621)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f1641;
            float f2 = y2 - this.f1628;
            C1357 c1357 = this.f1627;
            int i = c1357.f6477;
            if ((f2 * f2) + (f * f) < i * i && c1357.m3058(this.f1621, (int) x2, (int) y2)) {
                m962(0);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f1624) {
            return;
        }
        this.f1632 = view == this.f1621;
    }

    public void setCoveredFadeColor(int i) {
        this.f1629 = i;
    }

    public void setPanelSlideListener(InterfaceC0245 interfaceC0245) {
        this.f1626 = interfaceC0245;
    }

    public void setParallaxDistance(int i) {
        this.f1637 = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f1639 = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f1633 = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C1067.m2406(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C1067.m2406(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f1622 = i;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m957() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m958(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & 16777215);
            if (layoutParams.f1648 == null) {
                layoutParams.f1648 = new Paint();
            }
            layoutParams.f1648.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f1648);
            }
            m961(view);
            return;
        }
        if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f1648;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            RunnableC0242 runnableC0242 = new RunnableC0242(view);
            this.f1631.add(runnableC0242);
            C1096.m2482(this, runnableC0242);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m959(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.m963()
            android.view.View r1 = r9.f1621
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f1646
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L59
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f1621
            if (r4 != r5) goto L2c
            goto L56
        L2c:
            float r5 = r9.f1625
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f1637
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f1625 = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L44
            int r5 = -r5
        L44:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L56
            float r5 = r9.f1625
            if (r0 == 0) goto L4f
            float r5 = r5 - r6
            goto L51
        L4f:
            float r5 = r6 - r5
        L51:
            int r6 = r9.f1629
            r9.m958(r4, r5, r6)
        L56:
            int r3 = r3 + 1
            goto L21
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m959(float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m960(android.view.View r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r17.m963()
            if (r1 == 0) goto L12
            int r2 = r17.getWidth()
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            goto L16
        L12:
            int r2 = r17.getPaddingLeft()
        L16:
            if (r1 == 0) goto L1d
            int r3 = r17.getPaddingLeft()
            goto L26
        L1d:
            int r3 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
        L26:
            int r4 = r17.getPaddingTop()
            int r5 = r17.getHeight()
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            if (r0 == 0) goto L66
            boolean r7 = r18.isOpaque()
            r8 = 1
            if (r7 == 0) goto L3d
            goto L53
        L3d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r7 < r9) goto L44
            goto L52
        L44:
            android.graphics.drawable.Drawable r7 = r18.getBackground()
            if (r7 == 0) goto L52
            int r7 = r7.getOpacity()
            r9 = -1
            if (r7 != r9) goto L52
            goto L53
        L52:
            r8 = 0
        L53:
            if (r8 == 0) goto L66
            int r7 = r18.getLeft()
            int r8 = r18.getRight()
            int r9 = r18.getTop()
            int r10 = r18.getBottom()
            goto L6a
        L66:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L6a:
            int r11 = r17.getChildCount()
            r12 = 0
        L6f:
            r13 = r17
            if (r12 >= r11) goto Lc6
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 != r0) goto L7a
            goto Lc6
        L7a:
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 != r6) goto L85
            r16 = r1
            goto Lbf
        L85:
            if (r1 == 0) goto L89
            r6 = r3
            goto L8a
        L89:
            r6 = r2
        L8a:
            int r15 = r14.getLeft()
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r4, r15)
            r16 = r1
            if (r1 == 0) goto La0
            r0 = r2
            goto La1
        La0:
            r0 = r3
        La1:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r5, r1)
            if (r6 < r7) goto Lbb
            if (r15 < r9) goto Lbb
            if (r0 > r8) goto Lbb
            if (r1 > r10) goto Lbb
            r0 = 4
            goto Lbc
        Lbb:
            r0 = 0
        Lbc:
            r14.setVisibility(r0)
        Lbf:
            int r12 = r12 + 1
            r0 = r18
            r1 = r16
            goto L6f
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m960(android.view.View):void");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m961(View view) {
        Field field;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            Paint paint = ((LayoutParams) view.getLayoutParams()).f1648;
            AtomicInteger atomicInteger = C1096.f5578;
            if (i >= 17) {
                view.setLayerPaint(paint);
                return;
            } else {
                view.setLayerType(view.getLayerType(), paint);
                view.invalidate();
                return;
            }
        }
        if (i >= 16) {
            if (!this.f1623) {
                try {
                    this.f1635 = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f1640 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f1623 = true;
            }
            if (this.f1635 == null || (field = this.f1640) == null) {
                view.invalidate();
                return;
            } else {
                try {
                    field.setBoolean(view, true);
                    this.f1635.invoke(view, null);
                } catch (Exception unused3) {
                }
            }
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        AtomicInteger atomicInteger2 = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation(left, top, right, bottom);
        } else {
            postInvalidate(left, top, right, bottom);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean m962(int i) {
        if (!this.f1638 && !m966(0.0f)) {
            return false;
        }
        this.f1632 = false;
        return true;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean m963() {
        return C1096.m2491(this) == 1;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean m964(int i) {
        if (!this.f1638 && !m966(1.0f)) {
            return false;
        }
        this.f1632 = true;
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean m965(View view) {
        if (view == null) {
            return false;
        }
        return this.f1624 && ((LayoutParams) view.getLayoutParams()).f1646 && this.f1642 > 0.0f;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean m966(float f) {
        int paddingLeft;
        if (!this.f1624) {
            return false;
        }
        boolean m963 = m963();
        LayoutParams layoutParams = (LayoutParams) this.f1621.getLayoutParams();
        if (m963) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f * this.f1643) + paddingRight) + this.f1621.getWidth()));
        } else {
            paddingLeft = (int) ((f * this.f1643) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        C1357 c1357 = this.f1627;
        View view = this.f1621;
        if (!c1357.m3055(view, paddingLeft, view.getTop())) {
            return false;
        }
        m957();
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
            return true;
        }
        postInvalidate();
        return true;
    }
}
