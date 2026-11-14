package net.zetetic.database.sqlcipher.driver;

import android.database.Cursor;
import android.database.SQLException;
import androidx.sqlite.SQLiteStatement;
import dev.epro.r0.S10973172697741180971;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class SQLCipherStatement implements SQLiteStatement {
    private final Map<Integer, Object> bindings = new LinkedHashMap();
    private boolean closed;
    private Cursor cursor;
    private final SQLiteDatabase database;
    private final String sql;
    private boolean stepped;

    public SQLCipherStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.database = sQLiteDatabase;
        this.sql = str;
    }

    private void createCursor() {
        Iterator<Integer> it = this.bindings.keySet().iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().intValue());
        }
        Object[] objArr = new Object[iMax];
        for (int i = 1; i <= iMax; i++) {
            objArr[i - 1] = this.bindings.get(Integer.valueOf(i));
        }
        this.cursor = this.database.rawQuery(this.sql, objArr);
    }

    private Cursor requireCursor() {
        Cursor cursor;
        if (this.stepped && (cursor = this.cursor) != null) {
            return cursor;
        }
        S10973172697741180971.m("step() must be called before reading column values");
        return null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBlob(int i, byte[] bArr) {
        this.bindings.put(Integer.valueOf(i), bArr);
    }

    public void bindBoolean(int i, boolean z) {
        bindLong(i, z ? 1L : 0L);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindDouble(int i, double d) {
        this.bindings.put(Integer.valueOf(i), Double.valueOf(d));
    }

    public void bindFloat(int i, float f) {
        bindDouble(i, f);
    }

    public void bindInt(int i, int i2) {
        bindLong(i, i2);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindLong(int i, long j) {
        this.bindings.put(Integer.valueOf(i), Long.valueOf(j));
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindNull(int i) {
        this.bindings.put(Integer.valueOf(i), null);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindText(int i, String str) {
        this.bindings.put(Integer.valueOf(i), str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void clearBindings() {
        this.bindings.clear();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int i) {
        return requireCursor().getBlob(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) {
        return super.getBoolean(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        if (this.cursor == null) {
            createCursor();
        }
        return this.cursor.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int i) {
        if (this.cursor == null) {
            createCursor();
        }
        return this.cursor.getColumnName(i);
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
        return requireCursor().getType(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i) {
        return requireCursor().getDouble(i);
    }

    public float getFloat(int i) {
        return (float) getDouble(i);
    }

    public int getInt(int i) {
        return (int) getLong(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i) {
        return requireCursor().getLong(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int i) {
        return requireCursor().getString(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i) {
        return requireCursor().isNull(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        Cursor cursor = this.cursor;
        if (cursor != null) {
            cursor.close();
            this.cursor = null;
        }
        this.stepped = false;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        if (this.closed) {
            throw new SQLException("statement is closed");
        }
        Cursor cursorRawQuery = this.cursor;
        if (cursorRawQuery == null) {
            Iterator<Integer> it = this.bindings.keySet().iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, it.next().intValue());
            }
            Object[] objArr = new Object[iMax];
            for (int i = 1; i <= iMax; i++) {
                objArr[i - 1] = this.bindings.get(Integer.valueOf(i));
            }
            cursorRawQuery = this.database.rawQuery(this.sql, objArr);
            this.cursor = cursorRawQuery;
        }
        boolean zMoveToNext = cursorRawQuery.moveToNext();
        this.stepped = zMoveToNext;
        return zMoveToNext;
    }
}
