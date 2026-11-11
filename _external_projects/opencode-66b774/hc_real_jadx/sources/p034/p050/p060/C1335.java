package p034.p050.p060;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1335 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C1335 f6434;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public long f6435;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f6436;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public long f6437;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3025(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        double d3 = (0.01720197f * f) + 6.24006f;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double sin2 = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + sin + d3 + 1.796593063d + 3.141592653589793d;
        Double.isNaN(f - 9.0E-4f);
        double round = Math.round(r11 - r9) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = (Math.sin(2.0d * sin2) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + round + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin2));
        double d4 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin4 >= 1.0d) {
            this.f6436 = 1;
        } else {
            if (sin4 > -1.0d) {
                double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
                Double.isNaN(acos);
                this.f6437 = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
                Double.isNaN(acos);
                long round2 = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
                this.f6435 = round2;
                if (round2 >= j || this.f6437 <= j) {
                    this.f6436 = 1;
                    return;
                } else {
                    this.f6436 = 0;
                    return;
                }
            }
            this.f6436 = 0;
        }
        this.f6437 = -1L;
        this.f6435 = -1L;
    }
}
