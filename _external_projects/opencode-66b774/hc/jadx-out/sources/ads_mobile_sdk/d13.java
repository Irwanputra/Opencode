package ads_mobile_sdk;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class d13 {
    public static final String[] a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    public static final String[] b;
    public static final String[] c;

    static {
        String str = Build.HARDWARE;
        b = new String[]{"media", (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        int i = Build.VERSION.SDK_INT;
        c = new String[]{i <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "", i <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r7, android.os.ParcelFileDescriptor r8, android.net.Uri r9, ads_mobile_sdk.c13 r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d13.a(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, ads_mobile_sdk.c13):void");
    }
}
