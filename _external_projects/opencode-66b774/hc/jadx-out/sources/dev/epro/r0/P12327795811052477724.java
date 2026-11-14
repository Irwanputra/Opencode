package dev.epro.r0;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P12327795811052477724 extends L17338558938414325155 implements RandomAccess {
    public final P5124777957357031757[] a;
    public final int[] b;

    public P12327795811052477724(P5124777957357031757[] p5124777957357031757Arr, int[] iArr) {
        this.a = p5124777957357031757Arr;
        this.b = iArr;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        return this.a.length;
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof P5124777957357031757) {
            return super.contains((P5124777957357031757) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof P5124777957357031757) {
            return super.indexOf((P5124777957357031757) obj);
        }
        return -1;
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof P5124777957357031757) {
            return super.lastIndexOf((P5124777957357031757) obj);
        }
        return -1;
    }
}
