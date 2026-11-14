package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import dev.epro.r0.F1313738613814380915;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.V933048422416352811;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(F1313738613814380915 f1313738613814380915) {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return R7033599853981556291.d0(V933048422416352811.r(executorService), new N4024785987441166868(this, null, (byte) 29), f1313738613814380915);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.P14960607863193493823 r5, dev.epro.r0.V14323974914327418545 r6, dev.epro.r0.L16425900549479658727 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof dev.epro.r0.Z7116998279549816000
            if (r0 == 0) goto L13
            r0 = r8
            dev.epro.r0.Z7116998279549816000 r0 = (dev.epro.r0.Z7116998279549816000) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.Z7116998279549816000 r0 = new dev.epro.r0.Z7116998279549816000
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.t
            int r8 = r0.v
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L2c
            if (r8 != r2) goto L26
            dev.epro.r0.E17665849472693074628.k(r4)
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r1
        L2c:
            dev.epro.r0.E17665849472693074628.k(r4)
            dev.epro.r0.V8338995781648207308 r4 = new dev.epro.r0.V8338995781648207308
            r4.<init>(r5, r6, r7, r1)
            r0.v = r2
            java.lang.Object r4 = dev.epro.r0.O8620973563946607355.B(r4, r0)
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L3f
            return r5
        L3f:
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.d(dev.epro.r0.P14960607863193493823, dev.epro.r0.V14323974914327418545, dev.epro.r0.L16425900549479658727, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.e(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
