package dev.epro.r0;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F15441078260174406238 implements I2388620560486547149 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public F15441078260174406238(N16594346128251165883 n16594346128251165883) {
        this.a = (byte) 3;
        this.b = n16594346128251165883;
        E1096494211642212429 e1096494211642212429 = E1096494211642212429.c;
        Class<?> cls = n16594346128251165883.getClass();
        G17001453823809908244 g17001453823809908244 = (G17001453823809908244) e1096494211642212429.a.get(cls);
        this.c = g17001453823809908244 == null ? e1096494211642212429.a(cls, null) : g17001453823809908244;
    }

    @Override // dev.epro.r0.I2388620560486547149
    public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                A17704723979876201899 a17704723979876201899 = (A17704723979876201899) obj;
                switch (E13178263116897699848.a[p72364327365747079.ordinal()]) {
                    case 1:
                    case 4:
                    case 6:
                        break;
                    case 2:
                        a17704723979876201899.b(i4293432593871965076);
                        break;
                    case 3:
                        a17704723979876201899.e(i4293432593871965076);
                        break;
                    case 5:
                        a17704723979876201899.c(i4293432593871965076);
                        break;
                    case 7:
                        S10973172697741180971.j("ON_ANY must not been send by anybody");
                        break;
                    default:
                        Z3383101362411723454.g();
                        break;
                }
                I2388620560486547149 i2388620560486547149 = (I2388620560486547149) obj2;
                if (i2388620560486547149 != null) {
                    i2388620560486547149.d(i4293432593871965076, p72364327365747079);
                    break;
                }
                break;
            case 1:
                if (p72364327365747079 == P72364327365747079.ON_START) {
                    ((R3192876217964974737) obj).b(this);
                    ((V10300877997588547986) obj2).A();
                    break;
                }
                break;
            case 2:
                G12293180102257068867 g12293180102257068867 = (G12293180102257068867) obj;
                int i = A5097928295631059085.a[p72364327365747079.ordinal()];
                if (i == 1) {
                    g12293180102257068867.g(true);
                    break;
                } else if (i == 2) {
                    g12293180102257068867.g(false);
                    break;
                } else if (i == 3) {
                    g12293180102257068867.e();
                    ((R3192876217964974737) obj2).b(this);
                    break;
                }
                break;
            default:
                N16594346128251165883 n16594346128251165883 = (N16594346128251165883) obj;
                HashMap hashMap = ((G17001453823809908244) obj2).a;
                G17001453823809908244.a((List) hashMap.get(p72364327365747079), i4293432593871965076, p72364327365747079, n16594346128251165883);
                G17001453823809908244.a((List) hashMap.get(P72364327365747079.ON_ANY), i4293432593871965076, p72364327365747079, n16594346128251165883);
                break;
        }
    }

    public /* synthetic */ F15441078260174406238(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public F15441078260174406238(G12293180102257068867 g12293180102257068867, U6333859635337865127 u6333859635337865127, R3192876217964974737 r3192876217964974737) {
        this.a = (byte) 2;
        this.b = g12293180102257068867;
        this.c = r3192876217964974737;
    }
}
