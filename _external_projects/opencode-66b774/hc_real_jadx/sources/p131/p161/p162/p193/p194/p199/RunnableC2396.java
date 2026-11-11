package p131.p161.p162.p193.p194.p199;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzade;
import com.google.android.gms.internal.zzael;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzuh;
import com.google.android.gms.internal.zzui;
import com.google.android.gms.internal.zzva;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2396 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ RunnableC2393 f9722;

    public RunnableC2396(RunnableC2393 runnableC2393) {
        this.f9722 = runnableC2393;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC2393 runnableC2393 = this.f9722;
        Context context = runnableC2393.f9717.f2712;
        Runnable runnable = runnableC2393.f9716;
        C1687.m3716("Adapters must be initialized on the main thread.");
        Map<String, zzui> zzox = zzbs.zzem().zzpp().zzox();
        if (zzox == null || zzox.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzakb.zzc("Could not initialize rewarded ads.", th);
                return;
            }
        }
        zzade zzoa = zzade.zzoa();
        if (zzoa != null) {
            Collection<zzui> values = zzox.values();
            HashMap hashMap = new HashMap();
            BinderC2454 binderC2454 = new BinderC2454(context);
            Iterator<zzui> it = values.iterator();
            while (it.hasNext()) {
                for (zzuh zzuhVar : it.next().zzcdj) {
                    String str = zzuhVar.zzccz;
                    for (String str2 : zzuhVar.zzccs) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzael zzbq = zzoa.zzbq(str3);
                    if (zzbq != null) {
                        zzva zzoi = zzbq.zzoi();
                        if (!zzoi.isInitialized() && zzoi.zzmi()) {
                            zzoi.zza(binderC2454, zzbq.zzoj(), (List<String>) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            zzakb.zzbx(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (Throwable th2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    zzakb.zzc(sb.toString(), th2);
                }
            }
        }
    }
}
