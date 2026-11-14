package dev.epro.r0;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L16935913137280991791 implements Executor {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;

    public L16935913137280991791(V15243060514859040546 v15243060514859040546, Executor executor) {
        this.b = executor;
        this.c = v15243060514859040546;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.c;
        Executor executor = this.b;
        switch (b) {
            case 0:
                try {
                    executor.execute(runnable);
                    break;
                } catch (RejectedExecutionException e) {
                    ((V15243060514859040546) obj).c(e);
                    return;
                }
            default:
                try {
                    executor.execute(runnable);
                    break;
                } catch (RejectedExecutionException e2) {
                    ((L7743116545240101509) obj).l(e2);
                }
        }
    }

    public L16935913137280991791(Executor executor, L7743116545240101509 l7743116545240101509) {
        this.b = executor;
        this.c = l7743116545240101509;
    }
}
