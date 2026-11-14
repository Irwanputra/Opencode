package dev.epro.r0;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class P5201717407242849942 {
    public static final /* synthetic */ int a = 0;

    static {
        ByteBuffer.wrap(new byte[]{5, 0});
    }

    public static byte[] a(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            S10973172697741180971.j(G6547577305291411977.n(i2, "High tag numbers not supported: "));
            return null;
        }
        int i3 = 6;
        byte b = (byte) ((i << 6) | (z ? 32 : 0) | i2);
        int i4 = 0;
        for (byte[] bArr3 : bArr) {
            i4 += bArr3.length;
        }
        int i5 = 2;
        if (i4 < 128) {
            bArr2 = new byte[i4 + 2];
            bArr2[0] = b;
            bArr2[1] = (byte) i4;
        } else {
            if (i4 <= 255) {
                byte[] bArr4 = new byte[i4 + 3];
                bArr4[1] = -127;
                bArr4[2] = (byte) i4;
                i3 = 3;
                bArr2 = bArr4;
            } else if (i4 <= 65535) {
                byte[] bArr5 = new byte[i4 + 4];
                bArr5[1] = -126;
                bArr5[2] = (byte) (i4 >> 8);
                bArr5[3] = (byte) (i4 & 255);
                bArr2 = bArr5;
                i3 = 4;
            } else if (i4 <= 16777215) {
                byte[] bArr6 = new byte[i4 + 5];
                bArr6[1] = -125;
                bArr6[2] = (byte) (i4 >> 16);
                bArr6[3] = (byte) ((i4 >> 8) & 255);
                bArr6[4] = (byte) (i4 & 255);
                bArr2 = bArr6;
                i3 = 5;
            } else {
                byte[] bArr7 = new byte[i4 + 6];
                bArr7[1] = -124;
                bArr7[2] = (byte) (i4 >> 24);
                bArr7[3] = (byte) ((i4 >> 16) & 255);
                bArr7[4] = (byte) ((i4 >> 8) & 255);
                bArr7[5] = (byte) (i4 & 255);
                bArr2 = bArr7;
            }
            bArr2[0] = b;
            i5 = i3;
        }
        for (byte[] bArr8 : bArr) {
            System.arraycopy(bArr8, 0, bArr2, i5, bArr8.length);
            i5 += bArr8.length;
        }
        return bArr2;
    }

    public static byte[] b(Object obj) {
        Class<?> cls = obj.getClass();
        L13834037291440535306 l13834037291440535306 = (L13834037291440535306) cls.getDeclaredAnnotation(L13834037291440535306.class);
        if (l13834037291440535306 == null) {
            throw new W16495563625558853219(cls.getName() + " not annotated with " + L13834037291440535306.class.getName());
        }
        Q9140341247415722307 type = l13834037291440535306.type();
        int ordinal = type.ordinal();
        if (ordinal == 1) {
            return e(obj);
        }
        if (ordinal == 5) {
            return f(obj, false);
        }
        if (ordinal == 12) {
            return f(obj, true);
        }
        throw new W16495563625558853219("Unsupported container type: " + type);
    }

    public static ArrayList c(Object obj) {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            J16229365650376721338 j16229365650376721338 = (J16229365650376721338) field.getDeclaredAnnotation(J16229365650376721338.class);
            if (j16229365650376721338 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new W16495563625558853219(J16229365650376721338.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new K16124730071979655029(obj, field, j16229365650376721338));
                } catch (W16495563625558853219 e) {
                    throw new W16495563625558853219("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    public static Object d(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (ReflectiveOperationException e) {
            throw new W16495563625558853219("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    public static byte[] e(Object obj) {
        Class<?> cls = obj.getClass();
        ArrayList c = c(obj);
        if (c.isEmpty()) {
            throw new W16495563625558853219("No fields annotated with " + J16229365650376721338.class.getName() + " in CHOICE class " + cls.getName());
        }
        int size = c.size();
        K16124730071979655029 k16124730071979655029 = null;
        int i = 0;
        while (i < size) {
            Object obj2 = c.get(i);
            i++;
            K16124730071979655029 k161247300719796550292 = (K16124730071979655029) obj2;
            if (d(obj, k161247300719796550292.a) != null) {
                if (k16124730071979655029 != null) {
                    throw new W16495563625558853219("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + k16124730071979655029.a.getName() + ", " + k161247300719796550292.a.getName());
                }
                k16124730071979655029 = k161247300719796550292;
            }
        }
        if (k16124730071979655029 != null) {
            return k16124730071979655029.a();
        }
        throw new W16495563625558853219("No non-null fields in CHOICE class ".concat(cls.getName()));
    }

    public static byte[] f(Object obj, boolean z) {
        Class<?> cls = obj.getClass();
        ArrayList c = c(obj);
        Collections.sort(c, new M5459415309190684092((byte) 3));
        if (c.size() > 1) {
            int size = c.size();
            K16124730071979655029 k16124730071979655029 = null;
            int i = 0;
            while (i < size) {
                Object obj2 = c.get(i);
                i++;
                K16124730071979655029 k161247300719796550292 = (K16124730071979655029) obj2;
                if (k16124730071979655029 != null && k16124730071979655029.c.index() == k161247300719796550292.c.index()) {
                    throw new W16495563625558853219("Fields have the same index: " + cls.getName() + "." + k16124730071979655029.a.getName() + " and ." + k161247300719796550292.a.getName());
                }
                k16124730071979655029 = k161247300719796550292;
            }
        }
        ArrayList arrayList = new ArrayList(c.size());
        int size2 = c.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = c.get(i3);
            i3++;
            K16124730071979655029 k161247300719796550293 = (K16124730071979655029) obj3;
            try {
                byte[] a2 = k161247300719796550293.a();
                if (a2 != null) {
                    arrayList.add(a2);
                    i2 += a2.length;
                }
            } catch (W16495563625558853219 e) {
                throw new W16495563625558853219("Failed to encode " + cls.getName() + "." + k161247300719796550293.a.getName(), e);
            }
        }
        if (!z) {
            return a(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
        }
        byte[] bArr = new byte[i2];
        int size3 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size3) {
            Object obj4 = arrayList.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj4;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public static byte[] g(Collection collection, Q9140341247415722307 q9140341247415722307, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Q13169198992966610970.r0(it.next(), q9140341247415722307, null));
        }
        if (z) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, J10770752472956524045.b);
            }
            i = 17;
        } else {
            i = 16;
        }
        return a(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }
}
