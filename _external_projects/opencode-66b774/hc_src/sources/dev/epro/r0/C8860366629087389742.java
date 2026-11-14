package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class C8860366629087389742 implements F4096073349764486348 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ C8860366629087389742(V8323072410254082725 v8323072410254082725, X4418276304150334445 x4418276304150334445, X4418276304150334445 x44182763041503344452, D2717688760023469083 d2717688760023469083, boolean z) {
        this.c = x4418276304150334445;
        this.d = d2717688760023469083;
        this.b = z;
        this.e = v8323072410254082725;
        this.f = x44182763041503344452;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        boolean z = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                V697849047308847220 v697849047308847220 = ((D7996823394324996916) obj5).c;
                W1972671267364756056 w1972671267364756056 = (W1972671267364756056) obj4;
                L13148442655056575112 l13148442655056575112 = (L13148442655056575112) obj3;
                L13148442655056575112 l131484426550565751122 = (L13148442655056575112) obj2;
                O16200024709371809403 o16200024709371809403 = (O16200024709371809403) obj;
                float f = 0.8f;
                float f2 = 1.0f;
                o16200024709371809403.g(!z ? ((Number) l13148442655056575112.getValue()).floatValue() : ((Boolean) v697849047308847220.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z) {
                    f = ((Number) l13148442655056575112.getValue()).floatValue();
                } else if (((Boolean) v697849047308847220.getValue()).booleanValue()) {
                    f = 1.0f;
                }
                o16200024709371809403.h(f);
                if (!z) {
                    f2 = ((Number) l131484426550565751122.getValue()).floatValue();
                } else if (!((Boolean) v697849047308847220.getValue()).booleanValue()) {
                    f2 = 0.0f;
                }
                o16200024709371809403.b(f2);
                o16200024709371809403.l(((N13757329872968394114) w1972671267364756056.getValue()).a);
                break;
            case 1:
                R14289894334981469490 r14289894334981469490 = (R14289894334981469490) obj;
                r14289894334981469490.getClass();
                ((M4043793213707479819) obj5).a = true;
                ((M4043793213707479819) obj4).a = true;
                ((L841391951668269384) obj3).n(r14289894334981469490, z, (N11678082982039175888) obj2);
                break;
            default:
                D2717688760023469083 d2717688760023469083 = (D2717688760023469083) obj4;
                long a = S11671697357523908420.a(d2717688760023469083.o(z));
                ((X4418276304150334445) obj5).a = a;
                d2717688760023469083.A((V8323072410254082725) obj3, a);
                ((X4418276304150334445) obj2).a = 0L;
                d2717688760023469083.v = -1;
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ C8860366629087389742(M4043793213707479819 m4043793213707479819, M4043793213707479819 m40437932137074798192, L841391951668269384 l841391951668269384, boolean z, N11678082982039175888 n11678082982039175888) {
        this.c = m4043793213707479819;
        this.d = m40437932137074798192;
        this.e = l841391951668269384;
        this.b = z;
        this.f = n11678082982039175888;
    }

    public /* synthetic */ C8860366629087389742(boolean z, D7996823394324996916 d7996823394324996916, W1972671267364756056 w1972671267364756056, O4957013336652243483 o4957013336652243483, O4957013336652243483 o49570133366522434832) {
        this.b = z;
        this.c = d7996823394324996916;
        this.d = w1972671267364756056;
        this.e = o4957013336652243483;
        this.f = o49570133366522434832;
    }
}
