package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zl0 {
    public final ads_mobile_sdk.ob3 a;
    public boolean b;

    static {
        new ads_mobile_sdk.zl0(new ads_mobile_sdk.ob3()).a();
    }

    public zl0() {
        this.a = new ads_mobile_sdk.ob3();
    }

    public static int a(ads_mobile_sdk.ft3 ft3Var, int i, java.lang.Object obj) {
        int iA;
        int i2;
        int iH = ads_mobile_sdk.yu.h(i);
        if (ft3Var == ads_mobile_sdk.ft3.e) {
            iH *= 2;
        }
        int iA2 = 4;
        switch (ft3Var.ordinal()) {
            case 0:
                ((java.lang.Double) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 1:
                ((java.lang.Float) obj).getClass();
                return iA2 + iH;
            case 2:
                iA2 = ads_mobile_sdk.yu.a(((java.lang.Long) obj).longValue());
                return iA2 + iH;
            case 3:
                iA2 = ads_mobile_sdk.yu.a(((java.lang.Long) obj).longValue());
                return iA2 + iH;
            case 4:
                iA2 = ads_mobile_sdk.yu.a(((java.lang.Integer) obj).intValue());
                return iA2 + iH;
            case 5:
                ((java.lang.Long) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 6:
                ((java.lang.Integer) obj).getClass();
                return iA2 + iH;
            case 7:
                ((java.lang.Boolean) obj).getClass();
                iA2 = 1;
                return iA2 + iH;
            case 8:
                if (obj instanceof ads_mobile_sdk.sq) {
                    iA = ((ads_mobile_sdk.sq) obj).size();
                    i2 = ads_mobile_sdk.yu.i(iA);
                } else {
                    iA = ads_mobile_sdk.vn3.a.a((java.lang.String) obj);
                    i2 = ads_mobile_sdk.yu.i(iA);
                }
                iA2 = i2 + iA;
                return iA2 + iH;
            case 9:
                iA2 = ((ads_mobile_sdk.cu0) ((ads_mobile_sdk.g) obj)).a((dev.epro.r0.G18207276409179303092) null);
                return iA2 + iH;
            case 10:
                iA = ((ads_mobile_sdk.cu0) ((ads_mobile_sdk.g) obj)).a((dev.epro.r0.G18207276409179303092) null);
                i2 = ads_mobile_sdk.yu.i(iA);
                iA2 = i2 + iA;
                return iA2 + iH;
            case 11:
                if (obj instanceof ads_mobile_sdk.sq) {
                    iA = ((ads_mobile_sdk.sq) obj).size();
                    i2 = ads_mobile_sdk.yu.i(iA);
                } else {
                    iA = ((byte[]) obj).length;
                    i2 = ads_mobile_sdk.yu.i(iA);
                }
                iA2 = i2 + iA;
                return iA2 + iH;
            case 12:
                iA2 = ads_mobile_sdk.yu.i(((java.lang.Integer) obj).intValue());
                return iA2 + iH;
            case 13:
                iA2 = obj instanceof dev.epro.r0.O10710380540062020186 ? ads_mobile_sdk.yu.a(((dev.epro.r0.O10710380540062020186) obj).getNumber()) : ads_mobile_sdk.yu.a(((java.lang.Integer) obj).intValue());
                return iA2 + iH;
            case 14:
                ((java.lang.Integer) obj).getClass();
                return iA2 + iH;
            case 15:
                ((java.lang.Long) obj).getClass();
                iA2 = 8;
                return iA2 + iH;
            case 16:
                iA2 = ads_mobile_sdk.yu.i(ads_mobile_sdk.yu.j(((java.lang.Integer) obj).intValue()));
                return iA2 + iH;
            case 17:
                iA2 = ads_mobile_sdk.yu.a(ads_mobile_sdk.yu.b(((java.lang.Long) obj).longValue()));
                return iA2 + iH;
            default:
                dev.epro.r0.K2042933864045806308.i("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public final java.lang.Object clone() {
        ads_mobile_sdk.zl0 zl0Var = new ads_mobile_sdk.zl0();
        ads_mobile_sdk.ob3 ob3Var = this.a;
        int i = ob3Var.b;
        if (i <= 0) {
            return zl0Var;
        }
        if (i > 0) {
            throw dev.epro.r0.G6547577305291411977.m(ob3Var.a[0]);
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.zl0)) {
            return false;
        }
        ads_mobile_sdk.ob3 ob3Var = ((ads_mobile_sdk.zl0) obj).a;
        ads_mobile_sdk.ob3 ob3Var2 = this.a;
        if (ob3Var2.b != ob3Var.b || !ob3Var2.keySet().equals(ob3Var.keySet())) {
            return false;
        }
        ads_mobile_sdk.mb3 mb3Var = (ads_mobile_sdk.mb3) ob3Var2.entrySet().iterator();
        if (!mb3Var.hasNext()) {
            return true;
        }
        mb3Var.next();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public zl0(ads_mobile_sdk.ob3 ob3Var) {
        this.a = ob3Var;
        a();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ads_mobile_sdk.ob3 ob3Var = this.a;
        int i = ob3Var.b;
        if (i > 0) {
            if (i > 0) {
                throw dev.epro.r0.G6547577305291411977.m(ob3Var.a[0]);
            }
            throw new java.lang.ArrayIndexOutOfBoundsException(0);
        }
        if (!ob3Var.c) {
            java.lang.Object[] objArr = ob3Var.a;
            if (objArr != null && i > 0) {
                throw dev.epro.r0.G6547577305291411977.m(objArr[0]);
            }
            ob3Var.c = true;
        }
        this.b = true;
    }

    public static void a(ads_mobile_sdk.yu yuVar, ads_mobile_sdk.ft3 ft3Var, int i, java.lang.Object obj) {
        if (ft3Var == ads_mobile_sdk.ft3.e) {
            yuVar.g(i, 3);
            ((ads_mobile_sdk.cu0) ((ads_mobile_sdk.g) obj)).a(yuVar);
            yuVar.g(i, 4);
        }
        yuVar.g(i, ft3Var.b);
        switch (ft3Var.ordinal()) {
            case 0:
                yuVar.c(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                break;
            case 1:
                yuVar.k(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                break;
            case 2:
                yuVar.d(((java.lang.Long) obj).longValue());
                break;
            case 3:
                yuVar.d(((java.lang.Long) obj).longValue());
                break;
            case 4:
                yuVar.l(((java.lang.Integer) obj).intValue());
                break;
            case 5:
                yuVar.c(((java.lang.Long) obj).longValue());
                break;
            case 6:
                yuVar.k(((java.lang.Integer) obj).intValue());
                break;
            case 7:
                yuVar.a(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (obj instanceof ads_mobile_sdk.sq) {
                    yuVar.b((ads_mobile_sdk.sq) obj);
                } else {
                    yuVar.a((java.lang.String) obj);
                }
                break;
            case 9:
                ((ads_mobile_sdk.cu0) ((ads_mobile_sdk.g) obj)).a(yuVar);
                break;
            case 10:
                yuVar.b((ads_mobile_sdk.g) obj);
                break;
            case 11:
                if (obj instanceof ads_mobile_sdk.sq) {
                    yuVar.b((ads_mobile_sdk.sq) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    yuVar.a(bArr.length, bArr);
                }
                break;
            case 12:
                yuVar.m(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof dev.epro.r0.O10710380540062020186) {
                    yuVar.l(((dev.epro.r0.O10710380540062020186) obj).getNumber());
                } else {
                    yuVar.l(((java.lang.Integer) obj).intValue());
                }
                break;
            case 14:
                yuVar.k(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                yuVar.c(((java.lang.Long) obj).longValue());
                break;
            case 16:
                yuVar.m(ads_mobile_sdk.yu.j(((java.lang.Integer) obj).intValue()));
                break;
            case 17:
                yuVar.d(ads_mobile_sdk.yu.b(((java.lang.Long) obj).longValue()));
                break;
        }
    }
}
