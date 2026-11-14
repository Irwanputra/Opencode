package dev.epro.r0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J3436373395468761580 implements Executor {
    public final L9204765506114502171 a;
    public final W13948953340889349604 b = new W13948953340889349604(this, (byte) 17);
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public J3436373395468761580(L9204765506114502171 l9204765506114502171) {
        this.a = l9204765506114502171;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
