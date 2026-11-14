package dev.epro.r0;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T14941726711530066562 extends B5488833628674465193 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T14941726711530066562(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override // dev.epro.r0.G8935082882695009405
    public final boolean b() {
        PackageInfo currentLoadedWebViewPackage;
        switch (this.e) {
            case 0:
                if (super.b() && (currentLoadedWebViewPackage = WebViewCompat.getCurrentLoadedWebViewPackage()) != null) {
                    return (Build.VERSION.SDK_INT >= 28 ? C15025379344307230271.g(currentLoadedWebViewPackage) : (long) currentLoadedWebViewPackage.versionCode) >= 636700000;
                }
                return false;
            case 1:
                if (super.b() && Q6344330807969154194.b(WebViewFeature.MULTI_PROCESS)) {
                    return WebViewCompat.isMultiProcessEnabled();
                }
                return false;
            default:
                if (Q6344330807969154194.b(WebViewFeature.MULTI_PROFILE)) {
                    return super.b();
                }
                return false;
        }
    }
}
