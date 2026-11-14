package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f33 extends ads_mobile_sdk.e13 {
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ byte e;

    public /* synthetic */ f33(java.lang.Object obj, byte b) {
        this.e = b;
        this.b = obj;
    }

    @Override // ads_mobile_sdk.e13
    public final void a() {
        switch (this.e) {
            case 0:
                synchronized (((ads_mobile_sdk.k33) this.b).f) {
                    try {
                        if (((ads_mobile_sdk.k33) this.b).l.get() > 0 && ((ads_mobile_sdk.k33) this.b).l.decrementAndGet() > 0) {
                            ((ads_mobile_sdk.k33) this.b).b.getClass();
                            return;
                        }
                        ads_mobile_sdk.k33 k33Var = (ads_mobile_sdk.k33) this.b;
                        if (k33Var.n != null) {
                            k33Var.b.getClass();
                            ads_mobile_sdk.k33 k33Var2 = (ads_mobile_sdk.k33) this.b;
                            k33Var2.a.unbindService(k33Var2.m);
                            k33Var = (ads_mobile_sdk.k33) this.b;
                            k33Var.g = false;
                            k33Var.n = null;
                            k33Var.m = null;
                        }
                        java.util.Iterator it = k33Var.e.iterator();
                        while (it.hasNext()) {
                            ((dev.epro.r0.M17133811648581684718) it.next()).a(new android.os.RemoteException(k33Var.c + " : Binder has died."));
                        }
                        k33Var.e.clear();
                        return;
                    } finally {
                    }
                }
            default:
                ads_mobile_sdk.k33 k33Var3 = ((ads_mobile_sdk.j33) this.b).a;
                k33Var3.b.getClass();
                k33Var3.n.b.unlinkToDeath(k33Var3.k, 0);
                k33Var3.n = null;
                k33Var3.g = false;
                return;
        }
    }
}
