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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (dev.epro.r0.J8045362843799184672.I(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r9) throws java.lang.Throwable {
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

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(dev.epro.r0.W13131470296662841006 r34) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y9618897734314500490.f(dev.epro.r0.W13131470296662841006):void");
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
            int iOrdinal = v14640412428901298565.c.ordinal();
            if (iOrdinal == 0) {
                M204440408817344908 m204440408817344908 = v14640412428901298565.d;
                if (m204440408817344908 != null) {
                    ViewStructure viewStructure = (ViewStructure) m204440408817344908.b;
                    if (Build.VERSION.SDK_INT >= 29) {
                        N13459929895848246258.g(A13780509468012278052.f(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    Z3383101362411723454.g();
                    return;
                }
                AutofillId autofillIdG = w8455343525638953052.G(v14640412428901298565.a);
                if (autofillIdG != null && Build.VERSION.SDK_INT >= 29) {
                    N13459929895848246258.h(A13780509468012278052.f(obj), autofillIdG);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionF = A13780509468012278052.f(obj);
            Z6787503239643758223 z6787503239643758223M = E2166724654553415323.m((View) w8455343525638953052.b);
            Objects.requireNonNull(z6787503239643758223M);
            N13459929895848246258.j(contentCaptureSessionF, D1067171241640027219.b(z6787503239643758223M.a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(R6653624393204003746 r6653624393204003746, P12773055964240635680 p12773055964240635680) {
        T14793413619962821194 t14793413619962821194 = new T14793413619962821194(p12773055964240635680, this, (byte) 6);
        r6653624393204003746.getClass();
        List listI = r6653624393204003746.i((4 & 1) != 0 ? !r6653624393204003746.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listI.get(i2);
            if (g().a(((R6653624393204003746) obj).f)) {
                t14793413619962821194.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listI2 = r6653624393204003746.i((4 & 1) != 0 ? !r6653624393204003746.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            R6653624393204003746 r66536243932040037462 = (R6653624393204003746) listI2.get(i3);
            W13131470296662841006 w13131470296662841006G = g();
            int i4 = r66536243932040037462.f;
            if (w13131470296662841006G.a(i4)) {
                Q9908018528090167751 q9908018528090167751 = this.j;
                if (q9908018528090167751.a(i4)) {
                    Object objB = q9908018528090167751.b(i4);
                    if (objB == null) {
                        throw L11610354117192841236.j("node not present in pruned tree before this change");
                    }
                    j(r66536243932040037462, (P12773055964240635680) objB);
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
            AutofillId autofillIdG = w8455343525638953052.G(i);
            if (autofillIdG == null) {
                throw L11610354117192841236.j("Invalid content capture ID");
            }
            if (i2 >= 29) {
                N13459929895848246258.i(A13780509468012278052.f(w8455343525638953052.c), autofillIdG, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r19, dev.epro.r0.R6653624393204003746 r20) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y9618897734314500490.l(int, dev.epro.r0.R6653624393204003746):void");
    }

    public final void m(R6653624393204003746 r6653624393204003746) {
        if (h()) {
            this.d.add(new V14640412428901298565(r6653624393204003746.f, this.i, P13847083447510769873.b, null));
            List listI = r6653624393204003746.i((4 & 1) != 0 ? !r6653624393204003746.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                m((R6653624393204003746) listI.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r17 = this;
            r0 = r17
            dev.epro.r0.Q9908018528090167751 r1 = r0.j
            r1.c()
            dev.epro.r0.W13131470296662841006 r2 = r0.g()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            dev.epro.r0.D16246464706717523548 r13 = (dev.epro.r0.D16246464706717523548) r13
            dev.epro.r0.P12773055964240635680 r15 = new dev.epro.r0.P12773055964240635680
            dev.epro.r0.R6653624393204003746 r13 = r13.a
            dev.epro.r0.W13131470296662841006 r6 = r0.g()
            r15.<init>(r13, r6)
            r1.i(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            dev.epro.r0.P12773055964240635680 r1 = new dev.epro.r0.P12773055964240635680
            dev.epro.r0.S7974369370986781936 r2 = r0.a
            dev.epro.r0.Y3847252189195102539 r2 = r2.getSemanticsOwner()
            dev.epro.r0.R6653624393204003746 r2 = r2.a()
            dev.epro.r0.W13131470296662841006 r3 = r0.g()
            r1.<init>(r2, r3)
            r0.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y9618897734314500490.n():void");
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
