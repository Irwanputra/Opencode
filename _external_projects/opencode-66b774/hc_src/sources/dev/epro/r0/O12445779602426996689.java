package dev.epro.r0;

import android.net.Uri;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class O12445779602426996689 {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(android.content.Context r3, dev.epro.r0.B7526239878873455655 r4) {
        /*
            java.lang.String r0 = r4.a
            r1 = 0
            if (r0 != 0) goto Lf
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r3 = r3.setComponent(r1)
            return r3
        Lf:
            boolean r4 = r4.b
            if (r4 == 0) goto L87
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r2 = "serviceActionBundleKey"
            r4.putString(r2, r0)
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            android.net.Uri r2 = dev.epro.r0.O12445779602426996689.a     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            android.content.ContentProviderClient r3 = r3.acquireUnstableContentProviderClient(r2)     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            if (r3 == 0) goto L3c
            java.lang.String r2 = "serviceIntentCall"
            android.os.Bundle r4 = r3.call(r2, r1, r4)     // Catch: java.lang.Throwable -> L37
            r3.release()     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            goto L4e
        L33:
            r3 = move-exception
            goto L44
        L35:
            r3 = move-exception
            goto L44
        L37:
            r4 = move-exception
            r3.release()     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            throw r4     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
        L3c:
            android.os.RemoteException r3 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            java.lang.String r4 = "Failed to acquire ContentProviderClient"
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            throw r3     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
        L44:
            java.lang.String r4 = "Dynamic intent resolution failed: "
            java.lang.String r3 = r3.toString()
            r4.concat(r3)
            r4 = r1
        L4e:
            if (r4 != 0) goto L51
            goto L67
        L51:
            java.lang.String r3 = "serviceResponseIntentKey"
            android.os.Parcelable r3 = r4.getParcelable(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            if (r3 == 0) goto L5d
            r1 = r3
            goto L67
        L5d:
            java.lang.String r3 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r3 = r4.getParcelable(r3)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            if (r3 != 0) goto L6f
        L67:
            if (r1 != 0) goto L87
            java.lang.String r3 = "Dynamic lookup for intent failed for action: "
            r3.concat(r0)
            goto L87
        L6f:
            int r4 = r0.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r4 = r4 + 72
            r0.<init>(r4)
            dev.epro.r0.E6645929122040922099 r4 = new dev.epro.r0.E6645929122040922099
            dev.epro.r0.B6867906687934285025 r0 = new dev.epro.r0.B6867906687934285025
            r2 = 25
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            throw r4
        L87:
            if (r1 != 0) goto L95
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            java.lang.String r4 = "com.google.android.gms"
            android.content.Intent r3 = r3.setPackage(r4)
            return r3
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O12445779602426996689.a(android.content.Context, dev.epro.r0.B7526239878873455655):android.content.Intent");
    }
}
