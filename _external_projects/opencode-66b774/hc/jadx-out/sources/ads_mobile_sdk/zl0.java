package ads_mobile_sdk;

import dev.epro.r0.G18207276409179303092;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I8586442731552441025;
import dev.epro.r0.K2042933864045806308;
import dev.epro.r0.O10710380540062020186;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 {
    public final ob3 a;
    public boolean b;

    static {
        new zl0(new ob3()).a();
    }

    public zl0() {
        this.a = new ob3();
    }

    public static int a(ft3 ft3Var, int i, Object obj) {
        int iA;
        int i2;
        int iH = yu.h(i);
        if (ft3Var == ft3.e) {
            iH *= 2;
        }
        int iA2 = 4;
        switch (ft3Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 1:
                ((Float) obj).getClass();
                return iA2 + iH;
            case 2:
                iA2 = yu.a(((Long) obj).longValue());
                return iA2 + iH;
            case 3:
                iA2 = yu.a(((Long) obj).longValue());
                return iA2 + iH;
            case 4:
                iA2 = yu.a(((Integer) obj).intValue());
                return iA2 + iH;
            case 5:
                ((Long) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 6:
                ((Integer) obj).getClass();
                return iA2 + iH;
            case 7:
                ((Boolean) obj).getClass();
                iA2 = 1;
                return iA2 + iH;
            case 8:
                if (obj instanceof sq) {
                    iA = ((sq) obj).size();
                    i2 = yu.i(iA);
                } else {
                    iA = vn3.a.a((String) obj);
                    i2 = yu.i(iA);
                }
                iA2 = i2 + iA;
                return iA2 + iH;
            case 9:
                iA2 = ((cu0) ((g) obj)).a((G18207276409179303092) null);
                return iA2 + iH;
            case 10:
                iA = ((cu0) ((g) obj)).a((G18207276409179303092) null);
                i2 = yu.i(iA);
                iA2 = i2 + iA;
                return iA2 + iH;
            case 11:
                if (obj instanceof sq) {
                    iA = ((sq) obj).size();
                    i2 = yu.i(iA);
                } else {
                    iA = ((byte[]) obj).length;
                    i2 = yu.i(iA);
                }
                iA2 = i2 + iA;
                return iA2 + iH;
            case 12:
                iA2 = yu.i(((Integer) obj).intValue());
                return iA2 + iH;
            case 13:
                iA2 = obj instanceof O10710380540062020186 ? yu.a(((O10710380540062020186) obj).getNumber()) : yu.a(((Integer) obj).intValue());
                return iA2 + iH;
            case 14:
                ((Integer) obj).getClass();
                return iA2 + iH;
            case 15:
                ((Long) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 16:
                iA2 = yu.i(yu.j(((Integer) obj).intValue()));
                return iA2 + iH;
            case 17:
                iA2 = yu.a(yu.b(((Long) obj).longValue()));
                return iA2 + iH;
            default:
                K2042933864045806308.i("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public final Object clone() {
        zl0 zl0Var = new zl0();
        ob3 ob3Var = this.a;
        int i = ob3Var.b;
        if (i <= 0) {
            return zl0Var;
        }
        if (i > 0) {
            throw G6547577305291411977.m(ob3Var.a[0]);
        }
        throw new ArrayIndexOutOfBoundsException(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl0)) {
            return false;
        }
        ob3 ob3Var = ((zl0) obj).a;
        ob3 ob3Var2 = this.a;
        if (ob3Var2.b != ob3Var.b || !ob3Var2.keySet().equals(ob3Var.keySet())) {
            return false;
        }
        mb3 mb3Var = (mb3) ((I8586442731552441025) ob3Var2.entrySet()).iterator();
        if (!mb3Var.hasNext()) {
            return true;
        }
        mb3Var.next();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public zl0(ob3 ob3Var) {
        this.a = ob3Var;
        a();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ob3 ob3Var = this.a;
        int i = ob3Var.b;
        if (i > 0) {
            if (i > 0) {
                throw G6547577305291411977.m(ob3Var.a[0]);
            }
            throw new ArrayIndexOutOfBoundsException(0);
        }
        if (!ob3Var.c) {
            Object[] objArr = ob3Var.a;
            if (objArr != null && i > 0) {
                throw G6547577305291411977.m(objArr[0]);
            }
            ob3Var.c = true;
        }
        this.b = true;
    }

    public static void a(yu yuVar, ft3 ft3Var, int i, Object obj) {
        if (ft3Var == ft3.e) {
            yuVar.g(i, 3);
            ((cu0) ((g) obj)).a(yuVar);
            yuVar.g(i, 4);
        }
        yuVar.g(i, ft3Var.b);
        switch (ft3Var.ordinal()) {
            case 0:
                yuVar.c(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                yuVar.k(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                yuVar.d(((Long) obj).longValue());
                break;
            case 3:
                yuVar.d(((Long) obj).longValue());
                break;
            case 4:
                yuVar.l(((Integer) obj).intValue());
                break;
            case 5:
                yuVar.c(((Long) obj).longValue());
                break;
            case 6:
                yuVar.k(((Integer) obj).intValue());
                break;
            case 7:
                yuVar.a(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (obj instanceof sq) {
                    yuVar.b((sq) obj);
                } else {
                    yuVar.a((String) obj);
                }
                break;
            case 9:
                ((cu0) ((g) obj)).a(yuVar);
                break;
            case 10:
                yuVar.b((g) obj);
                break;
            case 11:
                if (obj instanceof sq) {
                    yuVar.b((sq) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    yuVar.a(bArr.length, bArr);
                }
                break;
            case 12:
                yuVar.m(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof O10710380540062020186) {
                    yuVar.l(((O10710380540062020186) obj).getNumber());
                } else {
                    yuVar.l(((Integer) obj).intValue());
                }
                break;
            case 14:
                yuVar.k(((Integer) obj).intValue());
                break;
            case 15:
                yuVar.c(((Long) obj).longValue());
                break;
            case 16:
                yuVar.m(yu.j(((Integer) obj).intValue()));
                break;
            case 17:
                yuVar.d(yu.b(((Long) obj).longValue()));
                break;
        }
    }
}
