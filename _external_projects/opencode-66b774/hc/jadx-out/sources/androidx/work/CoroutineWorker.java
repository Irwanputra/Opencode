package androidx.work;

import android.content.Context;
import dev.epro.r0.A2915904411423006968;
import dev.epro.r0.B5998207562248239613;
import dev.epro.r0.F1313738613814380915;
import dev.epro.r0.G5920303990939058292;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.P14960607863193493823;
import dev.epro.r0.R5692663580087387669;
import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends P14960607863193493823 {
    public final WorkerParameters e;
    public final A2915904411423006968 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = A2915904411423006968.c;
    }

    @Override // dev.epro.r0.P14960607863193493823
    public final G5920303990939058292 a() {
        R5692663580087387669 r5692663580087387669K = J8045362843799184672.k();
        A2915904411423006968 a2915904411423006968 = this.f;
        a2915904411423006968.getClass();
        return B5998207562248239613.A(S10823041268949770285.O(a2915904411423006968, r5692663580087387669K), new F1313738613814380915(this, null, (byte) 0));
    }

    @Override // dev.epro.r0.P14960607863193493823
    public final G5920303990939058292 b() {
        A2915904411423006968 a2915904411423006968 = A2915904411423006968.c;
        G8001132634698687269 g8001132634698687269 = this.f;
        if (S10823041268949770285.t(g8001132634698687269, a2915904411423006968)) {
            g8001132634698687269 = this.e.d;
        }
        g8001132634698687269.getClass();
        return B5998207562248239613.A(g8001132634698687269.plus(J8045362843799184672.k()), new F1313738613814380915(this, null, (byte) 1));
    }

    public abstract Object c(F1313738613814380915 f1313738613814380915);
}
