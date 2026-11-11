package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzzv;
import p131.p161.p162.p193.p194.p199.p201.C2401;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzo extends FrameLayout implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ImageButton f2656;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzt f2657;

    public zzo(Context context, C2401 c2401, zzt zztVar) {
        super(context);
        this.f2657 = zztVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f2656 = imageButton;
        imageButton.setImageResource(R.drawable.btn_dialog);
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzkb.zzia();
        int zzc = zzajr.zzc(context, c2401.f9731);
        zzkb.zzia();
        int zzc2 = zzajr.zzc(context, 0);
        zzkb.zzia();
        int zzc3 = zzajr.zzc(context, c2401.f9729);
        zzkb.zzia();
        imageButton.setPadding(zzc, zzc2, zzc3, zzajr.zzc(context, c2401.f9730));
        imageButton.setContentDescription("Interstitial close button");
        zzkb.zzia();
        zzajr.zzc(context, c2401.f9732);
        zzkb.zzia();
        int zzc4 = zzajr.zzc(context, c2401.f9732 + c2401.f9731 + c2401.f9729);
        zzkb.zzia();
        addView(imageButton, new FrameLayout.LayoutParams(zzc4, zzajr.zzc(context, c2401.f9732 + c2401.f9730), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzt zztVar = this.f2657;
        if (zztVar != null) {
            zztVar.zzmt();
        }
    }

    public final void zza(boolean z, boolean z2) {
        ImageButton imageButton;
        int i;
        if (!z2) {
            imageButton = this.f2656;
            i = 0;
        } else if (z) {
            imageButton = this.f2656;
            i = 4;
        } else {
            imageButton = this.f2656;
            i = 8;
        }
        imageButton.setVisibility(i);
    }
}
