package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class sq implements java.lang.Iterable, java.io.Serializable {
    public static final ads_mobile_sdk.qq b = new ads_mobile_sdk.qq(ads_mobile_sdk.rb1.a);
    public static final dev.epro.r0.P3831136427564699233 c;
    public int a = 0;

    static {
        c = ads_mobile_sdk.qe.b() ? new dev.epro.r0.Y2677586711477821327((byte) 12) : new dev.epro.r0.O12545633033254628644((byte) 10);
    }

    public static ads_mobile_sdk.sq a(java.util.Iterator it, int i) {
        if (i < 1) {
            java.util.Locale locale = java.util.Locale.ROOT;
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.o(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (ads_mobile_sdk.sq) it.next();
        }
        int i2 = i >>> 1;
        ads_mobile_sdk.sq sqVarA = a(it, i2);
        ads_mobile_sdk.sq sqVarA2 = a(it, i - i2);
        if (Integer.MAX_VALUE - sqVarA.size() < sqVarA2.size()) {
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.E12098517352909843120.l("ByteString would be too long: ", sqVarA.size(), sqVarA2.size(), "+"));
            return null;
        }
        if (sqVarA2.size() == 0) {
            return sqVarA;
        }
        if (sqVarA.size() == 0) {
            return sqVarA2;
        }
        int size = sqVarA2.size() + sqVarA.size();
        dev.epro.r0.L8361547894089146393 qqVar = b;
        if (size < 128) {
            int size2 = sqVarA.size();
            int size3 = sqVarA2.size();
            int i3 = size2 + size3;
            byte[] bArr = new byte[i3];
            a(0, size2, sqVarA.size());
            a(0, size2, i3);
            if (size2 > 0) {
                sqVarA.a(0, 0, bArr, size2);
            }
            a(0, size3, sqVarA2.size());
            a(size2, i3, i3);
            if (size3 > 0) {
                sqVarA2.a(0, size2, bArr, size3);
            }
            if (i3 == 0) {
                return qqVar;
            }
            try {
                return new ads_mobile_sdk.qq(bArr);
            } catch (ads_mobile_sdk.yi1 e) {
                dev.epro.r0.W4415201450379021245.b("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                return null;
            }
        }
        if (sqVarA instanceof ads_mobile_sdk.pz2) {
            ads_mobile_sdk.pz2 pz2Var = (ads_mobile_sdk.pz2) sqVarA;
            ads_mobile_sdk.sq sqVar = pz2Var.e;
            ads_mobile_sdk.sq sqVar2 = pz2Var.f;
            if (sqVarA2.size() + sqVar2.size() < 128) {
                int size4 = sqVar2.size();
                int size5 = sqVarA2.size();
                int i4 = size4 + size5;
                byte[] bArr2 = new byte[i4];
                a(0, size4, sqVar2.size());
                a(0, size4, i4);
                if (size4 > 0) {
                    sqVar2.a(0, 0, bArr2, size4);
                }
                a(0, size5, sqVarA2.size());
                a(size4, i4, i4);
                if (size5 > 0) {
                    sqVarA2.a(0, size4, bArr2, size5);
                }
                if (i4 != 0) {
                    try {
                        qqVar = new ads_mobile_sdk.qq(bArr2);
                    } catch (ads_mobile_sdk.yi1 e2) {
                        dev.epro.r0.W4415201450379021245.b("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                        return null;
                    }
                }
                return new ads_mobile_sdk.pz2(sqVar, qqVar);
            }
            if (sqVar.a() > sqVar2.a() && pz2Var.h > sqVarA2.a()) {
                return new ads_mobile_sdk.pz2(sqVar, new ads_mobile_sdk.pz2(sqVar2, sqVarA2));
            }
        }
        if (size >= ads_mobile_sdk.pz2.c(java.lang.Math.max(sqVarA.a(), sqVarA2.a()) + 1)) {
            return new ads_mobile_sdk.pz2(sqVarA, sqVarA2);
        }
        ads_mobile_sdk.ju3 ju3Var = new ads_mobile_sdk.ju3((byte) 1);
        ju3Var.a(sqVarA);
        ju3Var.a(sqVarA2);
        java.util.ArrayDeque arrayDeque = ju3Var.a;
        ads_mobile_sdk.sq pz2Var2 = (ads_mobile_sdk.sq) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            pz2Var2 = new ads_mobile_sdk.pz2((ads_mobile_sdk.sq) arrayDeque.pop(), pz2Var2);
        }
        return pz2Var2;
    }

    public static ads_mobile_sdk.qq b(int i, byte[] bArr, int i2) {
        if (i2 == 0) {
            return b;
        }
        a(i, i + i2, bArr.length);
        return new ads_mobile_sdk.qq(c.b(i, bArr, i2));
    }

    public abstract ads_mobile_sdk.sq a(int i, int i2);

    public abstract void a(int i, int i2, byte[] bArr, int i3);

    public abstract void a(ads_mobile_sdk.yu yuVar);

    public abstract byte b(int i);

    public abstract int b(int i, int i2, int i3);

    public abstract ads_mobile_sdk.sq b(int i, int i2);

    public abstract boolean b(ads_mobile_sdk.sq sqVar);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return ads_mobile_sdk.rb1.a;
        }
        byte[] bArr = new byte[size];
        a(0, 0, bArr, size);
        return bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.sq)) {
            return false;
        }
        ads_mobile_sdk.sq sqVar = (ads_mobile_sdk.sq) obj;
        int size = size();
        if (size != sqVar.size()) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        int i = this.a;
        int i2 = sqVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return b(sqVar);
        }
        return false;
    }

    public final int hashCode() {
        int iB = this.a;
        if (iB == 0) {
            int size = size();
            iB = b(size, 0, size);
            if (iB == 0) {
                iB = 1;
            }
            this.a = iB;
        }
        return iB;
    }

    public abstract int size();

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            java.lang.String[] strArr = ads_mobile_sdk.ke3.a;
            strConcat = ads_mobile_sdk.ke3.a(c());
        } else {
            ads_mobile_sdk.sq sqVarB = b(0, 47);
            java.lang.String[] strArr2 = ads_mobile_sdk.ke3.a;
            strConcat = ads_mobile_sdk.ke3.a(sqVarB.c()).concat("...");
        }
        return dev.epro.r0.G6547577305291411977.u(dev.epro.r0.G6547577305291411977.x(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }

    public boolean b() {
        return true;
    }

    public int a() {
        return 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public java.lang.String m11a() {
        return new java.lang.String(c(), java.nio.charset.StandardCharsets.ISO_8859_1);
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.G6547577305291411977.o(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static ads_mobile_sdk.qq a(int i, byte[] bArr, int i2) {
        try {
            return b(i, bArr, i2);
        } catch (ads_mobile_sdk.yi1 e) {
            dev.epro.r0.W4415201450379021245.b("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    public static ads_mobile_sdk.sq a(java.io.FileInputStream fileInputStream) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = fileInputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            ads_mobile_sdk.qq qqVarA = i == 0 ? null : a(0, bArr, i);
            if (qqVarA == null) {
                break;
            }
            arrayList.add(qqVarA);
            iMin = java.lang.Math.min(iMin * 2, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return b;
        }
        return a(arrayList.iterator(), size);
    }

    public static boolean a(int i, int i2, byte[] bArr, int i3, byte[] bArr2) {
        int i4 = i + i3;
        a(i, i4, bArr.length);
        a(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
