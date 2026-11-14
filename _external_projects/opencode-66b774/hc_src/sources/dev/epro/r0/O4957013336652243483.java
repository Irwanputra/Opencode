package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O4957013336652243483 implements L13148442655056575112 {
    public final R3937090736490516115 a;
    public final V697849047308847220 b;
    public final V697849047308847220 c;
    public final V697849047308847220 d;
    public A3837673882952568173 e;
    public W543543915243615877 f;
    public final V697849047308847220 g;
    public final O15319392248629494012 h;
    public boolean i;
    public final V697849047308847220 j;
    public Z13251062865217617579 k;
    public final D10907589866287058828 l;
    public boolean m;
    public final M7102034154292440921 n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W3656598099029166611 f411o;

    public O4957013336652243483(W3656598099029166611 w3656598099029166611, Object obj, Z13251062865217617579 z13251062865217617579, R3937090736490516115 r3937090736490516115) {
        this.f411o = w3656598099029166611;
        this.a = r3937090736490516115;
        V697849047308847220 t = V4416135141588678913.t(obj);
        this.b = t;
        Object obj2 = null;
        V697849047308847220 t2 = V4416135141588678913.t(O4077903568229246.Q(0.0f, 0.0f, null, 7));
        this.c = t2;
        this.d = V4416135141588678913.t(new W543543915243615877((A10693687560045094360) t2.getValue(), r3937090736490516115, obj, t.getValue(), z13251062865217617579));
        this.g = V4416135141588678913.t(Boolean.TRUE);
        this.h = new O15319392248629494012(-1.0f);
        this.j = V4416135141588678913.t(obj);
        this.k = z13251062865217617579;
        this.l = new D10907589866287058828(a().c());
        Float f = (Float) I12271177246410047083.a.get(r3937090736490516115);
        if (f != null) {
            float floatValue = f.floatValue();
            Z13251062865217617579 z132510628652176175792 = (Z13251062865217617579) ((O3410298526443296213) r3937090736490516115).a.invoke(obj);
            int b = z132510628652176175792.b();
            for (int i = 0; i < b; i++) {
                z132510628652176175792.e(i, floatValue);
            }
            obj2 = ((O3410298526443296213) this.a).b.invoke(z132510628652176175792);
        }
        this.n = O4077903568229246.Q(0.0f, 0.0f, obj2, 3);
    }

    public final W543543915243615877 a() {
        return (W543543915243615877) this.d.getValue();
    }

    public final void b(long j) {
        if (this.h.g() == -1.0f) {
            this.m = true;
            if (S10823041268949770285.t(a().c, a().d)) {
                c(a().c);
            } else {
                c(a().b(j));
                this.k = a().f(j);
            }
        }
    }

    public final void c(Object obj) {
        this.j.setValue(obj);
    }

    public final void e(Object obj, boolean z) {
        W543543915243615877 w543543915243615877 = this.f;
        Object obj2 = w543543915243615877 != null ? w543543915243615877.c : null;
        V697849047308847220 v697849047308847220 = this.b;
        boolean t = S10823041268949770285.t(obj2, v697849047308847220.getValue());
        D10907589866287058828 d10907589866287058828 = this.l;
        V697849047308847220 v6978490473088472202 = this.d;
        A10693687560045094360 a10693687560045094360 = this.n;
        if (t) {
            v6978490473088472202.setValue(new W543543915243615877(a10693687560045094360, this.a, obj, obj, this.k.c()));
            this.i = true;
            d10907589866287058828.h(a().c());
            return;
        }
        V697849047308847220 v6978490473088472203 = this.c;
        if (!z || this.m) {
            a10693687560045094360 = (A10693687560045094360) v6978490473088472203.getValue();
        } else if (((A10693687560045094360) v6978490473088472203.getValue()) instanceof M7102034154292440921) {
            a10693687560045094360 = (A10693687560045094360) v6978490473088472203.getValue();
        }
        W3656598099029166611 w3656598099029166611 = this.f411o;
        v6978490473088472202.setValue(new W543543915243615877(w3656598099029166611.e() <= 0 ? a10693687560045094360 : new Q3521869144606538118(a10693687560045094360, w3656598099029166611.e()), this.a, obj, v697849047308847220.getValue(), this.k));
        d10907589866287058828.h(a().c());
        this.i = false;
        w3656598099029166611.o(true);
        if (w3656598099029166611.g()) {
            R5670552972627103399 r5670552972627103399 = w3656598099029166611.j;
            int size = r5670552972627103399.size();
            for (int i = 0; i < size; i++) {
                O4957013336652243483 o4957013336652243483 = (O4957013336652243483) r5670552972627103399.get(i);
                o4957013336652243483.l.g();
                o4957013336652243483.b(0L);
            }
            w3656598099029166611.o(false);
        }
    }

    public final void f(Object obj, Object obj2, A10693687560045094360 a10693687560045094360) {
        this.b.setValue(obj2);
        this.c.setValue(a10693687560045094360);
        if (S10823041268949770285.t(a().d, obj) && S10823041268949770285.t(a().c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, A10693687560045094360 a10693687560045094360, Object obj2, Z13251062865217617579 z13251062865217617579) {
        if (this.i) {
            W543543915243615877 w543543915243615877 = this.f;
            if (S10823041268949770285.t(obj, w543543915243615877 != null ? w543543915243615877.c : null)) {
                return;
            }
        }
        V697849047308847220 v697849047308847220 = this.b;
        boolean t = S10823041268949770285.t(v697849047308847220.getValue(), obj);
        O15319392248629494012 o15319392248629494012 = this.h;
        if (t && o15319392248629494012.g() == -1.0f && (obj2 == null || obj2.equals(a().d))) {
            return;
        }
        v697849047308847220.setValue(obj);
        this.c.setValue(a10693687560045094360);
        Object value = obj2 == null ? o15319392248629494012.g() == -3.0f ? obj : this.j.getValue() : obj2;
        if (obj2 != null) {
            c(value);
            if (z13251062865217617579 != null) {
                this.k = z13251062865217617579;
            }
        }
        V697849047308847220 v6978490473088472202 = this.g;
        e(value, !((Boolean) v6978490473088472202.getValue()).booleanValue());
        v6978490473088472202.setValue(Boolean.valueOf(o15319392248629494012.g() == -3.0f));
        if (o15319392248629494012.g() >= 0.0f) {
            c(a().b((long) (o15319392248629494012.g() * a().c())));
        } else if (o15319392248629494012.g() == -3.0f) {
            c(obj);
        }
        this.i = false;
        o15319392248629494012.h(-1.0f);
    }

    @Override // dev.epro.r0.L13148442655056575112
    public final Object getValue() {
        return this.j.getValue();
    }

    public final String toString() {
        return "current value: " + this.j.getValue() + ", target: " + this.b.getValue() + ", spec: " + ((A10693687560045094360) this.c.getValue());
    }
}
