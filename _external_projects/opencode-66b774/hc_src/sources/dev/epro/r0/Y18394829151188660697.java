package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class Y18394829151188660697 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L7100317404093621994 b;

    public /* synthetic */ Y18394829151188660697(L7100317404093621994 l7100317404093621994, byte b) {
        this.a = b;
        this.b = l7100317404093621994;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L7100317404093621994 l7100317404093621994 = this.b;
        O16200024709371809403 o16200024709371809403 = (O16200024709371809403) obj;
        switch (b) {
            case 0:
                F9886074403848142923 f9886074403848142923 = l7100317404093621994.d;
                float g = f9886074403848142923.f.g();
                float c = f9886074403848142923.e().c();
                float f = g < c ? c - g : 0.0f;
                o16200024709371809403.h(f > 0.0f ? (Float.intBitsToFloat((int) (o16200024709371809403.r & 4294967295L)) + f) / Float.intBitsToFloat((int) (o16200024709371809403.r & 4294967295L)) : 1.0f);
                o16200024709371809403.l(L12240044716294895599.c(0.5f, 0.0f));
                break;
            default:
                F9886074403848142923 f98860744038481429232 = l7100317404093621994.d;
                float g2 = f98860744038481429232.f.g();
                float c2 = f98860744038481429232.e().c();
                float f2 = g2 < c2 ? c2 - g2 : 0.0f;
                o16200024709371809403.h(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (o16200024709371809403.r & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & o16200024709371809403.r))) : 1.0f);
                o16200024709371809403.l(L12240044716294895599.c(0.5f, 0.0f));
                break;
        }
        return o9245300239821758723;
    }
}
