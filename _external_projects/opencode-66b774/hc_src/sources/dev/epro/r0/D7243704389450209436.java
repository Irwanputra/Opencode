package dev.epro.r0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import net.zetetic.database.CursorWindow;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D7243704389450209436 {
    public static final D7243704389450209436 d;
    public static final D7243704389450209436 e;
    public static final D7243704389450209436 f;
    public static final D7243704389450209436 g;
    public static final D7243704389450209436 h;
    public static final D7243704389450209436 i;
    public static final D7243704389450209436 j;
    public static final D7243704389450209436 k;
    public final Object a;
    public final int b;
    public final Class c;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19 = null;
        new D7243704389450209436(1, (String) null);
        new D7243704389450209436(2, (String) null);
        new D7243704389450209436(4, (String) null);
        new D7243704389450209436(8, (String) null);
        new D7243704389450209436(16, (String) null);
        new D7243704389450209436(32, (String) null);
        d = new D7243704389450209436(64, (String) null);
        e = new D7243704389450209436(128, (String) null);
        new D7243704389450209436(256, S948160781487597253.class);
        new D7243704389450209436(512, S948160781487597253.class);
        new D7243704389450209436(1024, F7619768586632825978.class);
        new D7243704389450209436(2048, F7619768586632825978.class);
        f = new D7243704389450209436(4096, (String) null);
        g = new D7243704389450209436(8192, (String) null);
        new D7243704389450209436(CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE, (String) null);
        new D7243704389450209436(32768, (String) null);
        new D7243704389450209436(65536, (String) null);
        new D7243704389450209436(131072, X11021066696961397228.class);
        new D7243704389450209436(262144, (String) null);
        new D7243704389450209436(524288, (String) null);
        new D7243704389450209436(1048576, (String) null);
        new D7243704389450209436(2097152, D7927814063924703597.class);
        new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, L12301483638787472844.class);
        h = new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        i = new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        j = new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        k = new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new D7243704389450209436(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i2 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new D7243704389450209436(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new D7243704389450209436(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i2 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new D7243704389450209436(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new D7243704389450209436(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, M7197017855214846243.class);
        new D7243704389450209436(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, S7803427813422823830.class);
        if (i2 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new D7243704389450209436(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new D7243704389450209436(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new D7243704389450209436(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new D7243704389450209436(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new D7243704389450209436(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i2 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new D7243704389450209436(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new D7243704389450209436(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i2 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new D7243704389450209436(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new D7243704389450209436(i2 >= 34 ? H3737085483209546534.b() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i3 = W10400873721744725500.a;
        if (i2 >= 36) {
            if ((i2 < 36 ? i2 * 100000 : G9045647016837122466.a()) >= 3600001) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new D7243704389450209436(accessibilityAction19, R.id.ALT, null, null, null);
    }

    public D7243704389450209436(Object obj, int i2, CharSequence charSequence, O9449724297217065906 o9449724297217065906, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof D7243704389450209436)) {
            return false;
        }
        Object obj2 = ((D7243704389450209436) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c = P11546267793636643785.c(this.b);
        if (c.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c);
        return sb.toString();
    }

    public D7243704389450209436(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public D7243704389450209436(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
