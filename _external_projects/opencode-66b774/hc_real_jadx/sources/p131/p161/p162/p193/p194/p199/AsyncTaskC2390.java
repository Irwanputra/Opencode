package p131.p161.p162.p193.p194.p199;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぅみぱぎぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class AsyncTaskC2390 extends AsyncTask<Void, Void, String> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzbm f9709;

    public AsyncTaskC2390(zzbm zzbmVar, C2444 c2444) {
        this.f9709 = zzbmVar;
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Void[] voidArr) {
        try {
            zzbm zzbmVar = this.f9709;
            zzbmVar.f2738 = zzbmVar.f2737.get(((Long) zzkb.zzif().zzd(zznh.zzbpu)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            zzakb.zzc("Failed to load ad data", e);
        } catch (ExecutionException e2) {
            e = e2;
            zzakb.zzc("Failed to load ad data", e);
        } catch (TimeoutException unused) {
            zzakb.zzcu("Timed out waiting for ad data");
        }
        zzbm zzbmVar2 = this.f9709;
        zzbmVar2.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzkb.zzif().zzd(zznh.zzbps));
        builder.appendQueryParameter("query", zzbmVar2.f2736.f9766);
        builder.appendQueryParameter("pubId", zzbmVar2.f2736.f9767);
        Map<String, String> map = zzbmVar2.f2736.f9765;
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, map.get(str));
        }
        Uri build = builder.build();
        zzcv zzcvVar = zzbmVar2.f2738;
        if (zzcvVar != null) {
            try {
                build = zzcvVar.zza(build, zzbmVar2.f2735);
            } catch (zzcw e3) {
                zzakb.zzc("Unable to process ad data", e3);
            }
        }
        String m1234 = zzbmVar2.m1234();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(encodedQuery).length() + String.valueOf(m1234).length() + 1);
        sb.append(m1234);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        WebView webView = this.f9709.f2732;
        if (webView == null || str2 == null) {
            return;
        }
        webView.loadUrl(str2);
    }
}
