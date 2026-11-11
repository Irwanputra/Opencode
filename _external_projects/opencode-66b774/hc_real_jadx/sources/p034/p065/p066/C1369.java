package p034.p065.p066;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p035.p045.p046.C1088;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1369 extends C1102 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C1370 f6514;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final RecyclerView f6515;

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.〻ぞまぎな〻$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1370 extends C1102 {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Map<View, C1102> f6516 = new WeakHashMap();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final C1369 f6517;

        public C1370(C1369 c1369) {
            this.f6517 = c1369;
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: 〳ぜぞぜべっ */
        public void mo2528(View view, int i) {
            C1102 c1102 = this.f6516.get(view);
            if (c1102 != null) {
                c1102.mo2528(view, i);
            } else {
                this.f5594.sendAccessibilityEvent(view, i);
            }
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: 〺つふすそ */
        public C1088 mo2529(View view) {
            C1102 c1102 = this.f6516.get(view);
            return c1102 != null ? c1102.mo2529(view) : super.mo2529(view);
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: ぁごぐすすぃ */
        public boolean mo429(View view, int i, Bundle bundle) {
            if (this.f6517.m3096() || this.f6517.f6515.getLayoutManager() == null) {
                return super.mo429(view, i, bundle);
            }
            C1102 c1102 = this.f6516.get(view);
            if (c1102 != null) {
                if (c1102.mo429(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo429(view, i, bundle)) {
                return true;
            }
            RecyclerView.AbstractC0219 layoutManager = this.f6517.f6515.getLayoutManager();
            RecyclerView.C0217 c0217 = layoutManager.f1519.f1411;
            return layoutManager.m821();
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: くし〴〺ぅ */
        public void mo430(View view, AccessibilityEvent accessibilityEvent) {
            C1102 c1102 = this.f6516.get(view);
            if (c1102 != null) {
                c1102.mo430(view, accessibilityEvent);
            } else {
                this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: げつ〴ぬぐ */
        public boolean mo456(View view, AccessibilityEvent accessibilityEvent) {
            C1102 c1102 = this.f6516.get(view);
            return c1102 != null ? c1102.mo456(view, accessibilityEvent) : this.f5594.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: づざかべべ */
        public void mo2530(View view, AccessibilityEvent accessibilityEvent) {
            C1102 c1102 = this.f6516.get(view);
            if (c1102 != null) {
                c1102.mo2530(view, accessibilityEvent);
            } else {
                this.f5594.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: なぎぱいぢぎ */
        public boolean mo457(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1102 c1102 = this.f6516.get(viewGroup);
            return c1102 != null ? c1102.mo457(viewGroup, view, accessibilityEvent) : this.f5594.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            if (!this.f6517.m3096() && this.f6517.f6515.getLayoutManager() != null) {
                this.f6517.f6515.getLayoutManager().m838(view, c1084);
                C1102 c1102 = this.f6516.get(view);
                if (c1102 != null) {
                    c1102.mo431(view, c1084);
                    return;
                }
            }
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: ぺぁあねじ */
        public void mo2531(View view, AccessibilityEvent accessibilityEvent) {
            C1102 c1102 = this.f6516.get(view);
            if (c1102 != null) {
                c1102.mo2531(view, accessibilityEvent);
            } else {
                this.f5594.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C1369(RecyclerView recyclerView) {
        this.f6515 = recyclerView;
        C1370 c1370 = this.f6514;
        this.f6514 = c1370 == null ? new C1370(this) : c1370;
    }

    @Override // p034.p035.p045.C1102
    /* renamed from: ぁごぐすすぃ */
    public boolean mo429(View view, int i, Bundle bundle) {
        if (super.mo429(view, i, bundle)) {
            return true;
        }
        if (m3096() || this.f6515.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.AbstractC0219 layoutManager = this.f6515.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f1519;
        return layoutManager.mo830(recyclerView.f1411, recyclerView.f1386, i, bundle);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m3096() {
        return this.f6515.m704();
    }

    @Override // p034.p035.p045.C1102
    /* renamed from: くし〴〺ぅ */
    public void mo430(View view, AccessibilityEvent accessibilityEvent) {
        this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m3096()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo666(accessibilityEvent);
        }
    }

    @Override // p034.p035.p045.C1102
    /* renamed from: びぐびあび */
    public void mo431(View view, C1084 c1084) {
        this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
        if (m3096() || this.f6515.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC0219 layoutManager = this.f6515.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f1519;
        layoutManager.mo871(recyclerView.f1411, recyclerView.f1386, c1084);
    }
}
