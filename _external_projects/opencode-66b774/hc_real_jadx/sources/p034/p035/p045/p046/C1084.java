package p034.p035.p045.p046;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p034.p035.p045.p046.InterfaceC1092;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1084 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static int f5547;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f5548 = -1;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f5549 = -1;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final AccessibilityNodeInfo f5550;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public static class C1085 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Object f5551;

        public C1085(Object obj) {
            this.f5551 = obj;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static C1085 m2469(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C1085(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C1085(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C1085(null);
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1086 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Object f5552;

        public C1086(Object obj) {
            this.f5552 = obj;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static C1086 m2470(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C1086(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C1086(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C1086(null);
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1087 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public static final C1087 f5553;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public static final C1087 f5554;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public static final C1087 f5555;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public static final C1087 f5556;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public static final C1087 f5558;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public static final C1087 f5560;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public static final C1087 f5561;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public static final C1087 f5562;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public static final C1087 f5563;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f5564;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Class<? extends InterfaceC1092.AbstractC1094> f5565;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Object f5566;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final InterfaceC1092 f5567;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public static final C1087 f5557 = new C1087(1, null);

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public static final C1087 f5559 = new C1087(2, null);

        static {
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(4, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(8, null);
            }
            f5554 = new C1087(16, null);
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(32, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(64, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(NotificationCompat.FLAG_HIGH_PRIORITY, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(NotificationCompat.FLAG_LOCAL_ONLY, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(512, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(1024, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2048, null);
            }
            f5553 = new C1087(NotificationCompat.FLAG_BUBBLE, null);
            f5562 = new C1087(8192, null);
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(16384, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(32768, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(65536, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(131072, null);
            }
            f5555 = new C1087(262144, null);
            f5563 = new C1087(524288, null);
            f5558 = new C1087(1048576, null);
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
            }
            int i = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowOnScreen, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction2 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollToPosition, null);
            }
            f5560 = new C1087(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction3 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollLeft, null);
            }
            f5561 = new C1087(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction4 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollRight, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction5 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageUp, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction6 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageDown, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction7 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageLeft, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8 = i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction8 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageRight, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9 = i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction9 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionContextClick, null);
            }
            f5556 = new C1087(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, InterfaceC1092.C1093.class);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction10 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionMoveWindow, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction11 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowTooltip, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12 = i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null;
            if (Build.VERSION.SDK_INT < 21 || accessibilityAction12 != null) {
                return;
            }
            new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionHideTooltip, null);
        }

        public C1087(int i, CharSequence charSequence) {
            this(null, i, null, null, null);
        }

        public C1087(Object obj, int i, CharSequence charSequence, InterfaceC1092 interfaceC1092, Class<? extends InterfaceC1092.AbstractC1094> cls) {
            this.f5564 = i;
            this.f5567 = interfaceC1092;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f5566 = obj;
            this.f5565 = cls;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1087)) {
                return false;
            }
            Object obj2 = this.f5566;
            Object obj3 = ((C1087) obj).f5566;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f5566;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int m2471() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f5566).getId();
            }
            return 0;
        }
    }

    public C1084(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5550 = accessibilityNodeInfo;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m2445(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case NotificationCompat.FLAG_BUBBLE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static ClickableSpan[] m2446(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1084)) {
            return false;
        }
        C1084 c1084 = (C1084) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5550;
        if (accessibilityNodeInfo == null) {
            if (c1084.f5550 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c1084.f5550)) {
            return false;
        }
        return this.f5549 == c1084.f5549 && this.f5548 == c1084.f5548;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5550;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public String toString() {
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f5550.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f5550.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m2467());
        sb.append("; className: ");
        sb.append(m2459());
        sb.append("; text: ");
        sb.append(m2451());
        sb.append("; contentDescription: ");
        sb.append(m2450());
        sb.append("; viewId: ");
        int i = Build.VERSION.SDK_INT;
        sb.append(i >= 18 ? this.f5550.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(this.f5550.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f5550.isChecked());
        sb.append("; focusable: ");
        sb.append(m2462());
        sb.append("; focused: ");
        sb.append(m2466());
        sb.append("; selected: ");
        sb.append(m2452());
        sb.append("; clickable: ");
        sb.append(m2468());
        sb.append("; longClickable: ");
        sb.append(m2454());
        sb.append("; enabled: ");
        sb.append(m2460());
        sb.append("; password: ");
        sb.append(this.f5550.isPassword());
        sb.append("; scrollable: " + this.f5550.isScrollable());
        sb.append("; [");
        if (i >= 21) {
            List<AccessibilityNodeInfo.AccessibilityAction> actionList = i >= 21 ? this.f5550.getActionList() : null;
            if (actionList != null) {
                emptyList = new ArrayList();
                int size = actionList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    emptyList.add(new C1087(actionList.get(i2), 0, null, null, null));
                }
            } else {
                emptyList = Collections.emptyList();
            }
            for (int i3 = 0; i3 < emptyList.size(); i3++) {
                C1087 c1087 = (C1087) emptyList.get(i3);
                String m2445 = m2445(c1087.m2471());
                if (m2445.equals("ACTION_UNKNOWN")) {
                    int i4 = Build.VERSION.SDK_INT;
                    if ((i4 >= 21 ? ((AccessibilityNodeInfo.AccessibilityAction) c1087.f5566).getLabel() : null) != null) {
                        m2445 = (i4 >= 21 ? ((AccessibilityNodeInfo.AccessibilityAction) c1087.f5566).getLabel() : null).toString();
                    }
                }
                sb.append(m2445);
                if (i3 != emptyList.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int m2464 = m2464();
            while (m2464 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m2464);
                m2464 &= numberOfTrailingZeros ^ (-1);
                sb.append(m2445(numberOfTrailingZeros));
                if (m2464 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Bundle m2447() {
        return Build.VERSION.SDK_INT >= 19 ? this.f5550.getExtras() : new Bundle();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<Integer> m2448(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f5550.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f5550.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m2449(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5550.setVisibleToUser(z);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public CharSequence m2450() {
        return this.f5550.getContentDescription();
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public CharSequence m2451() {
        if (!(!m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f5550.getText();
        }
        List<Integer> m2448 = m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> m24482 = m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> m24483 = m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> m24484 = m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f5550.getText(), 0, this.f5550.getText().length()));
        for (int i = 0; i < m2448.size(); i++) {
            spannableString.setSpan(new C1091(m24484.get(i).intValue(), this, m2447().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m2448.get(i).intValue(), m24482.get(i).intValue(), m24483.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean m2452() {
        return this.f5550.isSelected();
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean m2453(C1087 c1087) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f5550.removeAction((AccessibilityNodeInfo.AccessibilityAction) c1087.f5566);
        }
        return false;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m2454() {
        return this.f5550.isLongClickable();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2455(C1087 c1087) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5550.addAction((AccessibilityNodeInfo.AccessibilityAction) c1087.f5566);
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m2456(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5550.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C1085) obj).f5551);
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m2457(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5550.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C1086) obj).f5552);
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void m2458(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5550.setAccessibilityFocused(z);
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public CharSequence m2459() {
        return this.f5550.getClassName();
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean m2460() {
        return this.f5550.isEnabled();
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void m2461(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f5550.setHintText(charSequence);
        } else if (i >= 19) {
            this.f5550.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean m2462() {
        return this.f5550.isFocusable();
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final void m2463(int i, boolean z) {
        Bundle m2447 = m2447();
        if (m2447 != null) {
            int i2 = m2447.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            m2447.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m2464() {
        return this.f5550.getActions();
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m2465(View view) {
        this.f5548 = -1;
        this.f5550.setParent(view);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m2466() {
        return this.f5550.isFocused();
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public CharSequence m2467() {
        return this.f5550.getPackageName();
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean m2468() {
        return this.f5550.isClickable();
    }
}
