package net.zetetic.database.sqlcipher.driver;

import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
class JournalModeStatement implements SQLiteStatement {
    private final SQLiteDatabase database;
    private final SQLiteStatement delegate;

    public JournalModeStatement(SQLiteDatabase sQLiteDatabase, SQLiteStatement sQLiteStatement) {
        this.database = sQLiteDatabase;
        this.delegate = sQLiteStatement;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBlob(int i, byte[] bArr) {
        this.delegate.bindBlob(i, bArr);
    }

    public void bindBoolean(int i, boolean z) {
        bindLong(i, z ? 1L : 0L);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindDouble(int i, double d) {
        this.delegate.bindDouble(i, d);
    }

    public void bindFloat(int i, float f) {
        bindDouble(i, f);
    }

    public void bindInt(int i, int i2) {
        bindLong(i, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindLong(int i, long j) {
        this.delegate.bindLong(i, j);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindNull(int i) {
        this.delegate.bindNull(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindText(int i, String str) {
        this.delegate.bindText(i, str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void clearBindings() {
        this.delegate.clearBindings();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.delegate.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int i) {
        return this.delegate.getBlob(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) {
        return super.getBoolean(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int i) {
        return this.delegate.getColumnName(i);
    }

    public List getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(getColumnName(i));
        }
        return arrayList;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i) {
        return this.delegate.getColumnType(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i) {
        return this.delegate.getDouble(i);
    }

    public float getFloat(int i) {
        return (float) getDouble(i);
    }

    public int getInt(int i) {
        return (int) getLong(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i) {
        return this.delegate.getLong(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int i) {
        return this.delegate.getText(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i) {
        return this.delegate.isNull(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.delegate.reset();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        boolean zStep = this.delegate.step();
        boolean zEqualsIgnoreCase = "wal".equalsIgnoreCase(this.delegate.getText(0));
        SQLiteDatabase sQLiteDatabase = this.database;
        if (zEqualsIgnoreCase) {
            sQLiteDatabase.enableWriteAheadLogging();
            return zStep;
        }
        sQLiteDatabase.disableWriteAheadLogging();
        return zStep;
    }
}
