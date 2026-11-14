package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D2464995779987079409 implements A10838822263452390785 {
    public final O7205211285568135375 a;
    public Z17471428274427141949[] b;
    public Z17471428274427141949[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Q10394200184129972180 h = new Q10394200184129972180(this, (byte) 1);
    public final Q10394200184129972180 i = new Q10394200184129972180(this, (byte) 0);

    public D2464995779987079409(O7205211285568135375 o7205211285568135375) {
        this.a = o7205211285568135375;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).b0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).b0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).V(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).V(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        H9390398899829886498 h9390398899829886498;
        int size = list.size();
        Z17471428274427141949[] z17471428274427141949Arr = new Z17471428274427141949[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i);
            Object k = g17613326942144185441.k();
            R4051533523343851864 r4051533523343851864 = k instanceof R4051533523343851864 ? (R4051533523343851864) k : null;
            if (r4051533523343851864 != null && ((Boolean) r4051533523343851864.a.getValue()).booleanValue()) {
                z17471428274427141949Arr[i] = g17613326942144185441.d(j);
                j2 = (r8.b & 4294967295L) | (r8.a << 32);
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list.get(i2);
            if (z17471428274427141949Arr[i2] == null) {
                z17471428274427141949Arr[i2] = g176133269421441854412.d(j);
            }
        }
        if (i5164649337253478959.A()) {
            h9390398899829886498 = new H9390398899829886498(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Z17471428274427141949 z17471428274427141949 = z17471428274427141949Arr[i5];
                if (z17471428274427141949 != null) {
                    Object k2 = ((G17613326942144185441) list.get(i5)).k();
                    R4051533523343851864 r40515335233438518642 = k2 instanceof R4051533523343851864 ? (R4051533523343851864) k2 : null;
                    if (r40515335233438518642 == null || !((Boolean) r40515335233438518642.b.getValue()).booleanValue()) {
                        int i6 = z17471428274427141949.a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = z17471428274427141949.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            h9390398899829886498 = new H9390398899829886498(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int intValue = ((Number) h9390398899829886498.a).intValue();
        int intValue2 = ((Number) h9390398899829886498.b).intValue();
        boolean A = i5164649337253478959.A();
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        if (A) {
            this.b = z17471428274427141949Arr;
            this.d = intValue;
            this.f = intValue2;
            return i5164649337253478959.m(intValue, intValue2, x9852054718446117252, this.h);
        }
        this.a.c.setValue(new Q13254524308163418711((intValue << 32) | (intValue2 & 4294967295L)));
        this.c = z17471428274427141949Arr;
        this.e = intValue;
        this.g = intValue2;
        return i5164649337253478959.m(intValue, intValue2, x9852054718446117252, this.i);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).a0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).f(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
