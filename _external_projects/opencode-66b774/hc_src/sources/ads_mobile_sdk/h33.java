package ads_mobile_sdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import dev.epro.r0.G17117010345184598579;
import dev.epro.r0.I11267981316413440737;
import dev.epro.r0.S16368912275120420111;
import dev.epro.r0.W677543363946197278;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class h33 extends e13 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ j33 c;

    public h33(j33 j33Var, IBinder iBinder) {
        this.c = j33Var;
        this.b = iBinder;
    }

    @Override // ads_mobile_sdk.e13
    public final void a() {
        S16368912275120420111 g17117010345184598579;
        k33 k33Var = this.c.a;
        k33Var.i.getClass();
        int i = W677543363946197278.j;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            g17117010345184598579 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
            g17117010345184598579 = queryLocalInterface instanceof S16368912275120420111 ? (S16368912275120420111) queryLocalInterface : new G17117010345184598579(iBinder, "com.google.android.play.core.prewarm.protocol.IPrewarmService", (byte) 1);
        }
        k33Var.n = g17117010345184598579;
        d62 d62Var = k33Var.b;
        d62Var.getClass();
        int i2 = 0;
        try {
            ((I11267981316413440737) k33Var.n).b.linkToDeath(k33Var.k, 0);
        } catch (RemoteException unused) {
            d62Var.getClass();
        }
        k33Var.g = false;
        ArrayList arrayList = k33Var.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        k33Var.d.clear();
    }
}
