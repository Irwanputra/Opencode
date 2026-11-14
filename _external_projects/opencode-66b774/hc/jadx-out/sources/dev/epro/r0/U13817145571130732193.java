package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U13817145571130732193 extends A8269341136279542501 {
    public final W12973714701299903186 a;
    public final F13241018602672925865 b;
    public final I2076339260272013590 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final R17143752899285419206 g;
    public final L9852841107405549527 h;
    public final T8337309744439716006 i;
    public final H10681976249452161517 j;

    public U13817145571130732193(W12973714701299903186 w12973714701299903186, F13241018602672925865 f13241018602672925865, I2076339260272013590 i2076339260272013590, boolean z, boolean z2, boolean z3, R17143752899285419206 r17143752899285419206, L9852841107405549527 l9852841107405549527, T8337309744439716006 t8337309744439716006, H10681976249452161517 h10681976249452161517) {
        this.a = w12973714701299903186;
        this.b = f13241018602672925865;
        this.c = i2076339260272013590;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = r17143752899285419206;
        this.h = l9852841107405549527;
        this.i = t8337309744439716006;
        this.j = h10681976249452161517;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        R9830136099613498593 r9830136099613498593 = new R9830136099613498593();
        r9830136099613498593.q = this.a;
        r9830136099613498593.r = this.b;
        r9830136099613498593.s = this.c;
        r9830136099613498593.t = this.d;
        r9830136099613498593.u = this.e;
        r9830136099613498593.v = this.f;
        r9830136099613498593.w = this.g;
        L9852841107405549527 l9852841107405549527 = this.h;
        r9830136099613498593.x = l9852841107405549527;
        r9830136099613498593.y = this.i;
        r9830136099613498593.z = this.j;
        l9852841107405549527.g = new V11747077964817688975(r9830136099613498593, (byte) 4);
        return r9830136099613498593;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        R9830136099613498593 r9830136099613498593 = (R9830136099613498593) r15896830329318850690;
        boolean z = r9830136099613498593.u;
        boolean z2 = z && !r9830136099613498593.t;
        boolean z3 = r9830136099613498593.v;
        T8337309744439716006 t8337309744439716006 = r9830136099613498593.y;
        L9852841107405549527 l9852841107405549527 = r9830136099613498593.x;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = z5 && !z4;
        r9830136099613498593.q = this.a;
        F13241018602672925865 f13241018602672925865 = this.b;
        r9830136099613498593.r = f13241018602672925865;
        r9830136099613498593.s = this.c;
        r9830136099613498593.t = z4;
        r9830136099613498593.u = z5;
        r9830136099613498593.w = this.g;
        L9852841107405549527 l98528411074055495272 = this.h;
        r9830136099613498593.x = l98528411074055495272;
        T8337309744439716006 t83373097444397160062 = this.i;
        r9830136099613498593.y = t83373097444397160062;
        r9830136099613498593.z = this.j;
        if (z5 != z || z6 != z2 || !S10823041268949770285.t(t83373097444397160062, t8337309744439716006) || this.f != z3 || !F12478849263529740365.d(f13241018602672925865.b)) {
            E10717724117948616506.n(r9830136099613498593);
        }
        if (l98528411074055495272 != l9852841107405549527) {
            l98528411074055495272.g = new V11747077964817688975(r9830136099613498593, (byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U13817145571130732193) {
            U13817145571130732193 u13817145571130732193 = (U13817145571130732193) obj;
            if (this.a.equals(u13817145571130732193.a) && S10823041268949770285.t(this.b, u13817145571130732193.b) && this.c == u13817145571130732193.c && this.d == u13817145571130732193.d && this.e == u13817145571130732193.e && this.f == u13817145571130732193.f && this.g.equals(u13817145571130732193.g) && this.h == u13817145571130732193.h && S10823041268949770285.t(this.i, u13817145571130732193.i) && S10823041268949770285.t(this.j, u13817145571130732193.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + G6547577305291411977.i(G6547577305291411977.i(G6547577305291411977.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", readOnly=");
        sb.append(this.d);
        sb.append(", enabled=");
        E12098517352909843120.u(sb, this.e, ", isPassword=", this.f, ", offsetMapping=");
        sb.append(this.g);
        sb.append(", manager=");
        sb.append(this.h);
        sb.append(", imeOptions=");
        sb.append(this.i);
        sb.append(", focusRequester=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
