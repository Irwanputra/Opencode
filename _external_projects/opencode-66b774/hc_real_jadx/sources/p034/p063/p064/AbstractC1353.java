package p034.p063.p064;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p035.p045.p046.C1088;
import p034.p080.C1507;

/* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1353 extends C1102 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final AccessibilityManager f6464;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C1355 f6466;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final View f6472;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final Rect f6463 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final InterfaceC1351<C1084> f6462 = new C1356();

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final InterfaceC1352<C1507<C1084>, C1084> f6461 = new C1354();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Rect f6471 = new Rect();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Rect f6467 = new Rect();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Rect f6469 = new Rect();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int[] f6465 = new int[2];

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f6473 = Integer.MIN_VALUE;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f6468 = Integer.MIN_VALUE;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    private int f6470 = Integer.MIN_VALUE;

    /* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static class C1354 implements InterfaceC1352<C1507<C1084>, C1084> {
    }

    /* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public class C1355 extends C1088 {
        public C1355() {
        }

        @Override // p034.p035.p045.p046.C1088
        /* renamed from: 〺つふすそ */
        public C1084 mo2472(int i) {
            int i2 = i == 2 ? AbstractC1353.this.f6473 : AbstractC1353.this.f6468;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new C1084(AccessibilityNodeInfo.obtain(AbstractC1353.this.m3044(i2).f5550));
        }

        @Override // p034.p035.p045.p046.C1088
        /* renamed from: くし〴〺ぅ */
        public boolean mo2473(int i, int i2, Bundle bundle) {
            int i3;
            AbstractC1353 abstractC1353 = AbstractC1353.this;
            boolean z = false;
            if (i == -1) {
                View view = abstractC1353.f6472;
                AtomicInteger atomicInteger = C1096.f5578;
                if (Build.VERSION.SDK_INT >= 16) {
                    z = view.performAccessibilityAction(i2, bundle);
                }
            } else {
                if (i2 == 1) {
                    return abstractC1353.m3039(i);
                }
                if (i2 == 2) {
                    return abstractC1353.m3047(i);
                }
                if (i2 != 64) {
                    return i2 != 128 ? abstractC1353.mo1123(i, i2, bundle) : abstractC1353.m3037(i);
                }
                if (abstractC1353.f6464.isEnabled() && abstractC1353.f6464.isTouchExplorationEnabled() && (i3 = abstractC1353.f6473) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        abstractC1353.m3037(i3);
                    }
                    abstractC1353.f6473 = i;
                    abstractC1353.f6472.invalidate();
                    abstractC1353.m3038(i, 32768);
                    z = true;
                }
            }
            return z;
        }

        @Override // p034.p035.p045.p046.C1088
        /* renamed from: げつ〴ぬぐ */
        public C1084 mo2474(int i) {
            return new C1084(AccessibilityNodeInfo.obtain(AbstractC1353.this.m3044(i).f5550));
        }
    }

    /* renamed from: づざかべべ.いいにぽつ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1356 implements InterfaceC1351<C1084> {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3048(Object obj, Rect rect) {
            ((C1084) obj).f5550.getBoundsInParent(rect);
        }
    }

    public AbstractC1353(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f6472 = view;
        this.f6464 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C1096.m2519(view) == 0) {
            C1096.m2505(view, 1);
        }
    }

    @Override // p034.p035.p045.C1102
    /* renamed from: 〺つふすそ */
    public C1088 mo2529(View view) {
        if (this.f6466 == null) {
            this.f6466 = new C1355();
        }
        return this.f6466;
    }

    /* renamed from: 〻ぞまぎな〻 */
    public void mo1388(int i, boolean z) {
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean m3037(int i) {
        if (this.f6473 != i) {
            return false;
        }
        this.f6473 = Integer.MIN_VALUE;
        this.f6472.invalidate();
        m3038(i, 65536);
        return true;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final boolean m3038(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f6464.isEnabled() || (parent = this.f6472.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f6472, m3042(i, i2));
    }

    /* renamed from: ぇぬぎばつ */
    public abstract void mo1121(List<Integer> list);

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final boolean m3039(int i) {
        int i2;
        if ((!this.f6472.isFocused() && !this.f6472.requestFocus()) || (i2 = this.f6468) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m3047(i2);
        }
        this.f6468 = i;
        mo1388(i, true);
        m3038(i, 8);
        return true;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final void m3040(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f6464.isEnabled() || (parent = this.f6472.getParent()) == null) {
            return;
        }
        AccessibilityEvent m3042 = m3042(i, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            m3042.setContentChangeTypes(i2);
        }
        parent.requestSendAccessibilityEvent(this.f6472, m3042);
    }

    /* renamed from: おぐぴう〸ず */
    public abstract int mo1122(float f, float f2);

    @Override // p034.p035.p045.C1102
    /* renamed from: くし〴〺ぅ */
    public void mo430(View view, AccessibilityEvent accessibilityEvent) {
        this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: ごづごきえ */
    public abstract boolean mo1123(int i, int i2, Bundle bundle);

    /* renamed from: ざっざへづ */
    public void mo1124(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e A[SYNTHETIC] */
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3041(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p063.p064.AbstractC1353.m3041(int, android.graphics.Rect):boolean");
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final AccessibilityEvent m3042(int i, int i2) {
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            this.f6472.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        C1084 m3044 = m3044(i);
        obtain2.getText().add(m3044.m2451());
        obtain2.setContentDescription(m3044.m2450());
        obtain2.setScrollable(m3044.f5550.isScrollable());
        obtain2.setPassword(m3044.f5550.isPassword());
        obtain2.setEnabled(m3044.m2460());
        obtain2.setChecked(m3044.f5550.isChecked());
        mo1124(i, obtain2);
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(m3044.m2459());
        View view = this.f6472;
        if (Build.VERSION.SDK_INT >= 16) {
            obtain2.setSource(view, i);
        }
        obtain2.setPackageName(this.f6472.getContext().getPackageName());
        return obtain2;
    }

    /* renamed from: でどあくず */
    public void mo1389(C1084 c1084) {
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final C1084 m3043(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C1084 c1084 = new C1084(obtain);
        obtain.setEnabled(true);
        c1084.f5550.setFocusable(true);
        c1084.f5550.setClassName("android.view.View");
        Rect rect = f6463;
        c1084.f5550.setBoundsInParent(rect);
        c1084.f5550.setBoundsInScreen(rect);
        c1084.m2465(this.f6472);
        mo1126(i, c1084);
        if (c1084.m2451() == null && c1084.m2450() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c1084.f5550.getBoundsInParent(this.f6467);
        if (this.f6467.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int m2464 = c1084.m2464();
        if ((m2464 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        int i2 = NotificationCompat.FLAG_HIGH_PRIORITY;
        if ((m2464 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c1084.f5550.setPackageName(this.f6472.getContext().getPackageName());
        View view = this.f6472;
        c1084.f5549 = i;
        if (Build.VERSION.SDK_INT >= 16) {
            c1084.f5550.setSource(view, i);
        }
        boolean z = false;
        if (this.f6473 == i) {
            c1084.m2458(true);
            accessibilityNodeInfo = c1084.f5550;
        } else {
            c1084.m2458(false);
            accessibilityNodeInfo = c1084.f5550;
            i2 = 64;
        }
        accessibilityNodeInfo.addAction(i2);
        boolean z2 = this.f6468 == i;
        if (z2) {
            c1084.f5550.addAction(2);
        } else if (c1084.m2462()) {
            c1084.f5550.addAction(1);
        }
        c1084.f5550.setFocused(z2);
        this.f6472.getLocationOnScreen(this.f6465);
        c1084.f5550.getBoundsInScreen(this.f6471);
        if (this.f6471.equals(rect)) {
            c1084.f5550.getBoundsInParent(this.f6471);
            if (c1084.f5548 != -1) {
                C1084 c10842 = new C1084(AccessibilityNodeInfo.obtain());
                for (int i3 = c1084.f5548; i3 != -1; i3 = c10842.f5548) {
                    View view2 = this.f6472;
                    c10842.f5548 = -1;
                    if (Build.VERSION.SDK_INT >= 16) {
                        c10842.f5550.setParent(view2, -1);
                    }
                    c10842.f5550.setBoundsInParent(f6463);
                    mo1126(i3, c10842);
                    c10842.f5550.getBoundsInParent(this.f6467);
                    Rect rect2 = this.f6471;
                    Rect rect3 = this.f6467;
                    rect2.offset(rect3.left, rect3.top);
                }
                c10842.f5550.recycle();
            }
            this.f6471.offset(this.f6465[0] - this.f6472.getScrollX(), this.f6465[1] - this.f6472.getScrollY());
        }
        if (this.f6472.getLocalVisibleRect(this.f6469)) {
            this.f6469.offset(this.f6465[0] - this.f6472.getScrollX(), this.f6465[1] - this.f6472.getScrollY());
            if (this.f6471.intersect(this.f6469)) {
                c1084.f5550.setBoundsInScreen(this.f6471);
                Rect rect4 = this.f6471;
                if (rect4 != null && !rect4.isEmpty() && this.f6472.getWindowVisibility() == 0) {
                    View view3 = this.f6472;
                    while (true) {
                        Object parent = view3.getParent();
                        if (parent instanceof View) {
                            view3 = (View) parent;
                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                break;
                            }
                        } else if (parent != null) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    c1084.m2449(true);
                }
            }
        }
        return c1084;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public C1084 m3044(int i) {
        if (i != -1) {
            return m3043(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f6472);
        C1084 c1084 = new C1084(obtain);
        View view = this.f6472;
        AtomicInteger atomicInteger = C1096.f5578;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo1121(arrayList);
        if (c1084.f5550.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = this.f6472;
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            if (Build.VERSION.SDK_INT >= 16) {
                c1084.f5550.addChild(view2, intValue);
            }
        }
        return c1084;
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final void m3045(int i) {
        int i2 = this.f6470;
        if (i2 == i) {
            return;
        }
        this.f6470 = i;
        m3038(i, NotificationCompat.FLAG_HIGH_PRIORITY);
        m3038(i2, NotificationCompat.FLAG_LOCAL_ONLY);
    }

    @Override // p034.p035.p045.C1102
    /* renamed from: びぐびあび */
    public void mo431(View view, C1084 c1084) {
        this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
        mo1389(c1084);
    }

    /* renamed from: ぶでにく〼〳 */
    public abstract void mo1126(int i, C1084 c1084);

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final boolean m3046(MotionEvent motionEvent) {
        int i;
        if (this.f6464.isEnabled() && this.f6464.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || (i = this.f6470) == Integer.MIN_VALUE) {
                    return false;
                }
                if (i != Integer.MIN_VALUE) {
                    this.f6470 = Integer.MIN_VALUE;
                    m3038(Integer.MIN_VALUE, NotificationCompat.FLAG_HIGH_PRIORITY);
                    m3038(i, NotificationCompat.FLAG_LOCAL_ONLY);
                }
                return true;
            }
            int mo1122 = mo1122(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f6470;
            if (i2 != mo1122) {
                this.f6470 = mo1122;
                m3038(mo1122, NotificationCompat.FLAG_HIGH_PRIORITY);
                m3038(i2, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            if (mo1122 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final boolean m3047(int i) {
        if (this.f6468 != i) {
            return false;
        }
        this.f6468 = Integer.MIN_VALUE;
        mo1388(i, false);
        m3038(i, 8);
        return true;
    }
}
