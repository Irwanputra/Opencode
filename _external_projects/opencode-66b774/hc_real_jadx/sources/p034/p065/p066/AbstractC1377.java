package p034.p065.p066;

import androidx.recyclerview.widget.RecyclerView;
import p034.p065.p066.C1412;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1377 extends RecyclerView.AbstractC0231 {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f6534 = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0231
    /* renamed from: げつ〴ぬぐ */
    public boolean mo896(RecyclerView.AbstractC0207 abstractC0207, RecyclerView.AbstractC0207 abstractC02072, RecyclerView.AbstractC0231.C0233 c0233, RecyclerView.AbstractC0231.C0233 c02332) {
        int i;
        int i2;
        int i3 = c0233.f1564;
        int i4 = c0233.f1563;
        if (abstractC02072.m772()) {
            int i5 = c0233.f1564;
            i2 = c0233.f1563;
            i = i5;
        } else {
            i = c02332.f1564;
            i2 = c02332.f1563;
        }
        C1412 c1412 = (C1412) this;
        if (abstractC0207 == abstractC02072) {
            return c1412.mo3108(abstractC0207, i3, i4, i, i2);
        }
        float translationX = abstractC0207.f1476.getTranslationX();
        float translationY = abstractC0207.f1476.getTranslationY();
        float alpha = abstractC0207.f1476.getAlpha();
        c1412.m3181(abstractC0207);
        abstractC0207.f1476.setTranslationX(translationX);
        abstractC0207.f1476.setTranslationY(translationY);
        abstractC0207.f1476.setAlpha(alpha);
        c1412.m3181(abstractC02072);
        abstractC02072.f1476.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC02072.f1476.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC02072.f1476.setAlpha(0.0f);
        c1412.f6659.add(new C1412.C1414(abstractC0207, abstractC02072, i3, i4, i, i2));
        return true;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public abstract boolean mo3108(RecyclerView.AbstractC0207 abstractC0207, int i, int i2, int i3, int i4);
}
