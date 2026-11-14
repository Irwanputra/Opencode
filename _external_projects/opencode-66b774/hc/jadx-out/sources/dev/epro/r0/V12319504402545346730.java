package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.zetetic.database.CursorWindow;
import o.bwmna.gdrqkg.izmyclvb;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V12319504402545346730 {
    public static final char[] a;
    public static final T15443218846549482730 b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final D14731132657808549702 g;
    public static final D14731132657808549702 h;
    public static final D14731132657808549702 i;
    public static final StackTraceElement[] j;
    public static final K2042933864045806308 k;
    public static final Z14997871575210439922 l;
    public static Z7022156542152740569 m;
    public static Z7022156542152740569 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Z7022156542152740569 f532o;
    public static Z7022156542152740569 p;

    static {
        int iFgicubcgndyb;
        izmyclvb.qgayjvbiagej2(432);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                iFgicubcgndyb = fgicubcgndyb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iFgicubcgndyb != 0) {
                switch (iFgicubcgndyb) {
                    case 1:
                        a = (char[]) objArr[1];
                        continue;
                    case 2:
                        b = (T15443218846549482730) objArr[1];
                        continue;
                    case 3:
                        c = ((Float) objArr[1]).floatValue();
                        continue;
                    case 4:
                        d = ((Float) objArr[1]).floatValue();
                        continue;
                    case 5:
                        e = ((Float) objArr[1]).floatValue();
                        continue;
                    case 6:
                        f = ((Float) objArr[1]).floatValue();
                        continue;
                    case 7:
                        g = (D14731132657808549702) objArr[1];
                        continue;
                    case 8:
                        h = (D14731132657808549702) objArr[1];
                        continue;
                    case 9:
                        i = (D14731132657808549702) objArr[1];
                        continue;
                    case 10:
                        j = (StackTraceElement[]) objArr[1];
                        continue;
                    case 11:
                        k = (K2042933864045806308) objArr[1];
                        continue;
                    case 12:
                        l = (Z14997871575210439922) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static X7650711929610928530 A(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453, int i2) throws I14711110190789567685 {
        try {
            P11184147566986477297 p11184147566986477297K = C775827382551829194.K(y12887846282176508602, j13328905385734298453);
            long j2 = p11184147566986477297K.a;
            B11059234153875532973 b11059234153875532973 = (B11059234153875532973) p11184147566986477297K.b;
            ByteBuffer byteBufferB = b11059234153875532973.b((int) b11059234153875532973.size(), 0L);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferB.order(byteOrder);
            if (byteBufferB.order() != byteOrder) {
                S10973172697741180971.j("ByteBuffer byte order must be little endian");
                return null;
            }
            int iCapacity = byteBufferB.capacity() - 24;
            if (iCapacity < 8) {
                S10973172697741180971.j(G6547577305291411977.o(iCapacity, "end < start: ", " < 8"));
                return null;
            }
            int iCapacity2 = byteBufferB.capacity();
            if (iCapacity > byteBufferB.capacity()) {
                S10973172697741180971.j(E12098517352909843120.l("end > capacity: ", iCapacity, iCapacity2, " > "));
                return null;
            }
            int iLimit = byteBufferB.limit();
            int iPosition = byteBufferB.position();
            int i3 = 0;
            try {
                byteBufferB.position(0);
                byteBufferB.limit(iCapacity);
                byteBufferB.position(8);
                ByteBuffer byteBufferSlice = byteBufferB.slice();
                byteBufferSlice.order(byteBufferB.order());
                while (byteBufferSlice.hasRemaining()) {
                    i3++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new I14711110190789567685(G6547577305291411977.n(i3, "Insufficient data to read size of APK Signing Block entry #"));
                    }
                    long j3 = byteBufferSlice.getLong();
                    if (j3 < 4 || j3 > 2147483647L) {
                        throw new I14711110190789567685("APK Signing Block entry #" + i3 + " size out of range: " + j3);
                    }
                    int i4 = (int) j3;
                    int iPosition2 = byteBufferSlice.position() + i4;
                    if (i4 > byteBufferSlice.remaining()) {
                        StringBuilder sbP = E12098517352909843120.p(i3, i4, "APK Signing Block entry #", " size out of range: ", ", available: ");
                        sbP.append(byteBufferSlice.remaining());
                        throw new I14711110190789567685(sbP.toString());
                    }
                    if (byteBufferSlice.getInt() == i2) {
                        return new X7650711929610928530(B(byteBufferSlice, i4 - 4), j2, j13328905385734298453.a, j13328905385734298453.d, j13328905385734298453.e);
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new I14711110190789567685(G6547577305291411977.n(i2, "No APK Signature Scheme block in APK Signing Block with ID: "));
            } finally {
                byteBufferB.position(0);
                byteBufferB.limit(iLimit);
                byteBufferB.position(iPosition);
            }
        } catch (C5444222462668790382 e2) {
            throw new I14711110190789567685(e2.getMessage(), e2);
        }
    }

    public static ByteBuffer B(ByteBuffer byteBuffer, int i2) {
        if (i2 < 0) {
            S10973172697741180971.j(G6547577305291411977.n(i2, "size: "));
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static final native int C(X11638668447546090163 x11638668447546090163);

    public static final Z7022156542152740569 D() {
        Z7022156542152740569 z7022156542152740569 = m;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Dns", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(19.0f, 15.0f);
        v14323974914327418545.s(4.0f);
        v14323974914327418545.f(5.0f);
        v14323974914327418545.s(-4.0f);
        v14323974914327418545.g(14.0f);
        v14323974914327418545.k(1.0f, -2.0f);
        v14323974914327418545.f(4.0f);
        v14323974914327418545.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        v14323974914327418545.s(6.0f);
        v14323974914327418545.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        v14323974914327418545.g(16.0f);
        v14323974914327418545.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        v14323974914327418545.s(-6.0f);
        v14323974914327418545.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(7.0f, 18.5f);
        v14323974914327418545.e(-0.82f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        v14323974914327418545.o(0.68f, -1.5f, 1.5f, -1.5f);
        v14323974914327418545.o(1.5f, 0.67f, 1.5f, 1.5f);
        v14323974914327418545.o(-0.67f, 1.5f, -1.5f, 1.5f);
        v14323974914327418545.c();
        v14323974914327418545.j(19.0f, 5.0f);
        v14323974914327418545.s(4.0f);
        v14323974914327418545.f(5.0f);
        v14323974914327418545.r(5.0f);
        v14323974914327418545.g(14.0f);
        v14323974914327418545.k(1.0f, -2.0f);
        v14323974914327418545.f(4.0f);
        v14323974914327418545.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        v14323974914327418545.s(6.0f);
        v14323974914327418545.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        v14323974914327418545.g(16.0f);
        v14323974914327418545.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        v14323974914327418545.r(4.0f);
        v14323974914327418545.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(7.0f, 8.5f);
        v14323974914327418545.e(-0.82f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        v14323974914327418545.n(6.18f, 5.5f, 7.0f, 5.5f);
        v14323974914327418545.o(1.5f, 0.68f, 1.5f, 1.5f);
        v14323974914327418545.n(7.83f, 8.5f, 7.0f, 8.5f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        m = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Z7022156542152740569 E() {
        Z7022156542152740569 z7022156542152740569 = n;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new K11581048818582425500(12.0f, 8.0f));
        arrayList.add(new T8070361472955532362(-6.0f, 6.0f));
        arrayList.add(new T8070361472955532362(1.41f, 1.41f));
        arrayList.add(new N18337357316239809325(12.0f, 10.83f));
        arrayList.add(new T8070361472955532362(4.59f, 4.58f));
        arrayList.add(new N18337357316239809325(18.0f, 14.0f));
        arrayList.add(new T8070361472955532362(-6.0f, -6.0f));
        arrayList.add(G18244342923164738699.c);
        Q17593287602150918564.a(q17593287602150918564, arrayList, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        n = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Z7022156542152740569 F() {
        Z7022156542152740569 z7022156542152740569 = f532o;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.HelpOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(11.0f, 18.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(-2.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 2.0f);
        v14323974914327418545.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        v14323974914327418545.o(4.48f, 10.0f, 10.0f, 10.0f);
        v14323974914327418545.o(10.0f, -4.48f, 10.0f, -10.0f);
        v14323974914327418545.n(17.52f, 2.0f, 12.0f, 2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 20.0f);
        v14323974914327418545.e(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        v14323974914327418545.o(3.59f, -8.0f, 8.0f, -8.0f);
        v14323974914327418545.o(8.0f, 3.59f, 8.0f, 8.0f);
        v14323974914327418545.o(-3.59f, 8.0f, -8.0f, 8.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 6.0f);
        v14323974914327418545.e(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.e(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        v14323974914327418545.o(2.0f, 0.9f, 2.0f, 2.0f);
        v14323974914327418545.e(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.e(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f);
        v14323974914327418545.e(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        f532o = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static ByteBuffer G(ByteBuffer byteBuffer) throws C15632080896631311437 {
        if (byteBuffer.remaining() < 4) {
            throw new C15632080896631311437("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            S10973172697741180971.j("Negative length");
            return null;
        }
        if (i2 <= byteBuffer.remaining()) {
            return B(byteBuffer, i2);
        }
        StringBuilder sbQ = E12098517352909843120.q(i2, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        sbQ.append(byteBuffer.remaining());
        throw new C15632080896631311437(sbQ.toString());
    }

    public static final H7219028874700587498 H(R4833348786910499294 r4833348786910499294) {
        Unsafe unsafe;
        H7219028874700587498 h7219028874700587498;
        H7219028874700587498 h72190288747005874982;
        if (!(r4833348786910499294 instanceof N16152488056535110728)) {
            return new H7219028874700587498(1, r4833348786910499294);
        }
        N16152488056535110728 n16152488056535110728 = (N16152488056535110728) r4833348786910499294;
        D14731132657808549702 d14731132657808549702 = J8045362843799184672.c;
        long j2 = N16152488056535110728.h;
        loop0: while (true) {
            unsafe = T5284056093300834442.a;
            Object objectVolatile = unsafe.getObjectVolatile(n16152488056535110728, j2);
            h7219028874700587498 = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(n16152488056535110728, j2, d14731132657808549702);
                h72190288747005874982 = null;
                break;
            }
            if (objectVolatile instanceof H7219028874700587498) {
                do {
                    unsafe = T5284056093300834442.a;
                    if (unsafe.compareAndSwapObject(n16152488056535110728, N16152488056535110728.h, objectVolatile, d14731132657808549702)) {
                        h72190288747005874982 = (H7219028874700587498) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(n16152488056535110728, j2) == objectVolatile);
            } else if (objectVolatile != d14731132657808549702 && !(objectVolatile instanceof Throwable)) {
                Q11088980322693754445.i("Inconsistent state ", objectVolatile);
                return null;
            }
        }
        if (h72190288747005874982 != null) {
            long j3 = H7219028874700587498.h;
            Object objectVolatile2 = unsafe.getObjectVolatile(h72190288747005874982, j3);
            if (!(objectVolatile2 instanceof X15830299412964774035) || ((X15830299412964774035) objectVolatile2).d == null) {
                unsafe.putIntVolatile(h72190288747005874982, H7219028874700587498.f, 536870911);
                unsafe.putObjectVolatile(h72190288747005874982, j3, E17368208470737500956.a);
                h7219028874700587498 = h72190288747005874982;
            } else {
                h72190288747005874982.o();
            }
            if (h7219028874700587498 != null) {
                return h7219028874700587498;
            }
        }
        return new H7219028874700587498(2, r4833348786910499294);
    }

    public static ArrayList I(ArrayList arrayList, int i2, int i3, boolean z) throws N5580838516609915046 {
        HashMap map = new HashMap();
        int size = arrayList.size();
        byte b2 = 2147483647;
        int i4 = 0;
        while (true) {
            byte b3 = 1;
            if (i4 >= size) {
                if (i2 < b2) {
                    throw new N5580838516609915046(E12098517352909843120.l("Minimum provided signature version ", b2, i2, " > minSdkVersion "));
                }
                if (map.isEmpty()) {
                    throw new N5580838516609915046("No supported signature");
                }
                ArrayList arrayList2 = new ArrayList(map.values());
                Collections.sort(arrayList2, new M5459415309190684092(b3));
                return arrayList2;
            }
            Object obj = arrayList.get(i4);
            i4++;
            S10055171720181493248 s10055171720181493248 = (S10055171720181493248) obj;
            Y16631409940158714280 y16631409940158714280 = s10055171720181493248.a;
            byte b4 = z ? y16631409940158714280.f : y16631409940158714280.e;
            if (b4 <= i3) {
                if (b4 < b2) {
                    b2 = b4;
                }
                S10055171720181493248 s100551717201814932482 = (S10055171720181493248) map.get(Integer.valueOf(b4));
                if (s100551717201814932482 != null) {
                    Y16631409940158714280 y166314099401587142802 = s100551717201814932482.a;
                    Y4733161976867834422 y4733161976867834422 = y16631409940158714280.c;
                    Y4733161976867834422 y47331619768678344222 = y166314099401587142802.c;
                    int iOrdinal = y4733161976867834422.ordinal();
                    if (iOrdinal == 0) {
                        int iOrdinal2 = y47331619768678344222.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            Q11088980322693754445.l("Unknown alg2: ", y47331619768678344222);
                            return null;
                        }
                    } else if (iOrdinal == 1) {
                        int iOrdinal3 = y47331619768678344222.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 == 1) {
                                continue;
                            } else if (iOrdinal3 != 2) {
                                Q11088980322693754445.l("Unknown alg2: ", y47331619768678344222);
                                return null;
                            }
                        }
                    } else {
                        if (iOrdinal != 2) {
                            Q11088980322693754445.l("Unknown alg1: ", y4733161976867834422);
                            return null;
                        }
                        int iOrdinal4 = y47331619768678344222.ordinal();
                        if (iOrdinal4 != 0) {
                            if (iOrdinal4 != 1 && iOrdinal4 != 2) {
                                Q11088980322693754445.l("Unknown alg2: ", y47331619768678344222);
                                return null;
                            }
                        }
                    }
                }
                map.put(Integer.valueOf(b4), s10055171720181493248);
            }
        }
    }

    public static final native boolean J(X11638668447546090163 x11638668447546090163);

    public static boolean K(int i2, Object obj) {
        if (obj instanceof S8977162183056139880) {
            if ((obj instanceof T1167221497807669151 ? ((T1167221497807669151) obj).getArity() : obj instanceof B13729205492206812220 ? 0 : obj instanceof F4096073349764486348 ? 1 : obj instanceof L12639328004344855510 ? 2 : obj instanceof J12078565427869724451 ? 3 : obj instanceof G13792465322404021864 ? 4 : obj instanceof X9973786505953245660 ? 5 : obj instanceof V9261584529168786349 ? 6 : obj instanceof D7772520967547850105 ? 7 : obj instanceof D11437685219418266086 ? 8 : obj instanceof O5745440982696445525 ? 9 : obj instanceof J2735738717836875655 ? 10 : obj instanceof Q3354554335772326037 ? 11 : obj instanceof Z2074687661010595864 ? 13 : obj instanceof J8774491949465308730 ? 14 : obj instanceof B1950770386626402451 ? 15 : obj instanceof T3362297006778140915 ? 16 : obj instanceof F7663718823386495150 ? 17 : obj instanceof D12754633875664436259 ? 18 : obj instanceof S3437763749522728681 ? 19 : obj instanceof T15896224511591213151 ? 20 : obj instanceof R17636885141369258529 ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static double L(double d2, double d3, double d4) {
        return (d4 * d3) + ((1.0d - d4) * d2);
    }

    public static final I1722681268793429505 M(M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505) {
        if (i1722681268793429505.g(new F17594658268783405200((byte) 22))) {
            return i1722681268793429505;
        }
        m3727281027331139839.V(1219399079, 0, null, null);
        I1722681268793429505 i17226812687934295052 = (I1722681268793429505) i1722681268793429505.b(new K5271540294206541871(m3727281027331139839, (byte) 10), V10993962107938880611.a);
        m3727281027331139839.q(false);
        return i17226812687934295052;
    }

    public static final I1722681268793429505 N(M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505) {
        m3727281027331139839.a0(439770924);
        I1722681268793429505 i1722681268793429505M = M(m3727281027331139839, i1722681268793429505);
        m3727281027331139839.q(false);
        return i1722681268793429505M;
    }

    public static double[] O(double[] dArr, double[][] dArr2) {
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        return new double[]{d7, d8, (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0])};
    }

    public static final F14219584781620110682 P(J9638579967056948799 j9638579967056948799, int i2) {
        int iOrdinal = j9638579967056948799.m1().ordinal();
        F14219584781620110682 f14219584781620110682 = F14219584781620110682.a;
        if (iOrdinal != 0) {
            F14219584781620110682 f142195847816201106822 = F14219584781620110682.b;
            if (iOrdinal == 1) {
                J9638579967056948799 j9638579967056948799V = B11964701839924937722.v(j9638579967056948799);
                if (j9638579967056948799V == null) {
                    S10973172697741180971.j("ActiveParent with no focused child");
                    return null;
                }
                F14219584781620110682 f14219584781620110682P = P(j9638579967056948799V, i2);
                F14219584781620110682 f142195847816201106823 = f14219584781620110682P != f14219584781620110682 ? f14219584781620110682P : null;
                if (f142195847816201106823 != null) {
                    return f142195847816201106823;
                }
                if (j9638579967056948799.q) {
                    return f14219584781620110682;
                }
                j9638579967056948799.q = true;
                try {
                    I12008059209901932953 i12008059209901932953J1 = j9638579967056948799.j1();
                    A2536033623645142779 a2536033623645142779 = new A2536033623645142779(i2);
                    D10236220797215130727 d10236220797215130727 = (D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner();
                    J9638579967056948799 j9638579967056948799G = d10236220797215130727.g();
                    i12008059209901932953J1.k.invoke(a2536033623645142779);
                    J9638579967056948799 j9638579967056948799G2 = d10236220797215130727.g();
                    if (!a2536033623645142779.b) {
                        return (j9638579967056948799G == j9638579967056948799G2 || j9638579967056948799G2 == null) ? f14219584781620110682 : H10681976249452161517.d == H10681976249452161517.c ? f142195847816201106822 : F14219584781620110682.c;
                    }
                    H10681976249452161517 h10681976249452161517 = H10681976249452161517.b;
                    return f142195847816201106822;
                } finally {
                    j9638579967056948799.q = false;
                }
            }
            if (iOrdinal == 2) {
                return f142195847816201106822;
            }
            if (iOrdinal != 3) {
                Z3383101362411723454.g();
                return null;
            }
        }
        return f14219584781620110682;
    }

    public static final F14219584781620110682 Q(J9638579967056948799 j9638579967056948799, int i2) {
        if (!j9638579967056948799.r) {
            j9638579967056948799.r = true;
            try {
                I12008059209901932953 i12008059209901932953J1 = j9638579967056948799.j1();
                A2536033623645142779 a2536033623645142779 = new A2536033623645142779(i2);
                D10236220797215130727 d10236220797215130727 = (D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner();
                J9638579967056948799 j9638579967056948799G = d10236220797215130727.g();
                i12008059209901932953J1.j.invoke(a2536033623645142779);
                J9638579967056948799 j9638579967056948799G2 = d10236220797215130727.g();
                boolean z = a2536033623645142779.b;
                F14219584781620110682 f14219584781620110682 = F14219584781620110682.b;
                if (z) {
                    H10681976249452161517 h10681976249452161517 = H10681976249452161517.b;
                    return f14219584781620110682;
                }
                if (j9638579967056948799G != j9638579967056948799G2 && j9638579967056948799G2 != null) {
                    return H10681976249452161517.d == H10681976249452161517.c ? f14219584781620110682 : F14219584781620110682.c;
                }
            } finally {
                j9638579967056948799.r = false;
            }
        }
        return F14219584781620110682.a;
    }

    public static final F14219584781620110682 R(J9638579967056948799 j9638579967056948799, int i2) {
        R15896830329318850690 r15896830329318850690M;
        X9608137461199640409 x9608137461199640409;
        int iOrdinal = j9638579967056948799.m1().ordinal();
        F14219584781620110682 f14219584781620110682 = F14219584781620110682.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                J9638579967056948799 j9638579967056948799V = B11964701839924937722.v(j9638579967056948799);
                if (j9638579967056948799V != null) {
                    return P(j9638579967056948799V, i2);
                }
                S10973172697741180971.j("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    Z3383101362411723454.g();
                    return null;
                }
                if (!j9638579967056948799.a.n) {
                    P753981624812481271.b("visitAncestors called on an unattached node");
                }
                R15896830329318850690 r15896830329318850690 = j9638579967056948799.a.e;
                H11725168162114556860 h11725168162114556860R = R7033599853981556291.R(j9638579967056948799);
                loop0: while (true) {
                    if (h11725168162114556860R == null) {
                        r15896830329318850690M = null;
                        break;
                    }
                    if ((((R15896830329318850690) h11725168162114556860R.F.g).d & 1024) != 0) {
                        while (r15896830329318850690 != null) {
                            if ((r15896830329318850690.c & 1024) != 0) {
                                r15896830329318850690M = r15896830329318850690;
                                D389890677992184566 d389890677992184566 = null;
                                while (r15896830329318850690M != null) {
                                    if (r15896830329318850690M instanceof J9638579967056948799) {
                                        break loop0;
                                    }
                                    if ((r15896830329318850690M.c & 1024) != 0 && (r15896830329318850690M instanceof J2215566372910931965)) {
                                        int i3 = 0;
                                        for (R15896830329318850690 r158968303293188506902 = ((J2215566372910931965) r15896830329318850690M).p; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                                            if ((r158968303293188506902.c & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    r15896830329318850690M = r158968303293188506902;
                                                } else {
                                                    if (d389890677992184566 == null) {
                                                        d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                    }
                                                    if (r15896830329318850690M != null) {
                                                        d389890677992184566.b(r15896830329318850690M);
                                                        r15896830329318850690M = null;
                                                    }
                                                    d389890677992184566.b(r158968303293188506902);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    r15896830329318850690M = R7033599853981556291.M(d389890677992184566);
                                }
                            }
                            r15896830329318850690 = r15896830329318850690.e;
                        }
                    }
                    h11725168162114556860R = h11725168162114556860R.u();
                    r15896830329318850690 = (h11725168162114556860R == null || (x9608137461199640409 = h11725168162114556860R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
                }
                J9638579967056948799 j96385799670569487992 = (J9638579967056948799) r15896830329318850690M;
                if (j96385799670569487992 == null) {
                    return f14219584781620110682;
                }
                int iOrdinal2 = j96385799670569487992.m1().ordinal();
                if (iOrdinal2 == 0) {
                    return Q(j96385799670569487992, i2);
                }
                if (iOrdinal2 == 1) {
                    return R(j96385799670569487992, i2);
                }
                if (iOrdinal2 == 2) {
                    return F14219584781620110682.b;
                }
                if (iOrdinal2 != 3) {
                    Z3383101362411723454.g();
                    return null;
                }
                F14219584781620110682 f14219584781620110682R = R(j96385799670569487992, i2);
                F14219584781620110682 f142195847816201106822 = f14219584781620110682R != f14219584781620110682 ? f14219584781620110682R : null;
                return f142195847816201106822 == null ? Q(j96385799670569487992, i2) : f142195847816201106822;
            }
        }
        return f14219584781620110682;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01bd A[PHI: r16
      0x01bd: PHI (r16v2 dev.epro.r0.D389890677992184566) = 
      (r16v1 dev.epro.r0.D389890677992184566)
      (r16v1 dev.epro.r0.D389890677992184566)
      (r16v1 dev.epro.r0.D389890677992184566)
      (r16v4 dev.epro.r0.D389890677992184566)
     binds: [B:95:0x016c, B:97:0x0172, B:99:0x0176, B:116:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0264 A[ADDED_TO_REGION, LOOP:9: B:161:0x0264->B:168:0x0276, LOOP_START, PHI: r14
      0x0264: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:160:0x0262, B:168:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean S(dev.epro.r0.J9638579967056948799 r22) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V12319504402545346730.S(dev.epro.r0.J9638579967056948799):boolean");
    }

    public static final boolean T(J9638579967056948799 j9638579967056948799, boolean z) {
        int iOrdinal = j9638579967056948799.m1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                J9638579967056948799 j9638579967056948799V = B11964701839924937722.v(j9638579967056948799);
                if (!(j9638579967056948799V != null ? T(j9638579967056948799V, z) : true)) {
                    return false;
                }
                j9638579967056948799.i1(H12838525957287096428.b, H12838525957287096428.c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                Z3383101362411723454.g();
                return false;
            }
        }
        return true;
    }

    public static byte[] U(ByteBuffer byteBuffer) throws C15632080896631311437 {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new C15632080896631311437("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbQ = E12098517352909843120.q(i2, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbQ.append(byteBuffer.remaining());
        throw new C15632080896631311437(sbQ.toString());
    }

    public static final K17800626310660218320 V(int i2, int i3, M3727281027331139839 m3727281027331139839) {
        byte b2 = 1;
        boolean z = (i3 & 4) != 0;
        Object systemService = ((Context) m3727281027331139839.j(T15795698139970521497.b)).getSystemService("accessibility");
        systemService.getClass();
        Object obj = (AccessibilityManager) systemService;
        boolean z2 = ((((i2 & 896) ^ 384) > 256 && m3727281027331139839.g(z)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && m3727281027331139839.g(true)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && m3727281027331139839.g(true)) || (i2 & 48) == 32);
        Object objM = m3727281027331139839.M();
        Object obj2 = O9023047933786425027.a;
        if (z2 || objM == obj2) {
            objM = new K17800626310660218320(true, true, z);
            m3727281027331139839.k0(objM);
        }
        K17800626310660218320 k17800626310660218320 = (K17800626310660218320) objM;
        I4293432593871965076 i4293432593871965076 = (I4293432593871965076) m3727281027331139839.j(G7911722858908282497.a);
        boolean zF = m3727281027331139839.f(k17800626310660218320) | m3727281027331139839.h(obj);
        Object objM2 = m3727281027331139839.M();
        if (zF || objM2 == obj2) {
            objM2 = new J7403353095371830496(k17800626310660218320, obj, (byte) 1);
            m3727281027331139839.k0(objM2);
        }
        F4096073349764486348 f4096073349764486348 = (F4096073349764486348) objM2;
        boolean zF2 = m3727281027331139839.f(k17800626310660218320) | m3727281027331139839.h(obj);
        Object objM3 = m3727281027331139839.M();
        if (zF2 || objM3 == obj2) {
            objM3 = new D16945471218061474327(k17800626310660218320, obj, b2);
            m3727281027331139839.k0(objM3);
        }
        h(i4293432593871965076, f4096073349764486348, (B13729205492206812220) objM3, m3727281027331139839, 0);
        return k17800626310660218320;
    }

    public static final void W(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static void X(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException(G6547577305291411977.s(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        S10823041268949770285.Y(classCastException, V12319504402545346730.class.getName());
        throw classCastException;
    }

    public static String Y(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b2 & 255) >>> 4]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }

    public static final I1722681268793429505 Z(I1722681268793429505 i1722681268793429505) {
        return i1722681268793429505.Q0(new E2661545366736973464());
    }

    public static final void a(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, boolean z) {
        int i3;
        m3727281027331139839.b0(-1339183247);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(b13729205492206812220) ? 32 : 16;
        }
        byte b2 = 1;
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            V933048422416352811.a(i3 & 126, b13729205492206812220, m3727281027331139839, z);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L16103462714845531774(z, b13729205492206812220, i2, b2);
        }
    }

    public static final native void b(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void c(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, V1619459738679112388 v1619459738679112388, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void d(Integer num, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void e(String str, String str2, String str3, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final dev.epro.r0.T15443218846549482730 r19, final dev.epro.r0.I1722681268793429505 r20, final dev.epro.r0.L12639328004344855510 r21, final dev.epro.r0.L12639328004344855510 r22, final dev.epro.r0.L12639328004344855510 r23, dev.epro.r0.F8210508957313086522 r24, dev.epro.r0.M3727281027331139839 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V12319504402545346730.f(dev.epro.r0.T15443218846549482730, dev.epro.r0.I1722681268793429505, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.F8210508957313086522, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    private static native int fgicubcgndyb(Object[] objArr);

    public static final void g(L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, T15443218846549482730 t15443218846549482730, L12639328004344855510 l126393280043448555103, L12639328004344855510 l126393280043448555104, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-61277522);
        int i3 = i2 | (m3727281027331139839.h(l12639328004344855510) ? 4 : 2) | (m3727281027331139839.h(l126393280043448555102) ? 32 : 16) | (m3727281027331139839.h(l126393280043448555103) ? 2048 : 1024) | (m3727281027331139839.h(l126393280043448555104) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192);
        if (m3727281027331139839.R(i3 & 1, (i3 & 9363) != 9362)) {
            Object objM = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (objM == e17149812035295265804) {
                objM = new I6673259844656778358();
                m3727281027331139839.k0(objM);
            }
            I6673259844656778358 i6673259844656778358 = (I6673259844656778358) objM;
            T15443218846549482730 t154432188465494827302 = new T15443218846549482730(1271844412, true, new Q5257107720850990263(K5751602218013079365.V(t15443218846549482730, l126393280043448555103 == null ? N217661258219947885.a : l126393280043448555103, l126393280043448555104 == null ? N217661258219947885.b : l126393280043448555104, l12639328004344855510 == null ? N217661258219947885.c : l12639328004344855510, l126393280043448555102 == null ? N217661258219947885.d : l126393280043448555102), (byte) 1));
            Object objM2 = m3727281027331139839.M();
            if (objM2 == e17149812035295265804) {
                objM2 = new R2492025055202319332(i6673259844656778358);
                m3727281027331139839.k0(objM2);
            }
            A10838822263452390785 a10838822263452390785 = (A10838822263452390785) objM2;
            int iA = E12775674050813925581.A(m3727281027331139839);
            P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            I1722681268793429505 i1722681268793429505N = N(m3727281027331139839, V10993962107938880611.a);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
            if (m3727281027331139839.S || !S10823041268949770285.t(m3727281027331139839.M(), Integer.valueOf(iA))) {
                L11610354117192841236.t(iA, m3727281027331139839, iA, x4712621039624176170);
            }
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            G11450220448113054352.m(0, t154432188465494827302, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new G989519692541748422(l12639328004344855510, l126393280043448555102, t15443218846549482730, l126393280043448555103, l126393280043448555104, i2, (byte) 3);
        }
    }

    public static final void h(I4293432593871965076 i4293432593871965076, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-1868327245);
        int i3 = (m3727281027331139839.h(i4293432593871965076) ? 4 : 2) | i2 | (m3727281027331139839.h(f4096073349764486348) ? 32 : 16) | (m3727281027331139839.h(b13729205492206812220) ? 256 : 128);
        byte b2 = 1;
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = ((i3 & 112) == 32) | m3727281027331139839.h(i4293432593871965076) | ((i3 & 896) == 256);
            Object objM = m3727281027331139839.M();
            if (zH || objM == O9023047933786425027.a) {
                objM = new C2148711509933735908(i4293432593871965076, f4096073349764486348, b13729205492206812220, b2);
                m3727281027331139839.k0(objM);
            }
            Q13169198992966610970.c(i4293432593871965076, (F4096073349764486348) objM, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new B7025542336834056064(i4293432593871965076, f4096073349764486348, b13729205492206812220, i2, (byte) 1);
        }
    }

    public static final native void i(int i2, X11638668447546090163 x11638668447546090163, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, boolean z, boolean z2, boolean z3);

    public static final void j(long j2, D4961612090878789022 d4961612090878789022, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2) {
        long j3;
        M3727281027331139839 m37272810273311398392;
        L12639328004344855510 l126393280043448555102;
        m3727281027331139839.b0(-285397024);
        int i3 = (m3727281027331139839.e(j2) ? 4 : 2) | i2 | (m3727281027331139839.h(l12639328004344855510) ? 256 : 128);
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            j3 = j2;
            m37272810273311398392 = m3727281027331139839;
            D1286559660607336098.l(j3, V6937487778750555249.a(d4961612090878789022, m3727281027331139839), l12639328004344855510, m37272810273311398392, i3 & 910);
            l126393280043448555102 = l12639328004344855510;
        } else {
            j3 = j2;
            m37272810273311398392 = m3727281027331139839;
            l126393280043448555102 = l12639328004344855510;
            m37272810273311398392.U();
        }
        V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new W11960369145683084416(j3, d4961612090878789022, l126393280043448555102, i2);
        }
    }

    public static final native void k(I1722681268793429505 i1722681268793429505, int i2, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final native void l(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(boolean z, boolean z2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(String str, boolean z, String str2, int i2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void o(H9704280198787029462 h9704280198787029462, B631985905119182887 b631985905119182887, G2190230421268324049 g2190230421268324049, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(String str, int i2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void q(D11565319094408363238 d11565319094408363238, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static Map r(Object obj) {
        if ((obj instanceof D14639766352081121636) && !(obj instanceof Z39764727109350747)) {
            X("kotlin.collections.MutableMap", obj);
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            S10823041268949770285.Y(e2, V12319504402545346730.class.getName());
            throw e2;
        }
    }

    public static void s(int i2, Object obj) {
        if (obj == null || K(i2, obj)) {
            return;
        }
        X("kotlin.jvm.functions.Function" + i2, obj);
        throw null;
    }

    public static final S6349823729575121924 t(B1029012102904255937 b1029012102904255937) {
        B1029012102904255937 b1029012102904255937L = b1029012102904255937.l();
        return b1029012102904255937L != null ? b1029012102904255937L.E(b1029012102904255937, true) : new S6349823729575121924(0.0f, 0.0f, (int) (b1029012102904255937.N() >> 32), (int) (b1029012102904255937.N() & 4294967295L));
    }

    public static final S6349823729575121924 u(B1029012102904255937 b1029012102904255937, boolean z) {
        B1029012102904255937 b1029012102904255937Z = z(b1029012102904255937);
        float fN = (int) (b1029012102904255937Z.N() >> 32);
        float fN2 = (int) (b1029012102904255937Z.N() & 4294967295L);
        S6349823729575121924 s6349823729575121924E = b1029012102904255937Z.E(b1029012102904255937, z);
        float f2 = s6349823729575121924E.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fN) {
                f2 = fN;
            }
        }
        float f3 = s6349823729575121924E.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > fN2) {
                f3 = fN2;
            }
        }
        float f4 = s6349823729575121924E.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= fN) {
                fN = f4;
            }
            f4 = fN;
        }
        float f5 = s6349823729575121924E.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= fN2) {
                fN2 = f6;
            }
            f5 = fN2;
        }
        if (f2 == f4 || f3 == f5) {
            return S6349823729575121924.e;
        }
        long j2 = b1029012102904255937Z.j((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long j3 = b1029012102904255937Z.j((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long j4 = b1029012102904255937Z.j((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        long j5 = b1029012102904255937Z.j((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j4 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        return new S6349823729575121924(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final int v(J4720286603213127984 j4720286603213127984, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int iMax = Math.max(Math.max(I16980768508151520658.j(j2), j4720286603213127984.g0(i7 == 1 ? C12265524002282074474.s : i7 == 2 ? C12265524002282074474.z : C12265524002282074474.w)), Math.max(i2, Math.max(i4 + i5 + i6, i3)) + i8);
        int iH = I16980768508151520658.h(j2);
        return iMax > iH ? iH : iMax;
    }

    public static I1722681268793429505 w(I1722681268793429505 i1722681268793429505, J12078565427869724451 j12078565427869724451) {
        return i1722681268793429505.Q0(new B1165005761624318018(j12078565427869724451));
    }

    public static InputConnection x(InputConnection inputConnection, EditorInfo editorInfo, C2811124483977556747 c2811124483977556747) {
        if (editorInfo == null) {
            Z3383101362411723454.k("editorInfo must be non-null");
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25) {
            return new R18007921776911563033(inputConnection, c2811124483977556747);
        }
        String[] strArr = S2941385686793915703.i;
        if (i2 >= 25) {
            String[] strArr2 = editorInfo.contentMimeTypes;
            if (strArr2 != null) {
                strArr = strArr2;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    strArr = stringArray;
                }
            }
        }
        return strArr.length == 0 ? inputConnection : new J9242706968768691792(inputConnection, c2811124483977556747);
    }

    public static final native M11181104712105445833 y(String str, String str2, long j2);

    public static final B1029012102904255937 z(B1029012102904255937 b1029012102904255937) {
        B1029012102904255937 b10290121029042559372;
        B1029012102904255937 b1029012102904255937L = b1029012102904255937.l();
        while (true) {
            B1029012102904255937 b10290121029042559373 = b1029012102904255937L;
            b10290121029042559372 = b1029012102904255937;
            b1029012102904255937 = b10290121029042559373;
            if (b1029012102904255937 == null) {
                break;
            }
            b1029012102904255937L = b1029012102904255937.l();
        }
        Y4989033692226475498 y4989033692226475498 = b10290121029042559372 instanceof Y4989033692226475498 ? (Y4989033692226475498) b10290121029042559372 : null;
        if (y4989033692226475498 == null) {
            return b10290121029042559372;
        }
        Y4989033692226475498 y49890336922264754982 = y4989033692226475498.w;
        while (true) {
            Y4989033692226475498 y49890336922264754983 = y49890336922264754982;
            Y4989033692226475498 y49890336922264754984 = y4989033692226475498;
            y4989033692226475498 = y49890336922264754983;
            if (y4989033692226475498 == null) {
                return y49890336922264754984;
            }
            y49890336922264754982 = y4989033692226475498.w;
        }
    }
}
