package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzix {
    public zzfl zzbcn;
    public boolean zzbco;

    public zzix() {
    }

    public zzix(Context context) {
        zznh.initialize(context);
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbrf)).booleanValue()) {
            try {
                this.zzbcn = zzfm.zzb(DynamiteModule.m1250(context, DynamiteModule.f2871, ModuleDescriptor.MODULE_ID).m1254("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                new BinderC2454(context);
                this.zzbcn.zza(new BinderC2454(context), "GMA_SDK");
                this.zzbco = true;
            } catch (RemoteException | DynamiteModule.C0382 | NullPointerException unused) {
                zzakb.zzbx("Cannot dynamite load clearcut");
            }
        }
    }

    public final zziz zzd(byte[] bArr) {
        return new zziz(this, bArr);
    }

    public zzix(Context context, String str, String str2) {
        zznh.initialize(context);
        try {
            this.zzbcn = zzfm.zzb(DynamiteModule.m1250(context, DynamiteModule.f2871, ModuleDescriptor.MODULE_ID).m1254("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            new BinderC2454(context);
            this.zzbcn.zza(new BinderC2454(context), str, null);
            this.zzbco = true;
        } catch (RemoteException | DynamiteModule.C0382 | NullPointerException unused) {
            zzakb.zzbx("Cannot dynamite load clearcut");
        }
    }
}
