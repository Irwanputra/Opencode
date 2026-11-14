package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C16732999532893277940 implements G4373553504164397325 {
    public final /* synthetic */ G4373553504164397325 a;
    public final B4739506393801054036 b;
    public final B4739506393801054036 c;

    public C16732999532893277940(G4373553504164397325 g4373553504164397325, final P10756132848474239277 p10756132848474239277) {
        this.a = g4373553504164397325;
        final byte b = 0;
        this.b = Z3658309082448601011.b(new B13729205492206812220() { // from class: dev.epro.r0.E3904987167455071724
            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b2 = b;
                P10756132848474239277 p107561328484742392772 = p10756132848474239277;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(p107561328484742392772.a.g() < p107561328484742392772.b.g());
                    default:
                        return Boolean.valueOf(p107561328484742392772.a.g() > 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.c = Z3658309082448601011.b(new B13729205492206812220() { // from class: dev.epro.r0.E3904987167455071724
            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b22 = b2;
                P10756132848474239277 p107561328484742392772 = p10756132848474239277;
                switch (b22) {
                    case 0:
                        return Boolean.valueOf(p107561328484742392772.a.g() < p107561328484742392772.b.g());
                    default:
                        return Boolean.valueOf(p107561328484742392772.a.g() > 0.0f);
                }
            }
        });
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean b() {
        return this.a.b();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final float d(float f) {
        return this.a.d(f);
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final Object e(D6414970586266598845 d6414970586266598845, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        return this.a.e(d6414970586266598845, l12639328004344855510, k14749510448791472029);
    }
}
