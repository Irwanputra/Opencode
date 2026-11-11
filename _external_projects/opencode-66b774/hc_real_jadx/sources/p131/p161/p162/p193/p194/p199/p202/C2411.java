package p131.p161.p162.p193.p194.p199.p202;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2411 implements zzt<zzanh> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzanh zzanhVar, Map map) {
        zzanh zzanhVar2 = zzanhVar;
        zzd zzsv = zzanhVar2.zzsv();
        if (zzsv != null) {
            zzsv.close();
            return;
        }
        zzd zzsw = zzanhVar2.zzsw();
        if (zzsw != null) {
            zzsw.close();
        } else {
            zzakb.zzcu("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
