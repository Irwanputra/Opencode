package ads_mobile_sdk;

import dev.epro.r0.C468629748621011703;
import dev.epro.r0.F15751422393861875968;
import dev.epro.r0.G7266811542160226366;
import dev.epro.r0.M1242531985831723076;
import dev.epro.r0.M15281894020734075014;
import dev.epro.r0.N2553658702658867020;
import dev.epro.r0.O12545633033254628644;
import dev.epro.r0.O313374706087262796;
import dev.epro.r0.O3228356295430981133;
import dev.epro.r0.U10904789608794664935;
import dev.epro.r0.V6799596001827289384;
import dev.epro.r0.W4415201450379021245;
import dev.epro.r0.Y14417549073248885649;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class tt3 implements M15281894020734075014 {
    public static final /* synthetic */ tt3 b;
    public static final /* synthetic */ tt3 c;
    public static final /* synthetic */ tt3 d;
    public static final /* synthetic */ tt3 e;
    public static final /* synthetic */ tt3 f;
    public static final /* synthetic */ tt3 g;
    public static final /* synthetic */ tt3 h;
    public static final /* synthetic */ tt3 i;
    public static final /* synthetic */ tt3 j;
    public static final /* synthetic */ tt3 k;
    public static final /* synthetic */ tt3 l;
    public static final /* synthetic */ tt3 m;
    public static final /* synthetic */ tt3 n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ tt3 f111o;
    public static final /* synthetic */ tt3 p;
    public static final /* synthetic */ tt3 q;
    public static final /* synthetic */ tt3 r;
    public static final /* synthetic */ tt3 s;
    public static final /* synthetic */ tt3 t;
    public static final /* synthetic */ tt3 u;
    public static final /* synthetic */ tt3 v;
    public final /* synthetic */ int a;

    static {
        int d2 = C468629748621011703.d(((~1281944976) & 1463473736) | 847256033, (1281944976 & 1698424328) | 948255187, -1554299394, 419914800) ^ (1727952741 % 1091714937);
        v = new tt3(20);
        u = new tt3(19);
        t = new tt3(18);
        s = new tt3(17);
        r = new tt3(16);
        q = new tt3(15);
        p = new tt3(14);
        f111o = new tt3(13);
        n = new tt3(12);
        m = new tt3(11);
        l = new tt3(10);
        k = new tt3(9);
        j = new tt3(8);
        i = new tt3(7);
        h = new tt3(6);
        g = new tt3(5);
        f = new tt3(4);
        e = new tt3(3);
        d = new tt3(d2);
        c = new tt3(1);
        b = new tt3(0);
    }

    public /* synthetic */ tt3(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        hm2 hm2Var;
        hm2 hm2Var2;
        hm2 hm2Var3;
        hm2 hm2Var4;
        hm2 hm2Var5;
        hm2 hm2Var6;
        hm2 hm2Var7;
        hm2 hm2Var8;
        hm2 hm2Var9;
        hm2 hm2Var10;
        hm2 hm2Var11;
        hm2 hm2Var12;
        hm2 hm2Var13;
        hm2 hm2Var14;
        hm2 hm2Var15;
        hm2 hm2Var16;
        hm2 hm2Var17;
        hm2 hm2Var18;
        hm2 hm2Var19;
        hm2 hm2Var20;
        tt3 tt3Var = null;
        char c2 = 1;
        long j2 = 1;
        switch (this.a) {
            case 0:
                qu3 qu3Var = (qu3) obj;
                try {
                    mu3 mu3Var = qu3Var.a;
                    long c3 = mu3Var.a().c();
                    if (mu3Var.a().c() != 0) {
                        qu3Var.c.a(c3);
                    }
                    return Optional.empty();
                } catch (F15751422393861875968 unused) {
                    hm2Var = hm2.y;
                    return Optional.of(hm2Var);
                } catch (U10904789608794664935 | V6799596001827289384 unused2) {
                    hm2Var = hm2.j;
                    return Optional.of(hm2Var);
                } catch (Y14417549073248885649 unused3) {
                    hm2Var = hm2.z;
                    return Optional.of(hm2Var);
                }
            case 1:
                try {
                    mu3 mu3Var2 = ((qu3) obj).a;
                    long c4 = mu3Var2.a().c();
                    vu3 a = mu3Var2.a();
                    vu3 a2 = mu3Var2.a();
                    List e2 = a2.e();
                    if (c4 < 0) {
                        c4 += ((ArrayList) e2).size() + 1;
                    }
                    if (c4 >= 0) {
                        ArrayList arrayList = (ArrayList) e2;
                        if (c4 < arrayList.size() + 1) {
                            arrayList.add((int) c4, a);
                            mu3Var2.a(a2);
                            return Optional.empty();
                        }
                    }
                    throw new G7266811542160226366();
                } catch (F15751422393861875968 unused4) {
                    hm2Var2 = hm2.y;
                    return Optional.of(hm2Var2);
                } catch (G7266811542160226366 unused5) {
                    hm2Var2 = hm2.J;
                    return Optional.of(hm2Var2);
                } catch (N2553658702658867020 e3) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e3);
                    return null;
                } catch (Y14417549073248885649 unused6) {
                    hm2Var2 = hm2.z;
                    return Optional.of(hm2Var2);
                }
            case 2:
                qu3 qu3Var2 = (qu3) obj;
                try {
                    mu3 mu3Var3 = qu3Var2.a;
                    long c5 = mu3Var3.a().c();
                    if (mu3Var3.a().c() == 0) {
                        qu3Var2.c.a(c5);
                    }
                    return Optional.empty();
                } catch (F15751422393861875968 unused7) {
                    hm2Var3 = hm2.y;
                    return Optional.of(hm2Var3);
                } catch (U10904789608794664935 | V6799596001827289384 unused8) {
                    hm2Var3 = hm2.j;
                    return Optional.of(hm2Var3);
                } catch (Y14417549073248885649 unused9) {
                    hm2Var3 = hm2.z;
                    return Optional.of(hm2Var3);
                }
            case 3:
                try {
                    ((qu3) obj).a.a(vu3.a(((ArrayList) r0.a().e()).size()));
                    return Optional.empty();
                } catch (F15751422393861875968 unused10) {
                    hm2Var4 = hm2.y;
                    return Optional.of(hm2Var4);
                } catch (N2553658702658867020 e4) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e4);
                    return null;
                } catch (Y14417549073248885649 unused11) {
                    hm2Var4 = hm2.z;
                    return Optional.of(hm2Var4);
                }
            case 4:
                try {
                    ((qu3) obj).a.a(vu3.a(r0.a().d().a.length));
                    return Optional.empty();
                } catch (F15751422393861875968 unused12) {
                    hm2Var5 = hm2.y;
                    return Optional.of(hm2Var5);
                } catch (N2553658702658867020 e5) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e5);
                    return null;
                } catch (Y14417549073248885649 unused13) {
                    hm2Var5 = hm2.z;
                    return Optional.of(hm2Var5);
                }
            case 5:
                try {
                    mu3 mu3Var4 = ((qu3) obj).a;
                    mu3Var4.a(vu3.a(Math.log(mu3Var4.a().g())));
                    return Optional.empty();
                } catch (F15751422393861875968 unused14) {
                    hm2Var6 = hm2.y;
                    return Optional.of(hm2Var6);
                } catch (N2553658702658867020 e6) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e6);
                    return null;
                } catch (Y14417549073248885649 unused15) {
                    hm2Var6 = hm2.z;
                    return Optional.of(hm2Var6);
                }
            case 6:
                try {
                    mu3 mu3Var5 = ((qu3) obj).a;
                    long c6 = mu3Var5.a().c();
                    long c7 = mu3Var5.a().c();
                    if (c6 == 0 || c7 == 0) {
                        j2 = 0;
                    }
                    mu3Var5.a(vu3.a(j2));
                    return Optional.empty();
                } catch (F15751422393861875968 unused16) {
                    hm2Var7 = hm2.y;
                    return Optional.of(hm2Var7);
                } catch (N2553658702658867020 e7) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e7);
                    return null;
                } catch (Y14417549073248885649 unused17) {
                    hm2Var7 = hm2.z;
                    return Optional.of(hm2Var7);
                }
            case 7:
                try {
                    mu3 mu3Var6 = ((qu3) obj).a;
                    if (mu3Var6.a().c() != 0) {
                        j2 = 0;
                    }
                    mu3Var6.a(vu3.a(j2));
                    return Optional.empty();
                } catch (F15751422393861875968 unused18) {
                    hm2Var8 = hm2.y;
                    return Optional.of(hm2Var8);
                } catch (N2553658702658867020 e8) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e8);
                    return null;
                } catch (Y14417549073248885649 unused19) {
                    hm2Var8 = hm2.z;
                    return Optional.of(hm2Var8);
                }
            case 8:
                try {
                    mu3 mu3Var7 = ((qu3) obj).a;
                    long c8 = mu3Var7.a().c();
                    long c9 = mu3Var7.a().c();
                    if (c8 == 0 && c9 == 0) {
                        j2 = 0;
                    }
                    mu3Var7.a(vu3.a(j2));
                    return Optional.empty();
                } catch (F15751422393861875968 unused20) {
                    hm2Var9 = hm2.y;
                    return Optional.of(hm2Var9);
                } catch (N2553658702658867020 e9) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e9);
                    return null;
                } catch (Y14417549073248885649 unused21) {
                    hm2Var9 = hm2.z;
                    return Optional.of(hm2Var9);
                }
            case 9:
                qu3 qu3Var3 = (qu3) obj;
                try {
                    mu3 mu3Var8 = qu3Var3.a;
                    try {
                        int compare = new ru3(false).compare(mu3Var8.a(), mu3Var8.a());
                        mu3 mu3Var9 = qu3Var3.a;
                        if (compare >= 0) {
                            j2 = 0;
                        }
                        mu3Var9.a(vu3.a(j2));
                        return Optional.empty();
                    } catch (IllegalArgumentException unused22) {
                        return Optional.of(hm2.e);
                    }
                } catch (F15751422393861875968 unused23) {
                    return Optional.of(hm2.y);
                } catch (N2553658702658867020 e10) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e10);
                    return null;
                }
            case 10:
                qu3 qu3Var4 = (qu3) obj;
                try {
                    try {
                        try {
                            mu3 mu3Var10 = qu3Var4.a;
                            long c10 = mu3Var10.a().c();
                            int[] iArr = {1516266761, 1142957872, 446044582, 1147282962, 861635011, -1643766350, 500618996, 1941690360, 410409117};
                            char c11 = 7;
                            char c12 = '\b';
                            int i2 = iArr[7] % iArr[8];
                            ArrayList arrayList2 = new ArrayList();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < mu3Var10.b) {
                                try {
                                    try {
                                        vu3 a3 = vu3.a((vu3) ((ArrayList) mu3Var10.a).get(i3));
                                        int[] iArr2 = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
                                        this = tt3Var;
                                        try {
                                            int i5 = iArr2[0];
                                            int i6 = iArr2[c2];
                                            int i7 = iArr2[2];
                                            int i8 = iArr2[3];
                                            char c13 = c2;
                                            char c14 = c11;
                                            char c15 = c12;
                                            if (i4 >= (C468629748621011703.d(((~i5) & i6) | i7, (i5 & i8) | iArr2[4], iArr2[5], iArr2[6]) ^ (iArr2[c14] % iArr2[c12]))) {
                                                throw new N2553658702658867020();
                                            }
                                            if (i4 == arrayList2.size()) {
                                                arrayList2.add(a3);
                                            } else {
                                                arrayList2.set(i4, a3);
                                            }
                                            i4++;
                                            i3++;
                                            tt3Var = this;
                                            c11 = c14;
                                            c2 = c13;
                                            c12 = c15;
                                        } catch (N2553658702658867020 e11) {
                                            e = e11;
                                            throw new AssertionError(xt3.a("CEiv6BFfPnitUE+D"), e);
                                        }
                                    } catch (N2553658702658867020 e12) {
                                        e = e12;
                                    }
                                } catch (N2553658702658867020 e13) {
                                    e = e13;
                                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e);
                                    return this;
                                }
                            }
                            char c16 = c11;
                            char c17 = c12;
                            O3228356295430981133 o3228356295430981133 = qu3Var4.c;
                            O3228356295430981133 o32283562954309811332 = new O3228356295430981133((zt3) o3228356295430981133.b, o3228356295430981133.a, ((O313374706087262796) o3228356295430981133.c).a(), (O12545633033254628644) o3228356295430981133.d);
                            int[] iArr3 = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
                            int i9 = iArr3[c16] % iArr3[c17];
                            int[] iArr4 = {114723506, 151129280, 1368781114, 134385090, 816173334, -1981646764, 34563124, 1737518944, 282828202};
                            int i10 = iArr4[c16] % iArr4[c17];
                            new ArrayDeque();
                            o32283562954309811332.a(c10);
                            mu3Var10.a(vu3.a(new O12545633033254628644((byte) 15)));
                            return Optional.empty();
                        } catch (N2553658702658867020 e14) {
                            e = e14;
                            this = null;
                        }
                    } catch (U10904789608794664935 | V6799596001827289384 unused24) {
                        hm2Var10 = hm2.u;
                        return Optional.of(hm2Var10);
                    }
                } catch (F15751422393861875968 unused25) {
                    hm2Var10 = hm2.y;
                    return Optional.of(hm2Var10);
                } catch (Y14417549073248885649 unused26) {
                    hm2Var10 = hm2.z;
                    return Optional.of(hm2Var10);
                }
            case 11:
                try {
                    mu3 mu3Var11 = ((qu3) obj).a;
                    mu3Var11.a(vu3.a(mu3Var11.a().a((Class) mu3Var11.a().b())));
                    return Optional.empty();
                } catch (F15751422393861875968 unused27) {
                    hm2Var11 = hm2.y;
                    return Optional.of(hm2Var11);
                } catch (N2553658702658867020 e15) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e15);
                    return null;
                } catch (Y14417549073248885649 unused28) {
                    hm2Var11 = hm2.q;
                    return Optional.of(hm2Var11);
                }
            case 12:
                try {
                    mu3 mu3Var12 = ((qu3) obj).a;
                    long c18 = mu3Var12.a().c();
                    long c19 = mu3Var12.a().c();
                    if (c18 == 0) {
                        return Optional.of(hm2.G);
                    }
                    mu3Var12.a(vu3.a(c19 % c18));
                    return Optional.empty();
                } catch (F15751422393861875968 unused29) {
                    hm2Var12 = hm2.y;
                    return Optional.of(hm2Var12);
                } catch (N2553658702658867020 e16) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e16);
                    return null;
                } catch (Y14417549073248885649 unused30) {
                    hm2Var12 = hm2.z;
                    return Optional.of(hm2Var12);
                }
            case 13:
                try {
                    mu3 mu3Var13 = ((qu3) obj).a;
                    mu3Var13.a(vu3.a(mu3Var13.a().g() * mu3Var13.a().g()));
                    return Optional.empty();
                } catch (F15751422393861875968 unused31) {
                    hm2Var13 = hm2.y;
                    return Optional.of(hm2Var13);
                } catch (N2553658702658867020 e17) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e17);
                    return null;
                } catch (Y14417549073248885649 unused32) {
                    hm2Var13 = hm2.z;
                    return Optional.of(hm2Var13);
                }
            case 14:
                try {
                    mu3 mu3Var14 = ((qu3) obj).a;
                    mu3Var14.a(vu3.a(mu3Var14.a().c() * mu3Var14.a().c()));
                    return Optional.empty();
                } catch (F15751422393861875968 unused33) {
                    hm2Var14 = hm2.y;
                    return Optional.of(hm2Var14);
                } catch (N2553658702658867020 e18) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e18);
                    return null;
                } catch (Y14417549073248885649 unused34) {
                    hm2Var14 = hm2.z;
                    return Optional.of(hm2Var14);
                }
            case 15:
                try {
                    mu3 mu3Var15 = ((qu3) obj).a;
                    long c20 = mu3Var15.a().c();
                    ArrayList arrayList3 = new ArrayList();
                    for (long j3 = 0; j3 < c20; j3++) {
                        arrayList3.add(mu3Var15.a());
                    }
                    Collections.reverse(arrayList3);
                    mu3Var15.a(vu3.a(arrayList3));
                    return Optional.empty();
                } catch (F15751422393861875968 unused35) {
                    hm2Var15 = hm2.y;
                    return Optional.of(hm2Var15);
                } catch (N2553658702658867020 e19) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e19);
                    return null;
                } catch (Y14417549073248885649 unused36) {
                    hm2Var15 = hm2.z;
                    return Optional.of(hm2Var15);
                }
            case 16:
                try {
                    mu3 mu3Var16 = ((qu3) obj).a;
                    mu3Var16.a(vu3.a(Math.pow(mu3Var16.a().g(), mu3Var16.a().g())));
                    return Optional.empty();
                } catch (F15751422393861875968 unused37) {
                    hm2Var16 = hm2.y;
                    return Optional.of(hm2Var16);
                } catch (N2553658702658867020 e20) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e20);
                    return null;
                } catch (Y14417549073248885649 unused38) {
                    hm2Var16 = hm2.z;
                    return Optional.of(hm2Var16);
                }
            case 17:
                try {
                    ((qu3) obj).a.a(vu3.a((Object) null));
                    return Optional.empty();
                } catch (N2553658702658867020 unused39) {
                    return Optional.of(hm2.b);
                }
            case 18:
                qu3 qu3Var5 = (qu3) obj;
                try {
                    ByteBuffer wrap = ByteBuffer.wrap(qu3Var5.c.b(64L).a());
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    qu3Var5.a.a(vu3.a(Double.longBitsToDouble(wrap.getLong())));
                    return Optional.empty();
                } catch (N2553658702658867020 unused40) {
                    hm2Var17 = hm2.b;
                    return Optional.of(hm2Var17);
                } catch (U10904789608794664935 unused41) {
                    hm2Var17 = hm2.A;
                    return Optional.of(hm2Var17);
                } catch (V6799596001827289384 e21) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e21);
                    return null;
                }
            case 19:
                qu3 qu3Var6 = (qu3) obj;
                try {
                    qu3Var6.a.a(vu3.a(qu3Var6.c.d()));
                    return Optional.empty();
                } catch (M1242531985831723076 unused42) {
                    hm2Var18 = hm2.E;
                    return Optional.of(hm2Var18);
                } catch (N2553658702658867020 unused43) {
                    hm2Var18 = hm2.b;
                    return Optional.of(hm2Var18);
                } catch (U10904789608794664935 unused44) {
                    hm2Var18 = hm2.A;
                    return Optional.of(hm2Var18);
                }
            default:
                qu3 qu3Var7 = (qu3) obj;
                try {
                    long d2 = qu3Var7.c.d();
                    if (d2 >= 0 && d2 <= 2147483647L) {
                        if ((7 & d2) != 0) {
                            hm2Var20 = hm2.f;
                            return Optional.of(hm2Var20);
                        }
                        qu3Var7.a.a(vu3.a(qu3Var7.c.b(d2)));
                        return Optional.empty();
                    }
                    hm2Var20 = hm2.A;
                    return Optional.of(hm2Var20);
                } catch (M1242531985831723076 unused45) {
                    hm2Var19 = hm2.E;
                    return Optional.of(hm2Var19);
                } catch (N2553658702658867020 unused46) {
                    hm2Var19 = hm2.b;
                    return Optional.of(hm2Var19);
                } catch (U10904789608794664935 unused47) {
                    hm2Var19 = hm2.A;
                    return Optional.of(hm2Var19);
                } catch (V6799596001827289384 e22) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e22);
                    return null;
                }
        }
    }
}
