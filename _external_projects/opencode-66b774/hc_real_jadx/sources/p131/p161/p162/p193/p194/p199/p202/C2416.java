package p131.p161.p162.p193.p194.p199.p202;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzaog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class C2416 implements zzt {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final zzt f9747 = new C2416();

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map map) {
        zzaog zzaogVar = (zzaog) obj;
        zzt<zzanh> zztVar = zzd.zzbwx;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzakb.zzcu("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzaogVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zza) zzaogVar).zza("openableURLs", hashMap);
    }
}
