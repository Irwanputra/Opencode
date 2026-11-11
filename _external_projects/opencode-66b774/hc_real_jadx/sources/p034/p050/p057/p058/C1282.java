package p034.p050.p057.p058;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p034.p050.p057.p058.C1269;

@SuppressLint({"RestrictedAPI"})
/* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1282 extends C1269 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f6238;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C1283 f6239;

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1283 extends C1269.AbstractC1271 {

        /* renamed from: けときぜと, reason: contains not printable characters */
        public int[][] f6240;

        public C1283(C1283 c1283, C1282 c1282, Resources resources) {
            super(c1283, c1282, resources);
            if (c1283 != null) {
                this.f6240 = c1283.f6240;
            } else {
                this.f6240 = new int[this.f6190.length][];
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1282(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1282(this, resources);
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int m2949(int[] iArr) {
            int[][] iArr2 = this.f6240;
            int i = this.f6187;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // p034.p050.p057.p058.C1269.AbstractC1271
        /* renamed from: づざかべべ */
        public void mo2938() {
            int[][] iArr = this.f6240;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f6240;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f6240 = iArr2;
        }
    }

    public C1282(C1283 c1283) {
    }

    public C1282(C1283 c1283, Resources resources) {
        mo2933(new C1283(c1283, this, resources));
        onStateChange(getState());
    }

    @Override // p034.p050.p057.p058.C1269, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p034.p050.p057.p058.C1269, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6238) {
            super.mutate();
            if (this == this) {
                this.f6239.mo2938();
                this.f6238 = true;
            }
        }
        return this;
    }

    @Override // p034.p050.p057.p058.C1269, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m2949 = this.f6239.m2949(iArr);
        if (m2949 < 0) {
            m2949 = this.f6239.m2949(StateSet.WILD_CARD);
        }
        return m2934(m2949) || onStateChange;
    }

    @Override // p034.p050.p057.p058.C1269
    /* renamed from: づざかべべ */
    public void mo2933(C1269.AbstractC1271 abstractC1271) {
        this.f6175 = abstractC1271;
        int i = this.f6174;
        if (i >= 0) {
            Drawable m2940 = abstractC1271.m2940(i);
            this.f6183 = m2940;
            if (m2940 != null) {
                m2931(m2940);
            }
        }
        this.f6179 = null;
        if (abstractC1271 instanceof C1283) {
            this.f6239 = (C1283) abstractC1271;
        }
    }

    @Override // p034.p050.p057.p058.C1269
    /* renamed from: なぎぱいぢぎ, reason: merged with bridge method [inline-methods] */
    public C1283 mo2930() {
        return new C1283(this.f6239, this, null);
    }
}
