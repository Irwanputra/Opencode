package net.zetetic.database.sqlcipher.driver;

import androidx.sqlite.SQLiteConnection;
import dev.epro.r0.T3455454122937680569;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class SQLCipherDriver implements T3455454122937680569 {
    private final DatabaseErrorHandler handler;
    private final SQLiteDatabaseHook hook;
    private final byte[] passphrase;

    public SQLCipherDriver(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        this.passphrase = bArr;
        this.hook = sQLiteDatabaseHook;
        this.handler = databaseErrorHandler;
    }

    @Override // dev.epro.r0.T3455454122937680569
    public boolean hasConnectionPool() {
        return true;
    }

    @Override // dev.epro.r0.T3455454122937680569
    public SQLiteConnection open(String str) {
        return new SQLCipherConnection(SQLiteDatabase.openOrCreateDatabase(str, this.passphrase, (SQLiteDatabase.CursorFactory) null, this.handler, this.hook));
    }
}
