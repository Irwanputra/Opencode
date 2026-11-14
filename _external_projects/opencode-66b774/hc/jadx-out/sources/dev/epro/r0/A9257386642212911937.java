package dev.epro.r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A9257386642212911937 extends A16390126751166503819 implements Iterable, D14639766352081121636 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;

    public A9257386642212911937(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A9257386642212911937)) {
            return false;
        }
        A9257386642212911937 a9257386642212911937 = (A9257386642212911937) obj;
        return S10823041268949770285.t(this.a, a9257386642212911937.a) && this.b == a9257386642212911937.b && this.c == a9257386642212911937.c && this.d == a9257386642212911937.d && this.e == a9257386642212911937.e && this.f == a9257386642212911937.f && this.g == a9257386642212911937.g && this.h == a9257386642212911937.h && S10823041268949770285.t(this.i, a9257386642212911937.i) && this.j.equals(a9257386642212911937.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + G6547577305291411977.h(E12098517352909843120.e(this.h, E12098517352909843120.e(this.g, E12098517352909843120.e(this.f, E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new N3708695931114372880(this);
    }
}
