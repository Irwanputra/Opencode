package p034.p069.p070.p071;

import java.util.HashMap;
import p034.p069.p070.p071.C1447;

/* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1454<K, V> extends C1447<K, V> {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public HashMap<K, C1447.C1449<K, V>> f6747 = new HashMap<>();

    public boolean contains(K k) {
        return this.f6747.containsKey(k);
    }

    @Override // p034.p069.p070.p071.C1447
    /* renamed from: げつ〴ぬぐ */
    public C1447.C1449<K, V> mo3190(K k) {
        return this.f6747.get(k);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public V m3195(K k, V v) {
        C1447.C1449<K, V> c1449 = this.f6747.get(k);
        if (c1449 != null) {
            return c1449.f6739;
        }
        this.f6747.put(k, m3189(k, v));
        return null;
    }

    @Override // p034.p069.p070.p071.C1447
    /* renamed from: びぐびあび */
    public V mo3191(K k) {
        V v = (V) super.mo3191(k);
        this.f6747.remove(k);
        return v;
    }
}
