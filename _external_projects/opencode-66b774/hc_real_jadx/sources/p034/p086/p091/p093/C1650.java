package p034.p086.p091.p093;

import p034.p086.p091.p092.AbstractC1587;
import p034.p086.p091.p092.AbstractC1626;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1650 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f7718;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f7719;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float f7720;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f7721;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7722;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f7723;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3586(AbstractC1587 abstractC1587, float f) {
        if (abstractC1587 != null) {
            double d = f;
            this.f7721 = (float) abstractC1587.f7536.mo3595(d, 0);
            this.f7722 = (float) abstractC1587.f7536.mo3592(d, 0);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3587(AbstractC1626 abstractC1626, AbstractC1626 abstractC16262, float f) {
        if (abstractC1626 == null && abstractC16262 == null) {
            return;
        }
        if (abstractC1626 == null) {
            this.f7720 = abstractC1626.m3573(f);
        }
        if (abstractC16262 == null) {
            this.f7718 = abstractC16262.m3573(f);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3588(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f7719;
        float f8 = f4 + this.f7723;
        float f9 = (this.f7720 * f5) + f7;
        float f10 = (this.f7718 * f6) + f8;
        float radians = (float) Math.toRadians(this.f7722);
        float radians2 = (float) Math.toRadians(this.f7721);
        double d = (-i) * f5;
        double d2 = radians;
        double sin = Math.sin(d2);
        Double.isNaN(d);
        double d3 = sin * d;
        double d4 = i2 * f6;
        double cos = Math.cos(d2);
        Double.isNaN(d4);
        float f11 = (((float) (d3 - (cos * d4))) * radians2) + f9;
        double d5 = i * f5;
        double cos2 = Math.cos(d2);
        Double.isNaN(d5);
        double d6 = cos2 * d5;
        double sin2 = Math.sin(d2);
        Double.isNaN(d4);
        fArr[0] = f11;
        fArr[1] = (radians2 * ((float) (d6 - (sin2 * d4)))) + f10;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m3589(AbstractC1587 abstractC1587, AbstractC1587 abstractC15872, float f) {
        if (abstractC1587 != null) {
            this.f7719 = (float) abstractC1587.f7536.mo3595(f, 0);
        }
        if (abstractC15872 != null) {
            this.f7723 = (float) abstractC15872.f7536.mo3595(f, 0);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3590(AbstractC1587 abstractC1587, AbstractC1587 abstractC15872, float f) {
        if (abstractC1587 != null) {
            this.f7720 = (float) abstractC1587.f7536.mo3595(f, 0);
        }
        if (abstractC15872 != null) {
            this.f7718 = (float) abstractC15872.f7536.mo3595(f, 0);
        }
    }
}
