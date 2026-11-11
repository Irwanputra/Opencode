package p034.p065.p066;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1404 extends AbstractC1385 {
    public C1404(RecyclerView.AbstractC0219 abstractC0219) {
        super(abstractC0219, null);
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: 〳ぜぞぜべっ */
    public int mo3126() {
        return this.f6557.m847();
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: 〺つふすそ */
    public int mo3127(View view) {
        return this.f6557.m863(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: ぁごぐすすぃ */
    public int mo3128() {
        RecyclerView.AbstractC0219 abstractC0219 = this.f6557;
        return abstractC0219.f1523 - abstractC0219.m847();
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: いいにぽつ */
    public int mo3129() {
        return this.f6557.f1532;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: ぇぬぎばつ */
    public void mo3130(int i) {
        this.f6557.mo842(i);
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: おぐぴう〸ず */
    public int mo3131(View view) {
        this.f6557.m848(view, true, this.f6556);
        return this.f6556.top;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: くし〴〺ぅ */
    public int mo3132(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f6557.m853(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: づざかべべ */
    public int mo3133(View view) {
        return this.f6557.m856(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: てぜきぽく */
    public int mo3134() {
        RecyclerView.AbstractC0219 abstractC0219 = this.f6557;
        return (abstractC0219.f1523 - abstractC0219.m860()) - this.f6557.m847();
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: なぎぱいぢぎ */
    public int mo3135() {
        return this.f6557.f1523;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: びぐびあび */
    public int mo3137(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f6557.m875(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: へぬ〴づぞ */
    public int mo3138(View view) {
        this.f6557.m848(view, true, this.f6556);
        return this.f6556.bottom;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: ぺぁあねじ */
    public int mo3139() {
        return this.f6557.f1524;
    }

    @Override // p034.p065.p066.AbstractC1385
    /* renamed from: ぺふねづ〺 */
    public int mo3140() {
        return this.f6557.m860();
    }
}
