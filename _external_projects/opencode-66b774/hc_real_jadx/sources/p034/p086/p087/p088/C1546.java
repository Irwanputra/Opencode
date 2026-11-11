package p034.p086.p087.p088;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p034.p086.p087.p088.p089.C1540;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1546 extends C1544 implements InterfaceC1513 {

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public C1544[] f7243 = new C1544[4];

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public int f7242 = 0;

    @Override // p034.p086.p087.p088.InterfaceC1513
    /* renamed from: 〺つふすそ */
    public void mo3309(C1520 c1520) {
    }

    @Override // p034.p086.p087.p088.InterfaceC1513
    /* renamed from: くし〴〺ぅ */
    public void mo3310() {
        this.f7242 = 0;
        Arrays.fill(this.f7243, (Object) null);
    }

    @Override // p034.p086.p087.p088.InterfaceC1513
    /* renamed from: げつ〴ぬぐ */
    public void mo3311(C1544 c1544) {
        if (c1544 == this || c1544 == null) {
            return;
        }
        int i = this.f7242 + 1;
        C1544[] c1544Arr = this.f7243;
        if (i > c1544Arr.length) {
            this.f7243 = (C1544[]) Arrays.copyOf(c1544Arr, c1544Arr.length * 2);
        }
        C1544[] c1544Arr2 = this.f7243;
        int i2 = this.f7242;
        c1544Arr2[i2] = c1544;
        this.f7242 = i2 + 1;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public void m3441(ArrayList<C1540> arrayList, int i, C1540 c1540) {
        for (int i2 = 0; i2 < this.f7242; i2++) {
            c1540.m3402(this.f7243[i2]);
        }
        for (int i3 = 0; i3 < this.f7242; i3++) {
            C2786.m4776(this.f7243[i3], i, arrayList, c1540);
        }
    }

    @Override // p034.p086.p087.p088.C1544
    /* renamed from: ぺふねづ〺 */
    public void mo3320(C1544 c1544, HashMap<C1544, C1544> hashMap) {
        super.mo3320(c1544, hashMap);
        C1546 c1546 = (C1546) c1544;
        this.f7242 = 0;
        int i = c1546.f7242;
        for (int i2 = 0; i2 < i; i2++) {
            mo3311(hashMap.get(c1546.f7243[i2]));
        }
    }
}
