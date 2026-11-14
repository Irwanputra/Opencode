package dev.epro.r0;

import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L13891208534469225493 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ L13891208534469225493(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                Y2066038017114788875.j((Y2066038017114788875) obj, (Z17471428274427141949) this.b, 0, 0);
                break;
            case 1:
                Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Y2066038017114788875.j(y2066038017114788875, (Z17471428274427141949) arrayList.get(i), 0, 0);
                        if (i == size) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                break;
            case 2:
                ((P8628803860726212495) this.b).cancel();
                break;
            case 3:
                ((H7219028874700587498) this.b).resumeWith(o9245300239821758723);
                break;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                I17687524211334993649 i17687524211334993649 = (I17687524211334993649) this.b;
                if (i17687524211334993649 != null) {
                    i17687524211334993649.c = booleanValue;
                    break;
                }
                break;
            case 5:
                KeyEvent keyEvent = ((Q16871679788547714558) obj).a;
                A15234621907337682254 a15234621907337682254 = (A15234621907337682254) this.b;
                if (M2066880349381062048.N.n(keyEvent) == T10370494902461206356.COPY) {
                    a15234621907337682254.c();
                } else {
                    z = false;
                }
                break;
            case 6:
                Throwable th = (Throwable) obj;
                Z7637734454282223795 z7637734454282223795 = (Z7637734454282223795) this.b;
                H7219028874700587498 h7219028874700587498 = z7637734454282223795.c;
                if (h7219028874700587498 != null) {
                    h7219028874700587498.k(th);
                }
                z7637734454282223795.c = null;
                break;
            default:
                float[] fArr = ((N9580590882934638229) obj).a;
                B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.b;
                if (b1029012102904255937.C()) {
                    V12319504402545346730.z(b1029012102904255937).i(b1029012102904255937, fArr);
                    break;
                }
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ L13891208534469225493() {
        this.a = (byte) 4;
    }
}
