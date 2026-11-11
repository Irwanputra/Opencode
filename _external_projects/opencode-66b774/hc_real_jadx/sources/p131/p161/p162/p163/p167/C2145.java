package p131.p161.p162.p163.p167;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import p034.p035.p043.p044.AbstractC1059;
import p034.p035.p043.p044.C1056;
import p034.p095.C1687;
import p131.p161.p162.p163.C2243;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぅみぱぎぎ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2145 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final float f8986;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ColorStateList f8987;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final float f8988;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int f8989;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f8990;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final float f8991;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String f8992;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Typeface f8993;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final ColorStateList f8994;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f8995;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final float f8996;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f8997 = false;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぅみぱぎぎ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2146 extends AbstractC1059 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2150 f8999;

        public C2146(AbstractC2150 abstractC2150) {
            this.f8999 = abstractC2150;
        }

        @Override // p034.p035.p043.p044.AbstractC1059
        /* renamed from: くし〴〺ぅ */
        public void mo2398(int i) {
            C2145.this.f8997 = true;
            this.f8999.mo1391(i);
        }

        @Override // p034.p035.p043.p044.AbstractC1059
        /* renamed from: びぐびあび */
        public void mo2400(Typeface typeface) {
            C2145 c2145 = C2145.this;
            c2145.f8993 = Typeface.create(typeface, c2145.f8990);
            C2145 c21452 = C2145.this;
            c21452.f8997 = true;
            this.f8999.mo1390(c21452.f8993, false);
        }
    }

    public C2145(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C2243.TextAppearance);
        this.f8991 = obtainStyledAttributes.getDimension(C2243.TextAppearance_android_textSize, 0.0f);
        this.f8987 = C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_textColor);
        C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_textColorHint);
        C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_textColorLink);
        this.f8990 = obtainStyledAttributes.getInt(C2243.TextAppearance_android_textStyle, 0);
        this.f8995 = obtainStyledAttributes.getInt(C2243.TextAppearance_android_typeface, 1);
        int i2 = C2243.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : C2243.TextAppearance_android_fontFamily;
        this.f8989 = obtainStyledAttributes.getResourceId(i2, 0);
        this.f8992 = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(C2243.TextAppearance_textAllCaps, false);
        this.f8994 = C1687.m3662(context, obtainStyledAttributes, C2243.TextAppearance_android_shadowColor);
        this.f8988 = obtainStyledAttributes.getFloat(C2243.TextAppearance_android_shadowDx, 0.0f);
        this.f8986 = obtainStyledAttributes.getFloat(C2243.TextAppearance_android_shadowDy, 0.0f);
        this.f8996 = obtainStyledAttributes.getFloat(C2243.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4230(Context context, AbstractC2150 abstractC2150) {
        m4232();
        int i = this.f8989;
        if (i == 0) {
            this.f8997 = true;
        }
        if (this.f8997) {
            abstractC2150.mo1390(this.f8993, true);
            return;
        }
        try {
            C2146 c2146 = new C2146(abstractC2150);
            if (context.isRestricted()) {
                c2146.m2399(-4, null);
            } else {
                C1056.m2388(context, i, new TypedValue(), 0, c2146, null, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f8997 = true;
            abstractC2150.mo1391(1);
        } catch (Exception unused2) {
            this.f8997 = true;
            abstractC2150.mo1391(-3);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4231(Context context, TextPaint textPaint, AbstractC2150 abstractC2150) {
        m4232();
        m4233(textPaint, this.f8993);
        m4230(context, new C2147(this, textPaint, abstractC2150));
        ColorStateList colorStateList = this.f8987;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f8996;
        float f2 = this.f8988;
        float f3 = this.f8986;
        ColorStateList colorStateList2 = this.f8994;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4232() {
        String str;
        if (this.f8993 == null && (str = this.f8992) != null) {
            this.f8993 = Typeface.create(str, this.f8990);
        }
        if (this.f8993 == null) {
            int i = this.f8995;
            this.f8993 = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f8993 = Typeface.create(this.f8993, this.f8990);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m4233(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f8990;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f8991);
    }
}
