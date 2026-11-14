package dev.epro.r0;

import android.app.AlarmManager;
import android.app.PendingIntent;
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
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
        long jCurrentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O13592913085879973388.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        W13734796219485846113 w13734796219485846113 = this.b;
        W1977247516027959386 w1977247516027959386 = w13734796219485846113.b;
        try {
            w1977247516027959386.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.a;
            if (zIsEmpty) {
                B14824868959299866349.n().getClass();
                zA = true;
            } else {
                zA = Q15434108051134495466.a(context, w1977247516027959386);
                B14824868959299866349.n().getClass();
            }
            if (!zA) {
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
                            Thread.sleep(((long) this.d) * 300);
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
