package androidx.work;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class CoroutineWorker extends dev.epro.r0.P14960607863193493823 {
    public final androidx.work.WorkerParameters e;
    public final dev.epro.r0.A2915904411423006968 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = dev.epro.r0.A2915904411423006968.c;
    }

    public final dev.epro.r0.G5920303990939058292 a() {
        dev.epro.r0.R5692663580087387669 r5692663580087387669K = dev.epro.r0.J8045362843799184672.k();
        dev.epro.r0.A2915904411423006968 a2915904411423006968 = this.f;
        a2915904411423006968.getClass();
        return dev.epro.r0.B5998207562248239613.A(dev.epro.r0.S10823041268949770285.O(a2915904411423006968, r5692663580087387669K), new dev.epro.r0.F1313738613814380915(this, (dev.epro.r0.R4833348786910499294) null, (byte) 0));
    }

    public final dev.epro.r0.G5920303990939058292 b() {
        dev.epro.r0.A2915904411423006968 a2915904411423006968 = dev.epro.r0.A2915904411423006968.c;
        dev.epro.r0.G8001132634698687269 g8001132634698687269 = this.f;
        if (dev.epro.r0.S10823041268949770285.t(g8001132634698687269, a2915904411423006968)) {
            g8001132634698687269 = this.e.d;
        }
        g8001132634698687269.getClass();
        return dev.epro.r0.B5998207562248239613.A(g8001132634698687269.plus(dev.epro.r0.J8045362843799184672.k()), new dev.epro.r0.F1313738613814380915(this, (dev.epro.r0.R4833348786910499294) null, (byte) 1));
    }

    public abstract java.lang.Object c(dev.epro.r0.F1313738613814380915 f1313738613814380915);
}
