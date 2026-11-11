package p034.p080;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: づざかべべ.づざかべべ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1505<K, V> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f6944;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f6945;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f6946;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final LinkedHashMap<K, V> f6947;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f6948;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f6949;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f6950;

    public C1505(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f6946 = i;
        this.f6947 = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f6949;
        i2 = this.f6945 + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f6946), Integer.valueOf(this.f6949), Integer.valueOf(this.f6945), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final V m3284(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f6950++;
            this.f6944++;
            put = this.f6947.put(k, v);
            if (put != null) {
                this.f6944--;
            }
        }
        m3285(this.f6946);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3285(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f6944     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.f6947     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f6944     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f6944     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.f6947     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f6947     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<K, V> r0 = r2.f6947     // Catch: java.lang.Throwable -> L69
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f6944     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.f6944 = r0     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f6948     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.f6948 = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L6d
        L6c:
            throw r3
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p080.C1505.m3285(int):void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final V m3286(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f6947.get(k);
            if (v != null) {
                this.f6949++;
                return v;
            }
            this.f6945++;
            return null;
        }
    }
}
