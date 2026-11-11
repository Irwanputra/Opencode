package p131.p161.p162.p193.p194.p199;

import android.os.IBinder;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanm;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzpr;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2451 implements zzanm {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ String f9800;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzanh f9801;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzoj f9802;

    public C2451(zzoj zzojVar, String str, zzanh zzanhVar) {
        this.f9802 = zzojVar;
        this.f9800 = str;
        this.f9801 = zzanhVar;
    }

    @Override // com.google.android.gms.internal.zzanm
    public final void zza(zzanh zzanhVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", this.f9802.getHeadline());
            jSONObject.put("body", this.f9802.getBody());
            jSONObject.put("call_to_action", this.f9802.getCallToAction());
            jSONObject.put("price", this.f9802.getPrice());
            jSONObject.put("star_rating", String.valueOf(this.f9802.getStarRating()));
            jSONObject.put("store", this.f9802.getStore());
            jSONObject.put("icon", zzaq.m1228(this.f9802.zzjs()));
            JSONArray jSONArray = new JSONArray();
            List images = this.f9802.getImages();
            if (images != null) {
                for (Object obj : images) {
                    jSONArray.put(zzaq.m1228(obj instanceof IBinder ? zzpr.zzk((IBinder) obj) : null));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zzaq.m1229(this.f9802.getExtras(), this.f9800));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            this.f9801.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            zzakb.zzc("Exception occurred when loading assets", e);
        }
    }
}
