package p034.p098.p100;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: づざかべべ.ぶでにく〼〳.くし〴〺ぅ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1762 extends ViewPager2.AbstractC0316 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final List<ViewPager2.AbstractC0316> f7970;

    public C1762(int i) {
        this.f7970 = new ArrayList(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
    /* renamed from: 〺つふすそ */
    public void mo1104(int i, float f, int i2) {
        try {
            Iterator<ViewPager2.AbstractC0316> it = this.f7970.iterator();
            while (it.hasNext()) {
                it.next().mo1104(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m3811(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
    /* renamed from: くし〴〺ぅ */
    public void mo1102(int i) {
        try {
            Iterator<ViewPager2.AbstractC0316> it = this.f7970.iterator();
            while (it.hasNext()) {
                it.next().mo1102(i);
            }
        } catch (ConcurrentModificationException e) {
            m3811(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0316
    /* renamed from: げつ〴ぬぐ */
    public void mo1103(int i) {
        try {
            Iterator<ViewPager2.AbstractC0316> it = this.f7970.iterator();
            while (it.hasNext()) {
                it.next().mo1103(i);
            }
        } catch (ConcurrentModificationException e) {
            m3811(e);
            throw null;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m3811(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
