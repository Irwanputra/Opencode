package ads_mobile_sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.J5800360223679855765;
import dev.epro.r0.L17385865533161060024;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.S1392253949846343516;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class nn3 extends BroadcastReceiver implements S1392253949846343516, L17385865533161060024 {
    public final Context a;
    public final ExecutorService b;
    public boolean c = true;

    public nn3(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void b(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.c = false;
            }
        }
    }

    @Override // dev.epro.r0.S1392253949846343516
    public final void a(HashMap map, Context context, View view) {
        boolean z;
        synchronized (this) {
            z = this.c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // dev.epro.r0.L17385865533161060024
    public final D16915945238461757356 a() {
        return M9216324016624295870.X(new J5800360223679855765(this, (byte) 7), this.b);
    }
}
