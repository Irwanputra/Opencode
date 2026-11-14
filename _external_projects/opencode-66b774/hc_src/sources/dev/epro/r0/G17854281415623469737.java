package dev.epro.r0;

import o.bwmna.gdrqkg.izmyclvb;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G17854281415623469737 implements G4373553504164397325 {
    public static final V10300877997588547986 k = new V10300877997588547986((Object) new W15213244012953673763(23), (Object) new A1775503136567729878((byte) 27), (byte) 20);
    public final P6024466796603310388 a;
    public float g;
    public final B4739506393801054036 i;
    public final B4739506393801054036 j;
    public final P6024466796603310388 b = new P6024466796603310388(0);
    public final P6024466796603310388 c = new P6024466796603310388(0);
    public final V697849047308847220 d = V4416135141588678913.t(Boolean.FALSE);
    public final S9385204271696540760 e = new S9385204271696540760();
    public final P6024466796603310388 f = new P6024466796603310388(Integer.MAX_VALUE);
    public final V16232943500580701817 h = new V16232943500580701817(new H8734584053421516944(this, (byte) 25));

    public G17854281415623469737(int i) {
        this.a = new P6024466796603310388(i);
        final byte b = 0;
        this.i = Z3658309082448601011.b(new B13729205492206812220(this) { // from class: dev.epro.r0.F16738569989882976043
            public final /* synthetic */ G17854281415623469737 b;

            static {
                izmyclvb.dpqpjfpoanwt1(633);
            }

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final native Object invoke();
        });
        final byte b2 = 1;
        this.j = Z3658309082448601011.b(new B13729205492206812220(this) { // from class: dev.epro.r0.F16738569989882976043
            public final /* synthetic */ G17854281415623469737 b;

            static {
                izmyclvb.dpqpjfpoanwt1(633);
            }

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final native Object invoke();
        });
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean a() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean b() {
        return this.h.b();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final float d(float f) {
        return this.h.d(f);
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final Object e(D6414970586266598845 d6414970586266598845, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        Object e = this.h.e(d6414970586266598845, l12639328004344855510, k14749510448791472029);
        return e == Z3437138737604933638.a ? e : O9245300239821758723.a;
    }

    public final void f(int i) {
        P6024466796603310388 p6024466796603310388 = this.a;
        this.f.h(i);
        M4722199849958580248 h = T8598786036980488824.h();
        F4096073349764486348 e = h != null ? h.e() : null;
        M4722199849958580248 o2 = T8598786036980488824.o(h);
        try {
            if (p6024466796603310388.g() > i) {
                p6024466796603310388.h(i);
            }
        } finally {
            T8598786036980488824.x(h, o2, e);
        }
    }
}
