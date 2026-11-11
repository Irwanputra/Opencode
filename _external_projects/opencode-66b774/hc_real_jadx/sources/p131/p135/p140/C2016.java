package p131.p135.p140;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* renamed from: なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2016<K, V> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f8742;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f8743;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f8744;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final LinkedHashMap<K, V> f8745;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f8746;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f8747;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f8748;

    public C2016(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f8744 = i;
        this.f8745 = new LinkedHashMap<>(0, 0.75f, true);
    }

    @SuppressLint({"DefaultLocale"})
    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f8747;
        i2 = this.f8743 + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f8744), Integer.valueOf(this.f8747), Integer.valueOf(this.f8743), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4115(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f8742     // Catch: java.lang.Throwable -> L6d
            if (r0 < 0) goto L4e
            java.util.LinkedHashMap<K, V> r0 = r3.f8745     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L11
            int r0 = r3.f8742     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L4e
        L11:
            int r0 = r3.f8742     // Catch: java.lang.Throwable -> L6d
            if (r0 <= r4) goto L4c
            java.util.LinkedHashMap<K, V> r0 = r3.f8745     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L1e
            goto L4c
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.f8745     // Catch: java.lang.Throwable -> L6d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap<K, V> r2 = r3.f8745     // Catch: java.lang.Throwable -> L6d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6d
            int r2 = r3.f8742     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.m4116(r1, r0)     // Catch: java.lang.Throwable -> L6d
            int r2 = r2 - r0
            r3.f8742 = r2     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.f8746     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + 1
            r3.f8746 = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            goto L0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            return
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6d
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r4     // Catch: java.lang.Throwable -> L6d
        L6d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L70:
            throw r4
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p135.p140.C2016.m4115(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int m4116(K k, V v) {
        Bitmap bitmap = (Bitmap) v;
        int height = bitmap.getHeight() * bitmap.getRowBytes();
        if (height >= 0) {
            return height;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }
}
