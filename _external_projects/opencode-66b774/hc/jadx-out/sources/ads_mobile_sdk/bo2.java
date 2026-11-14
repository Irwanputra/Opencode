package ads_mobile_sdk;

import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.Q15035754882231748864;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S7864201625552763331;
import dev.epro.r0.X7175349259954592591;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bo2 implements S7864201625552763331 {
    public final /* synthetic */ Q15035754882231748864 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ bo2(Q15035754882231748864 q15035754882231748864, byte b) {
        this.b = b;
        this.a = q15035754882231748864;
    }

    @Override // dev.epro.r0.S7864201625552763331
    public final Object emit(Object obj, R4833348786910499294 r4833348786910499294) {
        byte b = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Q15035754882231748864 q15035754882231748864 = this.a;
        switch (b) {
            case 0:
                ((X7175349259954592591) q15035754882231748864).A(new kq2(new CancellationException("Ad request cancelled by publisher action.")));
                break;
            default:
                q15035754882231748864.c(new kq2(new CancellationException("Ad request cancelled by publisher action.")));
                break;
        }
        return o9245300239821758723;
    }
}
