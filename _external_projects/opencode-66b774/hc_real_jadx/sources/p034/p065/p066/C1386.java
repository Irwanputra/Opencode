package p034.p065.p066;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1386 extends AbstractC1373 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AbstractC1385 f6558;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AbstractC1385 f6559;

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ざっざへづ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1387 extends C1380 {
        public C1387(Context context) {
            super(context);
        }

        @Override // p034.p065.p066.C1380, androidx.recyclerview.widget.RecyclerView.AbstractC0214
        /* renamed from: 〺つふすそ */
        public void mo792(View view, RecyclerView.C0224 c0224, RecyclerView.AbstractC0214.C0216 c0216) {
            C1386 c1386 = C1386.this;
            int[] mo3097 = c1386.mo3097(c1386.f6528.getLayoutManager(), view);
            int i = mo3097[0];
            int i2 = mo3097[1];
            int m3110 = m3110(Math.max(Math.abs(i), Math.abs(i2)));
            if (m3110 > 0) {
                c0216.m795(i, i2, m3110, this.f6536);
            }
        }

        @Override // p034.p065.p066.C1380
        /* renamed from: ぁごぐすすぃ */
        public int mo3109(int i) {
            return Math.min(100, super.mo3109(i));
        }

        @Override // p034.p065.p066.C1380
        /* renamed from: づざかべべ */
        public float mo3102(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final View m3141(RecyclerView.AbstractC0219 abstractC0219, AbstractC1385 abstractC1385) {
        int m836 = abstractC0219.m836();
        View view = null;
        if (m836 == 0) {
            return null;
        }
        int mo3134 = (abstractC1385.mo3134() / 2) + abstractC1385.mo3140();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m836; i2++) {
            View m826 = abstractC0219.m826(i2);
            int abs = Math.abs(((abstractC1385.mo3132(m826) / 2) + abstractC1385.mo3133(m826)) - mo3134);
            if (abs < i) {
                view = m826;
                i = abs;
            }
        }
        return view;
    }

    @Override // p034.p065.p066.AbstractC1373
    /* renamed from: 〺つふすそ */
    public int[] mo3097(RecyclerView.AbstractC0219 abstractC0219, View view) {
        int[] iArr = new int[2];
        if (abstractC0219.mo657()) {
            iArr[0] = m3142(view, m3144(abstractC0219));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0219.mo663()) {
            iArr[1] = m3142(view, m3143(abstractC0219));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int m3142(View view, AbstractC1385 abstractC1385) {
        return ((abstractC1385.mo3132(view) / 2) + abstractC1385.mo3133(view)) - ((abstractC1385.mo3134() / 2) + abstractC1385.mo3140());
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final AbstractC1385 m3143(RecyclerView.AbstractC0219 abstractC0219) {
        AbstractC1385 abstractC1385 = this.f6559;
        if (abstractC1385 == null || abstractC1385.f6557 != abstractC0219) {
            this.f6559 = new C1404(abstractC0219);
        }
        return this.f6559;
    }

    @Override // p034.p065.p066.AbstractC1373
    /* renamed from: くし〴〺ぅ */
    public C1380 mo3098(RecyclerView.AbstractC0219 abstractC0219) {
        if (abstractC0219 instanceof RecyclerView.AbstractC0214.InterfaceC0215) {
            return new C1387(this.f6528.getContext());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.p065.p066.AbstractC1373
    /* renamed from: づざかべべ */
    public int mo3100(RecyclerView.AbstractC0219 abstractC0219, int i, int i2) {
        PointF mo648;
        int m846 = abstractC0219.m846();
        if (m846 == 0) {
            return -1;
        }
        View view = null;
        AbstractC1385 m3143 = abstractC0219.mo663() ? m3143(abstractC0219) : abstractC0219.mo657() ? m3144(abstractC0219) : null;
        if (m3143 == null) {
            return -1;
        }
        int m836 = abstractC0219.m836();
        boolean z = false;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < m836; i5++) {
            View m826 = abstractC0219.m826(i5);
            if (m826 != null) {
                int m3142 = m3142(m826, m3143);
                if (m3142 <= 0 && m3142 > i3) {
                    view2 = m826;
                    i3 = m3142;
                }
                if (m3142 >= 0 && m3142 < i4) {
                    view = m826;
                    i4 = m3142;
                }
            }
        }
        boolean z2 = !abstractC0219.mo657() ? i2 <= 0 : i <= 0;
        if (z2 && view != null) {
            return abstractC0219.m857(view);
        }
        if (!z2 && view2 != null) {
            return abstractC0219.m857(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m857 = abstractC0219.m857(view);
        int m8462 = abstractC0219.m846();
        if ((abstractC0219 instanceof RecyclerView.AbstractC0214.InterfaceC0215) && (mo648 = ((RecyclerView.AbstractC0214.InterfaceC0215) abstractC0219).mo648(m8462 - 1)) != null && (mo648.x < 0.0f || mo648.y < 0.0f)) {
            z = true;
        }
        int i6 = m857 + (z == z2 ? -1 : 1);
        if (i6 < 0 || i6 >= m846) {
            return -1;
        }
        return i6;
    }

    @Override // p034.p065.p066.AbstractC1373
    /* renamed from: びぐびあび */
    public View mo1105(RecyclerView.AbstractC0219 abstractC0219) {
        throw null;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final AbstractC1385 m3144(RecyclerView.AbstractC0219 abstractC0219) {
        AbstractC1385 abstractC1385 = this.f6558;
        if (abstractC1385 == null || abstractC1385.f6557 != abstractC0219) {
            this.f6558 = new C1388(abstractC0219);
        }
        return this.f6558;
    }
}
