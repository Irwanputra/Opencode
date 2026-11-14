package dev.epro.r0;

import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.View;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q7316561721656982910 implements U2582504393267961583, L6498280162989651404, S4170173850086311843 {
    public static volatile Q7316561721656982910 e;
    public static final Object f = new Object();
    public static final Q7316561721656982910 g;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    static {
        Object obj = null;
        g = new Q7316561721656982910(obj, obj, obj, (byte) 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Q7316561721656982910(byte b) {
        this((Object) new long[10], (Object) new long[10], (Object) new long[10], (byte) 19);
        this.a = b;
        switch (b) {
            case 9:
                C10671975960037781546 c10671975960037781546 = new C10671975960037781546();
                c10671975960037781546.a = Float.NaN;
                this.b = c10671975960037781546;
                this.c = new B7031457345664936219();
                break;
            case 17:
                this.b = new F6942723054099263096((byte) 1);
                this.c = new F6942723054099263096((byte) 1);
                this.d = new F6942723054099263096((byte) 1);
                break;
            case 19:
                break;
            case 21:
                this.b = new A4559761392562572984();
                break;
            default:
                this.d = new P5733283974459951585((byte) 1);
                break;
        }
    }

    public static Q7316561721656982910 D(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new Q7316561721656982910(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G(dev.epro.r0.G10370325506019749574 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q7316561721656982910.G(dev.epro.r0.G10370325506019749574, android.text.Editable, int, int, boolean):boolean");
    }

    public static Q7316561721656982910 u(Q7316561721656982910 q7316561721656982910, Y4989033692226475498 y4989033692226475498, Q17957571128037780363 q17957571128037780363, U11129743795775183256 u11129743795775183256, int i) {
        B1029012102904255937 b1029012102904255937 = y4989033692226475498;
        if ((i & 1) != 0) {
            b1029012102904255937 = (B1029012102904255937) q7316561721656982910.b;
        }
        if ((i & 2) != 0) {
            q17957571128037780363 = (Q17957571128037780363) q7316561721656982910.c;
        }
        if ((i & 4) != 0) {
            u11129743795775183256 = (U11129743795775183256) q7316561721656982910.d;
        }
        q7316561721656982910.getClass();
        return new Q7316561721656982910((Object) b1029012102904255937, (Object) q17957571128037780363, (Object) u11129743795775183256, (byte) 1);
    }

    public static boolean v(Editable editable, KeyEvent keyEvent, boolean z) {
        A7769137806217985202[] a7769137806217985202Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (a7769137806217985202Arr = (A7769137806217985202[]) editable.getSpans(selectionStart, selectionEnd, A7769137806217985202.class)) != null && a7769137806217985202Arr.length > 0) {
                for (A7769137806217985202 a7769137806217985202 : a7769137806217985202Arr) {
                    int spanStart = editable.getSpanStart(a7769137806217985202);
                    int spanEnd = editable.getSpanEnd(a7769137806217985202);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void z(Q7316561721656982910 q7316561721656982910, D2456187031834883815 d2456187031834883815) {
        long[] jArr = (long[]) q7316561721656982910.b;
        Q7316561721656982910 q73165617216569829102 = d2456187031834883815.a;
        long[] jArr2 = (long[]) q73165617216569829102.b;
        long[] jArr3 = d2456187031834883815.b;
        O4077903568229246.E(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) q7316561721656982910.c;
        long[] jArr5 = (long[]) q73165617216569829102.c;
        long[] jArr6 = (long[]) q73165617216569829102.d;
        O4077903568229246.E(jArr4, jArr5, jArr6);
        O4077903568229246.E((long[]) q7316561721656982910.d, jArr6, jArr3);
    }

    public V1715405128288489768 A() {
        return ((N16536369055082677148) this.d).a.c;
    }

    public A5535629440393075509 B() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((P5733283974459951585) this.d)) {
            try {
                A5535629440393075509 a5535629440393075509 = (A5535629440393075509) this.c;
                if (a5535629440393075509 != null && localeList == ((LocaleList) this.b)) {
                    return a5535629440393075509;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new L6737218101458117862(localeList.get(i)));
                }
                A5535629440393075509 a55356294403930755092 = new A5535629440393075509(arrayList);
                this.b = localeList;
                this.c = a55356294403930755092;
                return a55356294403930755092;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public R8540738700654750557 C() {
        return ((N16536369055082677148) this.d).a.a;
    }

    public F10342546226345611902 E() {
        return ((N16536369055082677148) this.d).a.b;
    }

    public long F() {
        return ((N16536369055082677148) this.d).a.d;
    }

    public boolean H(CharSequence charSequence, int i, int i2, D14027398382627356533 d14027398382627356533) {
        if ((d14027398382627356533.c & 3) == 0) {
            B466272788290408887 b466272788290408887 = (B466272788290408887) this.d;
            Q5727030208712194095 q5727030208712194095B = d14027398382627356533.b();
            int iA = q5727030208712194095B.a(8);
            if (iA != 0) {
                ((ByteBuffer) q5727030208712194095B.d).getShort(iA + q5727030208712194095B.a);
            }
            b466272788290408887.getClass();
            ThreadLocal threadLocal = B466272788290408887.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = b466272788290408887.a.hasGlyph(sb.toString());
            int i3 = d14027398382627356533.c & 4;
            d14027398382627356533.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (d14027398382627356533.c & 3) == 2;
    }

    public boolean I() {
        return !(((X7482811339048806651) ((F6942723054099263096) this.b).b).isEmpty() && ((X7482811339048806651) ((F6942723054099263096) this.d).b).isEmpty() && ((X7482811339048806651) ((F6942723054099263096) this.c).b).isEmpty());
    }

    public Object J(CharSequence charSequence, int i, int i2, int i3, boolean z, V14977941268796428117 v14977941268796428117) {
        int i4;
        char c;
        D15281958126951222693 d15281958126951222693 = new D15281958126951222693((J5953358054831440945) ((J15730374346044043770) this.c).e);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zG = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zG) {
                J5953358054831440945 j5953358054831440945 = (J5953358054831440945) d15281958126951222693.c.a.get(iCodePointAt);
                if (d15281958126951222693.a == 2) {
                    if (j5953358054831440945 != null) {
                        d15281958126951222693.c = j5953358054831440945;
                        d15281958126951222693.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            d15281958126951222693.a();
                        } else if (iCodePointAt != 65039) {
                            J5953358054831440945 j59533580548314409452 = d15281958126951222693.c;
                            if (j59533580548314409452.b != null) {
                                if (d15281958126951222693.f != 1) {
                                    d15281958126951222693.d = j59533580548314409452;
                                    d15281958126951222693.a();
                                } else if (d15281958126951222693.b()) {
                                    d15281958126951222693.d = d15281958126951222693.c;
                                    d15281958126951222693.a();
                                } else {
                                    d15281958126951222693.a();
                                }
                                c = 3;
                            } else {
                                d15281958126951222693.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (j5953358054831440945 == null) {
                    d15281958126951222693.a();
                    c = 1;
                } else {
                    d15281958126951222693.a = (byte) 2;
                    d15281958126951222693.c = j5953358054831440945;
                    d15281958126951222693.f = 1;
                    c = 2;
                }
                d15281958126951222693.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !H(charSequence, i4, iCharCount, d15281958126951222693.d.b)) {
                        zG = v14977941268796428117.g(charSequence, i4, iCharCount, d15281958126951222693.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (d15281958126951222693.a == 2 && d15281958126951222693.c.b != null && ((d15281958126951222693.f > 1 || d15281958126951222693.b()) && i5 < i3 && zG && (z || !H(charSequence, i4, iCharCount, d15281958126951222693.c.b)))) {
            v14977941268796428117.g(charSequence, i4, iCharCount, d15281958126951222693.c.b);
        }
        return v14977941268796428117.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r4 <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        r6 = java.lang.Math.min(r4, r3.b());
        java.lang.System.arraycopy((byte[]) ((dev.epro.r0.W8455343525638953052) r3.b).b, r3.a, r10, r5, r6);
        r3.a += r6;
        r4 = r4 - r6;
        r5 = r5 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r3.getClass();
        r11 = r11 + r2;
        r12 = r12 - r2;
        r0 = r0 + r2;
        r9.b -= r2;
        r9.a.notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r3 = r9.d;
        r5 = r11;
        r4 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int K(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.Object r9 = r9.c
            dev.epro.r0.R11747310517775341069 r9 = (dev.epro.r0.R11747310517775341069) r9
            r0 = 0
            if (r12 != 0) goto L8
            return r0
        L8:
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
        Lb:
            int r2 = r9.a()     // Catch: java.lang.Throwable -> L4a
            int r2 = java.lang.Math.min(r12, r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 <= 0) goto L4c
            dev.epro.r0.T17032536773975598836 r3 = r9.d     // Catch: java.lang.Throwable -> L4a
            r5 = r11
            r4 = r2
        L19:
            if (r4 <= 0) goto L38
            int r6 = r3.b()     // Catch: java.lang.Throwable -> L4a
            int r6 = java.lang.Math.min(r4, r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r7 = r3.b     // Catch: java.lang.Throwable -> L4a
            dev.epro.r0.W8455343525638953052 r7 = (dev.epro.r0.W8455343525638953052) r7     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r7 = r7.b     // Catch: java.lang.Throwable -> L4a
            byte[] r7 = (byte[]) r7     // Catch: java.lang.Throwable -> L4a
            int r8 = r3.a     // Catch: java.lang.Throwable -> L4a
            java.lang.System.arraycopy(r7, r8, r10, r5, r6)     // Catch: java.lang.Throwable -> L4a
            int r7 = r3.a     // Catch: java.lang.Throwable -> L4a
            int r7 = r7 + r6
            r3.a = r7     // Catch: java.lang.Throwable -> L4a
            int r4 = r4 - r6
            int r5 = r5 + r6
            goto L19
        L38:
            r3.getClass()     // Catch: java.lang.Throwable -> L4a
            int r11 = r11 + r2
            int r12 = r12 - r2
            int r0 = r0 + r2
            int r3 = r9.b     // Catch: java.lang.Throwable -> L4a
            int r3 = r3 - r2
            r9.b = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r9.a     // Catch: java.lang.Throwable -> L4a
            r2.notifyAll()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            goto L8
        L4a:
            r9 = move-exception
            goto L6c
        L4c:
            if (r0 <= 0) goto L50
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return r0
        L50:
            boolean r2 = r9.f     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L64
            if (r2 == 0) goto L61
            int r10 = r9.a()     // Catch: java.lang.Throwable -> L4a
            if (r10 != 0) goto L61
            r10 = 0
            r9.e = r10     // Catch: java.lang.Throwable -> L4a
            r9.d = r10     // Catch: java.lang.Throwable -> L4a
        L61:
            r9 = -1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return r9
        L64:
            java.lang.Object r2 = r9.a     // Catch: java.lang.Throwable -> L4a
            long r3 = dev.epro.r0.R11747310517775341069.g     // Catch: java.lang.Throwable -> L4a
            r2.wait(r3)     // Catch: java.lang.Throwable -> L4a
            goto Lb
        L6c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q7316561721656982910.K(byte[], int, int):int");
    }

    public void L(V1715405128288489768 v1715405128288489768) {
        ((N16536369055082677148) this.d).a.c = v1715405128288489768;
    }

    public void M(R8540738700654750557 r8540738700654750557) {
        ((N16536369055082677148) this.d).a.a = r8540738700654750557;
    }

    public void N(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.b = Integer.valueOf(i);
    }

    public void O(F10342546226345611902 f10342546226345611902) {
        ((N16536369055082677148) this.d).a.b = f10342546226345611902;
    }

    public void P(long j) {
        ((N16536369055082677148) this.d).a.d = j;
    }

    public void Q(int i) throws GeneralSecurityException {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(G6547577305291411977.n(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.c = Integer.valueOf(i);
    }

    public byte[] R() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        O4077903568229246.w(jArr, (long[]) this.d);
        O4077903568229246.E(jArr2, (long[]) this.b, jArr);
        O4077903568229246.E(jArr3, (long[]) this.c, jArr);
        byte[] bArrL = O4077903568229246.l(jArr3);
        bArrL[31] = (byte) (bArrL[31] ^ ((O4077903568229246.l(jArr2)[0] & 1) << 7));
        return bArrL;
    }

    public void S() {
        synchronized (this) {
            ((AtomicInteger) this.c).decrementAndGet();
            if (((AtomicInteger) this.c).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // dev.epro.r0.S4170173850086311843
    public Object a() {
        return null;
    }

    @Override // dev.epro.r0.S4170173850086311843
    public Uri b() {
        return (Uri) this.b;
    }

    @Override // dev.epro.r0.L6498280162989651404
    public S7370861580758580261 c() {
        return (T13344602445187831655) this.c;
    }

    @Override // dev.epro.r0.S4170173850086311843
    public Uri e() {
        return (Uri) this.d;
    }

    public void f(H11725168162114556860 h11725168162114556860, J5032171413189498920 j5032171413189498920) {
        F6942723054099263096 f6942723054099263096 = (F6942723054099263096) this.b;
        F6942723054099263096 f69427230540992630962 = (F6942723054099263096) this.c;
        F6942723054099263096 f69427230540992630963 = (F6942723054099263096) this.d;
        int iOrdinal = j5032171413189498920.ordinal();
        if (iOrdinal == 0) {
            f6942723054099263096.a(h11725168162114556860);
            f69427230540992630963.a(h11725168162114556860);
            return;
        }
        if (iOrdinal == 1) {
            f69427230540992630962.a(h11725168162114556860);
            f69427230540992630963.a(h11725168162114556860);
            return;
        }
        if (iOrdinal == 2) {
            if (h11725168162114556860.h != null) {
                f69427230540992630963.a(h11725168162114556860);
                return;
            } else {
                f6942723054099263096.a(h11725168162114556860);
                return;
            }
        }
        if (iOrdinal != 3) {
            Z3383101362411723454.g();
        } else if (h11725168162114556860.h != null) {
            f69427230540992630963.a(h11725168162114556860);
        } else {
            f69427230540992630962.a(h11725168162114556860);
        }
    }

    public boolean g() {
        synchronized (this) {
            if (((AtomicBoolean) this.d).get()) {
                return false;
            }
            ((AtomicInteger) this.c).incrementAndGet();
            return true;
        }
    }

    @Override // dev.epro.r0.S4170173850086311843
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    public D900858212461245428 h() throws GeneralSecurityException {
        M9197813449740923653 m9197813449740923653;
        J4250663911053539605 j4250663911053539605A;
        J4075899935222861919 j4075899935222861919 = (J4075899935222861919) this.b;
        if (j4075899935222861919 == null || (m9197813449740923653 = (M9197813449740923653) this.c) == null) {
            W4415201450379021245.c("Cannot build without parameters and/or key material");
            return null;
        }
        if (j4075899935222861919.a != ((J4250663911053539605) m9197813449740923653.b).a.length) {
            W4415201450379021245.c("Key size mismatch");
            return null;
        }
        if (j4075899935222861919.a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((J4075899935222861919) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((J4075899935222861919) this.b).c;
        if (d14731132657808549702 == D14731132657808549702.f) {
            j4250663911053539605A = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.e || d14731132657808549702 == D14731132657808549702.d) {
            j4250663911053539605A = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.c) {
                S10973172697741180971.m("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605A = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new D900858212461245428((J4075899935222861919) this.b, (M9197813449740923653) this.c, j4250663911053539605A, (Integer) this.d);
    }

    @Override // dev.epro.r0.L6498280162989651404
    public U10510841700634832156 i() {
        return (L673873344574563461) this.d;
    }

    @Override // dev.epro.r0.U2582504393267961583
    public float j(float f2, float f3) {
        return 0.0f;
    }

    public J4075899935222861919 k() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            W4415201450379021245.c("key size not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            W4415201450379021245.c("tag size not set");
            return null;
        }
        if (((D14731132657808549702) this.d) != null) {
            return new J4075899935222861919(num.intValue(), ((Integer) this.c).intValue(), (D14731132657808549702) this.d);
        }
        W4415201450379021245.c("variant not set");
        return null;
    }

    public B3089877246369334228 l() throws GeneralSecurityException {
        M9197813449740923653 m9197813449740923653;
        J4250663911053539605 j4250663911053539605B;
        W4043777213630942564 w4043777213630942564 = (W4043777213630942564) this.b;
        if (w4043777213630942564 == null || (m9197813449740923653 = (M9197813449740923653) this.c) == null) {
            W4415201450379021245.c("Cannot build without parameters and/or key material");
            return null;
        }
        if (w4043777213630942564.a != ((J4250663911053539605) m9197813449740923653.b).a.length) {
            W4415201450379021245.c("Key size mismatch");
            return null;
        }
        if (w4043777213630942564.a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((W4043777213630942564) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((W4043777213630942564) this.b).d;
        if (d14731132657808549702 == D14731132657808549702.q) {
            j4250663911053539605B = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.p) {
            j4250663911053539605B = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.f196o) {
                S10973172697741180971.m("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605B = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new B3089877246369334228((W4043777213630942564) this.b, (M9197813449740923653) this.c, j4250663911053539605B, (Integer) this.d);
    }

    public W12607600500791010704 m() throws GeneralSecurityException {
        M9197813449740923653 m9197813449740923653;
        J4250663911053539605 j4250663911053539605B;
        T1031997469743650177 t1031997469743650177 = (T1031997469743650177) this.b;
        if (t1031997469743650177 == null || (m9197813449740923653 = (M9197813449740923653) this.c) == null) {
            W4415201450379021245.c("Cannot build without parameters and/or key material");
            return null;
        }
        if (t1031997469743650177.a != ((J4250663911053539605) m9197813449740923653.b).a.length) {
            W4415201450379021245.c("Key size mismatch");
            return null;
        }
        if (t1031997469743650177.a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((T1031997469743650177) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((T1031997469743650177) this.b).d;
        if (d14731132657808549702 == D14731132657808549702.t) {
            j4250663911053539605B = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.s) {
            j4250663911053539605B = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.r) {
                S10973172697741180971.m("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605B = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new W12607600500791010704((T1031997469743650177) this.b, (M9197813449740923653) this.c, j4250663911053539605B, (Integer) this.d);
    }

    public S8155930747170862961 n() throws GeneralSecurityException {
        M9197813449740923653 m9197813449740923653;
        J4250663911053539605 j4250663911053539605B;
        Z14277976092397041931 z14277976092397041931 = (Z14277976092397041931) this.b;
        if (z14277976092397041931 == null || (m9197813449740923653 = (M9197813449740923653) this.c) == null) {
            W4415201450379021245.c("Cannot build without parameters and/or key material");
            return null;
        }
        if (z14277976092397041931.a != ((J4250663911053539605) m9197813449740923653.b).a.length) {
            W4415201450379021245.c("Key size mismatch");
            return null;
        }
        if (z14277976092397041931.a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((Z14277976092397041931) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((Z14277976092397041931) this.b).b;
        if (d14731132657808549702 == D14731132657808549702.w) {
            j4250663911053539605B = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.v) {
            j4250663911053539605B = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.u) {
                S10973172697741180971.m("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605B = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new S8155930747170862961((Z14277976092397041931) this.b, (M9197813449740923653) this.c, j4250663911053539605B, (Integer) this.d);
    }

    public A7792011892930360131 o() {
        J4250663911053539605 j4250663911053539605A;
        O10635330630771259783 o10635330630771259783 = (O10635330630771259783) this.b;
        if (o10635330630771259783 == null) {
            W4415201450379021245.c("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = (ECPoint) this.c;
        if (eCPoint == null) {
            W4415201450379021245.c("Cannot build without public point");
            return null;
        }
        R11362382501444029219.b(eCPoint, o10635330630771259783.b.b.getCurve());
        if (((O10635330630771259783) this.b).a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((O10635330630771259783) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((O10635330630771259783) this.b).d;
        if (d14731132657808549702 == D14731132657808549702.I) {
            j4250663911053539605A = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.H || d14731132657808549702 == D14731132657808549702.G) {
            j4250663911053539605A = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.F) {
                S10973172697741180971.m("Unknown EcdsaParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605A = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new A7792011892930360131((O10635330630771259783) this.b, (ECPoint) this.c, j4250663911053539605A, (Integer) this.d);
    }

    public W13640341017465735251 p() throws GeneralSecurityException {
        M9197813449740923653 m9197813449740923653;
        J4250663911053539605 j4250663911053539605A;
        N13917601494741667358 n13917601494741667358 = (N13917601494741667358) this.b;
        if (n13917601494741667358 == null || (m9197813449740923653 = (M9197813449740923653) this.c) == null) {
            W4415201450379021245.c("Cannot build without parameters and/or key material");
            return null;
        }
        if (n13917601494741667358.a != ((J4250663911053539605) m9197813449740923653.b).a.length) {
            W4415201450379021245.c("Key size mismatch");
            return null;
        }
        if (n13917601494741667358.a() && ((Integer) this.d) == null) {
            W4415201450379021245.c("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((N13917601494741667358) this.b).a() && ((Integer) this.d) != null) {
            W4415201450379021245.c("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        D14731132657808549702 d14731132657808549702 = ((N13917601494741667358) this.b).c;
        if (d14731132657808549702 == D14731132657808549702.Q) {
            j4250663911053539605A = H3219070247167520574.a;
        } else if (d14731132657808549702 == D14731132657808549702.P || d14731132657808549702 == D14731132657808549702.O) {
            j4250663911053539605A = H3219070247167520574.a(((Integer) this.d).intValue());
        } else {
            if (d14731132657808549702 != D14731132657808549702.N) {
                S10973172697741180971.m("Unknown HmacParameters.Variant: ".concat(String.valueOf(d14731132657808549702)));
                return null;
            }
            j4250663911053539605A = H3219070247167520574.b(((Integer) this.d).intValue());
        }
        return new W13640341017465735251((N13917601494741667358) this.b, (M9197813449740923653) this.c, j4250663911053539605A, (Integer) this.d);
    }

    public void q() {
        R16738397873179797797 r16738397873179797797 = (R16738397873179797797) this.c;
        while (true) {
            P17072065560811830427 p17072065560811830427D = r16738397873179797797.a.d();
            if (p17072065560811830427D == null || p17072065560811830427D.b() != 2) {
                return;
            }
            B12876664663422151434 b12876664663422151434 = (B12876664663422151434) p17072065560811830427D;
            for (int i : (int[]) this.d) {
                if (b12876664663422151434.c == i) {
                    break;
                }
            }
            return;
            ((ArrayList) this.b).add(new T4694148009532060969((B12876664663422151434) r16738397873179797797.a.b()));
        }
    }

    public List r() {
        try {
            return (ArrayList) this.b;
        } finally {
            this.b = new ArrayList();
        }
    }

    public boolean s(H11725168162114556860 h11725168162114556860) {
        return !(h11725168162114556860.h == null) && (((X7482811339048806651) ((F6942723054099263096) this.b).b).contains(h11725168162114556860) || ((X7482811339048806651) ((F6942723054099263096) this.c).b).contains(h11725168162114556860));
    }

    @Override // dev.epro.r0.U2582504393267961583
    public float t(float f2) {
        F9886074403848142923 f9886074403848142923 = (F9886074403848142923) this.b;
        float fI = f9886074403848142923.i();
        Object objZ = D15445857918358799638.z(f9886074403848142923.d(), fI, f2, (F4096073349764486348) this.c, (S464754454553842217) this.d);
        if (!((Boolean) f9886074403848142923.b.invoke(objZ)).booleanValue()) {
            objZ = f9886074403848142923.d.getValue();
        }
        return f9886074403848142923.d().c(objZ) - fI;
    }

    public String toString() {
        switch (this.a) {
            case 29:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                V10300877997588547986 v10300877997588547986 = (V10300877997588547986) ((V10300877997588547986) this.c).c;
                String str = "";
                while (v10300877997588547986 != null) {
                    Object obj = v10300877997588547986.b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    v10300877997588547986 = (V10300877997588547986) v10300877997588547986.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void w(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (R4576572296217797762.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    x((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new M8821877208104636290(e2);
            }
        }
    }

    public Object x(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.b;
        if (U8836654130139556418.p()) {
            try {
                Trace.beginSection(U8836654130139556418.B(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                R4576572296217797762 r4576572296217797762 = (R4576572296217797762) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = r4576572296217797762.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            x(cls2, hashSet);
                        }
                    }
                }
                objB = r4576572296217797762.b((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th) {
                throw new M8821877208104636290(th);
            }
        }
        return objB;
    }

    public void y() {
        R11747310517775341069 r11747310517775341069 = (R11747310517775341069) this.c;
        synchronized (r11747310517775341069.a) {
            try {
                if (!r11747310517775341069.f) {
                    r11747310517775341069.f = true;
                    if (r11747310517775341069.a() == 0) {
                        r11747310517775341069.e = null;
                        r11747310517775341069.d = null;
                    }
                    r11747310517775341069.a.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.S4170173850086311843
    public void d() {
    }

    public /* synthetic */ Q7316561721656982910(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ Q7316561721656982910(byte b, boolean z) {
        this.a = b;
    }

    public Q7316561721656982910(J15730374346044043770 j15730374346044043770) {
        this.a = (byte) 10;
        this.b = j15730374346044043770;
        U9281124989019192072 u9281124989019192072 = (U9281124989019192072) j15730374346044043770.e;
        u9281124989019192072.getClass();
        this.c = new T13344602445187831655(u9281124989019192072);
        J3339196104325362891 j3339196104325362891 = (J3339196104325362891) j15730374346044043770.b;
        j3339196104325362891.getClass();
        this.d = new L673873344574563461(j3339196104325362891);
    }

    public Q7316561721656982910(A307398149131398783 a307398149131398783) {
        this.a = (byte) 14;
        this.b = a307398149131398783;
        this.c = new AtomicInteger(0);
        this.d = new AtomicBoolean(false);
    }

    public Q7316561721656982910(X7021780317955852078 x7021780317955852078, int[] iArr) {
        this.a = (byte) 15;
        this.c = new R16738397873179797797(x7021780317955852078);
        this.d = iArr;
        this.b = new ArrayList();
    }

    public Q7316561721656982910(View view) {
        this.a = (byte) 24;
        this.b = view;
        this.c = M9216324016624295870.L(G14718160286012243331.c, new W2269277550458425547(this, (byte) 4));
        this.d = new M9197813449740923653(view);
    }

    public Q7316561721656982910(N16536369055082677148 n16536369055082677148) {
        this.a = (byte) 11;
        this.d = n16536369055082677148;
        this.b = new H12843822278061842084((Object) this, (byte) 16);
    }

    public Q7316561721656982910(Runnable runnable) {
        this.a = (byte) 27;
        this.d = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.c = runnable;
    }

    public Q7316561721656982910(Context context) {
        this.a = (byte) 0;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public Q7316561721656982910(C16667689525325095505 c16667689525325095505) {
        this.a = (byte) 12;
        this.d = c16667689525325095505;
        this.c = new R11747310517775341069(c16667689525325095505, c16667689525325095505.a);
    }

    public Q7316561721656982910(F11625739791267273945 f11625739791267273945, F4673815160636847046 f4673815160636847046, ComponentName componentName) {
        this.a = (byte) 16;
        this.b = new Object();
        this.c = f4673815160636847046;
        this.d = componentName;
    }

    public Q7316561721656982910(Q7316561721656982910 q7316561721656982910) {
        this.a = (byte) 19;
        this.b = Arrays.copyOf((long[]) q7316561721656982910.b, 10);
        this.c = Arrays.copyOf((long[]) q7316561721656982910.c, 10);
        this.d = Arrays.copyOf((long[]) q7316561721656982910.d, 10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Q7316561721656982910(D2456187031834883815 d2456187031834883815) {
        this((byte) 19);
        this.a = (byte) 19;
        z(this, d2456187031834883815);
    }

    public Q7316561721656982910(J15730374346044043770 j15730374346044043770, J3301701597851028733 j3301701597851028733, B466272788290408887 b466272788290408887, Set set) {
        this.a = (byte) 20;
        this.b = j3301701597851028733;
        this.c = j15730374346044043770;
        this.d = b466272788290408887;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            J(str, 0, str.length(), 1, true, new D14731132657808549702(str, (byte) 23));
        }
    }

    public Q7316561721656982910(String str) {
        this.a = (byte) 29;
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986((byte) 5, false);
        this.c = v10300877997588547986;
        this.d = v10300877997588547986;
        this.b = str;
    }
}
