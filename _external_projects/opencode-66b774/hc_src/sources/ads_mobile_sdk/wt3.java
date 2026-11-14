package ads_mobile_sdk;

import dev.epro.r0.C468629748621011703;
import dev.epro.r0.F15751422393861875968;
import dev.epro.r0.G7266811542160226366;
import dev.epro.r0.K14765462210213530574;
import dev.epro.r0.K1641439379888813200;
import dev.epro.r0.M1242531985831723076;
import dev.epro.r0.M15281894020734075014;
import dev.epro.r0.N2553658702658867020;
import dev.epro.r0.O12545633033254628644;
import dev.epro.r0.O3228356295430981133;
import dev.epro.r0.U10904789608794664935;
import dev.epro.r0.V6799596001827289384;
import dev.epro.r0.W4415201450379021245;
import dev.epro.r0.Y14417549073248885649;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class wt3 implements M15281894020734075014 {
    public static final /* synthetic */ wt3 b;
    public static final /* synthetic */ wt3 c;
    public static final /* synthetic */ wt3 d;
    public static final /* synthetic */ wt3 e;
    public static final /* synthetic */ wt3 f;
    public static final /* synthetic */ wt3 g;
    public static final /* synthetic */ wt3 h;
    public static final /* synthetic */ wt3 i;
    public static final /* synthetic */ wt3 j;
    public static final /* synthetic */ wt3 k;
    public static final /* synthetic */ wt3 l;
    public static final /* synthetic */ wt3 m;
    public static final /* synthetic */ wt3 n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ wt3 f125o;
    public static final /* synthetic */ wt3 p;
    public static final /* synthetic */ wt3 q;
    public final /* synthetic */ int a;

    static {
        int d2 = C468629748621011703.d(((~1566288819) & 1018167620) | 793479703, (1566288819 & 284165456) | 1648575546, -1602978314, 292218004) ^ (846942590 % 524688209);
        q = new wt3(15);
        p = new wt3(14);
        f125o = new wt3(13);
        n = new wt3(12);
        m = new wt3(11);
        l = new wt3(10);
        k = new wt3(9);
        j = new wt3(8);
        i = new wt3(7);
        h = new wt3(6);
        g = new wt3(5);
        f = new wt3(4);
        e = new wt3(3);
        d = new wt3(d2);
        c = new wt3(1);
        b = new wt3(0);
    }

    public /* synthetic */ wt3(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        hm2 hm2Var;
        hm2 hm2Var2;
        byte[] bArr;
        byte[] bArr2;
        hm2 hm2Var3;
        byte[] bArr3;
        byte[] bArr4;
        hm2 hm2Var4;
        hm2 hm2Var5;
        hm2 hm2Var6;
        hm2 hm2Var7;
        hm2 hm2Var8;
        hm2 hm2Var9;
        hm2 hm2Var10;
        long c2;
        vu3 a;
        hm2 hm2Var11;
        hm2 hm2Var12;
        vu3 vu3Var;
        hm2 hm2Var13;
        hm2 hm2Var14;
        hm2 hm2Var15;
        int d2 = C468629748621011703.d(1278170217, 57720280, 1421285553, 105108813) ^ 19713753;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return ((qu3) obj).a();
            case 1:
                try {
                    mu3 mu3Var = ((qu3) obj).a;
                    long c3 = mu3Var.a().c();
                    vu3 a2 = mu3Var.a();
                    List e2 = a2.e();
                    if (c3 < 0) {
                        c3 += ((ArrayList) e2).size();
                    }
                    if (c3 >= 0) {
                        ArrayList arrayList = (ArrayList) e2;
                        if (c3 < arrayList.size()) {
                            arrayList.remove((int) c3);
                            mu3Var.a(a2);
                            return Optional.empty();
                        }
                    }
                    throw new G7266811542160226366();
                } catch (F15751422393861875968 unused) {
                    hm2Var = hm2.y;
                    return Optional.of(hm2Var);
                } catch (G7266811542160226366 unused2) {
                    hm2Var = hm2.J;
                    return Optional.of(hm2Var);
                } catch (N2553658702658867020 e3) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e3);
                    return null;
                } catch (Y14417549073248885649 unused3) {
                    hm2Var = hm2.z;
                    return Optional.of(hm2Var);
                }
            case 2:
                qu3 qu3Var = (qu3) obj;
                try {
                    mu3 mu3Var2 = qu3Var.a;
                    vu3 a3 = mu3Var2.a();
                    zt3 d3 = mu3Var2.a().d();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        a3.a(byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        int length = byteArray.length;
                        if (length == 0) {
                            bArr = new byte[0];
                        } else {
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(byteArray, 0, bArr5, 0, length);
                            bArr = bArr5;
                        }
                        byte[] bArr6 = d3.a;
                        int length2 = bArr6.length + bArr.length;
                        byte[] bArr7 = new byte[length2];
                        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                        System.arraycopy(bArr, 0, bArr7, d3.a.length, bArr.length);
                        if (length2 == 0) {
                            bArr2 = new byte[0];
                        } else {
                            bArr2 = new byte[length2];
                            System.arraycopy(bArr7, 0, bArr2, 0, length2);
                        }
                        try {
                            qu3Var.a.a(vu3.a(new zt3(bArr2)));
                            return Optional.empty();
                        } catch (N2553658702658867020 e4) {
                            W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e4);
                            return null;
                        }
                    } catch (Y14417549073248885649 unused4) {
                        hm2Var2 = hm2.l;
                        return Optional.of(hm2Var2);
                    } catch (IOException e5) {
                        W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e5);
                        return null;
                    }
                } catch (F15751422393861875968 unused5) {
                    hm2Var2 = hm2.y;
                } catch (Y14417549073248885649 unused6) {
                    hm2Var2 = hm2.z;
                }
            case 3:
                qu3 qu3Var2 = (qu3) obj;
                try {
                    mu3 mu3Var3 = qu3Var2.a;
                    vu3 a4 = mu3Var3.a();
                    zt3 d4 = mu3Var3.a().d();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        O12545633033254628644.e(a4.c(), new c7(byteArrayOutputStream2, d2), false);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        int length3 = byteArray2.length;
                        if (length3 == 0) {
                            bArr3 = new byte[0];
                        } else {
                            byte[] bArr8 = new byte[length3];
                            System.arraycopy(byteArray2, 0, bArr8, 0, length3);
                            bArr3 = bArr8;
                        }
                        byte[] bArr9 = d4.a;
                        int length4 = bArr9.length + bArr3.length;
                        byte[] bArr10 = new byte[length4];
                        System.arraycopy(bArr9, 0, bArr10, 0, bArr9.length);
                        System.arraycopy(bArr3, 0, bArr10, d4.a.length, bArr3.length);
                        if (length4 == 0) {
                            bArr4 = new byte[0];
                        } else {
                            bArr4 = new byte[length4];
                            System.arraycopy(bArr10, 0, bArr4, 0, length4);
                        }
                        try {
                            qu3Var2.a.a(vu3.a(new zt3(bArr4)));
                            return Optional.empty();
                        } catch (N2553658702658867020 e6) {
                            W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e6);
                            return null;
                        }
                    } catch (Y14417549073248885649 unused7) {
                        hm2Var3 = hm2.l;
                        return Optional.of(hm2Var3);
                    } catch (IOException e7) {
                        W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e7);
                        return null;
                    }
                } catch (F15751422393861875968 unused8) {
                    hm2Var3 = hm2.y;
                } catch (Y14417549073248885649 unused9) {
                    hm2Var3 = hm2.z;
                }
            case 4:
                qu3 qu3Var3 = (qu3) obj;
                try {
                    O3228356295430981133 o3228356295430981133 = qu3Var3.c;
                    mu3 mu3Var4 = qu3Var3.a;
                    try {
                        ((ArrayList) mu3Var4.a).set(mu3Var4.a(-(qu3Var3.b.a().b + o3228356295430981133.d())), mu3Var4.a());
                        return Optional.empty();
                    } catch (F15751422393861875968 unused10) {
                        hm2Var4 = hm2.i;
                        return Optional.of(hm2Var4);
                    }
                } catch (F15751422393861875968 | K1641439379888813200 unused11) {
                    hm2Var4 = hm2.y;
                } catch (M1242531985831723076 | U10904789608794664935 unused12) {
                    hm2Var4 = hm2.z;
                }
            case 5:
                try {
                    mu3 mu3Var5 = ((qu3) obj).a;
                    mu3Var5.a(vu3.a(mu3Var5.a().c() << ((int) mu3Var5.a().c())));
                    return Optional.empty();
                } catch (F15751422393861875968 unused13) {
                    hm2Var5 = hm2.y;
                    return Optional.of(hm2Var5);
                } catch (N2553658702658867020 e8) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e8);
                    return null;
                } catch (Y14417549073248885649 unused14) {
                    hm2Var5 = hm2.z;
                    return Optional.of(hm2Var5);
                }
            case 6:
                try {
                    mu3 mu3Var6 = ((qu3) obj).a;
                    mu3Var6.a(vu3.a(mu3Var6.a().c() >>> ((int) mu3Var6.a().c())));
                    return Optional.empty();
                } catch (F15751422393861875968 unused15) {
                    hm2Var6 = hm2.y;
                    return Optional.of(hm2Var6);
                } catch (N2553658702658867020 e9) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e9);
                    return null;
                } catch (Y14417549073248885649 unused16) {
                    hm2Var6 = hm2.z;
                    return Optional.of(hm2Var6);
                }
            case 7:
                try {
                    mu3 mu3Var7 = ((qu3) obj).a;
                    mu3Var7.a(vu3.a(mu3Var7.a().g() - mu3Var7.a().g()));
                    return Optional.empty();
                } catch (F15751422393861875968 unused17) {
                    hm2Var7 = hm2.y;
                    return Optional.of(hm2Var7);
                } catch (N2553658702658867020 e10) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e10);
                    return null;
                } catch (Y14417549073248885649 unused18) {
                    hm2Var7 = hm2.z;
                    return Optional.of(hm2Var7);
                }
            case 8:
                try {
                    mu3 mu3Var8 = ((qu3) obj).a;
                    mu3Var8.a(vu3.a(mu3Var8.a().c() - mu3Var8.a().c()));
                    return Optional.empty();
                } catch (F15751422393861875968 unused19) {
                    hm2Var8 = hm2.y;
                    return Optional.of(hm2Var8);
                } catch (N2553658702658867020 e11) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e11);
                    return null;
                } catch (Y14417549073248885649 unused20) {
                    hm2Var8 = hm2.z;
                    return Optional.of(hm2Var8);
                }
            case 9:
                qu3 qu3Var4 = (qu3) obj;
                try {
                    mu3 mu3Var9 = qu3Var4.a;
                    long c4 = mu3Var9.a().c();
                    vu3 a5 = mu3Var9.a();
                    try {
                        mu3 mu3Var10 = qu3Var4.a;
                        ArrayList arrayList2 = (ArrayList) mu3Var10.a;
                        vu3 vu3Var2 = (vu3) arrayList2.get(mu3Var10.a(c4));
                        arrayList2.set(mu3Var10.a(c4), a5);
                        mu3Var10.a(vu3Var2);
                        return Optional.empty();
                    } catch (F15751422393861875968 unused21) {
                        hm2Var9 = hm2.i;
                        return Optional.of(hm2Var9);
                    } catch (N2553658702658867020 e12) {
                        W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e12);
                        return null;
                    }
                } catch (F15751422393861875968 unused22) {
                    hm2Var9 = hm2.y;
                } catch (Y14417549073248885649 unused23) {
                    hm2Var9 = hm2.z;
                }
            case 10:
                qu3 qu3Var5 = (qu3) obj;
                try {
                    mu3 mu3Var11 = qu3Var5.a;
                    c2 = qu3Var5.b.a().b + mu3Var11.a().c();
                    a = mu3Var11.a();
                } catch (F15751422393861875968 | K1641439379888813200 unused24) {
                    hm2Var10 = hm2.y;
                } catch (Y14417549073248885649 unused25) {
                    hm2Var10 = hm2.z;
                }
                try {
                    mu3 mu3Var12 = qu3Var5.a;
                    ArrayList arrayList3 = (ArrayList) mu3Var12.a;
                    long j2 = -c2;
                    vu3 vu3Var3 = (vu3) arrayList3.get(mu3Var12.a(j2));
                    arrayList3.set(mu3Var12.a(j2), a);
                    mu3Var12.a(vu3Var3);
                    return Optional.empty();
                } catch (F15751422393861875968 unused26) {
                    hm2Var10 = hm2.i;
                    return Optional.of(hm2Var10);
                } catch (N2553658702658867020 e13) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e13);
                    return null;
                }
            case 11:
                qu3 qu3Var6 = (qu3) obj;
                try {
                    O3228356295430981133 o32283562954309811332 = qu3Var6.c;
                    mu3 mu3Var13 = qu3Var6.a;
                    ArrayList arrayList4 = (ArrayList) mu3Var13.a;
                    long d5 = qu3Var6.b.a().b + o32283562954309811332.d();
                    vu3 a6 = mu3Var13.a();
                    long j3 = -d5;
                    try {
                        vu3 vu3Var4 = (vu3) arrayList4.get(mu3Var13.a(j3));
                        arrayList4.set(mu3Var13.a(j3), a6);
                        mu3Var13.a(vu3Var4);
                        return Optional.empty();
                    } catch (F15751422393861875968 unused27) {
                        hm2Var11 = hm2.i;
                        return Optional.of(hm2Var11);
                    } catch (N2553658702658867020 e14) {
                        W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e14);
                        return null;
                    }
                } catch (F15751422393861875968 | K1641439379888813200 unused28) {
                    hm2Var11 = hm2.y;
                } catch (M1242531985831723076 | U10904789608794664935 unused29) {
                    hm2Var11 = hm2.z;
                }
            case 12:
                qu3 qu3Var7 = (qu3) obj;
                try {
                    long c5 = qu3Var7.a.a().c();
                    try {
                        mu3 mu3Var14 = qu3Var7.a;
                        if (c5 == 0) {
                            vu3Var = mu3Var14.a();
                        } else {
                            mu3Var14.b--;
                            vu3Var = (vu3) ((ArrayList) mu3Var14.a).remove(mu3Var14.a(c5));
                        }
                        mu3Var14.a(vu3Var);
                        return Optional.empty();
                    } catch (F15751422393861875968 unused30) {
                        hm2Var12 = hm2.h;
                        return Optional.of(hm2Var12);
                    } catch (N2553658702658867020 e15) {
                        W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e15);
                        return null;
                    }
                } catch (F15751422393861875968 unused31) {
                    hm2Var12 = hm2.y;
                } catch (Y14417549073248885649 unused32) {
                    hm2Var12 = hm2.z;
                }
            case 13:
                qu3 qu3Var8 = (qu3) obj;
                try {
                    mu3 mu3Var15 = qu3Var8.a;
                    O3228356295430981133 o32283562954309811333 = qu3Var8.c;
                    long c6 = mu3Var15.a().c();
                    long c7 = mu3Var15.a().c();
                    ju3 ju3Var = qu3Var8.b;
                    ju3Var.a(o32283562954309811333.a(), c7, ju3Var.a().b);
                    o32283562954309811333.a(c6);
                    return Optional.empty();
                } catch (F15751422393861875968 unused33) {
                    hm2Var13 = hm2.y;
                    return Optional.of(hm2Var13);
                } catch (K14765462210213530574 unused34) {
                    hm2Var13 = hm2.C;
                    return Optional.of(hm2Var13);
                } catch (K1641439379888813200 unused35) {
                    hm2Var13 = hm2.x;
                    return Optional.of(hm2Var13);
                } catch (U10904789608794664935 | V6799596001827289384 unused36) {
                    hm2Var13 = hm2.s;
                    return Optional.of(hm2Var13);
                } catch (Y14417549073248885649 unused37) {
                    hm2Var13 = hm2.z;
                    return Optional.of(hm2Var13);
                }
            case 14:
                qu3 qu3Var9 = (qu3) obj;
                try {
                } catch (F15751422393861875968 unused38) {
                    hm2Var14 = hm2.y;
                }
                try {
                    qu3Var9.a.a(vu3.b(qu3Var9.a.a().b()));
                    return Optional.empty();
                } catch (N2553658702658867020 e16) {
                    W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e16);
                    return null;
                } catch (Y14417549073248885649 unused39) {
                    hm2Var14 = hm2.q;
                    return Optional.of(hm2Var14);
                }
            default:
                try {
                    mu3 mu3Var16 = ((qu3) obj).a;
                    ArrayList arrayList5 = (ArrayList) mu3Var16.a().e();
                    int size = arrayList5.size();
                    while (i2 < size) {
                        Object obj2 = arrayList5.get(i2);
                        i2++;
                        mu3Var16.a((vu3) obj2);
                    }
                    return Optional.empty();
                } catch (F15751422393861875968 unused40) {
                    hm2Var15 = hm2.y;
                    return Optional.of(hm2Var15);
                } catch (N2553658702658867020 unused41) {
                    hm2Var15 = hm2.b;
                    return Optional.of(hm2Var15);
                } catch (Y14417549073248885649 unused42) {
                    hm2Var15 = hm2.z;
                    return Optional.of(hm2Var15);
                }
        }
    }
}
