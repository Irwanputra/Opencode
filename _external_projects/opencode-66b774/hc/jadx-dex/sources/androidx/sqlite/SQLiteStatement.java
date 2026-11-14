package androidx.sqlite;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface SQLiteStatement extends java.lang.AutoCloseable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindText(int i, java.lang.String str);

    void clearBindings();

    byte[] getBlob(int i);

    default boolean getBoolean(int i) {
        return getLong(i) != 0;
    }

    int getColumnCount();

    java.lang.String getColumnName(int i);

    int getColumnType(int i);

    double getDouble(int i);

    long getLong(int i);

    java.lang.String getText(int i);

    boolean isNull(int i);

    void reset();

    boolean step();
}
