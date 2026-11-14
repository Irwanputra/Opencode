package dev.epro.r0;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O13592913085879973388 implements Runnable {
    public static final long e;
    public final Context a;
    public final W13734796219485846113 b;
    public final G240381062716048330 c;
    public int d = 0;

    static {
        B14824868959299866349.o("ForceStopRunnable");
        e = 315360000000L;
    }

    public O13592913085879973388(Context context, W13734796219485846113 w13734796219485846113) {
        this.a = context.getApplicationContext();
        this.b = w13734796219485846113;
        this.c = w13734796219485846113.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        boolean z;
        int i;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        G240381062716048330 g240381062716048330 = this.c;
        W13734796219485846113 w13734796219485846113 = this.b;
        W1977247516027959386 w1977247516027959386 = w13734796219485846113.b;
        G240381062716048330 g2403810627160483302 = w13734796219485846113.g;
        WorkDatabase workDatabase = w13734796219485846113.c;
        int i2 = O4773618520189057698.f;
        Context context = this.a;
        JobScheduler a = X11601796392564033066.a(context);
        ArrayList d = O4773618520189057698.d(context, a);
        List list = (List) G16660188620551127941.E(workDatabase.u().a, true, false, new Y13361005827119333637((byte) 23));
        HashSet hashSet = new HashSet(d != null ? d.size() : 0);
        if (d != null && !d.isEmpty()) {
            int size = d.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = d.get(i3);
                i3++;
                JobInfo jobInfo = (JobInfo) obj;
                T4643696886244492064 f = O4773618520189057698.f(jobInfo);
                if (f != null) {
                    hashSet.add(f.a);
                } else {
                    O4773618520189057698.c(a, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    B14824868959299866349.n().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                R6421434650946170247 x = workDatabase.x();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    x.c(-1L, (String) it2.next());
                }
                workDatabase.q();
                workDatabase.m();
            } catch (Throwable th) {
                throw th;
            }
        }
        R6421434650946170247 x2 = workDatabase.x();
        Z16582172441672663350 w = workDatabase.w();
        workDatabase.b();
        try {
            List<L16425900549479658727> list2 = (List) G16660188620551127941.E(x2.a, true, false, new A11054869418321976017((byte) 4));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (L16425900549479658727 l16425900549479658727 : list2) {
                    Y8203071358079267502 y8203071358079267502 = Y8203071358079267502.a;
                    String str = l16425900549479658727.a;
                    x2.f(y8203071358079267502, str);
                    x2.g(-512, str);
                    x2.c(-1L, str);
                }
            }
            G16660188620551127941.E(w.a, false, true, new A11054869418321976017((byte) 1));
            workDatabase.q();
            workDatabase.m();
            boolean z3 = z2 || z;
            Long a2 = g2403810627160483302.a.t().a("reschedule_needed");
            if (a2 != null && a2.longValue() == 1) {
                B14824868959299866349.n().getClass();
                w13734796219485846113.e();
                g2403810627160483302.getClass();
                J11694349994993559002 j11694349994993559002 = new J11694349994993559002("reschedule_needed", 0L);
                M11776140525670923943 t = g2403810627160483302.a.t();
                G16660188620551127941.E(t.a, false, true, new U9113694475402304022(t, j11694349994993559002, (byte) 21));
                return;
            }
            try {
                i = Build.VERSION.SDK_INT;
                int i4 = i >= 31 ? 570425344 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
            } catch (IllegalArgumentException | SecurityException unused) {
                B14824868959299866349.n().getClass();
            }
            if (i >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long a3 = g240381062716048330.a.t().a("last_force_stop_ms");
                    long longValue = a3 != null ? a3.longValue() : 0L;
                    for (int i5 = 0; i5 < historicalProcessExitReasons.size(); i5++) {
                        ApplicationExitInfo d2 = I2796715180830478750.d(historicalProcessExitReasons.get(i5));
                        reason = d2.getReason();
                        if (reason == 10) {
                            timestamp = d2.getTimestamp();
                            if (timestamp >= longValue) {
                                B14824868959299866349.n().getClass();
                                w13734796219485846113.e();
                                O12545633033254628644 o12545633033254628644 = w1977247516027959386.d;
                                long currentTimeMillis = System.currentTimeMillis();
                                g240381062716048330.getClass();
                                J11694349994993559002 j116943499949935590022 = new J11694349994993559002("last_force_stop_ms", Long.valueOf(currentTimeMillis));
                                M11776140525670923943 t2 = g240381062716048330.a.t();
                                G16660188620551127941.E(t2.a, false, true, new U9113694475402304022(t2, j116943499949935590022, (byte) 21));
                                return;
                            }
                        }
                    }
                }
            } else if (broadcast == null) {
                b(context);
                B14824868959299866349.n().getClass();
                w13734796219485846113.e();
                O12545633033254628644 o125456330332546286442 = w1977247516027959386.d;
                long currentTimeMillis2 = System.currentTimeMillis();
                g240381062716048330.getClass();
                J11694349994993559002 j1169434999499355900222 = new J11694349994993559002("last_force_stop_ms", Long.valueOf(currentTimeMillis2));
                M11776140525670923943 t22 = g240381062716048330.a.t();
                G16660188620551127941.E(t22.a, false, true, new U9113694475402304022(t22, j1169434999499355900222, (byte) 21));
                return;
            }
            if (z3) {
                B14824868959299866349.n().getClass();
                D5189746287310821661.b(w1977247516027959386, workDatabase, w13734796219485846113.e);
            }
        } finally {
            workDatabase.m();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a;
        W13734796219485846113 w13734796219485846113 = this.b;
        W1977247516027959386 w1977247516027959386 = w13734796219485846113.b;
        try {
            w1977247516027959386.getClass();
            boolean isEmpty = TextUtils.isEmpty(null);
            Context context = this.a;
            if (isEmpty) {
                B14824868959299866349.n().getClass();
                a = true;
            } else {
                a = Q15434108051134495466.a(context, w1977247516027959386);
                B14824868959299866349.n().getClass();
            }
            if (!a) {
                return;
            }
            while (true) {
                try {
                    G7713175901684004489.h(context);
                    B14824868959299866349.n().getClass();
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            B14824868959299866349.n().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e2);
                            w1977247516027959386.getClass();
                            throw illegalStateException;
                        }
                        B14824868959299866349.n().getClass();
                        try {
                            Thread.sleep(this.d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    B14824868959299866349.n().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    w1977247516027959386.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            w13734796219485846113.d();
        }
    }
}
