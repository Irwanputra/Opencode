package dev.epro.r0;

import ads_mobile_sdk.b6;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J10770752472956524045 implements Comparator {
    public static final J10770752472956524045 b = new J10770752472956524045(0);
    public static final J10770752472956524045 c = new J10770752472956524045(1);
    public static final J10770752472956524045 d = new J10770752472956524045(2);
    public static final J10770752472956524045 e = new J10770752472956524045(3);
    public static final J10770752472956524045 f = new J10770752472956524045(4);
    public static final J10770752472956524045 g = new J10770752472956524045(5);
    public final /* synthetic */ byte a;

    public /* synthetic */ J10770752472956524045(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int min = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
                    if (i2 != 0) {
                        return i2;
                    }
                }
                return bArr.length - bArr2.length;
            case 1:
                J9638579967056948799 j9638579967056948799 = (J9638579967056948799) obj;
                J9638579967056948799 j96385799670569487992 = (J9638579967056948799) obj2;
                if (B11964701839924937722.A(j9638579967056948799) && B11964701839924937722.A(j96385799670569487992)) {
                    H11725168162114556860 R = R7033599853981556291.R(j9638579967056948799);
                    H11725168162114556860 R2 = R7033599853981556291.R(j96385799670569487992);
                    if (!S10823041268949770285.t(R, R2)) {
                        H11725168162114556860[] h11725168162114556860Arr = new H11725168162114556860[16];
                        int i3 = 0;
                        while (R != null) {
                            int i4 = i3 + 1;
                            if (h11725168162114556860Arr.length < i4) {
                                int length = h11725168162114556860Arr.length;
                                ?? r4 = new Object[Math.max(i4, length * 2)];
                                System.arraycopy(h11725168162114556860Arr, 0, r4, 0, length);
                                h11725168162114556860Arr = r4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(h11725168162114556860Arr, 0, h11725168162114556860Arr, 0 + 1, i3 + 0);
                            }
                            h11725168162114556860Arr[0] = R;
                            i3++;
                            R = R.u();
                        }
                        H11725168162114556860[] h11725168162114556860Arr2 = new H11725168162114556860[16];
                        int i5 = 0;
                        while (R2 != null) {
                            int i6 = i5 + 1;
                            if (h11725168162114556860Arr2.length < i6) {
                                int length2 = h11725168162114556860Arr2.length;
                                ?? r42 = new Object[Math.max(i6, length2 * 2)];
                                System.arraycopy(h11725168162114556860Arr2, 0, r42, 0, length2);
                                h11725168162114556860Arr2 = r42;
                            }
                            if (i5 != 0) {
                                System.arraycopy(h11725168162114556860Arr2, 0, h11725168162114556860Arr2, 0 + 1, i5 + 0);
                            }
                            h11725168162114556860Arr2[0] = R2;
                            i5++;
                            R2 = R2.u();
                        }
                        int min2 = Math.min(i3 - 1, i5 - 1);
                        if (min2 >= 0) {
                            int i7 = 0;
                            while (S10823041268949770285.t(h11725168162114556860Arr[i7], h11725168162114556860Arr2[i7])) {
                                if (i7 != min2) {
                                    i7++;
                                }
                            }
                            return S10823041268949770285.z(h11725168162114556860Arr[i7].v(), h11725168162114556860Arr2[i7].v());
                        }
                        S10973172697741180971.m("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (B11964701839924937722.A(j9638579967056948799)) {
                        return -1;
                    }
                    if (B11964701839924937722.A(j96385799670569487992)) {
                        return 1;
                    }
                }
                return 0;
            case 2:
                S6349823729575121924 h = ((R6653624393204003746) obj).h();
                S6349823729575121924 h2 = ((R6653624393204003746) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                return compare3 != 0 ? compare3 : Float.compare(h.c, h2.c);
            case 3:
                H11725168162114556860 h11725168162114556860 = (H11725168162114556860) obj;
                H11725168162114556860 h117251681621145568602 = (H11725168162114556860) obj2;
                int z = S10823041268949770285.z(h117251681621145568602.p, h11725168162114556860.p);
                return z != 0 ? z : S10823041268949770285.z(h11725168162114556860.hashCode(), h117251681621145568602.hashCode());
            case 4:
                S6349823729575121924 h3 = ((R6653624393204003746) obj).h();
                S6349823729575121924 h4 = ((R6653624393204003746) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h3.b, h4.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h3.d, h4.d);
                return compare6 != 0 ? compare6 : Float.compare(h4.a, h3.a);
            case 5:
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) obj;
                H9390398899829886498 h93903988998298864982 = (H9390398899829886498) obj2;
                int compare7 = Float.compare(((S6349823729575121924) h9390398899829886498.a).b, ((S6349823729575121924) h93903988998298864982.a).b);
                return compare7 != 0 ? compare7 : Float.compare(((S6349823729575121924) h9390398899829886498.a).d, ((S6349823729575121924) h93903988998298864982.a).d);
            case 6:
                return Integer.valueOf(((F14378331124810887321) obj).b).compareTo(Integer.valueOf(((F14378331124810887321) obj2).b));
            case 7:
                return Integer.valueOf(((F14378331124810887321) obj).b).compareTo(Integer.valueOf(((F14378331124810887321) obj2).b));
            case 8:
                return ((Character) ((C16290937579972779475) obj).a).charValue() - ((Character) ((C16290937579972779475) obj2).a).charValue();
            case 9:
                long j = ((X13396380553427713373) obj).f;
                long j2 = ((X13396380553427713373) obj2).f;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min3 = Math.min(str.length(), str2.length());
                int i8 = 4;
                while (true) {
                    if (i8 >= min3) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 < length4) {
                            return -1;
                        }
                    } else {
                        char charAt = str.charAt(i8);
                        char charAt2 = str2.charAt(i8);
                        if (charAt == charAt2) {
                            i8++;
                        } else if (S10823041268949770285.z(charAt, charAt2) < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 11:
                H11725168162114556860 h117251681621145568603 = (H11725168162114556860) obj;
                H11725168162114556860 h117251681621145568604 = (H11725168162114556860) obj2;
                int z2 = S10823041268949770285.z(h117251681621145568603.p, h117251681621145568604.p);
                return z2 != 0 ? z2 : S10823041268949770285.z(h117251681621145568603.hashCode(), h117251681621145568604.hashCode());
            case 12:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 13:
                return Y582199805280922215.o((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 14:
                return Y582199805280922215.o((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 15:
                return Y582199805280922215.o(((Y523155941519587740) obj).a, ((Y523155941519587740) obj2).a);
            case 16:
                return Y582199805280922215.o(((H10969385056623275121) obj).a, ((H10969385056623275121) obj2).a);
            case 17:
                return ((Integer) ((C16290937579972779475) obj).a).intValue() - ((Integer) ((C16290937579972779475) obj2).a).intValue();
            case 18:
                return Y582199805280922215.o(String.valueOf(((Boolean) obj).booleanValue()), String.valueOf(((Boolean) obj2).booleanValue()));
            case 19:
                return Y582199805280922215.o(obj != null ? obj.toString() : null, obj2 != null ? obj2.toString() : null);
            case 20:
                return Y582199805280922215.o((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 21:
                return Y582199805280922215.o(obj != null ? obj.toString() : null, obj2 != null ? obj2.toString() : null);
            case 22:
                return Y582199805280922215.o(obj != null ? obj.toString() : null, obj2 != null ? obj2.toString() : null);
            case 23:
                return String.valueOf(((Map.Entry) obj).getKey()).compareTo(String.valueOf(((Map.Entry) obj2).getKey()));
            case 24:
                return Y582199805280922215.o((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            default:
                return Long.valueOf(((b6) obj).p()).compareTo(Long.valueOf(((b6) obj2).p()));
        }
    }
}
