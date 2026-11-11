package p107.p108.p109.p110.p129;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぺぁあねじ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1961 extends RecyclerView.AbstractC0235 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f8562;

    public C1961(int i, int i2, boolean z) {
        this.f8562 = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0235
    /* renamed from: びぐびあび */
    public void mo903(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0224 c0224) {
        RecyclerView.AbstractC0207 m684 = RecyclerView.m684(view);
        int m774 = m684 != null ? m684.m774() : -1;
        int i = m774 % 2;
        int i2 = this.f8562;
        rect.left = (i * i2) / 2;
        rect.right = i2 - (((i + 1) * i2) / 2);
        if (m774 >= 2) {
            rect.top = i2;
        }
    }
}
