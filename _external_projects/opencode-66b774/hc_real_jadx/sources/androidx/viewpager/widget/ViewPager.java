package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.app.NotificationCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p043.C1067;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.InterfaceC1121;
import p034.p035.p045.p046.C1084;
import p034.p084.p085.AbstractC1512;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public int f1874;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f1875;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public int f1876;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f1877;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public int f1878;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f1879;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f1880;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public EdgeEffect f1881;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ClassLoader f1882;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public float f1883;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f1884;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public int f1885;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f1886;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public boolean f1887;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f1888;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f1889;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public float f1890;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public int f1891;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Drawable f1892;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public final Runnable f1893;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public int f1894;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ArrayList<C0306> f1895;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public InterfaceC0301 f1896;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public int f1897;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public boolean f1898;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public InterfaceC0308 f1899;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f1900;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public List<InterfaceC0308> f1901;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f1902;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public float f1903;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public float f1904;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public ArrayList<View> f1905;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int f1906;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public boolean f1907;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Rect f1908;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public EdgeEffect f1909;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f1910;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f1911;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public int f1912;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public long f1913;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public AbstractC1512 f1914;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f1915;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public List<InterfaceC0298> f1916;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C0309 f1917;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f1918;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public int f1919;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f1920;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0306 f1921;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f1922;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public VelocityTracker f1923;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f1924;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Parcelable f1925;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public InterfaceC0308 f1926;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public float f1927;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Scroller f1928;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public static final int[] f1873 = {R.attr.layout_gravity};

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public static final Comparator<C0306> f1870 = new C0303();

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public static final Interpolator f1871 = new InterpolatorC0299();

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public static final C0305 f1872 = new C0305();

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1929;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f1930;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f1931;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1932;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1933;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1934;

        public LayoutParams() {
            super(-1, -1);
            this.f1930 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1930 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1873);
            this.f1929 = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0297();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Parcelable f1935;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public ClassLoader f1936;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1937;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0297 implements Parcelable.ClassLoaderCreator<SavedState> {
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
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.f1937 = parcel.readInt();
            this.f1935 = parcel.readParcelable(classLoader);
            this.f1936 = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("FragmentPager.SavedState{");
            m4207.append(Integer.toHexString(System.identityHashCode(this)));
            m4207.append(" position=");
            m4207.append(this.f1937);
            m4207.append("}");
            return m4207.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f1937);
            parcel.writeParcelable(this.f1935, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$〳ぜぞぜべっ, reason: contains not printable characters */
    public interface InterfaceC0298 {
        /* renamed from: びぐびあび */
        void mo1062(ViewPager viewPager, AbstractC1512 abstractC1512, AbstractC1512 abstractC15122);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$〺つふすそ, reason: contains not printable characters */
    public static class InterpolatorC0299 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$ぁごぐすすぃ, reason: contains not printable characters */
    public class C0300 extends C1102 {
        public C0300() {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: ぁごぐすすぃ */
        public boolean mo429(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo429(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f1880 - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f1880 + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: くし〴〺ぅ */
        public void mo430(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC1512 abstractC1512;
            this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AbstractC1512 abstractC15122 = ViewPager.this.f1914;
            accessibilityEvent.setScrollable(abstractC15122 != null && abstractC15122.mo1135() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (abstractC1512 = ViewPager.this.f1914) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC1512.mo1135());
            accessibilityEvent.setFromIndex(ViewPager.this.f1880);
            accessibilityEvent.setToIndex(ViewPager.this.f1880);
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            c1084.f5550.setClassName(ViewPager.class.getName());
            AbstractC1512 abstractC1512 = ViewPager.this.f1914;
            c1084.f5550.setScrollable(abstractC1512 != null && abstractC1512.mo1135() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                c1084.f5550.addAction(NotificationCompat.FLAG_BUBBLE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c1084.f5550.addAction(8192);
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$いいにぽつ, reason: contains not printable characters */
    public interface InterfaceC0301 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m1091(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$くし〴〺ぅ, reason: contains not printable characters */
    public class RunnableC0302 implements Runnable {
        public RunnableC0302() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.m1080(viewPager.f1880);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0303 implements Comparator<C0306> {
        @Override // java.util.Comparator
        public int compare(C0306 c0306, C0306 c03062) {
            return c0306.f1940 - c03062.f1940;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$づざかべべ, reason: contains not printable characters */
    public @interface InterfaceC0304 {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$てぜきぽく, reason: contains not printable characters */
    public static class C0305 implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f1931;
            return z != layoutParams2.f1931 ? z ? 1 : -1 : layoutParams.f1932 - layoutParams2.f1932;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C0306 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1940;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f1941;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Object f1942;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float f1943;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f1944;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$びぐびあび, reason: contains not printable characters */
    public class C0307 implements InterfaceC1121 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Rect f1946 = new Rect();

        public C0307() {
        }

        @Override // p034.p035.p045.InterfaceC1121
        /* renamed from: げつ〴ぬぐ */
        public C1072 mo370(View view, C1072 c1072) {
            C1072 m2511 = C1096.m2511(view, c1072);
            if (m2511.m2419()) {
                return m2511;
            }
            Rect rect = this.f1946;
            rect.left = m2511.m2422();
            rect.top = m2511.m2424();
            rect.right = m2511.m2426();
            rect.bottom = m2511.m2420();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1072 m2516 = C1096.m2516(ViewPager.this.getChildAt(i), m2511);
                rect.left = Math.min(m2516.m2422(), rect.left);
                rect.top = Math.min(m2516.m2424(), rect.top);
                rect.right = Math.min(m2516.m2426(), rect.right);
                rect.bottom = Math.min(m2516.m2420(), rect.bottom);
            }
            return m2511.m2427(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$ぺぁあねじ, reason: contains not printable characters */
    public interface InterfaceC0308 {
        /* renamed from: 〺つふすそ */
        void mo1059(int i);

        /* renamed from: くし〴〺ぅ */
        void mo1060(int i);

        /* renamed from: げつ〴ぬぐ */
        void mo1061(int i, float f, int i2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$ぺふねづ〺, reason: contains not printable characters */
    public class C0309 extends DataSetObserver {
        public C0309() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m1081();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m1081();
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f1895 = new ArrayList<>();
        this.f1921 = new C0306();
        this.f1908 = new Rect();
        this.f1875 = -1;
        this.f1925 = null;
        this.f1882 = null;
        this.f1903 = -3.4028235E38f;
        this.f1918 = Float.MAX_VALUE;
        this.f1879 = 1;
        this.f1906 = -1;
        this.f1907 = true;
        this.f1893 = new RunnableC0302();
        this.f1876 = 0;
        m1072();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1895 = new ArrayList<>();
        this.f1921 = new C0306();
        this.f1908 = new Rect();
        this.f1875 = -1;
        this.f1925 = null;
        this.f1882 = null;
        this.f1903 = -3.4028235E38f;
        this.f1918 = Float.MAX_VALUE;
        this.f1879 = 1;
        this.f1906 = -1;
        this.f1907 = true;
        this.f1893 = new RunnableC0302();
        this.f1876 = 0;
        m1072();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1911 != z) {
            this.f1911 = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0306 m1079;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m1079 = m1079(childAt)) != null && m1079.f1940 == this.f1880) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0306 m1079;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m1079 = m1079(childAt)) != null && m1079.f1940 == this.f1880) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f1931 | (view.getClass().getAnnotation(InterfaceC0304.class) != null);
        layoutParams2.f1931 = z;
        if (!this.f1902) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f1934 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f1914 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f1903)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1918));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f1910 = true;
        if (this.f1928.isFinished() || !this.f1928.computeScrollOffset()) {
            m1078(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1928.getCurrX();
        int currY = this.f1928.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m1075(currX)) {
                this.f1928.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            postInvalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L59
            int r0 = r6.getAction()
            if (r0 != 0) goto L56
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L56
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.m1073(r4)
            goto L57
        L2b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L56
            boolean r6 = r5.m1073(r2)
            goto L57
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m1084()
            goto L57
        L41:
            r6 = 66
            goto L51
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4f
            boolean r6 = r5.m1077()
            goto L57
        L4f:
            r6 = 17
        L51:
            boolean r6 = r5.m1073(r6)
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 == 0) goto L5a
        L59:
            r1 = 1
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0306 m1079;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m1079 = m1079(childAt)) != null && m1079.f1940 == this.f1880 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC1512 abstractC1512;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC1512 = this.f1914) != null && abstractC1512.mo1135() > 1)) {
            if (!this.f1881.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f1903 * width);
                this.f1881.setSize(height, width);
                z = false | this.f1881.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f1909.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f1918 + 1.0f)) * width2);
                this.f1909.setSize(height2, width2);
                z |= this.f1909.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f1881.finish();
            this.f1909.finish();
        }
        if (z) {
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1892;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
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
        return generateDefaultLayoutParams();
    }

    public AbstractC1512 getAdapter() {
        return this.f1914;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f1894 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f1905.get(i2).getLayoutParams()).f1933;
    }

    public int getCurrentItem() {
        return this.f1880;
    }

    public int getOffscreenPageLimit() {
        return this.f1879;
    }

    public int getPageMargin() {
        return this.f1924;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1907 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1893);
        Scroller scroller = this.f1928;
        if (scroller != null && !scroller.isFinished()) {
            this.f1928.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f1924 <= 0 || this.f1892 == null || this.f1895.size() <= 0 || this.f1914 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.f1924 / width;
        int i2 = 0;
        C0306 c0306 = this.f1895.get(0);
        float f4 = c0306.f1943;
        int size = this.f1895.size();
        int i3 = c0306.f1940;
        int i4 = this.f1895.get(size - 1).f1940;
        while (i3 < i4) {
            while (true) {
                i = c0306.f1940;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c0306 = this.f1895.get(i2);
            }
            if (i3 == i) {
                float f5 = c0306.f1943;
                float f6 = c0306.f1944;
                f = (f5 + f6) * width;
                f4 = f5 + f6 + f3;
            } else {
                this.f1914.getClass();
                f = (f4 + 1.0f) * width;
                f4 = 1.0f + f3 + f4;
            }
            if (this.f1924 + f > scrollX) {
                f2 = f3;
                this.f1892.setBounds(Math.round(f), this.f1886, Math.round(this.f1924 + f), this.f1889);
                this.f1892.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + r2) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & Base64.BASELENGTH;
        if (action == 3 || action == 1) {
            m1070();
            return false;
        }
        if (action != 0) {
            if (this.f1888) {
                return true;
            }
            if (this.f1884) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1927 = x;
            this.f1883 = x;
            float y = motionEvent.getY();
            this.f1890 = y;
            this.f1904 = y;
            this.f1906 = motionEvent.getPointerId(0);
            this.f1884 = false;
            this.f1910 = true;
            this.f1928.computeScrollOffset();
            if (this.f1876 != 2 || Math.abs(this.f1928.getFinalX() - this.f1928.getCurrX()) <= this.f1885) {
                m1078(false);
                this.f1888 = false;
            } else {
                this.f1928.abortAnimation();
                this.f1922 = false;
                m1080(this.f1880);
                this.f1888 = true;
                m1065(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f1906;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f1883;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f1890);
                if (f != 0.0f) {
                    float f2 = this.f1883;
                    if (!((f2 < ((float) this.f1915) && f > 0.0f) || (f2 > ((float) (getWidth() - this.f1915)) && f < 0.0f)) && m1086(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f1883 = x2;
                        this.f1904 = y2;
                        this.f1884 = true;
                        return false;
                    }
                }
                int i2 = this.f1912;
                if (abs > i2 && abs * 0.5f > abs2) {
                    this.f1888 = true;
                    m1065(true);
                    setScrollState(1);
                    this.f1883 = f > 0.0f ? this.f1927 + this.f1912 : this.f1927 - this.f1912;
                    this.f1904 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i2) {
                    this.f1884 = true;
                }
                if (this.f1888 && m1076(x2)) {
                    AtomicInteger atomicInteger = C1096.f5578;
                    if (Build.VERSION.SDK_INT >= 16) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidate();
                    }
                }
            }
        } else if (action == 6) {
            m1071(motionEvent);
        }
        if (this.f1923 == null) {
            this.f1923 = VelocityTracker.obtain();
        }
        this.f1923.addMovement(motionEvent);
        return this.f1888;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0306 m1079;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m1079 = m1079(childAt)) != null && m1079.f1940 == this.f1880 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        AbstractC1512 abstractC1512 = this.f1914;
        if (abstractC1512 != null) {
            abstractC1512.mo3307(savedState.f1935, savedState.f1936);
            m1085(savedState.f1937, false, true, 0);
        } else {
            this.f1875 = savedState.f1937;
            this.f1925 = savedState.f1935;
            this.f1882 = savedState.f1936;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1937 = this.f1880;
        AbstractC1512 abstractC1512 = this.f1914;
        if (abstractC1512 != null) {
            savedState.f1935 = abstractC1512.mo3305();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f1924;
            m1087(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0153  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f1902) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC1512 abstractC1512) {
        AbstractC1512 abstractC15122 = this.f1914;
        if (abstractC15122 != null) {
            synchronized (abstractC15122) {
                abstractC15122.f6964 = null;
            }
            this.f1914.mo3306(this);
            for (int i = 0; i < this.f1895.size(); i++) {
                C0306 c0306 = this.f1895.get(i);
                this.f1914.mo1136(this, c0306.f1940, c0306.f1942);
            }
            this.f1914.mo3304(this);
            this.f1895.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f1931) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f1880 = 0;
            scrollTo(0, 0);
        }
        AbstractC1512 abstractC15123 = this.f1914;
        this.f1914 = abstractC1512;
        this.f1877 = 0;
        if (abstractC1512 != null) {
            if (this.f1917 == null) {
                this.f1917 = new C0309();
            }
            AbstractC1512 abstractC15124 = this.f1914;
            C0309 c0309 = this.f1917;
            synchronized (abstractC15124) {
                abstractC15124.f6964 = c0309;
            }
            this.f1922 = false;
            boolean z = this.f1907;
            this.f1907 = true;
            this.f1877 = this.f1914.mo1135();
            if (this.f1875 >= 0) {
                this.f1914.mo3307(this.f1925, this.f1882);
                m1085(this.f1875, false, true, 0);
                this.f1875 = -1;
                this.f1925 = null;
                this.f1882 = null;
            } else if (z) {
                requestLayout();
            } else {
                m1080(this.f1880);
            }
        }
        List<InterfaceC0298> list = this.f1916;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f1916.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f1916.get(i3).mo1062(this, abstractC15123, abstractC1512);
        }
    }

    public void setCurrentItem(int i) {
        this.f1922 = false;
        m1085(i, !this.f1907, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.f1879) {
            this.f1879 = i;
            m1080(this.f1880);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0308 interfaceC0308) {
        this.f1899 = interfaceC0308;
    }

    public void setPageMargin(int i) {
        int i2 = this.f1924;
        this.f1924 = i;
        int width = getWidth();
        m1087(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C1067.m2406(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1892 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, InterfaceC0301 interfaceC0301) {
        setPageTransformer(z, interfaceC0301, 2);
    }

    public void setPageTransformer(boolean z, InterfaceC0301 interfaceC0301, int i) {
        boolean z2 = interfaceC0301 != null;
        boolean z3 = z2 != (this.f1896 != null);
        this.f1896 = interfaceC0301;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.f1894 = z ? 2 : 1;
            this.f1874 = i;
        } else {
            this.f1894 = 0;
        }
        if (z3) {
            m1080(this.f1880);
        }
    }

    public void setScrollState(int i) {
        if (this.f1876 == i) {
            return;
        }
        this.f1876 = i;
        if (this.f1896 != null) {
            boolean z = i != 0;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setLayerType(z ? this.f1874 : 0, null);
            }
        }
        InterfaceC0308 interfaceC0308 = this.f1899;
        if (interfaceC0308 != null) {
            interfaceC0308.mo1059(i);
        }
        List<InterfaceC0308> list = this.f1901;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0308 interfaceC03082 = this.f1901.get(i3);
                if (interfaceC03082 != null) {
                    interfaceC03082.mo1059(i);
                }
            }
        }
        InterfaceC0308 interfaceC03083 = this.f1926;
        if (interfaceC03083 != null) {
            interfaceC03083.mo1059(i);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1892;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m1063(int i) {
        InterfaceC0308 interfaceC0308 = this.f1899;
        if (interfaceC0308 != null) {
            interfaceC0308.mo1060(i);
        }
        List<InterfaceC0308> list = this.f1901;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0308 interfaceC03082 = this.f1901.get(i2);
                if (interfaceC03082 != null) {
                    interfaceC03082.mo1060(i);
                }
            }
        }
        InterfaceC0308 interfaceC03083 = this.f1926;
        if (interfaceC03083 != null) {
            interfaceC03083.mo1060(i);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1064(InterfaceC0308 interfaceC0308) {
        if (this.f1901 == null) {
            this.f1901 = new ArrayList();
        }
        this.f1901.add(interfaceC0308);
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final void m1065(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int m1066(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f1878 || Math.abs(i2) <= this.f1897) {
            i += (int) (f + (i >= this.f1880 ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f1895.size() <= 0) {
            return i;
        }
        return Math.max(this.f1895.get(0).f1940, Math.min(i, this.f1895.get(r4.size() - 1).f1940));
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m1067(float f) {
        if (!this.f1898) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f1914 == null) {
            return;
        }
        this.f1883 += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.f1903 * clientWidth;
        float f3 = this.f1918 * clientWidth;
        C0306 c0306 = this.f1895.get(0);
        C0306 c03062 = this.f1895.get(r4.size() - 1);
        if (c0306.f1940 != 0) {
            f2 = c0306.f1943 * clientWidth;
        }
        if (c03062.f1940 != this.f1914.mo1135() - 1) {
            f3 = c03062.f1943 * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.f1883 = (scrollX - i) + this.f1883;
        scrollTo(i, getScrollY());
        m1075(i);
        MotionEvent obtain = MotionEvent.obtain(this.f1913, SystemClock.uptimeMillis(), 2, this.f1883, 0.0f, 0);
        this.f1923.addMovement(obtain);
        obtain.recycle();
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final void m1068(int i, boolean z, int i2, boolean z2) {
        int scrollX;
        int abs;
        C0306 m1088 = m1088(i);
        int max = m1088 != null ? (int) (Math.max(this.f1903, Math.min(m1088.f1943, this.f1918)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                m1063(i);
            }
            m1078(false);
            scrollTo(max, 0);
            m1075(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f1928;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f1910 ? this.f1928.getCurrX() : this.f1928.getStartX();
                this.f1928.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = max - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m1078(false);
                m1080(this.f1880);
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f1914.getClass();
                    abs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.f1924)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f1910 = false;
                this.f1928.startScroll(i3, scrollY, i4, i5, min);
                AtomicInteger atomicInteger = C1096.f5578;
                if (Build.VERSION.SDK_INT >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            }
        }
        if (z2) {
            m1063(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1069(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f1919
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f1931
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f1929
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            androidx.viewpager.widget.ViewPager$ぺぁあねじ r0 = r12.f1899
            if (r0 == 0) goto L72
            r0.mo1061(r13, r14, r15)
        L72:
            java.util.List<androidx.viewpager.widget.ViewPager$ぺぁあねじ> r0 = r12.f1901
            if (r0 == 0) goto L8d
            int r0 = r0.size()
            r3 = 0
        L7b:
            if (r3 >= r0) goto L8d
            java.util.List<androidx.viewpager.widget.ViewPager$ぺぁあねじ> r4 = r12.f1901
            java.lang.Object r4 = r4.get(r3)
            androidx.viewpager.widget.ViewPager$ぺぁあねじ r4 = (androidx.viewpager.widget.ViewPager.InterfaceC0308) r4
            if (r4 == 0) goto L8a
            r4.mo1061(r13, r14, r15)
        L8a:
            int r3 = r3 + 1
            goto L7b
        L8d:
            androidx.viewpager.widget.ViewPager$ぺぁあねじ r0 = r12.f1926
            if (r0 == 0) goto L94
            r0.mo1061(r13, r14, r15)
        L94:
            androidx.viewpager.widget.ViewPager$いいにぽつ r13 = r12.f1896
            if (r13 == 0) goto Lc5
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        La0:
            if (r1 >= r14) goto Lc5
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f1931
            if (r0 == 0) goto Lb1
            goto Lc2
        Lb1:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$いいにぽつ r3 = r12.f1896
            r3.m1091(r15, r0)
        Lc2:
            int r1 = r1 + 1
            goto La0
        Lc5:
            r12.f1887 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m1069(int, float, int):void");
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final boolean m1070() {
        this.f1906 = -1;
        this.f1888 = false;
        this.f1884 = false;
        VelocityTracker velocityTracker = this.f1923;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1923 = null;
        }
        this.f1881.onRelease();
        this.f1909.onRelease();
        return this.f1881.isFinished() || this.f1909.isFinished();
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final void m1071(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1906) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1883 = motionEvent.getX(i);
            this.f1906 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1923;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m1072() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1928 = new Scroller(context, f1871);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1912 = viewConfiguration.getScaledPagingTouchSlop();
        this.f1897 = (int) (400.0f * f);
        this.f1891 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1881 = new EdgeEffect(context);
        this.f1909 = new EdgeEffect(context);
        this.f1878 = (int) (25.0f * f);
        this.f1885 = (int) (2.0f * f);
        this.f1920 = (int) (f * 16.0f);
        C1096.m2490(this, new C0300());
        if (C1096.m2519(this) == 0) {
            C1096.m2505(this, 1);
        }
        C1096.m2503(this, new C0307());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m1073(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L52
        Lb:
            if (r0 == 0) goto L52
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            r4.toString()
            goto L9
        L52:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L9e
            if (r3 == r0) goto L9e
            if (r7 != r5) goto L83
            android.graphics.Rect r1 = r6.f1908
            android.graphics.Rect r1 = r6.m1090(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f1908
            android.graphics.Rect r2 = r6.m1090(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L7d
            if (r1 < r2) goto L7d
            boolean r0 = r6.m1077()
            goto L81
        L7d:
            boolean r0 = r3.requestFocus()
        L81:
            r2 = r0
            goto Lb1
        L83:
            if (r7 != r4) goto Lb1
            android.graphics.Rect r1 = r6.f1908
            android.graphics.Rect r1 = r6.m1090(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f1908
            android.graphics.Rect r2 = r6.m1090(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L7d
            if (r1 > r2) goto L7d
            boolean r0 = r6.m1084()
            goto L81
        L9e:
            if (r7 == r5) goto Lad
            if (r7 != r1) goto La3
            goto Lad
        La3:
            if (r7 == r4) goto La8
            r0 = 2
            if (r7 != r0) goto Lb1
        La8:
            boolean r2 = r6.m1084()
            goto Lb1
        Lad:
            boolean r2 = r6.m1077()
        Lb1:
            if (r2 == 0) goto Lba
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m1073(int):boolean");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0306 m1074(int i, int i2) {
        C0306 c0306 = new C0306();
        c0306.f1940 = i;
        c0306.f1942 = this.f1914.mo1137(this, i);
        this.f1914.getClass();
        c0306.f1944 = 1.0f;
        if (i2 < 0 || i2 >= this.f1895.size()) {
            this.f1895.add(c0306);
        } else {
            this.f1895.add(i2, c0306);
        }
        return c0306;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final boolean m1075(int i) {
        if (this.f1895.size() == 0) {
            if (this.f1907) {
                return false;
            }
            this.f1887 = false;
            m1069(0, 0.0f, 0);
            if (this.f1887) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0306 m1083 = m1083();
        int clientWidth = getClientWidth();
        int i2 = this.f1924;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = m1083.f1940;
        float f2 = ((i / f) - m1083.f1943) / (m1083.f1944 + (i2 / f));
        this.f1887 = false;
        m1069(i4, f2, (int) (i3 * f2));
        if (this.f1887) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final boolean m1076(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1883 - f;
        this.f1883 = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f1903 * clientWidth;
        float f4 = this.f1918 * clientWidth;
        boolean z3 = false;
        C0306 c0306 = this.f1895.get(0);
        ArrayList<C0306> arrayList = this.f1895;
        C0306 c03062 = arrayList.get(arrayList.size() - 1);
        if (c0306.f1940 != 0) {
            f3 = c0306.f1943 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c03062.f1940 != this.f1914.mo1135() - 1) {
            f4 = c03062.f1943 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f1881.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f1909.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1883 = (scrollX - i) + this.f1883;
        scrollTo(i, getScrollY());
        m1075(i);
        return z3;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean m1077() {
        int i = this.f1880;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1078(boolean z) {
        boolean z2 = this.f1876 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f1928.isFinished()) {
                this.f1928.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1928.getCurrX();
                int currY = this.f1928.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m1075(currX);
                    }
                }
            }
        }
        this.f1922 = false;
        for (int i = 0; i < this.f1895.size(); i++) {
            C0306 c0306 = this.f1895.get(i);
            if (c0306.f1941) {
                c0306.f1941 = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C1096.m2482(this, this.f1893);
            } else {
                this.f1893.run();
            }
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C0306 m1079(View view) {
        for (int i = 0; i < this.f1895.size(); i++) {
            C0306 c0306 = this.f1895.get(i);
            if (this.f1914.mo1134(view, c0306.f1942)) {
                return c0306;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x00ca, code lost:
    
        if (r6 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00d8, code lost:
    
        if (r6 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r5 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if (r6 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        r7 = r14.f1895.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0138, code lost:
    
        if (r10 < r14.f1895.size()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0160, code lost:
    
        r7 = r14.f1895.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014c, code lost:
    
        if (r10 < r14.f1895.size()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015e, code lost:
    
        if (r10 < r14.f1895.size()) goto L97;
     */
    /* renamed from: でどあくず, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1080(int r15) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m1080(int):void");
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m1081() {
        int mo1135 = this.f1914.mo1135();
        this.f1877 = mo1135;
        boolean z = this.f1895.size() < (this.f1879 * 2) + 1 && this.f1895.size() < mo1135;
        int i = this.f1880;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f1895.size()) {
            C0306 c0306 = this.f1895.get(i2);
            int mo1633 = this.f1914.mo1633(c0306.f1942);
            if (mo1633 != -1) {
                if (mo1633 == -2) {
                    this.f1895.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f1914.mo3306(this);
                        z2 = true;
                    }
                    this.f1914.mo1136(this, c0306.f1940, c0306.f1942);
                    int i3 = this.f1880;
                    if (i3 == c0306.f1940) {
                        i = Math.max(0, Math.min(i3, mo1135 - 1));
                    }
                } else {
                    int i4 = c0306.f1940;
                    if (i4 != mo1633) {
                        if (i4 == this.f1880) {
                            i = mo1633;
                        }
                        c0306.f1940 = mo1633;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f1914.mo3304(this);
        }
        Collections.sort(this.f1895, f1870);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f1931) {
                    layoutParams.f1930 = 0.0f;
                }
            }
            m1085(i, false, true, 0);
            requestLayout();
        }
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m1082() {
        if (this.f1894 != 0) {
            ArrayList<View> arrayList = this.f1905;
            if (arrayList == null) {
                this.f1905 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f1905.add(getChildAt(i));
            }
            Collections.sort(this.f1905, f1872);
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final C0306 m1083() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f1924 / clientWidth : 0.0f;
        C0306 c0306 = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f1895.size()) {
            C0306 c03062 = this.f1895.get(i3);
            if (!z && c03062.f1940 != (i = i2 + 1)) {
                c03062 = this.f1921;
                c03062.f1943 = f + f3 + f2;
                c03062.f1940 = i;
                this.f1914.getClass();
                c03062.f1944 = 1.0f;
                i3--;
            }
            f = c03062.f1943;
            float f4 = c03062.f1944 + f + f2;
            if (!z && scrollX < f) {
                return c0306;
            }
            if (scrollX < f4 || i3 == this.f1895.size() - 1) {
                return c03062;
            }
            i2 = c03062.f1940;
            f3 = c03062.f1944;
            i3++;
            c0306 = c03062;
            z = false;
        }
        return c0306;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean m1084() {
        AbstractC1512 abstractC1512 = this.f1914;
        if (abstractC1512 == null || this.f1880 >= abstractC1512.mo1135() - 1) {
            return false;
        }
        setCurrentItem(this.f1880 + 1, true);
        return true;
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public void m1085(int i, boolean z, boolean z2, int i2) {
        AbstractC1512 abstractC1512 = this.f1914;
        if (abstractC1512 == null || abstractC1512.mo1135() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f1880 == i && this.f1895.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f1914.mo1135()) {
            i = this.f1914.mo1135() - 1;
        }
        int i3 = this.f1879;
        int i4 = this.f1880;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f1895.size(); i5++) {
                this.f1895.get(i5).f1941 = true;
            }
        }
        boolean z3 = this.f1880 != i;
        if (!this.f1907) {
            m1080(i);
            m1068(i, z, i2, z3);
        } else {
            this.f1880 = i;
            if (z3) {
                m1063(i);
            }
            requestLayout();
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean m1086(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m1086(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final void m1087(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f1895.isEmpty()) {
            C0306 m1088 = m1088(this.f1880);
            min = (int) ((m1088 != null ? Math.min(m1088.f1943, this.f1918) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            } else {
                m1078(false);
            }
        } else if (!this.f1928.isFinished()) {
            this.f1928.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C0306 m1088(int i) {
        for (int i2 = 0; i2 < this.f1895.size(); i2++) {
            C0306 c0306 = this.f1895.get(i2);
            if (c0306.f1940 == i) {
                return c0306;
            }
        }
        return null;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m1089() {
        if (!this.f1898) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f1914 != null) {
            VelocityTracker velocityTracker = this.f1923;
            velocityTracker.computeCurrentVelocity(1000, this.f1891);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f1906);
            this.f1922 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0306 m1083 = m1083();
            m1085(m1066(m1083.f1940, ((scrollX / clientWidth) - m1083.f1943) / m1083.f1944, xVelocity, (int) (this.f1883 - this.f1927)), true, true, xVelocity);
        }
        this.f1888 = false;
        this.f1884 = false;
        VelocityTracker velocityTracker2 = this.f1923;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f1923 = null;
        }
        this.f1898 = false;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final Rect m1090(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public void setCurrentItem(int i, boolean z) {
        this.f1922 = false;
        m1085(i, z, false, 0);
    }
}
