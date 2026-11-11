package p131.p135.p137;

/* renamed from: なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1981 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static C1981 f8610;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public EnumC1977 f8613 = EnumC1977.UNKNOWN;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f8611 = 0;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f8612 = 0;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f8614 = 0;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C1981 m4091() {
        if (f8610 == null) {
            synchronized (C1981.class) {
                if (f8610 == null) {
                    f8610 = new C1981();
                }
            }
        }
        return f8610;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public synchronized void m4092(long j, long j2) {
        EnumC1977 enumC1977;
        EnumC1977 enumC19772 = EnumC1977.UNKNOWN;
        synchronized (this) {
            if (j2 != 0 && j >= 20000) {
                double d = j;
                Double.isNaN(d);
                double d2 = j2;
                Double.isNaN(d2);
                double d3 = ((d * 1.0d) / d2) * 8.0d;
                if (d3 >= 10.0d) {
                    int i = this.f8611;
                    int i2 = this.f8612;
                    double d4 = i * i2;
                    Double.isNaN(d4);
                    double d5 = d4 + d3;
                    double d6 = i2 + 1;
                    Double.isNaN(d6);
                    int i3 = (int) (d5 / d6);
                    this.f8611 = i3;
                    int i4 = i2 + 1;
                    this.f8612 = i4;
                    if (i4 == 5 || (this.f8613 == enumC19772 && i4 == 2)) {
                        EnumC1977 enumC19773 = this.f8613;
                        this.f8614 = i3;
                        if (i3 <= 0) {
                            this.f8613 = enumC19772;
                        } else {
                            if (i3 < 150) {
                                enumC1977 = EnumC1977.POOR;
                            } else if (i3 < 550) {
                                enumC1977 = EnumC1977.MODERATE;
                            } else if (i3 < 2000) {
                                enumC1977 = EnumC1977.GOOD;
                            } else if (i3 > 2000) {
                                enumC1977 = EnumC1977.EXCELLENT;
                            }
                            this.f8613 = enumC1977;
                        }
                        if (i4 == 5) {
                            this.f8611 = 0;
                            this.f8612 = 0;
                        }
                        EnumC1977 enumC19774 = this.f8613;
                    }
                }
            }
        }
    }
}
