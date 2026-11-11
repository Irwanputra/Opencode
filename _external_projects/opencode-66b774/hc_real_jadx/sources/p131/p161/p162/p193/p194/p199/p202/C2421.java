package p131.p161.p162.p193.p194.p199.p202;

import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzajh;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzaog;
import com.google.android.gms.internal.zzaox;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class C2421 implements zzt {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final zzt f9749 = new C2421();

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map map) {
        zzaog zzaogVar = (zzaog) obj;
        zzt<zzanh> zztVar = zzd.zzbwx;
        String str = (String) map.get("u");
        if (str == null) {
            zzakb.zzcu("URL missing from httpTrack GMSG.");
        } else {
            new zzajh(zzaogVar.getContext(), ((zzaox) zzaogVar).zzsk().zzcv, str).zzpy();
        }
    }
}
