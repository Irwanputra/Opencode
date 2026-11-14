package dev.epro.r0;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.net.ssl.SSLSocket;
import net.zetetic.database.R;
import org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class J3301701597851028733 implements X6360402257588588862, B13906740428466697912, A6527624962738679687, R12081023847482212386, C1267176524613794288, P14632082186738269386, B4013457034958673222, W5631948913832446850, O16368343340005843063, W14715101850940949422, SpeculativeLoadingConfigBoundaryInterface, N123190348026444920 {
    public final /* synthetic */ byte a;

    public /* synthetic */ J3301701597851028733(byte b) {
        this.a = b;
    }

    public static ArrayList q(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((P10544952747155442696) obj) != P10544952747155442696.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((P10544952747155442696) obj2).a);
        }
        return arrayList2;
    }

    public static byte[] r(List list) {
        P5176232750190581838 p5176232750190581838 = new P5176232750190581838();
        ArrayList arrayListQ = q(list);
        int size = arrayListQ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            String str = (String) obj;
            p5176232750190581838.D(str.length());
            p5176232750190581838.I(str);
        }
        return p5176232750190581838.g(p5176232750190581838.b);
    }

    public static P5124777957357031757 s(String str) {
        int i;
        char cCharAt;
        byte[] bArr = Z11244019023321623390.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i3++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    bArrCopyOf[i6] = (byte) (i5 >> 16);
                    int i7 = i6 + 2;
                    bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                    i6 += 3;
                    bArrCopyOf[i7] = (byte) i5;
                }
                i3++;
            } else {
                int i8 = i4 % 4;
                if (i8 != 1) {
                    if (i8 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i8 == 3) {
                        int i9 = i5 << 6;
                        int i10 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i9 >> 16);
                        i6 += 2;
                        bArrCopyOf[i10] = (byte) (i9 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new P5124777957357031757(bArrCopyOf);
        }
        return null;
    }

    public static P5124777957357031757 t(String str) {
        if (str.length() % 2 != 0) {
            S10973172697741180971.i("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Q13169198992966610970.U(str.charAt(i2 + 1)) + (Q13169198992966610970.U(str.charAt(i2)) << 4));
        }
        return new P5124777957357031757(bArr);
    }

    public static P5124777957357031757 u(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(F16059529287866721367.a);
        bytes.getClass();
        P5124777957357031757 p5124777957357031757 = new P5124777957357031757(bytes);
        p5124777957357031757.c = str;
        return p5124777957357031757;
    }

    public static P10544952747155442696 v(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return P10544952747155442696.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return P10544952747155442696.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return P10544952747155442696.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return P10544952747155442696.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return P10544952747155442696.SPDY_3;
        }
        if (str.equals("quic")) {
            return P10544952747155442696.QUIC;
        }
        if (Z13168519540281190457.F(str, "h3", false)) {
            return P10544952747155442696.HTTP_3;
        }
        Q11088980322693754445.h("Unexpected protocol: ".concat(str));
        return null;
    }

    public static Object w(Class cls) {
        if (cls.equals(S15709944382977446712.class)) {
            return cls.cast(O5354877807466160604.f);
        }
        if (!cls.equals(N5158094851646208854.class) || I14980713035465194095.a.a.get()) {
            return null;
        }
        return cls.cast(new N5158094851646208854((byte) 0));
    }

    public static P5124777957357031757 y(byte[] bArr) {
        P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
        int length = bArr.length;
        E12775674050813925581.t(bArr.length, 0L, length);
        return new P5124777957357031757(O5378677881740157249.u0(0, bArr, length));
    }

    @Override // dev.epro.r0.B13906740428466697912, dev.epro.r0.A6527624962738679687
    public float a() {
        return 0.0f;
    }

    @Override // dev.epro.r0.X6360402257588588862
    public boolean b(SSLSocket sSLSocket) {
        return Z13168519540281190457.F(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // dev.epro.r0.W5631948913832446850
    public void c(H11725168162114556860 h11725168162114556860, long j, Z12993664435766561681 z12993664435766561681, int i, boolean z) {
        X9608137461199640409 x9608137461199640409 = h11725168162114556860.F;
        Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) x9608137461199640409.e;
        H12529970590088694579 h12529970590088694579 = Y4989033692226475498.V;
        ((Y4989033692226475498) x9608137461199640409.e).k1(Y4989033692226475498.b0, y4989033692226475498.b1(j), z12993664435766561681, 1, z);
    }

    @Override // dev.epro.r0.C1267176524613794288
    public long d(long j, long j2) {
        float fR = R7033599853981556291.r(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR)) & 4294967295L);
        int i = I6511330419983954851.a;
        return jFloatToRawIntBits;
    }

    @Override // dev.epro.r0.P14632082186738269386
    public Object e(String str, Provider provider) {
        switch (this.a) {
            case 10:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // dev.epro.r0.B13906740428466697912
    public void f(R8540738700654750557 r8540738700654750557, int i, int[] iArr, F10342546226345611902 f10342546226345611902, int[] iArr2) {
        if (f10342546226345611902 == F10342546226345611902.a) {
            V1475975160983963926.K(i, iArr, iArr2, false);
        } else {
            V1475975160983963926.K(i, iArr, iArr2, true);
        }
    }

    @Override // dev.epro.r0.X6360402257588588862
    public W17944177835232834043 g(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new V6488306180078902881(superclass);
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrefetches() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrerenders() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getPrefetchTTLSeconds() {
        throw null;
    }

    @Override // dev.epro.r0.W5631948913832446850
    public int h() {
        return 8;
    }

    @Override // dev.epro.r0.N123190348026444920
    public J12043550928838212009 i(M2547930385040280601 m2547930385040280601) {
        return new G6219617120344415229(C4426096483489462691.a, (byte) 3);
    }

    @Override // dev.epro.r0.W5631948913832446850
    public boolean j(H11725168162114556860 h11725168162114556860) {
        E10198359844879945462 e10198359844879945462W = h11725168162114556860.w();
        boolean z = false;
        if (e10198359844879945462W != null && e10198359844879945462W.d) {
            z = true;
        }
        return !z;
    }

    @Override // dev.epro.r0.W5631948913832446850
    public boolean k(R15896830329318850690 r15896830329318850690) {
        return U15853425786981391261.U(L12240044716294895599.b(R7033599853981556291.R(r15896830329318850690), false));
    }

    @Override // dev.epro.r0.B4013457034958673222
    public int l() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    @Override // dev.epro.r0.O16368343340005843063
    public void m(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // dev.epro.r0.W5631948913832446850
    public boolean n(Z12993664435766561681 z12993664435766561681, H11725168162114556860 h11725168162114556860) {
        return false;
    }

    @Override // dev.epro.r0.A6527624962738679687
    public void o(R8540738700654750557 r8540738700654750557, int i, int[] iArr, int[] iArr2) {
        V1475975160983963926.K(i, iArr, iArr2, false);
    }

    @Override // dev.epro.r0.W5631948913832446850
    public boolean p(R15896830329318850690 r15896830329318850690) {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Arrangement#SpaceBetween";
            case 5:
                StringBuilder sb = new StringBuilder("CharMatcher.is('");
                char[] cArr = new char[6];
                cArr[0] = '\\';
                cArr[1] = 'u';
                cArr[2] = 0;
                cArr[3] = 0;
                cArr[4] = 0;
                cArr[5] = 0;
                int i = 10;
                int i2 = 0;
                while (i2 < 4) {
                    cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
                    i2++;
                    i = 0;
                }
                sb.append(String.copyValueOf(cArr));
                sb.append("')");
                return sb.toString();
            case 6:
                return "CompositionErrorContext";
            case 27:
                int iHashCode = hashCode();
                M9216324016624295870.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return E12098517352909843120.m("CreationExtras.Key@", string, "<", J17975719213314763068.a(F18341548724281518495.class).c(), ">");
            case 29:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public void x(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public void z(O10311700946806650263 o10311700946806650263, int i, int i2) {
    }
}
