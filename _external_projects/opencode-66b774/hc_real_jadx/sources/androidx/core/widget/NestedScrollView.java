package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1082;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.C1113;
import p034.p035.p045.InterfaceC1068;
import p034.p035.p045.InterfaceC1110;
import p034.p035.p045.p046.C1084;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1068, InterfaceC1110 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f1071;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public long f1072;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final C1082 f1073;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f1074;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public View f1075;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public float f1076;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f1077;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final C1113 f1078;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f1079;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f1080;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Rect f1081;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final int[] f1082;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f1083;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f1084;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public EdgeEffect f1085;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public VelocityTracker f1086;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f1087;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public EdgeEffect f1088;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f1089;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final int[] f1090;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public InterfaceC0156 f1091;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public OverScroller f1092;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public SavedState f1093;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f1094;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f1095;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f1096;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final C0157 f1070 = new C0157();

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final int[] f1069 = {R.attr.fillViewport};

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0155();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1097;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0155 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1097 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("HorizontalScrollView.SavedState{");
            m4207.append(Integer.toHexString(System.identityHashCode(this)));
            m4207.append(" scrollPosition=");
            m4207.append(this.f1097);
            m4207.append("}");
            return m4207.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1097);
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0156 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo428(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0157 extends C1102 {
        @Override // p034.p035.p045.C1102
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean mo429(View view, int i, Bundle bundle) {
            int min;
            if (super.mo429(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m422(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m422(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo430(View view, AccessibilityEvent accessibilityEvent) {
            this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo431(View view, C1084 c1084) {
            int scrollRange;
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c1084.f5550.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c1084.f5550.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                c1084.m2455(C1084.C1087.f5562);
                c1084.m2455(C1084.C1087.f5560);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c1084.m2455(C1084.C1087.f5553);
                c1084.m2455(C1084.C1087.f5561);
            }
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1081 = new Rect();
        this.f1071 = true;
        this.f1095 = false;
        this.f1075 = null;
        this.f1096 = false;
        this.f1094 = true;
        this.f1084 = -1;
        this.f1090 = new int[2];
        this.f1082 = new int[2];
        this.f1092 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1080 = viewConfiguration.getScaledTouchSlop();
        this.f1077 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1079 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1069, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1073 = new C1082();
        this.f1078 = new C1113(this);
        setNestedScrollingEnabled(true);
        C1096.m2490(this, f1070);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1076 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1076 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1076;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m405(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static boolean m406(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m406((View) parent, view2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1092.isFinished()) {
            return;
        }
        this.f1092.computeScrollOffset();
        int currY = this.f1092.getCurrY();
        int i = currY - this.f1087;
        this.f1087 = currY;
        int[] iArr = this.f1082;
        boolean z = false;
        iArr[1] = 0;
        m419(0, i, iArr, null, 1);
        int i2 = i - this.f1082[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m425(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f1082;
            iArr2[1] = 0;
            this.f1078.m2553(0, scrollY2, 0, i3, this.f1090, 1, iArr2);
            i2 = i3 - this.f1082[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                m426();
                if (i2 < 0) {
                    if (this.f1085.isFinished()) {
                        edgeEffect = this.f1085;
                        edgeEffect.onAbsorb((int) this.f1092.getCurrVelocity());
                    }
                } else if (this.f1088.isFinished()) {
                    edgeEffect = this.f1088;
                    edgeEffect.onAbsorb((int) this.f1092.getCurrVelocity());
                }
            }
            m415();
        }
        if (this.f1092.isFinished()) {
            this.f1078.m2556(1);
            return;
        }
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            postInvalidate();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m414(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1078.m2551(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1078.m2547(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m419(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1078.m2552(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f1085 != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f1085.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i2 >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f1085.setSize(width, height);
                if (this.f1085.draw(canvas)) {
                    AtomicInteger atomicInteger = C1096.f5578;
                    if (i2 >= 16) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidate();
                    }
                }
                canvas.restoreToCount(save);
            }
            if (this.f1088.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i = 0 + getPaddingLeft();
            }
            if (i3 >= 21 && getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f1088.setSize(width2, height2);
            if (this.f1088.draw(canvas)) {
                AtomicInteger atomicInteger2 = C1096.f5578;
                if (i3 >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1073.m2443();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m418(0);
    }

    @Override // android.view.View, p034.p035.p045.InterfaceC1110
    public boolean isNestedScrollingEnabled() {
        return this.f1078.f5611;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1095 = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1096) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1071 = false;
        View view = this.f1075;
        if (view != null && m406(view, this)) {
            m423(this.f1075);
        }
        this.f1075 = null;
        if (!this.f1095) {
            if (this.f1093 != null) {
                scrollTo(getScrollX(), this.f1093.f1097);
                this.f1093 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m405 = m405(scrollY, paddingTop, i5);
            if (m405 != scrollY) {
                scrollTo(getScrollX(), m405);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1095 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1089 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m411((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m419(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m417(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1073.f5546 = i;
        m421(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || (true ^ m416(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1093 = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1097 = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0156 interfaceC0156 = this.f1091;
        if (interfaceC0156 != null) {
            interfaceC0156.mo428(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m416(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f1081);
        offsetDescendantRectToMyCoords(findFocus, this.f1081);
        m427(m424(this.f1081));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onStopNestedScroll(View view) {
        this.f1073.f5546 = 0;
        this.f1078.m2556(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0211, code lost:
    
        postInvalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x020d, code lost:
    
        postInvalidateOnAnimation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r29) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1071) {
            this.f1075 = view2;
        } else {
            m423(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m424 = m424(rect);
        boolean z2 = m424 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m424);
            } else {
                m422(0, m424, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m408();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1071 = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m405 = m405(i, width, width2);
            int m4052 = m405(i2, height, height2);
            if (m405 == getScrollX() && m4052 == getScrollY()) {
                return;
            }
            super.scrollTo(m405, m4052);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1089) {
            this.f1089 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1078.m2555(z);
    }

    public void setOnScrollChangeListener(InterfaceC0156 interfaceC0156) {
        this.f1091 = interfaceC0156;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1094 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f1078.m2549(i, 0);
    }

    @Override // android.view.View, p034.p035.p045.InterfaceC1110
    public void stopNestedScroll() {
        this.f1078.m2556(0);
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: 〳ぜぞぜべっ */
    public void mo100(View view, int i, int i2, int[] iArr, int i3) {
        m419(i, i2, iArr, null, i3);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m407(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m416(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m427(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1081);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1081);
            m427(m424(this.f1081));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!m416(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final void m408() {
        VelocityTracker velocityTracker = this.f1086;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1086 = null;
        }
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: ぁごぐすすぃ */
    public void mo102(View view, int i) {
        C1082 c1082 = this.f1073;
        if (i == 1) {
            c1082.f5545 = 0;
        } else {
            c1082.f5546 = 0;
        }
        this.f1078.m2556(i);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m409() {
        this.f1096 = false;
        m408();
        this.f1078.m2556(0);
        EdgeEffect edgeEffect = this.f1085;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1088.onRelease();
        }
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final boolean m410(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m427(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void m411(int i) {
        if (getChildCount() > 0) {
            this.f1092.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m412(true);
        }
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final void m412(boolean z) {
        if (z) {
            m421(2, 1);
        } else {
            this.f1078.m2556(1);
        }
        this.f1087 = getScrollY();
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            postInvalidate();
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean m413(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1081;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1081.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1081;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1081;
        return m410(i, rect3.top, rect3.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m414(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m414(android.view.KeyEvent):boolean");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m415() {
        this.f1092.abortAnimation();
        this.f1078.m2556(1);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final boolean m416(View view, int i, int i2) {
        view.getDrawingRect(this.f1081);
        offsetDescendantRectToMyCoords(view, this.f1081);
        return this.f1081.bottom + i >= getScrollY() && this.f1081.top - i <= getScrollY() + i2;
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m417(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1078.m2554(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean m418(int i) {
        return this.f1078.m2548(i) != null;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean m419(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1078.m2550(i, i2, iArr, iArr2, i3);
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: てぜきぽく */
    public void mo110(View view, int i, int i2, int i3, int i4, int i5) {
        m417(i4, i5, null);
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final void m420(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1084) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1074 = (int) motionEvent.getY(i);
            this.f1084 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1086;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean m421(int i, int i2) {
        return this.f1078.m2549(i, i2);
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: なぎぱいぢぎ */
    public void mo111(View view, View view2, int i, int i2) {
        C1082 c1082 = this.f1073;
        if (i2 == 1) {
            c1082.f5545 = i;
        } else {
            c1082.f5546 = i;
        }
        m421(2, i2);
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m422(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1072 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1092.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            m412(z);
        } else {
            if (!this.f1092.isFinished()) {
                m415();
            }
            scrollBy(i, i2);
        }
        this.f1072 = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: のぷのちつ */
    public boolean mo112(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final void m423(View view) {
        view.getDrawingRect(this.f1081);
        offsetDescendantRectToMyCoords(view, this.f1081);
        int m424 = m424(this.f1081);
        if (m424 != 0) {
            scrollBy(0, m424);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m424(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m425(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m418(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f1092
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m425(int, int, int, int, int, int, int, int):boolean");
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final void m426() {
        if (getOverScrollMode() == 2) {
            this.f1085 = null;
            this.f1088 = null;
        } else if (this.f1085 == null) {
            Context context = getContext();
            this.f1085 = new EdgeEffect(context);
            this.f1088 = new EdgeEffect(context);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m427(int i) {
        if (i != 0) {
            if (this.f1094) {
                m422(0, i, 250, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // p034.p035.p045.InterfaceC1068
    /* renamed from: ぺふねづ〺 */
    public void mo116(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m417(i4, i5, iArr);
    }
}
