package dev.epro.r0;

import androidx.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R17078453977115634759 implements SQLiteStatement {
    public final SQLiteStatement a;
    public final long b;
    public final /* synthetic */ R13852894593656905185 c;

    public R17078453977115634759(R13852894593656905185 r13852894593656905185, SQLiteStatement sQLiteStatement) {
        sQLiteStatement.getClass();
        this.c = r13852894593656905185;
        this.a = sQLiteStatement;
        this.b = M14643676963617488237.f();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.bindBlob(i, bArr);
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindDouble(int i, double d) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.bindDouble(i, d);
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindLong(int i, long j) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.bindLong(i, j);
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindNull(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.bindNull(i);
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindText(int i, String str) {
        str.getClass();
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.bindText(i, str);
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void clearBindings() {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.clearBindings();
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.close();
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final byte[] getBlob(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.getBlob(i);
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnCount() {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.getColumnCount();
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getColumnName(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.getColumnName(i);
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnType(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.getColumnType(i);
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final double getDouble(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.getDouble(i);
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final long getLong(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.getLong(i);
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getText(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.getText(i);
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean isNull(int i) {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.isNull(i);
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void reset() {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            this.a.reset();
        } else {
            S12227320117525376577.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean step() {
        if (this.c.e) {
            S12227320117525376577.w(21, "Statement is recycled");
            throw null;
        }
        if (this.b == M14643676963617488237.f()) {
            return this.a.step();
        }
        S12227320117525376577.w(21, "Attempted to use statement on a different thread");
        throw null;
    }
}
