package dev.epro.r0;

import android.net.TrafficStats;
import java.util.concurrent.Executor;
import org.chromium.net.ThreadStatsUid;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class L9204765506114502171 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ L9204765506114502171(Executor executor, int i, boolean z, int i2) {
        this.a = executor;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final int i = this.b;
        final boolean z = this.c;
        final int i2 = this.d;
        this.a.execute(new Runnable() { // from class: dev.epro.r0.B7603273176733870304
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                int threadStatsTag = TrafficStats.getThreadStatsTag();
                TrafficStats.setThreadStatsTag(i);
                boolean z2 = z;
                if (z2) {
                    ThreadStatsUid.set(i2);
                }
                try {
                    runnable2.run();
                } finally {
                    if (z2) {
                        ThreadStatsUid.clear();
                    }
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
            }
        });
    }
}
