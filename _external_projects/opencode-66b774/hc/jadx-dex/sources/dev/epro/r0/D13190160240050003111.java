package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D13190160240050003111 extends dev.epro.r0.W287267600478292859 {
    public dev.epro.r0.J3301701597851028733 a = new dev.epro.r0.J3301701597851028733((byte) 17);
    public dev.epro.r0.B14108412273878533248 b;
    public java.lang.Object c;
    public int d;
    public int e;
    public dev.epro.r0.P3648740535677465818 f;

    public D13190160240050003111(dev.epro.r0.P3648740535677465818 p3648740535677465818) {
        this.b = p3648740535677465818.a;
        this.e = p3648740535677465818.b;
        this.f = p3648740535677465818;
    }

    public final java.util.Set a() {
        return new dev.epro.r0.H517100720723278129(this, (byte) 0);
    }

    public final java.util.Set b() {
        return new dev.epro.r0.H517100720723278129(this, (byte) 1);
    }

    public final int c() {
        return this.e;
    }

    public final void clear() {
        this.b = dev.epro.r0.B14108412273878533248.e;
        i(0);
    }

    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.T5853297761459116769) {
            return f((dev.epro.r0.T5853297761459116769) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.R13778158386904154684) {
            return super/*java.util.AbstractMap*/.containsValue((dev.epro.r0.R13778158386904154684) obj);
        }
        return false;
    }

    public final java.util.Collection d() {
        return new dev.epro.r0.S5911664163520104644(this, (byte) 1);
    }

    public final dev.epro.r0.P3648740535677465818 e() {
        dev.epro.r0.B14108412273878533248 b14108412273878533248 = this.b;
        dev.epro.r0.P3648740535677465818 p3648740535677465818 = this.f;
        if (b14108412273878533248 != p3648740535677465818.a) {
            this.a = new dev.epro.r0.J3301701597851028733((byte) 17);
            p3648740535677465818 = new dev.epro.r0.P3648740535677465818(this.b, c());
        }
        this.f = p3648740535677465818;
        return p3648740535677465818;
    }

    public final boolean f(java.lang.Object obj) {
        return this.b.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final java.lang.Object g(java.lang.Object obj) {
        return this.b.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.T5853297761459116769) {
            return (dev.epro.r0.R13778158386904154684) g((dev.epro.r0.T5853297761459116769) obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof dev.epro.r0.T5853297761459116769) ? obj2 : (dev.epro.r0.R13778158386904154684) super/*java.util.AbstractMap*/.getOrDefault((dev.epro.r0.T5853297761459116769) obj, (dev.epro.r0.R13778158386904154684) obj2);
    }

    public final java.lang.Object h(java.lang.Object obj) {
        this.c = null;
        dev.epro.r0.B14108412273878533248 b14108412273878533248N = this.b.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (b14108412273878533248N == null) {
            b14108412273878533248N = dev.epro.r0.B14108412273878533248.e;
        }
        this.b = b14108412273878533248N;
        return this.c;
    }

    public final void i(int i) {
        this.e = i;
        this.d++;
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.c = null;
        this.b = this.b.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(java.util.Map map) {
        dev.epro.r0.C560824835210562156 c560824835210562156E = null;
        dev.epro.r0.C560824835210562156 c560824835210562156 = map instanceof dev.epro.r0.C560824835210562156 ? (dev.epro.r0.C560824835210562156) map : null;
        if (c560824835210562156 == null) {
            dev.epro.r0.D13190160240050003111 d13190160240050003111 = map instanceof dev.epro.r0.D13190160240050003111 ? (dev.epro.r0.D13190160240050003111) map : null;
            if (d13190160240050003111 != null) {
                c560824835210562156E = d13190160240050003111.e();
            }
        } else {
            c560824835210562156E = c560824835210562156;
        }
        if (c560824835210562156E == null) {
            super/*java.util.AbstractMap*/.putAll(map);
            return;
        }
        dev.epro.r0.J8000059863626891400 j8000059863626891400 = new dev.epro.r0.J8000059863626891400();
        j8000059863626891400.a = 0;
        int i = this.e;
        dev.epro.r0.B14108412273878533248 b14108412273878533248 = this.b;
        dev.epro.r0.B14108412273878533248 b141084122738785332482 = c560824835210562156E.a;
        b141084122738785332482.getClass();
        this.b = b14108412273878533248.m(b141084122738785332482, 0, j8000059863626891400, this);
        int i2 = (c560824835210562156E.b + i) - j8000059863626891400.a;
        if (i != i2) {
            i(i2);
        }
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c();
        dev.epro.r0.B14108412273878533248 b14108412273878533248O = this.b.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (b14108412273878533248O == null) {
            b14108412273878533248O = dev.epro.r0.B14108412273878533248.e;
        }
        this.b = b14108412273878533248O;
        return iC != c();
    }

    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.T5853297761459116769) {
            return (dev.epro.r0.R13778158386904154684) h((dev.epro.r0.T5853297761459116769) obj);
        }
        return null;
    }
}
