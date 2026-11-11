package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NativeAppInstallAdMapper extends NativeAdMapper {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String f2818;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public String f2819;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public String f2820;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String f2821;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public double f2822;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String f2823;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public List<NativeAd.Image> f2824;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public NativeAd.Image f2825;

    public final String getBody() {
        return this.f2819;
    }

    public final String getCallToAction() {
        return this.f2821;
    }

    public final String getHeadline() {
        return this.f2818;
    }

    public final NativeAd.Image getIcon() {
        return this.f2825;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f2824;
    }

    public final String getPrice() {
        return this.f2820;
    }

    public final double getStarRating() {
        return this.f2822;
    }

    public final String getStore() {
        return this.f2823;
    }

    public final void setBody(String str) {
        this.f2819 = str;
    }

    public final void setCallToAction(String str) {
        this.f2821 = str;
    }

    public final void setHeadline(String str) {
        this.f2818 = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.f2825 = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.f2824 = list;
    }

    public final void setPrice(String str) {
        this.f2820 = str;
    }

    public final void setStarRating(double d) {
        this.f2822 = d;
    }

    public final void setStore(String str) {
        this.f2823 = str;
    }
}
