package dev.epro.r0;

import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class W11288346261755796115 {
    public void a(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        supportSQLiteDatabase.beginTransaction();
        try {
            supportSQLiteDatabase.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            supportSQLiteDatabase.setTransactionSuccessful();
        } finally {
            supportSQLiteDatabase.endTransaction();
        }
    }
}
