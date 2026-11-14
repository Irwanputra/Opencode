package net.zetetic.database.sqlcipher.driver;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public class SQLCipherConnection implements SQLiteConnection {
    private final SQLiteDatabase database;

    public SQLCipherConnection(SQLiteDatabase sQLiteDatabase) {
        this.database = sQLiteDatabase;
    }

    public static boolean isJournalModeSet(String str, String str2) {
        String lowerCase;
        int indexOf;
        return "PRA".equalsIgnoreCase(str) && (indexOf = (lowerCase = str2.toLowerCase()).indexOf("journal_mode")) >= 0 && lowerCase.indexOf(61, indexOf) >= 0;
    }

    public static String statementPrefix(String str) {
        int i;
        int length = str.length() - 2;
        if (length < 0) {
            return null;
        }
        int i2 = 0;
        while (i2 >= 0 && i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt > ' ') {
                if (charAt != '-') {
                    if (charAt != '/') {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (str.charAt(i3) != '*') {
                        break;
                    }
                    do {
                        i3 = str.indexOf(42, i3 + 1);
                        if (i3 >= 0) {
                            i = i3 + 1;
                            if (i >= length) {
                                break;
                            }
                        } else {
                            return null;
                        }
                    } while (str.charAt(i) != '/');
                    i2 = i3 + 2;
                } else {
                    if (str.charAt(i2 + 1) != '-') {
                        break;
                    }
                    i2 = str.indexOf(10, i2 + 2);
                    if (i2 < 0) {
                        return null;
                    }
                }
            }
            i2++;
        }
        if (i2 < 0 || i2 >= str.length()) {
            return null;
        }
        return str.substring(i2, Math.min(i2 + 3, str.length()));
    }

    public void changePassword(byte[] bArr) {
        this.database.changePassword(bArr);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.database.close();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public boolean inTransaction() {
        return this.database.inTransaction();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SQLiteStatement prepare(String str) {
        String trim = str.trim();
        String statementPrefix = statementPrefix(trim);
        if (statementPrefix == null || !isJournalModeSet(statementPrefix, trim)) {
            return new SQLCipherStatement(this.database, str);
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        return new JournalModeStatement(sQLiteDatabase, new SQLCipherStatement(sQLiteDatabase, str));
    }
}
