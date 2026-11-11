package p131.p161.p162.p193.p194.p196;

import android.net.Uri;
import com.google.android.gms.ads.identifier.zzc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.くし〴〺ぅ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2355 extends Thread {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ Map f9655;

    public C2355(Map map) {
        this.f9655 = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String message;
        new zzc();
        Map map = this.f9655;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    String.valueOf(uri).length();
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            message = e.getMessage();
            String.valueOf(uri).length();
            String.valueOf(message).length();
        } catch (IndexOutOfBoundsException e2) {
            message = e2.getMessage();
            String.valueOf(uri).length();
            String.valueOf(message).length();
        } catch (RuntimeException e3) {
            e = e3;
            message = e.getMessage();
            String.valueOf(uri).length();
            String.valueOf(message).length();
        }
    }
}
