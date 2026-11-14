package dev.epro.r0;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O12445779602426996689 {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, B7526239878873455655 b7526239878873455655) throws E6645929122040922099 {
        Bundle bundleCall;
        String str = b7526239878873455655.a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (b7526239878873455655.b) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e) {
                e = e;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
            if (bundleCall != null) {
                Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                if (intent2 != null) {
                    intent = intent2;
                } else {
                    PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                    if (pendingIntent != null) {
                        new StringBuilder(str.length() + 72);
                        throw new E6645929122040922099(new B6867906687934285025(25, pendingIntent, null));
                    }
                }
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(str);
            }
        }
        return intent == null ? new Intent(str).setPackage("com.google.android.gms") : intent;
    }
}
