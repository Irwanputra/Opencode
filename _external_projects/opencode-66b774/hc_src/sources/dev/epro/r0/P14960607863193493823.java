package dev.epro.r0;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class P14960607863193493823 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public P14960607863193493823(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public G5920303990939058292 a() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return T18016951143603335921.I(new A12732730042960812466(executorService, new N3036857611236089530(this, (byte) 27), (byte) 7));
    }

    public G5920303990939058292 b() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return T18016951143603335921.I(new A12732730042960812466(executorService, new E6464496061242537963(this, (byte) 12), (byte) 7));
    }
}
