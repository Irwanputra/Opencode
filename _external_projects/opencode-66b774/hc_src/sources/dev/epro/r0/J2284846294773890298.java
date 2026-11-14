package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J2284846294773890298 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(J2284846294773890298.class, "workerCtl$volatile");
    public static final /* synthetic */ long j = T5284056093300834442.a.objectFieldOffset(J2284846294773890298.class.getDeclaredField("workerCtl$volatile"));
    public final G13921529853338173802 a;
    public final A7209497065939201693 b;
    public M14382232638263786411 c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ Z8958134903007948842 h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public J2284846294773890298(Z8958134903007948842 z8958134903007948842, int i2) {
        this.h = z8958134903007948842;
        setDaemon(true);
        setContextClassLoader(Z8958134903007948842.class.getClassLoader());
        this.a = new G13921529853338173802();
        this.b = new A7209497065939201693();
        this.c = M14382232638263786411.d;
        this.nextParkedWorker = Z8958134903007948842.k;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final B6457840406537354631 a(boolean z) {
        B6457840406537354631 e;
        B6457840406537354631 e2;
        long j2;
        Unsafe unsafe;
        Unsafe unsafe2;
        M14382232638263786411 m14382232638263786411 = this.c;
        Z8958134903007948842 z8958134903007948842 = this.h;
        B6457840406537354631 b6457840406537354631 = null;
        G13921529853338173802 g13921529853338173802 = this.a;
        M14382232638263786411 m143822326382637864112 = M14382232638263786411.a;
        if (m14382232638263786411 != m143822326382637864112) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = Z8958134903007948842.i;
            do {
                j2 = atomicLongFieldUpdater.get(z8958134903007948842);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    g13921529853338173802.getClass();
                    long j3 = G13921529853338173802.f;
                    loop1: while (true) {
                        unsafe = T5284056093300834442.a;
                        B6457840406537354631 b64578404065373546312 = (B6457840406537354631) unsafe.getObjectVolatile(g13921529853338173802, j3);
                        if (b64578404065373546312 != null && b64578404065373546312.b) {
                            do {
                                unsafe2 = T5284056093300834442.a;
                                if (unsafe2.compareAndSwapObject(g13921529853338173802, G13921529853338173802.f, b64578404065373546312, (Object) null)) {
                                    b6457840406537354631 = b64578404065373546312;
                                    break loop1;
                                }
                            } while (unsafe2.getObjectVolatile(g13921529853338173802, j3) == b64578404065373546312);
                        }
                    }
                    int intVolatile = unsafe.getIntVolatile(g13921529853338173802, G13921529853338173802.e);
                    int intVolatile2 = unsafe.getIntVolatile(g13921529853338173802, G13921529853338173802.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || T5284056093300834442.a.getIntVolatile(g13921529853338173802, G13921529853338173802.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        B6457840406537354631 d = g13921529853338173802.d(intVolatile2, true);
                        if (d != null) {
                            b6457840406537354631 = d;
                            break;
                        }
                    }
                    if (b6457840406537354631 != null) {
                        return b6457840406537354631;
                    }
                    B6457840406537354631 b64578404065373546313 = (B6457840406537354631) z8958134903007948842.f.d();
                    return b64578404065373546313 == null ? i(1) : b64578404065373546313;
                }
            } while (!Z8958134903007948842.i.compareAndSet(z8958134903007948842, j2, j2 - 4398046511104L));
            this.c = m143822326382637864112;
        }
        if (z) {
            boolean z2 = d(z8958134903007948842.a * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            g13921529853338173802.getClass();
            B6457840406537354631 b64578404065373546314 = (B6457840406537354631) T5284056093300834442.a.getAndSetObject(g13921529853338173802, G13921529853338173802.f, (Object) null);
            if (b64578404065373546314 == null) {
                b64578404065373546314 = g13921529853338173802.c();
            }
            if (b64578404065373546314 != null) {
                return b64578404065373546314;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            B6457840406537354631 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final B6457840406537354631 e() {
        int d = d(2);
        Z8958134903007948842 z8958134903007948842 = this.h;
        X13748952700216916374 x13748952700216916374 = z8958134903007948842.f;
        X13748952700216916374 x137489527002169163742 = z8958134903007948842.e;
        if (d == 0) {
            B6457840406537354631 b6457840406537354631 = (B6457840406537354631) x137489527002169163742.d();
            return b6457840406537354631 != null ? b6457840406537354631 : (B6457840406537354631) x13748952700216916374.d();
        }
        B6457840406537354631 b64578404065373546312 = (B6457840406537354631) x13748952700216916374.d();
        return b64578404065373546312 != null ? b64578404065373546312 : (B6457840406537354631) x137489527002169163742.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(M14382232638263786411 m14382232638263786411) {
        M14382232638263786411 m143822326382637864112 = this.c;
        boolean z = m143822326382637864112 == M14382232638263786411.a;
        if (z) {
            Z8958134903007948842.i.addAndGet(this.h, 4398046511104L);
        }
        if (m143822326382637864112 != m14382232638263786411) {
            this.c = m14382232638263786411;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r1 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.B6457840406537354631 i(int r29) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J2284846294773890298.i(int):dev.epro.r0.B6457840406537354631");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J2284846294773890298.run():void");
    }
}
