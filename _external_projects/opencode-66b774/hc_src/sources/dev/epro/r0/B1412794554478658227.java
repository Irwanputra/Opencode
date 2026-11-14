package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class B1412794554478658227 {
    public final byte a;
    public final S11323950170556863336 b;
    public final T15504973625601650233 c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public B1412794554478658227(int i) {
        this.a = i;
        if (i <= 0) {
            S10973172697741180971.j("maxSize <= 0");
            throw null;
        }
        this.b = new S11323950170556863336((byte) 2);
        this.c = new T15504973625601650233((byte) 17);
    }

    public Object a(Object obj) {
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public final Object c(Object obj) {
        Object put;
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object a = a(obj);
            if (a == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    put = this.b.a.put(obj, a);
                    if (put != null) {
                        this.b.a.put(obj, put);
                    } else {
                        this.d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                b(obj, a, put);
                return put;
            }
            e(this.a);
            return a;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d++;
            put = this.b.a.put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        if (put != null) {
            b(obj, put, obj2);
        }
        e(this.a);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r5) {
        /*
            r4 = this;
        L0:
            dev.epro.r0.T15504973625601650233 r0 = r4.c
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L61
            dev.epro.r0.S11323950170556863336 r1 = r4.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r4.d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L61
            goto L18
        L16:
            r4 = move-exception
            goto L69
        L18:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L16
            if (r1 <= r5) goto L5f
            dev.epro.r0.S11323950170556863336 r1 = r4.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L5f
        L27:
            dev.epro.r0.S11323950170556863336 r1 = r4.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = dev.epro.r0.R9411874267597469228.C0(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L3e
            monitor-exit(r0)
            return
        L3e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            dev.epro.r0.S11323950170556863336 r3 = r4.b     // Catch: java.lang.Throwable -> L16
            r2.getClass()     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.d     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            int r3 = r3 + (-1)
            r4.d = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r4.b(r2, r1, r0)
            goto L0
        L5f:
            monitor-exit(r0)
            return
        L61:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L16
            throw r5     // Catch: java.lang.Throwable -> L16
        L69:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B1412794554478658227.e(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + ((int) this.a) + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
