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

/* loaded from: classes3.dex */
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

    /* renamed from: o, reason: collision with root package name */
    public static Z7022156542152740569 f532o;
    public static Z7022156542152740569 p;

    static {
        int fgicubcgndyb;
        izmyclvb.qgayjvbiagej2(432);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                fgicubcgndyb = fgicubcgndyb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (fgicubcgndyb != 0) {
                switch (fgicubcgndyb) {
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

    public static X7650711929610928530 A(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453, int i2) {
        try {
            P11184147566986477297 K = C775827382551829194.K(y12887846282176508602, j13328905385734298453);
            long j2 = K.a;
            B11059234153875532973 b11059234153875532973 = (B11059234153875532973) K.b;
            ByteBuffer b2 = b11059234153875532973.b((int) b11059234153875532973.size(), 0L);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            b2.order(byteOrder);
            if (b2.order() != byteOrder) {
                S10973172697741180971.j("ByteBuffer byte order must be little endian");
                return null;
            }
            int capacity = b2.capacity() - 24;
            if (capacity < 8) {
                S10973172697741180971.j(G6547577305291411977.o(capacity, "end < start: ", " < 8"));
                return null;
            }
            int capacity2 = b2.capacity();
            if (capacity > b2.capacity()) {
                S10973172697741180971.j(E12098517352909843120.l("end > capacity: ", capacity, capacity2, " > "));
                return null;
            }
            int limit = b2.limit();
            int position = b2.position();
            int i3 = 0;
            try {
                b2.position(0);
                b2.limit(capacity);
                b2.position(8);
                ByteBuffer slice = b2.slice();
                slice.order(b2.order());
                while (slice.hasRemaining()) {
                    i3++;
                    if (slice.remaining() < 8) {
                        throw new I14711110190789567685(G6547577305291411977.n(i3, "Insufficient data to read size of APK Signing Block entry #"));
                    }
                    long j3 = slice.getLong();
                    if (j3 < 4 || j3 > 2147483647L) {
                        throw new I14711110190789567685("APK Signing Block entry #" + i3 + " size out of range: " + j3);
                    }
                    int i4 = (int) j3;
                    int position2 = slice.position() + i4;
                    if (i4 > slice.remaining()) {
                        StringBuilder p2 = E12098517352909843120.p(i3, i4, "APK Signing Block entry #", " size out of range: ", ", available: ");
                        p2.append(slice.remaining());
                        throw new I14711110190789567685(p2.toString());
                    }
                    if (slice.getInt() == i2) {
                        return new X7650711929610928530(B(slice, i4 - 4), j2, j13328905385734298453.a, j13328905385734298453.d, j13328905385734298453.e);
                    }
                    slice.position(position2);
                }
                throw new I14711110190789567685(G6547577305291411977.n(i2, "No APK Signature Scheme block in APK Signing Block with ID: "));
            } finally {
                b2.position(0);
                b2.limit(limit);
                b2.position(position);
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
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (i3 < position || i3 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return slice;
        } finally {
            byteBuffer.limit(limit);
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
        Z7022156542152740569 b2 = q17593287602150918564.b();
        m = b2;
        return b2;
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
        Z7022156542152740569 b2 = q17593287602150918564.b();
        n = b2;
        return b2;
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
        Z7022156542152740569 b2 = q17593287602150918564.b();
        f532o = b2;
        return b2;
    }

    public static ByteBuffer G(ByteBuffer byteBuffer) {
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
        StringBuilder q = E12098517352909843120.q(i2, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        q.append(byteBuffer.remaining());
        throw new C15632080896631311437(q.toString());
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

    public static ArrayList I(ArrayList arrayList, int i2, int i3, boolean z) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        byte b2 = 2147483647;
        int i4 = 0;
        while (true) {
            byte b3 = 1;
            if (i4 >= size) {
                if (i2 < b2) {
                    throw new N5580838516609915046(E12098517352909843120.l("Minimum provided signature version ", b2, i2, " > minSdkVersion "));
                }
                if (hashMap.isEmpty()) {
                    throw new N5580838516609915046("No supported signature");
                }
                ArrayList arrayList2 = new ArrayList(hashMap.values());
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
                S10055171720181493248 s100551717201814932482 = (S10055171720181493248) hashMap.get(Integer.valueOf(b4));
                if (s100551717201814932482 != null) {
                    Y16631409940158714280 y166314099401587142802 = s100551717201814932482.a;
                    Y4733161976867834422 y4733161976867834422 = y16631409940158714280.c;
                    Y4733161976867834422 y47331619768678344222 = y166314099401587142802.c;
                    int ordinal = y4733161976867834422.ordinal();
                    if (ordinal == 0) {
                        int ordinal2 = y47331619768678344222.ordinal();
                        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2) {
                            Q11088980322693754445.l("Unknown alg2: ", y47331619768678344222);
                            return null;
                        }
                    } else if (ordinal == 1) {
                        int ordinal3 = y47331619768678344222.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 1) {
                                continue;
                            } else if (ordinal3 != 2) {
                                Q11088980322693754445.l("Unknown alg2: ", y47331619768678344222);
                                return null;
                            }
                        }
                    } else {
                        if (ordinal != 2) {
                            Q11088980322693754445.l("Unknown alg1: ", y4733161976867834422);
                            return null;
                        }
                        int ordinal4 = y47331619768678344222.ordinal();
                        if (ordinal4 != 0) {
                            if (ordinal4 != 1 && ordinal4 != 2) {
                                Q11088980322693754445.l("Unknown alg2: ", y47331619768678344222);
                                return null;
                            }
                        }
                    }
                }
                hashMap.put(Integer.valueOf(b4), s10055171720181493248);
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
        I1722681268793429505 M = M(m3727281027331139839, i1722681268793429505);
        m3727281027331139839.q(false);
        return M;
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
        int ordinal = j9638579967056948799.m1().ordinal();
        F14219584781620110682 f14219584781620110682 = F14219584781620110682.a;
        if (ordinal != 0) {
            F14219584781620110682 f142195847816201106822 = F14219584781620110682.b;
            if (ordinal == 1) {
                J9638579967056948799 v = B11964701839924937722.v(j9638579967056948799);
                if (v == null) {
                    S10973172697741180971.j("ActiveParent with no focused child");
                    return null;
                }
                F14219584781620110682 P = P(v, i2);
                F14219584781620110682 f142195847816201106823 = P != f14219584781620110682 ? P : null;
                if (f142195847816201106823 != null) {
                    return f142195847816201106823;
                }
                if (j9638579967056948799.q) {
                    return f14219584781620110682;
                }
                j9638579967056948799.q = true;
                try {
                    I12008059209901932953 j1 = j9638579967056948799.j1();
                    A2536033623645142779 a2536033623645142779 = new A2536033623645142779(i2);
                    D10236220797215130727 d10236220797215130727 = (D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner();
                    J9638579967056948799 g2 = d10236220797215130727.g();
                    j1.k.invoke(a2536033623645142779);
                    J9638579967056948799 g3 = d10236220797215130727.g();
                    if (!a2536033623645142779.b) {
                        return (g2 == g3 || g3 == null) ? f14219584781620110682 : H10681976249452161517.d == H10681976249452161517.c ? f142195847816201106822 : F14219584781620110682.c;
                    }
                    H10681976249452161517 h10681976249452161517 = H10681976249452161517.b;
                    return f142195847816201106822;
                } finally {
                    j9638579967056948799.q = false;
                }
            }
            if (ordinal == 2) {
                return f142195847816201106822;
            }
            if (ordinal != 3) {
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
                I12008059209901932953 j1 = j9638579967056948799.j1();
                A2536033623645142779 a2536033623645142779 = new A2536033623645142779(i2);
                D10236220797215130727 d10236220797215130727 = (D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner();
                J9638579967056948799 g2 = d10236220797215130727.g();
                j1.j.invoke(a2536033623645142779);
                J9638579967056948799 g3 = d10236220797215130727.g();
                boolean z = a2536033623645142779.b;
                F14219584781620110682 f14219584781620110682 = F14219584781620110682.b;
                if (z) {
                    H10681976249452161517 h10681976249452161517 = H10681976249452161517.b;
                    return f14219584781620110682;
                }
                if (g2 != g3 && g3 != null) {
                    return H10681976249452161517.d == H10681976249452161517.c ? f14219584781620110682 : F14219584781620110682.c;
                }
            } finally {
                j9638579967056948799.r = false;
            }
        }
        return F14219584781620110682.a;
    }

    public static final F14219584781620110682 R(J9638579967056948799 j9638579967056948799, int i2) {
        R15896830329318850690 r15896830329318850690;
        X9608137461199640409 x9608137461199640409;
        int ordinal = j9638579967056948799.m1().ordinal();
        F14219584781620110682 f14219584781620110682 = F14219584781620110682.a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                J9638579967056948799 v = B11964701839924937722.v(j9638579967056948799);
                if (v != null) {
                    return P(v, i2);
                }
                S10973172697741180971.j("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    Z3383101362411723454.g();
                    return null;
                }
                if (!j9638579967056948799.a.n) {
                    P753981624812481271.b("visitAncestors called on an unattached node");
                }
                R15896830329318850690 r158968303293188506902 = j9638579967056948799.a.e;
                H11725168162114556860 R = R7033599853981556291.R(j9638579967056948799);
                loop0: while (true) {
                    if (R == null) {
                        r15896830329318850690 = null;
                        break;
                    }
                    if ((((R15896830329318850690) R.F.g).d & 1024) != 0) {
                        while (r158968303293188506902 != null) {
                            if ((r158968303293188506902.c & 1024) != 0) {
                                r15896830329318850690 = r158968303293188506902;
                                D389890677992184566 d389890677992184566 = null;
                                while (r15896830329318850690 != null) {
                                    if (r15896830329318850690 instanceof J9638579967056948799) {
                                        break loop0;
                                    }
                                    if ((r15896830329318850690.c & 1024) != 0 && (r15896830329318850690 instanceof J2215566372910931965)) {
                                        int i3 = 0;
                                        for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r15896830329318850690).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                            if ((r158968303293188506903.c & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    r15896830329318850690 = r158968303293188506903;
                                                } else {
                                                    if (d389890677992184566 == null) {
                                                        d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                    }
                                                    if (r15896830329318850690 != null) {
                                                        d389890677992184566.b(r15896830329318850690);
                                                        r15896830329318850690 = null;
                                                    }
                                                    d389890677992184566.b(r158968303293188506903);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    r15896830329318850690 = R7033599853981556291.M(d389890677992184566);
                                }
                            }
                            r158968303293188506902 = r158968303293188506902.e;
                        }
                    }
                    R = R.u();
                    r158968303293188506902 = (R == null || (x9608137461199640409 = R.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
                }
                J9638579967056948799 j96385799670569487992 = (J9638579967056948799) r15896830329318850690;
                if (j96385799670569487992 == null) {
                    return f14219584781620110682;
                }
                int ordinal2 = j96385799670569487992.m1().ordinal();
                if (ordinal2 == 0) {
                    return Q(j96385799670569487992, i2);
                }
                if (ordinal2 == 1) {
                    return R(j96385799670569487992, i2);
                }
                if (ordinal2 == 2) {
                    return F14219584781620110682.b;
                }
                if (ordinal2 != 3) {
                    Z3383101362411723454.g();
                    return null;
                }
                F14219584781620110682 R2 = R(j96385799670569487992, i2);
                F14219584781620110682 f142195847816201106822 = R2 != f14219584781620110682 ? R2 : null;
                return f142195847816201106822 == null ? Q(j96385799670569487992, i2) : f142195847816201106822;
            }
        }
        return f14219584781620110682;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v9, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r6v22, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r6v9, types: [dev.epro.r0.R15896830329318850690] */
    public static final boolean S(J9638579967056948799 j9638579967056948799) {
        D389890677992184566 d389890677992184566;
        X9608137461199640409 x9608137461199640409;
        D10236220797215130727 d10236220797215130727;
        boolean z;
        ?? M;
        int i2;
        ?? r5;
        int i3;
        int i4;
        X9608137461199640409 x96081374611996404092;
        D10236220797215130727 d102362207972151307272 = (D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner();
        J9638579967056948799 g2 = d102362207972151307272.g();
        H12838525957287096428 m1 = j9638579967056948799.m1();
        if (g2 == j9638579967056948799) {
            j9638579967056948799.i1(m1, m1);
            return true;
        }
        if ((g2 == null || g2.f321o) && !j9638579967056948799.f321o && !((D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner()).a.H()) {
            return false;
        }
        if (g2 != null) {
            d389890677992184566 = new D389890677992184566(0, new J9638579967056948799[16]);
            if (!g2.a.n) {
                P753981624812481271.b("visitAncestors called on an unattached node");
            }
            R15896830329318850690 r15896830329318850690 = g2.a.e;
            H11725168162114556860 R = R7033599853981556291.R(g2);
            while (R != null) {
                if ((((R15896830329318850690) R.F.g).d & 1024) != 0) {
                    while (r15896830329318850690 != null) {
                        if ((r15896830329318850690.c & 1024) != 0) {
                            R15896830329318850690 r158968303293188506902 = r15896830329318850690;
                            D389890677992184566 d3898906779921845662 = null;
                            while (r158968303293188506902 != null) {
                                if (r158968303293188506902 instanceof J9638579967056948799) {
                                    d389890677992184566.b((J9638579967056948799) r158968303293188506902);
                                } else if ((r158968303293188506902.c & 1024) != 0 && (r158968303293188506902 instanceof J2215566372910931965)) {
                                    int i5 = 0;
                                    for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r158968303293188506902).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                        if ((r158968303293188506903.c & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                r158968303293188506902 = r158968303293188506903;
                                            } else {
                                                if (d3898906779921845662 == null) {
                                                    d3898906779921845662 = new D389890677992184566(0, new R15896830329318850690[16]);
                                                }
                                                if (r158968303293188506902 != null) {
                                                    d3898906779921845662.b(r158968303293188506902);
                                                    r158968303293188506902 = null;
                                                }
                                                d3898906779921845662.b(r158968303293188506903);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                r158968303293188506902 = R7033599853981556291.M(d3898906779921845662);
                            }
                        }
                        r15896830329318850690 = r15896830329318850690.e;
                    }
                }
                R = R.u();
                r15896830329318850690 = (R == null || (x96081374611996404092 = R.F) == null) ? null : (E6101237837392211295) x96081374611996404092.f;
            }
        } else {
            d389890677992184566 = null;
        }
        J9638579967056948799[] j9638579967056948799Arr = new J9638579967056948799[16];
        J9638579967056948799[] j9638579967056948799Arr2 = new J9638579967056948799[16];
        if (!j9638579967056948799.a.n) {
            P753981624812481271.b("visitAncestors called on an unattached node");
        }
        ?? r6 = j9638579967056948799.a.e;
        H11725168162114556860 R2 = R7033599853981556291.R(j9638579967056948799);
        boolean z2 = true;
        int i6 = 0;
        int i7 = 0;
        while (R2 != null) {
            if ((((R15896830329318850690) R2.F.g).d & 1024) != 0) {
                while (r6 != null) {
                    if ((r6.c & 1024) != 0) {
                        J9638579967056948799 j96385799670569487992 = r6;
                        D389890677992184566 d3898906779921845663 = null;
                        while (j96385799670569487992 != null) {
                            if (j96385799670569487992 instanceof J9638579967056948799) {
                                J9638579967056948799 j96385799670569487993 = j96385799670569487992;
                                if (S10823041268949770285.t(d389890677992184566 != null ? Boolean.valueOf(d389890677992184566.l(j96385799670569487993)) : null, Boolean.TRUE)) {
                                    int i8 = i6 + 1;
                                    if (j9638579967056948799Arr.length < i8) {
                                        int length = j9638579967056948799Arr.length;
                                        d10236220797215130727 = d102362207972151307272;
                                        ?? r1 = new Object[Math.max(i8, length * 2)];
                                        i4 = i8;
                                        System.arraycopy(j9638579967056948799Arr, 0, r1, 0, length);
                                        j9638579967056948799Arr = r1;
                                    } else {
                                        d10236220797215130727 = d102362207972151307272;
                                        i4 = i8;
                                    }
                                    j9638579967056948799Arr[i6] = j96385799670569487993;
                                    i6 = i4;
                                } else {
                                    d10236220797215130727 = d102362207972151307272;
                                    int i9 = i7 + 1;
                                    if (j9638579967056948799Arr2.length < i9) {
                                        int length2 = j9638579967056948799Arr2.length;
                                        ?? r52 = new Object[Math.max(i9, length2 * 2)];
                                        i3 = i9;
                                        System.arraycopy(j9638579967056948799Arr2, 0, r52, 0, length2);
                                        j9638579967056948799Arr2 = r52;
                                    } else {
                                        i3 = i9;
                                    }
                                    j9638579967056948799Arr2[i7] = j96385799670569487993;
                                    i7 = i3;
                                }
                                if (j96385799670569487993 == g2) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                d10236220797215130727 = d102362207972151307272;
                                z = true;
                            }
                            if (z && (j96385799670569487992.c & 1024) != 0 && (j96385799670569487992 instanceof J2215566372910931965)) {
                                R15896830329318850690 r158968303293188506904 = ((J2215566372910931965) j96385799670569487992).p;
                                int i10 = 0;
                                M = j96385799670569487992;
                                while (r158968303293188506904 != null) {
                                    if ((r158968303293188506904.c & 1024) != 0) {
                                        int i11 = i10 + 1;
                                        if (i11 == 1) {
                                            M = r158968303293188506904;
                                            i2 = i11;
                                        } else {
                                            if (d3898906779921845663 == null) {
                                                i2 = i11;
                                                r5 = new D389890677992184566(0, new R15896830329318850690[16]);
                                            } else {
                                                i2 = i11;
                                                r5 = d3898906779921845663;
                                            }
                                            if (M != 0) {
                                                r5.b(M);
                                                M = 0;
                                            }
                                            r5.b(r158968303293188506904);
                                            d3898906779921845663 = r5;
                                            M = M;
                                        }
                                        i10 = i2;
                                    }
                                    r158968303293188506904 = r158968303293188506904.f;
                                    M = M;
                                }
                                if (i10 == 1) {
                                    d102362207972151307272 = d10236220797215130727;
                                    j96385799670569487992 = M;
                                }
                            }
                            M = R7033599853981556291.M(d3898906779921845663);
                            d102362207972151307272 = d10236220797215130727;
                            j96385799670569487992 = M;
                        }
                    }
                    r6 = r6.e;
                    d102362207972151307272 = d102362207972151307272;
                }
            }
            D10236220797215130727 d102362207972151307273 = d102362207972151307272;
            R2 = R2.u();
            r6 = (R2 == null || (x9608137461199640409 = R2.F) == null) ? null : (E6101237837392211295) x9608137461199640409.f;
            d102362207972151307272 = d102362207972151307273;
        }
        D10236220797215130727 d102362207972151307274 = d102362207972151307272;
        if (!z2 || g2 == null || T(g2, false)) {
            I3887072968740112330.D(j9638579967056948799, new S464754454553842217(j9638579967056948799, (byte) 27));
            int ordinal = j9638579967056948799.m1().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            Z3383101362411723454.g();
                            return false;
                        }
                    }
                }
                ((D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner()).j(j9638579967056948799);
            }
            H12838525957287096428 h12838525957287096428 = H12838525957287096428.c;
            H12838525957287096428 h128385259572870964282 = H12838525957287096428.a;
            if (z2 && g2 != null) {
                g2.i1(h128385259572870964282, h12838525957287096428);
            }
            H12838525957287096428 h128385259572870964283 = H12838525957287096428.b;
            if (d389890677992184566 != null) {
                int i12 = d389890677992184566.c - 1;
                Object[] objArr = d389890677992184566.a;
                if (i12 < objArr.length) {
                    while (i12 >= 0) {
                        J9638579967056948799 j96385799670569487994 = (J9638579967056948799) objArr[i12];
                        if (d102362207972151307274.g() != j9638579967056948799) {
                            break;
                        }
                        j96385799670569487994.i1(h128385259572870964283, h12838525957287096428);
                        i12--;
                    }
                }
            }
            int i13 = i7 - 1;
            if (i13 < j9638579967056948799Arr2.length) {
                while (i13 >= 0) {
                    J9638579967056948799 j96385799670569487995 = j9638579967056948799Arr2[i13];
                    if (d102362207972151307274.g() != j9638579967056948799) {
                        break;
                    }
                    j96385799670569487995.i1(j96385799670569487995 == g2 ? h128385259572870964282 : h12838525957287096428, h128385259572870964283);
                    i13--;
                }
            }
            if (d102362207972151307274.g() == j9638579967056948799) {
                j9638579967056948799.i1(m1, h128385259572870964282);
                if (d102362207972151307274.g() != j9638579967056948799) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean T(J9638579967056948799 j9638579967056948799, boolean z) {
        int ordinal = j9638579967056948799.m1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                J9638579967056948799 v = B11964701839924937722.v(j9638579967056948799);
                if (!(v != null ? T(v, z) : true)) {
                    return false;
                }
                j9638579967056948799.i1(H12838525957287096428.b, H12838525957287096428.c);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                Z3383101362411723454.g();
                return false;
            }
        }
        return true;
    }

    public static byte[] U(ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new C15632080896631311437("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder q = E12098517352909843120.q(i2, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        q.append(byteBuffer.remaining());
        throw new C15632080896631311437(q.toString());
    }

    public static final K17800626310660218320 V(int i2, int i3, M3727281027331139839 m3727281027331139839) {
        byte b2 = 1;
        boolean z = (i3 & 4) != 0;
        Object systemService = ((Context) m3727281027331139839.j(T15795698139970521497.b)).getSystemService("accessibility");
        systemService.getClass();
        Object obj = (AccessibilityManager) systemService;
        boolean z2 = ((((i2 & 896) ^ 384) > 256 && m3727281027331139839.g(z)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && m3727281027331139839.g(true)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && m3727281027331139839.g(true)) || (i2 & 48) == 32);
        Object M = m3727281027331139839.M();
        Object obj2 = O9023047933786425027.a;
        if (z2 || M == obj2) {
            M = new K17800626310660218320(true, true, z);
            m3727281027331139839.k0(M);
        }
        K17800626310660218320 k17800626310660218320 = (K17800626310660218320) M;
        I4293432593871965076 i4293432593871965076 = (I4293432593871965076) m3727281027331139839.j(G7911722858908282497.a);
        boolean f2 = m3727281027331139839.f(k17800626310660218320) | m3727281027331139839.h(obj);
        Object M2 = m3727281027331139839.M();
        if (f2 || M2 == obj2) {
            M2 = new J7403353095371830496(k17800626310660218320, obj, (byte) 1);
            m3727281027331139839.k0(M2);
        }
        F4096073349764486348 f4096073349764486348 = (F4096073349764486348) M2;
        boolean f3 = m3727281027331139839.f(k17800626310660218320) | m3727281027331139839.h(obj);
        Object M3 = m3727281027331139839.M();
        if (f3 || M3 == obj2) {
            M3 = new D16945471218061474327(k17800626310660218320, obj, b2);
            m3727281027331139839.k0(M3);
        }
        h(i4293432593871965076, f4096073349764486348, (B13729205492206812220) M3, m3727281027331139839, 0);
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
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new L16103462714845531774(z, b13729205492206812220, i2, b2);
        }
    }

    public static final native void b(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void c(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, V1619459738679112388 v1619459738679112388, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void d(Integer num, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void e(String str, String str2, String str3, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final dev.epro.r0.T15443218846549482730 r19, final dev.epro.r0.I1722681268793429505 r20, final dev.epro.r0.L12639328004344855510 r21, final dev.epro.r0.L12639328004344855510 r22, final dev.epro.r0.L12639328004344855510 r23, dev.epro.r0.F8210508957313086522 r24, dev.epro.r0.M3727281027331139839 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V12319504402545346730.f(dev.epro.r0.T15443218846549482730, dev.epro.r0.I1722681268793429505, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.F8210508957313086522, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    private static native int fgicubcgndyb(Object[] objArr);

    public static final void g(L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, T15443218846549482730 t15443218846549482730, L12639328004344855510 l126393280043448555103, L12639328004344855510 l126393280043448555104, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-61277522);
        int i3 = i2 | (m3727281027331139839.h(l12639328004344855510) ? 4 : 2) | (m3727281027331139839.h(l126393280043448555102) ? 32 : 16) | (m3727281027331139839.h(l126393280043448555103) ? 2048 : 1024) | (m3727281027331139839.h(l126393280043448555104) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192);
        if (m3727281027331139839.R(i3 & 1, (i3 & 9363) != 9362)) {
            Object M = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (M == e17149812035295265804) {
                M = new I6673259844656778358();
                m3727281027331139839.k0(M);
            }
            I6673259844656778358 i6673259844656778358 = (I6673259844656778358) M;
            T15443218846549482730 t154432188465494827302 = new T15443218846549482730(1271844412, true, new Q5257107720850990263(K5751602218013079365.V(t15443218846549482730, l126393280043448555103 == null ? N217661258219947885.a : l126393280043448555103, l126393280043448555104 == null ? N217661258219947885.b : l126393280043448555104, l12639328004344855510 == null ? N217661258219947885.c : l12639328004344855510, l126393280043448555102 == null ? N217661258219947885.d : l126393280043448555102), (byte) 1));
            Object M2 = m3727281027331139839.M();
            if (M2 == e17149812035295265804) {
                M2 = new R2492025055202319332(i6673259844656778358);
                m3727281027331139839.k0(M2);
            }
            A10838822263452390785 a10838822263452390785 = (A10838822263452390785) M2;
            int A = E12775674050813925581.A(m3727281027331139839);
            P3648740535677465818 l2 = m3727281027331139839.l();
            I1722681268793429505 N = N(m3727281027331139839, V10993962107938880611.a);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, l2);
            X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
            if (m3727281027331139839.S || !S10823041268949770285.t(m3727281027331139839.M(), Integer.valueOf(A))) {
                L11610354117192841236.t(A, m3727281027331139839, A, x4712621039624176170);
            }
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, N);
            G11450220448113054352.m(0, t154432188465494827302, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new G989519692541748422(l12639328004344855510, l126393280043448555102, t15443218846549482730, l126393280043448555103, l126393280043448555104, i2, (byte) 3);
        }
    }

    public static final void h(I4293432593871965076 i4293432593871965076, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-1868327245);
        int i3 = (m3727281027331139839.h(i4293432593871965076) ? 4 : 2) | i2 | (m3727281027331139839.h(f4096073349764486348) ? 32 : 16) | (m3727281027331139839.h(b13729205492206812220) ? 256 : 128);
        byte b2 = 1;
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            boolean h2 = ((i3 & 112) == 32) | m3727281027331139839.h(i4293432593871965076) | ((i3 & 896) == 256);
            Object M = m3727281027331139839.M();
            if (h2 || M == O9023047933786425027.a) {
                M = new C2148711509933735908(i4293432593871965076, f4096073349764486348, b13729205492206812220, b2);
                m3727281027331139839.k0(M);
            }
            Q13169198992966610970.c(i4293432593871965076, (F4096073349764486348) M, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new B7025542336834056064(i4293432593871965076, f4096073349764486348, b13729205492206812220, i2, (byte) 1);
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
        V4878375136513573151 t = m37272810273311398392.t();
        if (t != null) {
            t.d = new W11960369145683084416(j3, d4961612090878789022, l126393280043448555102, i2);
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
        B1029012102904255937 l2 = b1029012102904255937.l();
        return l2 != null ? l2.E(b1029012102904255937, true) : new S6349823729575121924(0.0f, 0.0f, (int) (b1029012102904255937.N() >> 32), (int) (b1029012102904255937.N() & 4294967295L));
    }

    public static final S6349823729575121924 u(B1029012102904255937 b1029012102904255937, boolean z) {
        B1029012102904255937 z2 = z(b1029012102904255937);
        float N = (int) (z2.N() >> 32);
        float N2 = (int) (z2.N() & 4294967295L);
        S6349823729575121924 E = z2.E(b1029012102904255937, z);
        float f2 = E.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > N) {
                f2 = N;
            }
        }
        float f3 = E.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > N2) {
                f3 = N2;
            }
        }
        float f4 = E.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= N) {
                N = f4;
            }
            f4 = N;
        }
        float f5 = E.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= N2) {
                N2 = f6;
            }
            f5 = N2;
        }
        if (f2 == f4 || f3 == f5) {
            return S6349823729575121924.e;
        }
        long j2 = z2.j((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long j3 = z2.j((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long j4 = z2.j((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        long j5 = z2.j((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        return new S6349823729575121924(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final int v(J4720286603213127984 j4720286603213127984, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int max = Math.max(Math.max(I16980768508151520658.j(j2), j4720286603213127984.g0(i7 == 1 ? C12265524002282074474.s : i7 == 2 ? C12265524002282074474.z : C12265524002282074474.w)), Math.max(i2, Math.max(i4 + i5 + i6, i3)) + i8);
        int h2 = I16980768508151520658.h(j2);
        return max > h2 ? h2 : max;
    }

    public static I1722681268793429505 w(I1722681268793429505 i1722681268793429505, J12078565427869724451 j12078565427869724451) {
        return i1722681268793429505.Q0(new B1165005761624318018(j12078565427869724451));
    }

    public static InputConnection x(InputConnection inputConnection, EditorInfo editorInfo, C2811124483977556747 c2811124483977556747) {
        String[] strArr;
        if (editorInfo == null) {
            Z3383101362411723454.k("editorInfo must be non-null");
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25) {
            return new R18007921776911563033(inputConnection, c2811124483977556747);
        }
        String[] strArr2 = S2941385686793915703.i;
        if (i2 >= 25) {
            strArr = editorInfo.contentMimeTypes;
            if (strArr != null) {
                strArr2 = strArr;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    strArr2 = stringArray;
                }
            }
        }
        return strArr2.length == 0 ? inputConnection : new J9242706968768691792(inputConnection, c2811124483977556747);
    }

    public static final native M11181104712105445833 y(String str, String str2, long j2);

    public static final B1029012102904255937 z(B1029012102904255937 b1029012102904255937) {
        B1029012102904255937 b10290121029042559372;
        B1029012102904255937 l2 = b1029012102904255937.l();
        while (true) {
            B1029012102904255937 b10290121029042559373 = l2;
            b10290121029042559372 = b1029012102904255937;
            b1029012102904255937 = b10290121029042559373;
            if (b1029012102904255937 == null) {
                break;
            }
            l2 = b1029012102904255937.l();
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
