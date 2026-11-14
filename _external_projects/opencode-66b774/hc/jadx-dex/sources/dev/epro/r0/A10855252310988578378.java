package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A10855252310988578378 {
    public final /* synthetic */ byte a = 1;
    public final int b;
    public final int c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;

    public A10855252310988578378(dev.epro.r0.Y16648110901821727512 y16648110901821727512, int i, int i2, dev.epro.r0.V17727876436247226949 v17727876436247226949, dev.epro.r0.A3516453186657372457 a3516453186657372457) {
        this.e = y16648110901821727512;
        this.d = y16648110901821727512;
        this.b = i;
        this.c = i2;
        this.f = v17727876436247226949;
        this.g = a3516453186657372457;
    }

    public long a(int i, int i2) {
        int i3;
        dev.epro.r0.Y16648110901821727512 y16648110901821727512 = (dev.epro.r0.Y16648110901821727512) this.d;
        int[] iArr = y16648110901821727512.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = y16648110901821727512.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            dev.epro.r0.N17315172036749737048.a("width must be >= 0");
        }
        return dev.epro.r0.O15160157444238005800.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public dev.epro.r0.P3691876431017196508 b(int i) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836B = ((dev.epro.r0.A3516453186657372457) this.g).b(i);
        int i2 = t17032536773975598836B.a;
        int size = ((java.util.List) t17032536773975598836B.b).size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        dev.epro.r0.V2435767323669307206[] v2435767323669307206Arr = new dev.epro.r0.V2435767323669307206[size];
        int i5 = 0;
        while (true) {
            java.util.List list = (java.util.List) t17032536773975598836B.b;
            if (i3 >= size) {
                return new dev.epro.r0.P3691876431017196508(i, v2435767323669307206Arr, (dev.epro.r0.Y16648110901821727512) this.e, list, i4);
            }
            int i6 = (int) ((dev.epro.r0.V5869213482710242667) list.get(i3)).a;
            dev.epro.r0.V2435767323669307206 v2435767323669307206P = ((dev.epro.r0.V17727876436247226949) this.f).p(i2 + i3, i5, i6, i4, a(i5, i6));
            i5 += i6;
            v2435767323669307206Arr[i3] = v2435767323669307206P;
            i3++;
        }
    }

    public java.lang.String toString() {
        switch (this.a) {
            case 1:
                return "Adapter in state " + ((dev.epro.r0.B10755433227221787048) this.f) + " completed in " + this.c + " with description: " + ((java.lang.String) this.g);
            default:
                return super.toString();
        }
    }

    public A10855252310988578378(dev.epro.r0.B10755433227221787048 b10755433227221787048, java.lang.String str, int i) {
        this.f = b10755433227221787048;
        this.g = str;
        this.c = i;
        this.d = b10755433227221787048;
        this.e = str;
        this.b = i;
    }
}
