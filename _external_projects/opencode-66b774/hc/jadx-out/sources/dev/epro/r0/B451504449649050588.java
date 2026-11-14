package dev.epro.r0;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B451504449649050588 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ B451504449649050588(R2847330884077978889 r2847330884077978889, Bundle bundle) {
        this.b = r2847330884077978889;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                I6845661640435175914 i6845661640435175914 = (I6845661640435175914) obj;
                S14461012662136963693 s14461012662136963693 = (S14461012662136963693) i6845661640435175914.d;
                try {
                    S14461012662136963693 s14461012662136963693I = ((F6353700998356592239) i6845661640435175914.c).i(((S14461012662136963693) obj2).c());
                    N10542843603712830247 n10542843603712830247 = s14461012662136963693I.b;
                    E8496491261769853844 e8496491261769853844 = P12466553659249280316.b;
                    n10542843603712830247.b(new I6845661640435175914((Executor) e8496491261769853844, i6845661640435175914, (char) 0));
                    s14461012662136963693I.i();
                    n10542843603712830247.b(new I6845661640435175914(e8496491261769853844, i6845661640435175914, (byte) 0));
                    s14461012662136963693I.i();
                    n10542843603712830247.b(new I6845661640435175914(e8496491261769853844, i6845661640435175914));
                    s14461012662136963693I.i();
                    break;
                } catch (Z6733768557799306456 e) {
                    if (e.getCause() instanceof Exception) {
                        i6845661640435175914.b((Exception) e.getCause());
                        return;
                    } else {
                        s14461012662136963693.e(e);
                        return;
                    }
                } catch (CancellationException unused) {
                    i6845661640435175914.a();
                    return;
                } catch (Exception e2) {
                    s14461012662136963693.e(e2);
                    return;
                }
                break;
            default:
                R2847330884077978889 r2847330884077978889 = (R2847330884077978889) obj2;
                Bundle bundle = (Bundle) obj;
                try {
                    T8664623300549140039 t8664623300549140039 = (T8664623300549140039) ((IInterface) r2847330884077978889.b.j);
                    if (t8664623300549140039 != null) {
                        H3351639798230113779 h3351639798230113779 = r2847330884077978889.d;
                        V18155119740721705968 v18155119740721705968 = (V18155119740721705968) t8664623300549140039;
                        Parcel parcelC = v18155119740721705968.c();
                        int i = H15787954015490686430.a;
                        parcelC.writeInt(1);
                        bundle.writeToParcel(parcelC, 0);
                        if (h3351639798230113779 == null) {
                            parcelC.writeStrongBinder(null);
                        } else {
                            parcelC.writeStrongBinder(h3351639798230113779);
                        }
                        v18155119740721705968.d(parcelC, 4);
                    }
                } catch (DeadObjectException | RemoteException unused2) {
                    return;
                }
                break;
        }
    }

    public B451504449649050588(I6845661640435175914 i6845661640435175914, S14461012662136963693 s14461012662136963693) {
        this.c = i6845661640435175914;
        this.b = s14461012662136963693;
    }
}
