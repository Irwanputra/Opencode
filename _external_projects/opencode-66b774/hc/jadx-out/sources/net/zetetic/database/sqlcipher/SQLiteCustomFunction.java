package net.zetetic.database.sqlcipher;

import dev.epro.r0.S10973172697741180971;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class SQLiteCustomFunction {
    public final SQLiteDatabase.CustomFunction callback;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            S10973172697741180971.j("name must not be null.");
            throw null;
        }
        this.name = str;
        this.numArgs = i;
        this.callback = customFunction;
    }

    private void dispatchCallback(String[] strArr) {
        this.callback.callback(strArr);
    }
}
