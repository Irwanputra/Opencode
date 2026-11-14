package ads_mobile_sdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import dev.epro.r0.A12732730042960812466;
import dev.epro.r0.G17117010345184598579;
import dev.epro.r0.M17133811648581684718;
import dev.epro.r0.S16368912275120420111;
import dev.epro.r0.Z15241293964366332233;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class e33 extends e13 {
    public final /* synthetic */ M17133811648581684718 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ byte e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e33(k33 k33Var, M17133811648581684718 m17133811648581684718, M17133811648581684718 m171338116485816847182, e33 e33Var) {
        super(m17133811648581684718);
        this.d = k33Var;
        this.b = m171338116485816847182;
        this.c = e33Var;
    }

    @Override // ads_mobile_sdk.e13
    public final void a() {
        switch (this.e) {
            case 0:
                synchronized (((k33) this.d).f) {
                    try {
                        M17133811648581684718 m17133811648581684718 = this.b;
                        k33 k33Var = (k33) this.d;
                        k33Var.e.add(m17133811648581684718);
                        m17133811648581684718.a.a(new A12732730042960812466(k33Var, m17133811648581684718, (byte) 8));
                        if (((k33) this.d).l.getAndIncrement() > 0) {
                            ((k33) this.d).b.getClass();
                        }
                        ((k33) this.d).a((e33) this.c);
                    } finally {
                    }
                    break;
                }
                return;
            default:
                tl2 tl2Var = (tl2) this.d;
                try {
                    S16368912275120420111 s16368912275120420111 = tl2Var.a.n;
                    String str = tl2Var.b;
                    hi2 hi2Var = (hi2) this.c;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList(hi2Var.a);
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        Bundle bundle = new Bundle();
                        bundle.putString("url", (String) obj);
                        arrayList.add(bundle);
                    }
                    Bundle bundle2 = new Bundle();
                    sl2 sl2Var = new sl2(tl2Var);
                    G17117010345184598579 g17117010345184598579 = (G17117010345184598579) s16368912275120420111;
                    g17117010345184598579.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(g17117010345184598579.c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedList(arrayList);
                    int i2 = Z15241293964366332233.a;
                    parcelObtain.writeInt(1);
                    bundle2.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(sl2Var);
                    try {
                        g17117010345184598579.b.transact(1, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    tl2.c.getClass();
                    this.b.a(new RuntimeException(e));
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e33(tl2 tl2Var, M17133811648581684718 m17133811648581684718, hi2 hi2Var, M17133811648581684718 m171338116485816847182) {
        super(m17133811648581684718);
        this.d = tl2Var;
        this.c = hi2Var;
        this.b = m171338116485816847182;
    }
}
