package dev.epro.r0;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K14920477250390931902 extends G8935082882695009405 {
    public final Pattern d;

    public K14920477250390931902() {
        super(WebViewFeature.ALGORITHMIC_DARKENING, WebViewFeature.ALGORITHMIC_DARKENING);
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // dev.epro.r0.G8935082882695009405
    public final boolean b() {
        boolean b = super.b();
        if (!b || Build.VERSION.SDK_INT >= 29) {
            return b;
        }
        PackageInfo currentLoadedWebViewPackage = WebViewCompat.getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.d.matcher(currentLoadedWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentLoadedWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
