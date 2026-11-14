package dev.epro.r0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q4448715364276398931 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ O10311700946806650263 b;

    public /* synthetic */ Q4448715364276398931(O10311700946806650263 o10311700946806650263, byte b) {
        this.a = b;
        this.b = o10311700946806650263;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        O10311700946806650263 o10311700946806650263 = this.b;
        switch (b) {
            case 0:
                B1029012102904255937 b1029012102904255937L = ((B1029012102904255937) obj).l();
                b1029012102904255937L.getClass();
                o10311700946806650263.q(b1029012102904255937L);
                break;
            case 1:
                o10311700946806650263.m21setPopupContentSizefhxjrPA((Q13254524308163418711) obj);
                o10311700946806650263.r();
                break;
            default:
                B13729205492206812220 b13729205492206812220 = (B13729205492206812220) obj;
                Handler handler = o10311700946806650263.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = o10311700946806650263.getHandler();
                    if (handler2 != null) {
                        handler2.post(new S6873153560207725378(b13729205492206812220, (byte) 6));
                    }
                } else {
                    b13729205492206812220.invoke();
                }
                break;
        }
        return o9245300239821758723;
    }
}
