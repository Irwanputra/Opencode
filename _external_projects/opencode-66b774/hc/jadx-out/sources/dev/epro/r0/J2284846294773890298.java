package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r1 = r4.getIntVolatile(r11, dev.epro.r0.G13921529853338173802.e);
        r2 = r4.getIntVolatile(r11, dev.epro.r0.G13921529853338173802.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r1 == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (dev.epro.r0.T5284056093300834442.a.getIntVolatile(r11, dev.epro.r0.G13921529853338173802.d) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r2 = r2 - 1;
        r4 = r11.d(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r4 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r8 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.B6457840406537354631 a(boolean r17) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J2284846294773890298.a(boolean):dev.epro.r0.B6457840406537354631");
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
        int iD = d(2);
        Z8958134903007948842 z8958134903007948842 = this.h;
        X13748952700216916374 x13748952700216916374 = z8958134903007948842.f;
        X13748952700216916374 x137489527002169163742 = z8958134903007948842.e;
        if (iD == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r1 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.B6457840406537354631 i(int r29) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J2284846294773890298.i(int):dev.epro.r0.B6457840406537354631");
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J2284846294773890298.run():void");
    }
}
