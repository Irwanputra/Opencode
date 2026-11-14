package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gn1 extends java.util.LinkedHashMap {
    public static final ads_mobile_sdk.gn1 b;
    public boolean a = true;

    static {
        ads_mobile_sdk.gn1 gn1Var = new ads_mobile_sdk.gn1();
        b = gn1Var;
        gn1Var.a = false;
    }

    public final ads_mobile_sdk.gn1 b() {
        if (isEmpty()) {
            return new ads_mobile_sdk.gn1();
        }
        ads_mobile_sdk.gn1 gn1Var = new ads_mobile_sdk.gn1(this);
        gn1Var.a = true;
        return gn1Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.a) {
            super.clear();
        } else {
            dev.epro.r0.Z3383101362411723454.t();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            java.lang.Object value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (java.util.Map.Entry entry : entrySet()) {
            java.lang.Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                byte[] bArr2 = ads_mobile_sdk.rb1.a;
                iHashCode = bArr.length;
                for (byte b2 : bArr) {
                    iHashCode = (iHashCode * 31) + b2;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                if (key instanceof dev.epro.r0.O10710380540062020186) {
                    dev.epro.r0.Z3383101362411723454.t();
                    return 0;
                }
                iHashCode = key.hashCode();
            }
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = ads_mobile_sdk.rb1.a;
                int length = bArr3.length;
                for (byte b3 : bArr3) {
                    length = (length * 31) + b3;
                }
                if (length != 0) {
                    iHashCode2 = length;
                }
            } else {
                if (value instanceof dev.epro.r0.O10710380540062020186) {
                    dev.epro.r0.Z3383101362411723454.t();
                    return 0;
                }
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        if (!this.a) {
            dev.epro.r0.Z3383101362411723454.t();
            return null;
        }
        byte[] bArr = ads_mobile_sdk.rb1.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        if (!this.a) {
            dev.epro.r0.Z3383101362411723454.t();
            return;
        }
        for (java.lang.Object obj : map.keySet()) {
            byte[] bArr = ads_mobile_sdk.rb1.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        if (this.a) {
            return super.remove(obj);
        }
        dev.epro.r0.Z3383101362411723454.t();
        return null;
    }
}
