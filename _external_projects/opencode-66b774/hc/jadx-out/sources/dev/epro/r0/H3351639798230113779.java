package dev.epro.r0;

import ads_mobile_sdk.f01;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H3351639798230113779 extends L14144435763408236280 {
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ R2847330884077978889 k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3351639798230113779(R2847330884077978889 r2847330884077978889) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener", (byte) 4);
        this.l = r2847330884077978889;
        this.k = r2847330884077978889;
    }

    @Override // dev.epro.r0.L14144435763408236280
    public final boolean c(Parcel parcel, int i) {
        final byte b = 1;
        final byte b2 = 0;
        switch (this.j) {
            case 0:
                if (i != 1) {
                    if (i == 2) {
                        Parcelable.Creator creator = Bundle.CREATOR;
                        H15787954015490686430.b(parcel);
                        P17112279574965248524 p17112279574965248524 = this.k.b;
                        p17112279574965248524.c(new U11129707225609510868(p17112279574965248524, b2));
                    }
                    break;
                } else {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle = (Bundle) H15787954015490686430.a(parcel);
                    H15787954015490686430.b(parcel);
                    f01 f01Var = (f01) this.l;
                    AtomicBoolean atomicBoolean = f01Var.b;
                    H7219028874700587498 h7219028874700587498 = f01Var.a;
                    int i2 = bundle.getInt("hsdpPrewarmStatusCode", 1);
                    bundle.containsKey("hsdpPrewarmStatusCode");
                    String string = bundle.getString("errorMessage", "");
                    if (i2 != 2) {
                        if (i2 == 6) {
                            new Bundle();
                            if ((h7219028874700587498.s() instanceof B9271643986061518267) && atomicBoolean.compareAndSet(false, true)) {
                                h7219028874700587498.resumeWith(O9245300239821758723.a);
                                break;
                            }
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("errorCode", i2);
                            bundle2.putString("errorMessage", string);
                            if ((h7219028874700587498.s() instanceof B9271643986061518267) && atomicBoolean.compareAndSet(false, true)) {
                                h7219028874700587498.resumeWith(new C10696704014433963524(new Exception("HSDP prewarm failed: " + bundle2)));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                if (i != 1) {
                    if (i == 2) {
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        H15787954015490686430.b(parcel);
                        P17112279574965248524 p171122795749652485242 = this.k.b;
                        p171122795749652485242.c(new U11129707225609510868(p171122795749652485242, b2));
                    }
                    break;
                } else {
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) H15787954015490686430.a(parcel);
                    H15787954015490686430.b(parcel);
                    R2847330884077978889 r2847330884077978889 = (R2847330884077978889) this.l;
                    final int i3 = bundle3.getInt("hsdpStatusCode", 1);
                    bundle3.containsKey("hsdpStatusCode");
                    final String string2 = bundle3.getString("targetPackage", "");
                    if (!string2.isEmpty()) {
                        switch (i3) {
                            case 1:
                                final String string3 = bundle3.getString("errorMessage", "HSDP service unknown status");
                                R2847330884077978889.b(r2847330884077978889, string2, 4, new Runnable() { // from class: dev.epro.r0.N5662417494053749088
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConcurrentHashMap concurrentHashMap = ((R2847330884077978889) this.a.l).c;
                                        String str = string2;
                                        S9286526287894964911 s9286526287894964911 = (S9286526287894964911) concurrentHashMap.remove(str);
                                        if (s9286526287894964911 == null) {
                                            return;
                                        }
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("targetPackage", str);
                                        bundle4.putInt("errorCode", i3);
                                        bundle4.putString("errorMessage", string3);
                                        s9286526287894964911.b.onError(bundle4);
                                    }
                                });
                                break;
                            case 3:
                                R2847330884077978889.b(r2847330884077978889, string2, 2, null);
                                break;
                            case 4:
                                R2847330884077978889.b(r2847330884077978889, string2, 3, null);
                                break;
                            case 5:
                                R2847330884077978889.b(r2847330884077978889, string2, 4, new Runnable(this) { // from class: dev.epro.r0.E4043830072360857596
                                    public final /* synthetic */ H3351639798230113779 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        String str = string2;
                                        H3351639798230113779 h3351639798230113779 = this.b;
                                        switch (b3) {
                                            case 0:
                                                ((R2847330884077978889) h3351639798230113779.l).c.remove(str);
                                                break;
                                            default:
                                                ((R2847330884077978889) h3351639798230113779.l).c.remove(str);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                final String string4 = bundle3.getString("errorMessage", "HSDP service error");
                                R2847330884077978889.b(r2847330884077978889, string2, 4, new Runnable() { // from class: dev.epro.r0.N5662417494053749088
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConcurrentHashMap concurrentHashMap = ((R2847330884077978889) this.a.l).c;
                                        String str = string2;
                                        S9286526287894964911 s9286526287894964911 = (S9286526287894964911) concurrentHashMap.remove(str);
                                        if (s9286526287894964911 == null) {
                                            return;
                                        }
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("targetPackage", str);
                                        bundle4.putInt("errorCode", i3);
                                        bundle4.putString("errorMessage", string4);
                                        s9286526287894964911.b.onError(bundle4);
                                    }
                                });
                                break;
                            case 7:
                                R2847330884077978889.b(r2847330884077978889, string2, 5, new Runnable(this) { // from class: dev.epro.r0.E4043830072360857596
                                    public final /* synthetic */ H3351639798230113779 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b;
                                        String str = string2;
                                        H3351639798230113779 h3351639798230113779 = this.b;
                                        switch (b3) {
                                            case 0:
                                                ((R2847330884077978889) h3351639798230113779.l).c.remove(str);
                                                break;
                                            default:
                                                ((R2847330884077978889) h3351639798230113779.l).c.remove(str);
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                final String string5 = bundle3.getString("errorMessage", "HSDP service cancelled");
                                R2847330884077978889.b(r2847330884077978889, string2, 4, new Runnable() { // from class: dev.epro.r0.N5662417494053749088
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConcurrentHashMap concurrentHashMap = ((R2847330884077978889) this.a.l).c;
                                        String str = string2;
                                        S9286526287894964911 s9286526287894964911 = (S9286526287894964911) concurrentHashMap.remove(str);
                                        if (s9286526287894964911 == null) {
                                            return;
                                        }
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("targetPackage", str);
                                        bundle4.putInt("errorCode", i3);
                                        bundle4.putString("errorMessage", string5);
                                        s9286526287894964911.b.onError(bundle4);
                                    }
                                });
                                break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3351639798230113779(R2847330884077978889 r2847330884077978889, f01 f01Var) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServicePrewarmListener", (byte) 4);
        this.l = f01Var;
        this.k = r2847330884077978889;
    }
}
