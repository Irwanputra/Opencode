package p034.p098.p100;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: づざかべべ.ぶでにく〼〳.くし〴〺ぅ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1761 implements RecyclerView.InterfaceC0226 {
    public C1761(ViewPager2 viewPager2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0226
    /* renamed from: 〺つふすそ */
    public void mo883(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0226
    /* renamed from: げつ〴ぬぐ */
    public void mo884(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
