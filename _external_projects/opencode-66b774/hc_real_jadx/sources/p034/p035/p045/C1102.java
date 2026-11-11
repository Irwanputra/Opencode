package p034.p035.p045;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.C1037;
import p034.p035.p045.p046.C1084;
import p034.p035.p045.p046.C1088;
import p034.p035.p045.p046.InterfaceC1092;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1102 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final View.AccessibilityDelegate f5592 = new View.AccessibilityDelegate();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final View.AccessibilityDelegate f5593;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final View.AccessibilityDelegate f5594;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C1103 extends View.AccessibilityDelegate {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1102 f5595;

        public C1103(C1102 c1102) {
            this.f5595 = c1102;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5595.mo456(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1088 mo2529 = this.f5595.mo2529(view);
            if (mo2529 != null) {
                return (AccessibilityNodeProvider) mo2529.f5568;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5595.mo430(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            C1084 c1084 = new C1084(accessibilityNodeInfo);
            AtomicInteger atomicInteger = C1096.f5578;
            Boolean m2523 = new C1083(C1037.tag_screen_reader_focusable, Boolean.class, 28).m2523(view);
            boolean booleanValue = m2523 == null ? false : m2523.booleanValue();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                c1084.f5550.setScreenReaderFocusable(booleanValue);
            } else {
                c1084.m2463(1, booleanValue);
            }
            Boolean m25232 = new C1109(C1037.tag_accessibility_heading, Boolean.class, 28).m2523(view);
            boolean booleanValue2 = m25232 == null ? false : m25232.booleanValue();
            if (i2 >= 28) {
                c1084.f5550.setHeading(booleanValue2);
            } else {
                c1084.m2463(2, booleanValue2);
            }
            CharSequence m25233 = new C1095(C1037.tag_accessibility_pane_title, CharSequence.class, 8, 28).m2523(view);
            if (i2 >= 28) {
                c1084.f5550.setPaneTitle(m25233);
            } else if (i2 >= 19) {
                c1084.f5550.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m25233);
            }
            this.f5595.mo431(view, c1084);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i2 >= 19 && i2 < 26) {
                if (i2 >= 19) {
                    c1084.f5550.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                    c1084.f5550.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                    c1084.f5550.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                    c1084.f5550.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                }
                SparseArray sparseArray = (SparseArray) view.getTag(C1037.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                    }
                }
                ClickableSpan[] m2446 = C1084.m2446(text);
                if (m2446 != null && m2446.length > 0) {
                    c1084.m2447().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C1037.accessibility_action_clickable_span);
                    int i5 = C1037.tag_accessibility_clickable_spans;
                    SparseArray sparseArray2 = (SparseArray) view.getTag(i5);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(i5, sparseArray2);
                    }
                    for (int i6 = 0; i6 < m2446.length; i6++) {
                        ClickableSpan clickableSpan = m2446[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                i = C1084.f5547;
                                C1084.f5547 = i + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                    i = sparseArray2.keyAt(i7);
                                    break;
                                }
                                i7++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(m2446[i6]));
                        ClickableSpan clickableSpan2 = m2446[i6];
                        Spanned spanned = (Spanned) text;
                        c1084.m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        c1084.m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        c1084.m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        c1084.m2448("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view.getTag(C1037.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                c1084.m2455((C1084.C1087) list.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5595.mo2530(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5595.mo457(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f5595.mo429(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f5595.mo2528(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5595.mo2531(view, accessibilityEvent);
        }
    }

    public C1102() {
        this.f5594 = f5592;
        this.f5593 = new C1103(this);
    }

    public C1102(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5594 = accessibilityDelegate;
        this.f5593 = new C1103(this);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void mo2528(View view, int i) {
        this.f5594.sendAccessibilityEvent(view, i);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1088 mo2529(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f5594.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C1088(accessibilityNodeProvider);
    }

    /* renamed from: ぁごぐすすぃ */
    public boolean mo429(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(C1037.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C1084.C1087 c1087 = (C1084.C1087) list.get(i2);
            if (c1087.m2471() != i) {
                i2++;
            } else if (c1087.f5567 != null) {
                InterfaceC1092.AbstractC1094 abstractC1094 = null;
                Class<? extends InterfaceC1092.AbstractC1094> cls = c1087.f5565;
                if (cls != null) {
                    try {
                        InterfaceC1092.AbstractC1094 newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            newInstance.getClass();
                        } catch (Exception unused) {
                        }
                        abstractC1094 = newInstance;
                    } catch (Exception unused2) {
                    }
                }
                z = c1087.f5567.mo1101(view, abstractC1094);
            }
        }
        z = false;
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f5594.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != C1037.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C1037.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] m2446 = C1084.m2446(view.createAccessibilityNodeInfo().getText());
                for (int i4 = 0; m2446 != null && i4 < m2446.length; i4++) {
                    if (clickableSpan.equals(m2446[i4])) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                clickableSpan.onClick(view);
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: くし〴〺ぅ */
    public void mo430(View view, AccessibilityEvent accessibilityEvent) {
        this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: げつ〴ぬぐ */
    public boolean mo456(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5594.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo2530(View view, AccessibilityEvent accessibilityEvent) {
        this.f5594.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: なぎぱいぢぎ */
    public boolean mo457(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5594.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: びぐびあび */
    public void mo431(View view, C1084 c1084) {
        this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void mo2531(View view, AccessibilityEvent accessibilityEvent) {
        this.f5594.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
