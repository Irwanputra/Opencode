package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I16392673281692942877 extends A8269341136279542501 {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final PointerInputEventHandler d;

    public I16392673281692942877(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new P9733793856018248168(this.a, this.b, this.c, this.d);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        P9733793856018248168 p9733793856018248168 = (P9733793856018248168) r15896830329318850690;
        Object obj = p9733793856018248168.f440o;
        Object obj2 = this.a;
        boolean z = !S10823041268949770285.t(obj, obj2);
        p9733793856018248168.f440o = obj2;
        Object obj3 = p9733793856018248168.p;
        Object obj4 = this.b;
        if (!S10823041268949770285.t(obj3, obj4)) {
            z = true;
        }
        p9733793856018248168.p = obj4;
        Object[] objArr = p9733793856018248168.q;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        p9733793856018248168.q = objArr2;
        Class<?> cls = p9733793856018248168.r.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            p9733793856018248168.j1();
        }
        p9733793856018248168.r = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I16392673281692942877)) {
            return false;
        }
        I16392673281692942877 i16392673281692942877 = (I16392673281692942877) obj;
        if (!S10823041268949770285.t(this.a, i16392673281692942877.a) || !S10823041268949770285.t(this.b, i16392673281692942877.b)) {
            return false;
        }
        Object[] objArr = i16392673281692942877.c;
        Object[] objArr2 = this.c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.d == i16392673281692942877.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.c;
        return this.d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
