package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N11829648573770870927 {
    public final R8540738700654750557 a;
    public long b = 9205357640488583168L;
    public final X9402207533033946500 c;
    public final V697849047308847220 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final J2215566372910931965 i;

    public N11829648573770870927(Context context, R8540738700654750557 r8540738700654750557, long j, D6962450040782876658 d6962450040782876658) {
        this.a = r8540738700654750557;
        X9402207533033946500 x9402207533033946500 = new X9402207533033946500(context, J8045362843799184672.u0(j));
        this.c = x9402207533033946500;
        this.d = new V697849047308847220(O9245300239821758723.a, B14824868959299866349.k);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        P9733793856018248168 p9733793856018248168A = T7055906184043387232.a(new J11977321013895313576(this, (byte) 0));
        this.i = Build.VERSION.SDK_INT >= 31 ? new F4156480969566614324(p9733793856018248168A, this, x9402207533033946500) : new F4156480969566614324(p9733793856018248168A, this, x9402207533033946500, d6962450040782876658);
    }

    public final void a() {
        boolean z;
        X9402207533033946500 x9402207533033946500 = this.c;
        EdgeEffect edgeEffect = x9402207533033946500.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = x9402207533033946500.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = x9402207533033946500.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = x9402207533033946500.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, dev.epro.r0.L12639328004344855510 r21, dev.epro.r0.K14749510448791472029 r22) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N11829648573770870927.b(long, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final long c() {
        long jM = this.b;
        if ((9223372034707292159L & jM) == 9205357640488583168L) {
            jM = S12227320117525376577.m(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(O9245300239821758723.a);
        }
    }

    public final boolean e() {
        X9402207533033946500 x9402207533033946500 = this.c;
        EdgeEffect edgeEffect = x9402207533033946500.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? M6916561348591858303.d(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = x9402207533033946500.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? M6916561348591858303.d(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = x9402207533033946500.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? M6916561348591858303.d(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = x9402207533033946500.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? M6916561348591858303.d(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fG = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fG = M6916561348591858303.g(edgeEffectB, fG, f);
        } else {
            edgeEffectB.onPull(fG, f);
        }
        return (i2 >= 31 ? M6916561348591858303.d(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fG) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = M6916561348591858303.g(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? M6916561348591858303.d(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fG = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fG = M6916561348591858303.g(edgeEffectD, fG, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fG, fIntBitsToFloat);
        }
        return (i2 >= 31 ? M6916561348591858303.d(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fG) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = M6916561348591858303.g(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? M6916561348591858303.d(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean zA = W8572396779607072172.a(this.g, 0L);
        boolean zA2 = W8572396779607072172.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iZ = T18016951143603335921.Z(Float.intBitsToFloat((int) (j >> 32)));
            long jZ = (((long) T18016951143603335921.Z(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iZ) << 32);
            X9402207533033946500 x9402207533033946500 = this.c;
            x9402207533033946500.c = jZ;
            EdgeEffect edgeEffect = x9402207533033946500.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect2 = x9402207533033946500.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect3 = x9402207533033946500.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jZ & 4294967295L), (int) (jZ >> 32));
            }
            EdgeEffect edgeEffect4 = x9402207533033946500.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jZ & 4294967295L), (int) (jZ >> 32));
            }
            EdgeEffect edgeEffect5 = x9402207533033946500.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect6 = x9402207533033946500.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jZ >> 32), (int) (jZ & 4294967295L));
            }
            EdgeEffect edgeEffect7 = x9402207533033946500.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jZ & 4294967295L), (int) (jZ >> 32));
            }
            EdgeEffect edgeEffect8 = x9402207533033946500.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jZ), (int) (jZ >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
