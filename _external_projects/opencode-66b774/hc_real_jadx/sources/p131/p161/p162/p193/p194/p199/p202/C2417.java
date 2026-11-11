package p131.p161.p162.p193.p194.p199.p202;

import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzaow;
import com.google.android.gms.internal.zzcv;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class C2417 implements zzt {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final zzt f9748 = new C2417();

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map map) {
        zzaow zzaowVar = (zzaow) obj;
        zzt<zzanh> zztVar = zzd.zzbwx;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzcv zztb = zzaowVar.zztb();
            if (zztb != null) {
                zztb.zzaf().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzakb.zzcu("Could not parse touch parameters from gmsg.");
        }
    }
}
