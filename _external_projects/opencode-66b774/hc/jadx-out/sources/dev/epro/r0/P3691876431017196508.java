package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P3691876431017196508 {
    public final int a;
    public final V2435767323669307206[] b;
    public final Y16648110901821727512 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public P3691876431017196508(int i, V2435767323669307206[] v2435767323669307206Arr, Y16648110901821727512 y16648110901821727512, List list, int i2) {
        this.a = i;
        this.b = v2435767323669307206Arr;
        this.c = y16648110901821727512;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (V2435767323669307206 v2435767323669307206 : v2435767323669307206Arr) {
            iMax = Math.max(iMax, v2435767323669307206.n);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final V2435767323669307206[] a(int i, int i2, int i3) {
        V2435767323669307206[] v2435767323669307206Arr = this.b;
        int length = v2435767323669307206Arr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            V2435767323669307206 v2435767323669307206 = v2435767323669307206Arr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((V5869213482710242667) this.d.get(i5)).a;
            v2435767323669307206.n(i, this.c.b[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return v2435767323669307206Arr;
    }
}
