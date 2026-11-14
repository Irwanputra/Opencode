package dev.epro.r0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y10303107381558964979 extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final F6942723054099263096 b;
    public final T17032536773975598836 c;
    public final boolean d;
    public boolean e;
    public final Y11572670959508953935 f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y10303107381558964979(Context context, String str, final F6942723054099263096 f6942723054099263096, final T17032536773975598836 t17032536773975598836, boolean z) {
        String string;
        super(context, str, null, t17032536773975598836.a, new DatabaseErrorHandler() { // from class: dev.epro.r0.L7314663461271194283
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = Y10303107381558964979.h;
                sQLiteDatabase.getClass();
                F6942723054099263096 f69427230540992630962 = f6942723054099263096;
                K4208957213304427756 k4208957213304427756 = (K4208957213304427756) f69427230540992630962.b;
                if (k4208957213304427756 == null || !k4208957213304427756.a.equals(sQLiteDatabase)) {
                    k4208957213304427756 = new K4208957213304427756(sQLiteDatabase);
                    f69427230540992630962.b = k4208957213304427756;
                }
                SQLiteDatabase sQLiteDatabase2 = k4208957213304427756.a;
                t17032536773975598836.getClass();
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        T17032536773975598836.e(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                T17032536773975598836.e((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                T17032536773975598836.e(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    k4208957213304427756.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        t17032536773975598836.getClass();
        this.a = context;
        this.b = f6942723054099263096;
        this.c = t17032536773975598836;
        this.d = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.f = new Y11572670959508953935(string, context.getCacheDir(), false);
    }

    public final SupportSQLiteDatabase b(boolean z) {
        Y11572670959508953935 y11572670959508953935 = this.f;
        try {
            y11572670959508953935.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase sQLiteDatabaseD = d(z);
            if (!this.e) {
                K4208957213304427756 k4208957213304427756C = c(sQLiteDatabaseD);
                y11572670959508953935.b();
                return k4208957213304427756C;
            }
            close();
            SupportSQLiteDatabase supportSQLiteDatabaseB = b(z);
            y11572670959508953935.b();
            return supportSQLiteDatabaseB;
        } catch (Throwable th) {
            y11572670959508953935.b();
            throw th;
        }
    }

    public final K4208957213304427756 c(SQLiteDatabase sQLiteDatabase) {
        F6942723054099263096 f6942723054099263096 = this.b;
        K4208957213304427756 k4208957213304427756 = (K4208957213304427756) f6942723054099263096.b;
        if (k4208957213304427756 != null && k4208957213304427756.a.equals(sQLiteDatabase)) {
            return k4208957213304427756;
        }
        K4208957213304427756 k42089572133044277562 = new K4208957213304427756(sQLiteDatabase);
        f6942723054099263096.b = k42089572133044277562;
        return k42089572133044277562;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        Y11572670959508953935 y11572670959508953935 = this.f;
        try {
            y11572670959508953935.a(y11572670959508953935.a);
            super.close();
            this.b.b = null;
            this.g = false;
        } finally {
            y11572670959508953935.b();
        }
    }

    public final SQLiteDatabase d(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof S16939415702289458164) {
                    S16939415702289458164 s16939415702289458164 = (S16939415702289458164) th;
                    int iOrdinal = s16939415702289458164.a.ordinal();
                    th = s16939415702289458164.b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        Z3383101362411723454.g();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (S16939415702289458164 e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.e;
        T17032536773975598836 t17032536773975598836 = this.c;
        if (!z && t17032536773975598836.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            c(sQLiteDatabase);
            t17032536773975598836.getClass();
        } catch (Throwable th) {
            throw new S16939415702289458164(L17978943920422105913.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.h(c(sQLiteDatabase));
        } catch (Throwable th) {
            throw new S16939415702289458164(L17978943920422105913.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.i(c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new S16939415702289458164(L17978943920422105913.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                this.c.j(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new S16939415702289458164(L17978943920422105913.e, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.k(c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new S16939415702289458164(L17978943920422105913.c, th);
        }
    }
}
