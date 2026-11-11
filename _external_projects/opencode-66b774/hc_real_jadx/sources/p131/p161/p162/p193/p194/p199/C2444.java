package p131.p161.p162.p193.p194.p199;

import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zznh;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.びえぁぜい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2444 extends WebViewClient {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzbm f9790;

    public C2444(zzbm zzbmVar) {
        this.f9790 = zzbmVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzkh zzkhVar = this.f9790.f2730;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = 0;
        if (str.startsWith(this.f9790.m1234())) {
            return false;
        }
        if (str.startsWith((String) zzkb.zzif().zzd(zznh.zzbpp))) {
            zzkh zzkhVar = this.f9790.f2730;
            if (zzkhVar != null) {
                try {
                    zzkhVar.onAdFailedToLoad(3);
                } catch (RemoteException e) {
                    e = e;
                    zzakb.zzc("Could not call AdListener.onAdFailedToLoad().", e);
                    this.f9790.m1235(i);
                    return true;
                }
            }
            this.f9790.m1235(i);
            return true;
        }
        if (str.startsWith((String) zzkb.zzif().zzd(zznh.zzbpq))) {
            zzkh zzkhVar2 = this.f9790.f2730;
            if (zzkhVar2 != null) {
                try {
                    zzkhVar2.onAdFailedToLoad(0);
                } catch (RemoteException e2) {
                    e = e2;
                    zzakb.zzc("Could not call AdListener.onAdFailedToLoad().", e);
                    this.f9790.m1235(i);
                    return true;
                }
            }
        } else {
            if (!str.startsWith((String) zzkb.zzif().zzd(zznh.zzbpr))) {
                if (str.startsWith("gmsg://")) {
                    return true;
                }
                zzkh zzkhVar3 = this.f9790.f2730;
                if (zzkhVar3 != null) {
                    try {
                        zzkhVar3.onAdLeftApplication();
                    } catch (RemoteException e3) {
                        zzakb.zzc("Could not call AdListener.onAdLeftApplication().", e3);
                    }
                }
                zzbm zzbmVar = this.f9790;
                if (zzbmVar.f2738 != null) {
                    Uri parse = Uri.parse(str);
                    try {
                        parse = zzbmVar.f2738.zza(parse, zzbmVar.f2735, null, null);
                    } catch (zzcw e4) {
                        zzakb.zzc("Unable to process ad data", e4);
                    }
                    str = parse.toString();
                }
                zzbm zzbmVar2 = this.f9790;
                zzbmVar2.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                zzbmVar2.f2735.startActivity(intent);
                return true;
            }
            zzkh zzkhVar4 = this.f9790.f2730;
            if (zzkhVar4 != null) {
                try {
                    zzkhVar4.onAdLoaded();
                } catch (RemoteException e5) {
                    zzakb.zzc("Could not call AdListener.onAdLoaded().", e5);
                }
            }
            zzbm zzbmVar3 = this.f9790;
            zzbmVar3.getClass();
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    zzkb.zzia();
                    i = zzajr.zzc(zzbmVar3.f2735, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.f9790.m1235(i);
        return true;
    }
}
