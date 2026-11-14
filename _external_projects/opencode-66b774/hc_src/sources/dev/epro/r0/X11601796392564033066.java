package dev.epro.r0;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class X11601796392564033066 {
    public static final /* synthetic */ int a = 0;

    static {
        B14824868959299866349.o("SystemJobScheduler");
    }

    public static final JobScheduler a(Context context) {
        JobScheduler forNamespace;
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        forNamespace.getClass();
        return forNamespace;
    }
}
