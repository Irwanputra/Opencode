package p131.p161.p162.p193.p194.p199.p202;

import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakb;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2414 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ Map f9743;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ zza f9744;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public /* synthetic */ HttpClient f9745;

    public RunnableC2414(HttpClient httpClient, Map map, zza zzaVar) {
        this.f9745 = httpClient;
        this.f9743 = map;
        this.f9744 = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakb.zzbx("Received Http request.");
        try {
            JSONObject send = this.f9745.send(new JSONObject((String) this.f9743.get("http_request")));
            if (send == null) {
                zzakb.e("Response should not be null.");
            } else {
                zzahn.zzdaw.post(new RunnableC2413(this, send));
            }
        } catch (Exception e) {
            zzakb.zzb("Error converting request to json.", e);
        }
    }
}
