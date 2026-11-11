package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1110;
import p034.p035.p045.InterfaceC1121;
import p034.p035.p045.p046.C1084;
import p034.p050.p055.p056.C1266;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2143;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p186.C2294;
import p131.p161.p162.p163.p191.C2340;
import p131.p161.p162.p163.p191.C2341;
import p131.p161.p162.p163.p191.C2342;
import p131.p161.p162.p163.p191.C2343;
import p131.p161.p162.p163.p191.C2346;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0129 {

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final int f2881 = C2350.Widget_Design_AppBarLayout;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1072 f2882;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2883;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2884;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f2885;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int[] f2886;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Drawable f2887;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ValueAnimator f2888;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2889;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2890;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f2891;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f2892;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f2893;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2894;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public WeakReference<View> f2895;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public List<InterfaceC0387> f2896;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f2897;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f2898;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public WeakReference<View> f2899;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public float f2900;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public ValueAnimator f2901;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public int f2902;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean f2903;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f2904;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0386();

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public float f2905;

            /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
            public boolean f2906;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public int f2907;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
            public static class C0386 implements Parcelable.ClassLoaderCreator<SavedState> {
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
                this.f2907 = parcel.readInt();
                this.f2905 = parcel.readFloat();
                this.f2906 = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f1099, i);
                parcel.writeInt(this.f2907);
                parcel.writeFloat(this.f2905);
                parcel.writeByte(this.f2906 ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f2902 = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2902 = -1;
        }

        /* renamed from: げがぴうあだ, reason: contains not printable characters */
        public static boolean m1265(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: 〺でおいここ, reason: contains not printable characters */
        public int mo1266(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int mo1273 = mo1273();
            int i5 = 0;
            if (i2 == 0 || mo1273 < i2 || mo1273 > i3) {
                this.f2898 = 0;
            } else {
                int m4812 = C2786.m4812(i, i2, i3);
                if (mo1273 != m4812) {
                    if (appBarLayout.f2892) {
                        int abs = Math.abs(m4812);
                        int childCount = appBarLayout.getChildCount();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i6);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f2908;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i6++;
                            } else if (interpolator != null) {
                                int i7 = layoutParams.f2909;
                                if ((i7 & 1) != 0) {
                                    i5 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                    if ((i7 & 2) != 0) {
                                        i5 -= C1096.m2485(childAt);
                                    }
                                }
                                if (C1096.m2512(childAt)) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(m4812);
                                }
                            }
                        }
                    }
                    i4 = m4812;
                    boolean m1295 = m1295(i4);
                    int i8 = mo1273 - m4812;
                    this.f2898 = m4812 - i4;
                    if (!m1295 && appBarLayout.f2892) {
                        coordinatorLayout.m325(appBarLayout);
                    }
                    appBarLayout.m1258(m1296());
                    m1271(coordinatorLayout, appBarLayout, m4812, m4812 < mo1273 ? -1 : 1, false);
                    i5 = i8;
                }
            }
            m1277(coordinatorLayout, appBarLayout);
            return i5;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: 〻ぞまぎな〻 */
        public /* bridge */ /* synthetic */ boolean mo345(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return m1274(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
        public void m1267(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.getTotalScrollRange();
                    i2 = i4;
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                if (i2 != i3) {
                    iArr[1] = m1292(coordinatorLayout, appBarLayout, i, i2, i3);
                }
            }
            if (appBarLayout.f2891) {
                appBarLayout.m1264(appBarLayout.m1262(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぇ〳〲〺すっ */
        public void mo348(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f2904 == 0 || i == 1) {
                m1269(coordinatorLayout, appBarLayout);
                if (appBarLayout.f2891) {
                    appBarLayout.m1264(appBarLayout.m1262(view2));
                }
            }
            this.f2899 = new WeakReference<>(view2);
        }

        /* renamed from: ぇとしたべど, reason: contains not printable characters */
        public final void m1268(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo1273() - i);
            float abs2 = Math.abs(f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            int mo1273 = mo1273();
            if (mo1273 == i) {
                ValueAnimator valueAnimator = this.f2901;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f2901.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f2901;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2901 = valueAnimator3;
                valueAnimator3.setInterpolator(C2294.f9510);
                this.f2901.addUpdateListener(new C2340(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f2901.setDuration(Math.min(round, 600));
            this.f2901.setIntValues(mo1273, i);
            this.f2901.start();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぇぬぎばつ */
        public /* bridge */ /* synthetic */ void mo349(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m1267(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        /* renamed from: えがぐせほち, reason: contains not printable characters */
        public final void m1269(CoordinatorLayout coordinatorLayout, T t) {
            int mo1273 = mo1273();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m1265(layoutParams.f2909, 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -mo1273;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f2909;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if (m1265(i3, 2)) {
                        i5 += C1096.m2485(childAt2);
                    } else if (m1265(i3, 5)) {
                        int m2485 = C1096.m2485(childAt2) + i5;
                        if (mo1273 < m2485) {
                            i4 = m2485;
                        } else {
                            i5 = m2485;
                        }
                    }
                    if (m1265(i3, 32)) {
                        i4 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (mo1273 < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    m1268(coordinatorLayout, t, C2786.m4812(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: ぉひのべい, reason: contains not printable characters */
        public int mo1270(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* renamed from: ごまけがぢは, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1271(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L9d
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
                int r0 = r0.f2909
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L5b
                int r1 = p034.p035.p045.C1096.m2485(r4)
                if (r10 <= 0) goto L48
                r10 = r0 & 12
                if (r10 == 0) goto L48
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L59
            L48:
                r10 = r0 & 2
                if (r10 == 0) goto L5b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
            L59:
                r9 = 1
                goto L5c
            L5b:
                r9 = 0
            L5c:
                boolean r10 = r8.f2891
                if (r10 == 0) goto L68
                android.view.View r9 = r6.m1276(r7)
                boolean r9 = r8.m1262(r9)
            L68:
                boolean r9 = r8.m1264(r9)
                if (r11 != 0) goto L9a
                if (r9 == 0) goto L9d
                java.util.List r7 = r7.m328(r8)
                int r9 = r7.size()
                r10 = 0
            L79:
                if (r10 >= r9) goto L98
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$づざかべべ r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0133) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r11.f994
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L95
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f2951
                if (r7 == 0) goto L98
                r2 = 1
                goto L98
            L95:
                int r10 = r10 + 1
                goto L79
            L98:
                if (r2 == 0) goto L9d
            L9a:
                r8.jumpDrawablesToCurrentState()
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m1271(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ざっざへづ */
        public void mo356(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.f2902 = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.f2902 = savedState.f2907;
            this.f2900 = savedState.f2905;
            this.f2903 = savedState.f2906;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ざとぅぼこ〺 */
        public /* bridge */ /* synthetic */ void mo357(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            m1275(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public boolean mo1272(View view) {
            WeakReference<View> weakReference = this.f2899;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: せづっ〸ちね, reason: contains not printable characters */
        public int mo1273() {
            return m1296() + this.f2898;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L18;
         */
        /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m1274(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L2a
                boolean r6 = r4.f2891
                if (r6 != 0) goto L2b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L12
                r6 = 1
                goto L13
            L12:
                r6 = 0
            L13:
                if (r6 == 0) goto L26
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L26
                r3 = 1
                goto L27
            L26:
                r3 = 0
            L27:
                if (r3 == 0) goto L2a
                goto L2b
            L2a:
                r0 = 0
            L2b:
                if (r0 == 0) goto L34
                android.animation.ValueAnimator r3 = r2.f2901
                if (r3 == 0) goto L34
                r3.cancel()
            L34:
                r3 = 0
                r2.f2899 = r3
                r2.f2904 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m1274(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: ておぞぞはね, reason: contains not printable characters */
        public void m1275(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                iArr[1] = m1292(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i == 0) {
                m1277(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: てぜきぽく */
        public boolean mo359(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0133) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m324(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: でどあくず */
        public Parcelable mo360(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int m1296 = m1296();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + m1296;
                if (childAt.getTop() + m1296 <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.f2907 = i;
                    savedState.f2906 = bottom == appBarLayout.getTopInset() + C1096.m2485(childAt);
                    savedState.f2905 = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        /* renamed from: ながふずは, reason: contains not printable characters */
        public final View m1276(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC1110) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: ばおぢでぎか, reason: contains not printable characters */
        public final void m1277(CoordinatorLayout coordinatorLayout, T t) {
            C1084.C1087 c1087 = C1084.C1087.f5553;
            C1096.m2521(coordinatorLayout, c1087.m2471());
            C1084.C1087 c10872 = C1084.C1087.f5562;
            C1096.m2521(coordinatorLayout, c10872.m2471());
            View m1276 = m1276(coordinatorLayout);
            if (m1276 == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0133) m1276.getLayoutParams()).f994 instanceof ScrollingViewBehavior)) {
                return;
            }
            if (mo1273() != (-t.getTotalScrollRange()) && m1276.canScrollVertically(1)) {
                C1096.m2502(coordinatorLayout, c1087, null, new C2346(this, t, false));
            }
            if (mo1273() != 0) {
                if (!m1276.canScrollVertically(-1)) {
                    C1096.m2502(coordinatorLayout, c10872, null, new C2346(this, t, true));
                    return;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C1096.m2502(coordinatorLayout, c10872, null, new C2342(this, coordinatorLayout, t, m1276, i));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: ぷぞてのほき, reason: contains not printable characters */
        public void mo1278(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m1269(coordinatorLayout, appBarLayout);
            if (appBarLayout.f2891) {
                appBarLayout.m1264(appBarLayout.m1262(m1276(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: ぺづげぺが, reason: contains not printable characters */
        public int mo1279(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぺふねづ〺 */
        public boolean mo369(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo369(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f2902;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                m1291(coordinatorLayout, appBarLayout, this.f2903 ? appBarLayout.getTopInset() + C1096.m2485(childAt) + i3 : Math.round(childAt.getHeight() * this.f2900) + i3);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m1268(coordinatorLayout, appBarLayout, i4, 0.0f);
                    } else {
                        m1291(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m1268(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        m1291(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f2884 = 0;
            this.f2902 = -1;
            m1295(C2786.m4812(m1296(), -appBarLayout.getTotalScrollRange(), 0));
            m1271(coordinatorLayout, appBarLayout, m1296(), 0, true);
            appBarLayout.m1258(m1296());
            m1277(coordinatorLayout, appBarLayout);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Interpolator f2908;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f2909;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2909 = 1;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2909 = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.AppBarLayout_Layout);
            this.f2909 = obtainStyledAttributes.getInt(C2243.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i = C2243.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f2908 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2909 = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2909 = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2909 = 1;
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.ScrollingViewBehavior_Layout);
            this.f2951 = obtainStyledAttributes.getDimensionPixelSize(C2243.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: 〳ぜぞぜべっ */
        public void mo343(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1096.m2521(coordinatorLayout, C1084.C1087.f5553.m2471());
                C1096.m2521(coordinatorLayout, C1084.C1087.f5562.m2471());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぁごぐすすぃ */
        public boolean mo346(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C0133) view2.getLayoutParams()).f994;
            if (behavior instanceof BaseBehavior) {
                C1096.m2515(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f2898) + this.f2950) - m1294(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f2891) {
                return false;
            }
            appBarLayout.m1264(appBarLayout.m1262(view));
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: ぉひのべい, reason: contains not printable characters */
        public float mo1280(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C0133) appBarLayout.getLayoutParams()).f994;
                int mo1273 = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).mo1273() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + mo1273 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (mo1273 / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ごづごきえ */
        public boolean mo355(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo1281 = mo1281(coordinatorLayout.m331(view));
            if (mo1281 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f2949;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo1281.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: せづっ〸ちね, reason: contains not printable characters */
        public int mo1282(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: びぐびあび */
        public boolean mo365(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: ぷぞてのほき, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AppBarLayout mo1281(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0387<T extends AppBarLayout> {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo1284(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0388 extends InterfaceC0387<AppBarLayout> {
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0389 implements InterfaceC1121 {
        public C0389() {
        }

        @Override // p034.p035.p045.InterfaceC1121
        /* renamed from: げつ〴ぬぐ */
        public C1072 mo370(View view, C1072 c1072) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            C1072 c10722 = C1096.m2512(appBarLayout) ? c1072 : null;
            if (!C2786.m4781(appBarLayout.f2882, c10722)) {
                appBarLayout.f2882 = c10722;
                appBarLayout.m1259();
                appBarLayout.requestLayout();
            }
            return c1072;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.appBarLayoutStyle);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2887 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f2883);
            this.f2887.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2887;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0129
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int m2485;
        int i2 = this.f2894;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f2909;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i4 & 8) != 0) {
                    m2485 = C1096.m2485(childAt);
                } else if ((i4 & 2) != 0) {
                    m2485 = measuredHeight - C1096.m2485(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C1096.m2512(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = m2485 + i5;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            }
        }
        int max = Math.max(0, i3);
        this.f2894 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f2890;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
            int i4 = layoutParams.f2909;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C1096.m2485(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f2890 = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f2893;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m2485 = C1096.m2485(this);
        if (m2485 == 0) {
            int childCount = getChildCount();
            m2485 = childCount >= 1 ? C1096.m2485(getChildAt(childCount - 1)) : 0;
            if (m2485 == 0) {
                return getHeight() / 3;
            }
        }
        return (m2485 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f2884;
    }

    public Drawable getStatusBarForeground() {
        return this.f2887;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C1072 c1072 = this.f2882;
        if (c1072 != null) {
            return c1072.m2424();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f2889;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f2909;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i3;
            if (i2 == 0 && C1096.m2512(childAt)) {
                i5 -= getTopInset();
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                i3 -= C1096.m2485(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f2889 = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2163) {
            C1687.m3669(this, (C2163) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f2886 == null) {
            this.f2886 = new int[4];
        }
        int[] iArr = this.f2886;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f2885;
        int i2 = C2111.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f2897) ? C2111.state_lifted : -C2111.state_lifted;
        int i3 = C2111.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f2897) ? C2111.state_collapsed : -C2111.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f2895;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2895 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = true;
        if (C1096.m2512(this) && m1263()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1096.m2515(getChildAt(childCount), topInset);
            }
        }
        this.f2889 = -1;
        this.f2894 = -1;
        this.f2890 = -1;
        this.f2892 = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).f2908 != null) {
                this.f2892 = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.f2887;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f2891) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f2909;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f2885 != z3) {
            this.f2885 = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C1096.m2512(this) && m1263()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C2786.m4812(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.f2889 = -1;
        this.f2894 = -1;
        this.f2890 = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1687.m3731(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, C1096.m2517(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        m1260(z, z2, true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f2891 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f2893 = i;
        WeakReference<View> weakReference = this.f2895;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2895 = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f2887;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2887 = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f2887.setState(getDrawableState());
                }
                C2786.m4783(this.f2887, C1096.m2491(this));
                this.f2887.setVisible(getVisibility() == 0, false);
                this.f2887.setCallback(this);
            }
            m1259();
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C1266.m2928(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2341.m4498(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2887;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2887;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1258(int i) {
        this.f2883 = i;
        if (!willNotDraw()) {
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
        List<InterfaceC0387> list = this.f2896;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0387 interfaceC0387 = this.f2896.get(i2);
                if (interfaceC0387 != null) {
                    interfaceC0387.mo1284(this, i);
                }
            }
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m1259() {
        setWillNotDraw(!(this.f2887 != null && getTopInset() > 0));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1260(boolean z, boolean z2, boolean z3) {
        this.f2884 = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams) : new LayoutParams((LinearLayout.LayoutParams) layoutParams);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean m1262(View view) {
        int i;
        if (this.f2895 == null && (i = this.f2893) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f2893);
            }
            if (findViewById != null) {
                this.f2895 = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f2895;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean m1263() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C1096.m2512(childAt)) ? false : true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean m1264(boolean z) {
        if (this.f2897 == z) {
            return false;
        }
        this.f2897 = z;
        refreshDrawableState();
        if (this.f2891 && (getBackground() instanceof C2163)) {
            C2163 c2163 = (C2163) getBackground();
            float dimension = getResources().getDimension(C2324.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f2888;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
            this.f2888 = ofFloat;
            ofFloat.setDuration(getResources().getInteger(C2143.app_bar_elevation_anim_duration));
            this.f2888.setInterpolator(C2294.f9509);
            this.f2888.addUpdateListener(new C2343(this, c2163));
            this.f2888.start();
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
