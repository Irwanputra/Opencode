package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.O12545633033254628644;
import dev.epro.r0.P3831136427564699233;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W4415201450379021245;
import dev.epro.r0.Y2677586711477821327;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class sq implements Iterable, Serializable {
    public static final qq b = new qq(rb1.a);
    public static final P3831136427564699233 c;
    public int a = 0;

    static {
        c = qe.b() ? new Y2677586711477821327((byte) 12) : new O12545633033254628644((byte) 10);
    }

    public static sq a(Iterator it, int i) {
        if (i < 1) {
            Locale locale = Locale.ROOT;
            S10973172697741180971.j(G6547577305291411977.o(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (sq) it.next();
        }
        int i2 = i >>> 1;
        sq sqVarA = a(it, i2);
        sq sqVarA2 = a(it, i - i2);
        if (Integer.MAX_VALUE - sqVarA.size() < sqVarA2.size()) {
            S10973172697741180971.j(E12098517352909843120.l("ByteString would be too long: ", sqVarA.size(), sqVarA2.size(), "+"));
            return null;
        }
        if (sqVarA2.size() == 0) {
            return sqVarA;
        }
        if (sqVarA.size() == 0) {
            return sqVarA2;
        }
        int size = sqVarA2.size() + sqVarA.size();
        qq qqVar = b;
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
                return new qq(bArr);
            } catch (yi1 e) {
                W4415201450379021245.b("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                return null;
            }
        }
        if (sqVarA instanceof pz2) {
            pz2 pz2Var = (pz2) sqVarA;
            sq sqVar = pz2Var.e;
            sq sqVar2 = pz2Var.f;
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
                        qqVar = new qq(bArr2);
                    } catch (yi1 e2) {
                        W4415201450379021245.b("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                        return null;
                    }
                }
                return new pz2(sqVar, qqVar);
            }
            if (sqVar.a() > sqVar2.a() && pz2Var.h > sqVarA2.a()) {
                return new pz2(sqVar, new pz2(sqVar2, sqVarA2));
            }
        }
        if (size >= pz2.c(Math.max(sqVarA.a(), sqVarA2.a()) + 1)) {
            return new pz2(sqVarA, sqVarA2);
        }
        ju3 ju3Var = new ju3((byte) 1);
        ju3Var.a(sqVarA);
        ju3Var.a(sqVarA2);
        ArrayDeque arrayDeque = ju3Var.a;
        sq pz2Var2 = (sq) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            pz2Var2 = new pz2((sq) arrayDeque.pop(), pz2Var2);
        }
        return pz2Var2;
    }

    public static qq b(int i, byte[] bArr, int i2) {
        if (i2 == 0) {
            return b;
        }
        a(i, i + i2, bArr.length);
        return new qq(c.b(i, bArr, i2));
    }

    public abstract sq a(int i, int i2);

    public abstract void a(int i, int i2, byte[] bArr, int i3);

    public abstract void a(yu yuVar);

    public abstract byte b(int i);

    public abstract int b(int i, int i2, int i3);

    public abstract sq b(int i, int i2);

    public abstract boolean b(sq sqVar);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return rb1.a;
        }
        byte[] bArr = new byte[size];
        a(0, 0, bArr, size);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) obj;
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

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            String[] strArr = ke3.a;
            strConcat = ke3.a(c());
        } else {
            sq sqVarB = b(0, 47);
            String[] strArr2 = ke3.a;
            strConcat = ke3.a(sqVarB.c()).concat("...");
        }
        return G6547577305291411977.u(G6547577305291411977.x(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }

    public boolean b() {
        return true;
    }

    public int a() {
        return 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo7a() {
        return new String(c(), StandardCharsets.ISO_8859_1);
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            W4415201450379021245.a(G6547577305291411977.o(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            W4415201450379021245.a(E12098517352909843120.l("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        W4415201450379021245.a(E12098517352909843120.l("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static qq a(int i, byte[] bArr, int i2) {
        try {
            return b(i, bArr, i2);
        } catch (yi1 e) {
            W4415201450379021245.b("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    public static sq a(FileInputStream fileInputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
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
            qq qqVarA = i == 0 ? null : a(0, bArr, i);
            if (qqVarA == null) {
                break;
            }
            arrayList.add(qqVarA);
            iMin = Math.min(iMin * 2, 8192);
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
