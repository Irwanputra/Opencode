package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class B14040374145288525816 extends L7743116545240101509 implements Runnable {
    public I13152720973475179368 h;
    public Class i;
    public Object j;

    public B14040374145288525816(I13152720973475179368 i13152720973475179368, Class cls, Object obj) {
        this.h = i13152720973475179368;
        this.i = cls;
        this.j = obj;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final void c() {
        I13152720973475179368 i13152720973475179368 = this.h;
        if ((i13152720973475179368 != null) & (this.a instanceof P421411870588928118)) {
            i13152720973475179368.cancel(o());
        }
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String i() {
        String str;
        I13152720973475179368 i13152720973475179368 = this.h;
        Class cls = this.i;
        Object obj = this.j;
        String i = super.i();
        if (i13152720973475179368 != null) {
            str = "inputFuture=[" + i13152720973475179368 + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (i != null) {
                return str.concat(i);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public Object r(Object obj, Throwable th) {
        R3171298526896875739 r3171298526896875739 = (R3171298526896875739) obj;
        D16915945238461757356 apply = r3171298526896875739.apply(th);
        if (apply != null) {
            return apply;
        }
        Z3383101362411723454.k(E17665849472693074628.f("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", r3171298526896875739));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            dev.epro.r0.I13152720973475179368 r0 = r8.h
            java.lang.Class r1 = r8.i
            java.lang.Object r2 = r8.j
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto La1
            java.lang.Object r3 = r8.a
            boolean r3 = r3 instanceof dev.epro.r0.P421411870588928118
            if (r3 == 0) goto L21
            goto La1
        L21:
            r3 = 0
            r8.h = r3
            if (r0 == 0) goto L31
            java.lang.Throwable r4 = r0.n()     // Catch: java.lang.Error -> L2b java.lang.RuntimeException -> L2d java.util.concurrent.ExecutionException -> L2f
            goto L32
        L2b:
            r4 = move-exception
            goto L39
        L2d:
            r4 = move-exception
            goto L39
        L2f:
            r4 = move-exception
            goto L3b
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L39
            java.lang.Object r5 = dev.epro.r0.M9216324016624295870.F(r0)     // Catch: java.lang.Error -> L2b java.lang.RuntimeException -> L2d java.util.concurrent.ExecutionException -> L2f
            goto L6b
        L39:
            r5 = r3
            goto L6b
        L3b:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L69
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Future type "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L69:
            r4 = r5
            goto L39
        L6b:
            if (r4 != 0) goto L71
            r8.k(r5)
            return
        L71:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L7b
            r8.m(r0)
            return
        L7b:
            java.lang.Object r0 = r8.r(r2, r4)     // Catch: java.lang.Throwable -> L87
            r8.i = r3
            r8.j = r3
            r8.s(r0)
            return
        L87:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L93
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9b
            r1.interrupt()     // Catch: java.lang.Throwable -> L9b
        L93:
            r8.l(r0)     // Catch: java.lang.Throwable -> L9b
            r8.i = r3
            r8.j = r3
            return
        L9b:
            r0 = move-exception
            r8.i = r3
            r8.j = r3
            throw r0
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B14040374145288525816.run():void");
    }

    public void s(Object obj) {
        m((D16915945238461757356) obj);
    }
}
