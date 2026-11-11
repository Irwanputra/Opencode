package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdz extends zzet {
    private static final Object zzakl = new Object();
    private static volatile zzbv zzakm;
    private zzaw zzakn;

    public zzdz(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2, zzaw zzawVar) {
        super(zzdmVar, str, str2, zzazVar, i, 27);
        this.zzakn = null;
        this.zzakn = zzawVar;
    }

    private final String zzaz() {
        try {
            if (this.zzagr.zzap() != null) {
                this.zzagr.zzap().get();
            }
            zzaz zzao = this.zzagr.zzao();
            if (zzao == null) {
                return null;
            }
            String str = zzao.zzcw;
            if (str != null) {
                return str;
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        char c;
        if (zzakm == null || zzdr.zzo(zzakm.zzcw) || zzakm.zzcw.equals("E") || zzakm.zzcw.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
            synchronized (zzakl) {
                if (zzdr.zzo(null)) {
                    zzdr.zzo(null);
                    c = 2;
                } else {
                    c = 4;
                }
                Method method = this.zzakw;
                Object[] objArr = new Object[2];
                objArr[0] = this.zzagr.getContext();
                objArr[1] = Boolean.valueOf(c == 2);
                zzbv zzbvVar = new zzbv((String) method.invoke(null, objArr));
                zzakm = zzbvVar;
                if (zzdr.zzo(zzbvVar.zzcw) || zzakm.zzcw.equals("E")) {
                    if (c == 3) {
                        String zzaz = zzaz();
                        if (!zzdr.zzo(zzaz)) {
                            zzakm.zzcw = zzaz;
                        }
                    } else if (c == 4) {
                        throw null;
                    }
                }
            }
        }
        synchronized (this.zzako) {
            if (zzakm != null) {
                this.zzako.zzcw = zzakm.zzcw;
                this.zzako.zzea = Long.valueOf(zzakm.zzyv);
                this.zzako.zzcy = zzakm.zzcy;
                this.zzako.zzcz = zzakm.zzcz;
                this.zzako.zzda = zzakm.zzda;
            }
        }
    }
}
