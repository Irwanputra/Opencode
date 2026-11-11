package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzni implements Callable<Void> {
    private /* synthetic */ Context val$context;

    public zzni(Context context) {
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        zzkb.zzif().initialize(this.val$context);
        return null;
    }
}
