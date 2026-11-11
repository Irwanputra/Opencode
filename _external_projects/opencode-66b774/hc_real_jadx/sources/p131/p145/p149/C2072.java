package p131.p145.p149;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import p131.p145.p149.AbstractC2040;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2072 extends C2033 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f8852;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f8853;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f8854;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f8855;

    public C2072(AbstractC2040.C2042... c2042Arr) {
        super(c2042Arr);
        this.f8854 = true;
    }

    @Override // p131.p145.p149.C2033
    /* renamed from: 〺つふすそ */
    public Object mo4129(float f) {
        return Float.valueOf(m4160(f));
    }

    @Override // p131.p145.p149.C2033
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C2072 clone() {
        ArrayList<AbstractC2040> arrayList = this.f8778;
        int size = arrayList.size();
        AbstractC2040.C2042[] c2042Arr = new AbstractC2040.C2042[size];
        for (int i = 0; i < size; i++) {
            c2042Arr[i] = (AbstractC2040.C2042) arrayList.get(i).clone();
        }
        return new C2072(c2042Arr);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float m4160(float f) {
        int i = this.f8777;
        if (i == 2) {
            if (this.f8854) {
                this.f8854 = false;
                this.f8853 = ((AbstractC2040.C2042) this.f8778.get(0)).f8809;
                float f2 = ((AbstractC2040.C2042) this.f8778.get(1)).f8809;
                this.f8852 = f2;
                this.f8855 = f2 - this.f8853;
            }
            Interpolator interpolator = this.f8780;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            InterfaceC2062 interfaceC2062 = this.f8779;
            if (interfaceC2062 == null) {
                return (f * this.f8855) + this.f8853;
            }
            return ((Number) interfaceC2062.evaluate(f, Float.valueOf(this.f8853), Float.valueOf(this.f8852))).floatValue();
        }
        if (f <= 0.0f) {
            AbstractC2040.C2042 c2042 = (AbstractC2040.C2042) this.f8778.get(0);
            AbstractC2040.C2042 c20422 = (AbstractC2040.C2042) this.f8778.get(1);
            float f3 = c2042.f8809;
            float f4 = c20422.f8809;
            float f5 = c2042.f8804;
            float f6 = c20422.f8804;
            Interpolator interpolator2 = c20422.f8807;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            InterfaceC2062 interfaceC20622 = this.f8779;
            return interfaceC20622 == null ? C2098.m4188(f4, f3, f7, f3) : ((Number) interfaceC20622.evaluate(f7, Float.valueOf(f3), Float.valueOf(f4))).floatValue();
        }
        if (f >= 1.0f) {
            AbstractC2040.C2042 c20423 = (AbstractC2040.C2042) this.f8778.get(i - 2);
            AbstractC2040.C2042 c20424 = (AbstractC2040.C2042) this.f8778.get(this.f8777 - 1);
            float f8 = c20423.f8809;
            float f9 = c20424.f8809;
            float f10 = c20423.f8804;
            float f11 = c20424.f8804;
            Interpolator interpolator3 = c20424.f8807;
            if (interpolator3 != null) {
                f = interpolator3.getInterpolation(f);
            }
            float f12 = (f - f10) / (f11 - f10);
            InterfaceC2062 interfaceC20623 = this.f8779;
            return interfaceC20623 == null ? C2098.m4188(f9, f8, f12, f8) : ((Number) interfaceC20623.evaluate(f12, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        }
        AbstractC2040.C2042 c20425 = (AbstractC2040.C2042) this.f8778.get(0);
        int i2 = 1;
        while (true) {
            int i3 = this.f8777;
            if (i2 >= i3) {
                return ((Number) this.f8778.get(i3 - 1).mo4143()).floatValue();
            }
            AbstractC2040.C2042 c20426 = (AbstractC2040.C2042) this.f8778.get(i2);
            if (f < c20426.f8804) {
                Interpolator interpolator4 = c20426.f8807;
                if (interpolator4 != null) {
                    f = interpolator4.getInterpolation(f);
                }
                float f13 = c20425.f8804;
                float f14 = (f - f13) / (c20426.f8804 - f13);
                float f15 = c20425.f8809;
                float f16 = c20426.f8809;
                InterfaceC2062 interfaceC20624 = this.f8779;
                return interfaceC20624 == null ? C2098.m4188(f16, f15, f14, f15) : ((Number) interfaceC20624.evaluate(f14, Float.valueOf(f15), Float.valueOf(f16))).floatValue();
            }
            i2++;
            c20425 = c20426;
        }
    }
}
