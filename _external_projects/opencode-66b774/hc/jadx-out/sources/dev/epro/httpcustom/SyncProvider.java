package dev.epro.httpcustom;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class SyncProvider extends ContentProvider {
    public static final int $stable = 8;

    static {
        izmyclvb.oeynnivvrnts0(1070);
    }

    private native void tinldysxpjoq();

    @Override // android.content.ContentProvider
    public native int delete(Uri uri, String str, String[] strArr);

    @Override // android.content.ContentProvider
    public native String getType(Uri uri);

    @Override // android.content.ContentProvider
    public native Uri insert(Uri uri, ContentValues contentValues);

    @Override // android.content.ContentProvider
    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public native Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    @Override // android.content.ContentProvider
    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);

    public SyncProvider() {
        tinldysxpjoq();
    }
}
