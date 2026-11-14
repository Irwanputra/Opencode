package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.C15025379344307230271;
import dev.epro.r0.F6353700998356592239;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.M6916561348591858303;
import dev.epro.r0.N12253737202470468561;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.S11323950170556863336;
import dev.epro.r0.T16632042582001818609;
import dev.epro.r0.T4643696886244492064;
import dev.epro.r0.W13734796219485846113;
import dev.epro.r0.X5127101262035123109;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements T16632042582001818609 {
    public static final /* synthetic */ int e = 0;
    public W13734796219485846113 a;
    public final HashMap b = new HashMap();
    public final S11323950170556863336 c = new S11323950170556863336((byte) 4);
    public F6353700998356592239 d;

    static {
        B14824868959299866349.o("SystemJobService");
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        S10973172697741180971.m(G6547577305291411977.s("Cannot invoke ", str, " on a background thread"));
    }

    public static T4643696886244492064 b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new T4643696886244492064(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.T16632042582001818609
    public final void d(T4643696886244492064 t4643696886244492064, boolean z) {
        a("onExecuted");
        B14824868959299866349 n = B14824868959299866349.n();
        String str = t4643696886244492064.a;
        n.getClass();
        JobParameters jobParameters = (JobParameters) this.b.remove(t4643696886244492064);
        this.c.f(t4643696886244492064);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            W13734796219485846113 b = W13734796219485846113.b(getApplicationContext());
            this.a = b;
            N12253737202470468561 n12253737202470468561 = b.f;
            this.d = new F6353700998356592239(n12253737202470468561, b.d);
            n12253737202470468561.a(this);
        } catch (IllegalStateException e2) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            B14824868959299866349.n().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        W13734796219485846113 w13734796219485846113 = this.a;
        if (w13734796219485846113 != null) {
            N12253737202470468561 n12253737202470468561 = w13734796219485846113.f;
            synchronized (n12253737202470468561.k) {
                n12253737202470468561.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.a == null) {
            B14824868959299866349.n().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        T4643696886244492064 b = b(jobParameters);
        if (b == null) {
            B14824868959299866349.n().getClass();
            return false;
        }
        HashMap hashMap = this.b;
        if (hashMap.containsKey(b)) {
            B14824868959299866349 n = B14824868959299866349.n();
            b.toString();
            n.getClass();
            return false;
        }
        B14824868959299866349 n2 = B14824868959299866349.n();
        b.toString();
        n2.getClass();
        hashMap.put(b, jobParameters);
        P5733283974459951585 p5733283974459951585 = new P5733283974459951585((byte) 5);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C15025379344307230271.h(jobParameters);
        }
        this.d.e(this.c.h(b), p5733283974459951585);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        a("onStopJob");
        if (this.a == null) {
            B14824868959299866349.n().getClass();
            return true;
        }
        T4643696886244492064 b = b(jobParameters);
        if (b == null) {
            B14824868959299866349.n().getClass();
            return false;
        }
        B14824868959299866349 n = B14824868959299866349.n();
        b.toString();
        n.getClass();
        this.b.remove(b);
        X5127101262035123109 f = this.c.f(b);
        if (f != null) {
            int e2 = Build.VERSION.SDK_INT >= 31 ? M6916561348591858303.e(jobParameters) : -512;
            F6353700998356592239 f6353700998356592239 = this.d;
            f6353700998356592239.getClass();
            f6353700998356592239.g(f, e2);
        }
        N12253737202470468561 n12253737202470468561 = this.a.f;
        String str = b.a;
        synchronized (n12253737202470468561.k) {
            contains = n12253737202470468561.i.contains(str);
        }
        return !contains;
    }
}
