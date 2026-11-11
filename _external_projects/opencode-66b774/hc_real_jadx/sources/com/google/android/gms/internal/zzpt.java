package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpt extends NativeAd.Image {
    private final Drawable mDrawable;
    private final Uri mUri;
    private final double zzbtr;
    private final zzpq zzbwd;

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:2|3)|(9:5|6|7|8|9|10|11|12|13)|22|6|7|8|9|10|11|12|13) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(9:5|6|7|8|9|10|11|12|13)|22|6|7|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        com.google.android.gms.internal.zzakb.zzb("Failed to get scale.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0023, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        com.google.android.gms.internal.zzakb.zzb("Failed to get uri.", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzpt(com.google.android.gms.internal.zzpq r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.zzbwd = r4
            r0 = 0
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.づざかべべ.げつ〴ぬぐ r4 = r4.zzjr()     // Catch: android.os.RemoteException -> L13
            if (r4 == 0) goto L19
            java.lang.Object r4 = p131.p161.p162.p193.p203.BinderC2454.m4502(r4)     // Catch: android.os.RemoteException -> L13
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: android.os.RemoteException -> L13
            goto L1a
        L13:
            r4 = move-exception
            java.lang.String r1 = "Failed to get drawable."
            com.google.android.gms.internal.zzakb.zzb(r1, r4)
        L19:
            r4 = r0
        L1a:
            r3.mDrawable = r4
            com.google.android.gms.internal.zzpq r4 = r3.zzbwd     // Catch: android.os.RemoteException -> L23
            android.net.Uri r0 = r4.getUri()     // Catch: android.os.RemoteException -> L23
            goto L29
        L23:
            r4 = move-exception
            java.lang.String r1 = "Failed to get uri."
            com.google.android.gms.internal.zzakb.zzb(r1, r4)
        L29:
            r3.mUri = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.google.android.gms.internal.zzpq r4 = r3.zzbwd     // Catch: android.os.RemoteException -> L34
            double r0 = r4.getScale()     // Catch: android.os.RemoteException -> L34
            goto L3a
        L34:
            r4 = move-exception
            java.lang.String r2 = "Failed to get scale."
            com.google.android.gms.internal.zzakb.zzb(r2, r4)
        L3a:
            r3.zzbtr = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzpt.<init>(com.google.android.gms.internal.zzpq):void");
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.mDrawable;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzbtr;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.mUri;
    }
}
