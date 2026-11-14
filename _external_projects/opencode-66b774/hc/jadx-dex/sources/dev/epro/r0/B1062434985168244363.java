package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B1062434985168244363 implements dev.epro.r0.E15320933127936247274, dev.epro.r0.G5610643384273062965 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ B1062434985168244363(java.lang.Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final java.lang.Object a(java.lang.String str, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                return ((dev.epro.r0.L5112781861520238507) obj).a(str, f4096073349764486348, k14749510448791472029);
            default:
                return ((dev.epro.r0.R13852894593656905185) obj).a(str, f4096073349764486348, k14749510448791472029);
        }
    }

    @Override // dev.epro.r0.E15320933127936247274
    public final androidx.sqlite.SQLiteConnection b() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                return ((dev.epro.r0.L5112781861520238507) obj).b;
            default:
                return ((dev.epro.r0.R13852894593656905185) obj).b;
        }
    }
}
