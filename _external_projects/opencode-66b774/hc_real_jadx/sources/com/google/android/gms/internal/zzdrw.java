package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdrw extends zzffu<zzdrw, zza> implements zzfhg {
    private static volatile zzfhk<zzdrw> zzbbk;
    private static final zzdrw zzlui;

    public static final class zza extends zzffu.zza<zzdrw, zza> implements zzfhg {
        private zza() {
            super(zzdrw.zzlui);
        }

        public /* synthetic */ zza(zzdrx zzdrxVar) {
            this();
        }
    }

    static {
        zzdrw zzdrwVar = new zzdrw();
        zzlui = zzdrwVar;
        zzdrwVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdrwVar.zzpgr.zzbiy();
    }

    private zzdrw() {
    }

    public static zzdrw zzbnc() {
        return zzlui;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdrx zzdrxVar = null;
        switch (zzdrx.zzbbi[i - 1]) {
            case 1:
                return new zzdrw();
            case 2:
                return zzlui;
            case 3:
                return null;
            case 4:
                return new zza(zzdrxVar);
            case 5:
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                ((zzffm) obj2).getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int zzcvt = zzffbVar.zzcvt();
                            if (zzcvt == 0 || !zza(zzcvt, zzffbVar)) {
                                z = true;
                            }
                        } catch (zzfge e) {
                            throw new RuntimeException(e.zzi(this));
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(new zzfge(e2.getMessage()).zzi(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (zzbbk == null) {
                    synchronized (zzdrw.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlui);
                        }
                    }
                }
                return zzbbk;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlui;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        this.zzpgr.zza(zzffgVar);
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int zzho = this.zzpgr.zzho() + 0;
        this.zzpgs = zzho;
        return zzho;
    }
}
