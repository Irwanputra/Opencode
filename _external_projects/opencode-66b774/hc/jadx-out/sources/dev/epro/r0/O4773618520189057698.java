package dev.epro.r0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O4773618520189057698 implements Q17790836556653998983 {
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final JobScheduler b;
    public final S15087790042213527970 c;
    public final WorkDatabase d;
    public final W1977247516027959386 e;

    static {
        B14824868959299866349.o("SystemJobScheduler");
    }

    public O4773618520189057698(Context context, WorkDatabase workDatabase, W1977247516027959386 w1977247516027959386) {
        JobScheduler jobSchedulerA = X11601796392564033066.a(context);
        S15087790042213527970 s15087790042213527970 = new S15087790042213527970(context, w1977247516027959386.d);
        this.a = context;
        this.b = jobSchedulerA;
        this.c = s15087790042213527970;
        this.d = workDatabase;
        this.e = w1977247516027959386;
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            b14824868959299866349N.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        int i = X11601796392564033066.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable unused) {
            B14824868959299866349.n().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static T4643696886244492064 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new T4643696886244492064(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.Q17790836556653998983
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList arrayListD = d(context, jobScheduler);
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListD.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListD.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                T4643696886244492064 t4643696886244492064F = f(jobInfo);
                if (t4643696886244492064F != null && str.equals(t4643696886244492064F.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            c(jobScheduler, ((Integer) obj2).intValue());
        }
        O11820069373841472725 o11820069373841472725U = this.d.u();
        o11820069373841472725U.getClass();
        str.getClass();
        G16660188620551127941.E(o11820069373841472725U.a, false, true, new F17325007439613749879(str, (byte) 1));
    }

    @Override // dev.epro.r0.Q17790836556653998983
    public final void b(L16425900549479658727... l16425900549479658727Arr) {
        int iIntValue;
        WorkDatabase workDatabase = this.d;
        final G240381062716048330 g240381062716048330 = new G240381062716048330(workDatabase);
        for (L16425900549479658727 l16425900549479658727 : l16425900549479658727Arr) {
            workDatabase.b();
            try {
                L16425900549479658727 l16425900549479658727B = workDatabase.x().b(l16425900549479658727.a);
                if (l16425900549479658727B != null && l16425900549479658727B.b == Y8203071358079267502.a) {
                    T4643696886244492064 t4643696886244492064K = Q9282725956684299602.k(l16425900549479658727);
                    int i = t4643696886244492064K.b;
                    String str = t4643696886244492064K.a;
                    O11820069373841472725 o11820069373841472725U = workDatabase.u();
                    o11820069373841472725U.getClass();
                    str.getClass();
                    Z9812534989346881836 z9812534989346881836 = (Z9812534989346881836) G16660188620551127941.E(o11820069373841472725U.a, true, false, new F16156260086280662456(str, i, (byte) 2));
                    if (z9812534989346881836 != null) {
                        iIntValue = z9812534989346881836.c;
                    } else {
                        W1977247516027959386 w1977247516027959386 = this.e;
                        final short s = w1977247516027959386.f;
                        final int i2 = w1977247516027959386.g;
                        Object objP = g240381062716048330.a.p(new N8306548196372912291(new Callable() { // from class: dev.epro.r0.T17792761693791412813
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = g240381062716048330.a;
                                Long lA = workDatabase2.t().a("next_job_scheduler_id");
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                int i3 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                                M11776140525670923943 m11776140525670923943T = workDatabase2.t();
                                G16660188620551127941.E(m11776140525670923943T.a, false, true, new U9113694475402304022(m11776140525670923943T, new J11694349994993559002("next_job_scheduler_id", Long.valueOf(i3)), (byte) 21));
                                short s2 = s;
                                if (s2 > iLongValue || iLongValue > i2) {
                                    M11776140525670923943 m11776140525670923943T2 = workDatabase2.t();
                                    G16660188620551127941.E(m11776140525670923943T2.a, false, true, new U9113694475402304022(m11776140525670923943T2, new J11694349994993559002("next_job_scheduler_id", Long.valueOf(s2 + 1)), (byte) 21));
                                    iLongValue = s2;
                                }
                                return Integer.valueOf(iLongValue);
                            }
                        }, (byte) 6));
                        objP.getClass();
                        iIntValue = ((Number) objP).intValue();
                    }
                    if (z9812534989346881836 == null) {
                        Z9812534989346881836 z98125349893468818362 = new Z9812534989346881836(str, i, iIntValue);
                        O11820069373841472725 o11820069373841472725U2 = workDatabase.u();
                        o11820069373841472725U2.getClass();
                        G16660188620551127941.E(o11820069373841472725U2.a, false, true, new F16051537739966011766(o11820069373841472725U2, z98125349893468818362, (byte) 25));
                    }
                    g(l16425900549479658727, iIntValue);
                    workDatabase.q();
                } else {
                    B14824868959299866349.n().getClass();
                    workDatabase.q();
                }
            } finally {
                workDatabase.m();
            }
        }
    }

    @Override // dev.epro.r0.Q17790836556653998983
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(L16425900549479658727 l16425900549479658727, int i) {
        int i2;
        List<JobInfo> allPendingJobs;
        String str;
        K13184022901285147448 k13184022901285147448 = l16425900549479658727.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", l16425900549479658727.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", l16425900549479658727.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", l16425900549479658727.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.c.a);
        boolean z = k13184022901285147448.c;
        Set<D12564639665095693399> set = k13184022901285147448.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = k13184022901285147448.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = k13184022901285147448.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            M12733718480826052124 m12733718480826052124 = k13184022901285147448.a;
            if (i3 < 30 || m12733718480826052124 != M12733718480826052124.f) {
                int iOrdinal = m12733718480826052124.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4 || i3 < 26) {
                                B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
                                m12733718480826052124.toString();
                                b14824868959299866349N.getClass();
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(l16425900549479658727.m, l16425900549479658727.l == Y6144095862626460568.b ? 0 : 1);
        }
        long jMax = Math.max(l16425900549479658727.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!l16425900549479658727.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (D12564639665095693399 d12564639665095693399 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(d12564639665095693399.a, d12564639665095693399.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(k13184022901285147448.g);
            extras.setTriggerContentMaxDelay(k13184022901285147448.h);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(k13184022901285147448.e);
            extras.setRequiresStorageNotLow(k13184022901285147448.f);
        }
        Object[] objArr = l16425900549479658727.k > 0;
        Object[] objArr2 = jMax > 0;
        if (i4 >= 31 && l16425900549479658727.q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = l16425900549479658727.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        B14824868959299866349.n().getClass();
        try {
            if (this.b.schedule(jobInfoBuild) == 0) {
                B14824868959299866349.n().getClass();
                if (l16425900549479658727.q && l16425900549479658727.r == W17497847401432715949.a) {
                    l16425900549479658727.q = false;
                    B14824868959299866349.n().getClass();
                    g(l16425900549479658727, i);
                }
            }
        } catch (IllegalStateException e) {
            int i5 = X11601796392564033066.a;
            int i6 = Build.VERSION.SDK_INT;
            int i7 = i6 >= 31 ? 150 : 100;
            int size = ((List) G16660188620551127941.E(this.d.x().a, true, false, new A11054869418321976017((byte) 10))).size();
            Context context = this.a;
            String strJ0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i6 >= 34) {
                JobScheduler jobSchedulerA = X11601796392564033066.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable unused) {
                    B14824868959299866349.n().getClass();
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListD = d(context, jobSchedulerA);
                    int size2 = arrayListD != null ? allPendingJobs.size() - arrayListD.size() : 0;
                    String str2 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListD2 = d(context, (JobScheduler) systemService);
                    int size3 = arrayListD2 != null ? arrayListD2.size() : 0;
                    strJ0 = R9411874267597469228.J0(O5378677881740157249.B0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str2, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, 0, null, 62);
                }
            } else {
                ArrayList arrayListD3 = d(context, X11601796392564033066.a(context));
                if (arrayListD3 != null) {
                    strJ0 = arrayListD3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i7);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strJ0);
            sb.append(".\nThere are ");
            String strN = E12098517352909843120.n(sb, size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.");
            B14824868959299866349.n().getClass();
            throw new IllegalStateException(strN, e);
        } catch (Throwable unused2) {
            B14824868959299866349 b14824868959299866349N2 = B14824868959299866349.n();
            l16425900549479658727.toString();
            b14824868959299866349N2.getClass();
        }
    }
}
