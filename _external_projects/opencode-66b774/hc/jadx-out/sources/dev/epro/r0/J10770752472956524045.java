package dev.epro.r0;

import ads_mobile_sdk.b6;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < iMin; i++) {
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
                    H11725168162114556860 h11725168162114556860R = R7033599853981556291.R(j9638579967056948799);
                    H11725168162114556860 h11725168162114556860R2 = R7033599853981556291.R(j96385799670569487992);
                    if (!S10823041268949770285.t(h11725168162114556860R, h11725168162114556860R2)) {
                        Object[] objArr = new H11725168162114556860[16];
                        int i3 = 0;
                        while (h11725168162114556860R != null) {
                            int i4 = i3 + 1;
                            if (objArr.length < i4) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i3 + 0);
                            }
                            objArr[0] = h11725168162114556860R;
                            i3++;
                            h11725168162114556860R = h11725168162114556860R.u();
                        }
                        Object[] objArr3 = new H11725168162114556860[16];
                        int i5 = 0;
                        while (h11725168162114556860R2 != null) {
                            int i6 = i5 + 1;
                            if (objArr3.length < i6) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i5 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i5 + 0);
                            }
                            objArr3[0] = h11725168162114556860R2;
                            i5++;
                            h11725168162114556860R2 = h11725168162114556860R2.u();
                        }
                        int iMin2 = Math.min(i3 - 1, i5 - 1);
                        if (iMin2 >= 0) {
                            int i7 = 0;
                            while (S10823041268949770285.t(objArr[i7], objArr3[i7])) {
                                if (i7 != iMin2) {
                                    i7++;
                                }
                            }
                            return S10823041268949770285.z(((H11725168162114556860) objArr[i7]).v(), ((H11725168162114556860) objArr3[i7]).v());
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
                S6349823729575121924 s6349823729575121924H = ((R6653624393204003746) obj).h();
                S6349823729575121924 s6349823729575121924H2 = ((R6653624393204003746) obj2).h();
                int iCompare = Float.compare(s6349823729575121924H.a, s6349823729575121924H2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(s6349823729575121924H.b, s6349823729575121924H2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(s6349823729575121924H.d, s6349823729575121924H2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(s6349823729575121924H.c, s6349823729575121924H2.c);
            case 3:
                H11725168162114556860 h11725168162114556860 = (H11725168162114556860) obj;
                H11725168162114556860 h117251681621145568602 = (H11725168162114556860) obj2;
                int iZ = S10823041268949770285.z(h117251681621145568602.p, h11725168162114556860.p);
                return iZ != 0 ? iZ : S10823041268949770285.z(h11725168162114556860.hashCode(), h117251681621145568602.hashCode());
            case 4:
                S6349823729575121924 s6349823729575121924H3 = ((R6653624393204003746) obj).h();
                S6349823729575121924 s6349823729575121924H4 = ((R6653624393204003746) obj2).h();
                int iCompare4 = Float.compare(s6349823729575121924H4.c, s6349823729575121924H3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(s6349823729575121924H3.b, s6349823729575121924H4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(s6349823729575121924H3.d, s6349823729575121924H4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(s6349823729575121924H4.a, s6349823729575121924H3.a);
            case 5:
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) obj;
                H9390398899829886498 h93903988998298864982 = (H9390398899829886498) obj2;
                int iCompare7 = Float.compare(((S6349823729575121924) h9390398899829886498.a).b, ((S6349823729575121924) h93903988998298864982.a).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((S6349823729575121924) h9390398899829886498.a).d, ((S6349823729575121924) h93903988998298864982.a).d);
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
                int iMin3 = Math.min(str.length(), str2.length());
                int i8 = 4;
                while (true) {
                    if (i8 >= iMin3) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 < length4) {
                            return -1;
                        }
                    } else {
                        char cCharAt = str.charAt(i8);
                        char cCharAt2 = str2.charAt(i8);
                        if (cCharAt == cCharAt2) {
                            i8++;
                        } else if (S10823041268949770285.z(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 11:
                H11725168162114556860 h117251681621145568603 = (H11725168162114556860) obj;
                H11725168162114556860 h117251681621145568604 = (H11725168162114556860) obj2;
                int iZ2 = S10823041268949770285.z(h117251681621145568603.p, h117251681621145568604.p);
                return iZ2 != 0 ? iZ2 : S10823041268949770285.z(h117251681621145568603.hashCode(), h117251681621145568604.hashCode());
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
