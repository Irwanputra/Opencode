package p034.p065.p066;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p034.p065.p066.C1366;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1395 implements C1366.InterfaceC1367 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f6599;

    public C1395(RecyclerView recyclerView) {
        this.f6599 = recyclerView;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int m3151() {
        return this.f6599.getChildCount();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3152(int i) {
        View childAt = this.f6599.getChildAt(i);
        if (childAt != null) {
            this.f6599.m705(childAt);
            childAt.clearAnimation();
        }
        this.f6599.removeViewAt(i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View m3153(int i) {
        return this.f6599.getChildAt(i);
    }
}
