package dev.epro.r0;

import ads_mobile_sdk.xt3;
import ads_mobile_sdk.zt3;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O3228356295430981133 implements P1576149285030538153 {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public O3228356295430981133(int i, T1542296375665870064 t1542296375665870064, G8001132634698687269 g8001132634698687269, J12043550928838212009 j12043550928838212009) {
        this.b = j12043550928838212009;
        this.a = i;
        this.c = t1542296375665870064;
        this.d = g8001132634698687269;
    }

    public void a(long j) throws V6799596001827289384, U10904789608794664935 {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = ((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        c(j);
        long j8 = j / j7;
        if (j8 < 0 || j8 > ((zt3) this.b).a.length) {
            throw new U10904789608794664935();
        }
        this.a = (int) j8;
    }

    public zt3 b(long j) throws V6799596001827289384, U10904789608794664935 {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        c(a() + j);
        int i5 = this.a;
        long j2 = i5;
        zt3 zt3Var = (zt3) this.b;
        long j3 = (j >> iD) + j2;
        if (j3 > zt3Var.a.length || j3 < j2) {
            throw new U10904789608794664935();
        }
        try {
            int i6 = (int) j3;
            zt3 zt3VarA = ((O313374706087262796) this.c).a(zt3Var, i5, i6);
            this.a = i6;
            return zt3VarA;
        } catch (IndexOutOfBoundsException e) {
            W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }

    public int c() throws U10904789608794664935 {
        int iD = C468629748621011703.d(1695460764, 396394489, 1519637107, 6072641) ^ 578290844;
        try {
            O313374706087262796 o313374706087262796 = (O313374706087262796) this.c;
            zt3 zt3Var = (zt3) this.b;
            int i = this.a;
            this.a = i + 1;
            int iA = o313374706087262796.a(zt3Var, i) & iD;
            O313374706087262796 o3133747060872627962 = (O313374706087262796) this.c;
            zt3 zt3Var2 = (zt3) this.b;
            int i2 = this.a;
            this.a = i2 + 1;
            int iA2 = iA | ((o3133747060872627962.a(zt3Var2, i2) & iD) << 8);
            O313374706087262796 o3133747060872627963 = (O313374706087262796) this.c;
            zt3 zt3Var3 = (zt3) this.b;
            int i3 = this.a;
            this.a = i3 + 1;
            int iA3 = ((iD & o3133747060872627963.a(zt3Var3, i3)) << 16) | iA2;
            O313374706087262796 o3133747060872627964 = (O313374706087262796) this.c;
            zt3 zt3Var4 = (zt3) this.b;
            int i4 = this.a;
            this.a = i4 + 1;
            return (o3133747060872627964.a(zt3Var4, i4) << 24) | iA3;
        } catch (IndexOutOfBoundsException e) {
            throw new U10904789608794664935(e);
        }
    }

    public long d() throws U10904789608794664935, M1242531985831723076 {
        int iD = C468629748621011703.d(2113091120, 659347295, -1784934195, 38700438) ^ 301105688;
        int i = 0;
        long j = 0;
        while (i < iD) {
            try {
                O313374706087262796 o313374706087262796 = (O313374706087262796) this.c;
                zt3 zt3Var = (zt3) this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                byte bA = o313374706087262796.a(zt3Var, i2);
                j |= ((long) (bA & 127)) << i;
                if (i == 63) {
                    if (bA > 1) {
                        throw new M1242531985831723076();
                    }
                    i = 63;
                }
                if ((bA & 128) == 0) {
                    return (j >>> 1) ^ (-(j & 1));
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new U10904789608794664935(e);
            }
        }
        throw new M1242531985831723076();
    }

    @Override // dev.epro.r0.P1576149285030538153
    public int e() {
        F13711604687869105489 f13711604687869105489 = (F13711604687869105489) this.c;
        return f13711604687869105489 != null ? f13711604687869105489.b.length() : ((N1420218926656397722) this.b).d().c.length();
    }

    @Override // dev.epro.r0.P1576149285030538153
    public long f(long j) {
        N1420218926656397722 n1420218926656397722 = (N1420218926656397722) this.b;
        return n1420218926656397722.b != null ? n1420218926656397722.e(j) : j;
    }

    @Override // dev.epro.r0.P1576149285030538153
    public long g(long j) {
        N1420218926656397722 n1420218926656397722 = (N1420218926656397722) this.b;
        return n1420218926656397722.b != null ? n1420218926656397722.f(j) : j;
    }

    public boolean h() {
        N1420218926656397722 n1420218926656397722 = (N1420218926656397722) this.b;
        D389890677992184566 d389890677992184566 = (D389890677992184566) this.d;
        int i = this.a - 1;
        this.a = i;
        if (i == 0 && d389890677992184566.c != 0) {
            J9879469284241532070 j9879469284241532070 = n1420218926656397722.a;
            j9879469284241532070.b.a().m();
            F13711604687869105489 f13711604687869105489 = j9879469284241532070.b;
            if (n1420218926656397722.b == null) {
                this.c = f13711604687869105489;
            }
            Object[] objArr = d389890677992184566.a;
            int i2 = d389890677992184566.c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((F4096073349764486348) objArr[i3]).invoke(f13711604687869105489);
            }
            n1420218926656397722.l(f13711604687869105489);
            j9879469284241532070.b(false, E1418573787900340271.a);
            j9879469284241532070.g(true);
            j9879469284241532070.f(j9879469284241532070.b.d);
            d389890677992184566.i();
        }
        return this.a > 0;
    }

    public long i() {
        Paint paint = (Paint) this.b;
        return Build.VERSION.SDK_INT >= 29 ? V3386001030191236824.a.a(paint) : J8045362843799184672.e(paint.getColor());
    }

    public int j() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : X13679207684845219673.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int k() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : X13679207684845219673.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void l() {
        A11042752882447342413 a11042752882447342413 = new A11042752882447342413();
        a11042752882447342413.a = new Z17967803306442720428();
        a11042752882447342413.b = new Z17967803306442720428();
        a11042752882447342413.c = new Z17967803306442720428();
        a11042752882447342413.d = new Z17967803306442720428();
        a11042752882447342413.e = new W8078457053980686709(0.0f);
        a11042752882447342413.f = new W8078457053980686709(0.0f);
        a11042752882447342413.g = new W8078457053980686709(0.0f);
        a11042752882447342413.h = new W8078457053980686709(0.0f);
        byte b = 0;
        a11042752882447342413.i = new T13350664027331345869(b);
        a11042752882447342413.j = new T13350664027331345869(b);
        a11042752882447342413.k = new T13350664027331345869(b);
        a11042752882447342413.l = new T13350664027331345869(b);
        this.b = a11042752882447342413;
        this.c = new int[10][];
        this.d = new A11042752882447342413[10];
    }

    public void m(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void n(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            V3386001030191236824.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(K5751602218013079365.j0(i)));
        }
    }

    public void o(long j) {
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            V3386001030191236824.a.c(paint, j);
        } else {
            paint.setColor(J8045362843799184672.u0(j));
        }
    }

    public void p(R3103059035698929241 r3103059035698929241) {
        this.d = r3103059035698929241;
        ((Paint) this.b).setColorFilter(r3103059035698929241 != null ? r3103059035698929241.a : null);
    }

    public void q(int i) {
        ((Paint) this.b).setFilterBitmap(!(i == 0));
    }

    public void r(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void s(int i) {
        ((Paint) this.b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void t(int i) {
        ((Paint) this.b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void u(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public void v(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public O3228356295430981133(zt3 zt3Var, int i, O313374706087262796 o313374706087262796, O12545633033254628644 o12545633033254628644) {
        this(zt3Var, i, o313374706087262796);
        this.d = o12545633033254628644;
    }

    public O3228356295430981133(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public O3228356295430981133(zt3 zt3Var, int i, O313374706087262796 o313374706087262796) {
        this.b = zt3Var;
        this.a = i;
        this.c = o313374706087262796;
    }

    public long a() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.a) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % jArr[8]));
    }

    public long b() throws U10904789608794664935 {
        try {
            O313374706087262796 o313374706087262796 = (O313374706087262796) this.c;
            zt3 zt3Var = (zt3) this.b;
            this.a = this.a + 1;
            return o313374706087262796.a(zt3Var, r2);
        } catch (IndexOutOfBoundsException e) {
            throw new U10904789608794664935(e);
        }
    }

    public static final void c(long j) throws V6799596001827289384 {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % jArr[8])) != 0) {
            throw new V6799596001827289384();
        }
    }
}
