package p034.p098.p100;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: づざかべべ.ぶでにく〼〳.くし〴〺ぅ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1764 extends ViewPager2.AbstractC0316 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ViewPager2.InterfaceC0324 f7971;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final LinearLayoutManager f7972;

    public C1764(LinearLayoutManager linearLayoutManager) {
        this.f7972 = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
    /* renamed from: 〺つふすそ */
    public void mo1104(int i, float f, int i2) {
        if (this.f7971 == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f7972.m836(); i3++) {
            View m826 = this.f7972.m826(i3);
            if (m826 == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f7972.m836())));
            }
            this.f7971.m1106(m826, (this.f7972.m857(m826) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
    /* renamed from: くし〴〺ぅ */
    public void mo1102(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
    /* renamed from: げつ〴ぬぐ */
    public void mo1103(int i) {
    }
}
