package dev.epro.r0;

import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U16585827167541805744 extends G10233783090438693160 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U16585827167541805744(H18172316468146598624 h18172316468146598624, byte b) {
        super(h18172316468146598624);
        this.b = b;
    }

    @Override // dev.epro.r0.Q14474720477641017052
    public final boolean b(L16425900549479658727 l16425900549479658727) {
        byte b = this.b;
        l16425900549479658727.getClass();
        switch (b) {
            case 0:
                return l16425900549479658727.j.c;
            case 1:
                return l16425900549479658727.j.e;
            case 2:
                return l16425900549479658727.j.a == M12733718480826052124.b;
            case 3:
                return l16425900549479658727.j.a == M12733718480826052124.c;
            default:
                return l16425900549479658727.j.f;
        }
    }

    @Override // dev.epro.r0.G10233783090438693160
    public final int d() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // dev.epro.r0.G10233783090438693160
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                U4907063343750015025 u4907063343750015025 = (U4907063343750015025) obj;
                u4907063343750015025.getClass();
                return u4907063343750015025.e || !u4907063343750015025.a || (Build.VERSION.SDK_INT >= 26 && !u4907063343750015025.b);
            case 3:
                U4907063343750015025 u49070633437500150252 = (U4907063343750015025) obj;
                u49070633437500150252.getClass();
                return !u49070633437500150252.a || u49070633437500150252.c || u49070633437500150252.e;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
