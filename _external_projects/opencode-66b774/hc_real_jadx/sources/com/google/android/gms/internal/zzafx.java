package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbs;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzafx {
    private String mSessionId;
    private long zzczt = -1;
    private long zzczu = -1;
    private int zzczv = -1;
    public int zzczi = -1;
    private long zzczw = 0;
    private final Object mLock = new Object();
    private int zzczx = 0;
    private int zzczy = 0;

    public zzafx(String str) {
        this.mSessionId = str;
    }

    private static boolean zzad(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzakb.zzct("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzakb.zzct("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzakb.zzcu("Fail to fetch AdActivity theme");
            zzakb.zzct("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final void zzb(zzjj zzjjVar, long j) {
        Bundle bundle;
        synchronized (this.mLock) {
            long zzpi = zzbs.zzem().zzpi();
            ((C2510) zzbs.zzeo()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzczu == -1) {
                if (currentTimeMillis - zzpi > ((Long) zzkb.zzif().zzd(zznh.zzblg)).longValue()) {
                    this.zzczi = -1;
                } else {
                    this.zzczi = zzbs.zzem().zzpl();
                }
                this.zzczu = j;
            }
            this.zzczt = j;
            if (zzjjVar == null || (bundle = zzjjVar.extras) == null || bundle.getInt("gw", 2) != 1) {
                this.zzczv++;
                int i = this.zzczi + 1;
                this.zzczi = i;
                if (i == 0) {
                    this.zzczw = 0L;
                    zzbs.zzem().zzk(currentTimeMillis);
                } else {
                    this.zzczw = currentTimeMillis - zzbs.zzem().zzpj();
                }
            }
        }
    }

    public final Bundle zzl(Context context, String str) {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.mSessionId);
            bundle.putLong("basets", this.zzczu);
            bundle.putLong("currts", this.zzczt);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzczv);
            bundle.putInt("preqs_in_session", this.zzczi);
            bundle.putLong("time_in_session", this.zzczw);
            bundle.putInt("pclick", this.zzczx);
            bundle.putInt("pimp", this.zzczy);
            bundle.putBoolean("support_transparent_background", zzad(context));
        }
        return bundle;
    }

    public final void zzoo() {
        synchronized (this.mLock) {
            this.zzczy++;
        }
    }

    public final void zzop() {
        synchronized (this.mLock) {
            this.zzczx++;
        }
    }
}
