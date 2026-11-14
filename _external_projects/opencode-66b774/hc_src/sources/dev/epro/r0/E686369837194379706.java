package dev.epro.r0;

import android.os.Build;
import android.view.View;
import android.widget.EdgeEffect;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public abstract class E686369837194379706 implements T16404477825665144123 {
    public static Boolean a;
    public static final int[] b;
    public static final M5459415309190684092 c;
    public static final C4150953935654002107 d;
    public static final O12545633033254628644 e;
    public static final H2442898661687873181 f;
    public static Z7022156542152740569 g;
    public static Z7022156542152740569 h;
    public static Z7022156542152740569 i;

    public static final J8657988952378915026 A(J14024120050125738337 j14024120050125738337) {
        J8657988952378915026 j8657988952378915026;
        j14024120050125738337.getClass();
        synchronized (e) {
            j8657988952378915026 = (J8657988952378915026) j14024120050125738337.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (j8657988952378915026 == null) {
                G8001132634698687269 g8001132634698687269 = I3826119971291161142.a;
                try {
                    Y10288379321248498973 y10288379321248498973 = M979257876727257621.a;
                    g8001132634698687269 = S14277978768267526585.a.f;
                } catch (X12144930698824946031 | IllegalStateException unused) {
                }
                J8657988952378915026 j86579889523789150262 = new J8657988952378915026(g8001132634698687269.plus(V3311072669930093336.b()));
                j14024120050125738337.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", j86579889523789150262);
                j8657988952378915026 = j86579889523789150262;
            }
        }
        return j8657988952378915026;
    }

    public static final native boolean B(int i2);

    public static final int C(I6148490667470006645 i6148490667470006645, boolean z) {
        int g2;
        int b2;
        if (z) {
            g2 = i6148490667470006645.f();
            b2 = i6148490667470006645.k();
        } else {
            g2 = i6148490667470006645.g();
            b2 = i6148490667470006645.b();
        }
        return b2 + g2;
    }

    public static float E(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U15728912973537139392.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final long F(int i2, int i3, boolean z, boolean z2) {
        long j = i2;
        long j2 = i3 & 2147483647L;
        long j3 = z ? (j << 32) | Long.MIN_VALUE : (j << 32) & Long.MAX_VALUE;
        if (z2) {
            j2 |= 2147483648L;
        }
        return j2 | j3;
    }

    public static final native Y8596934373970376627 G(String str, Integer num);

    public static final void H(K15438463641018513946 k15438463641018513946, E9133045636215945243 e9133045636215945243, int i2) {
        while (true) {
            int i3 = k15438463641018513946.v;
            if (i2 > i3 && i2 < k15438463641018513946.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            k15438463641018513946.N();
            if (k15438463641018513946.x(k15438463641018513946.v)) {
                e9133045636215945243.t();
            }
            k15438463641018513946.i();
        }
    }

    public static final native Object I(S1985039337943195993 s1985039337943195993, D11782600161698864210 d11782600161698864210, K14749510448791472029 k14749510448791472029);

    public static final I1722681268793429505 K(I1722681268793429505 i1722681268793429505, G4373553504164397325 g4373553504164397325, R7000310675073492254 r7000310675073492254, N11829648573770870927 n11829648573770870927, boolean z, J3971902247911265635 j3971902247911265635, S9385204271696540760 s9385204271696540760, D9497773141868343380 d9497773141868343380) {
        R7000310675073492254 r70003106750734922542 = R7000310675073492254.a;
        V10993962107938880611 v10993962107938880611 = V10993962107938880611.a;
        return i1722681268793429505.Q0(r7000310675073492254 == r70003106750734922542 ? R7033599853981556291.p(v10993962107938880611, V4328928460681270358.c) : R7033599853981556291.p(v10993962107938880611, V4328928460681270358.b)).Q0(new J16220234084695226806(n11829648573770870927, d9497773141868343380, j3971902247911265635, s9385204271696540760, r7000310675073492254, g4373553504164397325, z, false));
    }

    public static final I1722681268793429505 L(I1722681268793429505 i1722681268793429505, boolean z, boolean z2, B13729205492206812220 b13729205492206812220) {
        if (!z || !Q10010849197924825711.a) {
            return i1722681268793429505;
        }
        if (z2) {
            i1722681268793429505 = i1722681268793429505.Q0(new L16480527051869154244(d));
        }
        return i1722681268793429505.Q0(new Y11867975705037678918(b13729205492206812220));
    }

    public static final native Object M(F16371047080953224077 f16371047080953224077, long j, V17496691562287779941 v17496691562287779941, G11629126727305865218 g11629126727305865218, K14749510448791472029 k14749510448791472029);

    public static final boolean N(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    public static final boolean O(long j) {
        return (j & 2147483648L) != 0;
    }

    public static final int P(long j) {
        return (int) ((j & 9223372032559808512L) >>> 32);
    }

    public static final List Q(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return O2161699089510411363.a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            I6148490667470006645 i6148490667470006645 = (I6148490667470006645) arrayList.get(i4);
            int index = i6148490667470006645.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(i6148490667470006645);
            }
        }
        R4678422174699242737.m0(arrayList2, c);
        return arrayList2;
    }

    public static final native A16842337154698931828 R(A16842337154698931828 a16842337154698931828, E5476434278640767445 e5476434278640767445);

    public static final native A16842337154698931828 S(A16842337154698931828 a16842337154698931828, Object obj, H16958786112251041262 h16958786112251041262, String str);

    public static void T(File file, byte[] bArr) {
        file.getClass();
        int i2 = F12738319475220657879.c;
        J9674324350959173737 j9674324350959173737 = J9674324350959173737.j;
        L17117488369409486445 l17117488369409486445 = new L17117488369409486445(L17117488369409486445.d);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, j9674324350959173737.contains(S16278007217191751869.a));
            l17117488369409486445.b.addFirst(fileOutputStream);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } finally {
        }
    }

    public static final native void e(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void f(Z7022156542152740569 z7022156542152740569, String str, I1722681268793429505 i1722681268793429505, boolean z, Long l, String str2, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void g(K2746982608131049817 k2746982608131049817, X16042184966849612101 x16042184966849612101, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(String str, long j, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(long j, M3727281027331139839 m3727281027331139839, int i2);

    public static final void j(B13729205492206812220 b13729205492206812220, long j, R14415661131438974095 r14415661131438974095, U16834965109098959004 u16834965109098959004, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        long j2;
        R14415661131438974095 r144156611314389740952;
        int i4;
        Object obj;
        int i5;
        byte b2;
        F10342546226345611902 f10342546226345611902;
        Object obj2;
        m3727281027331139839.b0(766784632);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(b13729205492206812220) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j2 = j;
            i3 |= m3727281027331139839.e(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i2 & 384) == 0) {
            r144156611314389740952 = r14415661131438974095;
            i3 |= m3727281027331139839.f(r144156611314389740952) ? 256 : 128;
        } else {
            r144156611314389740952 = r14415661131438974095;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? m3727281027331139839.f(u16834965109098959004) : m3727281027331139839.h(u16834965109098959004) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 9363) != 9362)) {
            View view = (View) m3727281027331139839.j(T15795698139970521497.f);
            R8540738700654750557 r8540738700654750557 = (R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h);
            F10342546226345611902 f103425462263456119022 = (F10342546226345611902) m3727281027331139839.j(Y238707362170117896.n);
            N4308732927120516147 I = E12775674050813925581.I(m3727281027331139839);
            W1972671267364756056 v = V4416135141588678913.v(t15443218846549482730, m3727281027331139839);
            Object[] objArr = new Object[0];
            Object M = m3727281027331139839.M();
            Object obj3 = O9023047933786425027.a;
            if (M == obj3) {
                i4 = i3;
                Object b9178969769697472001 = new B9178969769697472001((byte) 2);
                m3727281027331139839.k0(b9178969769697472001);
                obj = b9178969769697472001;
            } else {
                i4 = i3;
                obj = M;
            }
            UUID uuid = (UUID) C468629748621011703.k(objArr, (B13729205492206812220) obj, m3727281027331139839, 48);
            Object M2 = m3727281027331139839.M();
            Object obj4 = M2;
            if (M2 == obj3) {
                Object R = Q13169198992966610970.R(m3727281027331139839);
                m3727281027331139839.k0(R);
                obj4 = R;
            }
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj4;
            boolean f2 = m3727281027331139839.f(view) | m3727281027331139839.f(r8540738700654750557);
            Object M3 = m3727281027331139839.M();
            if (f2 || M3 == obj3) {
                i5 = i4;
                b2 = 1;
                K13763486024898229291 k13763486024898229291 = new K13763486024898229291(b13729205492206812220, r144156611314389740952, j2, view, f103425462263456119022, r8540738700654750557, uuid, u16834965109098959004, w5797197595347441198);
                f10342546226345611902 = f103425462263456119022;
                T15443218846549482730 t154432188465494827302 = new T15443218846549482730(-1051373467, true, new Z10714505275639781130(v, b2));
                P15244306345293739895 p15244306345293739895 = k13763486024898229291.i;
                p15244306345293739895.setParentCompositionContext(I);
                p15244306345293739895.j.setValue(t154432188465494827302);
                p15244306345293739895.k = true;
                p15244306345293739895.d();
                m3727281027331139839.k0(k13763486024898229291);
                obj2 = k13763486024898229291;
            } else {
                f10342546226345611902 = f103425462263456119022;
                i5 = i4;
                b2 = 1;
                obj2 = M3;
            }
            K13763486024898229291 k137634860248982292912 = (K13763486024898229291) obj2;
            boolean h2 = m3727281027331139839.h(k137634860248982292912);
            Object M4 = m3727281027331139839.M();
            Object obj5 = M4;
            if (h2 || M4 == obj3) {
                Object s16262227471297796850 = new S16262227471297796850((Object) k137634860248982292912, (byte) 24);
                m3727281027331139839.k0(s16262227471297796850);
                obj5 = s16262227471297796850;
            }
            Q13169198992966610970.c(k137634860248982292912, (F4096073349764486348) obj5, m3727281027331139839);
            int i6 = i5;
            int i7 = (m3727281027331139839.h(k137634860248982292912) ? 1 : 0) | ((i6 & 14) == 4 ? b2 : (byte) 0) | ((i6 & 896) == 256 ? b2 : (byte) 0) | ((i6 & 112) == 32 ? b2 : (byte) 0) | (m3727281027331139839.d(f10342546226345611902.ordinal()) ? 1 : 0);
            Object M5 = m3727281027331139839.M();
            if (i7 != 0 || M5 == obj3) {
                Object r16902898076259359200 = new R16902898076259359200(k137634860248982292912, b13729205492206812220, r14415661131438974095, j, f10342546226345611902);
                m3727281027331139839.k0(r16902898076259359200);
                M5 = r16902898076259359200;
            }
            Q13169198992966610970.B((B13729205492206812220) M5, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new B12317633641199469521(b13729205492206812220, j, r14415661131438974095, u16834965109098959004, t15443218846549482730, i2);
        }
    }

    public static final native void k(L12934646302524564674 l12934646302524564674, boolean z, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(List list, Set set, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(Z1656773070093558724 z1656773070093558724, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native Integer n(int i2);

    public static final ExecutorService o(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new K14897063067700974664(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static void p(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    public static byte[] q(byte[] bArr) {
        if (bArr.length != 16) {
            S10973172697741180971.j("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = (byte) ((bArr[i2] << 1) & 254);
            bArr2[i2] = b2;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((byte) ((bArr[i2 + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final I1722681268793429505 r(I1722681268793429505 i1722681268793429505) {
        return i1722681268793429505.Q0(E4677665658506021247.a);
    }

    public static final I1722681268793429505 s(I1722681268793429505 i1722681268793429505, boolean z, S9385204271696540760 s9385204271696540760) {
        return i1722681268793429505.Q0(z ? new O4842575202620284556(s9385204271696540760) : V10993962107938880611.a);
    }

    public static final native String t(String str, Integer num);

    public static final native String u(String str);

    public static float w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U15728912973537139392.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final O13631644638670499760 z(View view) {
        O13631644638670499760 o13631644638670499760 = (O13631644638670499760) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (o13631644638670499760 != null) {
            return o13631644638670499760;
        }
        O13631644638670499760 o136316446386704997602 = new O13631644638670499760();
        view.setTag(R.id.pooling_container_listener_holder_tag, o136316446386704997602);
        return o136316446386704997602;
    }

    public abstract int D(int i2);

    public abstract int J(int i2);

    @Override // dev.epro.r0.T16404477825665144123
    public int a(int i2) {
        return J(i2);
    }

    @Override // dev.epro.r0.T16404477825665144123
    public int b(int i2) {
        return D(i2);
    }

    @Override // dev.epro.r0.T16404477825665144123
    public int c(int i2) {
        int D = D(i2);
        if (D == -1 || D(D) == -1) {
            return -1;
        }
        return D;
    }

    @Override // dev.epro.r0.T16404477825665144123
    public int d(int i2) {
        int J = J(i2);
        if (J == -1 || J(J) == -1) {
            return -1;
        }
        return J;
    }

    public Object v(int i2) {
        D2029916669724210805 g2 = x().g(i2);
        return g2.c.getType().invoke(Integer.valueOf(i2 - g2.a));
    }

    public abstract N12245111110189169079 x();

    public Object y(int i2) {
        Object invoke;
        D2029916669724210805 g2 = x().g(i2);
        int i3 = i2 - g2.a;
        F4096073349764486348 key = g2.c.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i3))) == null) ? new X9224684763743102869(i2) : invoke;
    }

    static {
        izmyclvb.oeynnivvrnts0(641);
        b = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        c = new M5459415309190684092((byte) 8);
        d = new C4150953935654002107();
        e = new O12545633033254628644((byte) 1);
        f = new H2442898661687873181((byte) 0);
    }
}
