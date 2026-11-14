package ads_mobile_sdk;

import ads_mobile_sdk.a63;
import ads_mobile_sdk.au0;
import ads_mobile_sdk.j;
import ads_mobile_sdk.jb1;
import ads_mobile_sdk.qm1;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.s7;
import ads_mobile_sdk.yk0;
import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import dev.epro.r0.A14169635274474290551;
import dev.epro.r0.A4779768452142520513;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.B12011109330427901384;
import dev.epro.r0.C12265524002282074474;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.E9507284769322407406;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.I10296188574218802332;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.L405259260506140193;
import dev.epro.r0.M8821877208104636290;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.P190945702497543440;
import dev.epro.r0.Q6203700555324584864;
import dev.epro.r0.Q9622116641457785369;
import dev.epro.r0.R3171298526896875739;
import dev.epro.r0.V4416135141588678913;
import dev.epro.r0.V8913959282937722084;
import dev.epro.r0.V9379369092627242728;
import dev.epro.r0.X11759594239978599137;
import dev.epro.r0.X14397327929232388191;
import dev.epro.r0.Y5459655644324746057;
import dev.epro.r0.Y7950767981527193340;
import dev.epro.r0.Z886113521968091188;
import java.util.HashMap;
import java.util.Optional;
import java.util.RandomAccess;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class a63 implements A4779768452142520513 {
    public final qm1 a;
    public final Y5459655644324746057 c;
    public final P190945702497543440 d;
    public final ExecutorService e;
    public final Executor f;
    public final ub3 g;
    public final vi3 h;
    public final Object i = new Object();
    public final String j;
    public final long k;
    public final long l;
    public final boolean m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6o;
    public L405259260506140193 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [dev.epro.r0.X14397327929232388191] */
    public a63(qm1 qm1Var, Y5459655644324746057 y5459655644324746057, P190945702497543440 p190945702497543440, ub3 ub3Var, vi3 vi3Var, j7 j7Var, ExecutorService executorService) {
        this.a = qm1Var;
        this.c = y5459655644324746057;
        this.d = p190945702497543440;
        this.e = executorService;
        this.g = ub3Var;
        this.h = vi3Var;
        this.j = j7Var.F();
        this.k = j7Var.H();
        this.l = j7Var.D();
        this.m = j7Var.p();
        this.n = j7Var.C();
        boolean v = j7Var.v();
        this.f6o = v;
        this.f = v ? new X14397327929232388191(executorService) : executorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* renamed from: a, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0a(java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a63.m0a(java.util.HashMap):void");
    }

    public final void b(InputEvent inputEvent) {
        try {
            synchronized (this.i) {
                try {
                    L405259260506140193 l405259260506140193 = this.p;
                    if (l405259260506140193 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", inputEvent);
                        ((Q6203700555324584864) l405259260506140193.c).a(l405259260506140193.b, Optional.of(hashMap));
                    } else {
                        this.h.b(yk0.EVENT_ID_ORCAS_ENGINE_REPORT_TOUCH_EVENT_NULL_HOLDER);
                    }
                } finally {
                }
            }
        } catch (I10296188574218802332 | X11759594239978599137 e) {
            vi3 vi3Var = this.h;
            yk0 yk0Var = yk0.EVENT_ID_UNSPECIFIED;
            vi3Var.a.a(20103, -1L, e, null);
        }
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final int c() {
        return 4;
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final String b() {
        synchronized (this.i) {
            try {
                L405259260506140193 l405259260506140193 = this.p;
                if (l405259260506140193 != null) {
                    return (String) l405259260506140193.d;
                }
                return "3.960507516.-1";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final H8027516537527559298 b(Context context, String str, View view, Activity activity) {
        return M9216324016624295870.X(new V8913959282937722084(this, context, str, view, activity, (byte) 1), this.f);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final void a(MotionEvent motionEvent) {
        if (this.f6o) {
            this.f.execute(new Q9622116641457785369(this, MotionEvent.obtain(motionEvent), (byte) 19));
        } else {
            b(motionEvent);
        }
    }

    public final String a(HashMap hashMap) {
        vi3 vi3Var = this.h;
        try {
            new sh3(yk0.EVENT_ID_ORCAS_ENGINE_COLLECT_SIGNAL_VM_INVOCATION, vi3Var.b, vi3Var.a).b();
            synchronized (this.i) {
                L405259260506140193 l405259260506140193 = this.p;
                if (l405259260506140193 == null) {
                    this.h.b(yk0.EVENT_ID_ORCAS_ENGINE_COLLECT_SIGNAL_NULL_HOLDER);
                    return "";
                }
                return V4416135141588678913.d(true).c((byte[]) ((Q6203700555324584864) l405259260506140193.c).a(l405259260506140193.a, Optional.of(hashMap)));
            }
        } finally {
        }
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final H8027516537527559298 a(Context context) {
        return M9216324016624295870.X(new E9507284769322407406(this, context, (byte) 1), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final H8027516537527559298 a(Context context, String str, View view, Activity activity) {
        return M9216324016624295870.X(new V8913959282937722084(this, context, str, view, activity, (byte) 0), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final D16915945238461757356 a() {
        final byte b = 1;
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        boolean z = this.n;
        P190945702497543440 p190945702497543440 = this.d;
        if (z) {
            return B11509606741455062017.s(p190945702497543440.d(), new Y7950767981527193340(this, (byte) 1), z886113521968091188);
        }
        I13152720973475179368 q = I13152720973475179368.q(p190945702497543440.a());
        final byte b2 = 0;
        A14169635274474290551 a14169635274474290551 = new A14169635274474290551((byte) 0);
        ExecutorService executorService = this.e;
        V9379369092627242728 r = B11509606741455062017.r(q.p(Throwable.class, a14169635274474290551, executorService), new R3171298526896875739(this) { // from class: dev.epro.r0.Y6940760607507242917
            public final /* synthetic */ a63 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R3171298526896875739
            public final D16915945238461757356 apply(Object obj) {
                RandomAccess randomAccess;
                R17185427375111049466 r17185427375111049466;
                byte b3 = b2;
                a63 a63Var = this.b;
                switch (b3) {
                    case 0:
                        rm2 rm2Var = (rm2) obj;
                        if (rm2Var != null) {
                            qm1 qm1Var = a63Var.a;
                            R17185427375111049466 o2 = rm2Var.o();
                            synchronized (qm1Var.n) {
                                L6589127411573323482 l6589127411573323482 = qm1Var.q;
                                l6589127411573323482.b();
                                s7 s7Var = (s7) l6589127411573323482.b;
                                randomAccess = s7Var.experimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    s7Var.experimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                r17185427375111049466 = s7Var.experimentIds_;
                                au0.a(o2, r17185427375111049466);
                            }
                        }
                        if (a63Var.c.b(rm2Var)) {
                            return B11509606741455062017.s(a63Var.d.b(), new Y7950767981527193340(a63Var, (byte) 0), Z886113521968091188.a);
                        }
                        a63Var.h.b(yk0.EVENT_ID_ORCAS_ENGINE_INIT_SKIP_INVALID_METADATA);
                        throw new M8821877208104636290(1);
                    default:
                        Throwable th = (Throwable) obj;
                        if (a63Var.m) {
                            return B11509606741455062017.s(a63Var.d.d(), new Y7950767981527193340(a63Var, (byte) 1), Z886113521968091188.a);
                        }
                        th.getClass();
                        P17657851240164021978 p17657851240164021978 = new P17657851240164021978();
                        p17657851240164021978.l(th);
                        return p17657851240164021978;
                }
            }
        }, executorService);
        B12011109330427901384 b12011109330427901384 = new B12011109330427901384(r, Throwable.class, new R3171298526896875739(this) { // from class: dev.epro.r0.Y6940760607507242917
            public final /* synthetic */ a63 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R3171298526896875739
            public final D16915945238461757356 apply(Object obj) {
                RandomAccess randomAccess;
                R17185427375111049466 r17185427375111049466;
                byte b3 = b;
                a63 a63Var = this.b;
                switch (b3) {
                    case 0:
                        rm2 rm2Var = (rm2) obj;
                        if (rm2Var != null) {
                            qm1 qm1Var = a63Var.a;
                            R17185427375111049466 o2 = rm2Var.o();
                            synchronized (qm1Var.n) {
                                L6589127411573323482 l6589127411573323482 = qm1Var.q;
                                l6589127411573323482.b();
                                s7 s7Var = (s7) l6589127411573323482.b;
                                randomAccess = s7Var.experimentIds_;
                                if (!((j) randomAccess).a) {
                                    jb1 jb1Var = (jb1) randomAccess;
                                    s7Var.experimentIds_ = jb1Var.a(jb1Var.c * 2);
                                }
                                r17185427375111049466 = s7Var.experimentIds_;
                                au0.a(o2, r17185427375111049466);
                            }
                        }
                        if (a63Var.c.b(rm2Var)) {
                            return B11509606741455062017.s(a63Var.d.b(), new Y7950767981527193340(a63Var, (byte) 0), Z886113521968091188.a);
                        }
                        a63Var.h.b(yk0.EVENT_ID_ORCAS_ENGINE_INIT_SKIP_INVALID_METADATA);
                        throw new M8821877208104636290(1);
                    default:
                        Throwable th = (Throwable) obj;
                        if (a63Var.m) {
                            return B11509606741455062017.s(a63Var.d.d(), new Y7950767981527193340(a63Var, (byte) 1), Z886113521968091188.a);
                        }
                        th.getClass();
                        P17657851240164021978 p17657851240164021978 = new P17657851240164021978();
                        p17657851240164021978.l(th);
                        return p17657851240164021978;
                }
            }
        });
        r.a(b12011109330427901384, C12265524002282074474.b0(z886113521968091188, b12011109330427901384));
        return b12011109330427901384;
    }

    public final void a(Q6203700555324584864 q6203700555324584864, byte[] bArr, boolean z) {
        vi3 vi3Var = this.h;
        sh3 sh3Var = new sh3(yk0.EVENT_ID_ORCAS_ENGINE_INIT_VM_LOAD, vi3Var.b, vi3Var.a);
        try {
            try {
                sh3Var.b();
                synchronized (this.i) {
                    this.p = L405259260506140193.a(q6203700555324584864, bArr, z);
                }
                sh3Var.a();
            } catch (I10296188574218802332 e) {
                e = e;
                sh3Var.a(e);
                throw new M8821877208104636290("r: 2", e);
            } catch (X11759594239978599137 e2) {
                e = e2;
                sh3Var.a(e);
                throw new M8821877208104636290("r: 2", e);
            } catch (Throwable th) {
                sh3Var.a(th);
                throw th;
            }
        } catch (Throwable th2) {
            sh3Var.a();
            throw th2;
        }
    }
}
