package androidx.startup;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.M8821877208104636290 */
    @Override // android.content.ContentProvider
    public final boolean onCreate() throws dev.epro.r0.M8821877208104636290 {
        android.content.Context context = getContext();
        if (context == null) {
            throw new dev.epro.r0.M8821877208104636290("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        dev.epro.r0.Q7316561721656982910 q7316561721656982910D = dev.epro.r0.Q7316561721656982910.D(context);
        java.lang.Class<?> cls = getClass();
        android.content.Context context2 = (android.content.Context) q7316561721656982910D.d;
        try {
            try {
                android.os.Trace.beginSection(dev.epro.r0.U8836654130139556418.B("Startup"));
                q7316561721656982910D.w(context2.getPackageManager().getProviderInfo(new android.content.ComponentName(context2, cls), 128).metaData);
                return true;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new dev.epro.r0.M8821877208104636290(e);
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }
}
