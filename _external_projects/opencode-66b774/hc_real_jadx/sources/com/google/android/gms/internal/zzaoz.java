package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaoz extends MutableContextWrapper {
    private Context mApplicationContext;
    private Activity zzddm;
    private Context zzdns;

    public zzaoz(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.zzdns.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mApplicationContext = applicationContext;
        this.zzddm = context instanceof Activity ? (Activity) context : null;
        this.zzdns = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zzddm;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.mApplicationContext.startActivity(intent);
        }
    }

    public final Activity zzsi() {
        return this.zzddm;
    }

    public final Context zzsu() {
        return this.zzdns;
    }
}
