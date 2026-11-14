package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M8081976061220108806 implements A7868207189447841291 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ A7868207189447841291 b;
    public final /* synthetic */ G4373553504164397325 c;

    public /* synthetic */ M8081976061220108806(A7868207189447841291 a7868207189447841291, G4373553504164397325 g4373553504164397325, byte b) {
        this.a = b;
        this.c = g4373553504164397325;
        this.b = a7868207189447841291;
    }

    @Override // dev.epro.r0.A7868207189447841291
    public final float a(float f) {
        switch (this.a) {
        }
        return this.b.a(f);
    }

    public final int b(int i) {
        Object obj;
        byte b = this.a;
        G4373553504164397325 g4373553504164397325 = this.c;
        switch (b) {
            case 0:
                O11472352839632764090 h = ((E17523205116624666034) g4373553504164397325).h();
                if (h.l.isEmpty()) {
                    return 0;
                }
                int c = c();
                if (i > e() || c > i) {
                    return ((i - c()) * O5354877807466160604.h0(h)) - d();
                }
                List list = h.l;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        if (((H3043063065558747866) obj).a != i) {
                            i2++;
                        }
                    } else {
                        obj = null;
                    }
                }
                H3043063065558747866 h3043063065558747866 = (H3043063065558747866) obj;
                if (h3043063065558747866 != null) {
                    return h3043063065558747866.f271o;
                }
                return 0;
            default:
                X16625187937554653603 x16625187937554653603 = (X16625187937554653603) g4373553504164397325;
                return (int) (W7808703833045379622.s(D15445857918358799638.C(x16625187937554653603) + T18016951143603335921.Z(((x16625187937554653603.n() * (i - ((P6024466796603310388) x16625187937554653603.d.c).g())) - (((O15319392248629494012) x16625187937554653603.d.d).g() * x16625187937554653603.n())) + 0.0f), x16625187937554653603.h, x16625187937554653603.g) - D15445857918358799638.C(x16625187937554653603));
        }
    }

    public final int c() {
        byte b = this.a;
        G4373553504164397325 g4373553504164397325 = this.c;
        switch (b) {
            case 0:
                return ((E17523205116624666034) g4373553504164397325).e.b.g();
            default:
                return ((X16625187937554653603) g4373553504164397325).e;
        }
    }

    public final int d() {
        byte b = this.a;
        G4373553504164397325 g4373553504164397325 = this.c;
        switch (b) {
            case 0:
                return ((E17523205116624666034) g4373553504164397325).e.c.g();
            default:
                return ((X16625187937554653603) g4373553504164397325).f;
        }
    }

    public final int e() {
        byte b = this.a;
        G4373553504164397325 g4373553504164397325 = this.c;
        switch (b) {
            case 0:
                H3043063065558747866 h3043063065558747866 = (H3043063065558747866) R9411874267597469228.L0(((E17523205116624666034) g4373553504164397325).h().l);
                if (h3043063065558747866 != null) {
                    return h3043063065558747866.a;
                }
                return 0;
            default:
                return ((A17975991316152527869) R9411874267597469228.K0(((X16625187937554653603) g4373553504164397325).k().a)).a;
        }
    }

    public final void f(int i) {
        byte b = this.a;
        G4373553504164397325 g4373553504164397325 = this.c;
        switch (b) {
            case 0:
                ((E17523205116624666034) g4373553504164397325).l(i, 0, true);
                break;
            default:
                X16625187937554653603 x16625187937554653603 = (X16625187937554653603) g4373553504164397325;
                float n = x16625187937554653603.n();
                x16625187937554653603.r(n != 0.0f ? 0.0f / n : 0.0f, i, true);
                break;
        }
    }
}
