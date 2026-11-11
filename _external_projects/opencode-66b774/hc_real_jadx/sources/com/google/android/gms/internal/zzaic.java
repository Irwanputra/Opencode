package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzaic extends zzaia {
    @Override // com.google.android.gms.internal.zzaia, com.google.android.gms.internal.zzaht
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.zzaht
    public final ViewGroup.LayoutParams zzqi() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
