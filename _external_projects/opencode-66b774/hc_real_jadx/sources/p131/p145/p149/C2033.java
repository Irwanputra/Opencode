package p131.p145.p149;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2033 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC2040 f8775;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC2040 f8776;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f8777;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ArrayList<AbstractC2040> f8778;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC2062 f8779;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Interpolator f8780;

    public C2033(AbstractC2040... abstractC2040Arr) {
        this.f8777 = abstractC2040Arr.length;
        ArrayList<AbstractC2040> arrayList = new ArrayList<>();
        this.f8778 = arrayList;
        arrayList.addAll(Arrays.asList(abstractC2040Arr));
        this.f8775 = this.f8778.get(0);
        AbstractC2040 abstractC2040 = this.f8778.get(this.f8777 - 1);
        this.f8776 = abstractC2040;
        this.f8780 = abstractC2040.f8807;
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.f8777; i++) {
            StringBuilder m4207 = C2098.m4207(str);
            m4207.append(this.f8778.get(i).mo4143());
            m4207.append("  ");
            str = m4207.toString();
        }
        return str;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Object mo4129(float f) {
        int i = this.f8777;
        if (i == 2) {
            Interpolator interpolator = this.f8780;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            return this.f8779.evaluate(f, this.f8775.mo4143(), this.f8776.mo4143());
        }
        int i2 = 1;
        if (f <= 0.0f) {
            AbstractC2040 abstractC2040 = this.f8778.get(1);
            Interpolator interpolator2 = abstractC2040.f8807;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            AbstractC2040 abstractC20402 = this.f8775;
            float f2 = abstractC20402.f8804;
            return this.f8779.evaluate((f - f2) / (abstractC2040.f8804 - f2), abstractC20402.mo4143(), abstractC2040.mo4143());
        }
        if (f >= 1.0f) {
            AbstractC2040 abstractC20403 = this.f8778.get(i - 2);
            Interpolator interpolator3 = this.f8776.f8807;
            if (interpolator3 != null) {
                f = interpolator3.getInterpolation(f);
            }
            float f3 = abstractC20403.f8804;
            return this.f8779.evaluate((f - f3) / (this.f8776.f8804 - f3), abstractC20403.mo4143(), this.f8776.mo4143());
        }
        AbstractC2040 abstractC20404 = this.f8775;
        while (i2 < this.f8777) {
            AbstractC2040 abstractC20405 = this.f8778.get(i2);
            if (f < abstractC20405.f8804) {
                Interpolator interpolator4 = abstractC20405.f8807;
                if (interpolator4 != null) {
                    f = interpolator4.getInterpolation(f);
                }
                float f4 = abstractC20404.f8804;
                return this.f8779.evaluate((f - f4) / (abstractC20405.f8804 - f4), abstractC20404.mo4143(), abstractC20405.mo4143());
            }
            i2++;
            abstractC20404 = abstractC20405;
        }
        return this.f8776.mo4143();
    }

    @Override // 
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C2033 clone() {
        ArrayList<AbstractC2040> arrayList = this.f8778;
        int size = arrayList.size();
        AbstractC2040[] abstractC2040Arr = new AbstractC2040[size];
        for (int i = 0; i < size; i++) {
            abstractC2040Arr[i] = arrayList.get(i).clone();
        }
        return new C2033(abstractC2040Arr);
    }
}
