package dev.epro.r0;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H12000817172614548207 implements N12800445656637864660 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ P14575954172000745949 b;

    public /* synthetic */ H12000817172614548207(P14575954172000745949 p14575954172000745949, byte b) {
        this.a = b;
        this.b = p14575954172000745949;
    }

    @Override // dev.epro.r0.N12800445656637864660
    public final void a(Object obj) {
        byte b = this.a;
        P14575954172000745949 p14575954172000745949 = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I15053439731709465652 i15053439731709465652 = (I15053439731709465652) p14575954172000745949.C.pollFirst();
                if (i15053439731709465652 != null) {
                    p14575954172000745949.c.C(i15053439731709465652.a);
                    break;
                }
                break;
            case 1:
                H15446768409112154310 h15446768409112154310 = (H15446768409112154310) obj;
                I15053439731709465652 i150534397317094656522 = (I15053439731709465652) p14575954172000745949.C.pollFirst();
                if (i150534397317094656522 != null) {
                    String str = i150534397317094656522.a;
                    int i2 = i150534397317094656522.b;
                    C13374971588771233833 C = p14575954172000745949.c.C(str);
                    if (C != null) {
                        C.p(i2, h15446768409112154310.a, h15446768409112154310.b);
                        break;
                    }
                }
                break;
            default:
                H15446768409112154310 h154467684091121543102 = (H15446768409112154310) obj;
                I15053439731709465652 i150534397317094656523 = (I15053439731709465652) p14575954172000745949.C.pollFirst();
                if (i150534397317094656523 != null) {
                    String str2 = i150534397317094656523.a;
                    int i3 = i150534397317094656523.b;
                    C13374971588771233833 C2 = p14575954172000745949.c.C(str2);
                    if (C2 != null) {
                        C2.p(i3, h154467684091121543102.a, h154467684091121543102.b);
                        break;
                    }
                }
                break;
        }
    }
}
