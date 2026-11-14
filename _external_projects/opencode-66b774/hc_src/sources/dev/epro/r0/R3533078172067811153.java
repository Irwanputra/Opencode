package dev.epro.r0;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.List;
import java.util.concurrent.Executor;
import net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R3533078172067811153 extends F4612376051698646923 {
    public final I574271773787654072 c;
    public final Y7729682184936279366 d;
    public final List e;
    public final P1476829555860395776 f;
    public final SupportSQLiteOpenHelper g;
    public SupportSQLiteDatabase h;

    public R3533078172067811153(I574271773787654072 i574271773787654072, Y7729682184936279366 y7729682184936279366, J7674436703016904089 j7674436703016904089) {
        int i;
        P1476829555860395776 h11679660217271982841;
        T4723177084556306713 t4723177084556306713 = i574271773787654072.g;
        androidx.sqlite.db.Z11244019023321623390 z11244019023321623390 = i574271773787654072.c;
        T3455454122937680569 t3455454122937680569 = i574271773787654072.p;
        String str = i574271773787654072.b;
        this.c = i574271773787654072;
        this.d = y7729682184936279366;
        List list = i574271773787654072.e;
        this.e = list == null ? O2161699089510411363.a : list;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = null;
        if (t3455454122937680569 != null) {
            this.g = null;
            if (t3455454122937680569.hasConnectionPool()) {
                h11679660217271982841 = new T17829739910898216201(new W8455343525638953052(this, t3455454122937680569), str == null ? SQLiteDatabaseConfiguration.MEMORY_DB_PATH : str, j7674436703016904089);
            } else if (str == null) {
                h11679660217271982841 = new H11679660217271982841(new W8455343525638953052(this, t3455454122937680569));
            } else {
                W8455343525638953052 w8455343525638953052 = new W8455343525638953052(this, t3455454122937680569);
                int ordinal = t4723177084556306713.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + t4723177084556306713 + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = t4723177084556306713.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + t4723177084556306713 + '\'').toString());
                }
                h11679660217271982841 = new H11679660217271982841(w8455343525638953052, str, i);
            }
            this.f = h11679660217271982841;
        } else {
            if (z11244019023321623390 == null) {
                S10973172697741180971.j("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            supportSQLiteOpenHelper = z11244019023321623390.create(new SupportSQLiteOpenHelper.Configuration(i574271773787654072.a, str, new T17032536773975598836(this, y7729682184936279366.a), false, false));
            this.g = supportSQLiteOpenHelper;
            this.f = new T17829739910898216201(new M9197813449740923653(supportSQLiteOpenHelper), str == null ? SQLiteDatabaseConfiguration.MEMORY_DB_PATH : str, j7674436703016904089);
        }
        boolean z = t4723177084556306713 == T4723177084556306713.b;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
    }

    public R3533078172067811153(I574271773787654072 i574271773787654072, V3436737973405206042 v3436737973405206042, J7674436703016904089 j7674436703016904089) {
        this.c = i574271773787654072;
        this.d = new U3236633452469786100(-1, "", "");
        List list = i574271773787654072.e;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        this.e = list == null ? o2161699089510411363 : list;
        R9411874267597469228.P0(list == null ? o2161699089510411363 : list, new Q12653136381087990415(new H8734584053421516944(this, (byte) 23)));
        Executor executor = i574271773787654072.h;
        Executor executor2 = i574271773787654072.i;
        executor.getClass();
        executor2.getClass();
        throw new X12144930698824946031(0);
    }
}
