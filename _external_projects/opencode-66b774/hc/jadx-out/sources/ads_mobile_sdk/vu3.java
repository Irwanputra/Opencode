package ads_mobile_sdk;

import dev.epro.r0.C468629748621011703;
import dev.epro.r0.M15281894020734075014;
import dev.epro.r0.O12545633033254628644;
import dev.epro.r0.W4415201450379021245;
import dev.epro.r0.Y14417549073248885649;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vu3 {
    public Object a;
    public long b;
    public double c;
    public zt3 d;
    public ArrayList e;
    public M15281894020734075014 f;
    public int g = 1;

    public static vu3 b(Object obj) {
        if (obj instanceof Long) {
            return a(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return a(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return a(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return a(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return a(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return a(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return a(((Byte) obj).byteValue());
        }
        if (obj instanceof zt3) {
            return a((zt3) obj);
        }
        if (obj instanceof String) {
            return a(zt3.a((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(b(arrayList2.get(i)));
        }
        return a(arrayList);
    }

    public final Object a(Class cls) throws Y14417549073248885649 {
        int iD = C468629748621011703.d(1036135034, 1174417764, -1634246151, 697652827) ^ 247484496;
        int i = this.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i2) {
            case 0:
                throw new Y14417549073248885649();
            case 1:
                return b();
            case 2:
                long jC = c();
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) jC) << 24) >> 24));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) jC) << iD) >> iD));
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf(Math.toIntExact(jC));
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf(jC);
                }
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf(jC);
                }
                if (cls.equals(Double.class) || cls.equals(cls2)) {
                    return Double.valueOf(jC);
                }
                if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
                    return Boolean.valueOf(jC != 0);
                }
                if (cls.equals(Character.class) || cls.equals(Character.TYPE)) {
                    return Byte.valueOf((byte) ((((int) jC) << 24) >> 24));
                }
                if (cls.equals(Object.class)) {
                    return Long.valueOf(jC);
                }
                throw new Y14417549073248885649();
            case 3:
                zt3 zt3VarD = d();
                if (cls.equals(zt3.class)) {
                    return zt3VarD;
                }
                if (cls.equals(Object.class)) {
                    zt3VarD.getClass();
                    Charset charsetForName = Charset.forName(xt3.a("Hn2H4l0="));
                    byte[] bArr = zt3VarD.a;
                    return new String(bArr, 0, bArr.length, charsetForName);
                }
                if (!cls.equals(String.class)) {
                    if (cls.equals(byte[].class)) {
                        return zt3VarD.a();
                    }
                    throw new Y14417549073248885649();
                }
                zt3VarD.getClass();
                Charset charsetForName2 = Charset.forName(xt3.a("Hn2H4l0="));
                byte[] bArr2 = zt3VarD.a;
                return new String(bArr2, 0, bArr2.length, charsetForName2);
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return a();
                }
                if (!cls.isArray()) {
                    throw new Y14417549073248885649();
                }
                List listE = e();
                Class<?> componentType = cls.getComponentType();
                ArrayList arrayList = (ArrayList) listE;
                Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Array.set(objNewInstance, i3, ((vu3) arrayList.get(i3)).a((Class) componentType));
                }
                return objNewInstance;
            case 5:
                return f();
            case 6:
                double dG = g();
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf((float) dG);
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf((int) dG);
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf((long) dG);
                }
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) dG) << 24) >> 24));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) dG) << iD) >> iD));
                }
                if (cls.equals(Double.class) || cls.equals(cls2)) {
                    return Double.valueOf(dG);
                }
                if (cls.equals(Object.class)) {
                    return Double.valueOf(dG);
                }
                throw new Y14417549073248885649();
            default:
                throw new AssertionError(xt3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    public final long c() throws Y14417549073248885649 {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.b;
    }

    public final zt3 d() throws Y14417549073248885649 {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.d;
    }

    public final List e() throws Y14417549073248885649 {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.e;
    }

    public final M15281894020734075014 f() throws Y14417549073248885649 {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.f;
    }

    public final double g() throws Y14417549073248885649 {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.c;
    }

    public final void h() {
        this.g = 1;
        this.b = 0L;
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final Object b() throws Y14417549073248885649 {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.a;
    }

    public static vu3 a(long j) {
        vu3 vu3Var = new vu3();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        vu3Var.h();
        vu3Var.g = iD;
        vu3Var.b = j;
        return vu3Var;
    }

    public static vu3 a(double d) {
        vu3 vu3Var = new vu3();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        vu3Var.h();
        vu3Var.g = iD;
        vu3Var.c = d;
        return vu3Var;
    }

    public static vu3 a(zt3 zt3Var) {
        vu3 vu3Var = new vu3();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        vu3Var.h();
        vu3Var.g = iD;
        vu3Var.d = zt3Var;
        return vu3Var;
    }

    public static vu3 a(ArrayList arrayList) {
        vu3 vu3Var = new vu3();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        vu3Var.h();
        vu3Var.g = iD;
        vu3Var.e = arrayList;
        return vu3Var;
    }

    public static vu3 a(M15281894020734075014 m15281894020734075014) {
        vu3 vu3Var = new vu3();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        vu3Var.h();
        vu3Var.g = iD;
        vu3Var.f = m15281894020734075014;
        return vu3Var;
    }

    public final Object a() throws Y14417549073248885649 {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int iD = C468629748621011703.d((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i7 = this.g;
        int i8 = iD + i7;
        if (i7 == 0) {
            throw null;
        }
        switch (i8) {
            case 0:
            case 5:
                throw new Y14417549073248885649();
            case 1:
                return b();
            case 2:
                return Long.valueOf(c());
            case 3:
                return d().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) e();
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add(((vu3) obj).a());
                }
                return arrayList;
            case 6:
                return Double.valueOf(g());
            default:
                throw new AssertionError(xt3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    public static vu3 a(Object obj) {
        vu3 vu3Var = new vu3();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        vu3Var.h();
        vu3Var.g = iD;
        vu3Var.a = obj;
        return vu3Var;
    }

    public static vu3 a(vu3 vu3Var) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int iD = C468629748621011703.d((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        try {
            int i7 = vu3Var.g;
            int i8 = iD + i7;
            if (i7 == 0) {
                throw null;
            }
            switch (i8) {
                case 0:
                    return new vu3();
                case 1:
                    return a(vu3Var.b());
                case 2:
                    return a(vu3Var.c());
                case 3:
                    return a(vu3Var.d());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) vu3Var.e();
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList.add(a((vu3) obj));
                    }
                    return a(arrayList);
                case 5:
                    return a(vu3Var.f());
                case 6:
                    return a(vu3Var.g());
                default:
                    throw new AssertionError(xt3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (Y14417549073248885649 e) {
            W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) throws Y14417549073248885649, IOException {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        int i = 0;
        long j = jArr[0];
        long j2 = jArr[1];
        int i2 = 2;
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = ((((((~j) & j2) | j3) + ((j & j4) | j5)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        int iD = C468629748621011703.d(2133792663, -169454993, -2025383063, 91654737) ^ 213591825;
        int i3 = this.g;
        int i4 = iD + i3;
        if (i3 == 0) {
            throw null;
        }
        switch (i4) {
            case 0:
            case 1:
            case 5:
                throw new Y14417549073248885649();
            case 2:
                O12545633033254628644.e(c(), new c7(byteArrayOutputStream, 1), true);
                return;
            case 3:
                zt3 zt3VarD = d();
                O12545633033254628644.e(((long) zt3VarD.a.length) * j6, new c7(byteArrayOutputStream, i), true);
                byteArrayOutputStream.write(zt3VarD.a);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) e();
                O12545633033254628644.e(arrayList.size(), new c7(byteArrayOutputStream, i2), true);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((vu3) obj).a(byteArrayOutputStream);
                }
                return;
            case 6:
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(g());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                byte[] bArrArray = byteBufferAllocate.array();
                int length = bArrArray.length;
                while (i < length) {
                    byteArrayOutputStream.write(bArrArray[i]);
                    i++;
                }
                int length2 = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final void a(int i) throws Y14417549073248885649 {
        if (i != this.g) {
            throw new Y14417549073248885649();
        }
    }
}
