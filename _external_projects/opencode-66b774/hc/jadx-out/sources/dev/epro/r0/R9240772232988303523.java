package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R9240772232988303523 extends T9533098554585011700 {
    public CharSequence c;
    public List d;
    public F12478849263529740365 e;
    public S16571168858015125610 f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public F10342546226345611902 k;
    public U14340554418656580554 l;
    public long m;
    public Q17957571128037780363 n;

    public R9240772232988303523() {
        super(D459204867321966484.h().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = O15160157444238005800.b(0, 0, 0, 0, 15);
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final void a(T9533098554585011700 t9533098554585011700) {
        t9533098554585011700.getClass();
        R9240772232988303523 r9240772232988303523 = (R9240772232988303523) t9533098554585011700;
        this.c = r9240772232988303523.c;
        this.d = r9240772232988303523.d;
        this.e = r9240772232988303523.e;
        this.f = r9240772232988303523.f;
        this.g = r9240772232988303523.g;
        this.h = r9240772232988303523.h;
        this.i = r9240772232988303523.i;
        this.j = r9240772232988303523.j;
        this.k = r9240772232988303523.k;
        this.l = r9240772232988303523.l;
        this.m = r9240772232988303523.m;
        this.n = r9240772232988303523.n;
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final T9533098554585011700 b() {
        return new R9240772232988303523();
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        List list = this.d;
        F12478849263529740365 f12478849263529740365 = this.e;
        S16571168858015125610 s16571168858015125610 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        float f = this.i;
        float f2 = this.j;
        F10342546226345611902 f10342546226345611902 = this.k;
        U14340554418656580554 u14340554418656580554 = this.l;
        String strL = I16980768508151520658.l(this.m);
        Q17957571128037780363 q17957571128037780363 = this.n;
        StringBuilder sb = new StringBuilder("CacheRecord(visualText=");
        sb.append((Object) charSequence);
        sb.append(", annotations=");
        sb.append(list);
        sb.append(", composition=");
        sb.append(f12478849263529740365);
        sb.append(", textStyle=");
        sb.append(s16571168858015125610);
        sb.append(", singleLine=");
        E12098517352909843120.u(sb, z, ", softWrap=", z2, ", densityValue=");
        sb.append(f);
        sb.append(", fontScale=");
        sb.append(f2);
        sb.append(", layoutDirection=");
        sb.append(f10342546226345611902);
        sb.append(", fontFamilyResolver=");
        sb.append(u14340554418656580554);
        sb.append(", constraints=");
        sb.append(strL);
        sb.append(", layoutResult=");
        sb.append(q17957571128037780363);
        sb.append(")");
        return sb.toString();
    }
}
