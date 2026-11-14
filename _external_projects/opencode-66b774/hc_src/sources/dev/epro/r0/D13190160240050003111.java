package dev.epro.r0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D13190160240050003111 extends W287267600478292859 {
    public J3301701597851028733 a = new J3301701597851028733(17);
    public B14108412273878533248 b;
    public Object c;
    public int d;
    public int e;
    public P3648740535677465818 f;

    public D13190160240050003111(P3648740535677465818 p3648740535677465818) {
        this.b = p3648740535677465818.a;
        this.e = p3648740535677465818.b;
        this.f = p3648740535677465818;
    }

    @Override // dev.epro.r0.W287267600478292859
    public final Set a() {
        return new H517100720723278129(this, (byte) 0);
    }

    @Override // dev.epro.r0.W287267600478292859
    public final Set b() {
        return new H517100720723278129(this, (byte) 1);
    }

    @Override // dev.epro.r0.W287267600478292859
    public final int c() {
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = B14108412273878533248.e;
        i(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof T5853297761459116769) {
            return f((T5853297761459116769) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof R13778158386904154684) {
            return super.containsValue((R13778158386904154684) obj);
        }
        return false;
    }

    @Override // dev.epro.r0.W287267600478292859
    public final Collection d() {
        return new S5911664163520104644(this, (byte) 1);
    }

    public final P3648740535677465818 e() {
        B14108412273878533248 b14108412273878533248 = this.b;
        P3648740535677465818 p3648740535677465818 = this.f;
        if (b14108412273878533248 != p3648740535677465818.a) {
            this.a = new J3301701597851028733((byte) 17);
            p3648740535677465818 = new P3648740535677465818(this.b, c());
        }
        this.f = p3648740535677465818;
        return p3648740535677465818;
    }

    public final boolean f(Object obj) {
        return this.b.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object g(Object obj) {
        return this.b.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof T5853297761459116769) {
            return (R13778158386904154684) g((T5853297761459116769) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof T5853297761459116769) ? obj2 : (R13778158386904154684) super.getOrDefault((T5853297761459116769) obj, (R13778158386904154684) obj2);
    }

    public final Object h(Object obj) {
        this.c = null;
        B14108412273878533248 n = this.b.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = B14108412273878533248.e;
        }
        this.b = n;
        return this.c;
    }

    public final void i(int i) {
        this.e = i;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.c = null;
        this.b = this.b.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [dev.epro.r0.C560824835210562156] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        P3648740535677465818 p3648740535677465818 = null;
        P3648740535677465818 p36487405356774658182 = map instanceof C560824835210562156 ? (C560824835210562156) map : null;
        if (p36487405356774658182 == null) {
            D13190160240050003111 d13190160240050003111 = map instanceof D13190160240050003111 ? (D13190160240050003111) map : null;
            if (d13190160240050003111 != null) {
                p3648740535677465818 = d13190160240050003111.e();
            }
        } else {
            p3648740535677465818 = p36487405356774658182;
        }
        if (p3648740535677465818 == null) {
            super.putAll(map);
            return;
        }
        J8000059863626891400 j8000059863626891400 = new J8000059863626891400();
        j8000059863626891400.a = 0;
        int i = this.e;
        B14108412273878533248 b14108412273878533248 = this.b;
        B14108412273878533248 b141084122738785332482 = p3648740535677465818.a;
        b141084122738785332482.getClass();
        this.b = b14108412273878533248.m(b141084122738785332482, 0, j8000059863626891400, this);
        int i2 = (p3648740535677465818.b + i) - j8000059863626891400.a;
        if (i != i2) {
            i(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int c = c();
        B14108412273878533248 o2 = this.b.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o2 == null) {
            o2 = B14108412273878533248.e;
        }
        this.b = o2;
        return c != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof T5853297761459116769) {
            return (R13778158386904154684) h((T5853297761459116769) obj);
        }
        return null;
    }
}
