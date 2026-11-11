package p034.p086.p091.p093;

import java.util.Arrays;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1654 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C1654 f7739 = new C1654();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String[] f7740 = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f7741 = "identity";

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1655 extends C1654 {

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public double f7742;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public double f7743;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public double f7744;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public double f7745;

        public C1655(String str) {
            this.f7741 = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f7745 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f7743 = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f7744 = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f7742 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // p034.p086.p091.p093.C1654
        /* renamed from: 〺つふすそ */
        public double mo3602(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = m3605(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (m3604(d5) - m3604(d4)) / (m3605(d5) - m3605(d4));
        }

        @Override // p034.p086.p091.p093.C1654
        /* renamed from: げつ〴ぬぐ */
        public double mo3603(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = m3605(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double m3605 = m3605(d4);
            double d5 = d3 + d2;
            double m36052 = m3605(d5);
            double m3604 = m3604(d4);
            return (((d - m3605) * (m3604(d5) - m3604)) / (m36052 - m3605)) + m3604;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final double m3604(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f7742 * d5) + (this.f7743 * d4) + (d * d * d);
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final double m3605(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f7744 * d5) + (this.f7745 * d4) + (d * d * d);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1654 m3601(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C1655(str);
        }
        switch (str) {
            case "accelerate":
                return new C1655("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new C1655("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new C1655("cubic(1, 1, 0, 0)");
            case "standard":
                return new C1655("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Arrays.toString(f7740);
                return f7739;
        }
    }

    public String toString() {
        return this.f7741;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public double mo3602(double d) {
        return 1.0d;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public double mo3603(double d) {
        return d;
    }
}
