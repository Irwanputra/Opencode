package dev.epro.r0;

import androidx.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F2048878279943039499 implements SQLiteStatement {
    public final SQLiteStatement a;

    public F2048878279943039499(SQLiteStatement sQLiteStatement) {
        this.a = sQLiteStatement;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindDouble(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindLong(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindNull(int i) {
        this.a.bindNull(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindText(int i, String str) {
        str.getClass();
        this.a.bindText(i, str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void clearBindings() {
        this.a.clearBindings();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        SQLiteStatement sQLiteStatement = this.a;
        sQLiteStatement.reset();
        sQLiteStatement.clearBindings();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean getBoolean(int i) {
        return this.a.getBoolean(0);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnType(int i) {
        return this.a.getColumnType(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getText(int i) {
        return this.a.getText(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void reset() {
        this.a.reset();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean step() {
        return this.a.step();
    }
}
