package dev.epro.r0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X14397327929232388191 implements Executor {
    public static final Logger f = Logger.getLogger(X14397327929232388191.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final I3863025946240164840 e = new I3863025946240164840(this);

    public X14397327929232388191(ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.b) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.d;
                boolean z = true;
                A884078926372128069 a884078926372128069 = new A884078926372128069(runnable, (byte) 1);
                this.b.add(a884078926372128069);
                this.c = 2;
                try {
                    this.a.execute(this.e);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.d == j && this.c == 2) {
                                this.c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        try {
                            int i2 = this.c;
                            if ((i2 != 1 && i2 != 2) || !this.b.removeLastOccurrence(a884078926372128069)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
