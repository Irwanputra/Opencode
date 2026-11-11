package p131.p161.p162.p163.p179;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2179;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.C2186;
import p131.p161.p162.p163.p173.C2189;
import p131.p161.p162.p163.p181.C2235;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ざっざへづ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2231 {

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static final int[] f9264 = {R.attr.state_checked};

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static final double f9265 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Drawable f9266;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f9268;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ColorStateList f9269;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public C2163 f9270;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public C2163 f9271;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public LayerDrawable f9272;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2163 f9273;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final MaterialCardView f9274;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f9276;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C2180 f9277;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f9278;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ColorStateList f9279;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f9280;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2163 f9281;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Drawable f9282;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Drawable f9283;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public ColorStateList f9284;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Rect f9267 = new Rect();

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f9275 = false;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ざっざへづ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2232 extends InsetDrawable {
        public C2232(C2231 c2231, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C2231(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f9274 = materialCardView;
        C2163 c2163 = new C2163(materialCardView.getContext(), attributeSet, i, i2);
        this.f9273 = c2163;
        c2163.m4249(materialCardView.getContext());
        c2163.m4266(-12303292);
        C2180 c2180 = c2163.f9045.f9074;
        c2180.getClass();
        C2180.C2181 c2181 = new C2180.C2181(c2180);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C2243.CardView, i, C2350.CardView);
        int i3 = C2243.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            c2181.m4290(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f9281 = new C2163();
        m4342(c2181.m4291());
        Resources resources = materialCardView.getResources();
        this.f9276 = resources.getDimensionPixelSize(C2324.mtrl_card_checked_icon_margin);
        this.f9278 = resources.getDimensionPixelSize(C2324.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4329(Drawable drawable) {
        this.f9283 = drawable;
        if (drawable != null) {
            Drawable m4758 = C2786.m4758(drawable.mutate());
            this.f9283 = m4758;
            C2786.m4788(m4758, this.f9284);
        }
        if (this.f9272 != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.f9283;
            if (drawable2 != null) {
                stateListDrawable.addState(f9264, drawable2);
            }
            this.f9272.setDrawableByLayerId(C2248.mtrl_card_checked_layer_id, stateListDrawable);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final float m4330(C2186 c2186, float f) {
        if (!(c2186 instanceof C2189)) {
            if (c2186 instanceof C2179) {
                return f / 2.0f;
            }
            return 0.0f;
        }
        double d = 1.0d - f9265;
        double d2 = f;
        Double.isNaN(d2);
        return (float) (d * d2);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Drawable m4331(Drawable drawable) {
        int ceil;
        int i;
        if ((Build.VERSION.SDK_INT < 21) || this.f9274.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(m4340());
            ceil = (int) Math.ceil(m4334());
            i = ceil2;
        } else {
            ceil = 0;
            i = 0;
        }
        return new C2232(this, drawable, ceil, i, ceil, i);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean m4332() {
        return this.f9274.getPreventCornerOverlap() && !m4336();
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m4333() {
        this.f9281.m4264(this.f9268, this.f9279);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final float m4334() {
        return this.f9274.getMaxCardElevation() + (m4343() ? m4335() : 0.0f);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final float m4335() {
        return Math.max(Math.max(m4330(this.f9277.f9123, this.f9273.m4267()), m4330(this.f9277.f9119, this.f9273.m4250())), Math.max(m4330(this.f9277.f9122, this.f9273.m4268()), m4330(this.f9277.f9127, this.f9273.m4240())));
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean m4336() {
        return Build.VERSION.SDK_INT >= 21 && this.f9273.m4254();
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m4337() {
        float f = 0.0f;
        float m4335 = m4332() || m4343() ? m4335() : 0.0f;
        if (this.f9274.getPreventCornerOverlap() && (Build.VERSION.SDK_INT < 21 || this.f9274.getUseCompatPadding())) {
            double d = 1.0d - f9265;
            double cardViewRadius = this.f9274.getCardViewRadius();
            Double.isNaN(cardViewRadius);
            Double.isNaN(cardViewRadius);
            f = (float) (d * cardViewRadius);
        }
        int i = (int) (m4335 - f);
        MaterialCardView materialCardView = this.f9274;
        Rect rect = this.f9267;
        materialCardView.m1373(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Drawable m4338() {
        Drawable drawable;
        if (this.f9282 == null) {
            if (C2235.f9290) {
                this.f9271 = new C2163(this.f9277);
                drawable = new RippleDrawable(this.f9269, null, this.f9271);
            } else {
                StateListDrawable stateListDrawable = new StateListDrawable();
                C2163 c2163 = new C2163(this.f9277);
                this.f9270 = c2163;
                c2163.m4252(this.f9269);
                stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f9270);
                drawable = stateListDrawable;
            }
            this.f9282 = drawable;
        }
        if (this.f9272 == null) {
            StateListDrawable stateListDrawable2 = new StateListDrawable();
            Drawable drawable2 = this.f9283;
            if (drawable2 != null) {
                stateListDrawable2.addState(f9264, drawable2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f9282, this.f9281, stateListDrawable2});
            this.f9272 = layerDrawable;
            layerDrawable.setId(2, C2248.mtrl_card_checked_layer_id);
        }
        return this.f9272;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m4339() {
        if (!this.f9275) {
            this.f9274.setBackgroundInternal(m4331(this.f9273));
        }
        this.f9274.setForeground(m4331(this.f9266));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final float m4340() {
        return (this.f9274.getMaxCardElevation() * 1.5f) + (m4343() ? m4335() : 0.0f);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final void m4341() {
        Drawable drawable;
        if (C2235.f9290 && (drawable = this.f9282) != null) {
            ((RippleDrawable) drawable).setColor(this.f9269);
            return;
        }
        C2163 c2163 = this.f9270;
        if (c2163 != null) {
            c2163.m4252(this.f9269);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m4342(C2180 c2180) {
        this.f9277 = c2180;
        C2163 c2163 = this.f9273;
        c2163.f9045.f9074 = c2180;
        c2163.invalidateSelf();
        this.f9273.f9062 = !r0.m4254();
        C2163 c21632 = this.f9281;
        if (c21632 != null) {
            c21632.f9045.f9074 = c2180;
            c21632.invalidateSelf();
        }
        C2163 c21633 = this.f9271;
        if (c21633 != null) {
            c21633.f9045.f9074 = c2180;
            c21633.invalidateSelf();
        }
        C2163 c21634 = this.f9270;
        if (c21634 != null) {
            c21634.f9045.f9074 = c2180;
            c21634.invalidateSelf();
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final boolean m4343() {
        return this.f9274.getPreventCornerOverlap() && m4336() && this.f9274.getUseCompatPadding();
    }
}
