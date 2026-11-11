package p034.p065.p066;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p034.p065.p066.C1382;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぶでにく〼〳, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1409 implements C1382.InterfaceC1384 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f6634;

    public C1409(RecyclerView recyclerView) {
        this.f6634 = recyclerView;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public RecyclerView.AbstractC0207 m3173(int i) {
        RecyclerView recyclerView = this.f6634;
        int m3076 = recyclerView.f1433.m3076();
        int i2 = 0;
        RecyclerView.AbstractC0207 abstractC0207 = null;
        while (true) {
            if (i2 >= m3076) {
                break;
            }
            RecyclerView.AbstractC0207 m684 = RecyclerView.m684(recyclerView.f1433.m3078(i2));
            if (m684 != null && !m684.m778() && m684.f1475 == i) {
                if (!recyclerView.f1433.m3087(m684.f1476)) {
                    abstractC0207 = m684;
                    break;
                }
                abstractC0207 = m684;
            }
            i2++;
        }
        if (abstractC0207 == null || this.f6634.f1433.m3087(abstractC0207.f1476)) {
            return null;
        }
        return abstractC0207;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3174(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f6634;
        int m3076 = recyclerView.f1433.m3076();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m3076; i6++) {
            View m3078 = recyclerView.f1433.m3078(i6);
            RecyclerView.AbstractC0207 m684 = RecyclerView.m684(m3078);
            if (m684 != null && !m684.m772() && (i4 = m684.f1475) >= i && i4 < i5) {
                m684.m763(2);
                m684.m770(obj);
                ((RecyclerView.LayoutParams) m3078.getLayoutParams()).f1455 = true;
            }
        }
        RecyclerView.C0217 c0217 = recyclerView.f1411;
        int size = c0217.f1513.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f6634.f1431 = true;
                return;
            }
            RecyclerView.AbstractC0207 abstractC0207 = c0217.f1513.get(size);
            if (abstractC0207 != null && (i3 = abstractC0207.f1475) >= i && i3 < i5) {
                abstractC0207.m763(2);
                c0217.m799(size);
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3175(C1382.C1383 c1383) {
        int i = c1383.f6553;
        if (i == 1) {
            RecyclerView recyclerView = this.f6634;
            recyclerView.f1438.mo627(recyclerView, c1383.f6551, c1383.f6554);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView2 = this.f6634;
            recyclerView2.f1438.mo599(recyclerView2, c1383.f6551, c1383.f6554);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f6634;
            recyclerView3.f1438.mo605(recyclerView3, c1383.f6551, c1383.f6554, c1383.f6552);
        } else {
            if (i != 8) {
                return;
            }
            RecyclerView recyclerView4 = this.f6634;
            recyclerView4.f1438.mo624(recyclerView4, c1383.f6551, c1383.f6554, 1);
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m3176(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f6634;
        int m3076 = recyclerView.f1433.m3076();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < m3076; i11++) {
            RecyclerView.AbstractC0207 m684 = RecyclerView.m684(recyclerView.f1433.m3078(i11));
            if (m684 != null && (i9 = m684.f1475) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    m684.m767(i2 - i, false);
                } else {
                    m684.m767(i5, false);
                }
                recyclerView.f1386.f1549 = true;
            }
        }
        RecyclerView.C0217 c0217 = recyclerView.f1411;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = c0217.f1513.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.AbstractC0207 abstractC0207 = c0217.f1513.get(i12);
            if (abstractC0207 != null && (i8 = abstractC0207.f1475) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0207.m767(i2 - i, false);
                } else {
                    abstractC0207.m767(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f6634.f1409 = true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3177(int i, int i2) {
        RecyclerView recyclerView = this.f6634;
        int m3076 = recyclerView.f1433.m3076();
        for (int i3 = 0; i3 < m3076; i3++) {
            RecyclerView.AbstractC0207 m684 = RecyclerView.m684(recyclerView.f1433.m3078(i3));
            if (m684 != null && !m684.m772() && m684.f1475 >= i) {
                m684.m767(i2, false);
                recyclerView.f1386.f1549 = true;
            }
        }
        RecyclerView.C0217 c0217 = recyclerView.f1411;
        int size = c0217.f1513.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.AbstractC0207 abstractC0207 = c0217.f1513.get(i4);
            if (abstractC0207 != null && abstractC0207.f1475 >= i) {
                abstractC0207.m767(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f6634.f1409 = true;
    }
}
