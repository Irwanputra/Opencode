package dev.epro.r0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V15499216873564893116 implements Executor {
    public final /* synthetic */ byte a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;
    public final Executor e;

    public V15499216873564893116(Executor executor) {
        this.a = (byte) 2;
        executor.getClass();
        this.e = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        Runnable runnable = (Runnable) this.b.poll();
                        this.c = runnable;
                        if (runnable != null) {
                            ((E8496491261769853844) this.e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.b.poll();
                this.c = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.e).execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.d) {
                    Object objPoll = this.b.poll();
                    Runnable runnable3 = (Runnable) objPoll;
                    this.c = runnable3;
                    if (objPoll != null) {
                        this.e.execute(runnable3);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = 16;
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        this.b.add(new Q9622116641457785369(this, runnable, (byte) 3));
                        if (this.c == null) {
                            a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 1:
                synchronized (this.d) {
                    try {
                        this.b.add(new I3863025946240164840(this, runnable, b));
                        if (this.c == null) {
                            a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.d) {
                    this.b.offer(new Q9622116641457785369(runnable, this, (byte) 16));
                    if (this.c == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }

    public V15499216873564893116(ExecutorService executorService) {
        this.a = (byte) 1;
        this.e = executorService;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public V15499216873564893116(E8496491261769853844 e8496491261769853844) {
        this.a = (byte) 0;
        this.d = new Object();
        this.b = new ArrayDeque();
        this.e = e8496491261769853844;
    }
}
