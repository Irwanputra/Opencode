package p131.p161.p162.p193.p194.p199;

import android.os.IBinder;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanm;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.internal.zzpr;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2435 implements zzanm {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ String f9774;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzanh f9775;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzol f9776;

    public C2435(zzol zzolVar, String str, zzanh zzanhVar) {
        this.f9776 = zzolVar;
        this.f9774 = str;
        this.f9775 = zzanhVar;
    }

    @Override // com.google.android.gms.internal.zzanm
    public final void zza(zzanh zzanhVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f9776.getHeadline());
            jSONObject.put("body", this.f9776.getBody());
            jSONObject.put("call_to_action", this.f9776.getCallToAction());
            jSONObject.put("advertiser", this.f9776.getAdvertiser());
            jSONObject.put("logo", zzaq.m1228(this.f9776.zzjz()));
            JSONArray jSONArray = new JSONArray();
            List images = this.f9776.getImages();
            if (images != null) {
                for (Object obj : images) {
                    jSONArray.put(zzaq.m1228(obj instanceof IBinder ? zzpr.zzk((IBinder) obj) : null));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zzaq.m1229(this.f9776.getExtras(), this.f9774));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            this.f9775.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            zzakb.zzc("Exception occurred when loading assets", e);
        }
    }
}
