package ads_mobile_sdk;

import ads_mobile_sdk.fm2;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.w53;
import ads_mobile_sdk.yk0;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import dev.epro.r0.A14169635274474290551;
import dev.epro.r0.A4779768452142520513;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.E138661690457992157;
import dev.epro.r0.E9507284769322407406;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.I13152720973475179368;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.T7468265282056741718;
import dev.epro.r0.V8913959282937722084;
import dev.epro.r0.V9308799180227606465;
import dev.epro.r0.W4600430837258405808;
import dev.epro.r0.W6764693637816104089;
import dev.epro.r0.X14397327929232388191;
import dev.epro.r0.Y5459655644324746057;
import dev.epro.r0.Z886113521968091188;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class w53 implements A4779768452142520513 {
    public final yo3 a;
    public final oc3 b;
    public final Y5459655644324746057 c;
    public final vi3 d;
    public final ExecutorService e;
    public final Executor f;
    public final boolean g;
    public final AtomicReference h = new AtomicReference("2.960507516.-1");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [dev.epro.r0.X14397327929232388191] */
    public w53(yo3 yo3Var, oc3 oc3Var, Y5459655644324746057 y5459655644324746057, vi3 vi3Var, ExecutorService executorService, j7 j7Var) {
        this.a = yo3Var;
        this.b = oc3Var;
        this.c = y5459655644324746057;
        this.d = vi3Var;
        this.e = executorService;
        boolean v = j7Var.v();
        this.g = v;
        this.f = v ? new X14397327929232388191(executorService) : executorService;
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final D16915945238461757356 a() {
        I13152720973475179368 q = I13152720973475179368.q(this.b.a());
        A14169635274474290551 a14169635274474290551 = new A14169635274474290551((byte) 7);
        Z886113521968091188 z886113521968091188 = Z886113521968091188.a;
        final byte b = 0;
        T7468265282056741718 s = B11509606741455062017.s(q.p(Throwable.class, a14169635274474290551, z886113521968091188), new W6764693637816104089(this) { // from class: dev.epro.r0.G17481828824918292827
            public final /* synthetic */ w53 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                byte b2 = b;
                w53 w53Var = this.b;
                switch (b2) {
                    case 0:
                        rm2 rm2Var = (rm2) obj;
                        if (w53Var.c.b(rm2Var) && rm2Var != null) {
                            return Boolean.TRUE;
                        }
                        w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_INIT_SKIP_INVALID_METADATA);
                        throw new M8821877208104636290(1);
                    default:
                        fm2 fm2Var = (fm2) obj;
                        if (fm2Var == null) {
                            throw new M8821877208104636290(3);
                        }
                        File file = fm2Var.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        w53Var.d.a(yk0.EVENT_ID_DG_ENGINE_INIT_VM_LOAD, new Q9622116641457785369(w53Var, fm2Var, (byte) 23));
                        return Boolean.TRUE;
                }
            }
        }, z886113521968091188);
        final byte b2 = 1;
        return B11509606741455062017.s(B11509606741455062017.s(B11509606741455062017.r(s, new V9308799180227606465(this, (byte) 1), z886113521968091188), new W6764693637816104089(this) { // from class: dev.epro.r0.G17481828824918292827
            public final /* synthetic */ w53 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.W6764693637816104089
            public final Object apply(Object obj) {
                byte b22 = b2;
                w53 w53Var = this.b;
                switch (b22) {
                    case 0:
                        rm2 rm2Var = (rm2) obj;
                        if (w53Var.c.b(rm2Var) && rm2Var != null) {
                            return Boolean.TRUE;
                        }
                        w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_INIT_SKIP_INVALID_METADATA);
                        throw new M8821877208104636290(1);
                    default:
                        fm2 fm2Var = (fm2) obj;
                        if (fm2Var == null) {
                            throw new M8821877208104636290(3);
                        }
                        File file = fm2Var.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        w53Var.d.a(yk0.EVENT_ID_DG_ENGINE_INIT_VM_LOAD, new Q9622116641457785369(w53Var, fm2Var, (byte) 23));
                        return Boolean.TRUE;
                }
            }
        }, z886113521968091188), new A14169635274474290551((byte) 8), z886113521968091188);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final H8027516537527559298 b(Context context, String str, View view, Activity activity) {
        return M9216324016624295870.X(new V8913959282937722084(this, context, str, view, activity, (byte) 2), this.f);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final int c() {
        return 3;
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final String b() {
        return (String) this.h.get();
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final H8027516537527559298 a(Context context) {
        return M9216324016624295870.X(new E9507284769322407406(this, context, (byte) 4), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final H8027516537527559298 a(Context context, String str, View view, Activity activity) {
        return M9216324016624295870.X(new W4600430837258405808(this, context, str, view, activity), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final void a(MotionEvent motionEvent) {
        cm1 a = this.a.a();
        vi3 vi3Var = this.d;
        if (a == null) {
            vi3Var.b(yk0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return;
        }
        if (this.g) {
            this.f.execute(new E138661690457992157(this, a, MotionEvent.obtain(motionEvent), (byte) 12));
            return;
        }
        try {
            a.a(motionEvent);
        } catch (wo3 e) {
            yk0 yk0Var = yk0.EVENT_ID_UNSPECIFIED;
            vi3Var.a.a(15004, -1L, e, null);
        }
    }
}
