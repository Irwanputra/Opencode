package dev.epro.r0;

import ads_mobile_sdk.nl0;
import ads_mobile_sdk.yu;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class M9216324016624295870 {
    public static final byte[][] a;
    public static final Y13361005827119333637 b;
    public static final L2311487989567145532 c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final V10300877997588547986 k;
    public static final V10300877997588547986 l;
    public static final V10300877997588547986 m;
    public static final V10300877997588547986 n;

    /* renamed from: o, reason: collision with root package name */
    public static final V10300877997588547986 f376o;
    public static final Z14997871575210439922 p;
    public static Z7022156542152740569 q;
    public static Z7022156542152740569 r;
    public static Z7022156542152740569 s;

    public static final long A(long j2) {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        long j3 = j2 << 1;
        int i2 = Z4849893357590011812.a;
        return j3;
    }

    public static final boolean B(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[EDGE_INSN: B:47:0x008b->B:31:0x008b BREAK  A[LOOP:0: B:9:0x0011->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List C(dev.epro.r0.S11323950170556863336 r9, int r10, int r11) {
        /*
            if (r10 != r11) goto L5
            dev.epro.r0.O2161699089510411363 r9 = dev.epro.r0.O2161699089510411363.a
            return r9
        L5:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L11:
            if (r2 == 0) goto L16
            if (r10 >= r11) goto L8c
            goto L18
        L16:
            if (r10 <= r11) goto L8c
        L18:
            java.util.LinkedHashMap r4 = r9.a
            r5 = 0
            if (r2 == 0) goto L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L2b
        L29:
            r7 = r5
            goto L4b
        L2b:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            dev.epro.r0.H9390398899829886498 r7 = new dev.epro.r0.H9390398899829886498
            r7.<init>(r4, r6)
            goto L4b
        L35:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L42
            goto L29
        L42:
            java.util.Set r6 = r4.keySet()
            dev.epro.r0.H9390398899829886498 r7 = new dev.epro.r0.H9390398899829886498
            r7.<init>(r4, r6)
        L4b:
            if (r7 != 0) goto L4e
            goto L8b
        L4e:
            java.lang.Object r4 = r7.a
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L88
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L73
            int r8 = r10 + 1
            if (r8 > r7) goto L5a
            if (r7 > r11) goto L5a
            goto L77
        L73:
            if (r11 > r7) goto L5a
            if (r7 >= r10) goto L5a
        L77:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r10.getClass()
            r3.add(r10)
            r4 = r1
            r10 = r7
            goto L89
        L88:
            r4 = r0
        L89:
            if (r4 != 0) goto L11
        L8b:
            return r5
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M9216324016624295870.C(dev.epro.r0.S11323950170556863336, int, int):java.util.List");
    }

    public static final native Object D(String str, M7561717362698189968 m7561717362698189968, K14749510448791472029 k14749510448791472029);

    public static Q14551120597197339997 E(char c2) {
        int type = Character.getType(c2);
        Q14551120597197339997.a.getClass();
        M665231115116566295 m665231115116566295 = Q14551120597197339997.d;
        if (type >= 0 && type < 17) {
            return (Q14551120597197339997) m665231115116566295.get(type);
        }
        if (18 <= type && type < 31) {
            return (Q14551120597197339997) m665231115116566295.get(type - 1);
        }
        S10973172697741180971.j(G6547577305291411977.o(type, "Category #", " is not defined."));
        return null;
    }

    public static Object F(Future future) {
        Object obj;
        if (!future.isDone()) {
            S10973172697741180971.m(E17665849472693074628.f("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Drawable G(Context context, int i2) {
        return B5275173104802412095.c().d(context, i2);
    }

    public static final Z7022156542152740569 H() {
        Z7022156542152740569 z7022156542152740569 = r;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.FileOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(15.0f, 22.0f);
        v14323974914327418545.f(6.0f);
        v14323974914327418545.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        v14323974914327418545.r(4.0f);
        v14323974914327418545.e(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        v14323974914327418545.g(8.0f);
        v14323974914327418545.i(6.0f, 6.0f);
        v14323974914327418545.s(6.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.r(9.0f);
        v14323974914327418545.g(-5.0f);
        v14323974914327418545.r(4.0f);
        v14323974914327418545.f(6.0f);
        v14323974914327418545.s(16.0f);
        v14323974914327418545.g(9.0f);
        v14323974914327418545.r(22.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(19.0f, 21.66f);
        v14323974914327418545.i(0.0f, -2.24f);
        v14323974914327418545.i(2.95f, 2.95f);
        v14323974914327418545.i(1.41f, -1.41f);
        v14323974914327418545.h(20.41f, 18.0f);
        v14323974914327418545.g(2.24f);
        v14323974914327418545.s(-2.0f);
        v14323974914327418545.f(17.0f);
        v14323974914327418545.s(5.66f);
        v14323974914327418545.f(19.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        r = b2;
        return b2;
    }

    public static final Z7022156542152740569 I() {
        Z7022156542152740569 z7022156542152740569 = s;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Rounded.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(18.0f, 8.0f);
        v14323974914327418545.g(-1.0f);
        v14323974914327418545.h(17.0f, 6.0f);
        v14323974914327418545.e(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        v14323974914327418545.n(7.0f, 3.24f, 7.0f, 6.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.h(6.0f, 8.0f);
        v14323974914327418545.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        v14323974914327418545.s(10.0f);
        v14323974914327418545.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v14323974914327418545.g(12.0f);
        v14323974914327418545.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545.h(20.0f, 10.0f);
        v14323974914327418545.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 17.0f);
        v14323974914327418545.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        v14323974914327418545.o(0.9f, -2.0f, 2.0f, -2.0f);
        v14323974914327418545.o(2.0f, 0.9f, 2.0f, 2.0f);
        v14323974914327418545.o(-0.9f, 2.0f, -2.0f, 2.0f);
        G11450220448113054352.w(v14323974914327418545, 9.0f, 8.0f, 9.0f, 6.0f);
        v14323974914327418545.e(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        v14323974914327418545.o(3.0f, 1.34f, 3.0f, 3.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.h(9.0f, 8.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        s = b2;
        return b2;
    }

    public static B6805403844224311194 J(Object obj) {
        return obj == null ? B6805403844224311194.b : new B6805403844224311194(obj);
    }

    public static boolean K(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static K7493131619793429513 L(G14718160286012243331 g14718160286012243331, B13729205492206812220 b13729205492206812220) {
        N5158094851646208854 n5158094851646208854 = N5158094851646208854.q;
        int ordinal = g14718160286012243331.ordinal();
        if (ordinal == 0) {
            return new O12494175665883759871(b13729205492206812220);
        }
        if (ordinal == 1) {
            S17075056514715236939 s17075056514715236939 = new S17075056514715236939();
            s17075056514715236939.a = b13729205492206812220;
            s17075056514715236939.b = n5158094851646208854;
            return s17075056514715236939;
        }
        if (ordinal != 2) {
            Z3383101362411723454.g();
            return null;
        }
        R13288784299695828459 r13288784299695828459 = new R13288784299695828459();
        r13288784299695828459.a = b13729205492206812220;
        r13288784299695828459.b = n5158094851646208854;
        return r13288784299695828459;
    }

    public static O12494175665883759871 M(B13729205492206812220 b13729205492206812220) {
        b13729205492206812220.getClass();
        return new O12494175665883759871(b13729205492206812220);
    }

    public static final I1722681268793429505 N(E13074456978433253839 e13074456978433253839, V12816289154094534935 v12816289154094534935, R7000310675073492254 r7000310675073492254) {
        return new B17039118134107761505(e13074456978433253839, v12816289154094534935, r7000310675073492254);
    }

    public static D16915945238461757356 O(T7468265282056741718 t7468265282056741718) {
        if (t7468265282056741718.isDone()) {
            return t7468265282056741718;
        }
        U1364666597047141696 u1364666597047141696 = new U1364666597047141696();
        u1364666597047141696.h = t7468265282056741718;
        t7468265282056741718.a(u1364666597047141696, Z886113521968091188.a);
        return u1364666597047141696;
    }

    public static I1722681268793429505 P(I1722681268793429505 i1722681268793429505, P10283164515565247229 p10283164515565247229) {
        return i1722681268793429505.Q0(new G17151291860948256618(p10283164515565247229));
    }

    public static final native X9711739285227992634 Q(int i2, boolean z);

    public static final native D2231299582723413889 R(M3727281027331139839 m3727281027331139839);

    public static final native void S(String str, JSONObject jSONObject);

    public static final native void T(String str, Set set, JSONObject jSONObject);

    public static final native void U(String str, JSONObject jSONObject);

    public static final native void V(String str, JSONObject jSONObject);

    public static final native void W(L17748092722616038835 l17748092722616038835, Integer num);

    public static H8027516537527559298 X(Callable callable, Executor executor) {
        H8027516537527559298 h8027516537527559298 = new H8027516537527559298(callable);
        executor.execute(h8027516537527559298);
        return h8027516537527559298;
    }

    public static void Y(long[] jArr, long[] jArr2, int i2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = (((int) jArr2[i4]) ^ ((int) jArr[i4])) & i3;
            jArr[i4] = r1 ^ i5;
            jArr2[i4] = ((int) jArr2[i4]) ^ i5;
        }
    }

    public static final long Z(int i2, N13798149404328803870 n13798149404328803870) {
        if (n13798149404328803870.compareTo(N13798149404328803870.SECONDS) > 0) {
            return a0(i2, n13798149404328803870);
        }
        return A(TimeUnit.NANOSECONDS.convert(i2, n13798149404328803870.a));
    }

    public static final native void a(X11638668447546090163 x11638668447546090163, String str, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122203, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a0(long r8, dev.epro.r0.N13798149404328803870 r10) {
        /*
            java.util.concurrent.TimeUnit r0 = r10.a
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r0.convert(r1, r3)
            long r4 = -r1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L1f
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L1f
            long r8 = r3.convert(r8, r0)
            long r8 = A(r8)
            return r8
        L1f:
            dev.epro.r0.N13798149404328803870 r1 = dev.epro.r0.N13798149404328803870.MILLISECONDS
            int r1 = r10.compareTo(r1)
            if (r1 < 0) goto La6
            int r0 = java.lang.Long.signum(r8)
            long r0 = (long) r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L36
            r8 = r2
        L36:
            long r8 = java.lang.Math.abs(r8)
            int r2 = r10.ordinal()
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == r3) goto L66
            r3 = 3
            if (r2 == r3) goto L63
            r3 = 4
            if (r2 == r3) goto L5f
            r3 = 5
            if (r2 == r3) goto L5b
            r3 = 6
            if (r2 != r3) goto L55
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L67
        L55:
            java.lang.String r8 = "Wrong unit for millisMultiplier: "
            dev.epro.r0.Q11088980322693754445.i(r8, r10)
            return r4
        L5b:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L67
        L5f:
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L67
        L63:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L67
        L66:
            r2 = r6
        L67:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L6d
        L6b:
            r8 = r4
            goto La0
        L6d:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r10 != 0) goto L7d
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L7b
            goto L9f
        L7b:
            r8 = r2
            goto La0
        L7d:
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L86
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La0
            goto L9f
        L86:
            int r10 = java.lang.Long.numberOfLeadingZeros(r8)
            int r10 = 128 - r10
            int r6 = java.lang.Long.numberOfLeadingZeros(r2)
            int r10 = r10 - r6
            r6 = 63
            if (r10 >= r6) goto L97
            long r8 = r8 * r2
            goto La0
        L97:
            if (r10 <= r6) goto L9a
            goto L9f
        L9a:
            long r8 = r8 * r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La0
        L9f:
            goto L6b
        La0:
            long r0 = r0 * r8
            long r8 = y(r0)
            return r8
        La6:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r10.convert(r8, r0)
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r8 = dev.epro.r0.W7808703833045379622.s(r1, r3, r5)
            long r8 = y(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M9216324016624295870.a0(long, dev.epro.r0.N13798149404328803870):long");
    }

    public static final native void b(int i2, M3727281027331139839 m3727281027331139839);

    public static final native ArrayList b0(int i2, String str);

    public static final native void c(X11638668447546090163 x11638668447546090163, K2746982608131049817 k2746982608131049817, String str, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, Set set, I1722681268793429505 i1722681268793429505, X16042184966849612101 x16042184966849612101, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void c0(StringBuilder sb, ArrayList arrayList);

    public static final native void d(int i2, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, String str, boolean z);

    public static final int d0(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final native void e(F16371047080953224077 f16371047080953224077, long j2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, F4096073349764486348 f40960733497644863486, F4096073349764486348 f40960733497644863487, F4096073349764486348 f40960733497644863488, F4096073349764486348 f40960733497644863489, F4096073349764486348 f409607334976448634810, F4096073349764486348 f409607334976448634811, F4096073349764486348 f409607334976448634812, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void f(Long l2, boolean z, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(F16371047080953224077 f16371047080953224077, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(String str, String str2, boolean z, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(V9622388302629328265 v9622388302629328265, G2190230421268324049 g2190230421268324049, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void j(N13504813974193578250 n13504813974193578250, X11638668447546090163 x11638668447546090163, L12639328004344855510 l12639328004344855510, J12078565427869724451 j12078565427869724451, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void k(N13504813974193578250 n13504813974193578250, G2190230421268324049 g2190230421268324049, L17748092722616038835 l17748092722616038835, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(T12100831175298321930 t12100831175298321930, X11638668447546090163 x11638668447546090163, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, J12078565427869724451 j12078565427869724451, F4096073349764486348 f40960733497644863482, B13729205492206812220 b13729205492206812220, boolean z, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static nl0 m() {
        ClassLoader classLoader = M9216324016624295870.class.getClassLoader();
        if (nl0.class.equals(nl0.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new M9216324016624295870[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError unused2) {
                    Logger logger = Logger.getLogger(yu.class.getName());
                    Level level = Level.SEVERE;
                    logger.getClass();
                }
            }
            if (arrayList.size() == 1) {
                return (nl0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (nl0) nl0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final long n(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : W7808703833045379622.s(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if (-4611686018427387903L < j3 && j3 < 4611686018427387903L) {
            return j2;
        }
        if ((j3 ^ j2) >= 0) {
            return j2;
        }
        return 9223372036854759646L;
    }

    public static I1722681268793429505 o(I1722681268793429505 i1722681268793429505, I10693660321785877375 i10693660321785877375) {
        return i1722681268793429505.Q0(new P12166749412347431843(0L, i10693660321785877375, R7033599853981556291.n, 1));
    }

    public static final I1722681268793429505 p(I1722681268793429505 i1722681268793429505, long j2, I5573661370475160895 i5573661370475160895) {
        return i1722681268793429505.Q0(new P12166749412347431843(j2, null, i5573661370475160895, 2));
    }

    public static void q(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder q2 = E12098517352909843120.q(i2, "radix ", " was not in valid range ");
            q2.append(new P8646985343900033725(2, 36, 1));
            throw new IllegalArgumentException(q2.toString());
        }
    }

    public static void r(long[] jArr, long[] jArr2, int i2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = (int) jArr[i4];
            jArr[i4] = i5 ^ ((((int) jArr2[i4]) ^ i5) & i3);
        }
    }

    public static int s(char c2) {
        Integer u = u(c2);
        if (u != null) {
            return u.intValue();
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a digit in the given radix=16");
    }

    public static int t(char c2) {
        int digit = Character.digit((int) c2, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    public static Integer u(char c2) {
        q(16);
        int digit = Character.digit((int) c2, 16);
        Integer valueOf = Integer.valueOf(digit);
        if (digit >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final J12043550928838212009 v(J12043550928838212009 j12043550928838212009) {
        return j12043550928838212009 instanceof T10320069907180517450 ? j12043550928838212009 : w(j12043550928838212009, b, c);
    }

    public static final Q6833257009992720398 w(J12043550928838212009 j12043550928838212009, F4096073349764486348 f4096073349764486348, L12639328004344855510 l12639328004344855510) {
        if (j12043550928838212009 instanceof Q6833257009992720398) {
            Q6833257009992720398 q6833257009992720398 = (Q6833257009992720398) j12043550928838212009;
            if (q6833257009992720398.b == f4096073349764486348 && q6833257009992720398.c == l12639328004344855510) {
                return q6833257009992720398;
            }
        }
        return new Q6833257009992720398(j12043550928838212009, f4096073349764486348, l12639328004344855510);
    }

    public static final void x(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        G9506192477171422664 F = K5751602218013079365.F();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (prepare.step()) {
            try {
                F.add(prepare.getText(0));
            } finally {
            }
        }
        T18016951143603335921.y(prepare, null);
        ListIterator listIterator = K5751602218013079365.v(F).listIterator(0);
        while (true) {
            E12552353581788229419 e12552353581788229419 = (E12552353581788229419) listIterator;
            if (!e12552353581788229419.hasNext()) {
                return;
            }
            String str = (String) e12552353581788229419.next();
            if (Z13168519540281190457.F(str, "room_fts_content_sync_", false)) {
                P13747563277035175218.f(sQLiteConnection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final long y(long j2) {
        long j3 = (j2 << 1) + 1;
        E17093345031926825464.b.getClass();
        int i2 = Z4849893357590011812.a;
        return j3;
    }

    public static final long z(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? y(W7808703833045379622.s(j2, -4611686018427387903L, 4611686018427387903L)) : A(j2 * 1000000);
    }

    static {
        izmyclvb.dpqpjfpoanwt1(1791);
        a = new byte[][]{new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};
        b = new Y13361005827119333637((byte) 7);
        c = new L2311487989567145532((byte) 4);
        d = new byte[]{48, 49, 53, 0};
        e = new byte[]{48, 49, 48, 0};
        f = new byte[]{48, 48, 57, 0};
        g = new byte[]{48, 48, 53, 0};
        h = new byte[]{48, 48, 49, 0};
        i = new byte[]{48, 48, 49, 0};
        j = new byte[]{48, 48, 50, 0};
        byte b2 = 20;
        k = new V10300877997588547986(new W15213244012953673763((byte) 18), new A1775503136567729878((byte) 20), b2);
        l = new V10300877997588547986(new W15213244012953673763((byte) 19), new A1775503136567729878((byte) 21), b2);
        m = new V10300877997588547986(new W15213244012953673763(b2), new A1775503136567729878((byte) 22), b2);
        n = new V10300877997588547986(new W15213244012953673763((byte) 21), new A1775503136567729878((byte) 23), b2);
        f376o = new V10300877997588547986(new W15213244012953673763((byte) 22), new A1775503136567729878((byte) 24), b2);
        p = new Z14997871575210439922((byte) 27);
    }
}
