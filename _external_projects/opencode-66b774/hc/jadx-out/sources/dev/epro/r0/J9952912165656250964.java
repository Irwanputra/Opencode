package dev.epro.r0;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J9952912165656250964 {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public J9952912165656250964(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}
