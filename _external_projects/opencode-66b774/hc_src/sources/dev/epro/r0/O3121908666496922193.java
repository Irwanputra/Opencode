package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O3121908666496922193 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O3121908666496922193(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                E15954736605708921304 e15954736605708921304 = ((L9355021486018394642) obj).i;
                return new U10174709222559481877(J8045362843799184672.j0(e15954736605708921304.a, e15954736605708921304.b, W10816543021280842737.c.c(0.0f)));
            case 1:
                ArrayList arrayList = ((T15652639163465303893) obj).a;
                A4559761392562572984 a4559761392562572984 = new A4559761392562572984(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    G815828180435804960 g815828180435804960 = (G815828180435804960) arrayList.get(i);
                    Object obj2 = g815828180435804960.b;
                    int i2 = g815828180435804960.a;
                    C1629617973188005475.a(a4559761392562572984, obj2 != null ? new Z2695505886244604040(Integer.valueOf(i2), g815828180435804960.b) : Integer.valueOf(i2), g815828180435804960);
                }
                return new C1629617973188005475(a4559761392562572984);
            default:
                return new G11493083415162978130[((J12043550928838212009[]) obj).length];
        }
    }
}
