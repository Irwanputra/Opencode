package androidx.work.impl.background.systemjob;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class SystemJobService extends android.app.job.JobService implements dev.epro.r0.T16632042582001818609 {
    public static final /* synthetic */ int e = 0;
    public dev.epro.r0.W13734796219485846113 a;
    public final java.util.HashMap b = new java.util.HashMap();
    public final dev.epro.r0.S11323950170556863336 c = new dev.epro.r0.S11323950170556863336((byte) 4);
    public dev.epro.r0.F6353700998356592239 d;

    static {
        dev.epro.r0.B14824868959299866349.o("SystemJobService");
    }

    public static void a(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        dev.epro.r0.S10973172697741180971.m(dev.epro.r0.G6547577305291411977.s("Cannot invoke ", str, " on a background thread"));
    }

    public static dev.epro.r0.T4643696886244492064 b(android.app.job.JobParameters jobParameters) {
        try {
            android.os.PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new dev.epro.r0.T4643696886244492064(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }

    public final void d(dev.epro.r0.T4643696886244492064 t4643696886244492064, boolean z) {
        a("onExecuted");
        dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
        java.lang.String str = t4643696886244492064.a;
        b14824868959299866349N.getClass();
        android.app.job.JobParameters jobParameters = (android.app.job.JobParameters) this.b.remove(t4643696886244492064);
        this.c.f(t4643696886244492064);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            dev.epro.r0.W13734796219485846113 w13734796219485846113B = dev.epro.r0.W13734796219485846113.b(getApplicationContext());
            this.a = w13734796219485846113B;
            dev.epro.r0.N12253737202470468561 n12253737202470468561 = w13734796219485846113B.f;
            this.d = new dev.epro.r0.F6353700998356592239(n12253737202470468561, w13734796219485846113B.d);
            n12253737202470468561.a(this);
        } catch (java.lang.IllegalStateException e2) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            dev.epro.r0.B14824868959299866349.n().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        dev.epro.r0.W13734796219485846113 w13734796219485846113 = this.a;
        if (w13734796219485846113 != null) {
            dev.epro.r0.N12253737202470468561 n12253737202470468561 = w13734796219485846113.f;
            synchronized (n12253737202470468561.k) {
                n12253737202470468561.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        a("onStartJob");
        if (this.a == null) {
            dev.epro.r0.B14824868959299866349.n().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        dev.epro.r0.T4643696886244492064 t4643696886244492064B = b(jobParameters);
        if (t4643696886244492064B == null) {
            dev.epro.r0.B14824868959299866349.n().getClass();
            return false;
        }
        java.util.HashMap map = this.b;
        if (map.containsKey(t4643696886244492064B)) {
            dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
            t4643696886244492064B.toString();
            b14824868959299866349N.getClass();
            return false;
        }
        dev.epro.r0.B14824868959299866349 b14824868959299866349N2 = dev.epro.r0.B14824868959299866349.n();
        t4643696886244492064B.toString();
        b14824868959299866349N2.getClass();
        map.put(t4643696886244492064B, jobParameters);
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = new dev.epro.r0.P5733283974459951585((byte) 5);
        if (jobParameters.getTriggeredContentUris() != null) {
            java.util.Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            java.util.Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            dev.epro.r0.C15025379344307230271.h(jobParameters);
        }
        this.d.e(this.c.h(t4643696886244492064B), p5733283974459951585);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.a == null) {
            dev.epro.r0.B14824868959299866349.n().getClass();
            return true;
        }
        dev.epro.r0.T4643696886244492064 t4643696886244492064B = b(jobParameters);
        if (t4643696886244492064B == null) {
            dev.epro.r0.B14824868959299866349.n().getClass();
            return false;
        }
        dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
        t4643696886244492064B.toString();
        b14824868959299866349N.getClass();
        this.b.remove(t4643696886244492064B);
        dev.epro.r0.X5127101262035123109 x5127101262035123109F = this.c.f(t4643696886244492064B);
        if (x5127101262035123109F != null) {
            int iE = android.os.Build.VERSION.SDK_INT >= 31 ? dev.epro.r0.M6916561348591858303.e(jobParameters) : -512;
            dev.epro.r0.F6353700998356592239 f6353700998356592239 = this.d;
            f6353700998356592239.getClass();
            f6353700998356592239.g(x5127101262035123109F, iE);
        }
        dev.epro.r0.N12253737202470468561 n12253737202470468561 = this.a.f;
        java.lang.String str = t4643696886244492064B.a;
        synchronized (n12253737202470468561.k) {
            zContains = n12253737202470468561.i.contains(str);
        }
        return !zContains;
    }
}
