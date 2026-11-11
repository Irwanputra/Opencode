package p131.p145.p149;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import p131.p145.p149.AbstractC2040;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2063 extends C2033 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f8825;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f8826;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f8827;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f8828;

    public C2063(AbstractC2040.C2041... c2041Arr) {
        super(c2041Arr);
        this.f8827 = true;
    }

    @Override // p131.p145.p149.C2033
    /* renamed from: 〺つふすそ */
    public Object mo4129(float f) {
        return Integer.valueOf(m4149(f));
    }

    @Override // p131.p145.p149.C2033
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C2063 clone() {
        ArrayList<AbstractC2040> arrayList = this.f8778;
        int size = arrayList.size();
        AbstractC2040.C2041[] c2041Arr = new AbstractC2040.C2041[size];
        for (int i = 0; i < size; i++) {
            c2041Arr[i] = (AbstractC2040.C2041) arrayList.get(i).clone();
        }
        return new C2063(c2041Arr);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m4149(float f) {
        Object mo4143;
        int i = this.f8777;
        if (i != 2) {
            if (f > 0.0f) {
                if (f < 1.0f) {
                    AbstractC2040.C2041 c2041 = (AbstractC2040.C2041) this.f8778.get(0);
                    int i2 = 1;
                    while (true) {
                        int i3 = this.f8777;
                        if (i2 >= i3) {
                            mo4143 = this.f8778.get(i3 - 1).mo4143();
                            break;
                        }
                        AbstractC2040.C2041 c20412 = (AbstractC2040.C2041) this.f8778.get(i2);
                        if (f < c20412.f8804) {
                            Interpolator interpolator = c20412.f8807;
                            if (interpolator != null) {
                                f = interpolator.getInterpolation(f);
                            }
                            float f2 = c2041.f8804;
                            float f3 = (f - f2) / (c20412.f8804 - f2);
                            int i4 = c2041.f8808;
                            int i5 = c20412.f8808;
                            InterfaceC2062 interfaceC2062 = this.f8779;
                            return interfaceC2062 == null ? i4 + ((int) (f3 * (i5 - i4))) : ((Number) interfaceC2062.evaluate(f3, Integer.valueOf(i4), Integer.valueOf(i5))).intValue();
                        }
                        i2++;
                        c2041 = c20412;
                    }
                } else {
                    AbstractC2040.C2041 c20413 = (AbstractC2040.C2041) this.f8778.get(i - 2);
                    AbstractC2040.C2041 c20414 = (AbstractC2040.C2041) this.f8778.get(this.f8777 - 1);
                    int i6 = c20413.f8808;
                    int i7 = c20414.f8808;
                    float f4 = c20413.f8804;
                    float f5 = c20414.f8804;
                    Interpolator interpolator2 = c20414.f8807;
                    if (interpolator2 != null) {
                        f = interpolator2.getInterpolation(f);
                    }
                    float f6 = (f - f4) / (f5 - f4);
                    InterfaceC2062 interfaceC20622 = this.f8779;
                    return interfaceC20622 == null ? i6 + ((int) (f6 * (i7 - i6))) : ((Number) interfaceC20622.evaluate(f6, Integer.valueOf(i6), Integer.valueOf(i7))).intValue();
                }
            } else {
                AbstractC2040.C2041 c20415 = (AbstractC2040.C2041) this.f8778.get(0);
                AbstractC2040.C2041 c20416 = (AbstractC2040.C2041) this.f8778.get(1);
                int i8 = c20415.f8808;
                int i9 = c20416.f8808;
                float f7 = c20415.f8804;
                float f8 = c20416.f8804;
                Interpolator interpolator3 = c20416.f8807;
                if (interpolator3 != null) {
                    f = interpolator3.getInterpolation(f);
                }
                float f9 = (f - f7) / (f8 - f7);
                InterfaceC2062 interfaceC20623 = this.f8779;
                return interfaceC20623 == null ? i8 + ((int) (f9 * (i9 - i8))) : ((Number) interfaceC20623.evaluate(f9, Integer.valueOf(i8), Integer.valueOf(i9))).intValue();
            }
        } else {
            if (this.f8827) {
                this.f8827 = false;
                this.f8826 = ((AbstractC2040.C2041) this.f8778.get(0)).f8808;
                int i10 = ((AbstractC2040.C2041) this.f8778.get(1)).f8808;
                this.f8825 = i10;
                this.f8828 = i10 - this.f8826;
            }
            Interpolator interpolator4 = this.f8780;
            if (interpolator4 != null) {
                f = interpolator4.getInterpolation(f);
            }
            InterfaceC2062 interfaceC20624 = this.f8779;
            if (interfaceC20624 == null) {
                return this.f8826 + ((int) (f * this.f8828));
            }
            mo4143 = interfaceC20624.evaluate(f, Integer.valueOf(this.f8826), Integer.valueOf(this.f8825));
        }
        return ((Number) mo4143).intValue();
    }
}
