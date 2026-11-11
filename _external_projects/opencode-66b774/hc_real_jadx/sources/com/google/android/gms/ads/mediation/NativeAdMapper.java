package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.zzzv;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public class NativeAdMapper {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f2811;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f2812;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Bundle f2813 = new Bundle();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f2814;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public View f2815;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public VideoController f2816;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public View f2817;

    public View getAdChoicesContent() {
        return this.f2817;
    }

    public final Bundle getExtras() {
        return this.f2813;
    }

    public final boolean getOverrideClickHandling() {
        return this.f2811;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f2814;
    }

    public final VideoController getVideoController() {
        return this.f2816;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f2812;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f2817 = view;
    }

    public final void setExtras(Bundle bundle) {
        this.f2813 = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.f2812 = z;
    }

    public void setMediaView(View view) {
        this.f2815 = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f2811 = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f2814 = z;
    }

    public void trackView(View view) {
    }

    public void untrackView(View view) {
    }

    public final void zza(VideoController videoController) {
        this.f2816 = videoController;
    }

    public final View zzul() {
        return this.f2815;
    }
}
