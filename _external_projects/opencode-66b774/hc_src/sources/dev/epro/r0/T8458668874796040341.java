package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T8458668874796040341 extends Z17471428274427141949 implements G17613326942144185441, P10552808509296666343, Z3857703353417784960 {
    public boolean B;
    public final S15964518273600746363 D;
    public final S15964518273600746363 E;
    public float F;
    public boolean G;
    public F4096073349764486348 H;
    public B9692660393722135472 I;
    public float K;
    public final S15964518273600746363 L;
    public boolean M;
    public final R8000300579679385019 f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean m;

    /* renamed from: o, reason: collision with root package name */
    public F4096073349764486348 f511o;
    public B9692660393722135472 p;
    public float q;
    public Object s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public Q8181337811809788579 l = Q8181337811809788579.c;
    public long n = 0;
    public boolean r = true;
    public final V13058232089047844042 y = new V13058232089047844042(this, (byte) 0);
    public final D389890677992184566 z = new D389890677992184566(0, new T8458668874796040341[16]);
    public boolean A = true;
    public long C = O15160157444238005800.b(0, 0, 0, 0, 15);
    public long J = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [dev.epro.r0.S15964518273600746363] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dev.epro.r0.S15964518273600746363] */
    /* JADX WARN: Type inference failed for: r7v4, types: [dev.epro.r0.S15964518273600746363] */
    public T8458668874796040341(R8000300579679385019 r8000300579679385019) {
        this.f = r8000300579679385019;
        final byte b = 1;
        final byte b2 = 0;
        this.D = new B13729205492206812220(this) { // from class: dev.epro.r0.S15964518273600746363
            public final /* synthetic */ T8458668874796040341 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b3 = b2;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                T8458668874796040341 t8458668874796040341 = this.b;
                switch (b3) {
                    case 0:
                        t8458668874796040341.f.a().d(t8458668874796040341.C);
                        break;
                    case 1:
                        R8000300579679385019 r80003005796793850192 = t8458668874796040341.f;
                        r80003005796793850192.i = 0;
                        H11725168162114556860 h11725168162114556860 = r80003005796793850192.a;
                        D389890677992184566 z = h11725168162114556860.z();
                        Object[] objArr = z.a;
                        int i = z.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            T8458668874796040341 t84586688747960403412 = ((H11725168162114556860) objArr[i2]).G.p;
                            t84586688747960403412.h = t84586688747960403412.i;
                            t84586688747960403412.i = Integer.MAX_VALUE;
                            t84586688747960403412.u = false;
                            if (t84586688747960403412.l == Q8181337811809788579.b) {
                                t84586688747960403412.l = Q8181337811809788579.c;
                            }
                        }
                        D389890677992184566 z2 = h11725168162114556860.z();
                        Object[] objArr2 = z2.a;
                        int i3 = z2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((H11725168162114556860) objArr2[i4]).G.p.y.d = false;
                        }
                        if (t8458668874796040341.p().f283o) {
                            K7217096618580727896 k7217096618580727896 = (K7217096618580727896) h11725168162114556860.n();
                            int i5 = ((D389890677992184566) k7217096618580727896.b).c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((Y4989033692226475498) ((H11725168162114556860) k7217096618580727896.get(i6)).F.e).f283o = true;
                            }
                        }
                        t8458668874796040341.p().H0().b();
                        if (t8458668874796040341.p().f283o) {
                            K7217096618580727896 k72170966185807278962 = (K7217096618580727896) h11725168162114556860.n();
                            int i7 = ((D389890677992184566) k72170966185807278962.b).c;
                            for (int i8 = 0; i8 < i7; i8++) {
                                ((Y4989033692226475498) ((H11725168162114556860) k72170966185807278962.get(i8)).F.e).f283o = false;
                            }
                        }
                        D389890677992184566 z3 = h11725168162114556860.z();
                        Object[] objArr3 = z3.a;
                        int i9 = z3.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr3[i10];
                            R8000300579679385019 r80003005796793850193 = h117251681621145568602.G;
                            if (r80003005796793850193.p.h != h117251681621145568602.v()) {
                                h11725168162114556860.P();
                                h11725168162114556860.C();
                                if (h117251681621145568602.v() == Integer.MAX_VALUE) {
                                    if (r80003005796793850193.c || O4077903568229246.y(h117251681621145568602)) {
                                        L8383256292871170816 l8383256292871170816 = r80003005796793850193.q;
                                        l8383256292871170816.getClass();
                                        l8383256292871170816.u0(false);
                                    }
                                    r80003005796793850193.p.w0();
                                }
                            }
                        }
                        D389890677992184566 z4 = h11725168162114556860.z();
                        Object[] objArr4 = z4.a;
                        int i11 = z4.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            V13058232089047844042 v13058232089047844042 = ((H11725168162114556860) objArr4[i12]).G.p.y;
                            v13058232089047844042.e = v13058232089047844042.d;
                        }
                        break;
                    default:
                        R8000300579679385019 r80003005796793850194 = t8458668874796040341.f;
                        Y4989033692226475498 y4989033692226475498 = r80003005796793850194.a().w;
                        Y2066038017114788875 placementScope = y4989033692226475498 != null ? y4989033692226475498.p : ((S7974369370986781936) P12010630787994328224.a(r80003005796793850194.a)).getPlacementScope();
                        F4096073349764486348 f4096073349764486348 = t8458668874796040341.H;
                        B9692660393722135472 b9692660393722135472 = t8458668874796040341.I;
                        if (b9692660393722135472 != null) {
                            Y4989033692226475498 a = r80003005796793850194.a();
                            long j = t8458668874796040341.J;
                            float f = t8458668874796040341.K;
                            placementScope.f(a);
                            a.o0(Q2551293802323679034.d(j, a.e), f, b9692660393722135472);
                            break;
                        } else if (f4096073349764486348 == null) {
                            Y4989033692226475498 a2 = r80003005796793850194.a();
                            long j2 = t8458668874796040341.J;
                            float f2 = t8458668874796040341.K;
                            placementScope.f(a2);
                            a2.n0(Q2551293802323679034.d(j2, a2.e), f2, null);
                            break;
                        } else {
                            Y4989033692226475498 a3 = r80003005796793850194.a();
                            long j3 = t8458668874796040341.J;
                            float f3 = t8458668874796040341.K;
                            placementScope.f(a3);
                            a3.n0(Q2551293802323679034.d(j3, a3.e), f3, f4096073349764486348);
                            break;
                        }
                }
                return o9245300239821758723;
            }
        };
        this.E = new B13729205492206812220(this) { // from class: dev.epro.r0.S15964518273600746363
            public final /* synthetic */ T8458668874796040341 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b3 = b;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                T8458668874796040341 t8458668874796040341 = this.b;
                switch (b3) {
                    case 0:
                        t8458668874796040341.f.a().d(t8458668874796040341.C);
                        break;
                    case 1:
                        R8000300579679385019 r80003005796793850192 = t8458668874796040341.f;
                        r80003005796793850192.i = 0;
                        H11725168162114556860 h11725168162114556860 = r80003005796793850192.a;
                        D389890677992184566 z = h11725168162114556860.z();
                        Object[] objArr = z.a;
                        int i = z.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            T8458668874796040341 t84586688747960403412 = ((H11725168162114556860) objArr[i2]).G.p;
                            t84586688747960403412.h = t84586688747960403412.i;
                            t84586688747960403412.i = Integer.MAX_VALUE;
                            t84586688747960403412.u = false;
                            if (t84586688747960403412.l == Q8181337811809788579.b) {
                                t84586688747960403412.l = Q8181337811809788579.c;
                            }
                        }
                        D389890677992184566 z2 = h11725168162114556860.z();
                        Object[] objArr2 = z2.a;
                        int i3 = z2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((H11725168162114556860) objArr2[i4]).G.p.y.d = false;
                        }
                        if (t8458668874796040341.p().f283o) {
                            K7217096618580727896 k7217096618580727896 = (K7217096618580727896) h11725168162114556860.n();
                            int i5 = ((D389890677992184566) k7217096618580727896.b).c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((Y4989033692226475498) ((H11725168162114556860) k7217096618580727896.get(i6)).F.e).f283o = true;
                            }
                        }
                        t8458668874796040341.p().H0().b();
                        if (t8458668874796040341.p().f283o) {
                            K7217096618580727896 k72170966185807278962 = (K7217096618580727896) h11725168162114556860.n();
                            int i7 = ((D389890677992184566) k72170966185807278962.b).c;
                            for (int i8 = 0; i8 < i7; i8++) {
                                ((Y4989033692226475498) ((H11725168162114556860) k72170966185807278962.get(i8)).F.e).f283o = false;
                            }
                        }
                        D389890677992184566 z3 = h11725168162114556860.z();
                        Object[] objArr3 = z3.a;
                        int i9 = z3.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr3[i10];
                            R8000300579679385019 r80003005796793850193 = h117251681621145568602.G;
                            if (r80003005796793850193.p.h != h117251681621145568602.v()) {
                                h11725168162114556860.P();
                                h11725168162114556860.C();
                                if (h117251681621145568602.v() == Integer.MAX_VALUE) {
                                    if (r80003005796793850193.c || O4077903568229246.y(h117251681621145568602)) {
                                        L8383256292871170816 l8383256292871170816 = r80003005796793850193.q;
                                        l8383256292871170816.getClass();
                                        l8383256292871170816.u0(false);
                                    }
                                    r80003005796793850193.p.w0();
                                }
                            }
                        }
                        D389890677992184566 z4 = h11725168162114556860.z();
                        Object[] objArr4 = z4.a;
                        int i11 = z4.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            V13058232089047844042 v13058232089047844042 = ((H11725168162114556860) objArr4[i12]).G.p.y;
                            v13058232089047844042.e = v13058232089047844042.d;
                        }
                        break;
                    default:
                        R8000300579679385019 r80003005796793850194 = t8458668874796040341.f;
                        Y4989033692226475498 y4989033692226475498 = r80003005796793850194.a().w;
                        Y2066038017114788875 placementScope = y4989033692226475498 != null ? y4989033692226475498.p : ((S7974369370986781936) P12010630787994328224.a(r80003005796793850194.a)).getPlacementScope();
                        F4096073349764486348 f4096073349764486348 = t8458668874796040341.H;
                        B9692660393722135472 b9692660393722135472 = t8458668874796040341.I;
                        if (b9692660393722135472 != null) {
                            Y4989033692226475498 a = r80003005796793850194.a();
                            long j = t8458668874796040341.J;
                            float f = t8458668874796040341.K;
                            placementScope.f(a);
                            a.o0(Q2551293802323679034.d(j, a.e), f, b9692660393722135472);
                            break;
                        } else if (f4096073349764486348 == null) {
                            Y4989033692226475498 a2 = r80003005796793850194.a();
                            long j2 = t8458668874796040341.J;
                            float f2 = t8458668874796040341.K;
                            placementScope.f(a2);
                            a2.n0(Q2551293802323679034.d(j2, a2.e), f2, null);
                            break;
                        } else {
                            Y4989033692226475498 a3 = r80003005796793850194.a();
                            long j3 = t8458668874796040341.J;
                            float f3 = t8458668874796040341.K;
                            placementScope.f(a3);
                            a3.n0(Q2551293802323679034.d(j3, a3.e), f3, f4096073349764486348);
                            break;
                        }
                }
                return o9245300239821758723;
            }
        };
        final byte b3 = 2;
        this.L = new B13729205492206812220(this) { // from class: dev.epro.r0.S15964518273600746363
            public final /* synthetic */ T8458668874796040341 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b32 = b3;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                T8458668874796040341 t8458668874796040341 = this.b;
                switch (b32) {
                    case 0:
                        t8458668874796040341.f.a().d(t8458668874796040341.C);
                        break;
                    case 1:
                        R8000300579679385019 r80003005796793850192 = t8458668874796040341.f;
                        r80003005796793850192.i = 0;
                        H11725168162114556860 h11725168162114556860 = r80003005796793850192.a;
                        D389890677992184566 z = h11725168162114556860.z();
                        Object[] objArr = z.a;
                        int i = z.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            T8458668874796040341 t84586688747960403412 = ((H11725168162114556860) objArr[i2]).G.p;
                            t84586688747960403412.h = t84586688747960403412.i;
                            t84586688747960403412.i = Integer.MAX_VALUE;
                            t84586688747960403412.u = false;
                            if (t84586688747960403412.l == Q8181337811809788579.b) {
                                t84586688747960403412.l = Q8181337811809788579.c;
                            }
                        }
                        D389890677992184566 z2 = h11725168162114556860.z();
                        Object[] objArr2 = z2.a;
                        int i3 = z2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((H11725168162114556860) objArr2[i4]).G.p.y.d = false;
                        }
                        if (t8458668874796040341.p().f283o) {
                            K7217096618580727896 k7217096618580727896 = (K7217096618580727896) h11725168162114556860.n();
                            int i5 = ((D389890677992184566) k7217096618580727896.b).c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((Y4989033692226475498) ((H11725168162114556860) k7217096618580727896.get(i6)).F.e).f283o = true;
                            }
                        }
                        t8458668874796040341.p().H0().b();
                        if (t8458668874796040341.p().f283o) {
                            K7217096618580727896 k72170966185807278962 = (K7217096618580727896) h11725168162114556860.n();
                            int i7 = ((D389890677992184566) k72170966185807278962.b).c;
                            for (int i8 = 0; i8 < i7; i8++) {
                                ((Y4989033692226475498) ((H11725168162114556860) k72170966185807278962.get(i8)).F.e).f283o = false;
                            }
                        }
                        D389890677992184566 z3 = h11725168162114556860.z();
                        Object[] objArr3 = z3.a;
                        int i9 = z3.c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr3[i10];
                            R8000300579679385019 r80003005796793850193 = h117251681621145568602.G;
                            if (r80003005796793850193.p.h != h117251681621145568602.v()) {
                                h11725168162114556860.P();
                                h11725168162114556860.C();
                                if (h117251681621145568602.v() == Integer.MAX_VALUE) {
                                    if (r80003005796793850193.c || O4077903568229246.y(h117251681621145568602)) {
                                        L8383256292871170816 l8383256292871170816 = r80003005796793850193.q;
                                        l8383256292871170816.getClass();
                                        l8383256292871170816.u0(false);
                                    }
                                    r80003005796793850193.p.w0();
                                }
                            }
                        }
                        D389890677992184566 z4 = h11725168162114556860.z();
                        Object[] objArr4 = z4.a;
                        int i11 = z4.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            V13058232089047844042 v13058232089047844042 = ((H11725168162114556860) objArr4[i12]).G.p.y;
                            v13058232089047844042.e = v13058232089047844042.d;
                        }
                        break;
                    default:
                        R8000300579679385019 r80003005796793850194 = t8458668874796040341.f;
                        Y4989033692226475498 y4989033692226475498 = r80003005796793850194.a().w;
                        Y2066038017114788875 placementScope = y4989033692226475498 != null ? y4989033692226475498.p : ((S7974369370986781936) P12010630787994328224.a(r80003005796793850194.a)).getPlacementScope();
                        F4096073349764486348 f4096073349764486348 = t8458668874796040341.H;
                        B9692660393722135472 b9692660393722135472 = t8458668874796040341.I;
                        if (b9692660393722135472 != null) {
                            Y4989033692226475498 a = r80003005796793850194.a();
                            long j = t8458668874796040341.J;
                            float f = t8458668874796040341.K;
                            placementScope.f(a);
                            a.o0(Q2551293802323679034.d(j, a.e), f, b9692660393722135472);
                            break;
                        } else if (f4096073349764486348 == null) {
                            Y4989033692226475498 a2 = r80003005796793850194.a();
                            long j2 = t8458668874796040341.J;
                            float f2 = t8458668874796040341.K;
                            placementScope.f(a2);
                            a2.n0(Q2551293802323679034.d(j2, a2.e), f2, null);
                            break;
                        } else {
                            Y4989033692226475498 a3 = r80003005796793850194.a();
                            long j3 = t8458668874796040341.J;
                            float f3 = t8458668874796040341.K;
                            placementScope.f(a3);
                            a3.n0(Q2551293802323679034.d(j3, a3.e), f3, f4096073349764486348);
                            break;
                        }
                }
                return o9245300239821758723;
            }
        };
    }

    public final void B0(long j, float f, F4096073349764486348 f4096073349764486348, B9692660393722135472 b9692660393722135472) {
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        H11725168162114556860 h117251681621145568602 = r8000300579679385019.a;
        if (h11725168162114556860.Q) {
            P753981624812481271.a("place is called on a deactivated node");
        }
        r8000300579679385019.d = J4327291511168983093.c;
        this.n = j;
        this.q = f;
        this.f511o = f4096073349764486348;
        this.p = b9692660393722135472;
        this.G = false;
        Y633750919412282388 a = P12010630787994328224.a(h117251681621145568602);
        if (this.w || !this.t) {
            this.y.g = false;
            r8000300579679385019.f(false);
            this.H = f4096073349764486348;
            this.J = j;
            this.K = f;
            this.I = b9692660393722135472;
            B4499109999593241705 snapshotObserver = ((S7974369370986781936) a).getSnapshotObserver();
            snapshotObserver.a.d(h117251681621145568602, snapshotObserver.f, this.L);
        } else {
            Y4989033692226475498 a2 = r8000300579679385019.a();
            a2.v1(Q2551293802323679034.d(j, a2.e), f, f4096073349764486348, b9692660393722135472);
            z0();
        }
        r8000300579679385019.d = J4327291511168983093.e;
        if (r8000300579679385019.a().f283o && (r8000300579679385019.k || r8000300579679385019.j)) {
            requestLayout();
        }
        this.k = true;
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void F(A6662317080022852970 a6662317080022852970) {
        D389890677992184566 z = this.f.a.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            a6662317080022852970.invoke(((H11725168162114556860) objArr[i2]).G.p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(long r9, float r11, dev.epro.r0.F4096073349764486348 r12, dev.epro.r0.B9692660393722135472 r13) {
        /*
            r8 = this;
            dev.epro.r0.R8000300579679385019 r0 = r8.f
            dev.epro.r0.H11725168162114556860 r1 = r0.a
            dev.epro.r0.H11725168162114556860 r2 = r0.a
            r3 = 1
            r8.u = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r8.n     // Catch: java.lang.Throwable -> L1b
            boolean r4 = dev.epro.r0.Q2551293802323679034.b(r9, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1f
            dev.epro.r0.F4096073349764486348 r4 = r8.f511o     // Catch: java.lang.Throwable -> L1b
            if (r12 != r4) goto L1f
            boolean r4 = r8.M     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            goto L9e
        L1f:
            boolean r4 = r0.k     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r8.M     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
        L2b:
            r8.w = r3     // Catch: java.lang.Throwable -> L1b
            r8.M = r5     // Catch: java.lang.Throwable -> L1b
        L2f:
            dev.epro.r0.L8383256292871170816 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L46
            dev.epro.r0.R8000300579679385019 r6 = r4.f     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.J4871791287292782500 r4 = r4.r     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.J4871791287292782500 r7 = dev.epro.r0.J4871791287292782500.c     // Catch: java.lang.Throwable -> L1b
            if (r4 != r7) goto L46
            dev.epro.r0.H11725168162114556860 r4 = r6.a     // Catch: java.lang.Throwable -> L1b
            boolean r4 = dev.epro.r0.O4077903568229246.y(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L44
            goto L46
        L44:
            r6.c = r3     // Catch: java.lang.Throwable -> L1b
        L46:
            dev.epro.r0.L8383256292871170816 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L88
            boolean r4 = r4.s0()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L88
            dev.epro.r0.Y4989033692226475498 r3 = r0.a()     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.Y4989033692226475498 r3 = r3.w     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L5b
            dev.epro.r0.I18227652366819457368 r3 = r3.p     // Catch: java.lang.Throwable -> L1b
            goto L65
        L5b:
            dev.epro.r0.Y633750919412282388 r3 = dev.epro.r0.P12010630787994328224.a(r2)     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.S7974369370986781936 r3 = (dev.epro.r0.S7974369370986781936) r3     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.Y2066038017114788875 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L65:
            dev.epro.r0.L8383256292871170816 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            r4.getClass()     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.H11725168162114556860 r2 = r2.u()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L74
            dev.epro.r0.R8000300579679385019 r2 = r2.G     // Catch: java.lang.Throwable -> L1b
            r2.h = r5     // Catch: java.lang.Throwable -> L1b
        L74:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.i = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            dev.epro.r0.Y2066038017114788875.h(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L88:
            dev.epro.r0.L8383256292871170816 r0 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L95
            boolean r0 = r0.l     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L95
            java.lang.String r0 = "Error: Placement happened before lookahead."
            dev.epro.r0.P753981624812481271.b(r0)     // Catch: java.lang.Throwable -> L1b
        L95:
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.B0(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L1b
            return
        L9e:
            r1.Z(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T8458668874796040341.F0(long, float, dev.epro.r0.F4096073349764486348, dev.epro.r0.B9692660393722135472):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G0(long r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T8458668874796040341.G0(long):boolean");
    }

    public final void H0() {
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        H11725168162114556860 h117251681621145568602 = r8000300579679385019.a;
        if (!h11725168162114556860.I() || r8000300579679385019.l <= 0) {
            return;
        }
        R8000300579679385019 r80003005796793850192 = h117251681621145568602.G;
        if ((r80003005796793850192.j || r80003005796793850192.k) && !r80003005796793850192.p.w) {
            h117251681621145568602.V(false);
        }
        D389890677992184566 z = h117251681621145568602.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((H11725168162114556860) objArr[i2]).G.p.H0();
        }
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int V(int i) {
        R8000300579679385019 r8000300579679385019 = this.f;
        if (!O4077903568229246.y(r8000300579679385019.a)) {
            x0();
            return r8000300579679385019.a().V(i);
        }
        L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
        l8383256292871170816.getClass();
        return l8383256292871170816.V(i);
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final int W() {
        return this.i;
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void Z() {
        H11725168162114556860.W(this.f.a, false, 7);
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final V13058232089047844042 a() {
        return this.y;
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int a0(int i) {
        R8000300579679385019 r8000300579679385019 = this.f;
        if (!O4077903568229246.y(r8000300579679385019.a)) {
            x0();
            return r8000300579679385019.a().a0(i);
        }
        L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
        l8383256292871170816.getClass();
        return l8383256292871170816.a0(i);
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int b0(int i) {
        R8000300579679385019 r8000300579679385019 = this.f;
        if (!O4077903568229246.y(r8000300579679385019.a)) {
            x0();
            return r8000300579679385019.a().b0(i);
        }
        L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
        l8383256292871170816.getClass();
        return l8383256292871170816.b0(i);
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final int c0(P777117574205674816 p777117574205674816) {
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 u = r8000300579679385019.a.u();
        J4327291511168983093 j4327291511168983093 = u != null ? u.G.d : null;
        J4327291511168983093 j43272915111689830932 = J4327291511168983093.a;
        V13058232089047844042 v13058232089047844042 = this.y;
        if (j4327291511168983093 == j43272915111689830932) {
            v13058232089047844042.c = true;
        } else {
            H11725168162114556860 u2 = r8000300579679385019.a.u();
            if ((u2 != null ? u2.G.d : null) == J4327291511168983093.c) {
                v13058232089047844042.d = true;
            }
        }
        this.m = true;
        int c0 = r8000300579679385019.a().c0(p777117574205674816);
        this.m = false;
        return c0;
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final Z17471428274427141949 d(long j) {
        Q8181337811809788579 q8181337811809788579;
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        H11725168162114556860 h117251681621145568602 = r8000300579679385019.a;
        Q8181337811809788579 q81813378118097885792 = h11725168162114556860.C;
        Q8181337811809788579 q81813378118097885793 = Q8181337811809788579.c;
        if (q81813378118097885792 == q81813378118097885793) {
            h11725168162114556860.c();
        }
        if (O4077903568229246.y(h117251681621145568602)) {
            L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
            l8383256292871170816.getClass();
            l8383256292871170816.j = q81813378118097885793;
            l8383256292871170816.d(j);
        }
        H11725168162114556860 u = h117251681621145568602.u();
        if (u != null) {
            R8000300579679385019 r80003005796793850192 = u.G;
            if (this.l != q81813378118097885793 && !h117251681621145568602.E) {
                P753981624812481271.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = r80003005796793850192.d.ordinal();
            if (ordinal == 0) {
                q8181337811809788579 = Q8181337811809788579.a;
            } else {
                if (ordinal != 2) {
                    D11988991656201568495.k("Measurable could be only measured from the parent's measure or layout block. Parents state is ", r80003005796793850192.d);
                    return null;
                }
                q8181337811809788579 = Q8181337811809788579.b;
            }
            this.l = q8181337811809788579;
        } else {
            this.l = q81813378118097885793;
        }
        G0(j);
        return this;
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final int d0() {
        return this.f.a().d0();
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int f(int i) {
        R8000300579679385019 r8000300579679385019 = this.f;
        if (!O4077903568229246.y(r8000300579679385019.a)) {
            x0();
            return r8000300579679385019.a().f(i);
        }
        L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
        l8383256292871170816.getClass();
        return l8383256292871170816.f(i);
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final int j0() {
        return this.f.a().j0();
    }

    @Override // dev.epro.r0.Z17471428274427141949, dev.epro.r0.G17613326942144185441
    public final Object k() {
        return this.s;
    }

    @Override // dev.epro.r0.Z3857703353417784960
    public final void n(boolean z) {
        R8000300579679385019 r8000300579679385019 = this.f;
        if (z != r8000300579679385019.a().l) {
            r8000300579679385019.a().l = z;
            this.M = true;
        }
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final void n0(long j, float f, F4096073349764486348 f4096073349764486348) {
        F0(j, f, f4096073349764486348, null);
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final void o0(long j, float f, B9692660393722135472 b9692660393722135472) {
        F0(j, f, null, b9692660393722135472);
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final I16141028645763443416 p() {
        return (I16141028645763443416) this.f.a.F.d;
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void requestLayout() {
        this.f.a.V(false);
    }

    public final List s0() {
        R8000300579679385019 r8000300579679385019 = this.f;
        r8000300579679385019.a.g0();
        boolean z = this.A;
        D389890677992184566 d389890677992184566 = this.z;
        if (!z) {
            return d389890677992184566.f();
        }
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        D389890677992184566 z2 = h11725168162114556860.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
            if (d389890677992184566.c <= i2) {
                d389890677992184566.b(h117251681621145568602.G.p);
            } else {
                T8458668874796040341 t8458668874796040341 = h117251681621145568602.G.p;
                Object[] objArr2 = d389890677992184566.a;
                Object obj = objArr2[i2];
                objArr2[i2] = t8458668874796040341;
            }
        }
        d389890677992184566.n(((D389890677992184566) ((K7217096618580727896) h11725168162114556860.n()).b).c, d389890677992184566.c);
        this.A = false;
        return d389890677992184566.f();
    }

    public final void u0() {
        boolean z = this.t;
        this.t = true;
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        X9608137461199640409 x9608137461199640409 = h11725168162114556860.F;
        if (!z) {
            ((I16141028645763443416) x9608137461199640409.d).q1();
            ((S7974369370986781936) P12010630787994328224.a(h11725168162114556860)).getRectManager().g(r8000300579679385019.a);
            if (h11725168162114556860.q()) {
                H11725168162114556860.W(h11725168162114556860, true, 6);
            } else if (h11725168162114556860.G.e) {
                H11725168162114556860.U(h11725168162114556860, true, 6);
            }
        }
        Y4989033692226475498 y4989033692226475498 = ((I16141028645763443416) x9608137461199640409.d).v;
        for (Y4989033692226475498 y49890336922264754982 = (Y4989033692226475498) x9608137461199640409.e; !S10823041268949770285.t(y49890336922264754982, y4989033692226475498) && y49890336922264754982 != null; y49890336922264754982 = y49890336922264754982.v) {
            if (y49890336922264754982.S) {
                y49890336922264754982.m1();
            }
        }
        D389890677992184566 z2 = h11725168162114556860.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
            if (h117251681621145568602.v() != Integer.MAX_VALUE) {
                h117251681621145568602.G.p.u0();
                H11725168162114556860.X(h117251681621145568602);
            }
        }
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final P10552808509296666343 v() {
        R8000300579679385019 r8000300579679385019;
        H11725168162114556860 u = this.f.a.u();
        if (u == null || (r8000300579679385019 = u.G) == null) {
            return null;
        }
        return r8000300579679385019.p;
    }

    public final void w0() {
        if (this.t) {
            this.t = false;
            R8000300579679385019 r8000300579679385019 = this.f;
            H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
            H11725168162114556860 h117251681621145568602 = r8000300579679385019.a;
            ((S7974369370986781936) P12010630787994328224.a(h11725168162114556860)).getRectManager().h(h117251681621145568602);
            X9608137461199640409 x9608137461199640409 = h117251681621145568602.F;
            Y4989033692226475498 y4989033692226475498 = ((I16141028645763443416) x9608137461199640409.d).v;
            for (Y4989033692226475498 y49890336922264754982 = (Y4989033692226475498) x9608137461199640409.e; !S10823041268949770285.t(y49890336922264754982, y4989033692226475498) && y49890336922264754982 != null; y49890336922264754982 = y49890336922264754982.v) {
                y49890336922264754982.s1();
                y49890336922264754982.x1();
            }
            D389890677992184566 z = h117251681621145568602.z();
            Object[] objArr = z.a;
            int i = z.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((H11725168162114556860) objArr[i2]).G.p.w0();
            }
        }
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void x() {
        boolean z;
        this.B = true;
        V13058232089047844042 v13058232089047844042 = this.y;
        v13058232089047844042.h();
        boolean z2 = this.w;
        R8000300579679385019 r8000300579679385019 = this.f;
        if (z2) {
            D389890677992184566 z3 = r8000300579679385019.a.z();
            Object[] objArr = z3.a;
            int i = z3.c;
            for (int i2 = 0; i2 < i; i2++) {
                H11725168162114556860 h11725168162114556860 = (H11725168162114556860) objArr[i2];
                boolean q = h11725168162114556860.q();
                R8000300579679385019 r80003005796793850192 = h11725168162114556860.G;
                if (q && h11725168162114556860.r() == Q8181337811809788579.a) {
                    T8458668874796040341 t8458668874796040341 = r80003005796793850192.p;
                    I16980768508151520658 i16980768508151520658 = t8458668874796040341.j ? new I16980768508151520658(t8458668874796040341.d) : null;
                    if (i16980768508151520658 != null) {
                        if (h11725168162114556860.C == Q8181337811809788579.c) {
                            h11725168162114556860.c();
                        }
                        z = r80003005796793850192.p.G0(i16980768508151520658.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        H11725168162114556860.W(r8000300579679385019.a, false, 7);
                    }
                }
            }
        }
        if (this.x || (!this.m && !p().f283o && this.w)) {
            this.w = false;
            J4327291511168983093 j4327291511168983093 = r8000300579679385019.d;
            r8000300579679385019.d = J4327291511168983093.c;
            r8000300579679385019.g(false);
            H11725168162114556860 h117251681621145568602 = r8000300579679385019.a;
            B4499109999593241705 snapshotObserver = ((S7974369370986781936) P12010630787994328224.a(h117251681621145568602)).getSnapshotObserver();
            snapshotObserver.a.d(h117251681621145568602, snapshotObserver.e, this.E);
            r8000300579679385019.d = j4327291511168983093;
            this.x = false;
        }
        if (v13058232089047844042.d) {
            v13058232089047844042.e = true;
        }
        if (v13058232089047844042.b && v13058232089047844042.e()) {
            v13058232089047844042.g();
        }
        this.B = false;
    }

    public final void x0() {
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860.W(r8000300579679385019.a, false, 7);
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        H11725168162114556860 u = h11725168162114556860.u();
        if (u == null || h11725168162114556860.C != Q8181337811809788579.c) {
            return;
        }
        int ordinal = u.G.d.ordinal();
        h11725168162114556860.C = ordinal != 0 ? ordinal != 2 ? u.C : Q8181337811809788579.b : Q8181337811809788579.a;
    }

    public final void z0() {
        this.G = true;
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 u = r8000300579679385019.a.u();
        float f = p().G;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        X9608137461199640409 x9608137461199640409 = h11725168162114556860.F;
        Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) x9608137461199640409.e;
        I16141028645763443416 i16141028645763443416 = (I16141028645763443416) x9608137461199640409.d;
        while (y4989033692226475498 != i16141028645763443416) {
            y4989033692226475498.getClass();
            K12961197752049417088 k12961197752049417088 = (K12961197752049417088) y4989033692226475498;
            f += k12961197752049417088.G;
            y4989033692226475498 = k12961197752049417088.v;
        }
        if (f != this.F) {
            this.F = f;
            if (u != null) {
                u.P();
            }
            if (u != null) {
                u.C();
            }
        }
        if (!p().f283o) {
            boolean z = this.t;
            if (!z || this.y.d()) {
                u0();
            }
            if (z) {
                ((I16141028645763443416) h11725168162114556860.F.d).q1();
            } else {
                if (u != null) {
                    u.C();
                }
                if (this.g && u != null) {
                    u.V(false);
                }
            }
        }
        if (u != null) {
            R8000300579679385019 r80003005796793850192 = u.G;
            if (!this.g && r80003005796793850192.d == J4327291511168983093.c) {
                if (this.i != Integer.MAX_VALUE) {
                    P753981624812481271.b("Place was called on a node which was placed already");
                }
                int i = r80003005796793850192.i;
                this.i = i;
                r80003005796793850192.i = i + 1;
            }
        } else {
            this.i = 0;
        }
        x();
    }
}
