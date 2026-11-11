package p131.p161.p162.p193.p194.p199.p201;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzao;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagb;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.くし〴〺ぅ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2404 extends zzagb {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ zzd f9733;

    public C2404(zzd zzdVar, C2403 c2403) {
        this.f9733 = zzdVar;
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        Bitmap zza = zzbs.zzfa().zza(Integer.valueOf(this.f9733.f2643.zzcjg.zzaqt));
        if (zza != null) {
            zzaht zzek = zzbs.zzek();
            zzd zzdVar = this.f9733;
            Activity activity = zzdVar.f2637;
            zzao zzaoVar = zzdVar.f2643.zzcjg;
            zzahn.zzdaw.post(new RunnableC2405(this, zzek.zza(activity, zza, zzaoVar.zzaqr, zzaoVar.zzaqs)));
        }
    }
}
