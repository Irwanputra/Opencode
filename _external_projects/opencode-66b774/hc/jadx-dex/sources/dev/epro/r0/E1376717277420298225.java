package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E1376717277420298225 extends dev.epro.r0.R16659805086402753450 implements androidx.sqlite.db.SupportSQLiteStatement {
    public final android.database.sqlite.SQLiteStatement b;

    public E1376717277420298225(android.database.sqlite.SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.b.execute();
    }
}
