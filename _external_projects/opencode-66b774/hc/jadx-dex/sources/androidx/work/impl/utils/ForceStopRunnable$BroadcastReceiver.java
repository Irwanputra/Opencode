package androidx.work.impl.utils;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends android.content.BroadcastReceiver {
    static {
        dev.epro.r0.B14824868959299866349.o("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        dev.epro.r0.B14824868959299866349.n().getClass();
        dev.epro.r0.O13592913085879973388.b(context);
    }
}
