package com.google.android.gms.internal;

import android.os.RemoteException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaoc implements Runnable {
    private /* synthetic */ zzaoa zzdng;
    private /* synthetic */ int zzdnh;
    private /* synthetic */ int zzdni;
    private /* synthetic */ boolean zzdnj;
    private /* synthetic */ boolean zzdnk;

    public zzaoc(zzaoa zzaoaVar, int i, int i2, boolean z, boolean z2) {
        this.zzdng = zzaoaVar;
        this.zzdnh = i;
        this.zzdni = i2;
        this.zzdnj = z;
        this.zzdnk = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        zzlo zzloVar;
        zzlo zzloVar2;
        zzlo zzloVar3;
        zzlo zzloVar4;
        zzlo zzloVar5;
        zzlo zzloVar6;
        obj = this.zzdng.lock;
        synchronized (obj) {
            boolean z3 = this.zzdnh != this.zzdni;
            z = this.zzdng.zzdnc;
            boolean z4 = !z && this.zzdni == 1;
            boolean z5 = z3 && this.zzdni == 1;
            boolean z6 = z3 && this.zzdni == 2;
            boolean z7 = z3 && this.zzdni == 3;
            boolean z8 = this.zzdnj != this.zzdnk;
            zzaoa zzaoaVar = this.zzdng;
            z2 = zzaoaVar.zzdnc;
            zzaoaVar.zzdnc = z2 || z4;
            zzloVar = this.zzdng.zzcfl;
            if (zzloVar == null) {
                return;
            }
            if (z4) {
                try {
                    zzloVar2 = this.zzdng.zzcfl;
                    zzloVar2.onVideoStart();
                } catch (RemoteException e) {
                    zzakb.zzc("Unable to call onVideoStart()", e);
                }
            }
            if (z5) {
                try {
                    zzloVar3 = this.zzdng.zzcfl;
                    zzloVar3.onVideoPlay();
                } catch (RemoteException e2) {
                    zzakb.zzc("Unable to call onVideoPlay()", e2);
                }
            }
            if (z6) {
                try {
                    zzloVar4 = this.zzdng.zzcfl;
                    zzloVar4.onVideoPause();
                } catch (RemoteException e3) {
                    zzakb.zzc("Unable to call onVideoPause()", e3);
                }
            }
            if (z7) {
                try {
                    zzloVar5 = this.zzdng.zzcfl;
                    zzloVar5.onVideoEnd();
                } catch (RemoteException e4) {
                    zzakb.zzc("Unable to call onVideoEnd()", e4);
                }
            }
            if (z8) {
                try {
                    zzloVar6 = this.zzdng.zzcfl;
                    zzloVar6.onVideoMute(this.zzdnk);
                } catch (RemoteException e5) {
                    zzakb.zzc("Unable to call onVideoMute()", e5);
                }
            }
        }
    }
}
