package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E18444280280170001567 {
    public static final float A;
    public static final dev.epro.r0.D4961612090878789022 B;
    public static final dev.epro.r0.Y4261039727803185691 C;
    public static final dev.epro.r0.Y4261039727803185691 D;
    public static final dev.epro.r0.V10933700885381486763 E;
    public static final dev.epro.r0.Y4261039727803185691 F;
    public static final dev.epro.r0.M5459415309190684092 G;
    public static final java.lang.StackTraceElement[] H;
    public static final dev.epro.r0.D5719685721490174593 I;
    public static final dev.epro.r0.H2442898661687873181 J;
    public static dev.epro.r0.Z7022156542152740569 K;
    public static dev.epro.r0.Z7022156542152740569 L;
    public static dev.epro.r0.Z7022156542152740569 M;
    public static dev.epro.r0.Z7022156542152740569 N;
    public static final char[] a;
    public static final dev.epro.r0.Y4261039727803185691 b;
    public static final float c;
    public static final dev.epro.r0.V10933700885381486763 d;
    public static final float e;
    public static final float f;
    public static final dev.epro.r0.V10933700885381486763 g;
    public static final float h;
    public static final dev.epro.r0.D4961612090878789022 i;
    public static final dev.epro.r0.Y4261039727803185691 j;
    public static final dev.epro.r0.Y4261039727803185691 k;
    public static final dev.epro.r0.Y4261039727803185691 l;
    public static final float m;
    public static final dev.epro.r0.Y4261039727803185691 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final dev.epro.r0.Y4261039727803185691 f219o;
    public static final float p;
    public static final dev.epro.r0.Y4261039727803185691 q;
    public static final dev.epro.r0.D4961612090878789022 r;
    public static final dev.epro.r0.Y4261039727803185691 s;
    public static final dev.epro.r0.D4961612090878789022 t;
    public static final dev.epro.r0.Y4261039727803185691 u;
    public static final dev.epro.r0.Y4261039727803185691 v;
    public static final dev.epro.r0.Y4261039727803185691 w;
    public static final dev.epro.r0.Y4261039727803185691 x;
    public static final dev.epro.r0.D4961612090878789022 y;
    public static final float z;

    public static final java.io.File A(android.content.Context context, java.lang.String str) {
        context.getClass();
        return new java.io.File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final float B(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final int C(int i2, dev.epro.r0.C6935141804827476266 c6935141804827476266, java.lang.Object obj) {
        int iE;
        return (obj == null || c6935141804827476266.a() == 0 || (i2 < c6935141804827476266.a() && obj.equals(c6935141804827476266.b(i2))) || (iE = c6935141804827476266.e(obj)) == -1) ? i2 : iE;
    }

    public static final int D(int i2, java.util.List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iZ = dev.epro.r0.S10823041268949770285.z(((dev.epro.r0.O740537273435134204) list.get(i4)).b, i2);
            if (iZ < 0) {
                i3 = i4 + 1;
            } else {
                if (iZ <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final dev.epro.r0.Z7022156542152740569 E() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = K;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        dev.epro.r0.V14323974914327418545 v14323974914327418545 = new dev.epro.r0.V14323974914327418545((byte) 3);
        v14323974914327418545.j(14.06f, 9.02f);
        v14323974914327418545.i(0.92f, 0.92f);
        v14323974914327418545.h(5.92f, 19.0f);
        v14323974914327418545.h(5.0f, 19.0f);
        v14323974914327418545.s(-0.92f);
        v14323974914327418545.i(9.06f, -9.06f);
        v14323974914327418545.j(17.66f, 3.0f);
        v14323974914327418545.e(-0.25f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f);
        v14323974914327418545.i(-1.83f, 1.83f);
        v14323974914327418545.i(3.75f, 3.75f);
        v14323974914327418545.i(1.83f, -1.83f);
        v14323974914327418545.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        v14323974914327418545.i(-2.34f, -2.34f);
        v14323974914327418545.e(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        dev.epro.r0.G11450220448113054352.w(v14323974914327418545, 14.06f, 6.19f, 3.0f, 17.25f);
        v14323974914327418545.h(3.0f, 21.0f);
        v14323974914327418545.g(3.75f);
        v14323974914327418545.h(17.81f, 9.94f);
        v14323974914327418545.i(-3.75f, -3.75f);
        v14323974914327418545.c();
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        K = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final dev.epro.r0.Z7022156542152740569 F() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = N;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.PowerSettingsNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        dev.epro.r0.V14323974914327418545 v14323974914327418545 = new dev.epro.r0.V14323974914327418545((byte) 3);
        v14323974914327418545.j(13.0f, 3.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.s(10.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.h(13.0f, 3.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(17.83f, 5.17f);
        v14323974914327418545.i(-1.42f, 1.42f);
        v14323974914327418545.d(17.99f, 7.86f, 19.0f, 9.81f, 19.0f, 12.0f);
        v14323974914327418545.e(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        v14323974914327418545.o(-7.0f, -3.13f, -7.0f, -7.0f);
        v14323974914327418545.e(0.0f, -2.19f, 1.01f, -4.14f, 2.58f, -5.42f);
        v14323974914327418545.h(6.17f, 5.17f);
        v14323974914327418545.d(4.23f, 6.82f, 3.0f, 9.26f, 3.0f, 12.0f);
        v14323974914327418545.e(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        v14323974914327418545.o(9.0f, -4.03f, 9.0f, -9.0f);
        v14323974914327418545.e(0.0f, -2.74f, -1.23f, -5.18f, -3.17f, -6.83f);
        v14323974914327418545.c();
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        N = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final long G(long j2) {
        if (j2 < 0) {
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            return dev.epro.r0.E17093345031926825464.d;
        }
        dev.epro.r0.E17149812035295265804 e171498120352952658042 = dev.epro.r0.E17093345031926825464.b;
        return dev.epro.r0.E17093345031926825464.c;
    }

    public static dev.epro.r0.R4833348786910499294 H(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        r4833348786910499294.getClass();
        dev.epro.r0.K14749510448791472029 k14749510448791472029 = r4833348786910499294 instanceof dev.epro.r0.K14749510448791472029 ? (dev.epro.r0.K14749510448791472029) r4833348786910499294 : null;
        return k14749510448791472029 != null ? k14749510448791472029.intercepted() : r4833348786910499294;
    }

    public static final dev.epro.r0.I1722681268793429505 I(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.F1048562484897106753 f1048562484897106753, dev.epro.r0.I2076339260272013590 i2076339260272013590, dev.epro.r0.L9852841107405549527 l9852841107405549527) {
        return i1722681268793429505.Q0(new dev.epro.r0.N5930730792661905599(f1048562484897106753, i2076339260272013590, l9852841107405549527));
    }

    public static final native org.json.JSONObject J(java.lang.String str, org.json.JSONObject jSONObject);

    public static final void K(float[] fArr, float[] fArr2) {
        float fB = B(fArr2, 0, fArr, 0);
        float fB2 = B(fArr2, 0, fArr, 1);
        float fB3 = B(fArr2, 0, fArr, 2);
        float fB4 = B(fArr2, 0, fArr, 3);
        float fB5 = B(fArr2, 1, fArr, 0);
        float fB6 = B(fArr2, 1, fArr, 1);
        float fB7 = B(fArr2, 1, fArr, 2);
        float fB8 = B(fArr2, 1, fArr, 3);
        float fB9 = B(fArr2, 2, fArr, 0);
        float fB10 = B(fArr2, 2, fArr, 1);
        float fB11 = B(fArr2, 2, fArr, 2);
        float fB12 = B(fArr2, 2, fArr, 3);
        float fB13 = B(fArr2, 3, fArr, 0);
        float fB14 = B(fArr2, 3, fArr, 1);
        float fB15 = B(fArr2, 3, fArr, 2);
        float fB16 = B(fArr2, 3, fArr, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static final void L(float[] fArr, float f2, float f3, float[] fArr2) {
        dev.epro.r0.N9580590882934638229.d(fArr2);
        dev.epro.r0.N9580590882934638229.f(fArr2, f2, f3);
        K(fArr, fArr2);
    }

    public static final void M(dev.epro.r0.K15438463641018513946 k15438463641018513946, int i2, java.lang.Object obj) {
        int iG = k15438463641018513946.g(i2);
        java.lang.Object[] objArr = k15438463641018513946.c;
        java.lang.Object obj2 = objArr[iG];
        objArr[iG] = dev.epro.r0.O9023047933786425027.a;
        if (obj == obj2) {
            return;
        }
        dev.epro.r0.N2332913310205178802.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final void N(int i2, int i3, java.util.List list) {
        int iD = D(i2, list);
        if (iD < 0) {
            iD = -(iD + 1);
        }
        while (iD < list.size() && ((dev.epro.r0.O740537273435134204) list.get(iD)).b < i3) {
        }
    }

    public static final native void O(org.json.JSONObject jSONObject, java.util.Set set);

    public static final native void P(int i2, java.lang.String str, boolean z2);

    public static native /* synthetic */ void Q(int i2, java.lang.String str);

    public static final native java.lang.Object R(dev.epro.r0.H6912164555617033089 h6912164555617033089, java.lang.String str, dev.epro.r0.W1413845473851472788 w1413845473851472788, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.S12510057686440098678 s12510057686440098678, dev.epro.r0.J12078565427869724451 j12078565427869724451, dev.epro.r0.R4833348786910499294 r4833348786910499294);

    public static final long S(long j2, long j3) {
        long j4 = j2 - j3;
        long j5 = (j4 ^ j2) & (~(j4 ^ j3));
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.b;
        if (j5 >= 0) {
            return dev.epro.r0.M9216324016624295870.a0(j4, n13798149404328803870);
        }
        dev.epro.r0.N13798149404328803870 n137981494043288038702 = dev.epro.r0.N13798149404328803870.d;
        if (n13798149404328803870.compareTo(n137981494043288038702) >= 0) {
            return dev.epro.r0.E17093345031926825464.m(G(j4));
        }
        long j6 = (j2 / 1000000) - (j3 / 1000000);
        long j7 = (j2 % 1000000) - (j3 % 1000000);
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return dev.epro.r0.E17093345031926825464.h(dev.epro.r0.M9216324016624295870.a0(j6, n137981494043288038702), dev.epro.r0.M9216324016624295870.a0(j7, n13798149404328803870));
    }

    public static final dev.epro.r0.I1722681268793429505 T(dev.epro.r0.I1722681268793429505 i1722681268793429505, boolean z2, dev.epro.r0.S9385204271696540760 s9385204271696540760, dev.epro.r0.H15322912479122270765 h15322912479122270765, boolean z3, dev.epro.r0.H10924029057425269323 h10924029057425269323, dev.epro.r0.B13729205492206812220 b13729205492206812220) {
        dev.epro.r0.K2801700247884787149 k2801700247884787149Q0;
        if (h15322912479122270765 != null) {
            k2801700247884787149Q0 = new dev.epro.r0.K2801700247884787149(z2, s9385204271696540760, h15322912479122270765, z3, h10924029057425269323, b13729205492206812220);
        } else if (h15322912479122270765 == null) {
            k2801700247884787149Q0 = new dev.epro.r0.K2801700247884787149(z2, s9385204271696540760, (dev.epro.r0.H15322912479122270765) null, z3, h10924029057425269323, b13729205492206812220);
        } else {
            dev.epro.r0.V10993962107938880611 v10993962107938880611 = dev.epro.r0.V10993962107938880611.a;
            k2801700247884787149Q0 = s9385204271696540760 != null ? dev.epro.r0.U16590549108690726338.a(v10993962107938880611, s9385204271696540760, h15322912479122270765).Q0(new dev.epro.r0.K2801700247884787149(z2, s9385204271696540760, (dev.epro.r0.H15322912479122270765) null, z3, h10924029057425269323, b13729205492206812220)) : dev.epro.r0.V12319504402545346730.w(v10993962107938880611, new dev.epro.r0.S393882536434126899(h15322912479122270765, z2, z3, h10924029057425269323, b13729205492206812220));
        }
        return i1722681268793429505.Q0(k2801700247884787149Q0);
    }

    public static final long U(float f2, long j2) {
        float fMax = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) java.lang.Float.floatToRawIntBits(fMax)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final native boolean V(java.lang.String str, org.json.JSONObject jSONObject);

    public static final native int W(java.lang.String str, org.json.JSONObject jSONObject);

    public static final native java.lang.String X(java.lang.String str, org.json.JSONObject jSONObject);

    public static final native dev.epro.r0.X11745913536878472556 Y(org.json.JSONObject jSONObject);

    public static final native dev.epro.r0.U6661402979307074403 Z(org.json.JSONObject jSONObject);

    public static final native void a(dev.epro.r0.Z7022156542152740569 z7022156542152740569, java.lang.String str, float f2, boolean z2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static java.lang.Object a0(dev.epro.r0.L12639328004344855510 l12639328004344855510, java.lang.Object obj, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        l12639328004344855510.getClass();
        dev.epro.r0.I3826119971291161142 context = r4833348786910499294.getContext();
        dev.epro.r0.J5332911396294054649 j5332911396294054649 = context == dev.epro.r0.I3826119971291161142.a ? new dev.epro.r0.J5332911396294054649(r4833348786910499294) : new dev.epro.r0.W7831607246803008268(r4833348786910499294, context);
        dev.epro.r0.V12319504402545346730.s(2, l12639328004344855510);
        return l12639328004344855510.invoke(obj, j5332911396294054649);
    }

    public static final native void b(int i2, int i3, dev.epro.r0.M3727281027331139839 m3727281027331139839);

    public static final native void c(dev.epro.r0.H17876720004835654210 h17876720004835654210, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void d(dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void e(int i2, boolean z2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3);

    public static final native void f(int i2, boolean z2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3);

    public static final native void g(java.lang.String str, java.lang.String str2, long j2, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(int i2, dev.epro.r0.M3727281027331139839 m3727281027331139839);

    public static final native void i(dev.epro.r0.F14221027277233388256 f14221027277233388256, java.lang.Integer num, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void j(java.util.List list, java.lang.String str, dev.epro.r0.C3072902849025492506 c3072902849025492506, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void k(dev.epro.r0.X12291102796058397370 x12291102796058397370, boolean z2, dev.epro.r0.F14221027277233388256 f14221027277233388256, java.lang.Integer num, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(dev.epro.r0.F2652319623815706820 f2652319623815706820, dev.epro.r0.H17876720004835654210 h17876720004835654210, android.content.Context context, dev.epro.r0.S12510057686440098678 s12510057686440098678, dev.epro.r0.D2231299582723413889 d2231299582723413889, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.J12078565427869724451 j12078565427869724451, dev.epro.r0.D16513696335383100591 d16513696335383100591, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(dev.epro.r0.L5257209402530789314 l5257209402530789314, dev.epro.r0.Z7022156542152740569 z7022156542152740569, java.lang.String str, float f2, java.lang.Object obj, boolean z2, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(dev.epro.r0.A16842337154698931828 a16842337154698931828, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.F4096073349764486348 f40960733497644863483, dev.epro.r0.F4096073349764486348 f40960733497644863484, dev.epro.r0.F4096073349764486348 f40960733497644863485, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.L12639328004344855510 l126393280043448555102, dev.epro.r0.L12639328004344855510 l126393280043448555103, dev.epro.r0.F4096073349764486348 f40960733497644863486, dev.epro.r0.F4096073349764486348 f40960733497644863487, dev.epro.r0.F4096073349764486348 f40960733497644863488, dev.epro.r0.F4096073349764486348 f40960733497644863489, dev.epro.r0.F4096073349764486348 f409607334976448634810, dev.epro.r0.F4096073349764486348 f409607334976448634811, dev.epro.r0.F4096073349764486348 f409607334976448634812, dev.epro.r0.F4096073349764486348 f409607334976448634813, dev.epro.r0.F4096073349764486348 f409607334976448634814, dev.epro.r0.F4096073349764486348 f409607334976448634815, dev.epro.r0.B13729205492206812220 b13729205492206812220, boolean z2, boolean z3, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2, int i3, int i4, int i5);

    public static final native void o(int i2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, java.lang.String str);

    public static final native void p(dev.epro.r0.V9622388302629328265 v9622388302629328265, dev.epro.r0.X11638668447546090163 x11638668447546090163, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.J12078565427869724451 j12078565427869724451, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static dev.epro.r0.D5719685721490174593 q(int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return new dev.epro.r0.D5719685721490174593(0, i2);
    }

    public static final dev.epro.r0.I1722681268793429505 r(dev.epro.r0.I1722681268793429505 i1722681268793429505, float f2) {
        return f2 == 1.0f ? i1722681268793429505 : dev.epro.r0.M18113111391818111737.K(i1722681268793429505, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0L, (dev.epro.r0.I5573661370475160895) null, true, 0L, 0L, 1044475);
    }

    public static final dev.epro.r0.J2036577136063655101 s(dev.epro.r0.B9345618057833789735 b9345618057833789735, dev.epro.r0.M3727281027331139839 m3727281027331139839) {
        return new dev.epro.r0.J2036577136063655101(b9345618057833789735, (dev.epro.r0.R8540738700654750557) m3727281027331139839.j(dev.epro.r0.Y238707362170117896.h));
    }

    public static final native void t(java.net.HttpURLConnection httpURLConnection, dev.epro.r0.B13729205492206812220 b13729205492206812220);

    public static final dev.epro.r0.I1722681268793429505 u(dev.epro.r0.I1722681268793429505 i1722681268793429505, float f2, long j2, dev.epro.r0.I5573661370475160895 i5573661370475160895) {
        return i1722681268793429505.Q0(new dev.epro.r0.U12288165323665948696(f2, new dev.epro.r0.H10765568533039107979(j2), i5573661370475160895));
    }

    public static final dev.epro.r0.I1722681268793429505 v(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.N18033783269298797248 n18033783269298797248) {
        return i1722681268793429505.Q0(new dev.epro.r0.K14729567235970348628(n18033783269298797248));
    }

    public static final void w(long j2, dev.epro.r0.R7000310675073492254 r7000310675073492254) {
        if (r7000310675073492254 == dev.epro.r0.R7000310675073492254.a) {
            if (dev.epro.r0.I16980768508151520658.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            dev.epro.r0.Y16081827717826519461.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (dev.epro.r0.I16980768508151520658.i(j2) != Integer.MAX_VALUE) {
                return;
            }
            dev.epro.r0.Y16081827717826519461.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void x(dev.epro.r0.S2509933476155449112 s2509933476155449112, java.util.ArrayList arrayList, int i2) {
        boolean zL = s2509933476155449112.l(i2);
        int[] iArr = s2509933476155449112.b;
        if (zL) {
            arrayList.add(s2509933476155449112.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            x(s2509933476155449112, arrayList, i4);
        }
    }

    public static final boolean y(android.view.View view, android.view.View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static dev.epro.r0.R4833348786910499294 z(dev.epro.r0.R4833348786910499294 r4833348786910499294, dev.epro.r0.R4833348786910499294 r48333487869104992942, dev.epro.r0.L12639328004344855510 l12639328004344855510) {
        l12639328004344855510.getClass();
        if (l12639328004344855510 instanceof dev.epro.r0.B401944902727389462) {
            return ((dev.epro.r0.B401944902727389462) l12639328004344855510).create(r48333487869104992942, r4833348786910499294);
        }
        dev.epro.r0.I3826119971291161142 context = r48333487869104992942.getContext();
        return context == dev.epro.r0.I3826119971291161142.a ? new dev.epro.r0.N15331253308737101822(r48333487869104992942, r4833348786910499294, l12639328004344855510) : new dev.epro.r0.K1920483526288862661(r48333487869104992942, context, l12639328004344855510, r4833348786910499294);
    }

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(48);
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        b = dev.epro.r0.Y4261039727803185691.t;
        c = 568.0f;
        d = dev.epro.r0.V10933700885381486763.a;
        e = 360.0f;
        f = 40.0f;
        dev.epro.r0.V10933700885381486763 v10933700885381486763 = dev.epro.r0.V10933700885381486763.e;
        g = v10933700885381486763;
        h = 40.0f;
        dev.epro.r0.D4961612090878789022 d4961612090878789022 = dev.epro.r0.D4961612090878789022.a;
        i = d4961612090878789022;
        dev.epro.r0.Y4261039727803185691 y4261039727803185691 = dev.epro.r0.Y4261039727803185691.m;
        j = y4261039727803185691;
        dev.epro.r0.Y4261039727803185691 y42610397278031856912 = dev.epro.r0.Y4261039727803185691.e;
        k = y42610397278031856912;
        l = y4261039727803185691;
        m = 1.0f;
        n = y4261039727803185691;
        dev.epro.r0.Y4261039727803185691 y42610397278031856913 = dev.epro.r0.Y4261039727803185691.h;
        f219o = y42610397278031856913;
        p = 120.0f;
        dev.epro.r0.Y4261039727803185691 y42610397278031856914 = dev.epro.r0.Y4261039727803185691.i;
        q = y42610397278031856914;
        r = dev.epro.r0.D4961612090878789022.f;
        s = y42610397278031856914;
        t = dev.epro.r0.D4961612090878789022.h;
        u = dev.epro.r0.Y4261039727803185691.q;
        v = dev.epro.r0.Y4261039727803185691.g;
        w = y42610397278031856914;
        x = y42610397278031856913;
        y = d4961612090878789022;
        z = 36.0f;
        A = 72.0f;
        B = d4961612090878789022;
        C = y4261039727803185691;
        D = y42610397278031856912;
        E = v10933700885381486763;
        F = y42610397278031856914;
        G = new dev.epro.r0.M5459415309190684092((byte) 5);
        H = new java.lang.StackTraceElement[0];
        I = new dev.epro.r0.D5719685721490174593(0, 0);
        J = new dev.epro.r0.H2442898661687873181((byte) 2);
    }
}
