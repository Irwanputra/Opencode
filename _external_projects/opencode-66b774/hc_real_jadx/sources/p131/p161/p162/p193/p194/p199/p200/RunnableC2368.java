package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.js.zzae;
import com.google.android.gms.ads.internal.js.zze;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzajj;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzcv;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2368 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ zzcv f9669;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ zzae f9670;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ zzn f9671;

    public RunnableC2368(zzn zznVar, zzcv zzcvVar, zzae zzaeVar) {
        this.f9671 = zznVar;
        this.f9669 = zzcvVar;
        this.f9670 = zzaeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzn zznVar = this.f9671;
            zze zzeVar = new zze(zznVar.f2626, zznVar.f2632, this.f9669, null);
            zzeVar.zza(new C2366(this, zzeVar));
            zzeVar.zza("/jsLoaded", new C2379(this, zzeVar));
            zzajj zzajjVar = new zzajj();
            C2371 c2371 = new C2371(this, zzeVar, zzajjVar);
            zzajjVar.set(c2371);
            zzeVar.zza("/requestReload", c2371);
            if (this.f9671.f2628.endsWith(".js")) {
                zzeVar.zzbb(this.f9671.f2628);
            } else if (this.f9671.f2628.startsWith("<html>")) {
                zzeVar.zzbd(this.f9671.f2628);
            } else {
                zzeVar.zzbc(this.f9671.f2628);
            }
            zzahn.zzdaw.postDelayed(new RunnableC2372(this, zzeVar), 60000);
        } catch (Throwable th) {
            zzakb.zzb("Error creating webview.", th);
            zzbs.zzem().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            this.f9670.reject();
        }
    }
}
