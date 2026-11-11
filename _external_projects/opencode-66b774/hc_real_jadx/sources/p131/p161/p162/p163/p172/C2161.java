package p131.p161.p162.p163.p172;

import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.p173.C2170;
import p131.p161.p162.p163.p173.C2183;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉざぅち〻.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2161 extends C2183 implements Cloneable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f9036;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f9037;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f9038;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f9039;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f9040;

    public C2161(float f, float f2, float f3) {
        this.f9037 = f;
        this.f9036 = f2;
        m4239(f3);
        this.f9039 = 0.0f;
    }

    @Override // p131.p161.p162.p163.p173.C2183
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo4238(float f, float f2, float f3, C2170 c2170) {
        float f4 = this.f9040;
        if (f4 == 0.0f) {
            c2170.m4278(f, 0.0f);
            return;
        }
        float f5 = ((this.f9037 * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f9036;
        float f7 = f2 + this.f9039;
        float m4188 = C2098.m4188(1.0f, f3, f5, this.f9038 * f3);
        if (m4188 / f5 >= 1.0f) {
            c2170.m4278(f, 0.0f);
            return;
        }
        float f8 = f5 + f6;
        float f9 = m4188 + f6;
        float sqrt = (float) Math.sqrt((f8 * f8) - (f9 * f9));
        float f10 = f7 - sqrt;
        float f11 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f9));
        float f12 = 90.0f - degrees;
        c2170.m4278(f10, 0.0f);
        float f13 = f6 * 2.0f;
        c2170.m4275(f10 - f6, 0.0f, f10 + f6, f13, 270.0f, degrees);
        c2170.m4275(f7 - f5, (-f5) - m4188, f7 + f5, f5 - m4188, 180.0f - f12, (f12 * 2.0f) - 180.0f);
        c2170.m4275(f11 - f6, 0.0f, f11 + f6, f13, 270.0f - degrees, degrees);
        c2170.m4278(f, 0.0f);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4239(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f9038 = f;
    }
}
