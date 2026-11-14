package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        P9733793856018248168 a = T7055906184043387232.a(new J11977321013895313576(this, (byte) 0));
        this.i = Build.VERSION.SDK_INT >= 31 ? new F4156480969566614324(a, this, x9402207533033946500) : new F4156480969566614324(a, this, x9402207533033946500, d6962450040782876658);
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

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, dev.epro.r0.L12639328004344855510 r21, dev.epro.r0.K14749510448791472029 r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.N11829648573770870927.b(long, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = S12227320117525376577.m(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
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
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = M6916561348591858303.g(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i2 >= 31 ? M6916561348591858303.d(b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = M6916561348591858303.g(c, intBitsToFloat2, f);
        } else {
            c.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? M6916561348591858303.d(c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = M6916561348591858303.g(d, f, intBitsToFloat);
        } else {
            d.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? M6916561348591858303.d(d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = M6916561348591858303.g(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? M6916561348591858303.d(e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean a = W8572396779607072172.a(this.g, 0L);
        boolean a2 = W8572396779607072172.a(j, this.g);
        this.g = j;
        if (!a2) {
            long Z = (T18016951143603335921.Z(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (T18016951143603335921.Z(Float.intBitsToFloat((int) (j >> 32))) << 32);
            X9402207533033946500 x9402207533033946500 = this.c;
            x9402207533033946500.c = Z;
            EdgeEffect edgeEffect = x9402207533033946500.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (Z >> 32), (int) (Z & 4294967295L));
            }
            EdgeEffect edgeEffect2 = x9402207533033946500.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (Z >> 32), (int) (Z & 4294967295L));
            }
            EdgeEffect edgeEffect3 = x9402207533033946500.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (Z & 4294967295L), (int) (Z >> 32));
            }
            EdgeEffect edgeEffect4 = x9402207533033946500.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (Z & 4294967295L), (int) (Z >> 32));
            }
            EdgeEffect edgeEffect5 = x9402207533033946500.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (Z >> 32), (int) (Z & 4294967295L));
            }
            EdgeEffect edgeEffect6 = x9402207533033946500.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (Z >> 32), (int) (Z & 4294967295L));
            }
            EdgeEffect edgeEffect7 = x9402207533033946500.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (Z & 4294967295L), (int) (Z >> 32));
            }
            EdgeEffect edgeEffect8 = x9402207533033946500.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & Z), (int) (Z >> 32));
            }
        }
        if (a || a2) {
            return;
        }
        a();
    }
}
