package p034.p086.p091.p092;

import java.util.LinkedHashMap;
import p034.p086.p090.C1566;
import p034.p086.p090.C1572;
import p034.p086.p091.p093.C1654;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1603 implements Comparable<C1603> {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static String[] f7542 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7543;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1654 f7544;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f7545;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7546;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public double[] f7547;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7548;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f7549;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public LinkedHashMap<String, C1572> f7550;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7551;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f7552;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f7553;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public double[] f7554;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7555;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f7556;

    public C1603() {
        this.f7548 = 0;
        this.f7546 = Float.NaN;
        this.f7556 = -1;
        this.f7550 = new LinkedHashMap<>();
        this.f7552 = 0;
        this.f7554 = new double[18];
        this.f7547 = new double[18];
    }

    public C1603(int i, int i2, C1577 c1577, C1603 c1603, C1603 c16032) {
        this.f7548 = 0;
        this.f7546 = Float.NaN;
        this.f7556 = -1;
        this.f7550 = new LinkedHashMap<>();
        this.f7552 = 0;
        this.f7554 = new double[18];
        this.f7547 = new double[18];
        int i3 = c1577.f7467;
        if (i3 == 1) {
            float f = c1577.f7473 / 100.0f;
            this.f7553 = f;
            this.f7548 = c1577.f7462;
            float f2 = Float.isNaN(c1577.f7468) ? f : c1577.f7468;
            float f3 = Float.isNaN(c1577.f7464) ? f : c1577.f7464;
            float f4 = c16032.f7543 - c1603.f7543;
            float f5 = c16032.f7555 - c1603.f7555;
            this.f7549 = this.f7553;
            f = Float.isNaN(c1577.f7469) ? f : c1577.f7469;
            float f6 = c1603.f7551;
            float f7 = c1603.f7543;
            float f8 = c1603.f7545;
            float f9 = c1603.f7555;
            float f10 = ((c16032.f7543 / 2.0f) + c16032.f7551) - ((f7 / 2.0f) + f6);
            float f11 = ((c16032.f7555 / 2.0f) + c16032.f7545) - ((f9 / 2.0f) + f8);
            float f12 = f10 * f;
            float f13 = (f4 * f2) / 2.0f;
            this.f7551 = (int) ((f6 + f12) - f13);
            float f14 = f * f11;
            float f15 = (f5 * f3) / 2.0f;
            this.f7545 = (int) ((f8 + f14) - f15);
            this.f7543 = (int) (f7 + r9);
            this.f7555 = (int) (f9 + r10);
            float f16 = Float.isNaN(c1577.f7465) ? 0.0f : c1577.f7465;
            this.f7552 = 1;
            float f17 = (int) ((c1603.f7551 + f12) - f13);
            this.f7551 = f17;
            float f18 = (int) ((c1603.f7545 + f14) - f15);
            this.f7545 = f18;
            this.f7551 = f17 + ((-f11) * f16);
            this.f7545 = f18 + (f10 * f16);
            this.f7544 = C1654.m3601(c1577.f7466);
            this.f7556 = c1577.f7463;
            return;
        }
        if (i3 == 2) {
            float f19 = c1577.f7473 / 100.0f;
            this.f7553 = f19;
            this.f7548 = c1577.f7462;
            float f20 = Float.isNaN(c1577.f7468) ? f19 : c1577.f7468;
            float f21 = Float.isNaN(c1577.f7464) ? f19 : c1577.f7464;
            float f22 = c16032.f7543;
            float f23 = f22 - c1603.f7543;
            float f24 = c16032.f7555;
            float f25 = f24 - c1603.f7555;
            this.f7549 = this.f7553;
            float f26 = c1603.f7551;
            float f27 = c1603.f7545;
            float f28 = (f22 / 2.0f) + c16032.f7551;
            float f29 = (f24 / 2.0f) + c16032.f7545;
            float f30 = f23 * f20;
            this.f7551 = (int) ((((f28 - ((r9 / 2.0f) + f26)) * f19) + f26) - (f30 / 2.0f));
            float f31 = f25 * f21;
            this.f7545 = (int) ((((f29 - ((r12 / 2.0f) + f27)) * f19) + f27) - (f31 / 2.0f));
            this.f7543 = (int) (r9 + f30);
            this.f7555 = (int) (r12 + f31);
            this.f7552 = 3;
            if (!Float.isNaN(c1577.f7469)) {
                this.f7551 = (int) (c1577.f7469 * ((int) (i - this.f7543)));
            }
            if (!Float.isNaN(c1577.f7465)) {
                this.f7545 = (int) (c1577.f7465 * ((int) (i2 - this.f7555)));
            }
            this.f7544 = C1654.m3601(c1577.f7466);
            this.f7556 = c1577.f7463;
            return;
        }
        float f32 = c1577.f7473 / 100.0f;
        this.f7553 = f32;
        this.f7548 = c1577.f7462;
        float f33 = Float.isNaN(c1577.f7468) ? f32 : c1577.f7468;
        float f34 = Float.isNaN(c1577.f7464) ? f32 : c1577.f7464;
        float f35 = c16032.f7543;
        float f36 = c1603.f7543;
        float f37 = f35 - f36;
        float f38 = c16032.f7555;
        float f39 = c1603.f7555;
        float f40 = f38 - f39;
        this.f7549 = this.f7553;
        float f41 = c1603.f7551;
        float f42 = c1603.f7545;
        float f43 = ((f35 / 2.0f) + c16032.f7551) - ((f36 / 2.0f) + f41);
        float f44 = ((f38 / 2.0f) + c16032.f7545) - ((f39 / 2.0f) + f42);
        float f45 = (f37 * f33) / 2.0f;
        this.f7551 = (int) (((f43 * f32) + f41) - f45);
        float f46 = (f44 * f32) + f42;
        float f47 = (f40 * f34) / 2.0f;
        this.f7545 = (int) (f46 - f47);
        this.f7543 = (int) (f36 + r13);
        this.f7555 = (int) (f39 + r16);
        float f48 = Float.isNaN(c1577.f7469) ? f32 : c1577.f7469;
        float f49 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
        f32 = Float.isNaN(c1577.f7465) ? f32 : c1577.f7465;
        float f50 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
        this.f7552 = 2;
        this.f7551 = (int) (((f50 * f44) + ((f48 * f43) + c1603.f7551)) - f45);
        this.f7545 = (int) (((f44 * f32) + ((f43 * f49) + c1603.f7545)) - f47);
        this.f7544 = C1654.m3601(c1577.f7466);
        this.f7556 = c1577.f7463;
    }

    @Override // java.lang.Comparable
    public int compareTo(C1603 c1603) {
        return Float.compare(this.f7549, c1603.f7549);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m3558(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3559(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f7551;
        float f2 = this.f7545;
        float f3 = this.f7543;
        float f4 = this.f7555;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3560(C1566.C1569 c1569) {
        this.f7544 = C1654.m3601(c1569.f7423.f7417);
        C1566.C1568 c1568 = c1569.f7423;
        this.f7556 = c1568.f7421;
        this.f7546 = c1568.f7416;
        this.f7548 = c1568.f7419;
        float f = c1569.f7422.f7445;
        for (String str : c1569.f7426.keySet()) {
            C1572 c1572 = c1569.f7426.get(str);
            if (c1572.f7447 != C1572.EnumC1573.STRING_TYPE) {
                this.f7550.put(str, c1572);
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m3561(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3562(float f, float f2, float f3, float f4) {
        this.f7551 = f;
        this.f7545 = f2;
        this.f7543 = f3;
        this.f7555 = f4;
    }
}
