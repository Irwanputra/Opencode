package dev.epro.r0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T5910761665012682387 extends AbstractMap implements Serializable {
    public static final Object j = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient Y7324519125572051611 g;
    public transient Y7324519125572051611 h;
    public transient A5949560647331355346 i;

    public static T5910761665012682387 a() {
        T5910761665012682387 t5910761665012682387 = new T5910761665012682387();
        t5910761665012682387.e = M18113111391818111737.z(3, 1);
        return t5910761665012682387;
    }

    public final Map b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.e += 32;
        Map mapB = b();
        if (mapB != null) {
            this.e = M18113111391818111737.z(size(), 3);
            mapB.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f, (Object) null);
        Arrays.fill(j(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        return mapB != null ? mapB.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (M2066880349381062048.A(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iR = U16229988784104357932.R(obj);
        int iC = c();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iB0 = D15445857918358799638.b0(iR & iC, obj2);
        if (iB0 == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iR & i;
        do {
            int i3 = iB0 - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && M2066880349381062048.A(obj, i()[i3])) {
                return i3;
            }
            iB0 = i4 & iC;
        } while (iB0 != 0);
        return -1;
    }

    public final void e(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrI[i] = null;
            objArrJ[i] = null;
            iArrH[i] = 0;
            return;
        }
        Object obj2 = objArrI[i3];
        objArrI[i] = obj2;
        objArrJ[i] = objArrJ[i3];
        objArrI[i3] = null;
        objArrJ[i3] = null;
        iArrH[i] = iArrH[i3];
        iArrH[i3] = 0;
        int iR = U16229988784104357932.R(obj2) & i2;
        int iB0 = D15445857918358799638.b0(iR, obj);
        if (iB0 == size) {
            D15445857918358799638.c0(iR, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iB0 - 1;
            int i5 = iArrH[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrH[i4] = D15445857918358799638.S(i5, i + 1, i2);
                return;
            }
            iB0 = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Y7324519125572051611 y7324519125572051611 = this.h;
        if (y7324519125572051611 != null) {
            return y7324519125572051611;
        }
        Y7324519125572051611 y73245191255720516112 = new Y7324519125572051611(this, (byte) 0);
        this.h = y73245191255720516112;
        return y73245191255720516112;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int iC = c();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iV = D15445857918358799638.V(obj, null, iC, obj2, h(), i(), null);
            if (iV != -1) {
                Object obj3 = j()[iV];
                e(iV, iC);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object objB = D15445857918358799638.B(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            D15445857918358799638.c0(i3 & i5, i4 + 1, objB);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int iB0 = D15445857918358799638.b0(i6, obj);
            while (iB0 != 0) {
                int i7 = iB0 - 1;
                int i8 = iArrH[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iB02 = D15445857918358799638.b0(i10, objB);
                D15445857918358799638.c0(i10, iB0, objB);
                iArrH[i7] = D15445857918358799638.S(i9, iB02, i5);
                iB0 = i8 & i;
            }
        }
        this.a = objB;
        this.e = D15445857918358799638.S(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Y7324519125572051611 y7324519125572051611 = this.g;
        if (y7324519125572051611 != null) {
            return y7324519125572051611;
        }
        Y7324519125572051611 y73245191255720516112 = new Y7324519125572051611(this, (byte) 1);
        this.g = y73245191255720516112;
        return y73245191255720516112;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d7 -> B:28:0x00bf). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T5910761665012682387.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == j) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        A5949560647331355346 a5949560647331355346 = this.i;
        if (a5949560647331355346 != null) {
            return a5949560647331355346;
        }
        A5949560647331355346 a59495606473313553462 = new A5949560647331355346(this);
        this.i = a59495606473313553462;
        return a59495606473313553462;
    }
}
