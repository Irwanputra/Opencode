package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p043.C1067;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p063.p064.C1357;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static final int[] f1100 = {R.attr.colorPrimaryDark};

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public static final int[] f1101 = {R.attr.layout_gravity};

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public static final boolean f1102;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static final boolean f1103;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C1357 f1104;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0161 f1105;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public Drawable f1106;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Paint f1107;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final C0163 f1108;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f1109;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public Drawable f1110;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f1111;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public Drawable f1112;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f1113;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public Drawable f1114;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public Matrix f1115;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f1116;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f1117;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public Rect f1118;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public InterfaceC0165 f1119;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public List<InterfaceC0165> f1120;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f1121;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public Drawable f1122;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public Drawable f1123;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f1124;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f1125;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public float f1126;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public Object f1127;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f1128;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public CharSequence f1129;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f1130;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f1131;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public CharSequence f1132;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f1133;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public float f1134;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final ArrayList<View> f1135;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f1136;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C1357 f1137;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public Drawable f1138;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final C0163 f1139;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f1140;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f1141;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f1142;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1143;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1142 = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1142 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1101);
            this.f1142 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1142 = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1142 = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f1142 = 0;
            this.f1142 = layoutParams.f1142;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0159();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f1144;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f1145;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1146;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1147;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1148;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0159 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f1148 = 0;
            this.f1148 = parcel.readInt();
            this.f1146 = parcel.readInt();
            this.f1147 = parcel.readInt();
            this.f1145 = parcel.readInt();
            this.f1144 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f1148 = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f1148);
            parcel.writeInt(this.f1146);
            parcel.writeInt(this.f1147);
            parcel.writeInt(this.f1145);
            parcel.writeInt(this.f1144);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$〺つふすそ, reason: contains not printable characters */
    public class C0160 extends C1102 {

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Rect f1150 = new Rect();

        public C0160() {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: くし〴〺ぅ */
        public void mo430(View view, AccessibilityEvent accessibilityEvent) {
            this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean mo456(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f5594.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View m437 = DrawerLayout.this.m437();
            if (m437 == null) {
                return true;
            }
            int m438 = DrawerLayout.this.m438(m437);
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            int m4775 = C2786.m4775(m438, C1096.m2491(drawerLayout));
            CharSequence charSequence = m4775 == 3 ? drawerLayout.f1132 : m4775 == 5 ? drawerLayout.f1129 : null;
            if (charSequence == null) {
                return true;
            }
            text.add(charSequence);
            return true;
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean mo457(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1102 || DrawerLayout.m432(view)) {
                return this.f5594.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            if (DrawerLayout.f1102) {
                this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(c1084.f5550);
                this.f5594.onInitializeAccessibilityNodeInfo(view, obtain);
                c1084.f5549 = -1;
                c1084.f5550.setSource(view);
                AtomicInteger atomicInteger = C1096.f5578;
                int i = Build.VERSION.SDK_INT;
                Object parentForAccessibility = i >= 16 ? view.getParentForAccessibility() : view.getParent();
                if (parentForAccessibility instanceof View) {
                    c1084.m2465((View) parentForAccessibility);
                }
                Rect rect = this.f1150;
                obtain.getBoundsInParent(rect);
                c1084.f5550.setBoundsInParent(rect);
                obtain.getBoundsInScreen(rect);
                c1084.f5550.setBoundsInScreen(rect);
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
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (DrawerLayout.m432(childAt)) {
                        c1084.f5550.addChild(childAt);
                    }
                }
            }
            c1084.f5550.setClassName(DrawerLayout.class.getName());
            c1084.f5550.setFocusable(false);
            c1084.f5550.setFocused(false);
            c1084.m2453(C1084.C1087.f5557);
            c1084.m2453(C1084.C1087.f5559);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$くし〴〺ぅ, reason: contains not printable characters */
    public static final class C0161 extends C1102 {
        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            if (DrawerLayout.m432(view)) {
                return;
            }
            c1084.m2465(null);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnApplyWindowInsetsListenerC0162 implements View.OnApplyWindowInsetsListener {
        public ViewOnApplyWindowInsetsListenerC0162(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$づざかべべ, reason: contains not printable characters */
    public class C0163 extends C1357.AbstractC1359 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1357 f1151;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Runnable f1152 = new RunnableC0164();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f1153;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC0164 implements Runnable {
            public RunnableC0164() {
            }

            @Override // java.lang.Runnable
            public void run() {
                View m447;
                int width;
                C0163 c0163 = C0163.this;
                int i = c0163.f1151.f6482;
                boolean z = c0163.f1153 == 3;
                if (z) {
                    m447 = DrawerLayout.this.m447(3);
                    width = (m447 != null ? -m447.getWidth() : 0) + i;
                } else {
                    m447 = DrawerLayout.this.m447(5);
                    width = DrawerLayout.this.getWidth() - i;
                }
                if (m447 != null) {
                    if (((!z || m447.getLeft() >= width) && (z || m447.getLeft() <= width)) || DrawerLayout.this.m455(m447) != 0) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) m447.getLayoutParams();
                    c0163.f1151.m3055(m447, width, m447.getTop());
                    layoutParams.f1141 = true;
                    DrawerLayout.this.invalidate();
                    c0163.m467();
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (drawerLayout.f1131) {
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        drawerLayout.getChildAt(i2).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    drawerLayout.f1131 = true;
                }
            }
        }

        public C0163(int i) {
            this.f1153 = i;
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void mo458(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f1141 = false;
            m467();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int mo459(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void mo460(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1152, 160L);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public void mo461(View view, int i, int i2, int i3, int i4) {
            float width = (DrawerLayout.this.m443(view, 3) ? i + r3 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.m448(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int mo462(View view) {
            if (DrawerLayout.this.m439(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int mo463(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.m443(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void mo464(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View m447 = drawerLayout.m447(i3);
            if (m447 == null || DrawerLayout.this.m455(m447) != 0) {
                return;
            }
            this.f1151.m3060(m447, i2);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public boolean mo465(View view, int i) {
            return DrawerLayout.this.m439(view) && DrawerLayout.this.m443(view, this.f1153) && DrawerLayout.this.m455(view) == 0;
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean mo466(int i) {
            return false;
        }

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public final void m467() {
            View m447 = DrawerLayout.this.m447(this.f1153 == 3 ? 5 : 3);
            if (m447 != null) {
                DrawerLayout.this.m442(m447, true);
            }
        }

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public void m468() {
            DrawerLayout.this.removeCallbacks(this.f1152);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public void mo469(int i) {
            DrawerLayout.this.m436(i, this.f1151.f6493);
        }

        @Override // p034.p063.p064.C1357.AbstractC1359
        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public void mo470(View view, float f, float f2) {
            int i;
            DrawerLayout.this.getClass();
            float f3 = ((LayoutParams) view.getLayoutParams()).f1140;
            int width = view.getWidth();
            if (DrawerLayout.this.m443(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1151.m3052(i, view.getTop());
            DrawerLayout.this.invalidate();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0165 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        void mo471(View view, float f);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        void mo472(View view);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo473(int i);

        /* renamed from: びぐびあび, reason: contains not printable characters */
        void mo474(View view);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1102 = i >= 19;
        f1103 = i >= 21;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1105 = new C0161();
        this.f1124 = -1728053248;
        this.f1107 = new Paint();
        this.f1136 = true;
        this.f1116 = 3;
        this.f1111 = 3;
        this.f1113 = 3;
        this.f1121 = 3;
        this.f1122 = null;
        this.f1138 = null;
        this.f1114 = null;
        this.f1123 = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1133 = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0163 c0163 = new C0163(3);
        this.f1108 = c0163;
        C0163 c01632 = new C0163(5);
        this.f1139 = c01632;
        C1357 m3049 = C1357.m3049(this, 1.0f, c0163);
        this.f1104 = m3049;
        m3049.f6480 = 1;
        m3049.f6495 = f2;
        c0163.f1151 = m3049;
        C1357 m30492 = C1357.m3049(this, 1.0f, c01632);
        this.f1137 = m30492;
        m30492.f6480 = 2;
        m30492.f6495 = f2;
        c01632.f1151 = m30492;
        setFocusableInTouchMode(true);
        C1096.m2505(this, 1);
        C1096.m2490(this, new C0160());
        setMotionEventSplittingEnabled(false);
        if (C1096.m2512(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0162(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1100);
                try {
                    this.f1106 = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1106 = null;
            }
        }
        this.f1117 = f * 10.0f;
        this.f1135 = new ArrayList<>();
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static boolean m432(View view) {
        return (C1096.m2519(view) == 4 || C1096.m2519(view) == 2) ? false : true;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static String m433(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m439(childAt)) {
                this.f1135.add(childAt);
            } else if (m441(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.f1135.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f1135.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f1135.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C1096.m2505(view, (m449() != null || m439(view)) ? 4 : 1);
        if (f1102) {
            return;
        }
        C1096.m2490(view, this.f1105);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f1140);
        }
        this.f1128 = f;
        boolean m3054 = this.f1104.m3054(true);
        boolean m30542 = this.f1137.m3054(true);
        if (m3054 || m30542) {
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1128 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f1118 == null) {
                this.f1118 = new Rect();
            }
            childAt.getHitRect(this.f1118);
            if (this.f1118.contains((int) x, (int) y) && !m450(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f1115 == null) {
                            this.f1115 = new Matrix();
                        }
                        matrix.invert(this.f1115);
                        obtain.transform(this.f1115);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        int height = getHeight();
        boolean m450 = m450(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m450) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && m439(childAt) && childAt.getHeight() >= height) {
                        if (m443(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f1128;
        if (f <= 0.0f || !m450) {
            if (this.f1112 != null && m443(view, 3)) {
                int intrinsicWidth = this.f1112.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.f1104.f6482, 1.0f));
                this.f1112.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1112.setAlpha((int) (max * 255.0f));
                drawable = this.f1112;
            } else if (this.f1110 != null && m443(view, 5)) {
                int intrinsicWidth2 = this.f1110.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f1137.f6482, 1.0f));
                this.f1110.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1110.setAlpha((int) (max2 * 255.0f));
                drawable = this.f1110;
            }
            drawable.draw(canvas);
        } else {
            this.f1107.setColor((this.f1124 & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f1107);
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1103) {
            return this.f1117;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1106;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1136 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1136 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.f1109 || this.f1106 == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.f1127) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f1106.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1106.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054 A[LOOP:1: B:30:0x0024->B:37:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r1 = r8.f1104
            boolean r1 = r1.m3057(r9)
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r2 = r8.f1137
            boolean r2 = r2.m3057(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L6c
            if (r0 == r2) goto L65
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L65
            goto L6a
        L1e:
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r9 = r8.f1104
            float[] r0 = r9.f6494
            int r0 = r0.length
            r4 = 0
        L24:
            if (r4 >= r0) goto L57
            boolean r5 = r9.m3059(r4)
            if (r5 != 0) goto L2d
            goto L4f
        L2d:
            float[] r5 = r9.f6491
            r5 = r5[r4]
            float[] r6 = r9.f6494
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f6478
            r6 = r6[r4]
            float[] r7 = r9.f6488
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.f6477
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 == 0) goto L54
            r9 = 1
            goto L58
        L54:
            int r4 = r4 + 1
            goto L24
        L57:
            r9 = 0
        L58:
            if (r9 == 0) goto L6a
            androidx.drawerlayout.widget.DrawerLayout$づざかべべ r9 = r8.f1108
            r9.m468()
            androidx.drawerlayout.widget.DrawerLayout$づざかべべ r9 = r8.f1139
            r9.m468()
            goto L6a
        L65:
            r8.m452(r2)
            r8.f1131 = r3
        L6a:
            r9 = 0
            goto L94
        L6c:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f1126 = r0
            r8.f1134 = r9
            float r4 = r8.f1128
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L91
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r4 = r8.f1104
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.m3069(r0, r9)
            if (r9 == 0) goto L91
            boolean r9 = r8.m450(r9)
            if (r9 == 0) goto L91
            r9 = 1
            goto L92
        L91:
            r9 = 0
        L92:
            r8.f1131 = r3
        L94:
            if (r1 != 0) goto Lbb
            if (r9 != 0) goto Lbb
            int r9 = r8.getChildCount()
            r0 = 0
        L9d:
            if (r0 >= r9) goto Lb2
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.f1141
            if (r1 == 0) goto Laf
            r9 = 1
            goto Lb3
        Laf:
            int r0 = r0 + 1
            goto L9d
        Lb2:
            r9 = 0
        Lb3:
            if (r9 != 0) goto Lbb
            boolean r9 = r8.f1131
            if (r9 == 0) goto Lba
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m437() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View m437 = m437();
        if (m437 != null && m455(m437) == 0) {
            m452(false);
        }
        return m437 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f1130 = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m450(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (m443(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f1140 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i8 - r11) / f3;
                        i5 = i8 - ((int) (layoutParams.f1140 * f3));
                    }
                    boolean z2 = f != layoutParams.f1140;
                    int i11 = layoutParams.f1142 & 112;
                    if (i11 != 16) {
                        if (i11 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i12 = i4 - i2;
                            measuredHeight = (i12 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i12 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight2) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight2;
                            int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i16 > i13 - i17) {
                                i14 = (i13 - i17) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight2 + i14);
                    }
                    if (z2) {
                        m448(childAt, f);
                    }
                    int i18 = layoutParams.f1140 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        this.f1130 = false;
        this.f1136 = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f1127 != null && C1096.m2512(this);
        int m2491 = C1096.m2491(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int m4775 = C2786.m4775(layoutParams.f1142, m2491);
                    boolean m2512 = C1096.m2512(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (m2512) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1127;
                            if (m4775 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (m4775 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1127;
                        if (m4775 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m4775 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m450(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!m439(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f1103) {
                        float m2522 = C1096.m2522(childAt);
                        float f = this.f1117;
                        if (m2522 != f) {
                            C1096.m2509(childAt, f);
                        }
                    }
                    int m438 = m438(childAt) & 7;
                    boolean z4 = m438 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        StringBuilder m4207 = C2098.m4207("Child drawer has absolute gravity ");
                        m4207.append(m433(m438));
                        m4207.append(" but this ");
                        m4207.append("DrawerLayout");
                        m4207.append(" already has a ");
                        m4207.append("drawer view along that edge");
                        throw new IllegalStateException(m4207.toString());
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1133 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    i4++;
                    i3 = 0;
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View m447;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        int i = savedState.f1148;
        if (i != 0 && (m447 = m447(i)) != null) {
            m444(m447, true);
        }
        int i2 = savedState.f1146;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.f1147;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.f1145;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.f1144;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m445();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f1143;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f1148 = layoutParams.f1142;
                break;
            }
        }
        savedState.f1146 = this.f1116;
        savedState.f1147 = this.f1111;
        savedState.f1145 = this.f1113;
        savedState.f1144 = this.f1121;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (m455(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r0 = r6.f1104
            r0.m3064(r7)
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r0 = r6.f1137
            r0.m3064(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5e
            if (r0 == r2) goto L1e
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6c
        L1a:
            r6.m452(r2)
            goto L6a
        L1e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r3 = r6.f1104
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m3069(r4, r5)
            if (r3 == 0) goto L59
            boolean r3 = r6.m450(r3)
            if (r3 == 0) goto L59
            float r3 = r6.f1126
            float r0 = r0 - r3
            float r3 = r6.f1134
            float r7 = r7 - r3
            づざかべべ.いいにぽつ.げつ〴ぬぐ.づざかべべ r3 = r6.f1104
            int r3 = r3.f6477
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L59
            android.view.View r7 = r6.m449()
            if (r7 == 0) goto L59
            int r7 = r6.m455(r7)
            r0 = 2
            if (r7 != r0) goto L5a
        L59:
            r1 = 1
        L5a:
            r6.m452(r1)
            goto L6c
        L5e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1126 = r0
            r6.f1134 = r7
        L6a:
            r6.f1131 = r1
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m452(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1130) {
            return;
        }
        super.requestLayout();
    }

    public void setChildInsets(Object obj, boolean z) {
        this.f1127 = obj;
        this.f1109 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f1117 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m439(childAt)) {
                C1096.m2509(childAt, this.f1117);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0165 interfaceC0165) {
        List<InterfaceC0165> list;
        InterfaceC0165 interfaceC01652 = this.f1119;
        if (interfaceC01652 != null && (list = this.f1120) != null) {
            list.remove(interfaceC01652);
        }
        if (interfaceC0165 != null) {
            if (this.f1120 == null) {
                this.f1120 = new ArrayList();
            }
            this.f1120.add(interfaceC0165);
        }
        this.f1119 = interfaceC0165;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        View m447;
        int m4775 = C2786.m4775(i2, C1096.m2491(this));
        if (i2 == 3) {
            this.f1116 = i;
        } else if (i2 == 5) {
            this.f1111 = i;
        } else if (i2 == 8388611) {
            this.f1113 = i;
        } else if (i2 == 8388613) {
            this.f1121 = i;
        }
        if (i != 0) {
            (m4775 == 3 ? this.f1104 : this.f1137).m3051();
        }
        if (i != 1) {
            if (i == 2 && (m447 = m447(m4775)) != null) {
                m444(m447, true);
                return;
            }
            return;
        }
        View m4472 = m447(m4775);
        if (m4472 != null) {
            m442(m4472, true);
        }
    }

    public void setDrawerLockMode(int i, View view) {
        if (m439(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f1142);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C1067.m2406(getContext(), i), i2);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (f1103) {
            return;
        }
        if ((i & 8388611) == 8388611) {
            this.f1122 = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.f1138 = drawable;
        } else if ((i & 3) == 3) {
            this.f1114 = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.f1123 = drawable;
        }
        m445();
        invalidate();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int m4775 = C2786.m4775(i, C1096.m2491(this));
        if (m4775 == 3) {
            this.f1132 = charSequence;
        } else if (m4775 == 5) {
            this.f1129 = charSequence;
        }
    }

    public void setScrimColor(int i) {
        this.f1124 = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1106 = i != 0 ? C1067.m2406(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1106 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1106 = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int m434(int i) {
        int m2491 = C1096.m2491(this);
        if (i == 3) {
            int i2 = this.f1116;
            if (i2 != 3) {
                return i2;
            }
            int i3 = m2491 == 0 ? this.f1113 : this.f1121;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.f1111;
            if (i4 != 3) {
                return i4;
            }
            int i5 = m2491 == 0 ? this.f1121 : this.f1113;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.f1113;
            if (i6 != 3) {
                return i6;
            }
            int i7 = m2491 == 0 ? this.f1116 : this.f1111;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.f1121;
        if (i8 != 3) {
            return i8;
        }
        int i9 = m2491 == 0 ? this.f1111 : this.f1116;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m435(int i) {
        View m447 = m447(i);
        if (m447 != null) {
            m442(m447, true);
        } else {
            StringBuilder m4207 = C2098.m4207("No drawer view found with gravity ");
            m4207.append(m433(i));
            throw new IllegalArgumentException(m4207.toString());
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m436(int i, View view) {
        View rootView;
        int i2 = this.f1104.f6484;
        int i3 = this.f1137.f6484;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (i2 != 2 && i3 != 2) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f1140;
            if (f == 0.0f) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.f1143 & 1) == 1) {
                    layoutParams.f1143 = 0;
                    List<InterfaceC0165> list = this.f1120;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            this.f1120.get(size).mo474(view);
                        }
                    }
                    m453(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f1143 & 1) == 0) {
                    layoutParams2.f1143 = 1;
                    List<InterfaceC0165> list2 = this.f1120;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            this.f1120.get(size2).mo472(view);
                        }
                    }
                    m453(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != this.f1125) {
            this.f1125 = i4;
            List<InterfaceC0165> list3 = this.f1120;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    this.f1120.get(size3).mo473(i4);
                }
            }
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public View m437() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m439(childAt) && m440(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int m438(View view) {
        return C2786.m4775(((LayoutParams) view.getLayoutParams()).f1142, C1096.m2491(this));
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean m439(View view) {
        int m4775 = C2786.m4775(((LayoutParams) view.getLayoutParams()).f1142, C1096.m2491(view));
        return ((m4775 & 3) == 0 && (m4775 & 5) == 0) ? false : true;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean m440(View view) {
        if (m439(view)) {
            return ((LayoutParams) view.getLayoutParams()).f1140 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m441(View view) {
        if (m439(view)) {
            return (((LayoutParams) view.getLayoutParams()).f1143 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m442(View view, boolean z) {
        C1357 c1357;
        int width;
        if (!m439(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f1136) {
            layoutParams.f1140 = 0.0f;
            layoutParams.f1143 = 0;
        } else if (z) {
            layoutParams.f1143 |= 4;
            if (m443(view, 3)) {
                c1357 = this.f1104;
                width = -view.getWidth();
            } else {
                c1357 = this.f1137;
                width = getWidth();
            }
            c1357.m3055(view, width, view.getTop());
        } else {
            m451(view, 0.0f);
            int i = layoutParams.f1142;
            m436(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m443(View view, int i) {
        return (m438(view) & i) == i;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m444(View view, boolean z) {
        if (!m439(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f1136) {
            layoutParams.f1140 = 1.0f;
            layoutParams.f1143 = 1;
            m453(view, true);
        } else if (z) {
            layoutParams.f1143 |= 2;
            if (m443(view, 3)) {
                this.f1104.m3055(view, 0, view.getTop());
            } else {
                this.f1137.m3055(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m451(view, 1.0f);
            int i = layoutParams.f1142;
            m436(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m445() {
        Drawable drawable;
        Drawable drawable2;
        if (f1103) {
            return;
        }
        int m2491 = C1096.m2491(this);
        if (m2491 == 0) {
            Drawable drawable3 = this.f1122;
            if (drawable3 != null) {
                m446(drawable3, m2491);
                drawable = this.f1122;
            }
            drawable = this.f1114;
        } else {
            Drawable drawable4 = this.f1138;
            if (drawable4 != null) {
                m446(drawable4, m2491);
                drawable = this.f1138;
            }
            drawable = this.f1114;
        }
        this.f1112 = drawable;
        int m24912 = C1096.m2491(this);
        if (m24912 == 0) {
            Drawable drawable5 = this.f1138;
            if (drawable5 != null) {
                m446(drawable5, m24912);
                drawable2 = this.f1138;
            }
            drawable2 = this.f1123;
        } else {
            Drawable drawable6 = this.f1122;
            if (drawable6 != null) {
                m446(drawable6, m24912);
                drawable2 = this.f1122;
            }
            drawable2 = this.f1123;
        }
        this.f1110 = drawable2;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final boolean m446(Drawable drawable, int i) {
        if (drawable == null || !C2786.m4797(drawable)) {
            return false;
        }
        C2786.m4783(drawable, i);
        return true;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public View m447(int i) {
        int m4775 = C2786.m4775(i, C1096.m2491(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m438(childAt) & 7) == m4775) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void m448(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f1140) {
            return;
        }
        layoutParams.f1140 = f;
        List<InterfaceC0165> list = this.f1120;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f1120.get(size).mo471(view, f);
            }
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public View m449() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f1143 & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean m450(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1142 == 0;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void m451(View view, float f) {
        float f2 = ((LayoutParams) view.getLayoutParams()).f1140;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m443(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m448(view, f);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m452(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m439(childAt) && (!z || layoutParams.f1141)) {
                z2 |= m443(childAt, 3) ? this.f1104.m3055(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1137.m3055(childAt, getWidth(), childAt.getTop());
                layoutParams.f1141 = false;
            }
        }
        this.f1108.m468();
        this.f1139.m468();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final void m453(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1096.m2505(childAt, ((z || m439(childAt)) && !(z && childAt == view)) ? 4 : 1);
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m454(int i) {
        View m447 = m447(i);
        if (m447 != null) {
            return m441(m447);
        }
        return false;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int m455(View view) {
        if (m439(view)) {
            return m434(((LayoutParams) view.getLayoutParams()).f1142);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }
}
