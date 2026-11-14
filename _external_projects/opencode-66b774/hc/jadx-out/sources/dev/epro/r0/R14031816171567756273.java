package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R14031816171567756273 extends H13180098919720300000 implements Iterator, D14639766352081121636 {
    public final /* synthetic */ byte e;

    public R14031816171567756273(H6457936572911484476 h6457936572911484476, byte b) {
        this.e = b;
        this.d = h6457936572911484476;
        this.b = -1;
        this.c = h6457936572911484476.h;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.a;
                H6457936572911484476 h6457936572911484476 = (H6457936572911484476) this.d;
                if (i >= h6457936572911484476.f) {
                    Z3383101362411723454.u();
                } else {
                    this.a = i + 1;
                    this.b = i;
                    O6566809341996378617 o6566809341996378617 = new O6566809341996378617(h6457936572911484476, i);
                    c();
                }
                break;
            case 1:
                b();
                int i2 = this.a;
                H6457936572911484476 h64579365729114844762 = (H6457936572911484476) this.d;
                if (i2 >= h64579365729114844762.f) {
                    Z3383101362411723454.u();
                } else {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = h64579365729114844762.a[i2];
                    c();
                }
                break;
            default:
                b();
                int i3 = this.a;
                H6457936572911484476 h64579365729114844763 = (H6457936572911484476) this.d;
                if (i3 >= h64579365729114844763.f) {
                    Z3383101362411723454.u();
                } else {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object[] objArr = h64579365729114844763.b;
                    objArr.getClass();
                    Object obj2 = objArr[this.b];
                    c();
                }
                break;
        }
        return null;
    }
}
