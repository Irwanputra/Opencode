package dev.epro.r0;

import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S4654969512817416603 implements SQLiteStatement {
    public final SupportSQLiteDatabase a;
    public final String b;
    public boolean c;

    public S4654969512817416603(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.a = supportSQLiteDatabase;
        this.b = str;
    }

    public final void b() {
        if (this.c) {
            S12227320117525376577.w(21, "statement is closed");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void clearBindings() {
        b();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        b();
    }
}
