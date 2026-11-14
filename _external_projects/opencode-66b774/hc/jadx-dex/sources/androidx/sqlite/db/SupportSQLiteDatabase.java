package androidx.sqlite.db;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface SupportSQLiteDatabase extends java.io.Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    default void beginTransactionReadOnly() {
        beginTransaction();
    }

    androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String str);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execSQL(java.lang.String str);

    void execSQL(java.lang.String str, java.lang.Object[] objArr);

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery);

    void setTransactionSuccessful();

    int update(java.lang.String str, int i, android.content.ContentValues contentValues, java.lang.String str2, java.lang.Object[] objArr);
}
