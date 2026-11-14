package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K9419718790619213063 implements SQLiteConnection {
    public final SupportSQLiteDatabase a;

    public K9419718790619213063(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        this.a = supportSQLiteDatabase;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final boolean inTransaction() {
        return this.a.inTransaction();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    @Override // androidx.sqlite.SQLiteConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.sqlite.SQLiteStatement prepare(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K9419718790619213063.prepare(java.lang.String):androidx.sqlite.SQLiteStatement");
    }
}
