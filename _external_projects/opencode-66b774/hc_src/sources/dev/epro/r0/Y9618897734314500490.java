package dev.epro.r0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y9618897734314500490 implements A17704723979876201899, View.OnAttachStateChangeListener {
    public final S7974369370986781936 a;
    public final A307398149131398783 b;
    public W8455343525638953052 c;
    public final ArrayList d = new ArrayList();
    public V10616265840975294035 e = V10616265840975294035.a;
    public boolean f = true;
    public final H17686692708284905246 g = I3887072968740112330.a(1, 6, null);
    public Q9908018528090167751 h;
    public long i;
    public final Q9908018528090167751 j;
    public P12773055964240635680 k;
    public boolean l;
    public final W13948953340889349604 m;

    public Y9618897734314500490(S7974369370986781936 s7974369370986781936, A307398149131398783 a307398149131398783) {
        this.a = s7974369370986781936;
        this.b = a307398149131398783;
        new Handler(Looper.getMainLooper());
        Q9908018528090167751 q9908018528090167751 = C4240022152304578596.a;
        q9908018528090167751.getClass();
        this.h = q9908018528090167751;
        this.j = new Q9908018528090167751();
        this.k = new P12773055964240635680(s7974369370986781936.getSemanticsOwner().a(), q9908018528090167751);
        this.m = new W13948953340889349604(this, (byte) 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (dev.epro.r0.J8045362843799184672.I(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof dev.epro.r0.H4627480418273526185
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.H4627480418273526185 r0 = (dev.epro.r0.H4627480418273526185) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.H4627480418273526185 r0 = new dev.epro.r0.H4627480418273526185
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            dev.epro.r0.F8228714002503597451 r1 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r8 = 0
            return r8
        L34:
            dev.epro.r0.F8228714002503597451 r1 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L52
        L3a:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.F8228714002503597451 r9 = new dev.epro.r0.F8228714002503597451
            dev.epro.r0.H17686692708284905246 r1 = r8.g
            r9.<init>(r1)
        L44:
            r0.t = r9
            r0.w = r3
            java.lang.Object r1 = r9.b(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.c()
            boolean r9 = r8.h()
            if (r9 == 0) goto L66
            r8.i()
        L66:
            dev.epro.r0.S7974369370986781936 r9 = r8.a
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.l
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.l = r3
            dev.epro.r0.W13948953340889349604 r5 = r8.m
            r9.post(r5)
        L79:
            r0.t = r1
            r0.w = r2
            r5 = 100
            java.lang.Object r9 = dev.epro.r0.J8045362843799184672.I(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y9618897734314500490.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.A17704723979876201899
    public final void b(I4293432593871965076 i4293432593871965076) {
        this.c = (W8455343525638953052) this.b.invoke();
        l(-1, this.a.getSemanticsOwner().a());
        i();
    }

    @Override // dev.epro.r0.A17704723979876201899
    public final void c(I4293432593871965076 i4293432593871965076) {
        m(this.a.getSemanticsOwner().a());
        i();
        this.c = null;
    }

    public final void f(W13131470296662841006 w13131470296662841006) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        W13131470296662841006 w131314702966628410062 = w13131470296662841006;
        int[] iArr3 = w131314702966628410062.b;
        long[] jArr = w131314702966628410062.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        P12773055964240635680 p12773055964240635680 = (P12773055964240635680) this.j.b(i7);
                        D16246464706717523548 d16246464706717523548 = (D16246464706717523548) w131314702966628410062.b(i7);
                        R6653624393204003746 r6653624393204003746 = d16246464706717523548 != null ? d16246464706717523548.a : null;
                        if (r6653624393204003746 == null) {
                            throw L11610354117192841236.j("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = r6653624393204003746.f;
                        A4559761392562572984 a4559761392562572984 = r6653624393204003746.d.a;
                        if (p12773055964240635680 == null) {
                            Object[] objArr = a4559761392562572984.b;
                            long[] jArr2 = a4559761392562572984.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                P14992748401341948828 p14992748401341948828 = (P14992748401341948828) objArr[(i10 << 3) + i12];
                                                P14992748401341948828 p149927484013419488282 = D10671166500636893138.C;
                                                if (S10823041268949770285.t(p14992748401341948828, p149927484013419488282)) {
                                                    Object g = a4559761392562572984.g(p149927484013419488282);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    k(i8, String.valueOf(list != null ? (M11181104712105445833) R9411874267597469228.D0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = a4559761392562572984.b;
                            long[] jArr3 = a4559761392562572984.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                P14992748401341948828 p149927484013419488283 = (P14992748401341948828) objArr2[(i13 << 3) + i15];
                                                P14992748401341948828 p149927484013419488284 = D10671166500636893138.C;
                                                if (S10823041268949770285.t(p149927484013419488283, p149927484013419488284)) {
                                                    Object g2 = p12773055964240635680.a.a.g(p149927484013419488284);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    M11181104712105445833 m11181104712105445833 = list2 != null ? (M11181104712105445833) R9411874267597469228.D0(list2) : null;
                                                    Object g3 = a4559761392562572984.g(p149927484013419488284);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    List list3 = (List) g3;
                                                    M11181104712105445833 m111811047121054458332 = list3 != null ? (M11181104712105445833) R9411874267597469228.D0(list3) : null;
                                                    if (!S10823041268949770285.t(m11181104712105445833, m111811047121054458332)) {
                                                        k(i8, String.valueOf(m111811047121054458332));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    w131314702966628410062 = w13131470296662841006;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            w131314702966628410062 = w13131470296662841006;
            iArr3 = iArr;
        }
    }

    public final W13131470296662841006 g() {
        if (this.f) {
            this.f = false;
            this.h = U15853425786981391261.G(this.a.getSemanticsOwner(), new M14716691558468128220((byte) 16));
            this.i = System.currentTimeMillis();
        }
        return this.h;
    }

    public final boolean h() {
        return this.c != null;
    }

    public final void i() {
        W8455343525638953052 w8455343525638953052 = this.c;
        if (w8455343525638953052 == null) {
            return;
        }
        Object obj = w8455343525638953052.c;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            V14640412428901298565 v14640412428901298565 = (V14640412428901298565) arrayList.get(i);
            int ordinal = v14640412428901298565.c.ordinal();
            if (ordinal == 0) {
                M204440408817344908 m204440408817344908 = v14640412428901298565.d;
                if (m204440408817344908 != null) {
                    ViewStructure viewStructure = (ViewStructure) m204440408817344908.b;
                    if (Build.VERSION.SDK_INT >= 29) {
                        N13459929895848246258.g(A13780509468012278052.f(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    Z3383101362411723454.g();
                    return;
                }
                AutofillId G = w8455343525638953052.G(v14640412428901298565.a);
                if (G != null && Build.VERSION.SDK_INT >= 29) {
                    N13459929895848246258.h(A13780509468012278052.f(obj), G);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession f = A13780509468012278052.f(obj);
            Z6787503239643758223 m = E2166724654553415323.m((View) w8455343525638953052.b);
            Objects.requireNonNull(m);
            N13459929895848246258.j(f, D1067171241640027219.b(m.a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(R6653624393204003746 r6653624393204003746, P12773055964240635680 p12773055964240635680) {
        List i;
        int i2;
        List i3;
        T14793413619962821194 t14793413619962821194 = new T14793413619962821194(p12773055964240635680, this, (byte) 6);
        r6653624393204003746.getClass();
        i = r6653624393204003746.i((r3 & 1) != 0 ? !r6653624393204003746.b : false, (r3 & 2) == 0);
        int size = i.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = i.get(i5);
            if (g().a(((R6653624393204003746) obj).f)) {
                t14793413619962821194.invoke(Integer.valueOf(i4), obj);
                i4++;
            }
        }
        i3 = r6653624393204003746.i((r3 & 1) != 0 ? !r6653624393204003746.b : false, (r3 & 2) == 0);
        int size2 = i3.size();
        for (i2 = 0; i2 < size2; i2++) {
            R6653624393204003746 r66536243932040037462 = (R6653624393204003746) i3.get(i2);
            W13131470296662841006 g = g();
            int i6 = r66536243932040037462.f;
            if (g.a(i6)) {
                Q9908018528090167751 q9908018528090167751 = this.j;
                if (q9908018528090167751.a(i6)) {
                    Object b = q9908018528090167751.b(i6);
                    if (b == null) {
                        throw L11610354117192841236.j("node not present in pruned tree before this change");
                    }
                    j(r66536243932040037462, (P12773055964240635680) b);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(int i, String str) {
        W8455343525638953052 w8455343525638953052;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (w8455343525638953052 = this.c) != null) {
            AutofillId G = w8455343525638953052.G(i);
            if (G == null) {
                throw L11610354117192841236.j("Invalid content capture ID");
            }
            if (i2 >= 29) {
                N13459929895848246258.i(A13780509468012278052.f(w8455343525638953052.c), G, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v12 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r8v12 android.view.autofill.AutofillId) from 0x0097: IF  (r8v12 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0075 A[HIDDEN] (LINE:152)
          (r8v12 android.view.autofill.AutofillId) from 0x00a0: PHI (r8v4 android.view.autofill.AutofillId) = (r8v3 android.view.autofill.AutofillId), (r8v12 android.view.autofill.AutofillId) binds: [B:103:0x009a, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r19, dev.epro.r0.R6653624393204003746 r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y9618897734314500490.l(int, dev.epro.r0.R6653624393204003746):void");
    }

    public final void m(R6653624393204003746 r6653624393204003746) {
        List i;
        if (h()) {
            this.d.add(new V14640412428901298565(r6653624393204003746.f, this.i, P13847083447510769873.b, null));
            i = r6653624393204003746.i((r3 & 1) != 0 ? !r6653624393204003746.b : false, (r3 & 2) == 0);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                m((R6653624393204003746) i.get(i2));
            }
        }
    }

    public final void n() {
        Q9908018528090167751 q9908018528090167751 = this.j;
        q9908018528090167751.c();
        W13131470296662841006 g = g();
        int[] iArr = g.b;
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            q9908018528090167751.i(iArr[i4], new P12773055964240635680(((D16246464706717523548) objArr[i4]).a, g()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.k = new P12773055964240635680(this.a.getSemanticsOwner().a(), g());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.a.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.m);
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
