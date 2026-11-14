package dev.epro.r0;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.autofill.AutofillManager;
import com.trilead.ssh2.crypto.CryptoWishList;
import dev.epro.httpcustom.MainActivity;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class V10300877997588547986 implements V7541548809599293348, U2582504393267961583, P8628803860726212495, J10190266792694782308, Z8888095354249304160 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public V10300877997588547986(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.b = new A4559761392562572984();
                this.c = new A4559761392562572984();
                break;
            case 10:
                this.b = new D389890677992184566(0, new H11725168162114556860[16]);
                break;
            case 17:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
            case 25:
                this.b = new P5733283974459951585((byte) 1);
                this.c = new B1412794554478658227(16);
                break;
            case 28:
                this.b = new D389890677992184566(0, new Reference[16]);
                this.c = new ReferenceQueue();
                break;
            default:
                O3410298526443296213 o3410298526443296213 = D15913187640519482289.h;
                Float fValueOf = Float.valueOf(0.0f);
                this.c = new Q17276063867044657934(o3410298526443296213, fValueOf, (Z13251062865217617579) o3410298526443296213.a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
        }
    }

    public static V10300877997588547986 C(Socket socket) throws IOException {
        boolean z;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(socket.getInputStream());
        OutputStream outputStream = socket.getOutputStream();
        int i = pushbackInputStream.read();
        boolean z2 = false;
        if (i == 5) {
            int i2 = pushbackInputStream.read();
            if (i2 <= 0) {
                z = false;
            } else {
                byte[] bArr = new byte[i2];
                z = true;
                byte[] bArr2 = {5, -1};
                for (int i3 = 0; i3 < i2; i3 += pushbackInputStream.read(bArr, i3, i2 - i3)) {
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        z = false;
                        break;
                    }
                    if (bArr[i4] == 0) {
                        bArr2[1] = 0;
                        break;
                    }
                    i4++;
                }
                outputStream.write(bArr2);
            }
            if (!z) {
                return null;
            }
        } else {
            if (i != 4) {
                return null;
            }
            pushbackInputStream.unread(i);
        }
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986((byte) 21, z2);
        v10300877997588547986.b = pushbackInputStream;
        v10300877997588547986.c = outputStream;
        return v10300877997588547986;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void l(H11725168162114556860 h11725168162114556860) {
        if (h11725168162114556860.P > 0) {
            if (h11725168162114556860.G.d == J4327291511168983093.e && !h11725168162114556860.p() && !h11725168162114556860.q() && !h11725168162114556860.Q && h11725168162114556860.I()) {
                R15896830329318850690 r15896830329318850690 = (R15896830329318850690) h11725168162114556860.F.g;
                if ((r15896830329318850690.d & 256) != 0) {
                    while (r15896830329318850690 != null) {
                        if ((r15896830329318850690.c & 256) != 0) {
                            ?? M = r15896830329318850690;
                            ?? d389890677992184566 = 0;
                            while (M != 0) {
                                if (M instanceof O10709431398915260868) {
                                    O10709431398915260868 o10709431398915260868 = (O10709431398915260868) M;
                                    o10709431398915260868.s0(R7033599853981556291.P(o10709431398915260868, 256));
                                } else if ((M.c & 256) != 0 && (M instanceof J2215566372910931965)) {
                                    R15896830329318850690 r158968303293188506902 = ((J2215566372910931965) M).p;
                                    int i = 0;
                                    M = M;
                                    d389890677992184566 = d389890677992184566;
                                    while (r158968303293188506902 != null) {
                                        if ((r158968303293188506902.c & 256) != 0) {
                                            i++;
                                            d389890677992184566 = d389890677992184566;
                                            if (i == 1) {
                                                M = r158968303293188506902;
                                            } else {
                                                if (d389890677992184566 == 0) {
                                                    d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                }
                                                if (M != 0) {
                                                    d389890677992184566.b(M);
                                                    M = 0;
                                                }
                                                d389890677992184566.b(r158968303293188506902);
                                            }
                                        }
                                        r158968303293188506902 = r158968303293188506902.f;
                                        M = M;
                                        d389890677992184566 = d389890677992184566;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M = R7033599853981556291.M(d389890677992184566);
                            }
                        }
                        if ((r15896830329318850690.d & 256) == 0) {
                            break;
                        } else {
                            r15896830329318850690 = r15896830329318850690.f;
                        }
                    }
                }
            }
            h11725168162114556860.O = false;
            D389890677992184566 d389890677992184566Z = h11725168162114556860.z();
            Object[] objArr = d389890677992184566Z.a;
            int i2 = d389890677992184566Z.c;
            for (int i3 = 0; i3 < i2; i3++) {
                l((H11725168162114556860) objArr[i3]);
            }
        }
    }

    public void A() {
        if (!((U8000365519789522238) this.b).h) {
            S10973172697741180971.m("Can not perform this action after onSaveInstanceState");
            return;
        }
        E3114239622451594747 e3114239622451594747 = (E3114239622451594747) this.c;
        if (e3114239622451594747 == null) {
            e3114239622451594747 = new E3114239622451594747(this);
        }
        this.c = e3114239622451594747;
        try {
            T9652913346726608098.class.getDeclaredConstructor(null);
            E3114239622451594747 e31142396224515947472 = (E3114239622451594747) this.c;
            if (e31142396224515947472 != null) {
                ((LinkedHashSet) e31142396224515947472.b).add(T9652913346726608098.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + T9652913346726608098.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void B(D1951813632017244428 d1951813632017244428) {
        this.c = d1951813632017244428;
        View viewFindViewById = ((MainActivity) this.b).findViewById(R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new M17382065452405895374(this, viewFindViewById, (byte) 0));
    }

    public void D() {
        X7175349259954592591 x7175349259954592591 = (X7175349259954592591) this.b;
        Z13251062865217617579 z13251062865217617579 = null;
        if (x7175349259954592591 != null) {
            x7175349259954592591.c(null);
        }
        this.c = new Q17276063867044657934(D15913187640519482289.h, Float.valueOf(0.0f), z13251062865217617579, 60);
    }

    public X5127101262035123109 E(T4643696886244492064 t4643696886244492064) {
        X5127101262035123109 x5127101262035123109H;
        synchronized (this.c) {
            x5127101262035123109H = ((S11323950170556863336) this.b).h(t4643696886244492064);
        }
        return x5127101262035123109H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F(float f, R8540738700654750557 r8540738700654750557, W5797197595347441198 w5797197595347441198) {
        if (f <= r8540738700654750557.K(1.0f)) {
            return;
        }
        M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
        R4833348786910499294 r4833348786910499294 = null;
        Object[] objArr = 0;
        F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
        M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
        try {
            float fFloatValue = ((Number) ((Q17276063867044657934) this.c).b.getValue()).floatValue();
            X7175349259954592591 x7175349259954592591 = (X7175349259954592591) this.b;
            if (x7175349259954592591 != null) {
                x7175349259954592591.c(null);
            }
            Q17276063867044657934 q17276063867044657934 = (Q17276063867044657934) this.c;
            if (q17276063867044657934.f) {
                this.c = B5998207562248239613.n(q17276063867044657934, fFloatValue - f, 0.0f, 30);
            } else {
                this.c = new Q17276063867044657934(D15913187640519482289.h, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
            }
            this.b = R7033599853981556291.E(w5797197595347441198, null, null, new G16212247282630895364(this, r4833348786910499294, (byte) 7), 3);
            T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
        } catch (Throwable th) {
            T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
            throw th;
        }
    }

    public void G(Y6676784304453696344 y6676784304453696344) {
        A4559761392562572984 a4559761392562572984 = (A4559761392562572984) this.b;
        Object objG = ((A4559761392562572984) this.c).g(y6676784304453696344);
        if (objG != null) {
            byte b = 29;
            if (!(objG instanceof U9803441765912152712)) {
                C1629617973188005475.c(a4559761392562572984, (C4085811703908263224) objG, new S16262227471297796850(y6676784304453696344, b));
                return;
            }
            U9803441765912152712 u9803441765912152712 = (U9803441765912152712) objG;
            Object[] objArr = u9803441765912152712.a;
            int i = u9803441765912152712.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                obj.getClass();
                C1629617973188005475.c(a4559761392562572984, (C4085811703908263224) obj, new S16262227471297796850(y6676784304453696344, b));
            }
        }
    }

    @Override // dev.epro.r0.J10190266792694782308
    public List a(Integer num) {
        List listA = ((J10190266792694782308) this.b).a(null);
        K15438463641018513946 k15438463641018513946 = (K15438463641018513946) this.c;
        int i = k15438463641018513946.v;
        return i < 0 ? listA : R9411874267597469228.O0(C9869900372345142877.p(k15438463641018513946, num, i, Integer.valueOf(k15438463641018513946.F(k15438463641018513946.b, i))), listA);
    }

    public void b(String str, Object obj) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(G6547577305291411977.v(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // dev.epro.r0.V7541548809599293348
    public void c(R4355002902395871978 r4355002902395871978) {
        M8849337839148886240 m8849337839148886240 = (M8849337839148886240) this.c;
        m8849337839148886240.a();
        K18075763046227786881 k18075763046227786881 = (K18075763046227786881) r4355002902395871978.b;
        Object[] objArr = k18075763046227786881.b;
        long[] jArr = k18075763046227786881.c;
        int i = k18075763046227786881.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((A8674383068150491476) this.b).b(obj);
            int iD = m8849337839148886240.d(objB);
            int i3 = iD >= 0 ? m8849337839148886240.c[iD] : 0;
            if (i3 == 7) {
                r4355002902395871978.remove(obj);
            } else {
                m8849337839148886240.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // dev.epro.r0.P8628803860726212495
    public void cancel() {
        if (((X13205888428499400927) this.c).compareAndSet(1, 1)) {
            return;
        }
        ((A7716877927750495196) this.b).invoke();
    }

    @Override // dev.epro.r0.J10190266792694782308
    public boolean d() {
        return ((J10190266792694782308) this.b).d();
    }

    @Override // dev.epro.r0.V7541548809599293348
    public boolean e(Object obj, Object obj2) {
        A8674383068150491476 a8674383068150491476 = (A8674383068150491476) this.b;
        return S10823041268949770285.t(a8674383068150491476.b(obj), a8674383068150491476.b(obj2));
    }

    @Override // dev.epro.r0.Z8888095354249304160
    public Object f(Object obj) {
        return ((F4096073349764486348) this.c).invoke(obj);
    }

    public Bundle g(String str) {
        Bundle bundle;
        U8000365519789522238 u8000365519789522238 = (U8000365519789522238) this.b;
        if (!u8000365519789522238.g) {
            S10973172697741180971.m("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = u8000365519789522238.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                V4416135141588678913.s(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            u8000365519789522238.f = null;
        }
        return bundle;
    }

    public boolean h(T4643696886244492064 t4643696886244492064) {
        boolean zContainsKey;
        synchronized (this.c) {
            zContainsKey = ((S11323950170556863336) this.b).a.containsKey(t4643696886244492064);
        }
        return zContainsKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            dev.epro.r0.D389890677992184566 r0 = (dev.epro.r0.D389890677992184566) r0
            dev.epro.r0.J10770752472956524045 r1 = dev.epro.r0.J10770752472956524045.e
            java.lang.Object[] r2 = r0.a
            int r3 = r0.c
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.c
            java.lang.Object r2 = r6.c
            dev.epro.r0.H11725168162114556860[] r2 = (dev.epro.r0.H11725168162114556860[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            dev.epro.r0.H11725168162114556860[] r2 = new dev.epro.r0.H11725168162114556860[r2]
        L21:
            r3 = 0
            r6.c = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.a
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.i()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r4 = r0.O
            if (r4 == 0) goto L43
            l(r0)
        L43:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V10300877997588547986.i():void");
    }

    @Override // dev.epro.r0.U2582504393267961583
    public float j(float f, float f2) {
        switch (this.a) {
            case 4:
                float fAbs = Math.abs(f2);
                List list = ((E17523205116624666034) this.b).h().l;
                if (!list.isEmpty()) {
                    int size = list.size();
                    int size2 = list.size();
                    int i = 0;
                    while (i < size2) {
                        i += ((H3043063065558747866) list.get(i)).p;
                        i++;
                    }
                    i = i / size;
                }
                float f3 = fAbs - i;
                return Math.signum(f2) * (f3 >= 0.0f ? f3 : 0.0f);
            default:
                G16768067413993841943 g16768067413993841943 = (G16768067413993841943) this.b;
                int iM = g16768067413993841943.m();
                V697849047308847220 v697849047308847220 = g16768067413993841943.m;
                int i2 = ((Z10384052377193817149) v697849047308847220.getValue()).c + iM;
                if (i2 == 0) {
                    return 0.0f;
                }
                int i3 = g16768067413993841943.e;
                if (f < 0.0f) {
                    i3++;
                }
                int iQ = W7808703833045379622.q(((int) (f2 / i2)) + i3, 0, g16768067413993841943.l());
                g16768067413993841943.m();
                int i4 = ((Z10384052377193817149) v697849047308847220.getValue()).c;
                long j = i3;
                long j2 = j - 1;
                if (j2 < 0) {
                    j2 = 0;
                }
                int i5 = (int) j2;
                long j3 = j + 1;
                if (j3 > 2147483647L) {
                    j3 = 2147483647L;
                }
                int iAbs = Math.abs((W7808703833045379622.q(W7808703833045379622.q(iQ, i5, (int) j3), 0, g16768067413993841943.l()) - i3) * i2) - i2;
                i = iAbs >= 0 ? iAbs : 0;
                if (i == 0) {
                    return i;
                }
                return Math.signum(f) * i;
        }
    }

    @Override // dev.epro.r0.Z8888095354249304160
    public Object k(E13808449687169887804 e13808449687169887804, Object obj) {
        return ((L12639328004344855510) this.b).invoke(e13808449687169887804, obj);
    }

    public void m() {
        V697849047308847220 v697849047308847220 = (V697849047308847220) this.c;
        M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
        F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
        M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
        try {
            N6128695298966473235 n6128695298966473235 = (N6128695298966473235) v697849047308847220.getValue();
            if (n6128695298966473235 != null) {
                C13398002342190360892 c13398002342190360892 = (C13398002342190360892) this.b;
                R5670552972627103399 r5670552972627103399 = c13398002342190360892.b;
                R5670552972627103399 r56705529726271033992 = c13398002342190360892.c;
                r56705529726271033992.clear();
                while (r56705529726271033992.size() + r5670552972627103399.size() > c13398002342190360892.a - 1) {
                    P17571903987102865660.q0(r5670552972627103399);
                }
                r5670552972627103399.add(n6128695298966473235);
            }
            v697849047308847220.setValue(null);
        } finally {
            T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
        }
    }

    public A10838822263452390785 n() {
        return (A10838822263452390785) ((V697849047308847220) this.c).getValue();
    }

    public byte[] o() {
        U16120766223385152288 u16120766223385152288 = (U16120766223385152288) this.c;
        byte[] bArr = (byte[]) this.b;
        if (bArr != null) {
            return bArr;
        }
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.o(20);
        t17032536773975598836.p(0, u16120766223385152288.a, 16);
        t17032536773975598836.r(u16120766223385152288.b);
        t17032536773975598836.r(u16120766223385152288.c);
        t17032536773975598836.r(u16120766223385152288.d);
        t17032536773975598836.r(u16120766223385152288.e);
        t17032536773975598836.r(u16120766223385152288.f);
        t17032536773975598836.r(u16120766223385152288.g);
        t17032536773975598836.r(u16120766223385152288.h);
        t17032536773975598836.r(u16120766223385152288.i);
        t17032536773975598836.r(u16120766223385152288.j);
        t17032536773975598836.r(u16120766223385152288.k);
        t17032536773975598836.n(u16120766223385152288.l);
        t17032536773975598836.u(u16120766223385152288.m);
        byte[] bArrF = t17032536773975598836.f();
        this.b = bArrF;
        return bArrF;
    }

    public AutofillManager p() {
        AutofillManager autofillManager = (AutofillManager) this.c;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManagerG = T15589241373902147015.g(((Context) this.b).getSystemService(T15589241373902147015.i()));
        if (autofillManagerG != null) {
            this.c = autofillManagerG;
            return autofillManagerG;
        }
        S10973172697741180971.m("Could not locate AutofillManager from context");
        return null;
    }

    public L469992840463392687 q(String str) {
        L469992840463392687 l469992840463392687;
        U8000365519789522238 u8000365519789522238 = (U8000365519789522238) this.b;
        synchronized (u8000365519789522238.c) {
            l469992840463392687 = (L469992840463392687) u8000365519789522238.d.g(str);
        }
        return l469992840463392687;
    }

    public void r() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(net.zetetic.database.R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(net.zetetic.database.R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            M9216324016624295870.G(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(net.zetetic.database.R.attr.splashScreenIconSize, typedValue, true);
        if (!theme.resolveAttribute(net.zetetic.database.R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i);
    }

    public boolean s() {
        return ((U16120766223385152288) this.c).l;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01a9  */
    @Override // dev.epro.r0.U2582504393267961583
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float t(float r20) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V10300877997588547986.t(float):float");
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 27:
                return String.format("VersionTagsTuple<%s, %s>", (H17345613557654595427) this.b, (HashMap) this.c);
            case 29:
                return "Bounds{lower=" + ((Z1975157152518754667) this.b) + " upper=" + ((Z1975157152518754667) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            p().notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void v(Bundle bundle) {
        U8000365519789522238 u8000365519789522238 = (U8000365519789522238) this.b;
        F18341548724281518495 f18341548724281518495 = u8000365519789522238.a;
        if (!u8000365519789522238.e) {
            u8000365519789522238.a();
        }
        if (((I1283052979100930176) f18341548724281518495.j()).h.compareTo(Q14196755420833223976.d) >= 0) {
            D11988991656201568495.r("performRestore cannot be called when owner is ", ((I1283052979100930176) f18341548724281518495.j()).h);
            return;
        }
        if (u8000365519789522238.g) {
            S10973172697741180971.m("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                V4416135141588678913.s("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        u8000365519789522238.f = bundle2;
        u8000365519789522238.g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r0 = r0.b
            dev.epro.r0.U8000365519789522238 r0 = (dev.epro.r0.U8000365519789522238) r0
            r1 = 0
            dev.epro.r0.H9390398899829886498[] r2 = new dev.epro.r0.H9390398899829886498[r1]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            dev.epro.r0.H9390398899829886498[] r2 = (dev.epro.r0.H9390398899829886498[]) r2
            android.os.Bundle r2 = dev.epro.r0.O5354877807466160604.z(r2)
            android.os.Bundle r3 = r0.f
            if (r3 == 0) goto L1a
            r2.putAll(r3)
        L1a:
            dev.epro.r0.Y2677586711477821327 r3 = r0.c
            monitor-enter(r3)
            dev.epro.r0.A4559761392562572984 r0 = r0.d     // Catch: java.lang.Throwable -> L66
            java.lang.Object[] r4 = r0.b     // Catch: java.lang.Throwable -> L66
            java.lang.Object[] r5 = r0.c     // Catch: java.lang.Throwable -> L66
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L66
            int r6 = r0.length     // Catch: java.lang.Throwable -> L66
            int r6 = r6 + (-2)
            if (r6 < 0) goto L73
            r7 = r1
        L2b:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L66
            long r10 = ~r8     // Catch: java.lang.Throwable -> L66
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6e
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L66
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r1
        L45:
            if (r12 >= r10) goto L6c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L68
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L66
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.L469992840463392687 r13 = (dev.epro.r0.L469992840463392687) r13     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L66
            android.os.Bundle r13 = r13.a()     // Catch: java.lang.Throwable -> L66
            r14.getClass()     // Catch: java.lang.Throwable -> L66
            r2.putBundle(r14, r13)     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r0 = move-exception
            goto L82
        L68:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L6c:
            if (r10 != r11) goto L73
        L6e:
            if (r7 == r6) goto L73
            int r7 = r7 + 1
            goto L2b
        L73:
            monitor-exit(r3)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L81
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r1 = r18
            r1.putBundle(r0, r2)
        L81:
            return
        L82:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V10300877997588547986.w(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(dev.epro.r0.N6128695298966473235 r29) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V10300877997588547986.x(dev.epro.r0.N6128695298966473235):void");
    }

    public void y(String str, L469992840463392687 l469992840463392687) {
        U8000365519789522238 u8000365519789522238 = (U8000365519789522238) this.b;
        synchronized (u8000365519789522238.c) {
            if (u8000365519789522238.d.b(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            u8000365519789522238.d.n(str, l469992840463392687);
        }
    }

    public X5127101262035123109 z(T4643696886244492064 t4643696886244492064) {
        X5127101262035123109 x5127101262035123109F;
        t4643696886244492064.getClass();
        synchronized (this.c) {
            x5127101262035123109F = ((S11323950170556863336) this.b).f(t4643696886244492064);
        }
        return x5127101262035123109F;
    }

    public /* synthetic */ V10300877997588547986(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ V10300877997588547986(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ V10300877997588547986(Object obj) {
        this.a = (byte) 9;
        this.c = obj;
        this.b = new ArrayList();
    }

    public V10300877997588547986(String str, E4916761685899363666 e4916761685899363666, Bundle bundle) {
        this.a = (byte) 0;
        this.b = str;
        this.c = bundle;
    }

    public V10300877997588547986(U8000365519789522238 u8000365519789522238) {
        this.a = (byte) 19;
        this.b = u8000365519789522238;
        this.c = new V10300877997588547986((Object) u8000365519789522238, (byte) 18);
    }

    public V10300877997588547986(CryptoWishList cryptoWishList, SecureRandom secureRandom) {
        this.a = (byte) 13;
        U16120766223385152288 u16120766223385152288 = new U16120766223385152288();
        this.c = u16120766223385152288;
        byte[] bArr = new byte[16];
        u16120766223385152288.a = bArr;
        secureRandom.nextBytes(bArr);
        u16120766223385152288.b = cryptoWishList.kexAlgorithms;
        u16120766223385152288.c = cryptoWishList.serverHostKeyAlgorithms;
        u16120766223385152288.d = cryptoWishList.c2s_enc_algos;
        u16120766223385152288.e = cryptoWishList.s2c_enc_algos;
        u16120766223385152288.f = cryptoWishList.c2s_mac_algos;
        u16120766223385152288.g = cryptoWishList.s2c_mac_algos;
        u16120766223385152288.h = cryptoWishList.c2s_comp_algos;
        u16120766223385152288.i = cryptoWishList.s2c_comp_algos;
        u16120766223385152288.j = new String[0];
        u16120766223385152288.k = new String[0];
        u16120766223385152288.l = false;
        u16120766223385152288.m = 0;
    }

    public V10300877997588547986(H11725168162114556860 h11725168162114556860, A10838822263452390785 a10838822263452390785) {
        this.a = (byte) 1;
        this.b = h11725168162114556860;
        this.c = V4416135141588678913.t(a10838822263452390785);
    }

    public V10300877997588547986(G16768067413993841943 g16768067413993841943, T16680511889760403724 t16680511889760403724, T5458736918376364276 t5458736918376364276) {
        this.a = (byte) 14;
        this.b = g16768067413993841943;
        this.c = t16680511889760403724;
    }

    public V10300877997588547986(A7716877927750495196 a7716877927750495196) {
        this.a = (byte) 11;
        this.b = a7716877927750495196;
        this.c = new X13205888428499400927(0);
    }

    public V10300877997588547986(N6128695298966473235 n6128695298966473235, C13398002342190360892 c13398002342190360892) {
        this.a = (byte) 24;
        this.b = c13398002342190360892;
        this.c = V4416135141588678913.t(n6128695298966473235);
    }

    public /* synthetic */ V10300877997588547986(byte b, boolean z) {
        this.a = b;
    }

    public V10300877997588547986(byte[] bArr, int i) throws IOException {
        this.a = (byte) 13;
        U16120766223385152288 u16120766223385152288 = new U16120766223385152288();
        this.c = u16120766223385152288;
        byte[] bArr2 = new byte[i];
        this.b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, i);
        int iB = c9142879380583651391.b();
        if (iB == 20) {
            u16120766223385152288.a = c9142879380583651391.d(16);
            u16120766223385152288.b = c9142879380583651391.f();
            u16120766223385152288.c = c9142879380583651391.f();
            u16120766223385152288.d = c9142879380583651391.f();
            u16120766223385152288.e = c9142879380583651391.f();
            u16120766223385152288.f = c9142879380583651391.f();
            u16120766223385152288.g = c9142879380583651391.f();
            u16120766223385152288.h = c9142879380583651391.f();
            u16120766223385152288.i = c9142879380583651391.f();
            u16120766223385152288.j = c9142879380583651391.f();
            u16120766223385152288.k = c9142879380583651391.f();
            u16120766223385152288.l = c9142879380583651391.a();
            u16120766223385152288.m = c9142879380583651391.i();
            if (c9142879380583651391.j() == 0) {
                return;
            }
            Q11088980322693754445.h("Padding in KexInitPacket!");
            throw null;
        }
        Q11088980322693754445.h(G6547577305291411977.o(iB, "This is not a KexInitPacket! (", ")"));
        throw null;
    }

    public V10300877997588547986(S11323950170556863336 s11323950170556863336) {
        this.a = (byte) 23;
        this.b = s11323950170556863336;
        this.c = new Object();
    }

    public V10300877997588547986(A8674383068150491476 a8674383068150491476) {
        this.a = (byte) 2;
        this.b = a8674383068150491476;
        M8849337839148886240 m8849337839148886240 = C7857973833719834669.a;
        this.c = new M8849337839148886240();
    }

    public V10300877997588547986(WindowInsetsAnimation.Bounds bounds) {
        this.a = (byte) 29;
        this.b = Z1975157152518754667.c(bounds.getLowerBound());
        this.c = Z1975157152518754667.c(bounds.getUpperBound());
    }

    public V10300877997588547986(MainActivity mainActivity) {
        this.a = (byte) 22;
        this.b = mainActivity;
        this.c = new K2042933864045806308((byte) 23);
    }
}
