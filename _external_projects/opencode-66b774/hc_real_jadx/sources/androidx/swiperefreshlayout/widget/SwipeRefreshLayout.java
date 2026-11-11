package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p043.C1067;
import p034.p035.p045.C1082;
import p034.p035.p045.C1096;
import p034.p035.p045.C1113;
import p034.p035.p045.InterfaceC1110;
import p034.p035.p045.InterfaceC1120;
import p034.p078.p079.C1487;
import p034.p078.p079.C1489;
import p034.p078.p079.C1490;
import p034.p078.p079.C1491;
import p107.p108.p109.p110.p119.C1867;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC1120, InterfaceC1110 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C1082 f1657;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public View f1658;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public Animation.AnimationListener f1659;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public float f1660;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f1661;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int[] f1662;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public Animation f1663;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f1664;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final Animation f1665;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f1666;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f1667;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f1668;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public Animation f1669;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public InterfaceC0248 f1670;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float f1671;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC0246 f1672;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public boolean f1673;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final Animation f1674;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final DecelerateInterpolator f1675;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public C1487 f1676;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f1677;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public Animation f1678;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public boolean f1679;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f1680;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f1681;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f1682;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public Animation f1683;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f1684;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public C1491 f1685;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f1686;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f1687;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f1688;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f1689;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f1690;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int f1691;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f1692;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C1113 f1693;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public Animation f1694;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final int[] f1695;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static final String f1656 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static final int[] f1655 = {R.attr.enabled};

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$〳ぜぞぜべっ, reason: contains not printable characters */
    public interface InterfaceC0246 {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$〺つふすそ, reason: contains not printable characters */
    public class C0247 extends Animation {
        public C0247() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$ぁごぐすすぃ, reason: contains not printable characters */
    public interface InterfaceC0248 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        boolean m982(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$くし〴〺ぅ, reason: contains not printable characters */
    public class C0249 extends Animation {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ int f1697;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ int f1698;

        public C0249(int i, int i2) {
            this.f1697 = i;
            this.f1698 = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.f1685.setAlpha((int) (((this.f1698 - r0) * f) + this.f1697));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class AnimationAnimationListenerC0250 implements Animation.AnimationListener {
        public AnimationAnimationListenerC0250() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC0246 interfaceC0246;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f1689) {
                swipeRefreshLayout.m980();
                return;
            }
            swipeRefreshLayout.f1685.setAlpha(Base64.BASELENGTH);
            SwipeRefreshLayout.this.f1685.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f1679 && (interfaceC0246 = swipeRefreshLayout2.f1672) != null) {
                C1867.C1869 c1869 = (C1867.C1869) interfaceC0246;
                C1867.this.f8291.setRefreshing(false);
                C1867.this.m3998();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f1692 = swipeRefreshLayout3.f1676.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$づざかべべ, reason: contains not printable characters */
    public class C0251 extends Animation {
        public C0251() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.f1673 ? swipeRefreshLayout.f1664 - Math.abs(swipeRefreshLayout.f1667) : swipeRefreshLayout.f1664;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f1690 + ((int) ((abs - r1) * f))) - swipeRefreshLayout2.f1676.getTop());
            C1491 c1491 = SwipeRefreshLayout.this.f1685;
            float f2 = 1.0f - f;
            C1491.C1492 c1492 = c1491.f6877;
            if (f2 != c1492.f6887) {
                c1492.f6887 = f2;
            }
            c1491.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0252 extends Animation {
        public C0252() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m981(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$びぐびあび, reason: contains not printable characters */
    public class AnimationAnimationListenerC0253 implements Animation.AnimationListener {
        public AnimationAnimationListenerC0253() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f1687) {
                return;
            }
            swipeRefreshLayout.m977(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1689 = false;
        this.f1684 = -1.0f;
        this.f1662 = new int[2];
        this.f1695 = new int[2];
        this.f1677 = -1;
        this.f1682 = -1;
        this.f1659 = new AnimationAnimationListenerC0250();
        this.f1665 = new C0251();
        this.f1674 = new C0252();
        this.f1680 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1686 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f1675 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1691 = (int) (displayMetrics.density * 40.0f);
        this.f1676 = new C1487(getContext(), -328966);
        C1491 c1491 = new C1491(getContext());
        this.f1685 = c1491;
        c1491.m3240(1);
        this.f1676.setImageDrawable(this.f1685);
        this.f1676.setVisibility(8);
        addView(this.f1676);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f1664 = i;
        this.f1684 = i;
        this.f1657 = new C1082();
        this.f1693 = new C1113(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f1691;
        this.f1692 = i2;
        this.f1667 = i2;
        m981(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1655);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f1676.getBackground().setAlpha(i);
        C1491 c1491 = this.f1685;
        c1491.f6877.f6892 = i;
        c1491.invalidateSelf();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1693.m2551(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1693.m2547(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1693.m2550(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1693.m2552(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1682;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1657.m2443();
    }

    public int getProgressCircleDiameter() {
        return this.f1691;
    }

    public int getProgressViewEndOffset() {
        return this.f1664;
    }

    public int getProgressViewStartOffset() {
        return this.f1667;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f1693.m2546(0);
    }

    @Override // android.view.View, p034.p035.p045.InterfaceC1110
    public boolean isNestedScrollingEnabled() {
        return this.f1693.f5611;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m980();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        m970();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m976() || this.f1689 || this.f1681) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f1677;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    m973(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m971(motionEvent);
                    }
                }
            }
            this.f1668 = false;
            this.f1677 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f1667 - this.f1676.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f1677 = pointerId;
            this.f1668 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f1666 = motionEvent.getY(findPointerIndex2);
        }
        return this.f1668;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f1658 == null) {
            m970();
        }
        View view = this.f1658;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f1676.getMeasuredWidth();
        int measuredHeight2 = this.f1676.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f1692;
        this.f1676.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1658 == null) {
            m970();
        }
        View view = this.f1658;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f1676.measure(View.MeasureSpec.makeMeasureSpec(this.f1691, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1691, 1073741824));
        this.f1682 = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f1676) {
                this.f1682 = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1661;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f1661 = 0.0f;
                } else {
                    this.f1661 = f - f2;
                    iArr[1] = i2;
                }
                m978(this.f1661);
            }
        }
        if (this.f1673 && i2 > 0 && this.f1661 == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1676.setVisibility(8);
        }
        int[] iArr2 = this.f1662;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1695);
        if (i4 + this.f1695[1] >= 0 || m976()) {
            return;
        }
        float abs = this.f1661 + Math.abs(r11);
        this.f1661 = abs;
        m978(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1657.f5546 = i;
        startNestedScroll(i & 2);
        this.f1661 = 0.0f;
        this.f1681 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f1689 || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onStopNestedScroll(View view) {
        this.f1657.m2442(0);
        this.f1681 = false;
        float f = this.f1661;
        if (f > 0.0f) {
            m975(f);
            this.f1661 = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m976() || this.f1689 || this.f1681) {
            return false;
        }
        if (actionMasked == 0) {
            this.f1677 = motionEvent.getPointerId(0);
            this.f1668 = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1677);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f1668) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f1671) * 0.5f;
                    this.f1668 = false;
                    m975(y);
                }
                this.f1677 = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f1677);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m973(y2);
                if (this.f1668) {
                    float f = (y2 - this.f1671) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    m978(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f1677 = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m971(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f1658 instanceof AbsListView)) {
            View view = this.f1658;
            if (view == null || C1096.m2478(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public void setAnimationProgress(float f) {
        this.f1676.setScaleX(f);
        this.f1676.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m970();
        C1491 c1491 = this.f1685;
        C1491.C1492 c1492 = c1491.f6877;
        c1492.f6902 = iArr;
        c1492.m3244(0);
        c1491.f6877.m3244(0);
        c1491.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C1067.m2405(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1684 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m980();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1693.m2555(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC0248 interfaceC0248) {
        this.f1670 = interfaceC0248;
    }

    public void setOnRefreshListener(InterfaceC0246 interfaceC0246) {
        this.f1672 = interfaceC0246;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1676.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C1067.m2405(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f1664 = i;
        this.f1687 = z;
        this.f1676.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f1687 = z;
        this.f1667 = i;
        this.f1664 = i2;
        this.f1673 = true;
        m980();
        this.f1689 = false;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1689 == z) {
            m974(z, false);
            return;
        }
        this.f1689 = z;
        setTargetOffsetTopAndBottom((!this.f1673 ? this.f1664 + this.f1667 : this.f1664) - this.f1692);
        this.f1679 = false;
        Animation.AnimationListener animationListener = this.f1659;
        this.f1676.setVisibility(0);
        this.f1685.setAlpha(Base64.BASELENGTH);
        C1489 c1489 = new C1489(this);
        this.f1683 = c1489;
        c1489.setDuration(this.f1686);
        if (animationListener != null) {
            this.f1676.f6867 = animationListener;
        }
        this.f1676.clearAnimation();
        this.f1676.startAnimation(this.f1683);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f1691 = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f1676.setImageDrawable(null);
            this.f1685.m3240(i);
            this.f1676.setImageDrawable(this.f1685);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f1688 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f1676.bringToFront();
        C1096.m2515(this.f1676, i);
        this.f1692 = this.f1676.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f1693.m2549(i, 0);
    }

    @Override // android.view.View, p034.p035.p045.InterfaceC1110
    public void stopNestedScroll() {
        this.f1693.m2556(0);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m970() {
        if (this.f1658 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1676)) {
                    this.f1658 = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m971(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1677) {
            this.f1677 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final Animation m972(int i, int i2) {
        C0249 c0249 = new C0249(i, i2);
        c0249.setDuration(300L);
        C1487 c1487 = this.f1676;
        c1487.f6867 = null;
        c1487.clearAnimation();
        this.f1676.startAnimation(c0249);
        return c0249;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final void m973(float f) {
        float f2 = this.f1666;
        float f3 = f - f2;
        int i = this.f1680;
        if (f3 <= i || this.f1668) {
            return;
        }
        this.f1671 = f2 + i;
        this.f1668 = true;
        this.f1685.setAlpha(76);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final void m974(boolean z, boolean z2) {
        if (this.f1689 != z) {
            this.f1679 = z2;
            m970();
            this.f1689 = z;
            if (!z) {
                m977(this.f1659);
                return;
            }
            int i = this.f1692;
            Animation.AnimationListener animationListener = this.f1659;
            this.f1690 = i;
            this.f1665.reset();
            this.f1665.setDuration(200L);
            this.f1665.setInterpolator(this.f1675);
            if (animationListener != null) {
                this.f1676.f6867 = animationListener;
            }
            this.f1676.clearAnimation();
            this.f1676.startAnimation(this.f1665);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m975(float f) {
        if (f > this.f1684) {
            m974(true, true);
            return;
        }
        this.f1689 = false;
        C1491 c1491 = this.f1685;
        C1491.C1492 c1492 = c1491.f6877;
        c1492.f6895 = 0.0f;
        c1492.f6897 = 0.0f;
        c1491.invalidateSelf();
        boolean z = this.f1687;
        AnimationAnimationListenerC0253 animationAnimationListenerC0253 = z ? null : new AnimationAnimationListenerC0253();
        int i = this.f1692;
        if (z) {
            this.f1690 = i;
            this.f1660 = this.f1676.getScaleX();
            C1490 c1490 = new C1490(this);
            this.f1669 = c1490;
            c1490.setDuration(150L);
            if (animationAnimationListenerC0253 != null) {
                this.f1676.f6867 = animationAnimationListenerC0253;
            }
            this.f1676.clearAnimation();
            this.f1676.startAnimation(this.f1669);
        } else {
            this.f1690 = i;
            this.f1674.reset();
            this.f1674.setDuration(200L);
            this.f1674.setInterpolator(this.f1675);
            if (animationAnimationListenerC0253 != null) {
                this.f1676.f6867 = animationAnimationListenerC0253;
            }
            this.f1676.clearAnimation();
            this.f1676.startAnimation(this.f1674);
        }
        C1491 c14912 = this.f1685;
        C1491.C1492 c14922 = c14912.f6877;
        if (c14922.f6901) {
            c14922.f6901 = false;
        }
        c14912.invalidateSelf();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m976() {
        InterfaceC0248 interfaceC0248 = this.f1670;
        if (interfaceC0248 != null) {
            return interfaceC0248.m982(this, this.f1658);
        }
        View view = this.f1658;
        if (!(view instanceof ListView)) {
            return view.canScrollVertically(-1);
        }
        ListView listView = (ListView) view;
        if (Build.VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() != 0) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int top = listView.getChildAt(0).getTop();
            if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void m977(Animation.AnimationListener animationListener) {
        C0247 c0247 = new C0247();
        this.f1663 = c0247;
        c0247.setDuration(150L);
        C1487 c1487 = this.f1676;
        c1487.f6867 = animationListener;
        c1487.clearAnimation();
        this.f1676.startAnimation(this.f1663);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m978(float f) {
        C1491 c1491 = this.f1685;
        C1491.C1492 c1492 = c1491.f6877;
        if (!c1492.f6901) {
            c1492.f6901 = true;
        }
        c1491.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.f1684));
        double d = min;
        Double.isNaN(d);
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f1684;
        int i = this.f1688;
        if (i <= 0) {
            i = this.f1673 ? this.f1664 - this.f1667 : this.f1664;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f1667 + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f1676.getVisibility() != 0) {
            this.f1676.setVisibility(0);
        }
        if (!this.f1687) {
            this.f1676.setScaleX(1.0f);
            this.f1676.setScaleY(1.0f);
        }
        if (this.f1687) {
            setAnimationProgress(Math.min(1.0f, f / this.f1684));
        }
        if (f < this.f1684) {
            if (this.f1685.f6877.f6892 > 76 && !m979(this.f1678)) {
                this.f1678 = m972(this.f1685.f6877.f6892, 76);
            }
        } else if (this.f1685.f6877.f6892 < 255 && !m979(this.f1694)) {
            this.f1694 = m972(this.f1685.f6877.f6892, Base64.BASELENGTH);
        }
        C1491 c14912 = this.f1685;
        float min2 = Math.min(0.8f, max * 0.8f);
        C1491.C1492 c14922 = c14912.f6877;
        c14922.f6895 = 0.0f;
        c14922.f6897 = min2;
        c14912.invalidateSelf();
        C1491 c14913 = this.f1685;
        float min3 = Math.min(1.0f, max);
        C1491.C1492 c14923 = c14913.f6877;
        if (min3 != c14923.f6887) {
            c14923.f6887 = min3;
        }
        c14913.invalidateSelf();
        C1491 c14914 = this.f1685;
        c14914.f6877.f6885 = ((f3 * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        c14914.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f1692);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m979(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m980() {
        this.f1676.clearAnimation();
        this.f1685.stop();
        this.f1676.setVisibility(8);
        setColorViewAlpha(Base64.BASELENGTH);
        if (this.f1687) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f1667 - this.f1692);
        }
        this.f1692 = this.f1676.getTop();
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m981(float f) {
        setTargetOffsetTopAndBottom((this.f1690 + ((int) ((this.f1667 - r0) * f))) - this.f1676.getTop());
    }
}
