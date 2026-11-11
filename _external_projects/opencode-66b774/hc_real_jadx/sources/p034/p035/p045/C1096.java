package p034.p035.p045;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.C1037;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p035.p045.p046.InterfaceC1092;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1096 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static Field f5573;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Field f5574;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static ThreadLocal<Rect> f5576;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean f5577;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean f5579;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static WeakHashMap<View, String> f5580;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Field f5581;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final AtomicInteger f5578 = new AtomicInteger(1);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static WeakHashMap<View, C1104> f5575 = null;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static boolean f5582 = false;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.おぐぴう〸ず$〺つふすそ, reason: contains not printable characters */
    public static abstract class AbstractC1097<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Class<T> f5583;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f5584;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f5585;

        public AbstractC1097(int i, Class<T> cls, int i2) {
            this.f5585 = i;
            this.f5583 = cls;
            this.f5584 = i2;
        }

        public AbstractC1097(int i, Class<T> cls, int i2, int i3) {
            this.f5585 = i;
            this.f5583 = cls;
            this.f5584 = i3;
        }

        /* renamed from: 〺つふすそ */
        public abstract T mo2444(View view);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public T m2523(View view) {
            int i = Build.VERSION.SDK_INT;
            if (i >= this.f5584) {
                return mo2444(view);
            }
            if (!(i >= 19)) {
                return null;
            }
            T t = (T) view.getTag(this.f5585);
            if (this.f5583.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m2524(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.おぐぴう〸ず$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC1098 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        boolean m2525(View view, KeyEvent keyEvent);
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.おぐぴう〸ず$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnApplyWindowInsetsListenerC1099 implements View.OnApplyWindowInsetsListener {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC1121 f5586;

        public ViewOnApplyWindowInsetsListenerC1099(InterfaceC1121 interfaceC1121) {
            this.f5586 = interfaceC1121;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            windowInsets.getClass();
            return this.f5586.mo370(view, new C1072(windowInsets)).m2421();
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.おぐぴう〸ず$びぐびあび, reason: contains not printable characters */
    public static class C1100 {

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public static final ArrayList<WeakReference<View>> f5587 = new ArrayList<>();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public WeakHashMap<View, Boolean> f5590 = null;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public SparseArray<WeakReference<View>> f5588 = null;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public WeakReference<KeyEvent> f5589 = null;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final boolean m2526(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C1037.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC1098) arrayList.get(size)).m2525(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final View m2527(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f5590;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m2527 = m2527(viewGroup.getChildAt(childCount), keyEvent);
                        if (m2527 != null) {
                            return m2527;
                        }
                    }
                }
                if (m2526(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }
    }

    static {
        new WeakHashMap();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static View.AccessibilityDelegate m2475(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f5582) {
            return null;
        }
        if (f5573 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5573 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5582 = true;
                return null;
            }
        }
        Object obj = f5573.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m2476(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2496((View) parent);
            }
        }
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static void m2477(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static boolean m2478(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC1110) {
            return ((InterfaceC1110) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static C1102 m2479(View view) {
        View.AccessibilityDelegate m2475 = m2475(view);
        if (m2475 == null) {
            return null;
        }
        return m2475 instanceof C1102.C1103 ? ((C1102.C1103) m2475).f5595 : new C1102(m2475);
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static void m2480(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static Rect m2481(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static void m2482(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static void m2483(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        if (i2 < 21) {
            m2476(view, i);
            return;
        }
        Rect m2506 = m2506();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2506.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m2506.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2476(view, i);
        if (z && m2506.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2506);
        }
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public static void m2484(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static int m2485(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f5579) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f5581 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5579 = true;
        }
        Field field = f5581;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public static void m2486(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static void m2487(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = new C1095(C1037.tag_accessibility_pane_title, CharSequence.class, 8, 28).m2523(view) != null;
            if ((Build.VERSION.SDK_INT >= 19 ? view.getAccessibilityLiveRegion() : 0) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass().getSimpleName();
                }
            }
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static int m2488(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f5577) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f5574 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5577 = true;
        }
        Field field = f5574;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static void m2489(int i, View view) {
        int i2 = C1037.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i2, arrayList);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((C1084.C1087) arrayList.get(i3)).m2471() == i) {
                arrayList.remove(i3);
                return;
            }
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static void m2490(View view, C1102 c1102) {
        if (c1102 == null && (m2475(view) instanceof C1102.C1103)) {
            c1102 = new C1102();
        }
        view.setAccessibilityDelegate(c1102 == null ? null : c1102.f5593);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static int m2491(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m2492(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2496((View) parent);
            }
        }
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static void m2493(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public static void m2494(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C1104 m2495(View view) {
        if (f5575 == null) {
            f5575 = new WeakHashMap<>();
        }
        C1104 c1104 = f5575.get(view);
        if (c1104 != null) {
            return c1104;
        }
        C1104 c11042 = new C1104(view);
        f5575.put(view, c11042);
        return c11042;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public static void m2496(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static String m2497(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f5580;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public static void m2498(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f5580 == null) {
            f5580 = new WeakHashMap<>();
        }
        f5580.put(view, str);
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static int m2499(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static int m2500(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static void m2501(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static void m2502(View view, C1084.C1087 c1087, CharSequence charSequence, InterfaceC1092 interfaceC1092) {
        if (interfaceC1092 == null) {
            m2521(view, c1087.m2471());
            return;
        }
        C1084.C1087 c10872 = new C1084.C1087(null, c1087.f5564, null, interfaceC1092, c1087.f5565);
        if (Build.VERSION.SDK_INT >= 21) {
            C1102 m2479 = m2479(view);
            if (m2479 == null) {
                m2479 = new C1102();
            }
            m2490(view, m2479);
            m2489(c10872.m2471(), view);
            int i = C1037.tag_accessibility_actions;
            ArrayList arrayList = (ArrayList) view.getTag(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
                view.setTag(i, arrayList);
            }
            arrayList.add(c10872);
            m2487(view, 0);
        }
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public static void m2503(View view, InterfaceC1121 interfaceC1121) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (interfaceC1121 == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1099(interfaceC1121));
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean m2504(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C1100.f5587;
        int i = C1037.tag_unhandled_key_event_manager;
        C1100 c1100 = (C1100) view.getTag(i);
        if (c1100 == null) {
            c1100 = new C1100();
            view.setTag(i, c1100);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = c1100.f5590;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = C1100.f5587;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (c1100.f5590 == null) {
                        c1100.f5590 = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = C1100.f5587;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            c1100.f5590.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c1100.f5590.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m2527 = c1100.m2527(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m2527 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c1100.f5588 == null) {
                    c1100.f5588 = new SparseArray<>();
                }
                c1100.f5588.put(keyCode, new WeakReference<>(m2527));
            }
        }
        return m2527 != null;
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public static void m2505(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static Rect m2506() {
        if (f5576 == null) {
            f5576 = new ThreadLocal<>();
        }
        Rect rect = f5576.get();
        if (rect == null) {
            rect = new Rect();
            f5576.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static boolean m2507(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static void m2508(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static void m2509(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static int m2510() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f5578;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static C1072 m2511(View view, C1072 c1072) {
        WindowInsets m2421;
        if (Build.VERSION.SDK_INT < 21 || (m2421 = c1072.m2421()) == null) {
            return c1072;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(m2421);
        return !onApplyWindowInsets.equals(m2421) ? new C1072(onApplyWindowInsets) : c1072;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static boolean m2512(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static int m2513(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public static void m2514(View view, C1114 c1114) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (c1114 != null ? c1114.f5612 : null));
        }
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static void m2515(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        if (i2 < 21) {
            m2492(view, i);
            return;
        }
        Rect m2506 = m2506();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2506.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m2506.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2492(view, i);
        if (z && m2506.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2506);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C1072 m2516(View view, C1072 c1072) {
        WindowInsets m2421;
        return (Build.VERSION.SDK_INT < 21 || (m2421 = c1072.m2421()) == null || view.dispatchApplyWindowInsets(m2421).equals(m2421)) ? c1072 : new C1072(m2421);
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static boolean m2517(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static void m2518(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static int m2519(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static ColorStateList m2520(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC1119) {
            return ((InterfaceC1119) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static void m2521(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2489(i, view);
            m2487(view, 0);
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static float m2522(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }
}
