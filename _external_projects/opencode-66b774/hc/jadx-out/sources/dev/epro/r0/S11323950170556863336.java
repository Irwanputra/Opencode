package dev.epro.r0;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S11323950170556863336 {
    public final LinkedHashMap a;

    public S11323950170556863336(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 3:
                this.a = new LinkedHashMap();
                break;
            case 4:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(V6281043481934004271 v6281043481934004271, F4096073349764486348 f4096073349764486348) {
        f4096073349764486348.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(v6281043481934004271)) {
            S10973172697741180971.i(G6547577305291411977.s("A `initializer` with the same `clazz` has already been added: ", v6281043481934004271.b(), "."));
        } else {
            linkedHashMap.put(v6281043481934004271, new X17761314476041827846(v6281043481934004271, f4096073349764486348));
        }
    }

    public void b(K13242289086361784648 k13242289086361784648) {
        k13242289086361784648.getClass();
        byte b = k13242289086361784648.a;
        byte b2 = k13242289086361784648.b;
        Integer numValueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Objects.toString(treeMap2.get(Integer.valueOf(b2)));
            k13242289086361784648.toString();
        }
        treeMap2.put(Integer.valueOf(b2), k13242289086361784648);
    }

    public Y3135070733400213774 c() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        X17761314476041827846[] x17761314476041827846Arr = (X17761314476041827846[]) collectionValues.toArray(new X17761314476041827846[0]);
        return new Y3135070733400213774((X17761314476041827846[]) Arrays.copyOf(x17761314476041827846Arr, x17761314476041827846Arr.length), (byte) 2);
    }

    public Z4023314114778119473 d() {
        Z4023314114778119473 z4023314114778119473 = new Z4023314114778119473(this.a);
        Z860808776098365610.R(z4023314114778119473);
        return z4023314114778119473;
    }

    public void e(HashMap map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                V6281043481934004271 v6281043481934004271A = J17975719213314763068.a(value.getClass());
                if (!v6281043481934004271A.equals(J17975719213314763068.a(Boolean.TYPE)) && !v6281043481934004271A.equals(J17975719213314763068.a(Byte.TYPE)) && !v6281043481934004271A.equals(J17975719213314763068.a(Integer.TYPE)) && !v6281043481934004271A.equals(J17975719213314763068.a(Long.TYPE)) && !v6281043481934004271A.equals(J17975719213314763068.a(Float.TYPE)) && !v6281043481934004271A.equals(J17975719213314763068.a(Double.TYPE)) && !v6281043481934004271A.equals(J17975719213314763068.a(String.class)) && !v6281043481934004271A.equals(J17975719213314763068.a(Boolean[].class)) && !v6281043481934004271A.equals(J17975719213314763068.a(Byte[].class)) && !v6281043481934004271A.equals(J17975719213314763068.a(Integer[].class)) && !v6281043481934004271A.equals(J17975719213314763068.a(Long[].class)) && !v6281043481934004271A.equals(J17975719213314763068.a(Float[].class)) && !v6281043481934004271A.equals(J17975719213314763068.a(Double[].class)) && !v6281043481934004271A.equals(J17975719213314763068.a(String[].class))) {
                    int i = 0;
                    if (v6281043481934004271A.equals(J17975719213314763068.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int i2 = J18388554131392922007.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (v6281043481934004271A.equals(J17975719213314763068.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int i3 = J18388554131392922007.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (v6281043481934004271A.equals(J17975719213314763068.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        int i4 = J18388554131392922007.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (v6281043481934004271A.equals(J17975719213314763068.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        int i5 = J18388554131392922007.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (v6281043481934004271A.equals(J17975719213314763068.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        int i6 = J18388554131392922007.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!v6281043481934004271A.equals(J17975719213314763068.a(double[].class))) {
                            S10973172697741180971.l("Key ", str, " has invalid type ", v6281043481934004271A);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        int i7 = J18388554131392922007.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }

    public X5127101262035123109 f(T4643696886244492064 t4643696886244492064) {
        t4643696886244492064.getClass();
        return (X5127101262035123109) this.a.remove(t4643696886244492064);
    }

    public List g(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (S10823041268949770285.t(((T4643696886244492064) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((T4643696886244492064) it.next());
        }
        return R9411874267597469228.d1(linkedHashMap.values());
    }

    public X5127101262035123109 h(T4643696886244492064 t4643696886244492064) {
        LinkedHashMap linkedHashMap = this.a;
        Object x5127101262035123109 = linkedHashMap.get(t4643696886244492064);
        if (x5127101262035123109 == null) {
            x5127101262035123109 = new X5127101262035123109(t4643696886244492064);
            linkedHashMap.put(t4643696886244492064, x5127101262035123109);
        }
        return (X5127101262035123109) x5127101262035123109;
    }
}
