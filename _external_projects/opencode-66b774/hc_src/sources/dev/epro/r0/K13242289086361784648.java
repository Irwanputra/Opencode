package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class K13242289086361784648 {
    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public K13242289086361784648(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        if (!(sQLiteConnection instanceof K9419718790619213063)) {
            throw new X12144930698824946031("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((K9419718790619213063) sQLiteConnection).a);
    }

    public void b(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        throw new X12144930698824946031("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
