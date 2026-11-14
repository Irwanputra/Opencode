package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V12816289154094534935 {
    public final D389890677992184566 a;

    public V12816289154094534935(byte b) {
        switch (b) {
            case 1:
                this.a = new D389890677992184566(0, new Q14128584391259813747[16]);
                break;
            default:
                this.a = new D389890677992184566(0, new U10812473741286294883[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        D389890677992184566 d389890677992184566 = this.a;
        int i = d389890677992184566.c;
        U15014152283416496379[] u15014152283416496379Arr = new U15014152283416496379[i];
        for (int i2 = 0; i2 < i; i2++) {
            u15014152283416496379Arr[i2] = ((U10812473741286294883) d389890677992184566.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            u15014152283416496379Arr[i3].k(cancellationException);
        }
        if (d389890677992184566.c == 0) {
            return;
        }
        Y16081827717826519461.c("uncancelled requests present");
    }

    public void b() {
        D389890677992184566 d389890677992184566 = this.a;
        P8646985343900033725 N = W7808703833045379622.N(0, d389890677992184566.c);
        int i = N.a;
        int i2 = N.b;
        if (i <= i2) {
            while (true) {
                ((U10812473741286294883) d389890677992184566.a[i]).b.resumeWith(O9245300239821758723.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        d389890677992184566.i();
    }
}
