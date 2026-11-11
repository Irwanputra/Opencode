package p034.p086.p091.p093;

import java.util.Arrays;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1656 extends AbstractC1651 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1657[] f7746;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final double[] f7747;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1657 {

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public static double[] f7748 = new double[91];

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public double f7749;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public double f7750;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public double f7751;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public double f7752;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public double f7753;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public boolean f7754;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public double f7755;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public double f7756;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public double[] f7757;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public boolean f7758;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public double f7759;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public double f7760;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public double f7761;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public double f7762;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public double f7763;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public double f7764;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public double f7765;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public double f7766;

        public C1657(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            double d7 = d3;
            this.f7758 = false;
            this.f7754 = i == 1;
            this.f7756 = d;
            this.f7763 = d2;
            this.f7765 = 1.0d / (d2 - d);
            if (3 == i) {
                this.f7758 = true;
            }
            double d8 = d5 - d7;
            double d9 = d6 - d4;
            if (this.f7758 || Math.abs(d8) < 0.001d || Math.abs(d9) < 0.001d) {
                this.f7758 = true;
                this.f7759 = d7;
                this.f7761 = d5;
                this.f7751 = d4;
                this.f7749 = d6;
                double hypot = Math.hypot(d9, d8);
                this.f7750 = hypot;
                this.f7764 = hypot * this.f7765;
                double d10 = this.f7763;
                double d11 = this.f7756;
                this.f7760 = d8 / (d10 - d11);
                this.f7762 = d9 / (d10 - d11);
                return;
            }
            this.f7757 = new double[101];
            boolean z = this.f7754;
            double d12 = z ? -1 : 1;
            Double.isNaN(d12);
            this.f7752 = d12 * d8;
            double d13 = z ? 1 : -1;
            Double.isNaN(d13);
            this.f7766 = d9 * d13;
            this.f7760 = z ? d5 : d7;
            this.f7762 = z ? d4 : d6;
            double d14 = d4 - d6;
            int i2 = 0;
            double d15 = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                if (i2 >= f7748.length) {
                    break;
                }
                double d18 = i2;
                Double.isNaN(d18);
                Double.isNaN(d18);
                double length = r14.length - 1;
                Double.isNaN(length);
                Double.isNaN(length);
                double radians = Math.toRadians((d18 * 90.0d) / length);
                double sin = Math.sin(radians) * d8;
                double cos = Math.cos(radians) * d14;
                if (i2 > 0) {
                    d15 += Math.hypot(sin - d16, cos - d17);
                    f7748[i2] = d15;
                }
                i2++;
                d17 = cos;
                d16 = sin;
            }
            this.f7750 = d15;
            int i3 = 0;
            while (true) {
                double[] dArr = f7748;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] / d15;
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.f7757.length) {
                    this.f7764 = this.f7750 * this.f7765;
                    return;
                }
                double d19 = i4;
                double length2 = r1.length - 1;
                Double.isNaN(d19);
                Double.isNaN(length2);
                Double.isNaN(d19);
                Double.isNaN(length2);
                double d20 = d19 / length2;
                int binarySearch = Arrays.binarySearch(f7748, d20);
                if (binarySearch >= 0) {
                    this.f7757[i4] = binarySearch / (f7748.length - 1);
                } else if (binarySearch == -1) {
                    this.f7757[i4] = 0.0d;
                } else {
                    int i5 = -binarySearch;
                    int i6 = i5 - 2;
                    double d21 = i6;
                    double[] dArr2 = f7748;
                    double d22 = (d20 - dArr2[i6]) / (dArr2[i5 - 1] - dArr2[i6]);
                    Double.isNaN(d21);
                    Double.isNaN(d21);
                    double length3 = dArr2.length - 1;
                    Double.isNaN(length3);
                    Double.isNaN(length3);
                    this.f7757[i4] = (d22 + d21) / length3;
                }
                i4++;
            }
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public double m3606() {
            double d = this.f7752 * this.f7753;
            double d2 = (-this.f7766) * this.f7755;
            double hypot = this.f7764 / Math.hypot(d, d2);
            return this.f7754 ? (-d2) * hypot : d2 * hypot;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void m3607(double d) {
            double d2 = (this.f7754 ? this.f7763 - d : d - this.f7756) * this.f7765;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.f7757;
                    double length = dArr.length - 1;
                    Double.isNaN(length);
                    Double.isNaN(length);
                    double d4 = d2 * length;
                    int i = (int) d4;
                    double d5 = i;
                    Double.isNaN(d5);
                    Double.isNaN(d5);
                    d3 = ((dArr[i + 1] - dArr[i]) * (d4 - d5)) + dArr[i];
                }
            }
            double d6 = d3 * 1.5707963267948966d;
            this.f7755 = Math.sin(d6);
            this.f7753 = Math.cos(d6);
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public double m3608(double d) {
            double d2 = (d - this.f7756) * this.f7765;
            double d3 = this.f7759;
            return ((this.f7761 - d3) * d2) + d3;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public double m3609() {
            double d = this.f7752 * this.f7753;
            double hypot = this.f7764 / Math.hypot(d, (-this.f7766) * this.f7755);
            if (this.f7754) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public double m3610() {
            return (this.f7752 * this.f7755) + this.f7760;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public double m3611() {
            return (this.f7766 * this.f7753) + this.f7762;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public double m3612(double d) {
            double d2 = (d - this.f7756) * this.f7765;
            double d3 = this.f7751;
            return ((this.f7749 - d3) * d2) + d3;
        }
    }

    public C1656(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f7747 = dArr;
        this.f7746 = new C1657[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C1657[] c1657Arr = this.f7746;
            if (i >= c1657Arr.length) {
                return;
            }
            int i4 = iArr[i];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (i4 == 2) {
                i2 = 2;
                i3 = 2;
            } else if (i4 == 3) {
                i2 = i2 == 1 ? 2 : 1;
                i3 = i2;
            }
            int i5 = i + 1;
            c1657Arr[i] = new C1657(i3, dArr[i], dArr[i5], dArr2[i][0], dArr2[i][1], dArr2[i5][0], dArr2[i5][1]);
            i = i5;
        }
    }

    @Override // p034.p086.p091.p093.AbstractC1651
    /* renamed from: 〺つふすそ */
    public double mo3592(double d, int i) {
        C1657[] c1657Arr = this.f7746;
        int i2 = 0;
        if (d < c1657Arr[0].f7756) {
            d = c1657Arr[0].f7756;
        } else if (d > c1657Arr[c1657Arr.length - 1].f7763) {
            d = c1657Arr[c1657Arr.length - 1].f7763;
        }
        while (true) {
            C1657[] c1657Arr2 = this.f7746;
            if (i2 >= c1657Arr2.length) {
                return Double.NaN;
            }
            if (d <= c1657Arr2[i2].f7763) {
                if (c1657Arr2[i2].f7758) {
                    return i == 0 ? c1657Arr2[i2].m3608(d) : c1657Arr2[i2].m3612(d);
                }
                c1657Arr2[i2].m3607(d);
                C1657[] c1657Arr3 = this.f7746;
                return i == 0 ? c1657Arr3[i2].m3610() : c1657Arr3[i2].m3611();
            }
            i2++;
        }
    }

    @Override // p034.p086.p091.p093.AbstractC1651
    /* renamed from: ぁごぐすすぃ */
    public double[] mo3593() {
        return this.f7747;
    }

    @Override // p034.p086.p091.p093.AbstractC1651
    /* renamed from: くし〴〺ぅ */
    public void mo3594(double d, double[] dArr) {
        C1657[] c1657Arr = this.f7746;
        if (d < c1657Arr[0].f7756) {
            d = c1657Arr[0].f7756;
        }
        if (d > c1657Arr[c1657Arr.length - 1].f7763) {
            d = c1657Arr[c1657Arr.length - 1].f7763;
        }
        int i = 0;
        while (true) {
            C1657[] c1657Arr2 = this.f7746;
            if (i >= c1657Arr2.length) {
                return;
            }
            if (d <= c1657Arr2[i].f7763) {
                if (c1657Arr2[i].f7758) {
                    dArr[0] = c1657Arr2[i].m3608(d);
                    dArr[1] = this.f7746[i].m3612(d);
                    return;
                } else {
                    c1657Arr2[i].m3607(d);
                    dArr[0] = this.f7746[i].m3610();
                    dArr[1] = this.f7746[i].m3611();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p034.p086.p091.p093.AbstractC1651
    /* renamed from: づざかべべ */
    public double mo3595(double d, int i) {
        C1657[] c1657Arr = this.f7746;
        int i2 = 0;
        if (d < c1657Arr[0].f7756) {
            d = c1657Arr[0].f7756;
        }
        if (d > c1657Arr[c1657Arr.length - 1].f7763) {
            d = c1657Arr[c1657Arr.length - 1].f7763;
        }
        while (true) {
            C1657[] c1657Arr2 = this.f7746;
            if (i2 >= c1657Arr2.length) {
                return Double.NaN;
            }
            if (d <= c1657Arr2[i2].f7763) {
                if (c1657Arr2[i2].f7758) {
                    return i == 0 ? c1657Arr2[i2].f7760 : c1657Arr2[i2].f7762;
                }
                c1657Arr2[i2].m3607(d);
                C1657[] c1657Arr3 = this.f7746;
                return i == 0 ? c1657Arr3[i2].m3609() : c1657Arr3[i2].m3606();
            }
            i2++;
        }
    }

    @Override // p034.p086.p091.p093.AbstractC1651
    /* renamed from: なぎぱいぢぎ */
    public void mo3596(double d, double[] dArr) {
        C1657[] c1657Arr = this.f7746;
        if (d < c1657Arr[0].f7756) {
            d = c1657Arr[0].f7756;
        } else if (d > c1657Arr[c1657Arr.length - 1].f7763) {
            d = c1657Arr[c1657Arr.length - 1].f7763;
        }
        int i = 0;
        while (true) {
            C1657[] c1657Arr2 = this.f7746;
            if (i >= c1657Arr2.length) {
                return;
            }
            if (d <= c1657Arr2[i].f7763) {
                if (c1657Arr2[i].f7758) {
                    dArr[0] = c1657Arr2[i].f7760;
                    dArr[1] = c1657Arr2[i].f7762;
                    return;
                } else {
                    c1657Arr2[i].m3607(d);
                    dArr[0] = this.f7746[i].m3609();
                    dArr[1] = this.f7746[i].m3606();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p034.p086.p091.p093.AbstractC1651
    /* renamed from: びぐびあび */
    public void mo3597(double d, float[] fArr) {
        C1657[] c1657Arr = this.f7746;
        if (d < c1657Arr[0].f7756) {
            d = c1657Arr[0].f7756;
        } else if (d > c1657Arr[c1657Arr.length - 1].f7763) {
            d = c1657Arr[c1657Arr.length - 1].f7763;
        }
        int i = 0;
        while (true) {
            C1657[] c1657Arr2 = this.f7746;
            if (i >= c1657Arr2.length) {
                return;
            }
            if (d <= c1657Arr2[i].f7763) {
                if (c1657Arr2[i].f7758) {
                    fArr[0] = (float) c1657Arr2[i].m3608(d);
                    fArr[1] = (float) this.f7746[i].m3612(d);
                    return;
                } else {
                    c1657Arr2[i].m3607(d);
                    fArr[0] = (float) this.f7746[i].m3610();
                    fArr[1] = (float) this.f7746[i].m3611();
                    return;
                }
            }
            i++;
        }
    }
}
