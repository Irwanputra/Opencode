package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzana {
    public Context mContext;
    private String zzczb;
    private WeakReference<zzamp> zzdka;

    public zzana(zzamp zzampVar) {
        this.mContext = zzampVar.getContext();
        this.zzczb = zzbs.zzei().zzp(this.mContext, zzampVar.zzsk().zzcv);
        this.zzdka = new WeakReference<>(zzampVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, Map<String, String> map) {
        zzamp zzampVar = this.zzdka.get();
        if (zzampVar != null) {
            zzampVar.zza(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String zzcy(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1396664534:
                if (str.equals("badUrl")) {
                    c = 0;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c = 1;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c = 2;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c = 3;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c = 4;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c = 5;
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c = 6;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 7;
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c = '\b';
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                return "network";
            case 1:
            case 3:
            case 4:
            case 7:
            default:
                return "internal";
            case 5:
            case 6:
                return "policy";
            case '\b':
            case '\t':
                return "io";
        }
    }

    public abstract void abort();

    public void release() {
    }

    public final void zza(String str, String str2, int i) {
        zzajr.zzajw.post(new zzanc(this, str, str2, i));
    }

    public final void zza(String str, String str2, String str3, String str4) {
        zzajr.zzajw.post(new zzand(this, str, str2, str3, str4));
    }

    public abstract boolean zzcx(String str);
}
