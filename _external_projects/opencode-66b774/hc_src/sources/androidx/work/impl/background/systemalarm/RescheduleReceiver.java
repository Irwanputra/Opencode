package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.W13734796219485846113;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        B14824868959299866349.o("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        B14824868959299866349 n = B14824868959299866349.n();
        Objects.toString(intent);
        n.getClass();
        try {
            W13734796219485846113 b = W13734796219485846113.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            b.getClass();
            synchronized (W13734796219485846113.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = b.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    b.i = goAsync;
                    if (b.h) {
                        goAsync.finish();
                        b.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
            B14824868959299866349.n().getClass();
        }
    }
}
