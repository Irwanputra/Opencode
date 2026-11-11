package p034.p065.p066;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1385 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f6555 = Integer.MIN_VALUE;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Rect f6556 = new Rect();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final RecyclerView.AbstractC0219 f6557;

    public AbstractC1385(RecyclerView.AbstractC0219 abstractC0219, C1388 c1388) {
        this.f6557 = abstractC0219;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static AbstractC1385 m3125(RecyclerView.AbstractC0219 abstractC0219, int i) {
        if (i == 0) {
            return new C1388(abstractC0219);
        }
        if (i == 1) {
            return new C1404(abstractC0219);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public abstract int mo3126();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract int mo3127(View view);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public abstract int mo3128();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public abstract int mo3129();

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public abstract void mo3130(int i);

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public abstract int mo3131(View view);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract int mo3132(View view);

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public abstract int mo3133(View view);

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public abstract int mo3134();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public abstract int mo3135();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int m3136() {
        if (Integer.MIN_VALUE == this.f6555) {
            return 0;
        }
        return mo3134() - this.f6555;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public abstract int mo3137(View view);

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public abstract int mo3138(View view);

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public abstract int mo3139();

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public abstract int mo3140();
}
