package dev.epro.r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class W10240872260424387225 {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final P3299477986085100372 d = new P3299477986085100372();

    public static Q1445202285683234142 a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        Q1445202285683234142 q1445202285683234142 = (Q1445202285683234142) weakHashMap.get(view);
        if (q1445202285683234142 != null) {
            return q1445202285683234142;
        }
        Q1445202285683234142 q14452022856832341422 = new Q1445202285683234142(view);
        a.put(view, q14452022856832341422);
        return q14452022856832341422;
    }

    public static void b(View view, N3121440022506799205 n3121440022506799205) {
        WindowInsets b2 = n3121440022506799205.b();
        if (b2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? O220049505054930899.a(view, b2) : Z8457668567033914258.a(view, b2);
            if (a2.equals(b2)) {
                return;
            }
            N3121440022506799205.c(a2, view);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = D1599049637933341185.d;
        D1599049637933341185 d1599049637933341185 = (D1599049637933341185) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (d1599049637933341185 == null) {
            d1599049637933341185 = new D1599049637933341185();
            d1599049637933341185.a = null;
            d1599049637933341185.b = null;
            d1599049637933341185.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, d1599049637933341185);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = d1599049637933341185.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = D1599049637933341185.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (d1599049637933341185.a == null) {
                            d1599049637933341185.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = D1599049637933341185.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                d1599049637933341185.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    d1599049637933341185.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = d1599049637933341185.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = d1599049637933341185.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    d1599049637933341185.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = D1599049637933341185.d;
            D1599049637933341185 d1599049637933341185 = (D1599049637933341185) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (d1599049637933341185 == null) {
                d1599049637933341185 = new D1599049637933341185();
                d1599049637933341185.a = null;
                d1599049637933341185.b = null;
                d1599049637933341185.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, d1599049637933341185);
            }
            WeakReference weakReference2 = d1599049637933341185.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                d1599049637933341185.c = new WeakReference(keyEvent);
                SparseArray sparseArray = d1599049637933341185.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    d1599049637933341185.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    Z3383101362411723454.s();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Y2647523926858661121.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] f(B6584454571824948275 b6584454571824948275) {
        return Build.VERSION.SDK_INT >= 31 ? Q4017899175928763455.a(b6584454571824948275) : (String[]) b6584454571824948275.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = V5462261517005869411.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = obtain.getText();
                    if (i2 >= 28) {
                        charSequence = V5462261517005869411.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i2 >= 28) {
                charSequence = V5462261517005869411.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static P16142420860494385953 h(B6584454571824948275 b6584454571824948275, P16142420860494385953 p16142420860494385953) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q4017899175928763455.b(b6584454571824948275, p16142420860494385953);
        }
        if (((E10092413133274766026) b6584454571824948275.getTag(R.id.tag_on_receive_content_listener)) == null) {
            b6584454571824948275.d.getClass();
            return E10092413133274766026.a(b6584454571824948275, p16142420860494385953);
        }
        P16142420860494385953 a2 = E10092413133274766026.a(b6584454571824948275, p16142420860494385953);
        if (a2 == null) {
            return null;
        }
        b6584454571824948275.d.getClass();
        return E10092413133274766026.a(b6584454571824948275, a2);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Y2647523926858661121.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void j(View view, M6658516668915746104 m6658516668915746104) {
        if (m6658516668915746104 == null && (e(view) instanceof R14550118172745988367)) {
            m6658516668915746104 = new M6658516668915746104();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(m6658516668915746104 == null ? null : m6658516668915746104.b);
    }

    public static void k(View view, CharSequence charSequence) {
        new F5719092837822460436(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        P3299477986085100372 p3299477986085100372 = d;
        if (charSequence == null) {
            p3299477986085100372.a.remove(view);
            view.removeOnAttachStateChangeListener(p3299477986085100372);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(p3299477986085100372);
        } else {
            p3299477986085100372.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(p3299477986085100372);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(p3299477986085100372);
            }
        }
    }
}
