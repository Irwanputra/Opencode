package ads_mobile_sdk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.SystemClock;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class n42 extends SQLiteOpenHelper {
    public static final String f = M8927913404651150384.D0("\n      CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)\n      ").toString();
    public final W5797197595347441198 a;
    public final O16637889491137121389 b;
    public final y42 c;
    public final dn3 d;
    public final H15186625828076266306 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n42(Context context, W5797197595347441198 w5797197595347441198, int i, O16637889491137121389 o16637889491137121389, y42 y42Var, dn3 dn3Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, i);
        context.getClass();
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        y42Var.getClass();
        dn3Var.getClass();
        this.a = w5797197595347441198;
        this.b = o16637889491137121389;
        this.c = y42Var;
        this.d = dn3Var;
        this.e = new H15186625828076266306();
    }

    public final String[] a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
        cursorQuery.getClass();
        String[] strArr = new String[cursorQuery.getCount()];
        int i = 0;
        while (cursorQuery.moveToNext()) {
            int columnIndex = cursorQuery.getColumnIndex("timestamp");
            int columnIndex2 = cursorQuery.getColumnIndex("url");
            if (columnIndex2 != -1) {
                long j = cursorQuery.getLong(columnIndex);
                String string = cursorQuery.getString(columnIndex2);
                string.getClass();
                Uri uri = Uri.parse(string);
                this.b.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                String encodedQuery = uri.getEncodedQuery();
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                builderClearQuery.appendQueryParameter("bd", String.valueOf(jElapsedRealtime));
                strArr[i] = builderClearQuery.build().toString() + "&" + encodedQuery;
            }
            i++;
        }
        cursorQuery.close();
        return strArr;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL(f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public static final void a(n42 n42Var, SQLiteDatabase sQLiteDatabase) {
        n42Var.getClass();
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArrA = n42Var.a(sQLiteDatabase);
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{String.valueOf(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (String str : strArrA) {
                if (str != null) {
                    dn3 dn3Var = n42Var.d;
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    dn3Var.getClass();
                    dn3Var.e.a(new H9390398899829886498(uri, null));
                }
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }
}
