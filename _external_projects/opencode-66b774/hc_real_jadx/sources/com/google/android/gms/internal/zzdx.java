package com.google.android.gms.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdx extends zzet {
    public zzdx(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        super(zzdmVar, str, str2, zzazVar, i, 49);
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        this.zzako.zzel = 2;
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzakw.invoke(null, this.zzagr.getContext())).booleanValue();
            zzaz zzazVar = this.zzako;
            if (!booleanValue) {
                i = 0;
            }
            zzazVar.zzel = Integer.valueOf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
