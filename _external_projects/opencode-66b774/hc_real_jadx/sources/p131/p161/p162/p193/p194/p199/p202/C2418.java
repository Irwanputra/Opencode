package p131.p161.p162.p193.p194.p199.p202;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzanh;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2418 implements zzt<zzanh> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzanh zzanhVar, Map map) {
        zzanh zzanhVar2 = zzanhVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzanhVar2.zzcq();
        } else if ("resume".equals(str)) {
            zzanhVar2.zzcr();
        }
    }
}
