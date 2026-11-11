package p034.p086.p091.p093;

import p034.p086.p091.p092.AbstractInterpolatorC1646;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1653 extends AbstractInterpolatorC1646 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7726;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f7727;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f7728;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f7729;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f7730;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float f7731;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f7732;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f7733;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7734;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public float f7735;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f7736;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7737;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f7738 = false;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2;
        float f3 = this.f7736;
        if (f <= f3) {
            float f4 = this.f7731;
            f2 = ((((this.f7727 - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f7729;
            if (i == 1) {
                f2 = this.f7728;
            } else {
                float f5 = f - f3;
                float f6 = this.f7732;
                if (f5 < f6) {
                    float f7 = this.f7728;
                    float f8 = this.f7727;
                    f2 = ((((this.f7730 - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f7726;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f7734;
                    if (f9 < f10) {
                        float f11 = this.f7726;
                        float f12 = this.f7730 * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f7737;
                    }
                }
            }
        }
        this.f7735 = f;
        return this.f7738 ? this.f7733 - f2 : this.f7733 + f2;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3598(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        C1653 c1653;
        float f8;
        this.f7733 = f;
        boolean z = f > f2;
        this.f7738 = z;
        if (z) {
            f8 = -f3;
            f7 = f - f2;
            c1653 = this;
        } else {
            f7 = f2 - f;
            c1653 = this;
            f8 = f3;
        }
        c1653.m3600(f8, f7, f5, f6, f4);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float m3599(float f) {
        float f2;
        float f3;
        float f4 = this.f7736;
        if (f <= f4) {
            f2 = this.f7731;
            f3 = this.f7727;
        } else {
            int i = this.f7729;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f7732;
            if (f >= f4) {
                if (i == 2) {
                    return this.f7726;
                }
                float f5 = f - f4;
                float f6 = this.f7734;
                if (f5 >= f6) {
                    return this.f7737;
                }
                float f7 = this.f7730;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.f7727;
            f3 = this.f7730;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // p034.p086.p091.p092.AbstractInterpolatorC1646
    /* renamed from: げつ〴ぬぐ */
    public float mo277() {
        return this.f7738 ? -m3599(this.f7735) : m3599(this.f7735);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m3600(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f7731 = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.f7729 = 2;
                this.f7731 = f;
                this.f7727 = sqrt;
                this.f7730 = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f7736 = f8;
                this.f7732 = sqrt / f3;
                this.f7728 = ((f + sqrt) * f8) / 2.0f;
                this.f7726 = f2;
                this.f7737 = f2;
                return;
            }
            this.f7729 = 3;
            this.f7731 = f;
            this.f7727 = f4;
            this.f7730 = f4;
            float f9 = (f4 - f) / f3;
            this.f7736 = f9;
            float f10 = f4 / f3;
            this.f7734 = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f7732 = ((f2 - f11) - f12) / f4;
            this.f7728 = f11;
            this.f7726 = f2 - f12;
            this.f7737 = f2;
            return;
        }
        if (f7 >= f2) {
            this.f7729 = 1;
            this.f7731 = f;
            this.f7727 = 0.0f;
            this.f7728 = f2;
            this.f7736 = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f7729 = 2;
            this.f7731 = f;
            this.f7727 = f;
            this.f7730 = 0.0f;
            this.f7728 = f13;
            this.f7726 = f2;
            this.f7736 = f14;
            this.f7732 = f6;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (sqrt2 - f) / f3;
        this.f7736 = f15;
        float f16 = sqrt2 / f3;
        this.f7732 = f16;
        if (sqrt2 < f4) {
            this.f7729 = 2;
            this.f7731 = f;
            this.f7727 = sqrt2;
            this.f7730 = 0.0f;
            this.f7736 = f15;
            this.f7732 = f16;
            this.f7728 = ((f + sqrt2) * f15) / 2.0f;
            this.f7726 = f2;
            return;
        }
        this.f7729 = 3;
        this.f7731 = f;
        this.f7727 = f4;
        this.f7730 = f4;
        float f17 = (f4 - f) / f3;
        this.f7736 = f17;
        float f18 = f4 / f3;
        this.f7734 = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f7732 = ((f2 - f19) - f20) / f4;
        this.f7728 = f19;
        this.f7726 = f2 - f20;
        this.f7737 = f2;
    }
}
