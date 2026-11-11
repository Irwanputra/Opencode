package p034.p080;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p034.p080.AbstractC1495.C1496;
import p034.p080.AbstractC1495.C1497;
import p034.p080.AbstractC1495.C1499;

/* renamed from: づざかべべ.づざかべべ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1502<K, V> extends C1493<K, V> implements Map<K, V> {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public AbstractC1495<K, V> f6937;

    /* renamed from: づざかべべ.づざかべべ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1503 extends AbstractC1495<K, V> {
        public C1503() {
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: 〳ぜぞぜべっ */
        public void mo3256(int i) {
            C1502.this.m3254(i);
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: 〺つふすそ */
        public Object mo3257(int i, int i2) {
            return C1502.this.f6909[(i << 1) + i2];
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: ぁごぐすすぃ */
        public void mo3258(K k, V v) {
            C1502.this.put(k, v);
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: くし〴〺ぅ */
        public Map<K, V> mo3259() {
            return C1502.this;
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: げつ〴ぬぐ */
        public void mo3260() {
            C1502.this.clear();
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: づざかべべ */
        public int mo3261(Object obj) {
            return C1502.this.m3251(obj);
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: なぎぱいぢぎ */
        public int mo3262(Object obj) {
            return C1502.this.m3248(obj);
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: びぐびあび */
        public int mo3263() {
            return C1502.this.f6910;
        }

        @Override // p034.p080.AbstractC1495
        /* renamed from: ぺぁあねじ */
        public V mo3264(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = C1502.this.f6909;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    public C1502() {
    }

    public C1502(int i) {
        super(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1502(C1493 c1493) {
        if (c1493 != null) {
            int i = c1493.f6910;
            m3247(this.f6910 + i);
            if (this.f6910 != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c1493.m3246(i2), c1493.m3255(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c1493.f6908, 0, this.f6908, 0, i);
                System.arraycopy(c1493.f6909, 0, this.f6909, 0, i << 1);
                this.f6910 = i;
            }
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        AbstractC1495<K, V> m3274 = m3274();
        if (m3274.f6914 == null) {
            m3274.f6914 = m3274.new C1496();
        }
        return m3274.f6914;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        AbstractC1495<K, V> m3274 = m3274();
        if (m3274.f6912 == null) {
            m3274.f6912 = m3274.new C1497();
        }
        return m3274.f6912;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m3247(map.size() + this.f6910);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        AbstractC1495<K, V> m3274 = m3274();
        if (m3274.f6913 == null) {
            m3274.f6913 = m3274.new C1499();
        }
        return m3274.f6913;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final AbstractC1495<K, V> m3274() {
        if (this.f6937 == null) {
            this.f6937 = new C1503();
        }
        return this.f6937;
    }
}
