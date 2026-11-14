package net.zetetic.database.sqlcipher;

import dev.epro.r0.S10973172697741180971;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class SQLiteDatabaseConfiguration {
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    public static final String MEMORY_DB_PATH = ":memory:";
    public final ArrayList<SQLiteCustomFunction> customFunctions;
    public SQLiteDatabaseHook databaseHook;
    public boolean foreignKeyConstraintsEnabled;
    public final String label;
    public Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public byte[] password;
    public final String path;

    public SQLiteDatabaseConfiguration(String str, int i, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.customFunctions = new ArrayList<>();
        if (str == null) {
            S10973172697741180971.j("path must not be null.");
            throw null;
        }
        this.path = str;
        this.label = stripPathForLogs(str);
        this.openFlags = i;
        this.password = bArr;
        this.databaseHook = sQLiteDatabaseHook;
        this.maxSqlCacheSize = 25;
        this.locale = Locale.getDefault();
    }

    private static String stripPathForLogs(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf >= 0) {
            str = (String) str.subSequence(0, indexOf);
        }
        return str.indexOf(64) == -1 ? str : EMAIL_IN_DB_PATTERN.matcher(str).replaceAll("XX@YY");
    }

    public boolean isInMemoryDb() {
        return this.path.equalsIgnoreCase(MEMORY_DB_PATH);
    }

    public void updateParametersFrom(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            S10973172697741180971.j("other must not be null.");
            return;
        }
        if (!this.path.equals(sQLiteDatabaseConfiguration.path)) {
            S10973172697741180971.j("other configuration must refer to the same database.");
            return;
        }
        this.openFlags = sQLiteDatabaseConfiguration.openFlags;
        this.maxSqlCacheSize = sQLiteDatabaseConfiguration.maxSqlCacheSize;
        this.locale = sQLiteDatabaseConfiguration.locale;
        this.foreignKeyConstraintsEnabled = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
        this.password = sQLiteDatabaseConfiguration.password;
        this.databaseHook = sQLiteDatabaseConfiguration.databaseHook;
        this.customFunctions.clear();
        this.customFunctions.addAll(sQLiteDatabaseConfiguration.customFunctions);
    }

    public SQLiteDatabaseConfiguration(String str, int i) {
        this(str, i, null, null);
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.customFunctions = new ArrayList<>();
        if (sQLiteDatabaseConfiguration != null) {
            this.path = sQLiteDatabaseConfiguration.path;
            this.label = sQLiteDatabaseConfiguration.label;
            updateParametersFrom(sQLiteDatabaseConfiguration);
            return;
        }
        S10973172697741180971.j("other must not be null.");
        throw null;
    }
}
