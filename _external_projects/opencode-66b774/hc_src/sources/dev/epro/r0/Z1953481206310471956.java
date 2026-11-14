package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import java.io.Closeable;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes4.dex */
public abstract class Z1953481206310471956 {
    public static O4077903568229246 a;
    public static final B6440366792515411106 b;
    public static final L12293142626931145046 c;
    public static final X18244299380549586254 d;
    public static final X17873598080297061904 e;
    public static final Z14997871575210439922 f;
    public static final Z14997871575210439922 g;
    public static Z7022156542152740569 h;
    public static Z7022156542152740569 i;

    public static final Object A(R4833348786910499294 r4833348786910499294, S7864201625552763331 s7864201625552763331, B13729205492206812220 b13729205492206812220, J12078565427869724451 j12078565427869724451, J12043550928838212009[] j12043550928838212009Arr) {
        L9506193609949700881 l9506193609949700881 = new L9506193609949700881(null, s7864201625552763331, b13729205492206812220, j12078565427869724451, j12043550928838212009Arr);
        R7484071666555993541 r7484071666555993541 = new R7484071666555993541(r4833348786910499294, r4833348786910499294.getContext());
        Object t = M14643676963617488237.t(r7484071666555993541, r7484071666555993541, l9506193609949700881);
        return t == Z3437138737604933638.a ? t : O9245300239821758723.a;
    }

    public static byte[] B(byte[]... bArr) {
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            if (i2 > Integer.MAX_VALUE - bArr2.length) {
                W4415201450379021245.c("exceeded size limit");
                return null;
            }
            i2 += bArr2.length;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.O4077903568229246 C(android.content.Context r3, dev.epro.r0.W13223114868094258148 r4) {
        /*
            java.lang.Class<dev.epro.r0.Z1953481206310471956> r0 = dev.epro.r0.Z1953481206310471956.class
            monitor-enter(r0)
            dev.epro.r0.O4077903568229246 r1 = dev.epro.r0.Z1953481206310471956.a     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2d
            r2 = 30
            if (r1 < r2) goto L2f
            dev.epro.r0.W13223114868094258148 r1 = dev.epro.r0.W13223114868094258148.e     // Catch: java.lang.Throwable -> L2d
            if (r4 == r1) goto L18
            dev.epro.r0.W13223114868094258148 r1 = dev.epro.r0.W13223114868094258148.c     // Catch: java.lang.Throwable -> L2d
            if (r4 != r1) goto L16
            goto L18
        L16:
            r4 = 0
            goto L19
        L18:
            r4 = 1
        L19:
            android.os.Bundle r3 = dev.epro.r0.M18113111391818111737.F(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "android.net.http.EnableTelemetry"
            boolean r3 = r3.getBoolean(r1, r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            dev.epro.r0.S12430657229687651951 r3 = new dev.epro.r0.S12430657229687651951     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r3.<init>()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            dev.epro.r0.Z1953481206310471956.a = r3     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            goto L2f
        L2d:
            r3 = move-exception
            goto L3c
        L2f:
            dev.epro.r0.O4077903568229246 r3 = dev.epro.r0.Z1953481206310471956.a     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L3a
            dev.epro.r0.Z7412074657814901117 r3 = new dev.epro.r0.Z7412074657814901117     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            dev.epro.r0.Z1953481206310471956.a = r3     // Catch: java.lang.Throwable -> L2d
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return r3
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z1953481206310471956.C(android.content.Context, dev.epro.r0.W13223114868094258148):dev.epro.r0.O4077903568229246");
    }

    public static double D(double d2, double d3) {
        if (d2 < 0.0d || d2 > 100.0d) {
            return -1.0d;
        }
        double g0 = S2941385686793915703.g0(d2);
        double d4 = ((g0 + 5.0d) / d3) - 5.0d;
        if (d4 < 0.0d || d4 > 100.0d) {
            return -1.0d;
        }
        double V = V(g0, d4);
        double abs = Math.abs(V - d3);
        if (V < d3 && abs > 0.04d) {
            return -1.0d;
        }
        double N = ((S2941385686793915703.N(d4 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (N < 0.0d || N > 100.0d) {
            return -1.0d;
        }
        return N;
    }

    public static final I1722681268793429505 E(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new V1809491727248546130(f4096073349764486348));
    }

    public static final I1722681268793429505 F(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new F12358110522655318322(f4096073349764486348));
    }

    public static final I1722681268793429505 G(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new W2303524560813844463(f4096073349764486348));
    }

    public static final boolean H(R6653624393204003746 r6653624393204003746) {
        E10198359844879945462 k = r6653624393204003746.k();
        return !k.a.c(D10671166500636893138.j);
    }

    public static final boolean J(R6653624393204003746 r6653624393204003746) {
        Object g2 = r6653624393204003746.d.a.g(D10671166500636893138.L);
        if (g2 == null) {
            g2 = null;
        }
        Y16443381041276641359 y16443381041276641359 = (Y16443381041276641359) g2;
        A4559761392562572984 a4559761392562572984 = r6653624393204003746.d.a;
        Object g3 = a4559761392562572984.g(D10671166500636893138.z);
        if (g3 == null) {
            g3 = null;
        }
        H10924029057425269323 h10924029057425269323 = (H10924029057425269323) g3;
        boolean z = y16443381041276641359 != null;
        Object g4 = a4559761392562572984.g(D10671166500636893138.K);
        if (((Boolean) (g4 != null ? g4 : null)) == null || (h10924029057425269323 != null && h10924029057425269323.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String K(R6653624393204003746 r6653624393204003746, Resources resources) {
        E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        E10198359844879945462 e101983598448799454622 = r6653624393204003746.d;
        Object g2 = e10198359844879945462.a.g(D10671166500636893138.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        A4559761392562572984 a4559761392562572984 = e101983598448799454622.a;
        Object g3 = a4559761392562572984.g(D10671166500636893138.L);
        if (g3 == null) {
            g3 = null;
        }
        Y16443381041276641359 y16443381041276641359 = (Y16443381041276641359) g3;
        Object g4 = a4559761392562572984.g(D10671166500636893138.z);
        if (g4 == null) {
            g4 = null;
        }
        H10924029057425269323 h10924029057425269323 = (H10924029057425269323) g4;
        if (y16443381041276641359 != null) {
            int ordinal = y16443381041276641359.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        Z3383101362411723454.g();
                        return null;
                    }
                    if (g2 == null) {
                        g2 = resources.getString(R.string.indeterminate);
                    }
                } else if (h10924029057425269323 != null && h10924029057425269323.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (h10924029057425269323 != null && h10924029057425269323.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = a4559761392562572984.g(D10671166500636893138.K);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((h10924029057425269323 == null || h10924029057425269323.a != 4) && g2 == null) {
                g2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g6 = a4559761392562572984.g(D10671166500636893138.c);
        if (g6 == null) {
            g6 = null;
        }
        W10348577308927504951 w10348577308927504951 = (W10348577308927504951) g6;
        if (w10348577308927504951 != null) {
            if (w10348577308927504951 != W10348577308927504951.c) {
                if (g2 == null) {
                    W11178805066658661419 w11178805066658661419 = w10348577308927504951.b;
                    float f2 = w11178805066658661419.a - 0.0f == 0.0f ? 0.0f : (w10348577308927504951.a - 0.0f) / (w11178805066658661419.a - 0.0f);
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    g2 = resources.getString(R.string.template_percent, Integer.valueOf(f2 == 0.0f ? 0 : f2 == 1.0f ? 100 : W7808703833045379622.q(Math.round(f2 * 100.0f), 1, 99)));
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        P14992748401341948828 p14992748401341948828 = D10671166500636893138.G;
        if (a4559761392562572984.c(p14992748401341948828)) {
            A4559761392562572984 a45597613925625729842 = new R6653624393204003746(r6653624393204003746.a, true, r6653624393204003746.c, e101983598448799454622).k().a;
            Object g7 = a45597613925625729842.g(D10671166500636893138.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = a45597613925625729842.g(D10671166500636893138.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = a45597613925625729842.g(p14992748401341948828);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final M11181104712105445833 L(R6653624393204003746 r6653624393204003746) {
        Object g2 = r6653624393204003746.d.a.g(D10671166500636893138.G);
        if (g2 == null) {
            g2 = null;
        }
        M11181104712105445833 m11181104712105445833 = (M11181104712105445833) g2;
        Object g3 = r6653624393204003746.d.a.g(D10671166500636893138.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return m11181104712105445833 == null ? list != null ? (M11181104712105445833) R9411874267597469228.D0(list) : null : m11181104712105445833;
    }

    public static final int M(Z10384052377193817149 z10384052377193817149) {
        return (int) (z10384052377193817149.e == R7000310675073492254.a ? z10384052377193817149.i() & 4294967295L : z10384052377193817149.i() >> 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(dev.epro.r0.B15247780885501349728 r4, dev.epro.r0.J12078565427869724451 r5, java.lang.Throwable r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof dev.epro.r0.I7328724862288187584
            if (r0 == 0) goto L13
            r0 = r7
            dev.epro.r0.I7328724862288187584 r0 = (dev.epro.r0.I7328724862288187584) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.I7328724862288187584 r0 = new dev.epro.r0.I7328724862288187584
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r7)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r4 = move-exception
            goto L43
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L30:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.t = r6     // Catch: java.lang.Throwable -> L27
            r0.v = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L40
            return r5
        L40:
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            dev.epro.r0.O8620973563946607355.m(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z1953481206310471956.O(dev.epro.r0.B15247780885501349728, dev.epro.r0.J12078565427869724451, java.lang.Throwable, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static final boolean P(R6653624393204003746 r6653624393204003746, Resources resources) {
        if (U15853425786981391261.T(r6653624393204003746)) {
            return false;
        }
        E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        if (e10198359844879945462.c) {
            return true;
        }
        Object g2 = e10198359844879945462.a.g(D10671166500636893138.a);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return !((list != null ? (String) R9411874267597469228.D0(list) : null) == null && L(r6653624393204003746) == null && K(r6653624393204003746, resources) == null && !J(r6653624393204003746)) && Q(r6653624393204003746);
    }

    public static final boolean Q(R6653624393204003746 r6653624393204003746) {
        List i2;
        int i3;
        if (!r6653624393204003746.n()) {
            i2 = r6653624393204003746.i((r3 & 1) != 0 ? !r6653624393204003746.b : false, (r3 & 2) == 0);
            int size = i2.size();
            for (i3 = 0; i3 < size; i3++) {
                if (Q3791352212346016950.g((R6653624393204003746) i2.get(i3))) {
                }
            }
            H11725168162114556860 u = r6653624393204003746.c.u();
            while (true) {
                if (u == null) {
                    u = null;
                    break;
                }
                E10198359844879945462 w = u.w();
                if (w != null && w.c) {
                    break;
                }
                u = u.u();
            }
            return !(u != null);
        }
        return false;
    }

    public static final native void R(Q666984389051586531 q666984389051586531, Context context, F4096073349764486348 f4096073349764486348);

    public static double S(double d2, double d3) {
        if (d2 < 0.0d || d2 > 100.0d) {
            return -1.0d;
        }
        double g0 = S2941385686793915703.g0(d2);
        double d4 = ((g0 + 5.0d) * d3) - 5.0d;
        if (d4 < 0.0d || d4 > 100.0d) {
            return -1.0d;
        }
        double V = V(d4, g0);
        double abs = Math.abs(V - d3);
        if (V < d3 && abs > 0.04d) {
            return -1.0d;
        }
        double N = ((S2941385686793915703.N(d4 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (N < 0.0d || N > 100.0d) {
            return -1.0d;
        }
        return N;
    }

    public static final native N9848733003061264873 T(S5131558922358224965 s5131558922358224965, String str);

    public static double U(double d2, double d3) {
        return V(S2941385686793915703.g0(d2), S2941385686793915703.g0(d3));
    }

    public static double V(double d2, double d3) {
        double max = Math.max(d2, d3);
        if (max != d3) {
            d2 = d3;
        }
        return (max + 5.0d) / (d2 + 5.0d);
    }

    public static final native Q666984389051586531 W(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839);

    public static final I1722681268793429505 X(I1722681268793429505 i1722681268793429505, J13325455942816235854 j13325455942816235854, F4096073349764486348 f4096073349764486348, D2263415627065769548 d2263415627065769548, F4096073349764486348 f40960733497644863482) {
        return i1722681268793429505.Q0(new D14907547165806780713(j13325455942816235854, f4096073349764486348, d2263415627065769548, f40960733497644863482));
    }

    public static final native int Y(L7806822852433202770 l7806822852433202770);

    public static D14731132657808549702 Z(D14731132657808549702 d14731132657808549702) {
        if (d14731132657808549702.equals(D14731132657808549702.u)) {
            return D14731132657808549702.k0;
        }
        if (d14731132657808549702 == D14731132657808549702.v) {
            return D14731132657808549702.n0;
        }
        if (d14731132657808549702 == D14731132657808549702.w) {
            return D14731132657808549702.m0;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static final native void a(int i2, M3727281027331139839 m3727281027331139839);

    public static D14731132657808549702 a0(D14731132657808549702 d14731132657808549702) {
        D14731132657808549702 d147311326578085497022 = D14731132657808549702.v;
        if (d14731132657808549702 == D14731132657808549702.k0) {
            return D14731132657808549702.u;
        }
        if (d14731132657808549702 == D14731132657808549702.n0 || d14731132657808549702 == D14731132657808549702.l0) {
            return d147311326578085497022;
        }
        if (d14731132657808549702 == D14731132657808549702.m0) {
            return D14731132657808549702.w;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static final native void b(S10299358581234353046 s10299358581234353046, boolean z, O3963944098342584804 o3963944098342584804, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, boolean z2, M3727281027331139839 m3727281027331139839, int i2);

    public static final S6349823729575121924 b0(S6349823729575121924 s6349823729575121924, B1029012102904255937 b1029012102904255937, B1029012102904255937 b10290121029042559372) {
        if (!b1029012102904255937.C() || !b10290121029042559372.C()) {
            return S6349823729575121924.e;
        }
        return E2166724654553415323.a(b10290121029042559372.z(V12319504402545346730.z(b1029012102904255937).b(s6349823729575121924.f())), s6349823729575121924.e());
    }

    public static final native void c(S10299358581234353046 s10299358581234353046, boolean z, O3963944098342584804 o3963944098342584804, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, boolean z2, M3727281027331139839 m3727281027331139839, int i2);

    public static final native Object c0(Map map, L11072015257349232688 l11072015257349232688, A6662317080022852970 a6662317080022852970, Y8677434479363843196 y8677434479363843196, S12149038043497756300 s12149038043497756300, O12618538903588674667 o12618538903588674667, K14749510448791472029 k14749510448791472029);

    public static final native void d(Integer num, Integer num2, Z7022156542152740569 z7022156542152740569, Integer num3, B13729205492206812220 b13729205492206812220, Integer num4, B13729205492206812220 b137292054922068122202, boolean z, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static V14115061890849225617 e() {
        return new V14115061890849225617(1.0f, 1.0f);
    }

    public static final native void f(X1802920383322809664 x1802920383322809664, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static F2238012860950049442 g(int i2, int i3, int i4) {
        Bitmap createBitmap;
        H8745424616867554108 h8745424616867554108 = E4238948680093459570.e;
        Bitmap.Config d0 = S2941385686793915703.d0(i4);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, S2941385686793915703.d0(i4), true, F18342544821595307642.a(h8745424616867554108));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, d0);
            createBitmap.setHasAlpha(true);
        }
        return new F2238012860950049442(createBitmap);
    }

    public static final native void h(E9947071562186447382 e9947071562186447382, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, boolean z, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(W5797197595347441198 w5797197595347441198, W1972671267364756056 w1972671267364756056, W1972671267364756056 w19726712673647560562, F4096073349764486348 f4096073349764486348, Context context, L3957284589981577691 l3957284589981577691, List list);

    public static final native void j(List list, I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void k(N4052665617792397286 n4052665617792397286, K1246821697113442187 k1246821697113442187, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(String str, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, int i2, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final native void m(N1174624271152536908 n1174624271152536908, X11638668447546090163 x11638668447546090163, L12639328004344855510 l12639328004344855510, J12078565427869724451 j12078565427869724451, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(Q3156151770218362234 q3156151770218362234, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(Y7034775653804251053 y7034775653804251053, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(M16373572285252105429 m16373572285252105429, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(E16738326561887457683 e16738326561887457683, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void r(M16373572285252105429 m16373572285252105429, L7806822852433202770 l7806822852433202770, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(J17313955498997451402 j17313955498997451402, B13729205492206812220 b13729205492206812220, boolean z, boolean z2, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void t(J17313955498997451402 j17313955498997451402, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(dev.epro.r0.A2558500182237595544 r4, dev.epro.r0.B13729205492206812220 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof dev.epro.r0.H9421905009923414776
            if (r0 == 0) goto L13
            r0 = r6
            dev.epro.r0.H9421905009923414776 r0 = (dev.epro.r0.H9421905009923414776) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.H9421905009923414776 r0 = new dev.epro.r0.H9421905009923414776
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dev.epro.r0.B13729205492206812220 r5 = r0.t
            dev.epro.r0.E17665849472693074628.k(r6)     // Catch: java.lang.Throwable -> L28
            goto L63
        L28:
            r4 = move-exception
            goto L69
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.G8001132634698687269 r6 = r0.getContext()
            dev.epro.r0.P2382941533350862833 r1 = dev.epro.r0.P2382941533350862833.p
            dev.epro.r0.H7323971265464188398 r6 = r6.get(r1)
            if (r6 != r4) goto L6d
            r0.t = r5     // Catch: java.lang.Throwable -> L28
            r0.v = r3     // Catch: java.lang.Throwable -> L28
            dev.epro.r0.H7219028874700587498 r6 = new dev.epro.r0.H7219028874700587498     // Catch: java.lang.Throwable -> L28
            dev.epro.r0.R4833348786910499294 r0 = dev.epro.r0.E18444280280170001567.H(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.t()     // Catch: java.lang.Throwable -> L28
            dev.epro.r0.L13891208534469225493 r0 = new dev.epro.r0.L13891208534469225493     // Catch: java.lang.Throwable -> L28
            r1 = 3
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L28
            dev.epro.r0.J17843656891628349757 r4 = (dev.epro.r0.J17843656891628349757) r4     // Catch: java.lang.Throwable -> L28
            r4.i0(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L28
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r6) goto L63
            return r6
        L63:
            r5.invoke()
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L69:
            r5.invoke()
            throw r4
        L6d:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z1953481206310471956.u(dev.epro.r0.A2558500182237595544, dev.epro.r0.B13729205492206812220, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static final native V13036804752642915594 v(N1174624271152536908 n1174624271152536908, boolean z, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native Y7034775653804251053 w(F16705069398168805061 f16705069398168805061, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    public static final native J17313955498997451402 x(T12100831175298321930 t12100831175298321930, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, B13729205492206812220 b137292054922068122204, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void y(Q666984389051586531 q666984389051586531, U7462775155658476208 u7462775155658476208);

    public static final void z(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                O8620973563946607355.m(th, th2);
            }
        }
    }

    public Integer I() {
        return null;
    }

    public abstract T5990920249823963282 N();

    static {
        izmyclvb.qbtpmwoxbgtw3(60);
        b = new B6440366792515411106(Z14277976092397041931.class, new U15384774985926769650((byte) 23));
        c = new L12293142626931145046("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new U15384774985926769650((byte) 24));
        d = new X18244299380549586254(S8155930747170862961.class, new U15384774985926769650((byte) 25));
        e = new X17873598080297061904("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new U15384774985926769650((byte) 26));
        f = new Z14997871575210439922((byte) 5);
        g = new Z14997871575210439922((byte) 2);
    }
}
