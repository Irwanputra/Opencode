package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B451504449649050588 implements java.lang.Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ B451504449649050588(dev.epro.r0.R2847330884077978889 r2847330884077978889, android.os.Bundle bundle) {
        this.b = r2847330884077978889;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (b) {
            case 0:
                dev.epro.r0.I6845661640435175914 i6845661640435175914 = (dev.epro.r0.I6845661640435175914) obj;
                dev.epro.r0.S14461012662136963693 s14461012662136963693 = (dev.epro.r0.S14461012662136963693) i6845661640435175914.d;
                try {
                    dev.epro.r0.S14461012662136963693 s14461012662136963693I = ((dev.epro.r0.F6353700998356592239) i6845661640435175914.c).i(((dev.epro.r0.S14461012662136963693) obj2).c());
                    dev.epro.r0.N10542843603712830247 n10542843603712830247 = s14461012662136963693I.b;
                    dev.epro.r0.E8496491261769853844 e8496491261769853844 = dev.epro.r0.P12466553659249280316.b;
                    n10542843603712830247.b(new dev.epro.r0.I6845661640435175914(e8496491261769853844, i6845661640435175914, (char) 0));
                    s14461012662136963693I.i();
                    n10542843603712830247.b(new dev.epro.r0.I6845661640435175914(e8496491261769853844, i6845661640435175914, (byte) 0));
                    s14461012662136963693I.i();
                    n10542843603712830247.b(new dev.epro.r0.I6845661640435175914(e8496491261769853844, i6845661640435175914));
                    s14461012662136963693I.i();
                    break;
                } catch (java.lang.Exception e) {
                    s14461012662136963693.e(e);
                    return;
                } catch (dev.epro.r0.Z6733768557799306456 e2) {
                    if (e2.getCause() instanceof java.lang.Exception) {
                        i6845661640435175914.b((java.lang.Exception) e2.getCause());
                        return;
                    } else {
                        s14461012662136963693.e(e2);
                        return;
                    }
                } catch (java.util.concurrent.CancellationException unused) {
                    i6845661640435175914.a();
                    return;
                }
                break;
            default:
                dev.epro.r0.R2847330884077978889 r2847330884077978889 = (dev.epro.r0.R2847330884077978889) obj2;
                android.os.Bundle bundle = (android.os.Bundle) obj;
                try {
                    dev.epro.r0.V18155119740721705968 v18155119740721705968 = (dev.epro.r0.T8664623300549140039) ((android.os.IInterface) r2847330884077978889.b.j);
                    if (v18155119740721705968 != null) {
                        dev.epro.r0.H3351639798230113779 h3351639798230113779 = r2847330884077978889.d;
                        dev.epro.r0.V18155119740721705968 v181551197407217059682 = v18155119740721705968;
                        android.os.Parcel parcelC = v181551197407217059682.c();
                        int i = dev.epro.r0.H15787954015490686430.a;
                        parcelC.writeInt(1);
                        bundle.writeToParcel(parcelC, 0);
                        if (h3351639798230113779 == null) {
                            parcelC.writeStrongBinder(null);
                        } else {
                            parcelC.writeStrongBinder(h3351639798230113779);
                        }
                        v181551197407217059682.d(parcelC, 4);
                    }
                } catch (android.os.DeadObjectException | android.os.RemoteException unused2) {
                    return;
                }
                break;
        }
    }

    public B451504449649050588(dev.epro.r0.I6845661640435175914 i6845661640435175914, dev.epro.r0.S14461012662136963693 s14461012662136963693) {
        this.c = i6845661640435175914;
        this.b = s14461012662136963693;
    }
}
