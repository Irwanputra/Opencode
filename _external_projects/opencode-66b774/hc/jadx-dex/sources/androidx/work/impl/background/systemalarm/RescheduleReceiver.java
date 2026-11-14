package androidx.work.impl.background.systemalarm;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {
    static {
        dev.epro.r0.B14824868959299866349.o("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
        java.util.Objects.toString(intent);
        b14824868959299866349N.getClass();
        try {
            dev.epro.r0.W13734796219485846113 w13734796219485846113B = dev.epro.r0.W13734796219485846113.b(context);
            android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            w13734796219485846113B.getClass();
            synchronized (dev.epro.r0.W13734796219485846113.m) {
                try {
                    android.content.BroadcastReceiver.PendingResult pendingResult = w13734796219485846113B.i;
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
        } catch (java.lang.IllegalStateException unused) {
            dev.epro.r0.B14824868959299866349.n().getClass();
        }
    }
}
