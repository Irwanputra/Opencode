package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F4612376051698646923 {
    public boolean a;
    public boolean b;

    public static void a(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA busy_timeout");
        try {
            sQLiteStatementPrepare.step();
            long j = sQLiteStatementPrepare.getLong(0);
            T18016951143603335921.y(sQLiteStatementPrepare, null);
            if (j < 3000) {
                P13747563277035175218.f(sQLiteConnection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                T18016951143603335921.y(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final void b(SQLiteConnection sQLiteConnection) throws Throwable {
        Object c10696704014433963524;
        a(sQLiteConnection);
        R3533078172067811153 r3533078172067811153 = (R3533078172067811153) this;
        I574271773787654072 i574271773787654072 = r3533078172067811153.c;
        T4723177084556306713 t4723177084556306713 = i574271773787654072.g;
        T4723177084556306713 t47231770845563067132 = T4723177084556306713.b;
        if (t4723177084556306713 == t47231770845563067132) {
            P13747563277035175218.f(sQLiteConnection, "PRAGMA journal_mode = WAL");
        } else {
            P13747563277035175218.f(sQLiteConnection, "PRAGMA journal_mode = TRUNCATE");
        }
        if (i574271773787654072.g == t47231770845563067132) {
            P13747563277035175218.f(sQLiteConnection, "PRAGMA synchronous = NORMAL");
        } else {
            P13747563277035175218.f(sQLiteConnection, "PRAGMA synchronous = FULL");
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA user_version");
        try {
            sQLiteStatementPrepare.step();
            int i = (int) sQLiteStatementPrepare.getLong(0);
            T18016951143603335921.y(sQLiteStatementPrepare, null);
            if (i != r3533078172067811153.d.a) {
                P13747563277035175218.f(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        c(sQLiteConnection);
                    } else {
                        d(sQLiteConnection, i, ((R3533078172067811153) this).d.a);
                    }
                    P13747563277035175218.f(sQLiteConnection, "PRAGMA user_version = " + ((R3533078172067811153) this).d.a);
                    c10696704014433963524 = O9245300239821758723.a;
                } catch (Throwable th) {
                    c10696704014433963524 = new C10696704014433963524(th);
                }
                if (!(c10696704014433963524 instanceof C10696704014433963524)) {
                    P13747563277035175218.f(sQLiteConnection, "END TRANSACTION");
                }
                Throwable thA = I11772848013184437928.a(c10696704014433963524);
                if (thA != null) {
                    P13747563277035175218.f(sQLiteConnection, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            e(sQLiteConnection);
        } finally {
        }
    }

    public final void c(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.getLong(0) == 0) {
                    z = true;
                }
            }
            T18016951143603335921.y(sQLiteStatementPrepare, null);
            R3533078172067811153 r3533078172067811153 = (R3533078172067811153) this;
            Y7729682184936279366 y7729682184936279366 = r3533078172067811153.d;
            y7729682184936279366.a(sQLiteConnection);
            if (!z) {
                X7831914847311259349 x7831914847311259349G = y7729682184936279366.g(sQLiteConnection);
                if (!x7831914847311259349G.b) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + x7831914847311259349G.a).toString());
                }
            }
            f(sQLiteConnection);
            y7729682184936279366.c(sQLiteConnection);
            Iterator it = r3533078172067811153.e.iterator();
            while (it.hasNext()) {
                ((W11288346261755796115) it.next()).getClass();
                if (sQLiteConnection instanceof K9419718790619213063) {
                    ((K9419718790619213063) sQLiteConnection).a.getClass();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(androidx.sqlite.SQLiteConnection r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F4612376051698646923.d(androidx.sqlite.SQLiteConnection, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.sqlite.SQLiteConnection r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F4612376051698646923.e(androidx.sqlite.SQLiteConnection):void");
    }

    public final void f(SQLiteConnection sQLiteConnection) {
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        P13747563277035175218.f(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((R3533078172067811153) this).d.b + "')");
    }
}
