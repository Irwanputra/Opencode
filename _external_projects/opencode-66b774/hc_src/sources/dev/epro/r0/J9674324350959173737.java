package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J9674324350959173737 extends F12738319475220657879 {
    public static final Object[] i;
    public static final J9674324350959173737 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new J9674324350959173737(0, 0, 0, objArr, objArr);
    }

    public J9674324350959173737(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.h;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final Object[] c() {
        return this.d;
    }

    @Override // dev.epro.r0.H9330595680939527366, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f;
        if (objArr.length == 0) {
            return false;
        }
        int R = U16229988784104357932.R(obj);
        while (true) {
            int i2 = R & this.g;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            R = i2 + 1;
        }
    }

    @Override // dev.epro.r0.F12738319475220657879, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int i() {
        return this.h;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int j() {
        return 0;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l */
    public final U1864172318023436692 iterator() {
        return a().listIterator(0);
    }

    @Override // dev.epro.r0.F12738319475220657879
    public final N7756202525712935399 o() {
        return N7756202525712935399.m(this.h, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
