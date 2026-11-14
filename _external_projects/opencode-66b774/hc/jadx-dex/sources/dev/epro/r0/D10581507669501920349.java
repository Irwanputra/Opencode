package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D10581507669501920349 implements dev.epro.r0.B10711125991901730801, android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback {
    public static long h;
    public final android.view.View a;
    public boolean c;
    public boolean f;
    public long g;
    public final java.util.PriorityQueue b = new java.util.PriorityQueue(11, new dev.epro.r0.M5459415309190684092((byte) 0));
    public final android.view.Choreographer d = android.view.Choreographer.getInstance();
    public final dev.epro.r0.N5212948766656490716 e = new dev.epro.r0.N5212948766656490716();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D10581507669501920349(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            dev.epro.r0.M5459415309190684092 r1 = new dev.epro.r0.M5459415309190684092
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.d = r0
            dev.epro.r0.N5212948766656490716 r0 = new dev.epro.r0.N5212948766656490716
            r0.<init>()
            r4.e = r0
            long r0 = dev.epro.r0.D10581507669501920349.h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            dev.epro.r0.D10581507669501920349.h = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.f = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D10581507669501920349.<init>(android.view.View):void");
    }

    @Override // dev.epro.r0.B10711125991901730801
    public final void a(dev.epro.r0.X8133657484919231199 x8133657484919231199) {
        this.b.add(new dev.epro.r0.Q4498434392846071086(1, x8133657484919231199));
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this);
    }

    public final boolean b() {
        dev.epro.r0.N5212948766656490716 n5212948766656490716 = this.e;
        long jA = n5212948766656490716.a();
        dev.epro.r0.D1286559660607336098.E(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            java.util.PriorityQueue priorityQueue = this.b;
            java.lang.Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((dev.epro.r0.Q4498434392846071086) objPeek).b.c(n5212948766656490716)) {
                priorityQueue.poll();
                z = false;
            }
            n5212948766656490716.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.g = j;
            this.a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.c && this.f) {
            android.view.View view = this.a;
            if (view.getWindowVisibility() == 0) {
                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = java.lang.System.nanoTime() > (2 * h) + nanos;
                dev.epro.r0.N5212948766656490716 n5212948766656490716 = this.e;
                n5212948766656490716.a = z;
                n5212948766656490716.b = java.lang.Math.max(this.g, nanos) + h;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (n5212948766656490716.a) {
                        android.os.Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            android.os.Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.d.postFrameCallback(this);
                } else {
                    this.c = false;
                }
                dev.epro.r0.D1286559660607336098.E(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.c = false;
    }
}
