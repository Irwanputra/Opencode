package net.zetetic.database.sqlcipher.driver;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class SQLCipherConnection implements SQLiteConnection {
    private final SQLiteDatabase database;

    public SQLCipherConnection(SQLiteDatabase sQLiteDatabase) {
        this.database = sQLiteDatabase;
    }

    public static boolean isJournalModeSet(String str, String str2) {
        String lowerCase;
        int iIndexOf;
        return "PRA".equalsIgnoreCase(str) && (iIndexOf = (lowerCase = str2.toLowerCase()).indexOf("journal_mode")) >= 0 && lowerCase.indexOf(61, iIndexOf) >= 0;
    }

    public static String statementPrefix(String str) {
        int i;
        int length = str.length() - 2;
        if (length < 0) {
            return null;
        }
        int iIndexOf = 0;
        while (iIndexOf >= 0 && iIndexOf < length) {
            char cCharAt = str.charAt(iIndexOf);
            if (cCharAt > ' ') {
                if (cCharAt != '-') {
                    if (cCharAt != '/') {
                        break;
                    }
                    int iIndexOf2 = iIndexOf + 1;
                    if (str.charAt(iIndexOf2) != '*') {
                        break;
                    }
                    do {
                        iIndexOf2 = str.indexOf(42, iIndexOf2 + 1);
                        if (iIndexOf2 >= 0) {
                            i = iIndexOf2 + 1;
                            if (i >= length) {
                                break;
                            }
                        } else {
                            return null;
                        }
                    } while (str.charAt(i) != '/');
                    iIndexOf = iIndexOf2 + 2;
                } else {
                    if (str.charAt(iIndexOf + 1) != '-') {
                        break;
                    }
                    iIndexOf = str.indexOf(10, iIndexOf + 2);
                    if (iIndexOf < 0) {
                        return null;
                    }
                }
            }
            iIndexOf++;
        }
        if (iIndexOf < 0 || iIndexOf >= str.length()) {
            return null;
        }
        return str.substring(iIndexOf, Math.min(iIndexOf + 3, str.length()));
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
        String strTrim = str.trim();
        String strStatementPrefix = statementPrefix(strTrim);
        if (strStatementPrefix == null || !isJournalModeSet(strStatementPrefix, strTrim)) {
            return new SQLCipherStatement(this.database, str);
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        return new JournalModeStatement(sQLiteDatabase, new SQLCipherStatement(sQLiteDatabase, str));
    }
}
