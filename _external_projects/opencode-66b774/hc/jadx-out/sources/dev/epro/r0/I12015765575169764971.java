package dev.epro.r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I12015765575169764971 extends BroadcastReceiver {
    public Context a;
    public final F6353700998356592239 b;

    public I12015765575169764971(F6353700998356592239 f6353700998356592239) {
        this.b = f6353700998356592239;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            throw null;
        }
    }
}
