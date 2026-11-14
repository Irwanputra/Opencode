package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.W13734796219485846113;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        B14824868959299866349.o("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
        Objects.toString(intent);
        b14824868959299866349N.getClass();
        try {
            W13734796219485846113 w13734796219485846113B = W13734796219485846113.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            w13734796219485846113B.getClass();
            synchronized (W13734796219485846113.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = w13734796219485846113B.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    w13734796219485846113B.i = pendingResultGoAsync;
                    if (w13734796219485846113B.h) {
                        pendingResultGoAsync.finish();
                        w13734796219485846113B.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
            B14824868959299866349.n().getClass();
        }
    }
}
