package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class V13543759256294803054 extends S7670568931305003909 {
    public D488698419923809398[] a;
    public String b;
    public int c;

    public V13543759256294803054(V13543759256294803054 v13543759256294803054) {
        this.a = null;
        this.c = 0;
        this.b = v13543759256294803054.b;
        D488698419923809398[] d488698419923809398Arr = v13543759256294803054.a;
        D488698419923809398[] d488698419923809398Arr2 = new D488698419923809398[d488698419923809398Arr.length];
        for (int i = 0; i < d488698419923809398Arr.length; i++) {
            d488698419923809398Arr2[i] = new D488698419923809398(d488698419923809398Arr[i]);
        }
        this.a = d488698419923809398Arr2;
    }

    public D488698419923809398[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(D488698419923809398[] d488698419923809398Arr) {
        int i;
        D488698419923809398[] d488698419923809398Arr2 = this.a;
        if (d488698419923809398Arr2 != null && d488698419923809398Arr != null && d488698419923809398Arr2.length == d488698419923809398Arr.length) {
            for (0; i < d488698419923809398Arr2.length; i + 1) {
                D488698419923809398 d488698419923809398 = d488698419923809398Arr2[i];
                char c = d488698419923809398.a;
                D488698419923809398 d4886984199238093982 = d488698419923809398Arr[i];
                i = (c == d4886984199238093982.a && d488698419923809398.b.length == d4886984199238093982.b.length) ? i + 1 : 0;
            }
            D488698419923809398[] d488698419923809398Arr3 = this.a;
            for (int i2 = 0; i2 < d488698419923809398Arr.length; i2++) {
                d488698419923809398Arr3[i2].a = d488698419923809398Arr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = d488698419923809398Arr[i2].b;
                    if (i3 < fArr.length) {
                        d488698419923809398Arr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        D488698419923809398[] d488698419923809398Arr4 = new D488698419923809398[d488698419923809398Arr.length];
        for (int i4 = 0; i4 < d488698419923809398Arr.length; i4++) {
            d488698419923809398Arr4[i4] = new D488698419923809398(d488698419923809398Arr[i4]);
        }
        this.a = d488698419923809398Arr4;
    }

    public V13543759256294803054() {
        this.a = null;
        this.c = 0;
    }
}
