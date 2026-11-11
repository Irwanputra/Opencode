package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p035.p045.p046.InterfaceC1092;
import p034.p063.p064.C1357;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p171.C2156;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2178;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p187.C2299;
import p131.p161.p162.p163.p187.C2300;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static final int f3094 = C2350.Widget_Design_BottomSheet_Modal;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f3095;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f3096;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public int f3097;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f3098;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f3099;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f3100;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public int f3101;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public C1357 f3102;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public boolean f3103;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f3104;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f3105;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f3106;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public WeakReference<V> f3107;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public int f3108;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ValueAnimator f3109;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f3110;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public VelocityTracker f3111;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public Map<View, Integer> f3112;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f3113;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f3114;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f3115;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f3116;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f3117;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public WeakReference<View> f3118;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f3119;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C2180 f3120;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f3121;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f3122;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final C1357.AbstractC1359 f3123;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f3124;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f3125;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f3126;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f3127;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f3128;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f3129;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f3130;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final ArrayList<AbstractC0415> f3131;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public BottomSheetBehavior<V>.RunnableC0414 f3132;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C2163 f3133;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f3134;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f3135;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0410();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f3136;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f3137;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f3138;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f3139;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final int f3140;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0410 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f3140 = parcel.readInt();
            this.f3138 = parcel.readInt();
            this.f3139 = parcel.readInt() == 1;
            this.f3137 = parcel.readInt() == 1;
            this.f3136 = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f3140 = bottomSheetBehavior.f3105;
            this.f3138 = bottomSheetBehavior.f3129;
            this.f3139 = bottomSheetBehavior.f3096;
            this.f3137 = bottomSheetBehavior.f3121;
            this.f3136 = bottomSheetBehavior.f3130;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f3140);
            parcel.writeInt(this.f3138);
            parcel.writeInt(this.f3139 ? 1 : 0);
            parcel.writeInt(this.f3137 ? 1 : 0);
            parcel.writeInt(this.f3136 ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$〺つふすそ, reason: contains not printable characters */
    public class C0411 extends C1357.AbstractC1359 {
        public C0411() {
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: 〺つふすそ */
        public int mo459(View view, int i, int i2) {
            int m1348 = BottomSheetBehavior.this.m1348();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C2786.m4812(i, m1348, bottomSheetBehavior.f3121 ? bottomSheetBehavior.f3134 : bottomSheetBehavior.f3114);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: いいにぽつ */
        public void mo461(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m1355(i2);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: げつ〴ぬぐ */
        public int mo463(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: てぜきぽく */
        public boolean mo465(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f3105;
            if (i2 == 1 || bottomSheetBehavior.f3103) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f3108 == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f3118;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f3107;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int mo1356(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f3121 ? bottomSheetBehavior.f3134 : bottomSheetBehavior.f3114;
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺぁあねじ */
        public void mo469(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f3098) {
                    bottomSheetBehavior.m1344(1);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f3141.f3104) < java.lang.Math.abs(r8.getTop() - r7.f3141.f3116)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            r9 = r7.f3141.f3104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f3141.f3116) < java.lang.Math.abs(r9 - r7.f3141.f3114)) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        
            if (r9 < java.lang.Math.abs(r9 - r10.f3114)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
        
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.f3141.f3114)) goto L42;
         */
        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺふねづ〺 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo470(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C0411.mo470(android.view.View, float, float):void");
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$くし〴〺ぅ, reason: contains not printable characters */
    public class C0412 implements InterfaceC1092 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ int f3143;

        public C0412(int i) {
            this.f3143 = i;
        }

        @Override // p034.p035.p045.p046.InterfaceC1092
        /* renamed from: げつ〴ぬぐ */
        public boolean mo1101(View view, InterfaceC1092.AbstractC1094 abstractC1094) {
            BottomSheetBehavior.this.m1345(this.f3143);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0413 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f3144;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ int f3145;

        public RunnableC0413(View view, int i) {
            this.f3144 = view;
            this.f3145 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m1338(this.f3144, this.f3145);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$づざかべべ, reason: contains not printable characters */
    public class RunnableC0414 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final View f3147;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f3148;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f3150;

        public RunnableC0414(View view, int i) {
            this.f3147 = view;
            this.f3150 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1357 c1357 = BottomSheetBehavior.this.f3102;
            if (c1357 == null || !c1357.m3054(true)) {
                BottomSheetBehavior.this.m1344(this.f3150);
            } else {
                C1096.m2482(this.f3147, this);
            }
            this.f3148 = false;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$びぐびあび, reason: contains not printable characters */
    public static abstract class AbstractC0415 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public abstract void m1357(View view, int i);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract void m1358(View view, float f);
    }

    public BottomSheetBehavior() {
        this.f3113 = 0;
        this.f3096 = true;
        this.f3132 = null;
        this.f3127 = 0.5f;
        this.f3115 = -1.0f;
        this.f3098 = true;
        this.f3105 = 4;
        this.f3131 = new ArrayList<>();
        this.f3123 = new C0411();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i;
        this.f3113 = 0;
        this.f3096 = true;
        this.f3132 = null;
        this.f3127 = 0.5f;
        this.f3115 = -1.0f;
        this.f3098 = true;
        this.f3105 = 4;
        this.f3131 = new ArrayList<>();
        this.f3123 = new C0411();
        this.f3099 = context.getResources().getDimensionPixelSize(C2324.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.BottomSheetBehavior_Layout);
        this.f3095 = obtainStyledAttributes.hasValue(C2243.BottomSheetBehavior_Layout_shapeAppearance);
        int i2 = C2243.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m1347(context, attributeSet, hasValue, C1687.m3662(context, obtainStyledAttributes, i2));
        } else {
            m1347(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3109 = ofFloat;
        ofFloat.setDuration(500L);
        this.f3109.addUpdateListener(new C2300(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3115 = obtainStyledAttributes.getDimension(C2243.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        int i3 = C2243.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            m1354(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            m1354(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(C2243.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.f3121 != z) {
            this.f3121 = z;
            if (!z && this.f3105 == 5) {
                m1345(4);
            }
            m1339();
        }
        this.f3135 = obtainStyledAttributes.getBoolean(C2243.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C2243.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f3096 != z2) {
            this.f3096 = z2;
            if (this.f3107 != null) {
                m1351();
            }
            m1344((this.f3096 && this.f3105 == 6) ? 3 : this.f3105);
            m1339();
        }
        this.f3130 = obtainStyledAttributes.getBoolean(C2243.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f3098 = obtainStyledAttributes.getBoolean(C2243.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f3113 = obtainStyledAttributes.getInt(C2243.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = obtainStyledAttributes.getFloat(C2243.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f3127 = f;
        if (this.f3107 != null) {
            this.f3116 = (int) ((1.0f - f) * this.f3134);
        }
        int i4 = C2243.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i4);
        if (peekValue2 == null || peekValue2.type != 16) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i4, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            dimensionPixelOffset = peekValue2.data;
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f3104 = dimensionPixelOffset;
        obtainStyledAttributes.recycle();
        this.f3110 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public void m1338(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f3114;
        } else if (i == 6) {
            i2 = this.f3116;
            if (this.f3096 && i2 <= (i3 = this.f3106)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = m1348();
        } else {
            if (!this.f3121 || i != 5) {
                throw new IllegalArgumentException(C2098.m4208("Illegal state argument: ", i));
            }
            i2 = this.f3134;
        }
        m1352(view, i, i2, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: 〻ぞまぎな〻 */
    public boolean mo345(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f3125 = 0;
        this.f3122 = false;
        return (i & 2) != 0;
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final void m1339() {
        V v;
        int i;
        C1084.C1087 c1087;
        WeakReference<V> weakReference = this.f3107;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C1096.m2521(v, 524288);
        C1096.m2521(v, 262144);
        C1096.m2521(v, 1048576);
        if (this.f3121 && this.f3105 != 5) {
            m1353(v, C1084.C1087.f5558, 5);
        }
        int i2 = this.f3105;
        if (i2 == 3) {
            i = this.f3096 ? 4 : 6;
            c1087 = C1084.C1087.f5563;
        } else {
            if (i2 != 4) {
                if (i2 != 6) {
                    return;
                }
                m1353(v, C1084.C1087.f5563, 4);
                m1353(v, C1084.C1087.f5555, 3);
                return;
            }
            i = this.f3096 ? 3 : 6;
            c1087 = C1084.C1087.f5555;
        }
        m1353(v, c1087, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: いいにぽつ */
    public boolean mo347(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1357 c1357;
        if (!v.isShown() || !this.f3098) {
            this.f3128 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3108 = -1;
            VelocityTracker velocityTracker = this.f3111;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3111 = null;
            }
        }
        if (this.f3111 == null) {
            this.f3111 = VelocityTracker.obtain();
        }
        this.f3111.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f3097 = (int) motionEvent.getY();
            if (this.f3105 != 2) {
                WeakReference<View> weakReference = this.f3118;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m333(view, x, this.f3097)) {
                    this.f3108 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3103 = true;
                }
            }
            this.f3128 = this.f3108 == -1 && !coordinatorLayout.m333(v, x, this.f3097);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3103 = false;
            this.f3108 = -1;
            if (this.f3128) {
                this.f3128 = false;
                return false;
            }
        }
        if (!this.f3128 && (c1357 = this.f3102) != null && c1357.m3057(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f3118;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f3128 || this.f3105 == 1 || coordinatorLayout.m333(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f3102 == null || Math.abs(((float) this.f3097) - motionEvent.getY()) <= ((float) this.f3102.f6477)) ? false : true;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final int m1340() {
        int i;
        return this.f3119 ? Math.min(Math.max(this.f3124, this.f3134 - ((this.f3117 * 9) / 16)), this.f3101) : (this.f3135 || (i = this.f3100) <= 0) ? this.f3129 : Math.max(this.f3129, i + this.f3099);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r2 > r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        r2 = r1.f3104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f3106) < java.lang.Math.abs(r2 - r1.f3114)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        if (r2 < java.lang.Math.abs(r2 - r1.f3114)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.f3114)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f3116) < java.lang.Math.abs(r2 - r1.f3114)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぇ〳〲〺すっ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo348(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.m1348()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.m1344(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.f3118
            if (r2 == 0) goto Lbe
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lbe
            boolean r2 = r1.f3122
            if (r2 != 0) goto L1f
            goto Lbe
        L1f:
            int r2 = r1.f3125
            if (r2 <= 0) goto L32
            boolean r2 = r1.f3096
            if (r2 == 0) goto L28
            goto L72
        L28:
            int r2 = r3.getTop()
            int r4 = r1.f3116
            if (r2 <= r4) goto L83
            goto Lb2
        L32:
            boolean r2 = r1.f3121
            if (r2 == 0) goto L55
            android.view.VelocityTracker r2 = r1.f3111
            if (r2 != 0) goto L3c
            r2 = 0
            goto L4b
        L3c:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f3110
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.f3111
            int r4 = r1.f3108
            float r2 = r2.getYVelocity(r4)
        L4b:
            boolean r2 = r1.m1346(r3, r2)
            if (r2 == 0) goto L55
            int r2 = r1.f3134
            r0 = 5
            goto Lb8
        L55:
            int r2 = r1.f3125
            if (r2 != 0) goto L96
            int r2 = r3.getTop()
            boolean r4 = r1.f3096
            if (r4 == 0) goto L75
            int r4 = r1.f3106
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f3114
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lb5
        L72:
            int r2 = r1.f3106
            goto Lb8
        L75:
            int r4 = r1.f3116
            if (r2 >= r4) goto L86
            int r4 = r1.f3114
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lb0
        L83:
            int r2 = r1.f3104
            goto Lb8
        L86:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f3114
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lb5
            goto Lb0
        L96:
            boolean r2 = r1.f3096
            if (r2 == 0) goto L9b
            goto Lb5
        L9b:
            int r2 = r3.getTop()
            int r4 = r1.f3116
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f3114
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lb5
        Lb0:
            int r4 = r1.f3116
        Lb2:
            r0 = 6
            r2 = r4
            goto Lb8
        Lb5:
            int r2 = r1.f3114
            r0 = 4
        Lb8:
            r4 = 0
            r1.m1352(r3, r0, r2, r4)
            r1.f3122 = r4
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo348(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final void m1341(int i) {
        V v = this.f3107.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C1096.m2507(v)) {
            v.post(new RunnableC0413(v, i));
        } else {
            m1338(v, i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぇぬぎばつ */
    public void mo349(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f3118;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m1348()) {
                iArr[1] = top - m1348();
                C1096.m2515(v, -iArr[1]);
                i4 = 3;
                m1344(i4);
            } else {
                if (!this.f3098) {
                    return;
                }
                iArr[1] = i2;
                C1096.m2515(v, -i2);
                m1344(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f3114;
            if (i5 > i6 && !this.f3121) {
                iArr[1] = top - i6;
                C1096.m2515(v, -iArr[1]);
                i4 = 4;
                m1344(i4);
            } else {
                if (!this.f3098) {
                    return;
                }
                iArr[1] = i2;
                C1096.m2515(v, -i2);
                m1344(1);
            }
        }
        m1355(v.getTop());
        this.f3125 = i2;
        this.f3122 = true;
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public final void m1342(boolean z) {
        V v;
        if (this.f3107 != null) {
            m1351();
            if (this.f3105 != 4 || (v = this.f3107.get()) == null) {
                return;
            }
            if (z) {
                m1341(this.f3105);
            } else {
                v.requestLayout();
            }
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public View m1343(View view) {
        if (C1096.m2478(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View m1343 = m1343(viewGroup.getChildAt(i));
            if (m1343 != null) {
                return m1343;
            }
        }
        return null;
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public void m1344(int i) {
        V v;
        if (this.f3105 == i) {
            return;
        }
        this.f3105 = i;
        WeakReference<V> weakReference = this.f3107;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m1349(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m1349(false);
        }
        m1350(i);
        for (int i2 = 0; i2 < this.f3131.size(); i2++) {
            this.f3131.get(i2).m1357(v, i);
        }
        m1339();
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public void m1345(int i) {
        if (i == this.f3105) {
            return;
        }
        if (this.f3107 != null) {
            m1341(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.f3121 && i == 5)) {
            this.f3105 = i;
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public boolean m1346(View view, float f) {
        if (this.f3130) {
            return true;
        }
        if (view.getTop() < this.f3114) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f3114)) / ((float) m1340()) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ざっざへづ */
    public void mo356(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f3113;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f3129 = savedState.f3138;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f3096 = savedState.f3139;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f3121 = savedState.f3137;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f3130 = savedState.f3136;
            }
        }
        int i2 = savedState.f3140;
        if (i2 == 1 || i2 == 2) {
            this.f3105 = 4;
        } else {
            this.f3105 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ざとぅぼこ〺 */
    public void mo357(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m1347(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f3095) {
            this.f3120 = C2180.m4283(context, attributeSet, C2111.bottomSheetStyle, f3094, new C2178(0)).m4291();
            C2163 c2163 = new C2163(this.f3120);
            this.f3133 = c2163;
            c2163.f9045.f9067 = new C2156(context);
            c2163.m4269();
            if (z && colorStateList != null) {
                this.f3133.m4252(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f3133.setTint(typedValue.data);
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int m1348() {
        return this.f3096 ? this.f3106 : this.f3104;
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public final void m1349(boolean z) {
        WeakReference<V> weakReference = this.f3107;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f3112 != null) {
                    return;
                } else {
                    this.f3112 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f3107.get() && z && Build.VERSION.SDK_INT >= 16) {
                    this.f3112.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f3112 = null;
        }
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public final void m1350(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f3126 != z) {
            this.f3126 = z;
            if (this.f3133 == null || (valueAnimator = this.f3109) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f3109.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f3109.setFloatValues(1.0f - f, f);
            this.f3109.start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: でどあくず */
    public Parcelable mo360(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final void m1351() {
        int m1340 = m1340();
        if (this.f3096) {
            this.f3114 = Math.max(this.f3134 - m1340, this.f3106);
        } else {
            this.f3114 = this.f3134 - m1340;
        }
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public void m1352(View view, int i, int i2, boolean z) {
        C1357 c1357 = this.f3102;
        if (!(c1357 != null && (!z ? !c1357.m3055(view, view.getLeft(), i2) : !c1357.m3052(view.getLeft(), i2)))) {
            m1344(i);
            return;
        }
        m1344(2);
        m1350(i);
        if (this.f3132 == null) {
            this.f3132 = new RunnableC0414(view, i);
        }
        BottomSheetBehavior<V>.RunnableC0414 runnableC0414 = this.f3132;
        boolean z2 = runnableC0414.f3148;
        runnableC0414.f3150 = i;
        if (z2) {
            return;
        }
        C1096.m2482(view, runnableC0414);
        this.f3132.f3148 = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: なぎぱいぢぎ */
    public void mo361(CoordinatorLayout.C0133 c0133) {
        this.f3107 = null;
        this.f3102 = null;
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m1353(V v, C1084.C1087 c1087, int i) {
        C1096.m2502(v, c1087, null, new C0412(i));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: びえぁぜい */
    public boolean mo364(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3105 == 1 && actionMasked == 0) {
            return true;
        }
        C1357 c1357 = this.f3102;
        if (c1357 != null) {
            c1357.m3064(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3108 = -1;
            VelocityTracker velocityTracker = this.f3111;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3111 = null;
            }
        }
        if (this.f3111 == null) {
            this.f3111 = VelocityTracker.obtain();
        }
        this.f3111.addMovement(motionEvent);
        if (this.f3102 != null && actionMasked == 2 && !this.f3128) {
            float abs = Math.abs(this.f3097 - motionEvent.getY());
            C1357 c13572 = this.f3102;
            if (abs > c13572.f6477) {
                c13572.m3060(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3128;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public void m1354(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.f3119) {
                this.f3119 = true;
            }
            z = false;
        } else {
            if (this.f3119 || this.f3129 != i) {
                this.f3119 = false;
                this.f3129 = Math.max(0, i);
            }
            z = false;
        }
        if (z) {
            m1342(false);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: へぬ〴づぞ */
    public boolean mo367(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f3118;
        return (weakReference == null || view != weakReference.get() || this.f3105 == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぺぁあねじ */
    public void mo368() {
        this.f3107 = null;
        this.f3102 = null;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m1355(int i) {
        float f;
        float f2;
        V v = this.f3107.get();
        if (v == null || this.f3131.isEmpty()) {
            return;
        }
        int i2 = this.f3114;
        if (i > i2 || i2 == m1348()) {
            int i3 = this.f3114;
            f = i3 - i;
            f2 = this.f3134 - i3;
        } else {
            int i4 = this.f3114;
            f = i4 - i;
            f2 = i4 - m1348();
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.f3131.size(); i5++) {
            this.f3131.get(i5).m1358(v, f3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぺふねづ〺 */
    public boolean mo369(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C2163 c2163;
        if (C1096.m2512(coordinatorLayout) && !C1096.m2512(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f3107 == null) {
            this.f3124 = coordinatorLayout.getResources().getDimensionPixelSize(C2324.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && !this.f3135 && !this.f3119) {
                C1687.m3682(v, new C2299(this));
            }
            this.f3107 = new WeakReference<>(v);
            if (this.f3095 && (c2163 = this.f3133) != null) {
                if (i3 >= 16) {
                    v.setBackground(c2163);
                } else {
                    v.setBackgroundDrawable(c2163);
                }
            }
            C2163 c21632 = this.f3133;
            if (c21632 != null) {
                float f = this.f3115;
                if (f == -1.0f) {
                    f = C1096.m2522(v);
                }
                c21632.m4263(f);
                boolean z = this.f3105 == 3;
                this.f3126 = z;
                this.f3133.m4253(z ? 0.0f : 1.0f);
            }
            m1339();
            if (C1096.m2519(v) == 0) {
                C1096.m2505(v, 1);
            }
        }
        if (this.f3102 == null) {
            this.f3102 = new C1357(coordinatorLayout.getContext(), coordinatorLayout, this.f3123);
        }
        int top = v.getTop();
        coordinatorLayout.m340(v, i);
        this.f3117 = coordinatorLayout.getWidth();
        this.f3134 = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f3101 = height;
        this.f3106 = Math.max(0, this.f3134 - height);
        this.f3116 = (int) ((1.0f - this.f3127) * this.f3134);
        m1351();
        int i4 = this.f3105;
        if (i4 == 3) {
            i2 = m1348();
        } else if (i4 == 6) {
            i2 = this.f3116;
        } else if (this.f3121 && i4 == 5) {
            i2 = this.f3134;
        } else {
            if (i4 != 4) {
                if (i4 == 1 || i4 == 2) {
                    C1096.m2515(v, top - v.getTop());
                }
                this.f3118 = new WeakReference<>(m1343(v));
                return true;
            }
            i2 = this.f3114;
        }
        C1096.m2515(v, i2);
        this.f3118 = new WeakReference<>(m1343(v));
        return true;
    }
}
