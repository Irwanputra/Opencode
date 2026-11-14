package dev.epro.r0;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R1776126100510317963 implements F12600208943493964396 {
    public static final F16672694987190475690 Companion = new F16672694987190475690();
    public static final String ERROR_MESSAGE_METHOD_NOT_FOUND = "Method is not found";

    public abstract B13913242396174421169 getSDKVersionInfo();

    public abstract B13913242396174421169 getVersionInfo();

    public abstract void initialize(Context context, X18093340194006634422 x18093340194006634422, List<K13929761950693725114> list);

    public void loadAppOpenAd(J12760179507758704697 j12760179507758704697, X5499087717236640154 x5499087717236640154) {
        j12760179507758704697.getClass();
        x5499087717236640154.getClass();
        x5499087717236640154.onFailure(new T7225292889360033468(getClass().getSimpleName().concat(" does not support app open ads.")));
    }

    public void loadBannerAd(F12798470039159117444 f12798470039159117444, X5499087717236640154 x5499087717236640154) {
        f12798470039159117444.getClass();
        x5499087717236640154.getClass();
        x5499087717236640154.onFailure(new T7225292889360033468(getClass().getSimpleName().concat(" does not support banner ads.")));
    }

    public void loadInterscrollerAd(F12798470039159117444 f12798470039159117444, X5499087717236640154 x5499087717236640154) {
        f12798470039159117444.getClass();
        x5499087717236640154.getClass();
        x5499087717236640154.onFailure(new T7225292889360033468(getClass().getSimpleName().concat(" does not support interscroller ads.")));
    }

    public void loadInterstitialAd(U18131546301104314177 u18131546301104314177, X5499087717236640154 x5499087717236640154) {
        u18131546301104314177.getClass();
        x5499087717236640154.getClass();
        x5499087717236640154.onFailure(new T7225292889360033468(getClass().getSimpleName().concat(" does not support interstitial ads.")));
    }

    public void loadNativeAd(X5135118043192612771 x5135118043192612771, X5499087717236640154 x5499087717236640154) {
        x5135118043192612771.getClass();
        x5499087717236640154.getClass();
        x5499087717236640154.onFailure(new T7225292889360033468(getClass().getSimpleName().concat(" does not support native ads.")));
    }

    public void loadNativeAdMapper(X5135118043192612771 x5135118043192612771, X5499087717236640154 x5499087717236640154) {
        x5135118043192612771.getClass();
        x5499087717236640154.getClass();
        throw new IllegalStateException(ERROR_MESSAGE_METHOD_NOT_FOUND);
    }

    public void loadRewardedAd(S10317395539156355983 s10317395539156355983, X5499087717236640154 x5499087717236640154) {
        s10317395539156355983.getClass();
        x5499087717236640154.getClass();
        x5499087717236640154.onFailure(new T7225292889360033468(getClass().getSimpleName().concat(" does not support rewarded ads.")));
    }

    public void loadRewardedInterstitialAd(S10317395539156355983 s10317395539156355983, X5499087717236640154 x5499087717236640154) {
        s10317395539156355983.getClass();
        x5499087717236640154.getClass();
        x5499087717236640154.onFailure(new T7225292889360033468(getClass().getSimpleName().concat(" does not support rewarded interstitial ads.")));
    }
}
