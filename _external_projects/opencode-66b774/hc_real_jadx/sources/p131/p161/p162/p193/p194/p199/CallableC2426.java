package p131.p161.p162.p193.p194.p199;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzba;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zzaat;
import com.google.android.gms.internal.zzaau;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzakl;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzou;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class CallableC2426 implements Callable<zzou> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ JSONArray f9752;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ int f9753;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ int f9754;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public /* synthetic */ zzba f9755;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public /* synthetic */ zzafp f9756;

    public CallableC2426(zzba zzbaVar, int i, JSONArray jSONArray, int i2, zzafp zzafpVar) {
        this.f9755 = zzbaVar;
        this.f9754 = i;
        this.f9752 = jSONArray;
        this.f9753 = i2;
        this.f9756 = zzafpVar;
    }

    @Override // java.util.concurrent.Callable
    public final zzou call() {
        if (this.f9754 >= this.f9752.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f9752.get(this.f9754));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        zzba zzbaVar = this.f9755;
        zzbt zzbtVar = zzbaVar.zzano;
        zzba zzbaVar2 = new zzba(zzbtVar.zzair, zzbaVar.zzanr, zzbtVar.zzauc, zzbtVar.zzatw, zzbaVar.zzanw, zzbtVar.zzaty, true);
        zzbt zzbtVar2 = this.f9755.zzano;
        zzbt zzbtVar3 = zzbaVar2.zzano;
        if (zzbtVar3.f2796 == null) {
            zzbtVar3.f2796 = zzbtVar2.f2796;
        }
        if (zzbtVar3.f2774 == null) {
            zzbtVar3.f2774 = zzbtVar2.f2774;
        }
        if (zzbtVar3.f2797 == null) {
            zzbtVar3.f2797 = zzbtVar2.f2797;
        }
        if (zzbtVar3.f2785 == null) {
            zzbtVar3.f2785 = zzbtVar2.f2785;
        }
        if (zzbtVar3.f2795 == null) {
            zzbtVar3.f2795 = zzbtVar2.f2795;
        }
        if (zzbtVar3.f2790 == null) {
            zzbtVar3.f2790 = zzbtVar2.f2790;
        }
        if (zzbtVar3.f2781 == null) {
            zzbtVar3.f2781 = zzbtVar2.f2781;
        }
        if (zzbtVar3.zzauf == null) {
            zzbtVar3.zzauf = zzbtVar2.zzauf;
        }
        if (zzbtVar3.zzaux == null) {
            zzbtVar3.zzaux = zzbtVar2.zzaux;
        }
        if (zzbtVar3.f2784 == null) {
            zzbtVar3.f2784 = zzbtVar2.f2784;
        }
        if (zzbtVar3.f2788 == null) {
            zzbtVar3.f2788 = zzbtVar2.f2788;
        }
        if (zzbtVar3.zzauc == null) {
            zzbtVar3.zzauc = zzbtVar2.zzauc;
        }
        if (zzbtVar3.zzaud == null) {
            zzbtVar3.zzaud = zzbtVar2.zzaud;
        }
        if (zzbtVar3.zzaue == null) {
            zzbtVar3.zzaue = zzbtVar2.zzaue;
        }
        zzbaVar2.m1233();
        zzbaVar2.zza(this.f9755.zzank);
        zznu zznuVar = zzbaVar2.zzanj;
        int i = this.f9754;
        zznuVar.zzf("num_ads_requested", String.valueOf(this.f9753));
        zznuVar.zzf("ad_index", String.valueOf(i));
        zzaat zzaatVar = this.f9756.zzcqv;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = zzaatVar.zzcnd.extras != null ? new Bundle(zzaatVar.zzcnd.extras) : new Bundle();
        bundle.putString("_ad", jSONObject2);
        zzjj zzjjVar = zzaatVar.zzcnd;
        zzbaVar2.zza(new zzaau(zzaatVar.zzcnc, new zzjj(zzjjVar.versionCode, zzjjVar.zzbdf, bundle, zzjjVar.zzbdg, zzjjVar.zzbdh, zzjjVar.zzbdi, zzjjVar.zzbdj, zzjjVar.zzbdk, zzjjVar.zzbdl, zzjjVar.zzbdm, zzjjVar.zzbdn, zzjjVar.zzbdo, zzjjVar.zzbdp, zzjjVar.zzbdq, zzjjVar.zzbdr, zzjjVar.zzbds, zzjjVar.zzbdt, zzjjVar.zzbdu), zzaatVar.zzauc, zzaatVar.zzatw, zzaatVar.applicationInfo, zzaatVar.zzcne, zzaatVar.zzcng, zzaatVar.zzcnh, zzaatVar.zzaty, zzaatVar.zzcni, zzaatVar.zzauw, zzaatVar.zzcns, zzaatVar.zzcnk, zzaatVar.zzcnl, zzaatVar.zzcnm, zzaatVar.zzcnn, zzaatVar.zzaxx, zzaatVar.zzcno, zzaatVar.zzcnp, zzaatVar.zzcnq, zzaatVar.zzcnr, zzaatVar.zzatv, zzaatVar.zzauo, zzaatVar.zzcnu, zzaatVar.zzcnv, zzaatVar.zzcob, zzaatVar.zzcnw, zzaatVar.zzcnx, zzaatVar.zzcny, zzaatVar.zzcnz, zzakl.zzi(zzaatVar.zzcoa), zzaatVar.zzcoc, zzaatVar.zzcdo, zzaatVar.zzcod, zzaatVar.zzcoe, zzaatVar.zzcof, zzaatVar.zzauq, zzaatVar.zzcog, zzaatVar.zzcoh, zzaatVar.zzcol, zzakl.zzi(zzaatVar.zzcnf), zzaatVar.zzaus, zzaatVar.zzcom, zzaatVar.zzcon, 1, zzaatVar.zzcop, zzaatVar.zzcoq, zzaatVar.zzcor), zzbaVar2.zzanj);
        return zzbaVar2.f2721.get();
    }
}
