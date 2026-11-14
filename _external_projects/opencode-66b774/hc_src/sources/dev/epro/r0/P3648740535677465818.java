package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P3648740535677465818 extends C560824835210562156 implements F6964411466477411570 {
    public static final P3648740535677465818 d = new P3648740535677465818(B14108412273878533248.e, 0);

    public final P3648740535677465818 b(T5853297761459116769 t5853297761459116769, R13778158386904154684 r13778158386904154684) {
        Q6203700555324584864 u = this.a.u(t5853297761459116769.hashCode(), 0, t5853297761459116769, r13778158386904154684);
        return u == null ? this : new P3648740535677465818((B14108412273878533248) u.b, this.b + (u.a ? 1 : 0));
    }

    @Override // dev.epro.r0.C560824835210562156, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof T5853297761459116769) {
            return super.containsKey((T5853297761459116769) obj);
        }
        return false;
    }

    @Override // dev.epro.r0.C560824835210562156, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof R13778158386904154684) {
            return super.containsValue((R13778158386904154684) obj);
        }
        return false;
    }

    @Override // dev.epro.r0.C560824835210562156, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof T5853297761459116769) {
            return (R13778158386904154684) super.get((T5853297761459116769) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof T5853297761459116769) ? obj2 : (R13778158386904154684) super.getOrDefault((T5853297761459116769) obj, (R13778158386904154684) obj2);
    }
}
