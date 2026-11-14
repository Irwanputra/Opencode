package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W16122746836868022518 {
    public final F6942723054099263096 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ I1378617920849948703 d;

    public W16122746836868022518(I1378617920849948703 i1378617920849948703, F6942723054099263096 f6942723054099263096) {
        this.d = i1378617920849948703;
        this.a = f6942723054099263096;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        I1378617920849948703 i1378617920849948703 = this.d;
        int i2 = i1378617920849948703.c;
        i1378617920849948703.c = i + i2;
        if (!i1378617920849948703.d) {
            i1378617920849948703.d = true;
            while (true) {
                try {
                    int i3 = i1378617920849948703.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    i1378617920849948703.d = false;
                }
            }
        }
        if (this.b) {
            i1378617920849948703.c(this);
        }
    }
}
