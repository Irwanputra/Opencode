package p131.p161.p162.p193.p194.p199.p202;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzajh;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzaog;
import com.google.android.gms.internal.zzaow;
import com.google.android.gms.internal.zzaox;
import com.google.android.gms.internal.zzaoy;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class C2415 implements zzt {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final zzt f9746 = new C2415();

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map map) {
        Object obj2 = (zza) obj;
        zzt<zzanh> zztVar = zzd.zzbwx;
        String str = (String) map.get("u");
        if (str == null) {
            zzakb.zzcu("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzcv zztb = ((zzaow) obj2).zztb();
            if (zztb != null && zztb.zzb(parse)) {
                Context context = ((zzaog) obj2).getContext();
                Object obj3 = (zzaoy) obj2;
                obj3.getClass();
                parse = zztb.zza(parse, context, (View) obj3, ((zzaog) obj2).zzsi());
            }
        } catch (zzcw unused) {
            zzakb.zzcu(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        zzaog zzaogVar = (zzaog) obj2;
        if ((((Boolean) zzkb.zzif().zzd(zznh.zzbku)).booleanValue() && zzbs.zzfd().zzq(zzaogVar.getContext())) && TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
            String zzy = zzbs.zzfd().zzy(zzaogVar.getContext());
            zzbs.zzei();
            parse = zzahn.zzb(parse.toString(), "fbs_aeid", zzy);
            zzbs.zzfd().zze(zzaogVar.getContext(), zzy);
        }
        new zzajh(zzaogVar.getContext(), ((zzaox) obj2).zzsk().zzcv, parse.toString()).zzpy();
    }
}
