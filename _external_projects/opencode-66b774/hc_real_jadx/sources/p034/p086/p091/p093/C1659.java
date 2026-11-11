package p034.p086.p091.p093;

import java.util.Arrays;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1659 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public double[] f7771;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7773;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float[] f7772 = new float[0];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public double[] f7770 = new double[0];

    public String toString() {
        StringBuilder m4207 = C2098.m4207("pos =");
        m4207.append(Arrays.toString(this.f7770));
        m4207.append(" period=");
        m4207.append(Arrays.toString(this.f7772));
        return m4207.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public double m3615(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f7770, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f7772;
        int i2 = i - 1;
        double d2 = fArr[i] - fArr[i2];
        double[] dArr = this.f7770;
        double d3 = dArr[i] - dArr[i2];
        Double.isNaN(d2);
        double d4 = d2 / d3;
        double d5 = d * d4;
        double d6 = fArr[i2];
        double d7 = d4 * dArr[i2];
        Double.isNaN(d6);
        return (d6 - d7) + d5;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public double m3616(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f7770, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f7772;
        int i2 = i - 1;
        double d2 = fArr[i] - fArr[i2];
        double[] dArr = this.f7770;
        double d3 = dArr[i] - dArr[i2];
        Double.isNaN(d2);
        double d4 = d2 / d3;
        double d5 = this.f7771[i2];
        double d6 = fArr[i2];
        double d7 = dArr[i2] * d4;
        Double.isNaN(d6);
        return ((((d * d) - (dArr[i2] * dArr[i2])) * d4) / 2.0d) + ((d - dArr[i2]) * (d6 - d7)) + d5;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3617(double d, float f) {
        int length = this.f7772.length + 1;
        int binarySearch = Arrays.binarySearch(this.f7770, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f7770 = Arrays.copyOf(this.f7770, length);
        this.f7772 = Arrays.copyOf(this.f7772, length);
        this.f7771 = new double[length];
        double[] dArr = this.f7770;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f7770[binarySearch] = d;
        this.f7772[binarySearch] = f;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public double m3618(double d) {
        double abs;
        switch (this.f7773) {
            case 1:
                return Math.signum(0.5d - (m3616(d) % 1.0d));
            case 2:
                abs = Math.abs((((m3616(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m3616(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((m3616(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(m3616(d) * 6.283185307179586d);
            case 6:
                double abs2 = 1.0d - Math.abs(((m3616(d) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(m3616(d) * 6.283185307179586d);
        }
        return 1.0d - abs;
    }
}
