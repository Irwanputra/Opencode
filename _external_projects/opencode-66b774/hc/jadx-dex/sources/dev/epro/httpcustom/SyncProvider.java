package dev.epro.httpcustom;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class SyncProvider extends android.content.ContentProvider {
    public static final int $stable = 8;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1070);
    }

    private native void tinldysxpjoq();

    @Override // android.content.ContentProvider
    public native int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr);

    @Override // android.content.ContentProvider
    public native java.lang.String getType(android.net.Uri uri);

    @Override // android.content.ContentProvider
    public native android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues);

    @Override // android.content.ContentProvider
    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public native android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2);

    @Override // android.content.ContentProvider
    public native int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr);

    public SyncProvider() {
        tinldysxpjoq();
    }
}
