package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import java.util.ArrayList;
import java.util.List;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzql extends NativeContentAd {
    private final NativeAd.AdChoicesInfo zzbwh;
    private final zzqi zzbwi;
    private final zzpt zzbwj;
    private final List<NativeAd.Image> zzbwf = new ArrayList();
    private final VideoController zzbgd = new VideoController();

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(3:2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6)))|(2:24|25)|(7:27|28|29|30|(2:32|33)|35|36)|41|28|29|30|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        com.google.android.gms.internal.zzakb.zzb("Failed to get attribution info.", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: RemoteException -> 0x0081, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0081, blocks: (B:30:0x006c, B:32:0x0074), top: B:29:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzql(com.google.android.gms.internal.zzqi r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to get image."
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzbwf = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzbgd = r1
            r5.zzbwi = r6
            r1 = 0
            java.util.List r6 = r6.getImages()     // Catch: android.os.RemoteException -> L53
            if (r6 == 0) goto L57
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L53
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L57
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L53
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L53
            if (r3 == 0) goto L45
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L45
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L53
            boolean r4 = r3 instanceof com.google.android.gms.internal.zzpq     // Catch: android.os.RemoteException -> L53
            if (r4 == 0) goto L3f
            com.google.android.gms.internal.zzpq r3 = (com.google.android.gms.internal.zzpq) r3     // Catch: android.os.RemoteException -> L53
            goto L46
        L3f:
            com.google.android.gms.internal.zzps r3 = new com.google.android.gms.internal.zzps     // Catch: android.os.RemoteException -> L53
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L53
            goto L46
        L45:
            r3 = r1
        L46:
            if (r3 == 0) goto L20
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.zzbwf     // Catch: android.os.RemoteException -> L53
            com.google.android.gms.internal.zzpt r4 = new com.google.android.gms.internal.zzpt     // Catch: android.os.RemoteException -> L53
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L53
            r2.add(r4)     // Catch: android.os.RemoteException -> L53
            goto L20
        L53:
            r6 = move-exception
            com.google.android.gms.internal.zzakb.zzb(r0, r6)
        L57:
            com.google.android.gms.internal.zzqi r6 = r5.zzbwi     // Catch: android.os.RemoteException -> L65
            com.google.android.gms.internal.zzpq r6 = r6.zzjz()     // Catch: android.os.RemoteException -> L65
            if (r6 == 0) goto L69
            com.google.android.gms.internal.zzpt r2 = new com.google.android.gms.internal.zzpt     // Catch: android.os.RemoteException -> L65
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L65
            goto L6a
        L65:
            r6 = move-exception
            com.google.android.gms.internal.zzakb.zzb(r0, r6)
        L69:
            r2 = r1
        L6a:
            r5.zzbwj = r2
            com.google.android.gms.internal.zzqi r6 = r5.zzbwi     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.zzpm r6 = r6.zzjy()     // Catch: android.os.RemoteException -> L81
            if (r6 == 0) goto L87
            com.google.android.gms.internal.zzpp r6 = new com.google.android.gms.internal.zzpp     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.zzqi r0 = r5.zzbwi     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.zzpm r0 = r0.zzjy()     // Catch: android.os.RemoteException -> L81
            r6.<init>(r0)     // Catch: android.os.RemoteException -> L81
            r1 = r6
            goto L87
        L81:
            r6 = move-exception
            java.lang.String r0 = "Failed to get attribution info."
            com.google.android.gms.internal.zzakb.zzb(r0, r6)
        L87:
            r5.zzbwh = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzql.<init>(com.google.android.gms.internal.zzqi):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: zzjt, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2455 zzbl() {
        try {
            return this.zzbwi.zzjt();
        } catch (RemoteException e) {
            zzakb.zzb("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final void destroy() {
        try {
            this.zzbwi.destroy();
        } catch (RemoteException e) {
            zzakb.zzb("Failed to destroy", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzbwh;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getAdvertiser() {
        try {
            return this.zzbwi.getAdvertiser();
        } catch (RemoteException e) {
            zzakb.zzb("Failed to get attribution.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getBody() {
        try {
            return this.zzbwi.getBody();
        } catch (RemoteException e) {
            zzakb.zzb("Failed to get body.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getCallToAction() {
        try {
            return this.zzbwi.getCallToAction();
        } catch (RemoteException e) {
            zzakb.zzb("Failed to get call to action.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final Bundle getExtras() {
        try {
            return this.zzbwi.getExtras();
        } catch (RemoteException e) {
            zzakb.zzc("Failed to get extras", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getHeadline() {
        try {
            return this.zzbwi.getHeadline();
        } catch (RemoteException e) {
            zzakb.zzb("Failed to get headline.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final List<NativeAd.Image> getImages() {
        return this.zzbwf;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.Image getLogo() {
        return this.zzbwj;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzbwi.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzakb.zzb("Failed to get mediation adapter class name.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final VideoController getVideoController() {
        try {
            if (this.zzbwi.getVideoController() != null) {
                this.zzbgd.zza(this.zzbwi.getVideoController());
            }
        } catch (RemoteException e) {
            zzakb.zzb("Exception occurred while getting video controller", e);
        }
        return this.zzbgd;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzbwi.performClick(bundle);
        } catch (RemoteException e) {
            zzakb.zzb("Failed to perform click.", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzbwi.recordImpression(bundle);
        } catch (RemoteException e) {
            zzakb.zzb("Failed to record impression.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzbwi.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzakb.zzb("Failed to report touch event.", e);
        }
    }
}
