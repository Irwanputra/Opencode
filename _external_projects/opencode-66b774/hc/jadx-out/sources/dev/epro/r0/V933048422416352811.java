package dev.epro.r0;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.window.BackEvent;
import androidx.work.impl.WorkDatabase;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V933048422416352811 {
    public static final Y4261039727803185691 A;
    public static final V10933700885381486763 B;
    public static final Y4261039727803185691 C;
    public static final D4961612090878789022 D;
    public static final S11108027743417284456 E;
    public static final Z14997871575210439922 F;
    public static final float G = 32.0f;
    public static final Y4733161976867834422[] a;
    public static final T15443218846549482730 b;
    public static final float c;
    public static final V10933700885381486763 d;
    public static final Y4261039727803185691 e;
    public static final float f;
    public static final Y4261039727803185691 g;
    public static final float h;
    public static final Y4261039727803185691 i;
    public static final float j;
    public static final float k;
    public static final D4961612090878789022 l;
    public static final Y4261039727803185691 m;
    public static final Y4261039727803185691 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Y4261039727803185691 f548o;
    public static final Y4261039727803185691 p;
    public static final float q;
    public static final Y4261039727803185691 r;
    public static final float s;
    public static final Y4261039727803185691 t;
    public static final Y4261039727803185691 u;
    public static final Y4261039727803185691 v;
    public static final float w;
    public static final Y4261039727803185691 x;
    public static final Y4261039727803185691 y;
    public static final int[] z;

    public static final native D5904445278789735398 A(String str, Integer num);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(dev.epro.r0.N17834861578880914456 r16, dev.epro.r0.N1420218926656397722 r17, dev.epro.r0.I12071840179596922896 r18, dev.epro.r0.T8337309744439716006 r19, dev.epro.r0.F4096073349764486348 r20, dev.epro.r0.B13729205492206812220 r21, dev.epro.r0.W8455343525638953052 r22, dev.epro.r0.Q2423450198286343102 r23, dev.epro.r0.K1865709164992808030 r24, dev.epro.r0.F4096073349764486348 r25, dev.epro.r0.K14749510448791472029 r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof dev.epro.r0.U15860880312323220517
            if (r1 == 0) goto L15
            r1 = r0
            dev.epro.r0.U15860880312323220517 r1 = (dev.epro.r0.U15860880312323220517) r1
            int r2 = r1.u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.u = r2
            goto L1a
        L15:
            dev.epro.r0.U15860880312323220517 r1 = new dev.epro.r0.U15860880312323220517
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.t
            int r2 = r1.u
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 == r3) goto L29
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return
        L29:
            dev.epro.r0.E17665849472693074628.k(r0)
            goto L55
        L2d:
            dev.epro.r0.E17665849472693074628.k(r0)
            dev.epro.r0.F7550687989279391390 r4 = new dev.epro.r0.F7550687989279391390
            r15 = 0
            r9 = r16
            r6 = r17
            r7 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r8 = r22
            r5 = r23
            r13 = r24
            r14 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.u = r3
            java.lang.Object r0 = dev.epro.r0.O8620973563946607355.B(r4, r1)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L55
            return
        L55:
            dev.epro.r0.Z3383101362411723454.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V933048422416352811.B(dev.epro.r0.N17834861578880914456, dev.epro.r0.N1420218926656397722, dev.epro.r0.I12071840179596922896, dev.epro.r0.T8337309744439716006, dev.epro.r0.F4096073349764486348, dev.epro.r0.B13729205492206812220, dev.epro.r0.W8455343525638953052, dev.epro.r0.Q2423450198286343102, dev.epro.r0.K1865709164992808030, dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(dev.epro.r0.N17834861578880914456 r13, dev.epro.r0.N1420218926656397722 r14, dev.epro.r0.I12071840179596922896 r15, dev.epro.r0.T8337309744439716006 r16, dev.epro.r0.T5263956386065402565 r17, dev.epro.r0.X11739465584883262539 r18, dev.epro.r0.Q2423450198286343102 r19, dev.epro.r0.K1865709164992808030 r20, dev.epro.r0.L2088545775067967710 r21, dev.epro.r0.K14749510448791472029 r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof dev.epro.r0.V8265103928181911179
            if (r1 == 0) goto L16
            r1 = r0
            dev.epro.r0.V8265103928181911179 r1 = (dev.epro.r0.V8265103928181911179) r1
            int r2 = r1.u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.u = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            dev.epro.r0.V8265103928181911179 r1 = new dev.epro.r0.V8265103928181911179
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.t
            int r1 = r12.u
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L2b
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r13)
            return
        L2b:
            dev.epro.r0.E17665849472693074628.k(r0)
            dev.epro.r0.Z3383101362411723454.n()
            return
        L32:
            dev.epro.r0.E17665849472693074628.k(r0)
            android.view.View r0 = r13.a
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            r4 = 14
            if (r1 < r3) goto L46
            dev.epro.r0.F257314900661417804 r1 = new dev.epro.r0.F257314900661417804
            r1.<init>(r0, r4)
        L44:
            r8 = r1
            goto L4c
        L46:
            dev.epro.r0.W8455343525638953052 r1 = new dev.epro.r0.W8455343525638953052
            r1.<init>(r0, r4)
            goto L44
        L4c:
            r12.u = r2
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            B(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V933048422416352811.C(dev.epro.r0.N17834861578880914456, dev.epro.r0.N1420218926656397722, dev.epro.r0.I12071840179596922896, dev.epro.r0.T8337309744439716006, dev.epro.r0.T5263956386065402565, dev.epro.r0.X11739465584883262539, dev.epro.r0.Q2423450198286343102, dev.epro.r0.K1865709164992808030, dev.epro.r0.L2088545775067967710, dev.epro.r0.K14749510448791472029):void");
    }

    public static final native String D(InputStream inputStream);

    public static final native F7649235187575106900 E(InputStream inputStream, Socket socket);

    public static final native void F(J8657988952378915026 j8657988952378915026, Y12768803950665009635 y12768803950665009635, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482);

    public static final W3656598099029166611 G(L6855102173777462404 l6855102173777462404, String str, M3727281027331139839 m3727281027331139839, int i2) {
        int i3 = (i2 & 14) ^ 6;
        byte b2 = 1;
        boolean z2 = (i3 > 4 && m3727281027331139839.f(l6855102173777462404)) || (i2 & 6) == 4;
        Object objM = m3727281027331139839.M();
        Object obj = O9023047933786425027.a;
        R4833348786910499294 r4833348786910499294 = null;
        if (z2 || objM == obj) {
            M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
            F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
            M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
            try {
                Object w3656598099029166611 = new W3656598099029166611(l6855102173777462404, null, str);
                T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                m3727281027331139839.k0(w3656598099029166611);
                objM = w3656598099029166611;
            } catch (Throwable th) {
                T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                throw th;
            }
        }
        W3656598099029166611 w36565980990291666112 = (W3656598099029166611) objM;
        if (l6855102173777462404 instanceof H17052510251737830620) {
            m3727281027331139839.a0(-1357398105);
            Object objM2 = m3727281027331139839.M();
            if (objM2 == obj) {
                objM2 = Q13169198992966610970.R(m3727281027331139839);
                m3727281027331139839.k0(objM2);
            }
            Object obj2 = (W5797197595347441198) objM2;
            boolean zH = m3727281027331139839.h(obj2) | ((i3 > 4 && m3727281027331139839.f(l6855102173777462404)) || (i2 & 6) == 4);
            Object objM3 = m3727281027331139839.M();
            if (zH || objM3 == obj) {
                objM3 = new Y14986451238933639207((Object) l6855102173777462404, obj2, (byte) 7);
                m3727281027331139839.k0(objM3);
            }
            Q13169198992966610970.c(obj2, (F4096073349764486348) objM3, m3727281027331139839);
            H17052510251737830620 h17052510251737830620 = (H17052510251737830620) l6855102173777462404;
            Object value = h17052510251737830620.c.getValue();
            Object value2 = h17052510251737830620.b.getValue();
            boolean z3 = (i3 > 4 && m3727281027331139839.f(l6855102173777462404)) || (i2 & 6) == 4;
            Object objM4 = m3727281027331139839.M();
            if (z3 || objM4 == obj) {
                objM4 = new C288342651169725874(l6855102173777462404, r4833348786910499294, (byte) 23);
                m3727281027331139839.k0(objM4);
            }
            Q13169198992966610970.m(value, value2, (L12639328004344855510) objM4, m3727281027331139839);
            m3727281027331139839.q(false);
        } else {
            m3727281027331139839.a0(-1356407283);
            w36565980990291666112.a(l6855102173777462404.i(), m3727281027331139839, 0);
            m3727281027331139839.q(false);
        }
        boolean zF = m3727281027331139839.f(w36565980990291666112);
        Object objM5 = m3727281027331139839.M();
        if (zF || objM5 == obj) {
            objM5 = new R4572409176886120966(w36565980990291666112, b2);
            m3727281027331139839.k0(objM5);
        }
        Q13169198992966610970.c(w36565980990291666112, (F4096073349764486348) objM5, m3727281027331139839);
        return w36565980990291666112;
    }

    public static final native void H(R13205971432857419934 r13205971432857419934, List list, S1985039337943195993 s1985039337943195993, int i2);

    public static final native Object I(Z12230432157744414222 z12230432157744414222, Z6379685802376252086 z6379685802376252086, J17418217995904968003 j17418217995904968003, R16299599298618519278 r16299599298618519278, K14749510448791472029 k14749510448791472029);

    public static void J(int i2, byte[] bArr) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >> 8) & 255);
        bArr[3] = (byte) ((i2 >> 16) & 255);
        bArr[4] = (byte) ((i2 >> 24) & 255);
    }

    public static final F17048500263560432125 K(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new F17048500263560432125(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? G9045647016837122466.c(backEvent) : 0L);
    }

    public static final native F15462596017929518603 L(String str);

    public static final W3656598099029166611 M(Object obj, String str, M3727281027331139839 m3727281027331139839, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object objM = m3727281027331139839.M();
        E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
        if (objM == e17149812035295265804) {
            objM = new W3656598099029166611(new D7996823394324996916(obj), null, str);
            m3727281027331139839.k0(objM);
        }
        W3656598099029166611 w3656598099029166611 = (W3656598099029166611) objM;
        w3656598099029166611.a(obj, m3727281027331139839, (i2 & 8) | 48 | (i2 & 14));
        Object objM2 = m3727281027331139839.M();
        if (objM2 == e17149812035295265804) {
            objM2 = new R4572409176886120966(w3656598099029166611, (byte) 0);
            m3727281027331139839.k0(objM2);
        }
        Q13169198992966610970.c(w3656598099029166611, (F4096073349764486348) objM2, m3727281027331139839);
        return w3656598099029166611;
    }

    public static final void N(int i2, int i3) {
        if (!(i2 > 0 && i3 > 0)) {
            Y16081827717826519461.a("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        Y16081827717826519461.a("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }

    public static void O(B11059234153875532973 b11059234153875532973, B11059234153875532973 b110592341538755329732, ByteBuffer byteBuffer, Set set, P3161324327665759195 p3161324327665759195) {
        int i2 = B8970794335431581539.Vo;
        if (set.isEmpty()) {
            K2042933864045806308.i("No content digests found");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        int iPosition = byteBuffer.position();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        byteBuffer.position(iPosition);
        T3224757362656795885.o(byteBufferAllocate, b11059234153875532973.size());
        try {
            HashMap mapI = i(set, b11059234153875532973, b110592341538755329732, new O16438938067373071790(byteBufferAllocate, true));
            if (mapI.containsKey(Y4733161976867834422.VERITY_CHUNKED_SHA256)) {
                if (b11059234153875532973.size() % 4096 != 0) {
                    throw new RuntimeException("APK Signing Block is not aligned on 4k boundary: " + b11059234153875532973.size());
                }
                T3224757362656795885.d(byteBuffer);
                long j2 = (((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L) - b11059234153875532973.size();
                if (j2 % 4096 != 0) {
                    throw new RuntimeException("APK Signing Block size is not multiple of page size: " + j2);
                }
            }
            if (!set.equals(mapI.keySet())) {
                StringBuilder sb = new StringBuilder("Mismatch between sets of requested and computed content digests . Requested: ");
                sb.append(set);
                Set setKeySet = mapI.keySet();
                sb.append(", computed: ");
                sb.append(setKeySet);
                throw new RuntimeException(sb.toString());
            }
            ArrayList arrayList = p3161324327665759195.g;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                P5799335319119159120 p5799335319119159120 = (P5799335319119159120) obj;
                ArrayList arrayList2 = p5799335319119159120.g;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    N10165880154438570497 n10165880154438570497 = (N10165880154438570497) obj2;
                    Y16631409940158714280 y16631409940158714280A = Y16631409940158714280.a(n10165880154438570497.a);
                    if (y16631409940158714280A != null) {
                        Y4733161976867834422 y4733161976867834422 = y16631409940158714280A.c;
                        if (set.contains(y4733161976867834422)) {
                            byte[] bArr = n10165880154438570497.b;
                            byte[] bArr2 = (byte[]) mapI.get(y4733161976867834422);
                            if (Arrays.equals(bArr, bArr2)) {
                                p5799335319119159120.h.put(y4733161976867834422, bArr2);
                            } else {
                                int i5 = p3161324327665759195.a;
                                if (i5 == 2) {
                                    p5799335319119159120.f(G15471856606567993098.V2_SIG_APK_DIGEST_DID_NOT_VERIFY, y4733161976867834422, V12319504402545346730.Y(bArr), V12319504402545346730.Y(bArr2));
                                } else if (i5 == 3) {
                                    p5799335319119159120.f(G15471856606567993098.V3_SIG_APK_DIGEST_DID_NOT_VERIFY, y4733161976867834422, V12319504402545346730.Y(bArr), V12319504402545346730.Y(bArr2));
                                }
                            }
                        }
                    }
                }
            }
        } catch (DigestException e2) {
            Z3383101362411723454.m("Failed to compute content digests", e2);
        }
    }

    public static final void a(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, boolean z2) {
        int i3;
        m3727281027331139839.b0(-361453782);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(b13729205492206812220) ? 32 : 16;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            Object obj = (N8244753885299370799) m3727281027331139839.j(W3602003558978578991.a);
            if (obj == null) {
                m3727281027331139839.a0(535274673);
                obj = (U11782692406915154495) m3727281027331139839.j(W2660557881326227972.a);
                if (obj == null) {
                    m3727281027331139839.a0(1208426157);
                    View view = (View) m3727281027331139839.j(T15795698139970521497.f);
                    view.getClass();
                    while (true) {
                        if (view == null) {
                            obj = null;
                            break;
                        }
                        Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        Object obj2 = tag instanceof U11782692406915154495 ? (U11782692406915154495) tag : null;
                        if (obj2 != null) {
                            obj = obj2;
                            break;
                        } else {
                            Object objG = P13747563277035175218.g(view);
                            view = objG instanceof View ? (View) objG : null;
                        }
                    }
                } else {
                    m3727281027331139839.a0(1208423708);
                }
                m3727281027331139839.q(false);
                if (obj == null) {
                    m3727281027331139839.a0(1208428160);
                    Object baseContext = (Context) m3727281027331139839.j(T15795698139970521497.b);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof U11782692406915154495) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    obj = (U11782692406915154495) baseContext;
                } else {
                    m3727281027331139839.a0(1208423789);
                }
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(535271790);
            }
            m3727281027331139839.q(false);
            if (obj == null) {
                S10973172697741180971.m("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = m3727281027331139839.f(obj);
            Object objM = m3727281027331139839.M();
            Object obj3 = O9023047933786425027.a;
            if (zF || objM == obj3) {
                N8244753885299370799 n8244753885299370799 = obj instanceof N8244753885299370799 ? (N8244753885299370799) obj : null;
                J15730374346044043770 j15730374346044043770C = n8244753885299370799 != null ? n8244753885299370799.c() : null;
                U11782692406915154495 u11782692406915154495 = obj instanceof U11782692406915154495 ? (U11782692406915154495) obj : null;
                objM = new T9913910714059887908(j15730374346044043770C, u11782692406915154495 != null ? u11782692406915154495.a() : null);
                m3727281027331139839.k0(objM);
            }
            Object obj4 = (T9913910714059887908) objM;
            long j2 = m3727281027331139839.T;
            boolean zF2 = m3727281027331139839.f(obj4) | m3727281027331139839.e(j2);
            Object objM2 = m3727281027331139839.M();
            Object obj5 = objM2;
            if (zF2 || objM2 == obj3) {
                Q295190250517022391 q295190250517022391 = new Q295190250517022391(new Z13495289232682714606(j2, obj));
                q295190250517022391.c = new O4934609777781722916((byte) 4);
                m3727281027331139839.k0(q295190250517022391);
                obj5 = q295190250517022391;
            }
            Object obj6 = (Q295190250517022391) obj5;
            m3727281027331139839.a0(-585307852);
            boolean zH = m3727281027331139839.h(obj6) | ((i3 & 112) == 32);
            Object objM3 = m3727281027331139839.M();
            if (zH || objM3 == obj3) {
                objM3 = new D16945471218061474327(obj6, (Object) b13729205492206812220, (byte) 10);
                m3727281027331139839.k0(objM3);
            }
            Q13169198992966610970.B((B13729205492206812220) objM3, m3727281027331139839);
            int i4 = i3;
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i5 = i4 & 14;
            boolean zH2 = (i5 == 4) | m3727281027331139839.h(obj6);
            Object objM4 = m3727281027331139839.M();
            if (zH2 || objM4 == obj3) {
                objM4 = new B6039905807936459379(obj6, z2, (byte) 1);
                m3727281027331139839.k0(objM4);
            }
            S10823041268949770285.i(boolValueOf, obj6, null, (F4096073349764486348) objM4, m3727281027331139839, i5);
            boolean zH3 = m3727281027331139839.h(obj4) | m3727281027331139839.h(obj6);
            Object objM5 = m3727281027331139839.M();
            if (zH3 || objM5 == obj3) {
                objM5 = new J7403353095371830496(obj4, obj6, (byte) 14);
                m3727281027331139839.k0(objM5);
            }
            Q13169198992966610970.d(obj4, obj6, (F4096073349764486348) objM5, m3727281027331139839);
            m3727281027331139839.q(false);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L16103462714845531774(z2, b13729205492206812220, i2, (byte) 0);
        }
    }

    public static final native void b(J15344204527961023255 j15344204527961023255, B279403213063110388 b279403213063110388, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void c(T15443218846549482730 t15443218846549482730, I1722681268793429505 i1722681268793429505, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void d(G2190230421268324049 g2190230421268324049, I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final void e(W3656598099029166611 w3656598099029166611, O4957013336652243483 o4957013336652243483, Object obj, Object obj2, A10693687560045094360 a10693687560045094360, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(w3656598099029166611) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(o4957013336652243483) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? m3727281027331139839.f(obj) : m3727281027331139839.h(obj) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? m3727281027331139839.f(obj2) : m3727281027331139839.h(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? m3727281027331139839.f(a10693687560045094360) : m3727281027331139839.h(a10693687560045094360) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if (!m3727281027331139839.R(i3 & 1, (i3 & 9363) != 9362)) {
            m3727281027331139839.U();
        } else if (w3656598099029166611.g()) {
            o4957013336652243483.f(obj, obj2, a10693687560045094360);
        } else {
            o4957013336652243483.g(obj2, a10693687560045094360, null, null);
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new Z11010316021731160528((Object) w3656598099029166611, (Object) o4957013336652243483, obj, obj2, (Object) a10693687560045094360, i2, (byte) 10);
        }
    }

    public static final void f(W13734796219485846113 w13734796219485846113, String str) {
        H1239233717680269921 h1239233717680269921B;
        WorkDatabase workDatabase = w13734796219485846113.c;
        workDatabase.getClass();
        R6421434650946170247 r6421434650946170247X = workDatabase.x();
        I16138585026445501844 i16138585026445501844S = workDatabase.s();
        ArrayList arrayListX = K5751602218013079365.X(str);
        while (!arrayListX.isEmpty()) {
            String str2 = (String) P17571903987102865660.r0(arrayListX);
            Y8203071358079267502 y8203071358079267502A = r6421434650946170247X.a(str2);
            if (y8203071358079267502A != Y8203071358079267502.c && y8203071358079267502A != Y8203071358079267502.d) {
                ((Number) G16660188620551127941.E(r6421434650946170247X.a, false, true, new O3126593184193694660(str2, (byte) 5))).intValue();
            }
            arrayListX.addAll(i16138585026445501844S.a(str2));
        }
        N12253737202470468561 n12253737202470468561 = w13734796219485846113.f;
        n12253737202470468561.getClass();
        synchronized (n12253737202470468561.k) {
            B14824868959299866349.n().getClass();
            n12253737202470468561.i.add(str);
            h1239233717680269921B = n12253737202470468561.b(str);
        }
        N12253737202470468561.d(h1239233717680269921B, 1);
        Iterator it = w13734796219485846113.e.iterator();
        while (it.hasNext()) {
            ((Q17790836556653998983) it.next()).a(str);
        }
    }

    public static native Long g(String str);

    public static final W1972671267364756056 h(D5961215468735357278 d5961215468735357278, M3727281027331139839 m3727281027331139839, int i2) {
        Object objM = m3727281027331139839.M();
        E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
        if (objM == e17149812035295265804) {
            objM = V4416135141588678913.t(Boolean.FALSE);
            m3727281027331139839.k0(objM);
        }
        W1972671267364756056 w1972671267364756056 = (W1972671267364756056) objM;
        byte b2 = 1;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && m3727281027331139839.f(d5961215468735357278)) || (i2 & 6) == 4;
        Object objM2 = m3727281027331139839.M();
        if (z2 || objM2 == e17149812035295265804) {
            objM2 = new Y10342134733813765532(d5961215468735357278, w1972671267364756056, null, b2);
            m3727281027331139839.k0(objM2);
        }
        Q13169198992966610970.l((L12639328004344855510) objM2, m3727281027331139839, d5961215468735357278);
        return w1972671267364756056;
    }

    public static HashMap i(Set set, B11059234153875532973 b11059234153875532973, B11059234153875532973 b110592341538755329732, O16438938067373071790 o16438938067373071790) throws DigestException {
        int i2 = B8970794335431581539.Vo;
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Y4733161976867834422 y4733161976867834422 = (Y4733161976867834422) it.next();
            if (y4733161976867834422 == Y4733161976867834422.CHUNKED_SHA256 || y4733161976867834422 == Y4733161976867834422.CHUNKED_SHA512) {
                hashSet.add(y4733161976867834422);
            }
        }
        int i3 = 0;
        B11059234153875532973[] b11059234153875532973Arr = {b11059234153875532973, b110592341538755329732, o16438938067373071790};
        long size = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            size += (b11059234153875532973Arr[i4].size() + 1048575) / 1048576;
        }
        if (size > 2147483647L) {
            throw new DigestException("Input too long: " + size + " chunks");
        }
        int i5 = (int) size;
        ArrayList arrayList = new ArrayList(hashSet.size());
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(new H8778342479554112647((Y4733161976867834422) it2.next(), i5));
        }
        new I3522225526927885074(new C9313471898943472652(b11059234153875532973Arr), arrayList).run();
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            H8778342479554112647 h8778342479554112647 = (H8778342479554112647) obj;
            map.put(h8778342479554112647.a, MessageDigest.getInstance(h8778342479554112647.a.b).digest(h8778342479554112647.c));
        }
        Y4733161976867834422 y47331619768678344222 = Y4733161976867834422.VERITY_CHUNKED_SHA256;
        if (!set.contains(y47331619768678344222)) {
            return map;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(40);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        H15005300928262499934 h15005300928262499934 = new H15005300928262499934(new byte[8]);
        try {
            byteBufferAllocate.put(h15005300928262499934.c(b11059234153875532973, b110592341538755329732, o16438938067373071790));
            byteBufferAllocate.putLong(b11059234153875532973.size() + b110592341538755329732.size() + ((long) o16438938067373071790.b));
            map.put(y47331619768678344222, byteBufferAllocate.array());
            h15005300928262499934.close();
            return map;
        } catch (Throwable th) {
            try {
                h15005300928262499934.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final int j(float f2, float f3, float f4, int i2, int i3) {
        if (i2 == i3) {
            return -1;
        }
        int i4 = i2 - 2;
        if (i4 < 0) {
            i4 = 0;
        }
        return T18016951143603335921.Z((f4 * (i2 - 1 <= 1 ? r3 : 1)) + (f3 * i4) + f2);
    }

    public static final native String k(String str);

    public static final O11687042873311337343 l(W3656598099029166611 w3656598099029166611, O3410298526443296213 o3410298526443296213, String str, M3727281027331139839 m3727281027331139839, int i2, int i3) {
        C1787322630442623407 c1787322630442623407;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = m3727281027331139839.f(w3656598099029166611);
        Object objM = m3727281027331139839.M();
        Object obj = O9023047933786425027.a;
        if (zF || objM == obj) {
            objM = new O11687042873311337343(w3656598099029166611, o3410298526443296213, str);
            m3727281027331139839.k0(objM);
        }
        O11687042873311337343 o11687042873311337343 = (O11687042873311337343) objM;
        boolean zF2 = m3727281027331139839.f(w3656598099029166611) | m3727281027331139839.h(o11687042873311337343);
        Object objM2 = m3727281027331139839.M();
        if (zF2 || objM2 == obj) {
            objM2 = new Y14986451238933639207((Object) w3656598099029166611, (Object) o11687042873311337343, (byte) 6);
            m3727281027331139839.k0(objM2);
        }
        Q13169198992966610970.c(o11687042873311337343, (F4096073349764486348) objM2, m3727281027331139839);
        if (w3656598099029166611.g() && (c1787322630442623407 = (C1787322630442623407) o11687042873311337343.b.getValue()) != null) {
            W3656598099029166611 w36565980990291666112 = o11687042873311337343.c;
            c1787322630442623407.a.f(c1787322630442623407.c.invoke(w36565980990291666112.f().b()), c1787322630442623407.c.invoke(w36565980990291666112.f().d()), (A10693687560045094360) c1787322630442623407.b.invoke(w36565980990291666112.f()));
        }
        return o11687042873311337343;
    }

    public static final O4957013336652243483 m(W3656598099029166611 w3656598099029166611, Object obj, Object obj2, A10693687560045094360 a10693687560045094360, R3937090736490516115 r3937090736490516115, M3727281027331139839 m3727281027331139839, int i2) {
        boolean zF = m3727281027331139839.f(w3656598099029166611);
        Object objM = m3727281027331139839.M();
        Object obj3 = O9023047933786425027.a;
        if (zF || objM == obj3) {
            M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
            F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
            M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
            try {
                Z13251062865217617579 z13251062865217617579 = (Z13251062865217617579) ((O3410298526443296213) r3937090736490516115).a.invoke(obj2);
                z13251062865217617579.d();
                objM = new O4957013336652243483(w3656598099029166611, obj, z13251062865217617579, r3937090736490516115);
                T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                m3727281027331139839.k0(objM);
            } catch (Throwable th) {
                T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                throw th;
            }
        }
        O4957013336652243483 o4957013336652243483 = (O4957013336652243483) objM;
        e(w3656598099029166611, o4957013336652243483, obj, obj2, a10693687560045094360, m3727281027331139839, 0);
        boolean zF2 = m3727281027331139839.f(w3656598099029166611) | m3727281027331139839.f(o4957013336652243483);
        Object objM2 = m3727281027331139839.M();
        if (zF2 || objM2 == obj3) {
            objM2 = new Y14986451238933639207((Object) w3656598099029166611, (Object) o4957013336652243483, (byte) 8);
            m3727281027331139839.k0(objM2);
        }
        Q13169198992966610970.c(o4957013336652243483, (F4096073349764486348) objM2, m3727281027331139839);
        return o4957013336652243483;
    }

    public static byte[] n(PublicKey publicKey) throws InvalidKeyException {
        byte[] encoded = null;
        if ("X.509".equals(publicKey.getFormat())) {
            byte[] encoded2 = publicKey.getEncoded();
            String algorithm = publicKey.getAlgorithm();
            if ("RSA".equals(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
                try {
                    if (S2941385686793915703.Q(ByteBuffer.wrap(encoded2), V933048422416352811.class) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (K6445406877359976829 | W16495563625558853219 e2) {
                    PrintStream printStream = F4537322127226430183.a;
                    e2.toString();
                    printStream.getClass();
                }
            } else {
                encoded = encoded2;
            }
        }
        if (encoded == null) {
            try {
                encoded = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            } catch (InvalidKeySpecException e3) {
                StringBuilder sb = new StringBuilder("Failed to obtain X.509 encoded form of public key ");
                sb.append(publicKey);
                String name = publicKey.getClass().getName();
                sb.append(" of class ");
                sb.append(name);
                throw new InvalidKeyException(sb.toString(), e3);
            }
        }
        if (encoded != null && encoded.length != 0) {
            return encoded;
        }
        StringBuilder sb2 = new StringBuilder("Failed to obtain X.509 encoded form of public key ");
        sb2.append(publicKey);
        String name2 = publicKey.getClass().getName();
        sb2.append(" of class ");
        sb2.append(name2);
        throw new InvalidKeyException(sb2.toString());
    }

    public static final float o(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final int p(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objG = P13747563277035175218.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return i4;
    }

    public static final View q(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(p(view, R.id.view_tree_lifecycle_owner), p(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (s(view) == null) {
                i2++;
                Object objG = P13747563277035175218.g(view);
                View view4 = view2;
                view2 = view;
                view = objG instanceof View ? (View) objG : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final D11883231851729262595 r(Executor executor) {
        D11883231851729262595 d11883231851729262595;
        K7613050519047686686 k7613050519047686686 = executor instanceof K7613050519047686686 ? (K7613050519047686686) executor : null;
        return (k7613050519047686686 == null || (d11883231851729262595 = k7613050519047686686.a) == null) ? new N18249742966722306189(executor) : d11883231851729262595;
    }

    public static final B18380949320309934747 s(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (B18380949320309934747) weakReference.get();
        }
        return null;
    }

    public static F8210508957313086522 t(J3745674191043464657 j3745674191043464657) {
        F8210508957313086522 f8210508957313086522 = j3745674191043464657.j0;
        if (f8210508957313086522 != null) {
            return f8210508957313086522;
        }
        F8210508957313086522 f82105089573130865222 = new F8210508957313086522(J5654975781851244064.d(j3745674191043464657, C12265524002282074474.g), J5654975781851244064.d(j3745674191043464657, C12265524002282074474.f180o), J5654975781851244064.d(j3745674191043464657, C12265524002282074474.q), J5654975781851244064.d(j3745674191043464657, C12265524002282074474.t), J5654975781851244064.d(j3745674191043464657, C12265524002282074474.u), J5654975781851244064.d(j3745674191043464657, C12265524002282074474.x), U10174709222559481877.b(C12265524002282074474.j, J5654975781851244064.d(j3745674191043464657, C12265524002282074474.i)), U10174709222559481877.b(C12265524002282074474.l, J5654975781851244064.d(j3745674191043464657, C12265524002282074474.k)), U10174709222559481877.b(C12265524002282074474.n, J5654975781851244064.d(j3745674191043464657, C12265524002282074474.m)));
        j3745674191043464657.j0 = f82105089573130865222;
        return f82105089573130865222;
    }

    public static final int u(Layout layout, int i2, boolean z2) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z2) {
                    return lineForOffset - 1;
                }
            } else if (!z2) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final native Object v(L13135072960070674001 l13135072960070674001, J17418217995904968003 j17418217995904968003, L12602321637077960189 l12602321637077960189, P2081723248611321469 p2081723248611321469, G16724087655879983589 g16724087655879983589, Q15027034467569330017 q15027034467569330017, K14749510448791472029 k14749510448791472029);

    public static final native boolean w(int i2);

    public static final float x(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int y(float f2, int i2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static final native Object z(J17418217995904968003 j17418217995904968003, L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    static {
        izmyclvb.qgayjvbiagej2(1370);
        a = new Y4733161976867834422[]{Y4733161976867834422.CHUNKED_SHA512, Y4733161976867834422.VERITY_CHUNKED_SHA256, Y4733161976867834422.CHUNKED_SHA256};
        b = new T15443218846549482730(-1092249270, false, new H1364634762656128767((byte) 23));
        c = 56.0f;
        d = V10933700885381486763.j;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.h;
        e = y4261039727803185691;
        f = 0.38f;
        g = y4261039727803185691;
        h = 0.12f;
        i = y4261039727803185691;
        j = 0.12f;
        k = 8.0f;
        l = D4961612090878789022.h;
        m = Y4261039727803185691.q;
        Y4261039727803185691 y42610397278031856912 = Y4261039727803185691.g;
        n = y42610397278031856912;
        Y4261039727803185691 y42610397278031856913 = Y4261039727803185691.i;
        f548o = y42610397278031856913;
        p = Y4261039727803185691.l;
        q = 1.0f;
        r = y4261039727803185691;
        s = 0.38f;
        t = Y4261039727803185691.m;
        u = y42610397278031856913;
        v = y4261039727803185691;
        w = 0.38f;
        x = y42610397278031856912;
        y = y42610397278031856913;
        z = new int[]{13, 15, 14};
        A = Y4261039727803185691.d;
        B = V10933700885381486763.c;
        C = Y4261039727803185691.b;
        D = D4961612090878789022.c;
        E = new S11108027743417284456((byte) 25);
        F = new Z14997871575210439922((byte) 16);
    }
}
