package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.js.zze;
import org.jasypt.digest.StandardStringDigester;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2365 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ String f9664;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zze f9665;

    public RunnableC2365(zze zzeVar, String str) {
        this.f9665 = zzeVar;
        this.f9664 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9665.f2624.loadData(this.f9664, "text/html", StandardStringDigester.MESSAGE_CHARSET);
    }
}
