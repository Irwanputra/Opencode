package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzor extends zzow {
    private Object mLock;
    private zzvj zzbuo;
    private zzvm zzbup;
    private final zzot zzbuq;
    private zzos zzbur;
    private boolean zzbus;

    private zzor(Context context, zzot zzotVar, zzcv zzcvVar, zzou zzouVar) {
        super(context, zzotVar, null, zzcvVar, null, zzouVar, null, null);
        this.zzbus = false;
        this.mLock = new Object();
        this.zzbuq = zzotVar;
    }

    public zzor(Context context, zzot zzotVar, zzcv zzcvVar, zzvj zzvjVar, zzou zzouVar) {
        this(context, zzotVar, zzcvVar, zzouVar);
        this.zzbuo = zzvjVar;
    }

    public zzor(Context context, zzot zzotVar, zzcv zzcvVar, zzvm zzvmVar, zzou zzouVar) {
        this(context, zzotVar, zzcvVar, zzouVar);
        this.zzbup = zzvmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r4 = null;
     */
    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View zza(android.view.View.OnClickListener r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.google.android.gms.internal.zzos r1 = r2.zzbur     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto Ld
            android.view.View r3 = r1.zza(r3, r4)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        Ld:
            r3 = 0
            com.google.android.gms.internal.zzvj r4 = r2.zzbuo     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L33
            if (r4 == 0) goto L17
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.づざかべべ.げつ〴ぬぐ r4 = r4.zzmk()     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L33
            goto L27
        L17:
            com.google.android.gms.internal.zzvm r4 = r2.zzbup     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L33
            if (r4 == 0) goto L26
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.づざかべべ.げつ〴ぬぐ r4 = r4.zzmk()     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L33
            goto L27
        L20:
            r4 = move-exception
            java.lang.String r1 = "Failed to call getAdChoicesContent"
            com.google.android.gms.internal.zzakb.zzc(r1, r4)     // Catch: java.lang.Throwable -> L33
        L26:
            r4 = r3
        L27:
            if (r4 == 0) goto L31
            java.lang.Object r3 = p131.p161.p162.p193.p203.BinderC2454.m4502(r4)     // Catch: java.lang.Throwable -> L33
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        L33:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzor.zza(android.view.View$OnClickListener, boolean):android.view.View");
    }

    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    public final void zza(View view, Map<String, WeakReference<View>> map) {
        zzot zzotVar;
        C1687.m3716("recordImpression must be called on the main UI thread.");
        synchronized (this.mLock) {
            this.zzbuw = true;
            zzos zzosVar = this.zzbur;
            if (zzosVar != null) {
                zzosVar.zza(view, map);
                this.zzbuq.recordImpression();
            } else {
                try {
                    zzvj zzvjVar = this.zzbuo;
                    if (zzvjVar == null || zzvjVar.getOverrideImpressionRecording()) {
                        zzvm zzvmVar = this.zzbup;
                        if (zzvmVar != null && !zzvmVar.getOverrideImpressionRecording()) {
                            this.zzbup.recordImpression();
                            zzotVar = this.zzbuq;
                        }
                    } else {
                        this.zzbuo.recordImpression();
                        zzotVar = this.zzbuq;
                    }
                    zzotVar.recordImpression();
                } catch (RemoteException e) {
                    zzakb.zzc("Failed to call recordImpression", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    public final void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C1687.m3716("performClick must be called on the main UI thread.");
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbur;
            if (zzosVar != null) {
                zzosVar.zza(view, map, bundle, view2);
                this.zzbuq.onAdClicked();
            } else {
                try {
                    zzvj zzvjVar = this.zzbuo;
                    if (zzvjVar != null && !zzvjVar.getOverrideClickHandling()) {
                        this.zzbuo.zzh(new BinderC2454(view));
                        this.zzbuq.onAdClicked();
                    }
                    zzvm zzvmVar = this.zzbup;
                    if (zzvmVar != null && !zzvmVar.getOverrideClickHandling()) {
                        this.zzbup.zzh(new BinderC2454(view));
                        this.zzbuq.onAdClicked();
                    }
                } catch (RemoteException e) {
                    zzakb.zzc("Failed to call performClick", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    public final void zzb(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.mLock) {
            try {
                zzvj zzvjVar = this.zzbuo;
                if (zzvjVar != null) {
                    zzvjVar.zzj(new BinderC2454(view));
                } else {
                    zzvm zzvmVar = this.zzbup;
                    if (zzvmVar != null) {
                        zzvmVar.zzj(new BinderC2454(view));
                    }
                }
            } catch (RemoteException e) {
                zzakb.zzc("Failed to call untrackView", e);
            }
        }
    }

    public final void zzc(zzos zzosVar) {
        synchronized (this.mLock) {
            this.zzbur = zzosVar;
        }
    }

    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    public final boolean zzkc() {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbur;
            if (zzosVar != null) {
                return zzosVar.zzkc();
            }
            return this.zzbuq.zzcw();
        }
    }

    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    public final boolean zzkd() {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbur;
            if (zzosVar != null) {
                return zzosVar.zzkd();
            }
            return this.zzbuq.zzcx();
        }
    }

    public final boolean zzke() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzbus;
        }
        return z;
    }

    public final zzos zzkf() {
        zzos zzosVar;
        synchronized (this.mLock) {
            zzosVar = this.zzbur;
        }
        return zzosVar;
    }

    @Override // com.google.android.gms.internal.zzow
    public final zzanh zzkg() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    public final void zzkh() {
    }

    @Override // com.google.android.gms.internal.zzow, com.google.android.gms.internal.zzos
    public final void zzki() {
    }

    @Override // com.google.android.gms.internal.zzow
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.mLock) {
            this.zzbus = true;
            try {
                zzvj zzvjVar = this.zzbuo;
                if (zzvjVar != null) {
                    zzvjVar.zzi(new BinderC2454(view));
                } else {
                    zzvm zzvmVar = this.zzbup;
                    if (zzvmVar != null) {
                        zzvmVar.zzi(new BinderC2454(view));
                    }
                }
            } catch (RemoteException e) {
                zzakb.zzc("Failed to call prepareAd", e);
            }
            this.zzbus = false;
        }
    }
}
