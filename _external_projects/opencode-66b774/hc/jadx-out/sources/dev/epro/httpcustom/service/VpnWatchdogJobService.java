package dev.epro.httpcustom.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import dev.epro.r0.A2789795882633926065;
import dev.epro.r0.J11694612831800842345;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.L12602321637077960189;
import dev.epro.r0.X7175349259954592591;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class VpnWatchdogJobService extends JobService {
    public static final /* synthetic */ int c = 0;
    public final A2789795882633926065 a;
    public X7175349259954592591 b;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public interface Z11244019023321623390 {
    }

    static {
        izmyclvb.oeynnivvrnts0(828);
    }

    private native void baaqesinklyt();

    public final native Object a(Context context, L12602321637077960189 l12602321637077960189, J11694612831800842345 j11694612831800842345, K14749510448791472029 k14749510448791472029);

    public final native Object b(Context context, K14749510448791472029 k14749510448791472029);

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.app.job.JobService
    public final native boolean onStartJob(JobParameters jobParameters);

    @Override // android.app.job.JobService
    public final native boolean onStopJob(JobParameters jobParameters);

    public VpnWatchdogJobService() {
        baaqesinklyt();
    }
}
