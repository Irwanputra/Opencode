package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NativeContentAdMapper extends NativeAdMapper {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String f2826;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public String f2827;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String f2828;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public String f2829;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public List<NativeAd.Image> f2830;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public NativeAd.Image f2831;

    public final String getAdvertiser() {
        return this.f2829;
    }

    public final String getBody() {
        return this.f2827;
    }

    public final String getCallToAction() {
        return this.f2828;
    }

    public final String getHeadline() {
        return this.f2826;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f2830;
    }

    public final NativeAd.Image getLogo() {
        return this.f2831;
    }

    public final void setAdvertiser(String str) {
        this.f2829 = str;
    }

    public final void setBody(String str) {
        this.f2827 = str;
    }

    public final void setCallToAction(String str) {
        this.f2828 = str;
    }

    public final void setHeadline(String str) {
        this.f2826 = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.f2830 = list;
    }

    public final void setLogo(NativeAd.Image image) {
        this.f2831 = image;
    }
}
