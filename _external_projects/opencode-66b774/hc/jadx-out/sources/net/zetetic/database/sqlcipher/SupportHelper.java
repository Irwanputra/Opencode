package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class SupportHelper implements SupportSQLiteOpenHelper {
    private SQLiteOpenHelper openHelper;

    public SupportHelper(final SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.openHelper = new SQLiteOpenHelper(configuration.a, configuration.b, bArr, null, configuration.c.a, i, null, sQLiteDatabaseHook, z) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                configuration.c.getClass();
                sQLiteDatabase.getClass();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                configuration.c.h(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.c.i(sQLiteDatabase, i2, i3);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                configuration.c.j(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.c.k(sQLiteDatabase, i2, i3);
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.openHelper.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.openHelper.getDatabaseName();
    }

    public SupportSQLiteDatabase getReadableDatabase() {
        return this.openHelper.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return this.openHelper.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.openHelper.setWriteAheadLoggingEnabled(z);
    }

    public SupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(configuration, bArr, sQLiteDatabaseHook, z, 0);
    }
}
