package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p035.p045.p046.InterfaceC1092;
import p034.p065.p066.AbstractC1385;
import p034.p065.p066.C1386;
import p034.p098.C1768;
import p034.p098.p099.InterfaceC1759;
import p034.p098.p100.C1761;
import p034.p098.p100.C1762;
import p034.p098.p100.C1764;
import p034.p098.p100.C1765;
import p034.p098.p100.C1767;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public LinearLayoutManager f1948;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Rect f1949;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public RecyclerView.AbstractC0225 f1950;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public Parcelable f1951;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public C1764 f1952;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public RecyclerView.AbstractC0231 f1953;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C1767 f1954;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Rect f1955;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f1956;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public AbstractC0323 f1957;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f1958;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f1959;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1386 f1960;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f1961;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C1765 f1962;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f1963;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1762 f1964;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C1762 f1965;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f1966;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public RecyclerView f1967;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0310();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1968;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1969;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Parcelable f1970;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0310 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, null) : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1968 = parcel.readInt();
            this.f1969 = parcel.readInt();
            this.f1970 = parcel.readParcelable(null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1968);
            parcel.writeInt(this.f1969);
            parcel.writeParcelable(this.f1970, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1968 = parcel.readInt();
            this.f1969 = parcel.readInt();
            this.f1970 = parcel.readParcelable(classLoader);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C0311 extends AbstractC0323 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final InterfaceC1092 f1971;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public RecyclerView.AbstractC0225 f1972;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final InterfaceC1092 f1973;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
        public class C0312 implements InterfaceC1092 {
            public C0312() {
            }

            @Override // p034.p035.p045.p046.InterfaceC1092
            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public boolean mo1101(View view, InterfaceC1092.AbstractC1094 abstractC1094) {
                C0311.this.m1098(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$〳ぜぞぜべっ$くし〴〺ぅ, reason: contains not printable characters */
        public class C0313 extends AbstractC0320 {
            public C0313() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0225
            /* renamed from: げつ〴ぬぐ */
            public void mo791() {
                C0311.this.m1100();
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0314 implements InterfaceC1092 {
            public C0314() {
            }

            @Override // p034.p035.p045.p046.InterfaceC1092
            /* renamed from: げつ〴ぬぐ */
            public boolean mo1101(View view, InterfaceC1092.AbstractC1094 abstractC1094) {
                C0311.this.m1098(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public C0311() {
            super(ViewPager2.this, null);
            this.f1973 = new C0314();
            this.f1971 = new C0312();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0323
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1097() {
            m1100();
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void m1098(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f1963) {
                viewPager2.m1096(i, true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0323
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1099(C1762 c1762, RecyclerView recyclerView) {
            C1096.m2505(recyclerView, 2);
            this.f1972 = new C0313();
            if (C1096.m2519(ViewPager2.this) == 0) {
                C1096.m2505(ViewPager2.this, 1);
            }
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m1100() {
            int mo888;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            C1096.m2521(viewPager2, R.id.accessibilityActionPageLeft);
            C1096.m2521(viewPager2, R.id.accessibilityActionPageRight);
            C1096.m2521(viewPager2, R.id.accessibilityActionPageUp);
            C1096.m2521(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (mo888 = ViewPager2.this.getAdapter().mo888()) == 0) {
                return;
            }
            ViewPager2 viewPager22 = ViewPager2.this;
            if (viewPager22.f1963) {
                if (viewPager22.getOrientation() != 0) {
                    if (ViewPager2.this.f1959 < mo888 - 1) {
                        C1096.m2502(viewPager2, new C1084.C1087(R.id.accessibilityActionPageDown, null), null, this.f1973);
                    }
                    if (ViewPager2.this.f1959 > 0) {
                        C1096.m2502(viewPager2, new C1084.C1087(R.id.accessibilityActionPageUp, null), null, this.f1971);
                        return;
                    }
                    return;
                }
                boolean m1092 = ViewPager2.this.m1092();
                int i2 = m1092 ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
                if (m1092) {
                    i = R.id.accessibilityActionPageRight;
                }
                if (ViewPager2.this.f1959 < mo888 - 1) {
                    C1096.m2502(viewPager2, new C1084.C1087(i2, null), null, this.f1973);
                }
                if (ViewPager2.this.f1959 > 0) {
                    C1096.m2502(viewPager2, new C1084.C1087(i, null), null, this.f1971);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$〺つふすそ, reason: contains not printable characters */
    public class C0315 extends AbstractC0316 {
        public C0315() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo1102(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f1959 != i) {
                viewPager2.f1959 = i;
                viewPager2.f1957.mo1097();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1103(int i) {
            if (i == 0) {
                ViewPager2.this.m1095();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$ぁごぐすすぃ, reason: contains not printable characters */
    public static abstract class AbstractC0316 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1104(int i, float f, int i2) {
        }

        /* renamed from: くし〴〺ぅ */
        public void mo1102(int i) {
        }

        /* renamed from: げつ〴ぬぐ */
        public void mo1103(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$いいにぽつ, reason: contains not printable characters */
    public class C0317 extends C1386 {
        public C0317() {
        }

        @Override // p034.p065.p066.C1386, p034.p065.p066.AbstractC1373
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public View mo1105(RecyclerView.AbstractC0219 abstractC0219) {
            AbstractC1385 m3144;
            if (!ViewPager2.this.f1954.f7989.f7982) {
                if (abstractC0219.mo663()) {
                    m3144 = m3143(abstractC0219);
                } else if (abstractC0219.mo657()) {
                    m3144 = m3144(abstractC0219);
                }
                return m3141(abstractC0219, m3144);
            }
            return null;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$くし〴〺ぅ, reason: contains not printable characters */
    public class C0318 extends AbstractC0316 {
        public C0318() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
        /* renamed from: くし〴〺ぅ */
        public void mo1102(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f1967.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0319 extends AbstractC0320 {
        public C0319() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0225
        /* renamed from: げつ〴ぬぐ */
        public void mo791() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f1961 = true;
            viewPager2.f1962.f7980 = true;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$づざかべべ, reason: contains not printable characters */
    public static abstract class AbstractC0320 extends RecyclerView.AbstractC0225 {
        public AbstractC0320(C0319 c0319) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$てぜきぽく, reason: contains not printable characters */
    public static class RunnableC0321 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f1982;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final RecyclerView f1983;

        public RunnableC0321(int i, RecyclerView recyclerView) {
            this.f1982 = i;
            this.f1983 = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1983.m745(this.f1982);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0322 extends LinearLayoutManager {
        public C0322(Context context) {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: 〻だくけはく */
        public void mo634(RecyclerView.C0224 c0224, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo634(c0224, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
        /* renamed from: いたぷすいだ */
        public boolean mo830(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, int i, Bundle bundle) {
            ViewPager2.this.f1957.getClass();
            return super.mo830(c0217, c0224, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
        /* renamed from: びがえ〱な */
        public boolean mo870(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
        /* renamed from: びちづぼぬ */
        public void mo871(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, C1084 c1084) {
            super.mo871(c0217, c0224, c1084);
            ViewPager2.this.f1957.getClass();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$びぐびあび, reason: contains not printable characters */
    public abstract class AbstractC0323 {
        public AbstractC0323(ViewPager2 viewPager2, C0319 c0319) {
        }

        /* renamed from: 〺つふすそ */
        public abstract void mo1097();

        /* renamed from: げつ〴ぬぐ */
        public abstract void mo1099(C1762 c1762, RecyclerView recyclerView);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$ぺぁあねじ, reason: contains not printable characters */
    public interface InterfaceC0324 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m1106(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$ぺふねづ〺, reason: contains not printable characters */
    public class C0325 extends RecyclerView {
        public C0325(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            ViewPager2.this.f1957.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f1959);
            accessibilityEvent.setToIndex(ViewPager2.this.f1959);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f1963 && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f1963 && super.onTouchEvent(motionEvent);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f1949 = new Rect();
        this.f1955 = new Rect();
        this.f1964 = new C1762(3);
        this.f1961 = false;
        this.f1950 = new C0319();
        this.f1966 = -1;
        this.f1953 = null;
        this.f1958 = false;
        this.f1963 = true;
        this.f1956 = -1;
        m1094(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1949 = new Rect();
        this.f1955 = new Rect();
        this.f1964 = new C1762(3);
        this.f1961 = false;
        this.f1950 = new C0319();
        this.f1966 = -1;
        this.f1953 = null;
        this.f1958 = false;
        this.f1963 = true;
        this.f1956 = -1;
        m1094(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1949 = new Rect();
        this.f1955 = new Rect();
        this.f1964 = new C1762(3);
        this.f1961 = false;
        this.f1950 = new C0319();
        this.f1966 = -1;
        this.f1953 = null;
        this.f1958 = false;
        this.f1963 = true;
        this.f1956 = -1;
        m1094(context, attributeSet);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f1967.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f1967.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f1968;
            sparseArray.put(this.f1967.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m1093();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f1957.getClass();
        this.f1957.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.AbstractC0228 getAdapter() {
        return this.f1967.getAdapter();
    }

    public int getCurrentItem() {
        return this.f1959;
    }

    public int getItemDecorationCount() {
        return this.f1967.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f1956;
    }

    public int getOrientation() {
        return this.f1948.f1342;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f1967;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f1962.f7981;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            androidx.viewpager2.widget.ViewPager2$びぐびあび r0 = r5.f1957
            androidx.viewpager2.widget.ViewPager2$〳ぜぞぜべっ r0 = (androidx.viewpager2.widget.ViewPager2.C0311) r0
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$びぐびあび r1 = r1.getAdapter()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L31
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            int r1 = r1.getOrientation()
            if (r1 != r2) goto L24
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$びぐびあび r1 = r1.getAdapter()
            int r1 = r1.mo888()
            goto L32
        L24:
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$びぐびあび r1 = r1.getAdapter()
            int r1 = r1.mo888()
            r4 = r1
            r1 = 0
            goto L33
        L31:
            r1 = 0
        L32:
            r4 = 0
        L33:
            づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.〺つふすそ$〺つふすそ r1 = p034.p035.p045.p046.C1084.C1085.m2469(r1, r4, r3, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 19
            if (r3 < r4) goto L44
            java.lang.Object r1 = r1.f5551
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r1
            r6.setCollectionInfo(r1)
        L44:
            r1 = 16
            if (r3 < r1) goto L76
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$びぐびあび r1 = r1.getAdapter()
            if (r1 != 0) goto L51
            goto L76
        L51:
            int r1 = r1.mo888()
            if (r1 == 0) goto L76
            androidx.viewpager2.widget.ViewPager2 r3 = androidx.viewpager2.widget.ViewPager2.this
            boolean r4 = r3.f1963
            if (r4 != 0) goto L5e
            goto L76
        L5e:
            int r3 = r3.f1959
            if (r3 <= 0) goto L67
            r3 = 8192(0x2000, float:1.14794E-41)
            r6.addAction(r3)
        L67:
            androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
            int r0 = r0.f1959
            int r1 = r1 - r2
            if (r0 >= r1) goto L73
            r0 = 4096(0x1000, float:5.74E-42)
            r6.addAction(r0)
        L73:
            r6.setScrollable(r2)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f1967.getMeasuredWidth();
        int measuredHeight = this.f1967.getMeasuredHeight();
        this.f1949.left = getPaddingLeft();
        this.f1949.right = (i3 - i) - getPaddingRight();
        this.f1949.top = getPaddingTop();
        this.f1949.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f1949, this.f1955);
        RecyclerView recyclerView = this.f1967;
        Rect rect = this.f1955;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f1961) {
            m1095();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f1967, i, i2);
        int measuredWidth = this.f1967.getMeasuredWidth();
        int measuredHeight = this.f1967.getMeasuredHeight();
        int measuredState = this.f1967.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1966 = savedState.f1969;
        this.f1951 = savedState.f1970;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1968 = this.f1967.getId();
        int i = this.f1966;
        if (i == -1) {
            i = this.f1959;
        }
        savedState.f1969 = i;
        Parcelable parcelable = this.f1951;
        if (parcelable == null) {
            Object adapter = this.f1967.getAdapter();
            if (adapter instanceof InterfaceC1759) {
                parcelable = ((InterfaceC1759) adapter).m3809();
            }
            return savedState;
        }
        savedState.f1970 = parcelable;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        ((C0311) this.f1957).getClass();
        if (!(i == 8192 || i == 4096)) {
            return super.performAccessibilityAction(i, bundle);
        }
        C0311 c0311 = (C0311) this.f1957;
        c0311.getClass();
        if (!(i == 8192 || i == 4096)) {
            throw new IllegalStateException();
        }
        c0311.m1098(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
        return true;
    }

    public void setAdapter(RecyclerView.AbstractC0228 abstractC0228) {
        RecyclerView.AbstractC0228 adapter = this.f1967.getAdapter();
        C0311 c0311 = (C0311) this.f1957;
        c0311.getClass();
        if (adapter != null) {
            adapter.f1556.unregisterObserver(c0311.f1972);
        }
        if (adapter != null) {
            adapter.f1556.unregisterObserver(this.f1950);
        }
        this.f1967.setAdapter(abstractC0228);
        this.f1959 = 0;
        m1093();
        C0311 c03112 = (C0311) this.f1957;
        c03112.m1100();
        if (abstractC0228 != null) {
            abstractC0228.f1556.registerObserver(c03112.f1972);
        }
        if (abstractC0228 != null) {
            abstractC0228.f1556.registerObserver(this.f1950);
        }
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        if (this.f1954.f7989.f7982) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m1096(i, z);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((C0311) this.f1957).m1100();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f1956 = i;
        this.f1967.requestLayout();
    }

    public void setOrientation(int i) {
        this.f1948.m675(i);
        ((C0311) this.f1957).m1100();
    }

    public void setPageTransformer(InterfaceC0324 interfaceC0324) {
        boolean z = this.f1958;
        if (interfaceC0324 != null) {
            if (!z) {
                this.f1953 = this.f1967.getItemAnimator();
                this.f1958 = true;
            }
            this.f1967.setItemAnimator(null);
        } else if (z) {
            this.f1967.setItemAnimator(this.f1953);
            this.f1953 = null;
            this.f1958 = false;
        }
        C1764 c1764 = this.f1952;
        if (interfaceC0324 == c1764.f7971) {
            return;
        }
        c1764.f7971 = interfaceC0324;
        if (interfaceC0324 == null) {
            return;
        }
        C1765 c1765 = this.f1962;
        c1765.m3814();
        C1765.C1766 c1766 = c1765.f7975;
        double d = c1766.f7988;
        double d2 = c1766.f7986;
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d + d2;
        int i = (int) d3;
        double d4 = i;
        Double.isNaN(d4);
        Double.isNaN(d4);
        Double.isNaN(d4);
        float f = (float) (d3 - d4);
        this.f1952.mo1104(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.f1963 = z;
        C0311 c0311 = (C0311) this.f1957;
        c0311.m1100();
        if (Build.VERSION.SDK_INT < 21) {
            ViewPager2.this.sendAccessibilityEvent(2048);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m1092() {
        return this.f1948.m840() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1093() {
        RecyclerView.AbstractC0228 adapter;
        if (this.f1966 == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f1951;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC1759) {
                ((InterfaceC1759) adapter).m3808(parcelable);
            }
            this.f1951 = null;
        }
        int max = Math.max(0, Math.min(this.f1966, adapter.mo888() - 1));
        this.f1959 = max;
        this.f1966 = -1;
        this.f1967.m713(max);
        ((C0311) this.f1957).m1100();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1094(Context context, AttributeSet attributeSet) {
        this.f1957 = new C0311();
        C0325 c0325 = new C0325(context);
        this.f1967 = c0325;
        c0325.setId(C1096.m2510());
        this.f1967.setDescendantFocusability(131072);
        C0322 c0322 = new C0322(context);
        this.f1948 = c0322;
        this.f1967.setLayoutManager(c0322);
        this.f1967.setScrollingTouchSlop(1);
        int[] iArr = C1768.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C1768.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.f1967.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView = this.f1967;
            C1761 c1761 = new C1761(this);
            if (recyclerView.f1434 == null) {
                recyclerView.f1434 = new ArrayList();
            }
            recyclerView.f1434.add(c1761);
            C1765 c1765 = new C1765(this);
            this.f1962 = c1765;
            this.f1954 = new C1767(this, c1765, this.f1967);
            C0317 c0317 = new C0317();
            this.f1960 = c0317;
            c0317.m3099(this.f1967);
            this.f1967.m693(this.f1962);
            C1762 c1762 = new C1762(3);
            this.f1965 = c1762;
            this.f1962.f7978 = c1762;
            C0315 c0315 = new C0315();
            C0318 c0318 = new C0318();
            c1762.f7970.add(c0315);
            this.f1965.f7970.add(c0318);
            this.f1957.mo1099(this.f1965, this.f1967);
            C1762 c17622 = this.f1965;
            c17622.f7970.add(this.f1964);
            C1764 c1764 = new C1764(this.f1948);
            this.f1952 = c1764;
            this.f1965.f7970.add(c1764);
            RecyclerView recyclerView2 = this.f1967;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m1095() {
        C1386 c1386 = this.f1960;
        if (c1386 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View mo1105 = c1386.mo1105(this.f1948);
        if (mo1105 == null) {
            return;
        }
        int m857 = this.f1948.m857(mo1105);
        if (m857 != this.f1959 && getScrollState() == 0) {
            this.f1965.mo1102(m857);
        }
        this.f1961 = false;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1096(int i, boolean z) {
        AbstractC0316 abstractC0316;
        RecyclerView.AbstractC0228 adapter = getAdapter();
        if (adapter == null) {
            if (this.f1966 != -1) {
                this.f1966 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo888() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.mo888() - 1);
        int i2 = this.f1959;
        if (min == i2) {
            if (this.f1962.f7981 == 0) {
                return;
            }
        }
        if (min == i2 && z) {
            return;
        }
        double d = i2;
        this.f1959 = min;
        ((C0311) this.f1957).m1100();
        C1765 c1765 = this.f1962;
        if (!(c1765.f7981 == 0)) {
            c1765.m3814();
            C1765.C1766 c1766 = c1765.f7975;
            double d2 = c1766.f7988;
            double d3 = c1766.f7986;
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 + d3;
        }
        C1765 c17652 = this.f1962;
        c17652.f7979 = z ? 2 : 3;
        c17652.f7982 = false;
        boolean z2 = c17652.f7984 != min;
        c17652.f7984 = min;
        c17652.m3815(2);
        if (z2 && (abstractC0316 = c17652.f7978) != null) {
            abstractC0316.mo1102(min);
        }
        if (!z) {
            this.f1967.m713(min);
            return;
        }
        double d4 = min;
        Double.isNaN(d4);
        Double.isNaN(d4);
        if (Math.abs(d4 - d) <= 3.0d) {
            this.f1967.m745(min);
            return;
        }
        this.f1967.m713(d4 > d ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f1967;
        recyclerView.post(new RunnableC0321(min, recyclerView));
    }
}
