package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p042.C1053;
import p034.p035.p042.C1055;
import p034.p035.p043.C1067;
import p034.p035.p045.C1072;
import p034.p035.p045.C1082;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1068;
import p034.p035.p045.InterfaceC1081;
import p034.p035.p045.InterfaceC1121;
import p034.p061.C1346;
import p034.p061.C1347;
import p034.p061.C1348;
import p034.p061.p062.C1349;
import p034.p061.p062.C1350;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1081, InterfaceC1068 {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> f959;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final C1053<Rect> f960;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static final Comparator<View> f961;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final String f962;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final Class<?>[] f963;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int[] f964;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<View> f965;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int[] f966;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f967;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public C1072 f968;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f969;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f970;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1350<View> f971;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public InterfaceC1121 f972;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final C1082 f973;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Drawable f974;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<View> f975;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public View f976;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Paint f977;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public View f978;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f979;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final List<View> f980;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC0134 f981;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f982;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int[] f983;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void mo343(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int m344() {
            return -16777216;
        }

        /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
        public boolean mo345(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return m366();
            }
            return false;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean mo346(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean mo347(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
        public void mo348(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m350();
            }
        }

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public void mo349(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m352();
            }
        }

        @Deprecated
        /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
        public void m350() {
        }

        @Deprecated
        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public void m351() {
        }

        @Deprecated
        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public void m352() {
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float m353() {
            return 0.0f;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean mo354(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public boolean mo355(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public void mo356(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public void mo357(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                m351();
            }
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C1072 m358(C1072 c1072) {
            return c1072;
        }

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public boolean mo359(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: でどあくず, reason: contains not printable characters */
        public Parcelable mo360(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void mo361(C0133 c0133) {
        }

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean m362() {
            return false;
        }

        @Deprecated
        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public void m363() {
        }

        /* renamed from: びえぁぜい, reason: contains not printable characters */
        public boolean mo364(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean mo365(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
        public boolean m366() {
            return false;
        }

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean mo367(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public void mo368() {
        }

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean mo369(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0128();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public SparseArray<Parcelable> f984;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0128 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f984 = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f984.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            SparseArray<Parcelable> sparseArray = this.f984;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f984.keyAt(i2);
                parcelableArr[i2] = this.f984.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0129 {
        Behavior getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C0130 implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            View view3 = view;
            View view4 = view2;
            AtomicInteger atomicInteger = C1096.f5578;
            int i = Build.VERSION.SDK_INT;
            float z = i >= 21 ? view3.getZ() : 0.0f;
            float z2 = i >= 21 ? view4.getZ() : 0.0f;
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$くし〴〺ぅ, reason: contains not printable characters */
    public @interface InterfaceC0131 {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0132 implements InterfaceC1121 {
        public C0132() {
        }

        @Override // p034.p035.p045.InterfaceC1121
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1072 mo370(View view, C1072 c1072) {
            Behavior behavior;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!C2786.m4781(coordinatorLayout.f968, c1072)) {
                coordinatorLayout.f968 = c1072;
                boolean z = c1072.m2424() > 0;
                coordinatorLayout.f969 = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!c1072.m2419()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        if (C1096.m2512(childAt) && (behavior = ((C0133) childAt.getLayoutParams()).f994) != null) {
                            c1072 = behavior.m358(c1072);
                            if (c1072.m2419()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c1072;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$づざかべべ, reason: contains not printable characters */
    public static class C0133 extends ViewGroup.MarginLayoutParams {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f986;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f987;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f988;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f989;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public boolean f990;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public final Rect f991;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public boolean f992;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f993;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Behavior f994;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f995;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public View f996;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f997;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean f998;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f999;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean f1000;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f1001;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public View f1002;

        public C0133(int i, int i2) {
            super(i, i2);
            this.f987 = false;
            this.f993 = 0;
            this.f999 = 0;
            this.f995 = -1;
            this.f997 = -1;
            this.f988 = 0;
            this.f986 = 0;
            this.f991 = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0133(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Behavior newInstance;
            this.f987 = false;
            this.f993 = 0;
            this.f999 = 0;
            this.f995 = -1;
            this.f997 = -1;
            this.f988 = 0;
            this.f986 = 0;
            this.f991 = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1347.CoordinatorLayout_Layout);
            this.f993 = obtainStyledAttributes.getInteger(C1347.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f997 = obtainStyledAttributes.getResourceId(C1347.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f999 = obtainStyledAttributes.getInteger(C1347.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f995 = obtainStyledAttributes.getInteger(C1347.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f988 = obtainStyledAttributes.getInt(C1347.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f986 = obtainStyledAttributes.getInt(C1347.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = C1347.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f987 = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(i);
                String str = CoordinatorLayout.f962;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f962;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.f959;
                        Map<String, Constructor<Behavior>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<Behavior> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f963);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(C2098.m4205("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f994 = newInstance;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f994;
            if (behavior != null) {
                behavior.mo361(this);
            }
        }

        public C0133(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f987 = false;
            this.f993 = 0;
            this.f999 = 0;
            this.f995 = -1;
            this.f997 = -1;
            this.f988 = 0;
            this.f986 = 0;
            this.f991 = new Rect();
        }

        public C0133(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f987 = false;
            this.f993 = 0;
            this.f999 = 0;
            this.f995 = -1;
            this.f997 = -1;
            this.f988 = 0;
            this.f986 = 0;
            this.f991 = new Rect();
        }

        public C0133(C0133 c0133) {
            super((ViewGroup.MarginLayoutParams) c0133);
            this.f987 = false;
            this.f993 = 0;
            this.f999 = 0;
            this.f995 = -1;
            this.f997 = -1;
            this.f988 = 0;
            this.f986 = 0;
            this.f991 = new Rect();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m371(int i, boolean z) {
            if (i == 0) {
                this.f1000 = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f992 = z;
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m372(int i) {
            if (i == 0) {
                return this.f1000;
            }
            if (i != 1) {
                return false;
            }
            return this.f992;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$なぎぱいぢぎ, reason: contains not printable characters */
    public class ViewTreeObserverOnPreDrawListenerC0134 implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0134() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m335(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$びぐびあび, reason: contains not printable characters */
    public class ViewGroupOnHierarchyChangeListenerC0135 implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0135() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f979;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m335(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f979;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f962 = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f961 = new C0130();
        } else {
            f961 = null;
        }
        f963 = new Class[]{Context.class, AttributeSet.class};
        f959 = new ThreadLocal<>();
        f960 = new C1055(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1348.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f965 = new ArrayList();
        this.f971 = new C1350<>();
        this.f980 = new ArrayList();
        this.f975 = new ArrayList();
        this.f966 = new int[2];
        this.f964 = new int[2];
        this.f973 = new C1082();
        int[] iArr = C1347.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C1346.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = C1347.CoordinatorLayout;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C1346.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C1347.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f983 = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f983.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f983[i2] = (int) (r12[i2] * f);
            }
        }
        this.f974 = obtainStyledAttributes.getDrawable(C1347.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m326();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0135());
        if (C1096.m2519(this) == 0) {
            C1096.m2505(this, 1);
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Rect m323() {
        Rect mo2386 = f960.mo2386();
        return mo2386 == null ? new Rect() : mo2386;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0133) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0133 c0133 = (C0133) view.getLayoutParams();
        Behavior behavior = c0133.f994;
        if (behavior != null) {
            float m353 = behavior.m353();
            if (m353 > 0.0f) {
                if (this.f977 == null) {
                    this.f977 = new Paint();
                }
                this.f977.setColor(c0133.f994.m344());
                Paint paint = this.f977;
                int round = Math.round(m353 * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = Base64.BASELENGTH;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f977);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f974;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0133(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0133(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m327();
        return Collections.unmodifiableList(this.f965);
    }

    public final C1072 getLastWindowInsets() {
        return this.f968;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f973.m2443();
    }

    public Drawable getStatusBarBackground() {
        return this.f974;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m339(false);
        if (this.f970) {
            if (this.f981 == null) {
                this.f981 = new ViewTreeObserverOnPreDrawListenerC0134();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f981);
        }
        if (this.f968 == null && C1096.m2512(this)) {
            C1096.m2518(this);
        }
        this.f967 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m339(false);
        if (this.f970 && this.f981 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f981);
        }
        View view = this.f978;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f967 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f969 || this.f974 == null) {
            return;
        }
        C1072 c1072 = this.f968;
        int m2424 = c1072 != null ? c1072.m2424() : 0;
        if (m2424 > 0) {
            this.f974.setBounds(0, 0, getWidth(), m2424);
            this.f974.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m339(true);
        }
        boolean m329 = m329(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m339(true);
        }
        return m329;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int m2491 = C1096.m2491(this);
        int size = this.f965.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f965.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((C0133) view.getLayoutParams()).f994) == null || !behavior.mo369(this, view, m2491))) {
                m340(view, m2491);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        if (r0.mo359(r30, r20, r8, r21, r23, 0) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0133 c0133 = (C0133) childAt.getLayoutParams();
                if (c0133.m372(0) && (behavior = c0133.f994) != null) {
                    z2 |= behavior.m362();
                }
            }
        }
        if (z2) {
            m335(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0133 c0133 = (C0133) childAt.getLayoutParams();
                if (c0133.m372(0) && (behavior = c0133.f994) != null) {
                    z |= behavior.mo367(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo100(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo116(view, i, i2, i3, i4, 0, this.f964);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo111(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        SparseArray<Parcelable> sparseArray = savedState.f984;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = m332(childAt).f994;
            if (id != -1 && behavior != null && (parcelable2 = sparseArray.get(id)) != null) {
                behavior.mo356(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable mo360;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C0133) childAt.getLayoutParams()).f994;
            if (id != -1 && behavior != null && (mo360 = behavior.mo360(this, childAt)) != null) {
                sparseArray.append(id, mo360);
            }
        }
        savedState.f984 = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo112(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onStopNestedScroll(View view) {
        mo102(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f976
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m329(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f976
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$づざかべべ r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0133) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f994
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f976
            boolean r6 = r6.mo364(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.f976
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m339(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C0133) view.getLayoutParams()).f994;
        if (behavior == null || !behavior.mo355(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f982) {
            return;
        }
        m339(false);
        this.f982 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m326();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f979 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f974;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f974 = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f974.setState(getDrawableState());
                }
                C2786.m4783(this.f974, C1096.m2491(this));
                this.f974.setVisible(getVisibility() == 0, false);
                this.f974.setCallback(this);
            }
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C1067.m2406(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f974;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f974.setVisible(z, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f974;
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: 〳ぜぞぜべっ */
    public void mo100(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0133 c0133 = (C0133) childAt.getLayoutParams();
                if (c0133.m372(i3) && (behavior = c0133.f994) != null) {
                    int[] iArr2 = this.f966;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.mo349(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f966;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f966;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m335(1);
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m324(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: ぁごぐすすぃ */
    public void mo102(View view, int i) {
        C1082 c1082 = this.f973;
        if (i == 1) {
            c1082.f5545 = 0;
        } else {
            c1082.f5546 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0133 c0133 = (C0133) childAt.getLayoutParams();
            if (c0133.m372(i)) {
                Behavior behavior = c0133.f994;
                if (behavior != null) {
                    behavior.mo348(this, childAt, view, i);
                }
                c0133.m371(i, false);
                c0133.f990 = false;
            }
        }
        this.f978 = null;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m325(View view) {
        ArrayList<View> orDefault = this.f971.f6457.getOrDefault(view, null);
        if (orDefault == null || orDefault.isEmpty()) {
            return;
        }
        for (int i = 0; i < orDefault.size(); i++) {
            View view2 = orDefault.get(i);
            Behavior behavior = ((C0133) view2.getLayoutParams()).f994;
            if (behavior != null) {
                behavior.mo346(this, view2, view);
            }
        }
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final void m326() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!C1096.m2512(this)) {
            C1096.m2503(this, null);
            return;
        }
        if (this.f972 == null) {
            this.f972 = new C0132();
        }
        C1096.m2503(this, this.f972);
        setSystemUiVisibility(1280);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0073, code lost:
    
        if (r5 != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160 A[SYNTHETIC] */
    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m327() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m327():void");
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public List<View> m328(View view) {
        ArrayList<View> orDefault = this.f971.f6457.getOrDefault(view, null);
        this.f975.clear();
        if (orDefault != null) {
            this.f975.addAll(orDefault);
        }
        return this.f975;
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final boolean m329(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f980;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f961;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0133 c0133 = (C0133) view.getLayoutParams();
            Behavior behavior = c0133.f994;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && behavior != null) {
                    if (i == 0) {
                        z2 = behavior.mo347(this, view, motionEvent);
                    } else if (i == 1) {
                        z2 = behavior.mo364(this, view, motionEvent);
                    }
                    if (z2) {
                        this.f976 = view;
                    }
                }
                Behavior behavior2 = c0133.f994;
                if (behavior2 == null) {
                    c0133.f998 = false;
                }
                boolean z4 = c0133.f998;
                if (z4) {
                    z = true;
                } else {
                    z = (behavior2 != null && behavior2.m353() > 0.0f) | z4;
                    c0133.f998 = z;
                }
                boolean z5 = z && !z4;
                if (z && !z5) {
                    break;
                }
                z3 = z5;
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behavior.mo347(this, view, motionEvent2);
                } else if (i == 1) {
                    behavior.mo364(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m330(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C1349.f6456;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C1349.f6456;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C1349.m3034(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C1349.f6455;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public List<View> m331(View view) {
        C1350<View> c1350 = this.f971;
        int i = c1350.f6457.f6910;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> m3255 = c1350.f6457.m3255(i2);
            if (m3255 != null && m3255.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1350.f6457.m3246(i2));
            }
        }
        this.f975.clear();
        if (arrayList != null) {
            this.f975.addAll(arrayList);
        }
        return this.f975;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public C0133 m332(View view) {
        C0133 c0133 = (C0133) view.getLayoutParams();
        if (!c0133.f987) {
            if (view instanceof InterfaceC0129) {
                Behavior behavior = ((InterfaceC0129) view).getBehavior();
                Behavior behavior2 = c0133.f994;
                if (behavior2 != behavior) {
                    if (behavior2 != null) {
                        behavior2.mo368();
                    }
                    c0133.f994 = behavior;
                    c0133.f987 = true;
                    if (behavior != null) {
                        behavior.mo361(c0133);
                    }
                }
            } else {
                InterfaceC0131 interfaceC0131 = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0131 = (InterfaceC0131) cls.getAnnotation(InterfaceC0131.class);
                    if (interfaceC0131 != null) {
                        break;
                    }
                }
                if (interfaceC0131 != null) {
                    try {
                        Behavior newInstance = interfaceC0131.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        Behavior behavior3 = c0133.f994;
                        if (behavior3 != newInstance) {
                            if (behavior3 != null) {
                                behavior3.mo368();
                            }
                            c0133.f994 = newInstance;
                            c0133.f987 = true;
                            if (newInstance != null) {
                                newInstance.mo361(c0133);
                            }
                        }
                    } catch (Exception unused) {
                        interfaceC0131.value().getName();
                    }
                }
            }
            c0133.f987 = true;
        }
        return c0133;
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean m333(View view, int i, int i2) {
        Rect m323 = m323();
        m330(view, m323);
        try {
            return m323.contains(i, i2);
        } finally {
            m323.setEmpty();
            f960.mo2385(m323);
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final void m334(int i, Rect rect, Rect rect2, C0133 c0133, int i2, int i3) {
        int i4 = c0133.f993;
        if (i4 == 0) {
            i4 = 17;
        }
        int m4775 = C2786.m4775(i4, i);
        int i5 = c0133.f999;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int m47752 = C2786.m4775(i5, i);
        int i6 = m4775 & 7;
        int i7 = m4775 & 112;
        int i8 = m47752 & 7;
        int i9 = m47752 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: てぜきぽく */
    public void mo110(View view, int i, int i2, int i3, int i4, int i5) {
        mo116(view, i, i2, i3, i4, 0, this.f964);
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final void m335(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        C0133 c0133;
        Behavior behavior;
        int m2491 = C1096.m2491(this);
        int size = this.f965.size();
        Rect m323 = m323();
        Rect m3232 = m323();
        Rect m3233 = m323();
        int i13 = 0;
        while (i13 < size) {
            View view = this.f965.get(i13);
            C0133 c01332 = (C0133) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = m3233;
                i2 = i13;
            } else {
                int i14 = 0;
                while (i14 < i13) {
                    if (c01332.f996 == this.f965.get(i14)) {
                        C0133 c01333 = (C0133) view.getLayoutParams();
                        if (c01333.f1002 != null) {
                            Rect m3234 = m323();
                            Rect m3235 = m323();
                            Rect m3236 = m323();
                            m330(c01333.f1002, m3234);
                            m341(view, false, m3235);
                            int measuredWidth = view.getMeasuredWidth();
                            i11 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i12 = i13;
                            i10 = i14;
                            rect2 = m3233;
                            c0133 = c01332;
                            m334(m2491, m3234, m3236, c01333, measuredWidth, measuredHeight);
                            boolean z4 = (m3236.left == m3235.left && m3236.top == m3235.top) ? false : true;
                            m342(c01333, m3236, measuredWidth, measuredHeight);
                            int i15 = m3236.left - m3235.left;
                            int i16 = m3236.top - m3235.top;
                            if (i15 != 0) {
                                C1096.m2483(view, i15);
                            }
                            if (i16 != 0) {
                                C1096.m2515(view, i16);
                            }
                            if (z4 && (behavior = c01333.f994) != null) {
                                behavior.mo346(this, view, c01333.f1002);
                            }
                            m3234.setEmpty();
                            C1053<Rect> c1053 = f960;
                            c1053.mo2385(m3234);
                            m3235.setEmpty();
                            c1053.mo2385(m3235);
                            m3236.setEmpty();
                            c1053.mo2385(m3236);
                            i14 = i10 + 1;
                            c01332 = c0133;
                            size = i11;
                            i13 = i12;
                            m3233 = rect2;
                        }
                    }
                    i10 = i14;
                    i11 = size;
                    rect2 = m3233;
                    i12 = i13;
                    c0133 = c01332;
                    i14 = i10 + 1;
                    c01332 = c0133;
                    size = i11;
                    i13 = i12;
                    m3233 = rect2;
                }
                int i17 = size;
                Rect rect3 = m3233;
                i2 = i13;
                C0133 c01334 = c01332;
                m341(view, true, m3232);
                if (c01334.f988 != 0 && !m3232.isEmpty()) {
                    int m4775 = C2786.m4775(c01334.f988, m2491);
                    int i18 = m4775 & 112;
                    if (i18 == 48) {
                        m323.top = Math.max(m323.top, m3232.bottom);
                    } else if (i18 == 80) {
                        m323.bottom = Math.max(m323.bottom, getHeight() - m3232.top);
                    }
                    int i19 = m4775 & 7;
                    if (i19 == 3) {
                        m323.left = Math.max(m323.left, m3232.right);
                    } else if (i19 == 5) {
                        m323.right = Math.max(m323.right, getWidth() - m3232.left);
                    }
                }
                if (c01334.f986 != 0 && view.getVisibility() == 0 && C1096.m2517(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0133 c01335 = (C0133) view.getLayoutParams();
                    Behavior behavior2 = c01335.f994;
                    Rect m3237 = m323();
                    Rect m3238 = m323();
                    m3238.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (behavior2 == null || !behavior2.mo354(this, view, m3237)) {
                        m3237.set(m3238);
                    } else if (!m3238.contains(m3237)) {
                        StringBuilder m4207 = C2098.m4207("Rect should be within the child's bounds. Rect:");
                        m4207.append(m3237.toShortString());
                        m4207.append(" | Bounds:");
                        m4207.append(m3238.toShortString());
                        throw new IllegalArgumentException(m4207.toString());
                    }
                    m3238.setEmpty();
                    C1053<Rect> c10532 = f960;
                    c10532.mo2385(m3238);
                    if (!m3237.isEmpty()) {
                        int m47752 = C2786.m4775(c01335.f986, m2491);
                        if ((m47752 & 48) != 48 || (i8 = (m3237.top - ((ViewGroup.MarginLayoutParams) c01335).topMargin) - c01335.f989) >= (i9 = m323.top)) {
                            z2 = false;
                        } else {
                            m336(view, i9 - i8);
                            z2 = true;
                        }
                        if ((m47752 & 80) == 80 && (height = ((getHeight() - m3237.bottom) - ((ViewGroup.MarginLayoutParams) c01335).bottomMargin) + c01335.f989) < (i7 = m323.bottom)) {
                            m336(view, height - i7);
                            z2 = true;
                        }
                        if (!z2) {
                            m336(view, 0);
                        }
                        if ((m47752 & 3) != 3 || (i5 = (m3237.left - ((ViewGroup.MarginLayoutParams) c01335).leftMargin) - c01335.f1001) >= (i6 = m323.left)) {
                            z3 = false;
                        } else {
                            m337(view, i6 - i5);
                            z3 = true;
                        }
                        if ((m47752 & 5) == 5 && (width = ((getWidth() - m3237.right) - ((ViewGroup.MarginLayoutParams) c01335).rightMargin) + c01335.f1001) < (i4 = m323.right)) {
                            m337(view, width - i4);
                            z3 = true;
                        }
                        if (!z3) {
                            m337(view, 0);
                        }
                    }
                    m3237.setEmpty();
                    c10532.mo2385(m3237);
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((C0133) view.getLayoutParams()).f991);
                    if (rect.equals(m3232)) {
                        i3 = i17;
                    } else {
                        ((C0133) view.getLayoutParams()).f991.set(m3232);
                    }
                } else {
                    rect = rect3;
                }
                i3 = i17;
                for (int i20 = i2 + 1; i20 < i3; i20++) {
                    View view2 = this.f965.get(i20);
                    C0133 c01336 = (C0133) view2.getLayoutParams();
                    Behavior behavior3 = c01336.f994;
                    if (behavior3 != null && behavior3.mo365(this, view2, view)) {
                        if (i == 0 && c01336.f990) {
                            c01336.f990 = false;
                        } else {
                            if (i != 2) {
                                z = behavior3.mo346(this, view2, view);
                            } else {
                                behavior3.mo343(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c01336.f990 = z;
                            }
                        }
                    }
                }
            }
            i13 = i2 + 1;
            size = i3;
            m3233 = rect;
        }
        Rect rect4 = m3233;
        m323.setEmpty();
        C1053<Rect> c10533 = f960;
        c10533.mo2385(m323);
        m3232.setEmpty();
        c10533.mo2385(m3232);
        rect4.setEmpty();
        c10533.mo2385(rect4);
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final void m336(View view, int i) {
        C0133 c0133 = (C0133) view.getLayoutParams();
        int i2 = c0133.f989;
        if (i2 != i) {
            C1096.m2515(view, i - i2);
            c0133.f989 = i;
        }
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: なぎぱいぢぎ */
    public void mo111(View view, View view2, int i, int i2) {
        Behavior behavior;
        C1082 c1082 = this.f973;
        if (i2 == 1) {
            c1082.f5545 = i;
        } else {
            c1082.f5546 = i;
        }
        this.f978 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0133 c0133 = (C0133) getChildAt(i3).getLayoutParams();
            if (c0133.m372(i2) && (behavior = c0133.f994) != null && i2 == 0) {
                behavior.m363();
            }
        }
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m337(View view, int i) {
        C0133 c0133 = (C0133) view.getLayoutParams();
        int i2 = c0133.f1001;
        if (i2 != i) {
            C1096.m2483(view, i - i2);
            c0133.f1001 = i;
        }
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: のぷのちつ */
    public boolean mo112(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0133 c0133 = (C0133) childAt.getLayoutParams();
                Behavior behavior = c0133.f994;
                if (behavior != null) {
                    boolean mo345 = behavior.mo345(this, childAt, view, view2, i, i2);
                    z |= mo345;
                    c0133.m371(i2, mo345);
                } else {
                    c0133.m371(i2, false);
                }
            }
        }
        return z;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final int m338(int i) {
        StringBuilder sb;
        int[] iArr = this.f983;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        sb.toString();
        return 0;
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final void m339(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((C0133) childAt.getLayoutParams()).f994;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.mo347(this, childAt, obtain);
                } else {
                    behavior.mo364(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0133) getChildAt(i2).getLayoutParams()).f998 = false;
        }
        this.f976 = null;
        this.f982 = false;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m340(View view, int i) {
        Rect m323;
        Rect m3232;
        C1053<Rect> c1053;
        C0133 c0133 = (C0133) view.getLayoutParams();
        View view2 = c0133.f1002;
        int i2 = 0;
        if (view2 == null && c0133.f997 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            m323 = m323();
            m3232 = m323();
            try {
                m330(view2, m323);
                C0133 c01332 = (C0133) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m334(i, m323, m3232, c01332, measuredWidth, measuredHeight);
                m342(c01332, m3232, measuredWidth, measuredHeight);
                view.layout(m3232.left, m3232.top, m3232.right, m3232.bottom);
                return;
            } finally {
                m323.setEmpty();
                c1053 = f960;
                c1053.mo2385(m323);
                m3232.setEmpty();
                c1053.mo2385(m3232);
            }
        }
        int i3 = c0133.f995;
        if (i3 < 0) {
            C0133 c01333 = (C0133) view.getLayoutParams();
            m323 = m323();
            m323.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c01333).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c01333).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c01333).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c01333).bottomMargin);
            if (this.f968 != null && C1096.m2512(this) && !C1096.m2512(view)) {
                m323.left = this.f968.m2422() + m323.left;
                m323.top = this.f968.m2424() + m323.top;
                m323.right -= this.f968.m2426();
                m323.bottom -= this.f968.m2420();
            }
            m3232 = m323();
            int i4 = c01333.f993;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            int i5 = i4;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (Build.VERSION.SDK_INT >= 17) {
                Gravity.apply(i5, measuredWidth2, measuredHeight2, m323, m3232, i);
            } else {
                Gravity.apply(i5, measuredWidth2, measuredHeight2, m323, m3232);
            }
            view.layout(m3232.left, m3232.top, m3232.right, m3232.bottom);
            return;
        }
        C0133 c01334 = (C0133) view.getLayoutParams();
        int i6 = c01334.f993;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int m4775 = C2786.m4775(i6, i);
        int i7 = m4775 & 7;
        int i8 = m4775 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth3 = view.getMeasuredWidth();
        int measuredHeight3 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int m338 = m338(i3) - measuredWidth3;
        if (i7 == 1) {
            m338 += measuredWidth3 / 2;
        } else if (i7 == 5) {
            m338 += measuredWidth3;
        }
        if (i8 == 16) {
            i2 = 0 + (measuredHeight3 / 2);
        } else if (i8 == 80) {
            i2 = measuredHeight3 + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c01334).leftMargin, Math.min(m338, ((width - getPaddingRight()) - measuredWidth3) - ((ViewGroup.MarginLayoutParams) c01334).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c01334).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight3) - ((ViewGroup.MarginLayoutParams) c01334).bottomMargin));
        view.layout(max, max2, measuredWidth3 + max, measuredHeight3 + max2);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m341(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m330(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m342(C0133 c0133, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0133).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0133).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0133).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0133).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // p034.p035.p045.InterfaceC1068
    /* renamed from: ぺふねづ〺 */
    public void mo116(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0133 c0133 = (C0133) childAt.getLayoutParams();
                if (c0133.m372(i5) && (behavior = c0133.f994) != null) {
                    int[] iArr2 = this.f966;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.mo357(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f966;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f966[1]) : Math.min(i7, this.f966[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m335(1);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0133 ? new C0133((C0133) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0133((ViewGroup.MarginLayoutParams) layoutParams) : new C0133(layoutParams);
    }
}
