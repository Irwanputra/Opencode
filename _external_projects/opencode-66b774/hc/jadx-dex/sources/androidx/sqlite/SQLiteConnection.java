package androidx.sqlite;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface SQLiteConnection extends java.lang.AutoCloseable {
    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.X12144930698824946031 */
    default boolean inTransaction() throws dev.epro.r0.X12144930698824946031 {
        throw new dev.epro.r0.X12144930698824946031(this + " does not implement inTransaction().");
    }

    androidx.sqlite.SQLiteStatement prepare(java.lang.String str);
}
