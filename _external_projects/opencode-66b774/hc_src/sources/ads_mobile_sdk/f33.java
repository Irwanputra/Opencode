package ads_mobile_sdk;

import android.os.RemoteException;
import dev.epro.r0.I11267981316413440737;
import dev.epro.r0.M17133811648581684718;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class f33 extends e13 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte e;

    public /* synthetic */ f33(Object obj, byte b) {
        this.e = b;
        this.b = obj;
    }

    @Override // ads_mobile_sdk.e13
    public final void a() {
        switch (this.e) {
            case 0:
                synchronized (((k33) this.b).f) {
                    try {
                        if (((k33) this.b).l.get() > 0 && ((k33) this.b).l.decrementAndGet() > 0) {
                            ((k33) this.b).b.getClass();
                            return;
                        }
                        k33 k33Var = (k33) this.b;
                        if (k33Var.n != null) {
                            k33Var.b.getClass();
                            k33 k33Var2 = (k33) this.b;
                            k33Var2.a.unbindService(k33Var2.m);
                            k33Var = (k33) this.b;
                            k33Var.g = false;
                            k33Var.n = null;
                            k33Var.m = null;
                        }
                        Iterator it = k33Var.e.iterator();
                        while (it.hasNext()) {
                            ((M17133811648581684718) it.next()).a(new RemoteException(k33Var.c + " : Binder has died."));
                        }
                        k33Var.e.clear();
                        return;
                    } finally {
                    }
                }
            default:
                k33 k33Var3 = ((j33) this.b).a;
                k33Var3.b.getClass();
                ((I11267981316413440737) k33Var3.n).b.unlinkToDeath(k33Var3.k, 0);
                k33Var3.n = null;
                k33Var3.g = false;
                return;
        }
    }
}
