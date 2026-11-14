package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S9315175385921259790 implements R9757436368382764378 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ S9315175385921259790(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.R9757436368382764378
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                T9198164096090695723 t9198164096090695723 = (T9198164096090695723) obj;
                if (t9198164096090695723 == null) {
                    t9198164096090695723 = new T9198164096090695723(-3);
                }
                ((W8455343525638953052) this.b).K(t9198164096090695723);
                return;
            default:
                T9198164096090695723 t91981640960906957232 = (T9198164096090695723) obj;
                synchronized (T1225794268786662319.c) {
                    try {
                        W929662112881511578 w929662112881511578 = T1225794268786662319.d;
                        ArrayList arrayList = (ArrayList) w929662112881511578.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        w929662112881511578.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((R9757436368382764378) arrayList.get(i)).accept(t91981640960906957232);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
