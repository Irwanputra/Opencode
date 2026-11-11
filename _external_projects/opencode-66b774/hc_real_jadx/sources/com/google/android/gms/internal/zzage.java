package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import p131.p161.p162.p193.p205.C2508;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzage extends zzagb {
    private Context mContext;

    public zzage(Context context) {
        this.mContext = context;
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.mContext);
        } catch (IOException | IllegalStateException | C2508 e) {
            zzakb.zzb("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        zzajv.zzaa(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        zzakb.zzcu(sb.toString());
    }
}
