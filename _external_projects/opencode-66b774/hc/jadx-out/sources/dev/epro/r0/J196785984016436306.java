package dev.epro.r0;

import android.os.Looper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J196785984016436306 {
    public A2789795882633926065 a;
    public G8001132634698687269 b;
    public Executor c;
    public V15499216873564893116 d;
    public R3533078172067811153 e;
    public Q11096631689211733349 f;
    public boolean h;
    public final Q7316561721656982910 g = new Q7316561721656982910(new A307398149131398783(0, this, J196785984016436306.class, "onClosed", "onClosed()V", 0, (byte) 8));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            S10973172697741180971.m("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        SupportSQLiteDatabase writableDatabase = h().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            V16504496955554646429.k(new G16212247282630895364(g(), null, (byte) 6));
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public final void c() {
        Q7316561721656982910 q7316561721656982910 = this.g;
        synchronized (q7316561721656982910) {
            if (((AtomicBoolean) q7316561721656982910.d).compareAndSet(false, true)) {
                while (((AtomicInteger) q7316561721656982910.c).get() != 0) {
                }
                ((A307398149131398783) q7316561721656982910.b).invoke();
            }
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(E4951175994894594588.u0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(U16229988784104357932.H((V6281043481934004271) entry.getKey()), entry.getValue());
        }
        return O2161699089510411363.a;
    }

    public abstract Q11096631689211733349 e();

    public Y7729682184936279366 f() {
        throw new X12144930698824946031(0);
    }

    public final Q11096631689211733349 g() {
        Q11096631689211733349 q11096631689211733349 = this.f;
        if (q11096631689211733349 != null) {
            return q11096631689211733349;
        }
        S10823041268949770285.b0("internalTracker");
        throw null;
    }

    public final SupportSQLiteOpenHelper h() {
        R3533078172067811153 r3533078172067811153 = this.e;
        if (r3533078172067811153 == null) {
            S10823041268949770285.b0("connectionManager");
            throw null;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = r3533078172067811153.g;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        S10973172697741180971.m("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set i() {
        return R9411874267597469228.h1(new ArrayList(Z115818233709597990.k0(H15747516787109764287.a, 10)));
    }

    public LinkedHashMap j() {
        int iU0 = E4951175994894594588.u0(Z115818233709597990.k0(H15747516787109764287.a, 10));
        if (iU0 < 16) {
            iU0 = 16;
        }
        return new LinkedHashMap(iU0);
    }

    public final boolean k() {
        R3533078172067811153 r3533078172067811153 = this.e;
        if (r3533078172067811153 != null) {
            return r3533078172067811153.g != null;
        }
        S10823041268949770285.b0("connectionManager");
        throw null;
    }

    public final boolean l() {
        return o() && h().getWritableDatabase().inTransaction();
    }

    public final void m() {
        h().getWritableDatabase().endTransaction();
        if (l()) {
            return;
        }
        Q11096631689211733349 q11096631689211733349G = g();
        q11096631689211733349G.b.c(q11096631689211733349G.e, q11096631689211733349G.f);
    }

    public final void n(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        Q11096631689211733349 q11096631689211733349G = g();
        J16088445080955867036 j16088445080955867036 = q11096631689211733349G.b;
        j16088445080955867036.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA query_only");
        try {
            sQLiteStatementPrepare.step();
            boolean z = sQLiteStatementPrepare.getBoolean(0);
            T18016951143603335921.y(sQLiteStatementPrepare, null);
            if (!z) {
                P13747563277035175218.f(sQLiteConnection, "PRAGMA temp_store = MEMORY");
                P13747563277035175218.f(sQLiteConnection, "PRAGMA recursive_triggers = 1");
                P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (j16088445080955867036.d) {
                    P13747563277035175218.f(sQLiteConnection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    P13747563277035175218.f(sQLiteConnection, Z13168519540281190457.D(false, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                J9952912165656250964 j9952912165656250964 = j16088445080955867036.h;
                ReentrantLock reentrantLock = j9952912165656250964.a;
                reentrantLock.lock();
                try {
                    j9952912165656250964.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (q11096631689211733349G.g) {
            }
        } finally {
        }
    }

    public final boolean o() {
        R3533078172067811153 r3533078172067811153 = this.e;
        if (r3533078172067811153 == null) {
            S10823041268949770285.b0("connectionManager");
            throw null;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = r3533078172067811153.h;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    public final Object p(B13729205492206812220 b13729205492206812220) {
        if (!k()) {
            return G16660188620551127941.E(this, false, true, new F12973702345246855607(b13729205492206812220, (byte) 10));
        }
        b();
        try {
            Object objInvoke = b13729205492206812220.invoke();
            q();
            return objInvoke;
        } finally {
            m();
        }
    }

    public final void q() {
        h().getWritableDatabase().setTransactionSuccessful();
    }

    public final Object r(boolean z, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        R3533078172067811153 r3533078172067811153 = this.e;
        if (r3533078172067811153 != null) {
            return r3533078172067811153.f.l(z, l12639328004344855510, k14749510448791472029);
        }
        S10823041268949770285.b0("connectionManager");
        throw null;
    }
}
