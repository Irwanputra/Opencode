package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G13921529853338173802 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        f = unsafe.objectFieldOffset(G13921529853338173802.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(G13921529853338173802.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(G13921529853338173802.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(G13921529853338173802.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(G13921529853338173802.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(G13921529853338173802.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final B6457840406537354631 a(B6457840406537354631 b6457840406537354631) {
        if (b() == 127) {
            return b6457840406537354631;
        }
        if (b6457840406537354631.b) {
            c.incrementAndGet(this);
        }
        int intVolatile = T5284056093300834442.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, b6457840406537354631);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return T5284056093300834442.a.getIntVolatile(this, g) - T5284056093300834442.a.getIntVolatile(this, e);
    }

    public final B6457840406537354631 c() {
        B6457840406537354631 b6457840406537354631;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            G13921529853338173802 g13921529853338173802 = this;
            if (unsafe.compareAndSwapInt(g13921529853338173802, j, intVolatile, intVolatile + 1) && (b6457840406537354631 = (B6457840406537354631) g13921529853338173802.a.getAndSet(i, null)) != null) {
                if (b6457840406537354631.b) {
                    c.decrementAndGet(g13921529853338173802);
                }
                return b6457840406537354631;
            }
            this = g13921529853338173802;
        }
    }

    public final B6457840406537354631 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        B6457840406537354631 b6457840406537354631 = (B6457840406537354631) atomicReferenceArray.get(i2);
        if (b6457840406537354631 != null && b6457840406537354631.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, b6457840406537354631, null)) {
                if (atomicReferenceArray.get(i2) != b6457840406537354631) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return b6457840406537354631;
        }
        return null;
    }
}
