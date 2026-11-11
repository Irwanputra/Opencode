package p034.p065.p066;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1376 extends AbstractC1373 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AbstractC1385 f6532;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AbstractC1385 f6533;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int m3103(RecyclerView.AbstractC0219 abstractC0219, AbstractC1385 abstractC1385, int i, int i2) {
        int max;
        this.f6526.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f6526.getFinalX(), this.f6526.getFinalY()};
        int m836 = abstractC0219.m836();
        float f = 1.0f;
        if (m836 != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 = 0; i5 < m836; i5++) {
                View m826 = abstractC0219.m826(i5);
                int m857 = abstractC0219.m857(m826);
                if (m857 != -1) {
                    if (m857 < i3) {
                        view = m826;
                        i3 = m857;
                    }
                    if (m857 > i4) {
                        view2 = m826;
                        i4 = m857;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(abstractC1385.mo3127(view), abstractC1385.mo3127(view2)) - Math.min(abstractC1385.mo3133(view), abstractC1385.mo3133(view2))) != 0) {
                f = (max * 1.0f) / ((i4 - i3) + 1);
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    @Override // p034.p065.p066.AbstractC1373
    /* renamed from: 〺つふすそ */
    public int[] mo3097(RecyclerView.AbstractC0219 abstractC0219, View view) {
        int[] iArr = new int[2];
        if (abstractC0219.mo657()) {
            iArr[0] = m3104(view, m3105(abstractC0219));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0219.mo663()) {
            iArr[1] = m3104(view, m3107(abstractC0219));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int m3104(View view, AbstractC1385 abstractC1385) {
        return ((abstractC1385.mo3132(view) / 2) + abstractC1385.mo3133(view)) - ((abstractC1385.mo3134() / 2) + abstractC1385.mo3140());
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final AbstractC1385 m3105(RecyclerView.AbstractC0219 abstractC0219) {
        AbstractC1385 abstractC1385 = this.f6532;
        if (abstractC1385 == null || abstractC1385.f6557 != abstractC0219) {
            this.f6532 = new C1388(abstractC0219);
        }
        return this.f6532;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.p065.p066.AbstractC1373
    /* renamed from: づざかべべ */
    public int mo3100(RecyclerView.AbstractC0219 abstractC0219, int i, int i2) {
        int m846;
        View mo1105;
        int m857;
        int i3;
        PointF mo648;
        int i4;
        int i5;
        if (!(abstractC0219 instanceof RecyclerView.AbstractC0214.InterfaceC0215) || (m846 = abstractC0219.m846()) == 0 || (mo1105 = mo1105(abstractC0219)) == null || (m857 = abstractC0219.m857(mo1105)) == -1 || (mo648 = ((RecyclerView.AbstractC0214.InterfaceC0215) abstractC0219).mo648(m846 - 1)) == null) {
            return -1;
        }
        if (abstractC0219.mo657()) {
            i4 = m3103(abstractC0219, m3105(abstractC0219), i, 0);
            if (mo648.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (abstractC0219.mo663()) {
            i5 = m3103(abstractC0219, m3107(abstractC0219), 0, i2);
            if (mo648.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (abstractC0219.mo663()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = m857 + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= m846 ? i3 : i7;
    }

    @Override // p034.p065.p066.AbstractC1373
    /* renamed from: びぐびあび */
    public View mo1105(RecyclerView.AbstractC0219 abstractC0219) {
        AbstractC1385 m3105;
        if (abstractC0219.mo663()) {
            m3105 = m3107(abstractC0219);
        } else {
            if (!abstractC0219.mo657()) {
                return null;
            }
            m3105 = m3105(abstractC0219);
        }
        return m3106(abstractC0219, m3105);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final View m3106(RecyclerView.AbstractC0219 abstractC0219, AbstractC1385 abstractC1385) {
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

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final AbstractC1385 m3107(RecyclerView.AbstractC0219 abstractC0219) {
        AbstractC1385 abstractC1385 = this.f6533;
        if (abstractC1385 == null || abstractC1385.f6557 != abstractC0219) {
            this.f6533 = new C1404(abstractC0219);
        }
        return this.f6533;
    }
}
