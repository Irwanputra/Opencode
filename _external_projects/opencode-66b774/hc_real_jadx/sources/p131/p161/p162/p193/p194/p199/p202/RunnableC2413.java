package p131.p161.p162.p193.p194.p199.p202;

import com.google.android.gms.internal.zzakb;
import org.json.JSONObject;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.げつ〴ぬぐ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2413 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ JSONObject f9741;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ RunnableC2414 f9742;

    public RunnableC2413(RunnableC2414 runnableC2414, JSONObject jSONObject) {
        this.f9742 = runnableC2414;
        this.f9741 = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9742.f9744.zza("fetchHttpRequestCompleted", this.f9741);
        zzakb.zzbx("Dispatched http response.");
    }
}
