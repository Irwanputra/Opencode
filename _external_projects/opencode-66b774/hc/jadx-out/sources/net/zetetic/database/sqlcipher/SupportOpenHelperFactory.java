package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.Z11244019023321623390;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class SupportOpenHelperFactory implements Z11244019023321623390 {
    private static final int UNCHANGED = -1;
    private final boolean enableWriteAheadLogging;
    private final SQLiteDatabaseHook hook;
    private final int minimumSupportedVersion;
    private final byte[] password;

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.password = bArr;
        this.hook = sQLiteDatabaseHook;
        this.enableWriteAheadLogging = z;
        this.minimumSupportedVersion = i;
    }

    @Override // androidx.sqlite.db.Z11244019023321623390
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        int i = this.minimumSupportedVersion;
        byte[] bArr = this.password;
        return i == -1 ? new SupportHelper(configuration, bArr, this.hook, this.enableWriteAheadLogging) : new SupportHelper(configuration, bArr, this.hook, this.enableWriteAheadLogging, i);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(bArr, sQLiteDatabaseHook, z, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }
}
