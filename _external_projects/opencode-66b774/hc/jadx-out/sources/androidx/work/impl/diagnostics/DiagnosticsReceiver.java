package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.I1632105416032993715;
import dev.epro.r0.W13734796219485846113;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        B14824868959299866349.o("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        B14824868959299866349.n().getClass();
        try {
            context.getClass();
            W13734796219485846113 w13734796219485846113B = W13734796219485846113.b(context);
            w13734796219485846113B.getClass();
            w13734796219485846113B.a(new I1632105416032993715(DiagnosticsWorker.class).a());
        } catch (IllegalStateException unused) {
            B14824868959299866349.n().getClass();
        }
    }
}
