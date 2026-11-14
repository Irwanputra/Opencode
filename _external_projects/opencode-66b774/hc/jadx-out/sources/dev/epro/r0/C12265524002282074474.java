package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Rect;
import android.net.Network;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class C12265524002282074474 {
    public static final P14992748401341948828 A;
    public static final P14992748401341948828 B;
    public static final P14992748401341948828 C;
    public static final H11126897742451323118 D;
    public static final O2211401162397821294 E;
    public static final H2442898661687873181 F;
    public static final float G = 16.0f;
    public static final float H = 12.0f;
    public static final float I = 20.0f;
    public static final float J = 80.0f;
    public static final M14716691558468128220 a;
    public static final float[][] b;
    public static final float[][] c;
    public static final float[] d;
    public static final float[][] e;
    public static final J10770752472956524045 f;
    public static final Y4261039727803185691 g;
    public static final V10933700885381486763 h;
    public static final Y4261039727803185691 i;
    public static final float j;
    public static final Y4261039727803185691 k;
    public static final float l;
    public static final Y4261039727803185691 m;
    public static final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Y4261039727803185691 f180o;
    public static final D4961612090878789022 p;
    public static final Y4261039727803185691 q;
    public static final float r;
    public static final float s;
    public static final Y4261039727803185691 t;
    public static final Y4261039727803185691 u;
    public static final D4961612090878789022 v;
    public static final float w;
    public static final Y4261039727803185691 x;
    public static final D4961612090878789022 y;
    public static final float z;

    public C12265524002282074474(Y2666402291564931474 y2666402291564931474) {
        new Rect();
    }

    public static final native void A(T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void B(String str, F4096073349764486348 f4096073349764486348, String str2, I1722681268793429505 i1722681268793429505, Boolean bool, boolean z2, boolean z3, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void C(String str, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void D(int i2, X11638668447546090163 x11638668447546090163, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, boolean z2, boolean z3, boolean z4);

    public static final native void E(T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void F(int i2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, String str);

    public static final native void G(int i2, M3727281027331139839 m3727281027331139839);

    public static final void H(final B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, final I5573661370475160895 i5573661370475160895, final long j2, final long j3, X6737430859549363790 x6737430859549363790, final T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, final int i2, final int i3) {
        int i4;
        final I1722681268793429505 i17226812687934295052;
        final X6737430859549363790 x67374308595493637902;
        int i5;
        I1722681268793429505 i17226812687934295053;
        X6737430859549363790 x67374308595493637903;
        m3727281027331139839.b0(26608441);
        int i6 = i2 | (m3727281027331139839.h(b13729205492206812220) ? 4 : 2);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i6 | 48;
        } else {
            i4 = i6 | (m3727281027331139839.f(i1722681268793429505) ? 32 : 16);
        }
        int i8 = i4 | (m3727281027331139839.f(i5573661370475160895) ? 256 : 128) | (m3727281027331139839.e(j2) ? 2048 : 1024) | (m3727281027331139839.e(j3) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | 1638400;
        if (m3727281027331139839.R(i8 & 1, (4793491 & i8) != 4793490)) {
            m3727281027331139839.W();
            if ((i2 & 1) == 0 || m3727281027331139839.z()) {
                i5 = i8 & (-458753);
                i17226812687934295053 = i7 != 0 ? V10993962107938880611.a : i1722681268793429505;
                x67374308595493637903 = new X6737430859549363790(V12319504402545346730.c, V12319504402545346730.f, V12319504402545346730.d, V12319504402545346730.e);
            } else {
                m3727281027331139839.U();
                i5 = i8 & (-458753);
                i17226812687934295053 = i1722681268793429505;
                x67374308595493637903 = x6737430859549363790;
            }
            m3727281027331139839.r();
            d(b13729205492206812220, V16747615581620678882.n(i17226812687934295053, B11964701839924937722.d, 40.0f, 0.0f, 12), i5573661370475160895, j2, j3, x67374308595493637903, t15443218846549482730, m3727281027331139839, i5 & 33554318);
            x67374308595493637902 = x67374308595493637903;
            i17226812687934295052 = i17226812687934295053;
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            x67374308595493637902 = x6737430859549363790;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L12639328004344855510(i17226812687934295052, i5573661370475160895, j2, j3, x67374308595493637902, t15443218846549482730, i2, i3) { // from class: dev.epro.r0.G1544692126292535358
                public final /* synthetic */ I1722681268793429505 b;
                public final /* synthetic */ I5573661370475160895 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ X6737430859549363790 f;
                public final /* synthetic */ T15443218846549482730 g;
                public final /* synthetic */ byte h;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.h = i3;
                }

                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = V16504496955554646429.p(12582913);
                    C12265524002282074474.H(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (M3727281027331139839) obj, iP, this.h);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final native void I(int i2, F4096073349764486348 f4096073349764486348, T15443218846549482730 t15443218846549482730, T15443218846549482730 t154432188465494827302, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void J(int i2, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, String str, boolean z2);

    public static final Integer K(int i2) {
        return new Integer(i2);
    }

    public static final boolean L(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = O2161699089510411363.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    R6653624393204003746 r6653624393204003746 = (R6653624393204003746) obj2;
                    R6653624393204003746 r66536243932040037462 = (R6653624393204003746) obj;
                    arrayList2.add(new L2216691091636065972((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (r66536243932040037462.g().d() >> 32)) - Float.intBitsToFloat((int) (r6653624393204003746.g().d() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (r66536243932040037462.g().d() & 4294967295L)) - Float.intBitsToFloat((int) (r6653624393204003746.g().d() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((L2216691091636065972) R9411874267597469228.B0(list)).a;
            } else {
                if (list.isEmpty()) {
                    P3521844374884164894.c("Empty collection can't be reduced.");
                }
                Object objB0 = R9411874267597469228.B0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objB0 = new L2216691091636065972(L2216691091636065972.f(((L2216691091636065972) objB0).a, ((L2216691091636065972) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((L2216691091636065972) objB0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void M(Object obj) {
        if (obj != null) {
            return;
        }
        Z3383101362411723454.k("Cannot return null from a non-@Nullable @Provides method");
    }

    public static I1722681268793429505 N(I1722681268793429505 i1722681268793429505) {
        return i1722681268793429505.Q0(new J15219773361714290912(new F17594658268783405200((byte) 15)));
    }

    public static X17355325846973801304 O(Context context) {
        ProviderInfo providerInfo;
        O5645052741531709506 o5645052741531709506;
        ApplicationInfo applicationInfo;
        byte b2 = 9;
        T15504973625601650233 m8580228815930431099 = Build.VERSION.SDK_INT >= 28 ? new M8580228815930431099(b2) : new T15504973625601650233(b2);
        PackageManager packageManager = context.getPackageManager();
        K5751602218013079365.x("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            o5645052741531709506 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrH = m8580228815930431099.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrH) {
                    arrayList.add(signature.toByteArray());
                }
                o5645052741531709506 = new O5645052741531709506(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException unused) {
                o5645052741531709506 = null;
            }
        }
        if (o5645052741531709506 == null) {
            return null;
        }
        return new X17355325846973801304(new H15979689472288269991(context, o5645052741531709506));
    }

    public static C12265524002282074474 P(Y2666402291564931474 y2666402291564931474, int i2) {
        if (i2 == 0) {
            return new C12265524002282074474(y2666402291564931474);
        }
        if (i2 == 1) {
            return new C12265524002282074474(y2666402291564931474);
        }
        S10973172697741180971.j("invalid orientation");
        return null;
    }

    public static long Q(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    O15160157444238005800.l(i7);
                    Z3383101362411723454.n();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return O15160157444238005800.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long R(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    O15160157444238005800.l(i7);
                    Z3383101362411723454.n();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return O15160157444238005800.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static F3187248827616951674 S(SSLSession sSLSession) throws IOException {
        final List listK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            S10973172697741180971.m("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            Q11088980322693754445.h("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        F2833317347889062771 f2833317347889062771B = F2833317347889062771.b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            S10973172697741180971.m("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            Q11088980322693754445.h("tlsVersion == NONE");
            return null;
        }
        K5454855350570310837.b.getClass();
        K5454855350570310837 k5454855350570310837C = Y2677586711477821327.c(protocol);
        try {
            listK = C14766148968941961570.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listK = O2161699089510411363.a;
        }
        final byte b2 = 2;
        return new F3187248827616951674(k5454855350570310837C, f2833317347889062771B, C14766148968941961570.k(sSLSession.getLocalCertificates()), new B13729205492206812220() { // from class: dev.epro.r0.G4552399452704264984
            static {
                izmyclvb.dpqpjfpoanwt1(265);
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final native Object invoke();
        });
    }

    public static int T(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return E7030189496516270437.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean U(E10198359844879945462 e10198359844879945462) {
        P14992748401341948828 p14992748401341948828 = D10671166500636893138.s;
        A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
        Object objG = a4559761392562572984.g(p14992748401341948828);
        if (objG == null) {
            objG = null;
        }
        if (S10823041268949770285.t(objG, N5158094851646208854.d)) {
            return false;
        }
        return a4559761392562572984.b(E5458822993765169982.g) || a4559761392562572984.b(E5458822993765169982.h);
    }

    public static final native boolean V(String str);

    public static final native boolean W(String str);

    public static float X(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final native boolean Y(Context context);

    public static final native boolean Z(String str, List list, String str2, boolean z2);

    public static final native void a(long j2, M3727281027331139839 m3727281027331139839, int i2);

    public static Object a0(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final native void b(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, boolean z2, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static Executor b0(Executor executor, L7743116545240101509 l7743116545240101509) {
        executor.getClass();
        return executor == Z886113521968091188.a ? executor : new L16935913137280991791(executor, l7743116545240101509);
    }

    public static final void c(final T15443218846549482730 t15443218846549482730, final T15443218846549482730 t154432188465494827302, final B13729205492206812220 b13729205492206812220, final I1722681268793429505 i1722681268793429505, final boolean z2, I5573661370475160895 i5573661370475160895, final long j2, final long j3, X6737430859549363790 x6737430859549363790, M3727281027331139839 m3727281027331139839, final int i2, final int i3) {
        int i4;
        I1722681268793429505 i17226812687934295052;
        I5573661370475160895 i5573661370475160895B;
        long j4;
        final X6737430859549363790 x67374308595493637902;
        final I5573661370475160895 i55736613704751608952;
        int i5;
        X6737430859549363790 x67374308595493637903;
        int i6;
        m3727281027331139839.b0(-1161000600);
        if ((i2 & 6) == 0) {
            i4 = (m3727281027331139839.h(t15443218846549482730) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= m3727281027331139839.h(t154432188465494827302) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= m3727281027331139839.h(b13729205492206812220) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i17226812687934295052 = i1722681268793429505;
            i4 |= m3727281027331139839.f(i17226812687934295052) ? 2048 : 1024;
        } else {
            i17226812687934295052 = i1722681268793429505;
        }
        if ((i2 & 24576) == 0) {
            i4 |= m3727281027331139839.g(z2) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                i5573661370475160895B = i5573661370475160895;
                int i7 = m3727281027331139839.f(i5573661370475160895B) ? 131072 : 65536;
                i4 |= i7;
            } else {
                i5573661370475160895B = i5573661370475160895;
            }
            i4 |= i7;
        } else {
            i5573661370475160895B = i5573661370475160895;
        }
        if ((1572864 & i2) == 0) {
            i4 |= m3727281027331139839.e(j2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            j4 = j3;
            i4 |= m3727281027331139839.e(j4) ? 8388608 : 4194304;
        } else {
            j4 = j3;
        }
        if ((100663296 & i2) == 0) {
            i4 |= 33554432;
        }
        int i8 = i4 | 805306368;
        if (m3727281027331139839.R(i8 & 1, (306783379 & i8) != 306783378)) {
            m3727281027331139839.W();
            if ((i2 & 1) == 0 || m3727281027331139839.z()) {
                if ((i3 & 32) != 0) {
                    i5573661370475160895B = N13258083306148085703.b(O8620973563946607355.c, m3727281027331139839);
                    i8 &= -458753;
                }
                i5 = 12582912;
                x67374308595493637903 = new X6737430859549363790(V12319504402545346730.c, V12319504402545346730.f, V12319504402545346730.d, V12319504402545346730.e);
                i6 = i8 & (-234881025);
            } else {
                m3727281027331139839.U();
                if ((i3 & 32) != 0) {
                    i8 &= -458753;
                }
                i6 = i8 & (-234881025);
                x67374308595493637903 = x6737430859549363790;
                i5 = 12582912;
            }
            I5573661370475160895 i55736613704751608953 = i5573661370475160895B;
            m3727281027331139839.r();
            int i9 = i6 >> 6;
            int i10 = i6 >> 9;
            d(b13729205492206812220, i17226812687934295052, i55736613704751608953, j2, j4, x67374308595493637903, S10823041268949770285.T(632971498, new G11787712510121652869(z2, t154432188465494827302, t15443218846549482730), m3727281027331139839), m3727281027331139839, (i9 & 112) | (i9 & 14) | i5 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 3670016));
            i55736613704751608952 = i55736613704751608953;
            x67374308595493637902 = x67374308595493637903;
        } else {
            m3727281027331139839.U();
            x67374308595493637902 = x6737430859549363790;
            i55736613704751608952 = i5573661370475160895B;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L12639328004344855510() { // from class: dev.epro.r0.Y3987545473220121404
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = V16504496955554646429.p(i2 | 1);
                    C12265524002282074474.c(t15443218846549482730, t154432188465494827302, b13729205492206812220, i1722681268793429505, z2, i55736613704751608952, j2, j3, x67374308595493637902, (M3727281027331139839) obj, iP, i3);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final native S16571168858015125610 c0(M3727281027331139839 m3727281027331139839);

    public static final void d(B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, I5573661370475160895 i5573661370475160895, long j2, long j3, X6737430859549363790 x6737430859549363790, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        B13729205492206812220 b137292054922068122202;
        int i3;
        I5573661370475160895 i55736613704751608952;
        m3727281027331139839.b0(748201188);
        if ((i2 & 6) == 0) {
            b137292054922068122202 = b13729205492206812220;
            i3 = (m3727281027331139839.h(b137292054922068122202) ? 4 : 2) | i2;
        } else {
            b137292054922068122202 = b13729205492206812220;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i55736613704751608952 = i5573661370475160895;
            i3 |= m3727281027331139839.f(i55736613704751608952) ? 256 : 128;
        } else {
            i55736613704751608952 = i5573661370475160895;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.e(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.e(j3) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.f(x6737430859549363790) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m3727281027331139839.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 8388608 : 4194304;
        }
        if (m3727281027331139839.R(i3 & 1, (4793491 & i3) != 4793490)) {
            m3727281027331139839.W();
            if ((i2 & 1) != 0 && !m3727281027331139839.z()) {
                m3727281027331139839.U();
            }
            m3727281027331139839.r();
            int i4 = i3 << 9;
            e(b137292054922068122202, V6937487778750555249.a(O8620973563946607355.d, m3727281027331139839), V933048422416352811.c, i1722681268793429505, i55736613704751608952, j2, j3, x6737430859549363790, t15443218846549482730, m3727281027331139839, (i3 & 14) | 3456 | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), (i3 >> 21) & 14);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new T8512120711574733906(b13729205492206812220, i1722681268793429505, i5573661370475160895, j2, j3, x6737430859549363790, t15443218846549482730, i2, (byte) 0);
        }
    }

    public static final native F4096073349764486348 d0(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final void e(final B13729205492206812220 b13729205492206812220, final S16571168858015125610 s16571168858015125610, final float f2, final I1722681268793429505 i1722681268793429505, final I5573661370475160895 i5573661370475160895, final long j2, final long j3, final X6737430859549363790 x6737430859549363790, final T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, final int i2, final int i3) {
        int i4;
        T15443218846549482730 t154432188465494827302;
        int i5;
        int i6;
        I1722681268793429505 i17226812687934295052;
        m3727281027331139839.b0(121669932);
        if ((i2 & 6) == 0) {
            i4 = (m3727281027331139839.h(b13729205492206812220) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= m3727281027331139839.f(s16571168858015125610) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= m3727281027331139839.c(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= m3727281027331139839.c(56.0f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= m3727281027331139839.f(i1722681268793429505) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= m3727281027331139839.f(i5573661370475160895) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= m3727281027331139839.e(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= m3727281027331139839.e(j3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= m3727281027331139839.f(x6737430859549363790) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= m3727281027331139839.f(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((i3 & 6) == 0) {
            t154432188465494827302 = t15443218846549482730;
            i5 = i3 | (m3727281027331139839.h(t154432188465494827302) ? 4 : 2);
        } else {
            t154432188465494827302 = t15443218846549482730;
            i5 = i3;
        }
        if (m3727281027331139839.R(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            m3727281027331139839.W();
            if ((i2 & 1) != 0 && !m3727281027331139839.z()) {
                m3727281027331139839.U();
            }
            m3727281027331139839.r();
            m3727281027331139839.a0(-282833393);
            Object objM = m3727281027331139839.M();
            Object obj = O9023047933786425027.a;
            if (objM == obj) {
                objM = L11610354117192841236.m(m3727281027331139839);
            }
            S9385204271696540760 s9385204271696540760 = (S9385204271696540760) objM;
            m3727281027331139839.q(false);
            Object objM2 = m3727281027331139839.M();
            if (objM2 == obj) {
                objM2 = new V10450421848591554621((byte) 22);
                m3727281027331139839.k0(objM2);
            }
            I1722681268793429505 i1722681268793429505B = J11170665878571083300.b(i1722681268793429505, false, (F4096073349764486348) objM2);
            float f3 = x6737430859549363790.a;
            int i7 = i4 >> 21;
            int i8 = i7 & 112;
            boolean zF = m3727281027331139839.f(s9385204271696540760);
            Object objM3 = m3727281027331139839.M();
            if (zF || objM3 == obj) {
                i6 = i4;
                i17226812687934295052 = i1722681268793429505B;
                objM3 = new I16301936046009155866(x6737430859549363790.a, x6737430859549363790.b, x6737430859549363790.d, x6737430859549363790.c);
                m3727281027331139839.k0(objM3);
            } else {
                i6 = i4;
                i17226812687934295052 = i1722681268793429505B;
            }
            I16301936046009155866 i16301936046009155866 = (I16301936046009155866) objM3;
            boolean zH = m3727281027331139839.h(i16301936046009155866) | (((i8 ^ 48) > 32 && m3727281027331139839.f(x6737430859549363790)) || (i7 & 48) == 32);
            Object objM4 = m3727281027331139839.M();
            if (zH || objM4 == obj) {
                objM4 = new Y14354959068095823168(i16301936046009155866, x6737430859549363790, null, (byte) 23);
                m3727281027331139839.k0(objM4);
            }
            Q13169198992966610970.l((L12639328004344855510) objM4, m3727281027331139839, x6737430859549363790);
            boolean zF2 = m3727281027331139839.f(s9385204271696540760) | m3727281027331139839.h(i16301936046009155866);
            Object objM5 = m3727281027331139839.M();
            if (zF2 || objM5 == obj) {
                objM5 = new C288342651169725874((Object) s9385204271696540760, (Object) i16301936046009155866, (R4833348786910499294) null, (byte) 7);
                m3727281027331139839.k0(objM5);
            }
            Q13169198992966610970.l((L12639328004344855510) objM5, m3727281027331139839, s9385204271696540760);
            int i9 = i6 >> 6;
            X15668192874961033526.c(b13729205492206812220, i17226812687934295052, false, i5573661370475160895, j2, j3, f3, ((A891803927997771281) i16301936046009155866.e.c.b.getValue()).a, null, s9385204271696540760, S10823041268949770285.T(-1779603465, new H7321006148350780707(j3, s16571168858015125610, f2, t154432188465494827302), m3727281027331139839), m3727281027331139839, (i6 & 14) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 260);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L12639328004344855510() { // from class: dev.epro.r0.D8405577940929882501
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = V16504496955554646429.p(i2 | 1);
                    int iP2 = V16504496955554646429.p(i3);
                    C12265524002282074474.e(b13729205492206812220, s16571168858015125610, f2, i1722681268793429505, i5573661370475160895, j2, j3, x6737430859549363790, t15443218846549482730, (M3727281027331139839) obj2, iP, iP2);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final native Network e0(Map map);

    public static final native void f(int i2, M3727281027331139839 m3727281027331139839);

    public static final void f0(P11546267793636643785 p11546267793636643785, R6653624393204003746 r6653624393204003746) {
        AccessibilityNodeInfo accessibilityNodeInfo = p11546267793636643785.a;
        Object objG = r6653624393204003746.k().a.g(D10671166500636893138.f);
        if (objG == null) {
            objG = null;
        }
        Z9903412080743350895 z9903412080743350895 = (Z9903412080743350895) objG;
        if (z9903412080743350895 != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(z9903412080743350895.a, z9903412080743350895.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = r6653624393204003746.k().a.g(D10671166500636893138.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listI = r6653624393204003746.i((4 & 1) != 0 ? !r6653624393204003746.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                R6653624393204003746 r66536243932040037462 = (R6653624393204003746) listI.get(i2);
                if (r66536243932040037462.k().a.c(D10671166500636893138.K)) {
                    arrayList.add(r66536243932040037462);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zL = L(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zL ? 1 : arrayList.size(), zL ? arrayList.size() : 1, false, 0));
    }

    public static final native void g(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static float g0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final native void h(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void j(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void k(long j2, L739450498903353996 l739450498903353996, float f2, float f3, float f4, float f5, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(Z7022156542152740569 z7022156542152740569, long j2, long j3, float f2, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(String str, String str2, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void o(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void p(I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void r(X9711739285227992634 x9711739285227992634, Z7022156542152740569 z7022156542152740569, String str, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void t(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void u(String str, S16571168858015125610 s16571168858015125610, M3727281027331139839 m3727281027331139839, int i2);

    public static final void v(Object obj, int i2, Y18072866666914382106 y18072866666914382106, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i3) {
        int i4;
        m3727281027331139839.b0(872548579);
        if ((i3 & 6) == 0) {
            i4 = (m3727281027331139839.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= m3727281027331139839.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= m3727281027331139839.h(y18072866666914382106) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= m3727281027331139839.h(t15443218846549482730) ? 2048 : 1024;
        }
        if (m3727281027331139839.R(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = m3727281027331139839.f(obj) | m3727281027331139839.f(y18072866666914382106);
            Object objM = m3727281027331139839.M();
            Object obj2 = O9023047933786425027.a;
            if (zF || objM == obj2) {
                objM = new U11129743795775183256(obj, y18072866666914382106);
                m3727281027331139839.k0(objM);
            }
            U11129743795775183256 u11129743795775183256 = (U11129743795775183256) objM;
            u11129743795775183256.c = i2;
            V697849047308847220 v697849047308847220 = u11129743795775183256.g;
            T5853297761459116769 t5853297761459116769 = N17583467559733741163.a;
            U11129743795775183256 u111297437957751832562 = (U11129743795775183256) m3727281027331139839.j(t5853297761459116769);
            M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
            F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
            M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
            try {
                if (u111297437957751832562 != ((U11129743795775183256) v697849047308847220.getValue())) {
                    v697849047308847220.setValue(u111297437957751832562);
                    if (u11129743795775183256.d > 0) {
                        U11129743795775183256 u111297437957751832563 = u11129743795775183256.e;
                        if (u111297437957751832563 != null) {
                            u111297437957751832563.b();
                        }
                        if (u111297437957751832562 != null) {
                            u111297437957751832562.a();
                        } else {
                            u111297437957751832562 = null;
                        }
                        u11129743795775183256.e = u111297437957751832562;
                    }
                }
                T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                boolean zF2 = m3727281027331139839.f(u11129743795775183256);
                Object objM2 = m3727281027331139839.M();
                if (zF2 || objM2 == obj2) {
                    objM2 = new S16262227471297796850(u11129743795775183256, (byte) 16);
                    m3727281027331139839.k0(objM2);
                }
                Q13169198992966610970.c(u11129743795775183256, (F4096073349764486348) objM2, m3727281027331139839);
                D1286559660607336098.a(t5853297761459116769.a(u11129743795775183256), t15443218846549482730, m3727281027331139839, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                throw th;
            }
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new Q11332685592351358116(obj, i2, y18072866666914382106, t15443218846549482730, i3);
        }
    }

    public static final native void w(N4052665617792397286 n4052665617792397286, K1246821697113442187 k1246821697113442187, S2557420383749238385 s2557420383749238385, int i2, K2873849635944727774 k2873849635944727774, V677500462523087962 v677500462523087962, S10052587290883391683 s10052587290883391683, V13036804752642915594 v13036804752642915594, J17313955498997451402 j17313955498997451402, L11638193457662313911 l11638193457662313911, A10495107642642017717 a10495107642642017717, Y7034775653804251053 y7034775653804251053, W13113573137839331180 w13113573137839331180, G2190230421268324049 g2190230421268324049, L12639328004344855510 l12639328004344855510, boolean z2, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, boolean z3, F4096073349764486348 f40960733497644863484, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void x(N4052665617792397286 n4052665617792397286, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void y(String str, boolean z2, F4096073349764486348 f4096073349764486348, boolean z3, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void z(int i2, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, boolean z2);

    static {
        izmyclvb.oeynnivvrnts0(1219);
        a = new M14716691558468128220((byte) 0);
        b = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        c = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        d = new float[]{95.047f, 100.0f, 108.883f};
        e = new float[][]{new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
        f = new J10770752472956524045((byte) 11);
        g = Y4261039727803185691.r;
        h = V10933700885381486763.i;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.h;
        i = y4261039727803185691;
        j = 0.38f;
        k = y4261039727803185691;
        l = 0.38f;
        m = y4261039727803185691;
        n = 0.38f;
        f180o = y4261039727803185691;
        p = D4961612090878789022.a;
        Y4261039727803185691 y42610397278031856912 = Y4261039727803185691.i;
        q = y42610397278031856912;
        r = 24.0f;
        s = 56.0f;
        t = y42610397278031856912;
        u = y42610397278031856912;
        v = D4961612090878789022.b;
        w = 88.0f;
        x = y42610397278031856912;
        y = D4961612090878789022.j;
        z = 72.0f;
        A = new P14992748401341948828("TestTagsAsResourceId", false, new R15397193384711361242((byte) 11));
        B = new P14992748401341948828("AccessibilityClassName", true, new R15397193384711361242((byte) 3));
        C = new P14992748401341948828("CredentialRequest", false, new R15397193384711361242((byte) 12));
        D = new H11126897742451323118();
        E = new O2211401162397821294(Y2188645061177063576.class, Q18154916179356040156.class, new Z3383101362411723454((byte) 2));
        F = new H2442898661687873181((byte) 5);
    }
}
