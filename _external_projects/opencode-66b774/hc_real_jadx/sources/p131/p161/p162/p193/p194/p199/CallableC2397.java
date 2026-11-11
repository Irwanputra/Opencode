package p131.p161.p162.p193.p194.p199;

import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import java.util.concurrent.Callable;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぉひのべい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class CallableC2397 implements Callable<String> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzd f9723;

    public CallableC2397(zzd zzdVar) {
        this.f9723 = zzdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        CookieManager zzay;
        return (!((Boolean) zzkb.zzif().zzd(zznh.zzbqc)).booleanValue() || (zzay = zzbs.zzek().zzay(this.f9723.zzano.zzair)) == null) ? "" : zzay.getCookie("googleads.g.doubleclick.net");
    }
}
