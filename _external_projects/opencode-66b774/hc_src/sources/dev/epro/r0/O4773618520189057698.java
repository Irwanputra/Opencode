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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        JobScheduler a = X11601796392564033066.a(context);
        S15087790042213527970 s15087790042213527970 = new S15087790042213527970(context, w1977247516027959386.d);
        this.a = context;
        this.b = a;
        this.c = s15087790042213527970;
        this.d = workDatabase;
        this.e = w1977247516027959386;
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            B14824868959299866349 n = B14824868959299866349.n();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            n.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        int i = X11601796392564033066.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable unused) {
            B14824868959299866349.n().getClass();
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
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
        ArrayList d = d(context, jobScheduler);
        if (d == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = d.size();
            int i = 0;
            while (i < size) {
                Object obj = d.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                T4643696886244492064 f2 = f(jobInfo);
                if (f2 != null && str.equals(f2.a)) {
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
        O11820069373841472725 u = this.d.u();
        u.getClass();
        str.getClass();
        G16660188620551127941.E(u.a, false, true, new F17325007439613749879(str, (byte) 1));
    }

    @Override // dev.epro.r0.Q17790836556653998983
    public final void b(L16425900549479658727... l16425900549479658727Arr) {
        int intValue;
        WorkDatabase workDatabase = this.d;
        final G240381062716048330 g240381062716048330 = new G240381062716048330(workDatabase);
        for (L16425900549479658727 l16425900549479658727 : l16425900549479658727Arr) {
            workDatabase.b();
            try {
                L16425900549479658727 b = workDatabase.x().b(l16425900549479658727.a);
                if (b == null) {
                    B14824868959299866349.n().getClass();
                    workDatabase.q();
                } else if (b.b != Y8203071358079267502.a) {
                    B14824868959299866349.n().getClass();
                    workDatabase.q();
                } else {
                    T4643696886244492064 k = Q9282725956684299602.k(l16425900549479658727);
                    int i = k.b;
                    String str = k.a;
                    O11820069373841472725 u = workDatabase.u();
                    u.getClass();
                    str.getClass();
                    Z9812534989346881836 z9812534989346881836 = (Z9812534989346881836) G16660188620551127941.E(u.a, true, false, new F16156260086280662456(str, i, (byte) 2));
                    if (z9812534989346881836 != null) {
                        intValue = z9812534989346881836.c;
                    } else {
                        W1977247516027959386 w1977247516027959386 = this.e;
                        final short s = w1977247516027959386.f;
                        final int i2 = w1977247516027959386.g;
                        Object p = g240381062716048330.a.p(new N8306548196372912291(new Callable() { // from class: dev.epro.r0.T17792761693791412813
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = G240381062716048330.this.a;
                                Long a = workDatabase2.t().a("next_job_scheduler_id");
                                int longValue = a != null ? (int) a.longValue() : 0;
                                int i3 = longValue == Integer.MAX_VALUE ? 0 : longValue + 1;
                                M11776140525670923943 t = workDatabase2.t();
                                G16660188620551127941.E(t.a, false, true, new U9113694475402304022(t, new J11694349994993559002("next_job_scheduler_id", Long.valueOf(i3)), (byte) 21));
                                short s2 = s;
                                if (s2 > longValue || longValue > i2) {
                                    M11776140525670923943 t2 = workDatabase2.t();
                                    G16660188620551127941.E(t2.a, false, true, new U9113694475402304022(t2, new J11694349994993559002("next_job_scheduler_id", Long.valueOf(s2 + 1)), (byte) 21));
                                    longValue = s2;
                                }
                                return Integer.valueOf(longValue);
                            }
                        }, (byte) 6));
                        p.getClass();
                        intValue = ((Number) p).intValue();
                    }
                    if (z9812534989346881836 == null) {
                        Z9812534989346881836 z98125349893468818362 = new Z9812534989346881836(str, i, intValue);
                        O11820069373841472725 u2 = workDatabase.u();
                        u2.getClass();
                        G16660188620551127941.E(u2.a, false, true, new F16051537739966011766(u2, z98125349893468818362, (byte) 25));
                    }
                    g(l16425900549479658727, intValue);
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
        List<JobInfo> list;
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
        NetworkRequest a = k13184022901285147448.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || a == null) {
            M12733718480826052124 m12733718480826052124 = k13184022901285147448.a;
            if (i3 < 30 || m12733718480826052124 != M12733718480826052124.f) {
                int ordinal = m12733718480826052124.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 3;
                            if (ordinal != 3) {
                                i2 = 4;
                                if (ordinal != 4 || i3 < 26) {
                                    B14824868959299866349 n = B14824868959299866349.n();
                                    m12733718480826052124.toString();
                                    n.getClass();
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(a);
        }
        if (!z2) {
            extras.setBackoffCriteria(l16425900549479658727.m, l16425900549479658727.l == Y6144095862626460568.b ? 0 : 1);
        }
        long max = Math.max(l16425900549479658727.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
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
        Object[] objArr2 = max > 0;
        if (i4 >= 31 && l16425900549479658727.q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = l16425900549479658727.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo build = extras.build();
        B14824868959299866349.n().getClass();
        try {
            if (this.b.schedule(build) == 0) {
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
            String str2 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i6 >= 34) {
                JobScheduler a2 = X11601796392564033066.a(context);
                try {
                    list = a2.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable unused) {
                    B14824868959299866349.n().getClass();
                    list = null;
                }
                if (list != null) {
                    ArrayList d = d(context, a2);
                    int size2 = d != null ? list.size() - d.size() : 0;
                    String str3 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList d2 = d(context, (JobScheduler) systemService);
                    int size3 = d2 != null ? d2.size() : 0;
                    str2 = R9411874267597469228.J0(O5378677881740157249.B0(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str3, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, 0, null, 62);
                }
            } else {
                ArrayList d3 = d(context, X11601796392564033066.a(context));
                if (d3 != null) {
                    str2 = d3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i7);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(str2);
            sb.append(".\nThere are ");
            String n2 = E12098517352909843120.n(sb, size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.");
            B14824868959299866349.n().getClass();
            throw new IllegalStateException(n2, e);
        } catch (Throwable unused2) {
            B14824868959299866349 n3 = B14824868959299866349.n();
            l16425900549479658727.toString();
            n3.getClass();
        }
    }
}
