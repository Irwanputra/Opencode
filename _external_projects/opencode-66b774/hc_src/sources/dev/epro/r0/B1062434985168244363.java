package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B1062434985168244363 implements E15320933127936247274, G5610643384273062965 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B1062434985168244363(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.G5610643384273062965
    public final Object a(String str, F4096073349764486348 f4096073349764486348, K14749510448791472029 k14749510448791472029) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((L5112781861520238507) obj).a(str, f4096073349764486348, k14749510448791472029);
            default:
                return ((R13852894593656905185) obj).a(str, f4096073349764486348, k14749510448791472029);
        }
    }

    @Override // dev.epro.r0.E15320933127936247274
    public final SQLiteConnection b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((L5112781861520238507) obj).b;
            default:
                return ((R13852894593656905185) obj).b;
        }
    }
}
