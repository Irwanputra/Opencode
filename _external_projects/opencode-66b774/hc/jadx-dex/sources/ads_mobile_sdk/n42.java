package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class n42 extends android.database.sqlite.SQLiteOpenHelper {
    public static final java.lang.String f = dev.epro.r0.M8927913404651150384.D0("\n      CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)\n      ").toString();
    public final dev.epro.r0.W5797197595347441198 a;
    public final dev.epro.r0.O16637889491137121389 b;
    public final ads_mobile_sdk.y42 c;
    public final ads_mobile_sdk.dn3 d;
    public final dev.epro.r0.H15186625828076266306 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n42(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, int i, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.y42 y42Var, ads_mobile_sdk.dn3 dn3Var) {
        super(context, "AdMobOfflineBufferedPings.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i);
        context.getClass();
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        y42Var.getClass();
        dn3Var.getClass();
        this.a = w5797197595347441198;
        this.b = o16637889491137121389;
        this.c = y42Var;
        this.d = dn3Var;
        this.e = new dev.epro.r0.H15186625828076266306();
    }

    public final java.lang.String[] a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new java.lang.String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
        cursorQuery.getClass();
        java.lang.String[] strArr = new java.lang.String[cursorQuery.getCount()];
        int i = 0;
        while (cursorQuery.moveToNext()) {
            int columnIndex = cursorQuery.getColumnIndex("timestamp");
            int columnIndex2 = cursorQuery.getColumnIndex("url");
            if (columnIndex2 != -1) {
                long j = cursorQuery.getLong(columnIndex);
                java.lang.String string = cursorQuery.getString(columnIndex2);
                string.getClass();
                android.net.Uri uri = android.net.Uri.parse(string);
                this.b.getClass();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
                java.lang.String encodedQuery = uri.getEncodedQuery();
                android.net.Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                builderClearQuery.appendQueryParameter("bd", java.lang.String.valueOf(jElapsedRealtime));
                strArr[i] = builderClearQuery.build().toString() + "&" + encodedQuery;
            }
            i++;
        }
        cursorQuery.close();
        return strArr;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL(f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public static final void a(ads_mobile_sdk.n42 n42Var, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        n42Var.getClass();
        sQLiteDatabase.beginTransaction();
        try {
            java.lang.String[] strArrA = n42Var.a(sQLiteDatabase);
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new java.lang.String[]{java.lang.String.valueOf(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (java.lang.String str : strArrA) {
                if (str != null) {
                    ads_mobile_sdk.dn3 dn3Var = n42Var.d;
                    android.net.Uri uri = android.net.Uri.parse(str);
                    uri.getClass();
                    dn3Var.getClass();
                    dn3Var.e.a(new dev.epro.r0.H9390398899829886498(uri, (java.lang.Object) null));
                }
            }
        } catch (java.lang.Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }
}
