package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    default void beginTransactionReadOnly() {
        beginTransaction();
    }

    SupportSQLiteStatement compileStatement(String str);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    void setTransactionSuccessful();

    int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr);
}
