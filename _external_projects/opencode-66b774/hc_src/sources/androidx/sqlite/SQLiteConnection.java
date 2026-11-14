package androidx.sqlite;

import dev.epro.r0.X12144930698824946031;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public interface SQLiteConnection extends AutoCloseable {
    default boolean inTransaction() {
        throw new X12144930698824946031(this + " does not implement inTransaction().");
    }

    SQLiteStatement prepare(String str);
}
