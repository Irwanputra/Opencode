package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class C8860366629087389742 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ C8860366629087389742(dev.epro.r0.V8323072410254082725 v8323072410254082725, dev.epro.r0.X4418276304150334445 x4418276304150334445, dev.epro.r0.X4418276304150334445 x44182763041503344452, dev.epro.r0.D2717688760023469083 d2717688760023469083, boolean z) {
        this.c = x4418276304150334445;
        this.d = d2717688760023469083;
        this.b = z;
        this.e = v8323072410254082725;
        this.f = x44182763041503344452;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.a;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.Object obj2 = this.f;
        java.lang.Object obj3 = this.e;
        boolean z = this.b;
        java.lang.Object obj4 = this.d;
        java.lang.Object obj5 = this.c;
        switch (b) {
            case 0:
                dev.epro.r0.V697849047308847220 v697849047308847220 = ((dev.epro.r0.D7996823394324996916) obj5).c;
                dev.epro.r0.W1972671267364756056 w1972671267364756056 = (dev.epro.r0.W1972671267364756056) obj4;
                dev.epro.r0.L13148442655056575112 l13148442655056575112 = (dev.epro.r0.L13148442655056575112) obj3;
                dev.epro.r0.L13148442655056575112 l131484426550565751122 = (dev.epro.r0.L13148442655056575112) obj2;
                dev.epro.r0.O16200024709371809403 o16200024709371809403 = (dev.epro.r0.O16200024709371809403) obj;
                float fFloatValue = 0.8f;
                float fFloatValue2 = 1.0f;
                o16200024709371809403.g(!z ? ((java.lang.Number) l13148442655056575112.getValue()).floatValue() : ((java.lang.Boolean) v697849047308847220.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z) {
                    fFloatValue = ((java.lang.Number) l13148442655056575112.getValue()).floatValue();
                } else if (((java.lang.Boolean) v697849047308847220.getValue()).booleanValue()) {
                    fFloatValue = 1.0f;
                }
                o16200024709371809403.h(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((java.lang.Number) l131484426550565751122.getValue()).floatValue();
                } else if (!((java.lang.Boolean) v697849047308847220.getValue()).booleanValue()) {
                    fFloatValue2 = 0.0f;
                }
                o16200024709371809403.b(fFloatValue2);
                o16200024709371809403.l(((dev.epro.r0.N13757329872968394114) w1972671267364756056.getValue()).a);
                break;
            case 1:
                dev.epro.r0.R14289894334981469490 r14289894334981469490 = (dev.epro.r0.R14289894334981469490) obj;
                r14289894334981469490.getClass();
                ((dev.epro.r0.M4043793213707479819) obj5).a = true;
                ((dev.epro.r0.M4043793213707479819) obj4).a = true;
                ((dev.epro.r0.L841391951668269384) obj3).n(r14289894334981469490, z, (dev.epro.r0.N11678082982039175888) obj2);
                break;
            default:
                dev.epro.r0.D2717688760023469083 d2717688760023469083 = (dev.epro.r0.D2717688760023469083) obj4;
                long jA = dev.epro.r0.S11671697357523908420.a(d2717688760023469083.o(z));
                ((dev.epro.r0.X4418276304150334445) obj5).a = jA;
                d2717688760023469083.A((dev.epro.r0.V8323072410254082725) obj3, jA);
                ((dev.epro.r0.X4418276304150334445) obj2).a = 0L;
                d2717688760023469083.v = -1;
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ C8860366629087389742(dev.epro.r0.M4043793213707479819 m4043793213707479819, dev.epro.r0.M4043793213707479819 m40437932137074798192, dev.epro.r0.L841391951668269384 l841391951668269384, boolean z, dev.epro.r0.N11678082982039175888 n11678082982039175888) {
        this.c = m4043793213707479819;
        this.d = m40437932137074798192;
        this.e = l841391951668269384;
        this.b = z;
        this.f = n11678082982039175888;
    }

    public /* synthetic */ C8860366629087389742(boolean z, dev.epro.r0.D7996823394324996916 d7996823394324996916, dev.epro.r0.W1972671267364756056 w1972671267364756056, dev.epro.r0.O4957013336652243483 o4957013336652243483, dev.epro.r0.O4957013336652243483 o49570133366522434832) {
        this.b = z;
        this.c = d7996823394324996916;
        this.d = w1972671267364756056;
        this.e = o4957013336652243483;
        this.f = o49570133366522434832;
    }
}
