package net.zetetic.database;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public interface LogTarget {
    boolean isLoggable(String str, int i);

    void log(int i, String str, String str2, Throwable th);
}
