package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class e33 extends ads_mobile_sdk.e13 {
    public final /* synthetic */ dev.epro.r0.M17133811648581684718 b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ byte e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e33(ads_mobile_sdk.k33 k33Var, dev.epro.r0.M17133811648581684718 m17133811648581684718, dev.epro.r0.M17133811648581684718 m171338116485816847182, ads_mobile_sdk.e33 e33Var) {
        super(m17133811648581684718);
        this.d = k33Var;
        this.b = m171338116485816847182;
        this.c = e33Var;
    }

    @Override // ads_mobile_sdk.e13
    public final void a() {
        switch (this.e) {
            case 0:
                synchronized (((ads_mobile_sdk.k33) this.d).f) {
                    try {
                        dev.epro.r0.M17133811648581684718 m17133811648581684718 = this.b;
                        ads_mobile_sdk.k33 k33Var = (ads_mobile_sdk.k33) this.d;
                        k33Var.e.add(m17133811648581684718);
                        m17133811648581684718.a.a(new dev.epro.r0.A12732730042960812466(k33Var, m17133811648581684718, (byte) 8));
                        if (((ads_mobile_sdk.k33) this.d).l.getAndIncrement() > 0) {
                            ((ads_mobile_sdk.k33) this.d).b.getClass();
                        }
                        ((ads_mobile_sdk.k33) this.d).a((ads_mobile_sdk.e33) this.c);
                    } finally {
                    }
                    break;
                }
                return;
            default:
                ads_mobile_sdk.tl2 tl2Var = (ads_mobile_sdk.tl2) this.d;
                try {
                    dev.epro.r0.G17117010345184598579 g17117010345184598579 = tl2Var.a.n;
                    java.lang.String str = tl2Var.b;
                    ads_mobile_sdk.hi2 hi2Var = (ads_mobile_sdk.hi2) this.c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(hi2Var.a);
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList2.get(i);
                        i++;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("url", (java.lang.String) obj);
                        arrayList.add(bundle);
                    }
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    dev.epro.r0.L14144435763408236280 sl2Var = new ads_mobile_sdk.sl2(tl2Var);
                    dev.epro.r0.G17117010345184598579 g171170103451845985792 = g17117010345184598579;
                    g171170103451845985792.getClass();
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    parcelObtain.writeInterfaceToken(((dev.epro.r0.I11267981316413440737) g171170103451845985792).c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedList(arrayList);
                    int i2 = dev.epro.r0.Z15241293964366332233.a;
                    parcelObtain.writeInt(1);
                    bundle2.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(sl2Var);
                    try {
                        ((dev.epro.r0.I11267981316413440737) g171170103451845985792).b.transact(1, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (java.lang.Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (android.os.RemoteException e) {
                    ads_mobile_sdk.tl2.c.getClass();
                    this.b.a(new java.lang.RuntimeException(e));
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e33(ads_mobile_sdk.tl2 tl2Var, dev.epro.r0.M17133811648581684718 m17133811648581684718, ads_mobile_sdk.hi2 hi2Var, dev.epro.r0.M17133811648581684718 m171338116485816847182) {
        super(m17133811648581684718);
        this.d = tl2Var;
        this.c = hi2Var;
        this.b = m171338116485816847182;
    }
}
