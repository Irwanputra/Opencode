package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C16732999532893277940 implements dev.epro.r0.G4373553504164397325 {
    public final /* synthetic */ dev.epro.r0.G4373553504164397325 a;
    public final dev.epro.r0.B4739506393801054036 b;
    public final dev.epro.r0.B4739506393801054036 c;

    public C16732999532893277940(dev.epro.r0.G4373553504164397325 g4373553504164397325, final dev.epro.r0.P10756132848474239277 p10756132848474239277) {
        this.a = g4373553504164397325;
        final byte b = 0;
        this.b = dev.epro.r0.Z3658309082448601011.b(new dev.epro.r0.B13729205492206812220() { // from class: dev.epro.r0.E3904987167455071724
            @Override // dev.epro.r0.B13729205492206812220
            public final java.lang.Object invoke() {
                byte b2 = b;
                dev.epro.r0.P10756132848474239277 p107561328484742392772 = p10756132848474239277;
                switch (b2) {
                    case 0:
                        return java.lang.Boolean.valueOf(p107561328484742392772.a.g() < p107561328484742392772.b.g());
                    default:
                        return java.lang.Boolean.valueOf(p107561328484742392772.a.g() > 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.c = dev.epro.r0.Z3658309082448601011.b(new dev.epro.r0.B13729205492206812220() { // from class: dev.epro.r0.E3904987167455071724
            @Override // dev.epro.r0.B13729205492206812220
            public final java.lang.Object invoke() {
                byte b22 = b2;
                dev.epro.r0.P10756132848474239277 p107561328484742392772 = p10756132848474239277;
                switch (b22) {
                    case 0:
                        return java.lang.Boolean.valueOf(p107561328484742392772.a.g() < p107561328484742392772.b.g());
                    default:
                        return java.lang.Boolean.valueOf(p107561328484742392772.a.g() > 0.0f);
                }
            }
        });
    }

    public final boolean a() {
        return ((java.lang.Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return ((java.lang.Boolean) this.b.getValue()).booleanValue();
    }

    public final float d(float f) {
        return this.a.d(f);
    }

    public final java.lang.Object e(dev.epro.r0.D6414970586266598845 d6414970586266598845, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        return this.a.e(d6414970586266598845, l12639328004344855510, k14749510448791472029);
    }
}
