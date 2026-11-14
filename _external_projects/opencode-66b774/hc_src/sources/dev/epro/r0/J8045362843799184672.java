package dev.epro.r0;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class J8045362843799184672 implements L15260231637027815334 {
    public static final D14731132657808549702 a;
    public static final D14731132657808549702 b;
    public static final D14731132657808549702 c;
    public static final double[][] d;
    public static final double[][] e;
    public static final double[] f;
    public static final double[] g;
    public static final M10846389789027735899 h;
    public static final O14561027293699174040 i;
    public static final B6440366792515411106 j;
    public static final L12293142626931145046 k;
    public static final X18244299380549586254 l;
    public static final X17873598080297061904 m;
    public static final H2442898661687873181 n;

    /* renamed from: o, reason: collision with root package name */
    public static Z7022156542152740569 f317o;
    public static Z7022156542152740569 p;
    public static Z7022156542152740569 q;

    public static int A(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static final M7102034154292440921 A0(H12684780467384173668 h12684780467384173668, M3727281027331139839 m3727281027331139839) {
        return L((O9687594455265514205) m3727281027331139839.j(G11685961213648131200.a), h12684780467384173668);
    }

    public static long B(int i2, byte[] bArr) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static int C(Y3341182438442346389 y3341182438442346389, int i2, byte[] bArr, int i3, int i4, A10696933611341011168 a10696933611341011168, D15735805680132151670 d15735805680132151670) {
        Object d2 = y3341182438442346389.d();
        Y3341182438442346389 y33411824384423463892 = y3341182438442346389;
        byte[] bArr2 = bArr;
        int i5 = i4;
        D15735805680132151670 d157358056801321516702 = d15735805680132151670;
        int m0 = m0(d2, y33411824384423463892, bArr2, i3, i5, d157358056801321516702);
        y33411824384423463892.b(d2);
        d157358056801321516702.c = d2;
        a10696933611341011168.add(d2);
        while (m0 < i5) {
            D15735805680132151670 d157358056801321516703 = d157358056801321516702;
            int i6 = i5;
            int F = F(bArr2, m0, d157358056801321516703);
            if (i2 != d157358056801321516703.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            Y3341182438442346389 y33411824384423463893 = y33411824384423463892;
            Object d3 = y33411824384423463893.d();
            m0 = m0(d3, y33411824384423463893, bArr3, F, i6, d157358056801321516703);
            y33411824384423463892 = y33411824384423463893;
            bArr2 = bArr3;
            i5 = i6;
            d157358056801321516702 = d157358056801321516703;
            y33411824384423463892.b(d3);
            d157358056801321516702.c = d3;
            a10696933611341011168.add(d3);
        }
        return m0;
    }

    public static int D(int i2, byte[] bArr, int i3, int i4, C10101319439186475078 c10101319439186475078, D15735805680132151670 d15735805680132151670) {
        if ((i2 >>> 3) == 0) {
            throw new N11355818201711573941("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int H = H(bArr, i3, d15735805680132151670);
            c10101319439186475078.d(i2, Long.valueOf(d15735805680132151670.b));
            return H;
        }
        if (i5 == 1) {
            c10101319439186475078.d(i2, Long.valueOf(B(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int F = F(bArr, i3, d15735805680132151670);
            int i6 = d15735805680132151670.a;
            if (i6 < 0) {
                throw N11355818201711573941.c();
            }
            if (i6 > bArr.length - F) {
                throw N11355818201711573941.e();
            }
            if (i6 == 0) {
                c10101319439186475078.d(i2, N17666688112968464504.b);
            } else {
                c10101319439186475078.d(i2, N17666688112968464504.i(F, bArr, i6));
            }
            return F + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new N11355818201711573941("Protocol message contained an invalid tag (zero).");
            }
            c10101319439186475078.d(i2, Integer.valueOf(A(i3, bArr)));
            return i3 + 4;
        }
        C10101319439186475078 c2 = C10101319439186475078.c();
        int i7 = (i2 & (-8)) | 4;
        int i8 = d15735805680132151670.d + 1;
        d15735805680132151670.d = i8;
        if (i8 >= 100) {
            throw new N11355818201711573941("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int F2 = F(bArr, i3, d15735805680132151670);
            int i10 = d15735805680132151670.a;
            if (i10 == i7) {
                i9 = i10;
                i3 = F2;
                break;
            }
            i3 = D(i10, bArr, F2, i4, c2, d15735805680132151670);
            i9 = i10;
        }
        d15735805680132151670.d--;
        if (i3 > i4 || i9 != i7) {
            throw N11355818201711573941.d();
        }
        c10101319439186475078.d(i2, c2);
        return i3;
    }

    public static int E(int i2, int i3, D15735805680132151670 d15735805680132151670, byte[] bArr) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            d15735805680132151670.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            d15735805680132151670.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            d15735805680132151670.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            d15735805680132151670.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                d15735805680132151670.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int F(byte[] bArr, int i2, D15735805680132151670 d15735805680132151670) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return E(b2, i3, d15735805680132151670, bArr);
        }
        d15735805680132151670.a = b2;
        return i3;
    }

    public static int G(int i2, byte[] bArr, int i3, int i4, A10696933611341011168 a10696933611341011168, D15735805680132151670 d15735805680132151670) {
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int F = F(bArr, i3, d15735805680132151670);
        u9933786248742319541.b(d15735805680132151670.a);
        while (F < i4) {
            int F2 = F(bArr, F, d15735805680132151670);
            if (i2 != d15735805680132151670.a) {
                break;
            }
            F = F(bArr, F2, d15735805680132151670);
            u9933786248742319541.b(d15735805680132151670.a);
        }
        return F;
    }

    public static int H(byte[] bArr, int i2, D15735805680132151670 d15735805680132151670) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            d15735805680132151670.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        d15735805680132151670.b = j3;
        return i4;
    }

    public static final Object I(long j2, R4833348786910499294 r4833348786910499294) {
        if (j2 > 0) {
            H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r4833348786910499294));
            h7219028874700587498.t();
            if (j2 < Long.MAX_VALUE) {
                P(h7219028874700587498.e).h(j2, h7219028874700587498);
            }
            Object r = h7219028874700587498.r();
            if (r == Z3437138737604933638.a) {
                return r;
            }
        }
        return O9245300239821758723.a;
    }

    public static final Object J(long j2, R4833348786910499294 r4833348786910499294) {
        Object I = I(v0(j2), r4833348786910499294);
        return I == Z3437138737604933638.a ? I : O9245300239821758723.a;
    }

    public static final void K(G8001132634698687269 g8001132634698687269) {
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) g8001132634698687269.get(P2382941533350862833.p);
        if (q15035754882231748864 != null && !q15035754882231748864.b()) {
            throw q15035754882231748864.o();
        }
    }

    public static final M7102034154292440921 L(O9687594455265514205 o9687594455265514205, H12684780467384173668 h12684780467384173668) {
        int ordinal = h12684780467384173668.ordinal();
        if (ordinal == 0) {
            o9687594455265514205.getClass();
            M7102034154292440921 m7102034154292440921 = O9687594455265514205.b;
            m7102034154292440921.getClass();
            return m7102034154292440921;
        }
        if (ordinal == 1) {
            o9687594455265514205.getClass();
            M7102034154292440921 m71020341542924409212 = O9687594455265514205.c;
            m71020341542924409212.getClass();
            return m71020341542924409212;
        }
        if (ordinal == 2) {
            o9687594455265514205.getClass();
            M7102034154292440921 m71020341542924409213 = O9687594455265514205.d;
            m71020341542924409213.getClass();
            return m71020341542924409213;
        }
        if (ordinal == 3) {
            o9687594455265514205.getClass();
            M7102034154292440921 m71020341542924409214 = O9687594455265514205.e;
            m71020341542924409214.getClass();
            return m71020341542924409214;
        }
        if (ordinal == 4) {
            o9687594455265514205.getClass();
            M7102034154292440921 m71020341542924409215 = O9687594455265514205.f;
            m71020341542924409215.getClass();
            return m71020341542924409215;
        }
        if (ordinal != 5) {
            Z3383101362411723454.g();
            return null;
        }
        o9687594455265514205.getClass();
        M7102034154292440921 m71020341542924409216 = O9687594455265514205.g;
        m71020341542924409216.getClass();
        return m71020341542924409216;
    }

    public static final Z7022156542152740569 N() {
        Z7022156542152740569 z7022156542152740569 = f317o;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(19.0f, 6.41f);
        v14323974914327418545.h(17.59f, 5.0f);
        v14323974914327418545.h(12.0f, 10.59f);
        v14323974914327418545.h(6.41f, 5.0f);
        v14323974914327418545.h(5.0f, 6.41f);
        v14323974914327418545.h(10.59f, 12.0f);
        v14323974914327418545.h(5.0f, 17.59f);
        v14323974914327418545.h(6.41f, 19.0f);
        v14323974914327418545.h(12.0f, 13.41f);
        v14323974914327418545.h(17.59f, 19.0f);
        v14323974914327418545.h(19.0f, 17.59f);
        G11450220448113054352.p(v14323974914327418545, 13.41f, 12.0f, 19.0f, 6.41f);
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        f317o = b2;
        return b2;
    }

    public static final Z7022156542152740569 O() {
        Z7022156542152740569 z7022156542152740569 = p;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.ContentPaste", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(19.0f, 2.0f);
        v14323974914327418545.g(-4.18f);
        v14323974914327418545.d(14.4f, 0.84f, 13.3f, 0.0f, 12.0f, 0.0f);
        v14323974914327418545.n(9.6f, 0.84f, 9.18f, 2.0f);
        v14323974914327418545.h(5.0f, 2.0f);
        v14323974914327418545.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        v14323974914327418545.s(16.0f);
        v14323974914327418545.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v14323974914327418545.g(14.0f);
        v14323974914327418545.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545.h(21.0f, 4.0f);
        v14323974914327418545.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 2.0f);
        v14323974914327418545.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        v14323974914327418545.o(-0.45f, 1.0f, -1.0f, 1.0f);
        v14323974914327418545.o(-1.0f, -0.45f, -1.0f, -1.0f);
        v14323974914327418545.o(0.45f, -1.0f, 1.0f, -1.0f);
        G11450220448113054352.w(v14323974914327418545, 19.0f, 20.0f, 5.0f, 20.0f);
        v14323974914327418545.h(5.0f, 4.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(3.0f);
        v14323974914327418545.g(10.0f);
        v14323974914327418545.h(17.0f, 4.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(16.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        p = b2;
        return b2;
    }

    public static final W8575158046285589709 P(G8001132634698687269 g8001132634698687269) {
        H7323971265464188398 h7323971265464188398 = g8001132634698687269.get(T13350664027331345869.s);
        W8575158046285589709 w8575158046285589709 = h7323971265464188398 instanceof W8575158046285589709 ? (W8575158046285589709) h7323971265464188398 : null;
        return w8575158046285589709 == null ? I14719250900203285588.a : w8575158046285589709;
    }

    public static final Q15035754882231748864 Q(G8001132634698687269 g8001132634698687269) {
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) g8001132634698687269.get(P2382941533350862833.p);
        if (q15035754882231748864 != null) {
            return q15035754882231748864;
        }
        Q11088980322693754445.i("Current context doesn't contain Job in it: ", g8001132634698687269);
        return null;
    }

    public static final int R(V11538895333762958192 v11538895333762958192, long j2, K1865709164992808030 k1865709164992808030) {
        float f2 = k1865709164992808030 != null ? k1865709164992808030.f() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int e2 = v11538895333762958192.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < v11538895333762958192.f(e2) - f2 || Float.intBitsToFloat(i2) > v11538895333762958192.b(e2) + f2) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-f2) || Float.intBitsToFloat(i3) > v11538895333762958192.d + f2) {
            return -1;
        }
        return e2;
    }

    public static final ClipboardManager S(L3957284589981577691 l3957284589981577691) {
        if (l3957284589981577691 instanceof T2834513763987957608) {
            return ((T2834513763987957608) l3957284589981577691).a.A();
        }
        S10973172697741180971.i(G6547577305291411977.C("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", J17975719213314763068.a(l3957284589981577691.getClass()).b()));
        return null;
    }

    public static final int T(V11538895333762958192 v11538895333762958192, long j2, B1029012102904255937 b1029012102904255937, K1865709164992808030 k1865709164992808030) {
        long z;
        int R;
        if (b1029012102904255937 == null || (R = R(v11538895333762958192, (z = b1029012102904255937.z(j2)), k1865709164992808030)) == -1) {
            return -1;
        }
        return v11538895333762958192.g(L2216691091636065972.a(z, (v11538895333762958192.b(R) + v11538895333762958192.f(R)) / 2.0f, 1));
    }

    public static final long U(Q17957571128037780363 q17957571128037780363, long j2, long j3, B1029012102904255937 b1029012102904255937, K1865709164992808030 k1865709164992808030) {
        if (q17957571128037780363 != null) {
            V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
            if (b1029012102904255937 != null) {
                long z = b1029012102904255937.z(j2);
                long z2 = b1029012102904255937.z(j3);
                int R = R(v11538895333762958192, z, k1865709164992808030);
                int R2 = R(v11538895333762958192, z2, k1865709164992808030);
                if (R != -1) {
                    if (R2 != -1) {
                        R = Math.min(R, R2);
                    }
                    R2 = R;
                } else if (R2 == -1) {
                    return F12478849263529740365.b;
                }
                float b2 = (v11538895333762958192.b(R2) + v11538895333762958192.f(R2)) / 2.0f;
                int i2 = (int) (z >> 32);
                int i3 = (int) (z2 >> 32);
                return v11538895333762958192.h(new S6349823729575121924(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), b2 - 0.1f, Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), b2 + 0.1f), 0, P2382941533350862833.w);
            }
        }
        return F12478849263529740365.b;
    }

    public static final long V(I2076339260272013590 i2076339260272013590, S6349823729575121924 s6349823729575121924, int i2) {
        N17980339148608222959 d2 = i2076339260272013590.d();
        V11538895333762958192 v11538895333762958192 = d2 != null ? d2.a.b : null;
        B1029012102904255937 c2 = i2076339260272013590.c();
        return (v11538895333762958192 == null || c2 == null) ? F12478849263529740365.b : v11538895333762958192.h(s6349823729575121924.k(c2.z(0L)), i2, P2382941533350862833.x);
    }

    public static final long W(I12071840179596922896 i12071840179596922896, S6349823729575121924 s6349823729575121924, int i2) {
        Q17957571128037780363 c2 = i12071840179596922896.c();
        V11538895333762958192 v11538895333762958192 = c2 != null ? c2.b : null;
        B1029012102904255937 e2 = i12071840179596922896.e();
        return (v11538895333762958192 == null || e2 == null) ? F12478849263529740365.b : v11538895333762958192.h(s6349823729575121924.k(e2.z(0L)), i2, P2382941533350862833.x);
    }

    public static final long X(I2076339260272013590 i2076339260272013590, S6349823729575121924 s6349823729575121924, S6349823729575121924 s63498237295751219242, int i2) {
        long V = V(i2076339260272013590, s6349823729575121924, i2);
        if (F12478849263529740365.d(V)) {
            return F12478849263529740365.b;
        }
        long V2 = V(i2076339260272013590, s63498237295751219242, i2);
        if (F12478849263529740365.d(V2)) {
            return F12478849263529740365.b;
        }
        int i3 = (int) (V >> 32);
        int i4 = (int) (V2 & 4294967295L);
        return T1335862270807194835.d(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final long Y(I12071840179596922896 i12071840179596922896, S6349823729575121924 s6349823729575121924, S6349823729575121924 s63498237295751219242, int i2) {
        long W = W(i12071840179596922896, s6349823729575121924, i2);
        if (F12478849263529740365.d(W)) {
            return F12478849263529740365.b;
        }
        long W2 = W(i12071840179596922896, s63498237295751219242, i2);
        if (F12478849263529740365.d(W2)) {
            return F12478849263529740365.b;
        }
        int i3 = (int) (W >> 32);
        int i4 = (int) (W2 & 4294967295L);
        return T1335862270807194835.d(Math.min(i3, i3), Math.max(i4, i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Z(P9179653189917234378 p9179653189917234378) {
        if (!((R15896830329318850690) p9179653189917234378).a.n || p9179653189917234378.f() == null) {
            return;
        }
        Z3383101362411723454.s();
    }

    public static final native void a(I1722681268793429505 i1722681268793429505, X8178024650992698151 x8178024650992698151, boolean z, D6962450040782876658 d6962450040782876658, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static double a0(double[] dArr) {
        double[] O = V12319504402545346730.O(dArr, d);
        double w = w(O[0]);
        double w2 = w(O[1]);
        double w3 = w(O[2]);
        return Math.atan2(((w + w2) - (w3 * 2.0d)) / 9.0d, ((((-12.0d) * w2) + (w * 11.0d)) + w3) / 11.0d);
    }

    public static final native void b(X8178024650992698151 x8178024650992698151, E6758797890281795541 e6758797890281795541, boolean z, D6962450040782876658 d6962450040782876658, M3727281027331139839 m3727281027331139839, int i2);

    public static double b0(double d2) {
        double abs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1);
    }

    public static final native void c(I11492088171899515263 i11492088171899515263, E6758797890281795541 e6758797890281795541, boolean z, boolean z2, I1722681268793429505 i1722681268793429505, T1241271073913685060 t1241271073913685060, X8178024650992698151 x8178024650992698151, M3727281027331139839 m3727281027331139839, int i2);

    public static final U16840712152025914198 c0(Q15035754882231748864 q15035754882231748864, boolean z, Z3069203969753053913 z3069203969753053913) {
        if (q15035754882231748864 instanceof U4020053660465689583) {
            return ((U4020053660465689583) q15035754882231748864).Q(z, z3069203969753053913);
        }
        return q15035754882231748864.g(z3069203969753053913.m(), z, new C9424689592673022017(1, z3069203969753053913, Z3069203969753053913.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long d(float r21, float r22, float r23, float r24, dev.epro.r0.G5298154673482189769 r25) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8045362843799184672.d(float, float, float, float, dev.epro.r0.G5298154673482189769):long");
    }

    public static final boolean d0(G8001132634698687269 g8001132634698687269) {
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) g8001132634698687269.get(P2382941533350862833.p);
        if (q15035754882231748864 != null) {
            return q15035754882231748864.b();
        }
        return true;
    }

    public static final long e(int i2) {
        long j2 = i2 << 32;
        int i3 = U10174709222559481877.i;
        return j2;
    }

    public static final boolean e0(Q17957571128037780363 q17957571128037780363, int i2) {
        V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        int d2 = v11538895333762958192.d(i2);
        return i2 == q17957571128037780363.h(d2) || i2 == v11538895333762958192.c(d2, false) ? q17957571128037780363.i(i2) != q17957571128037780363.a(i2) : q17957571128037780363.a(i2) != q17957571128037780363.a(i2 - 1);
    }

    public static final long f(long j2) {
        long j3 = j2 << 32;
        int i2 = U10174709222559481877.i;
        return j3;
    }

    public static boolean f0(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static long g(int i2, int i3, int i4) {
        return e(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final boolean g0(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final native void h(String str, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final boolean h0(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final native void i(Context context, Configuration configuration, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final boolean i0(int i2) {
        int type;
        return (!h0(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static final native void j(W13113573137839331180 w13113573137839331180, M3727281027331139839 m3727281027331139839, int i2);

    public static final long j0(long j2, long j3, float f2) {
        B8215993360331655904 b8215993360331655904 = E4238948680093459570.x;
        long a2 = U10174709222559481877.a(j2, b8215993360331655904);
        long a3 = U10174709222559481877.a(j3, b8215993360331655904);
        float c2 = U10174709222559481877.c(a2);
        float g2 = U10174709222559481877.g(a2);
        float f3 = U10174709222559481877.f(a2);
        float d2 = U10174709222559481877.d(a2);
        float c3 = U10174709222559481877.c(a3);
        float g3 = U10174709222559481877.g(a3);
        float f4 = U10174709222559481877.f(a3);
        float d3 = U10174709222559481877.d(a3);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return U10174709222559481877.a(p(V933048422416352811.x(g2, g3, f2), V933048422416352811.x(f3, f4, f2), V933048422416352811.x(d2, d3, f2), V933048422416352811.x(c2, c3, f2), b8215993360331655904), U10174709222559481877.e(j3));
    }

    public static R5692663580087387669 k() {
        return new R5692663580087387669(null);
    }

    public static final float k0(long j2) {
        G5298154673482189769 e2 = U10174709222559481877.e(j2);
        if (!R7033599853981556291.v(e2.b, 12884901888L)) {
            U6129583139759812404.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(R7033599853981556291.Y(e2.b)));
        }
        F12101231409752321762 f12101231409752321762 = ((H8745424616867554108) e2).p;
        double g2 = f12101231409752321762.g(U10174709222559481877.g(j2));
        float g3 = (float) ((f12101231409752321762.g(U10174709222559481877.d(j2)) * 0.0722d) + (f12101231409752321762.g(U10174709222559481877.f(j2)) * 0.7152d) + (g2 * 0.2126d));
        if (g3 < 0.0f) {
            g3 = 0.0f;
        }
        if (g3 > 1.0f) {
            return 1.0f;
        }
        return g3;
    }

    public static final native void l(List list, String str, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static int l0(Object obj, Y3341182438442346389 y3341182438442346389, byte[] bArr, int i2, int i3, int i4, D15735805680132151670 d15735805680132151670) {
        O6762602046924520025 o6762602046924520025 = (O6762602046924520025) y3341182438442346389;
        int i5 = d15735805680132151670.d + 1;
        d15735805680132151670.d = i5;
        if (i5 >= 100) {
            throw new N11355818201711573941("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int D = o6762602046924520025.D(obj, bArr, i2, i3, i4, d15735805680132151670);
        d15735805680132151670.d--;
        d15735805680132151670.c = obj;
        return D;
    }

    public static final native void m(Z12230432157744414222 z12230432157744414222, X11638668447546090163 x11638668447546090163, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, L12639328004344855510 l126393280043448555103, B13729205492206812220 b13729205492206812220, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, F4096073349764486348 f40960733497644863486, F4096073349764486348 f40960733497644863487, F4096073349764486348 f40960733497644863488, F4096073349764486348 f40960733497644863489, F4096073349764486348 f409607334976448634810, F4096073349764486348 f409607334976448634811, F4096073349764486348 f409607334976448634812, F4096073349764486348 f409607334976448634813, F4096073349764486348 f409607334976448634814, F4096073349764486348 f409607334976448634815, F4096073349764486348 f409607334976448634816, F4096073349764486348 f409607334976448634817, F4096073349764486348 f409607334976448634818, F4096073349764486348 f409607334976448634819, F4096073349764486348 f409607334976448634820, F4096073349764486348 f409607334976448634821, F4096073349764486348 f409607334976448634822, F4096073349764486348 f409607334976448634823, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, B13729205492206812220 b137292054922068122204, B13729205492206812220 b137292054922068122205, float f2, I1722681268793429505 i1722681268793429505, G13897809556106331572 g13897809556106331572, boolean z, boolean z2, boolean z3, boolean z4, M3727281027331139839 m3727281027331139839, int i2, int i3, int i4, int i5, int i6);

    public static int m0(Object obj, Y3341182438442346389 y3341182438442346389, byte[] bArr, int i2, int i3, D15735805680132151670 d15735805680132151670) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = E(i5, i4, d15735805680132151670, bArr);
            i5 = d15735805680132151670.a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw N11355818201711573941.e();
        }
        int i7 = d15735805680132151670.d + 1;
        d15735805680132151670.d = i7;
        if (i7 >= 100) {
            throw new N11355818201711573941("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = i6 + i5;
        y3341182438442346389.j(obj, bArr, i6, i8, d15735805680132151670);
        d15735805680132151670.d--;
        d15735805680132151670.c = obj;
        return i8;
    }

    public static final native void n(String str, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n0(D10662552791659878041 d10662552791659878041, Z12230432157744414222 z12230432157744414222, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, F4096073349764486348 f40960733497644863486, F4096073349764486348 f40960733497644863487, F4096073349764486348 f40960733497644863488, F4096073349764486348 f40960733497644863489);

    public static final native void o(String str, I1722681268793429505 i1722681268793429505, String str2, L12639328004344855510 l12639328004344855510, boolean z, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final long o0(CharSequence charSequence, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i3);
            if (!h0(codePointBefore)) {
                break;
            }
            i3 -= Character.charCount(codePointBefore);
        }
        while (i2 < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            if (!h0(codePointAt)) {
                break;
            }
            i2 += Character.charCount(codePointAt);
        }
        return T1335862270807194835.d(i3, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long p(float r17, float r18, float r19, float r20, dev.epro.r0.G5298154673482189769 r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8045362843799184672.p(float, float, float, float, dev.epro.r0.G5298154673482189769):long");
    }

    public static final native S10843832955279611263 p0(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final long q(long j2, CharSequence charSequence) {
        int i2 = F12478849263529740365.c;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (4294967295L & j2);
        int codePointBefore = i3 > 0 ? Character.codePointBefore(charSequence, i3) : 10;
        int codePointAt = i4 < charSequence.length() ? Character.codePointAt(charSequence, i4) : 10;
        if (i0(codePointBefore) && (h0(codePointAt) || g0(codePointAt))) {
            do {
                i3 -= Character.charCount(codePointBefore);
                if (i3 == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, i3);
            } while (i0(codePointBefore));
            return T1335862270807194835.d(i3, i4);
        }
        if (!i0(codePointAt)) {
            return j2;
        }
        if (!h0(codePointBefore) && !g0(codePointBefore)) {
            return j2;
        }
        do {
            i4 += Character.charCount(codePointAt);
            if (i4 == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, i4);
        } while (i0(codePointAt));
        return T1335862270807194835.d(i3, i4);
    }

    public static final void q0(R4833348786910499294 r4833348786910499294, Object obj) {
        if (!(r4833348786910499294 instanceof N16152488056535110728)) {
            r4833348786910499294.resumeWith(obj);
            return;
        }
        N16152488056535110728 n16152488056535110728 = (N16152488056535110728) r4833348786910499294;
        D11883231851729262595 d11883231851729262595 = n16152488056535110728.d;
        K14749510448791472029 k14749510448791472029 = n16152488056535110728.e;
        Throwable a2 = I11772848013184437928.a(obj);
        Object t13610764347093379131 = a2 == null ? obj : new T13610764347093379131(a2, false);
        if (d11883231851729262595.B(k14749510448791472029.getContext())) {
            n16152488056535110728.f = t13610764347093379131;
            n16152488056535110728.c = 1;
            d11883231851729262595.z(k14749510448791472029.getContext(), n16152488056535110728);
            return;
        }
        I17129535152515035455 a3 = P13752028179861838617.a();
        if (a3.c >= 4294967296L) {
            n16152488056535110728.f = t13610764347093379131;
            n16152488056535110728.c = 1;
            a3.E(n16152488056535110728);
            return;
        }
        a3.F(true);
        try {
            Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) k14749510448791472029.getContext().get(P2382941533350862833.p);
            if (q15035754882231748864 == null || q15035754882231748864.b()) {
                Object obj2 = n16152488056535110728.g;
                G8001132634698687269 context = k14749510448791472029.getContext();
                Object c0 = S10823041268949770285.c0(context, obj2);
                F14379067091828059340 N = c0 != S10823041268949770285.e ? E12775674050813925581.N(k14749510448791472029, context, c0) : null;
                try {
                    k14749510448791472029.resumeWith(obj);
                } finally {
                    if (N == null || N.i0()) {
                        S10823041268949770285.X(context, c0);
                    }
                }
            } else {
                n16152488056535110728.resumeWith(E17665849472693074628.d(q15035754882231748864.o()));
            }
            while (a3.H()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final List r(Y2677586711477821327 y2677586711477821327, int i2, int i3, ArrayList arrayList, G1892398518770611911 g1892398518770611911, int i4, int i5, int i6, boolean z, F4096073349764486348 f4096073349764486348) {
        int i7;
        G1892398518770611911 g18923985187706119112;
        int i8;
        long j2;
        int i9;
        Object obj;
        int i10;
        if (y2677586711477821327 == null || arrayList.isEmpty() || (i7 = g1892398518770611911.b) == 0) {
            return O2161699089510411363.a;
        }
        int i11 = -1;
        int i12 = 0;
        if (i3 - i2 < 0 || i7 == 0) {
            g18923985187706119112 = R1911624190916196378.a;
        } else {
            P8646985343900033725 N = W7808703833045379622.N(0, i7);
            int i13 = N.a;
            int i14 = N.b;
            int i15 = -1;
            if (i13 <= i14) {
                while (g1892398518770611911.c(i13) <= i2) {
                    i15 = g1892398518770611911.c(i13);
                    if (i13 == i14) {
                        break;
                    }
                    i13++;
                }
            }
            if (i15 == -1) {
                g18923985187706119112 = R1911624190916196378.a;
            } else {
                G1892398518770611911 g18923985187706119113 = R1911624190916196378.a;
                g18923985187706119112 = new G1892398518770611911(1);
                g18923985187706119112.a(i15);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj2 = arrayList.get(i16);
            int index = ((I6148490667470006645) obj2).getIndex();
            int[] iArr = g1892398518770611911.a;
            int i17 = g1892398518770611911.b;
            int i18 = i12;
            while (true) {
                if (i18 >= i17) {
                    break;
                }
                if (iArr[i18] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i18++;
            }
            i16++;
            i12 = 0;
        }
        int[] iArr2 = g18923985187706119112.a;
        int i19 = g18923985187706119112.b;
        int i20 = 0;
        while (i20 < i19) {
            int i21 = iArr2[i20];
            int size2 = arrayList.size();
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i23 >= size2) {
                    i22 = i11;
                    break;
                }
                Object obj3 = arrayList.get(i23);
                i23++;
                if (((I6148490667470006645) obj3).getIndex() == i21) {
                    break;
                }
                i22++;
            }
            I6148490667470006645 i6148490667470006645 = i22 == i11 ? (I6148490667470006645) f4096073349764486348.invoke(Integer.valueOf(i21)) : (I6148490667470006645) arrayList.remove(i22);
            int C = E686369837194379706.C(i6148490667470006645, z);
            if (i22 == i11) {
                i8 = i20;
                i9 = Integer.MIN_VALUE;
            } else {
                long c2 = i6148490667470006645.c(0);
                if (z) {
                    i8 = i20;
                    j2 = c2 & 4294967295L;
                } else {
                    i8 = i20;
                    j2 = c2 >> 32;
                }
                i9 = (int) j2;
            }
            int size3 = arrayList3.size();
            int i24 = 0;
            while (true) {
                if (i24 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i24);
                if (((I6148490667470006645) obj).getIndex() != i21) {
                    break;
                }
                i24++;
            }
            I6148490667470006645 i61484906674700066452 = (I6148490667470006645) obj;
            if (i61484906674700066452 != null) {
                long c3 = i61484906674700066452.c(0);
                i10 = (int) (z ? c3 & 4294967295L : c3 >> 32);
            } else {
                i10 = Integer.MIN_VALUE;
            }
            int max = i9 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i9);
            if (i10 != Integer.MIN_VALUE) {
                max = Math.min(max, i10 - C);
            }
            i6148490667470006645.h();
            i6148490667470006645.a(max, 0, i5, i6);
            arrayList2.add(i6148490667470006645);
            i20 = i8 + 1;
            i11 = -1;
        }
        return arrayList2;
    }

    public static final Object r0(G8001132634698687269 g8001132634698687269, L12639328004344855510 l12639328004344855510) {
        I17129535152515035455 i17129535152515035455;
        G8001132634698687269 x;
        Thread currentThread = Thread.currentThread();
        R12081023847482212386 r12081023847482212386 = T13350664027331345869.s;
        D11883231851729262595 d11883231851729262595 = (D11883231851729262595) g8001132634698687269.get(r12081023847482212386);
        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
        if (d11883231851729262595 == null) {
            i17129535152515035455 = P13752028179861838617.a();
            x = E12775674050813925581.x(i3826119971291161142, g8001132634698687269.plus(i17129535152515035455), true);
            Y10288379321248498973 y10288379321248498973 = M979257876727257621.a;
            if (x != y10288379321248498973 && x.get(r12081023847482212386) == null) {
                x = x.plus(y10288379321248498973);
            }
        } else {
            i17129535152515035455 = (I17129535152515035455) P13752028179861838617.a.get();
            x = E12775674050813925581.x(i3826119971291161142, g8001132634698687269, true);
            Y10288379321248498973 y102883793212484989732 = M979257876727257621.a;
            if (x != y102883793212484989732 && x.get(r12081023847482212386) == null) {
                x = x.plus(y102883793212484989732);
            }
        }
        Q13317146054867800517 q13317146054867800517 = new Q13317146054867800517(x, currentThread, i17129535152515035455);
        q13317146054867800517.h0(L856869997670741194.a, q13317146054867800517, l12639328004344855510);
        I17129535152515035455 i171295351525150354552 = q13317146054867800517.e;
        if (i171295351525150354552 != null) {
            int i2 = I17129535152515035455.f;
            i171295351525150354552.F(false);
        }
        while (!Thread.interrupted()) {
            try {
                long G = i171295351525150354552 != null ? i171295351525150354552.G() : Long.MAX_VALUE;
                if (q13317146054867800517.p()) {
                    if (i171295351525150354552 != null) {
                        int i3 = I17129535152515035455.f;
                        i171295351525150354552.D(false);
                    }
                    Object X = O4077903568229246.X(q13317146054867800517.M());
                    T13610764347093379131 t13610764347093379131 = X instanceof T13610764347093379131 ? (T13610764347093379131) X : null;
                    if (t13610764347093379131 == null) {
                        return X;
                    }
                    throw t13610764347093379131.a;
                }
                LockSupport.parkNanos(q13317146054867800517, G);
            } catch (Throwable th) {
                if (i171295351525150354552 != null) {
                    int i4 = I17129535152515035455.f;
                    i171295351525150354552.D(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        q13317146054867800517.z(interruptedException);
        throw interruptedException;
    }

    public static boolean s(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static Object s0(L12639328004344855510 l12639328004344855510) {
        return r0(I3826119971291161142.a, l12639328004344855510);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(dev.epro.r0.K14749510448791472029 r4) {
        /*
            boolean r0 = r4 instanceof dev.epro.r0.U16788035591652079670
            if (r0 == 0) goto L13
            r0 = r4
            dev.epro.r0.U16788035591652079670 r0 = (dev.epro.r0.U16788035591652079670) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            dev.epro.r0.U16788035591652079670 r0 = new dev.epro.r0.U16788035591652079670
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.t
            int r1 = r0.u
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return
        L27:
            dev.epro.r0.E17665849472693074628.k(r4)
            goto L45
        L2b:
            dev.epro.r0.E17665849472693074628.k(r4)
            r0.u = r2
            dev.epro.r0.H7219028874700587498 r4 = new dev.epro.r0.H7219028874700587498
            dev.epro.r0.R4833348786910499294 r0 = dev.epro.r0.E18444280280170001567.H(r0)
            r4.<init>(r2, r0)
            r4.t()
            java.lang.Object r4 = r4.r()
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r0) goto L45
            return
        L45:
            dev.epro.r0.Z3383101362411723454.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J8045362843799184672.t(dev.epro.r0.K14749510448791472029):void");
    }

    public static final I1722681268793429505 t0(I1722681268793429505 i1722681268793429505, String str) {
        return i1722681268793429505.Q0(new Z5541739500785716855(str));
    }

    public static final S7905146366802497968 u(L12639328004344855510 l12639328004344855510) {
        return new S7905146366802497968(l12639328004344855510, I3826119971291161142.a, -2, T1542296375665870064.a);
    }

    public static final int u0(long j2) {
        float[] fArr = E4238948680093459570.a;
        return (int) (U10174709222559481877.a(j2, E4238948680093459570.e) >>> 32);
    }

    public static final void v(G8001132634698687269 g8001132634698687269, CancellationException cancellationException) {
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) g8001132634698687269.get(P2382941533350862833.p);
        if (q15035754882231748864 != null) {
            q15035754882231748864.c(cancellationException);
        }
    }

    public static final long v0(long j2) {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        boolean z = j2 > 0;
        if (z) {
            return E17093345031926825464.e(E17093345031926825464.h(j2, M9216324016624295870.a0(999999L, N13798149404328803870.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        Z3383101362411723454.g();
        return 0L;
    }

    public static double w(double d2) {
        double pow = Math.pow(Math.abs(d2), 0.42d);
        return (((d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static final long w0(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static final long x(long j2, long j3) {
        float f2;
        float f3;
        long a2 = U10174709222559481877.a(j2, U10174709222559481877.e(j3));
        float c2 = U10174709222559481877.c(j3);
        float c3 = U10174709222559481877.c(a2);
        float f4 = 1.0f - c3;
        float f5 = (c2 * f4) + c3;
        float g2 = U10174709222559481877.g(a2);
        float g3 = U10174709222559481877.g(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((g3 * c2) * f4) + (g2 * c3)) / f5;
        }
        float f7 = U10174709222559481877.f(a2);
        float f8 = U10174709222559481877.f(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((f8 * c2) * f4) + (f7 * c3)) / f5;
        }
        float d2 = U10174709222559481877.d(a2);
        float d3 = U10174709222559481877.d(j3);
        if (f5 != 0.0f) {
            f6 = (((d3 * c2) * f4) + (d2 * c3)) / f5;
        }
        return p(f2, f3, f6, f5, U10174709222559481877.e(j3));
    }

    public static D14731132657808549702 x0(D14731132657808549702 d14731132657808549702) {
        if (d14731132657808549702 == D14731132657808549702.z0) {
            return D14731132657808549702.k0;
        }
        if (d14731132657808549702 == D14731132657808549702.A0) {
            return D14731132657808549702.n0;
        }
        if (d14731132657808549702 == D14731132657808549702.B0) {
            return D14731132657808549702.m0;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static L15260231637027815334 y(O1900704066613195549 o1900704066613195549) {
        M9197813449740923653 m9197813449740923653 = o1900704066613195549.k;
        byte[] b2 = ((J4250663911053539605) m9197813449740923653.b).b();
        U193383160337433046 u193383160337433046 = new U193383160337433046();
        M3250598633778217966.a(b2.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(b2, "AES");
        if (!G6547577305291411977.c(1)) {
            W4415201450379021245.c("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) U193383160337433046.a.get();
        cipher.init(1, secretKeySpec);
        E686369837194379706.q(E686369837194379706.q(cipher.doFinal(new byte[16])));
        try {
            Provider U = C775827382551829194.U();
            if (U == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", U);
            return new M10846389789027735899(u193383160337433046, new T15504973625601650233(((J4250663911053539605) m9197813449740923653.b).b(), U));
        } catch (GeneralSecurityException unused) {
            return u193383160337433046;
        }
    }

    public static D14731132657808549702 y0(D14731132657808549702 d14731132657808549702) {
        D14731132657808549702 d147311326578085497022 = D14731132657808549702.A0;
        if (d14731132657808549702 == D14731132657808549702.k0) {
            return D14731132657808549702.z0;
        }
        if (d14731132657808549702 == D14731132657808549702.n0 || d14731132657808549702 == D14731132657808549702.l0) {
            return d147311326578085497022;
        }
        if (d14731132657808549702 == D14731132657808549702.m0) {
            return D14731132657808549702.B0;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d14731132657808549702)));
    }

    public static int z(byte[] bArr, int i2, D15735805680132151670 d15735805680132151670) {
        int F = F(bArr, i2, d15735805680132151670);
        int i3 = d15735805680132151670.a;
        if (i3 < 0) {
            throw N11355818201711573941.c();
        }
        if (i3 > bArr.length - F) {
            throw N11355818201711573941.e();
        }
        if (i3 == 0) {
            d15735805680132151670.c = N17666688112968464504.b;
            return F;
        }
        d15735805680132151670.c = N17666688112968464504.i(F, bArr, i3);
        return F + i3;
    }

    public static double z0(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public abstract S6349823729575121924 M();

    static {
        izmyclvb.dpqpjfpoanwt1(447);
        byte b2 = 25;
        a = new D14731132657808549702("RESUME_TOKEN", b2);
        b = new D14731132657808549702("UNDEFINED", b2);
        c = new D14731132657808549702("REUSABLE_CLAIMED", b2);
        d = new double[][]{new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
        e = new double[][]{new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
        f = new double[]{0.2126d, 0.7152d, 0.0722d};
        g = new double[]{0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
        h = new M10846389789027735899((byte) 17);
        byte b3 = 8;
        i = new O14561027293699174040(new H475444086652660118(b3));
        j = new B6440366792515411106(H358978911853820691.class, new Z3383101362411723454(b3));
        k = new L12293142626931145046("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new Z3383101362411723454((byte) 9));
        l = new X18244299380549586254(X17251871386643959137.class, new Z3383101362411723454((byte) 10));
        m = new X17873598080297061904("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new Z3383101362411723454((byte) 11));
        n = new H2442898661687873181((byte) 6);
    }
}
