package androidx.work.impl.diagnostics;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {
    static {
        dev.epro.r0.B14824868959299866349.o("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        dev.epro.r0.B14824868959299866349.n().getClass();
        try {
            context.getClass();
            dev.epro.r0.W13734796219485846113 w13734796219485846113B = dev.epro.r0.W13734796219485846113.b(context);
            w13734796219485846113B.getClass();
            w13734796219485846113B.a(new dev.epro.r0.I1632105416032993715(androidx.work.impl.workers.DiagnosticsWorker.class).a());
        } catch (java.lang.IllegalStateException unused) {
            dev.epro.r0.B14824868959299866349.n().getClass();
        }
    }
}
