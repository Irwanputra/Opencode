package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E10094820292195644345 {
    public static final java.util.HashMap a;

    static {
        java.util.HashMap map = new java.util.HashMap();
        a = map;
        map.put(1, dev.epro.r0.G15471856606567993098.E);
        map.put(2, dev.epro.r0.G15471856606567993098.O);
        map.put(3, dev.epro.r0.G15471856606567993098.F);
        map.put(4, dev.epro.r0.G15471856606567993098.I);
        map.put(5, dev.epro.r0.G15471856606567993098.T);
        map.put(6, dev.epro.r0.G15471856606567993098.H);
        map.put(7, dev.epro.r0.G15471856606567993098.V);
        map.put(8, dev.epro.r0.G15471856606567993098.J);
        map.put(9, dev.epro.r0.G15471856606567993098.Z);
        map.put(10, dev.epro.r0.G15471856606567993098.g0);
        map.put(11, dev.epro.r0.G15471856606567993098.a0);
        map.put(12, dev.epro.r0.G15471856606567993098.d0);
        map.put(13, dev.epro.r0.G15471856606567993098.p0);
        map.put(14, dev.epro.r0.G15471856606567993098.c0);
        map.put(15, dev.epro.r0.G15471856606567993098.r0);
        map.put(16, dev.epro.r0.G15471856606567993098.e0);
        map.put(17, dev.epro.r0.G15471856606567993098.U0);
        map.put(18, dev.epro.r0.G15471856606567993098.P0);
        map.put(19, dev.epro.r0.G15471856606567993098.R0);
        map.put(20, dev.epro.r0.G15471856606567993098.Q0);
        map.put(21, dev.epro.r0.G15471856606567993098.T0);
        map.put(22, dev.epro.r0.G15471856606567993098.S0);
        map.put(23, dev.epro.r0.G15471856606567993098.Y0);
        map.put(24, dev.epro.r0.G15471856606567993098.X0);
        map.put(25, dev.epro.r0.G15471856606567993098.N0);
        map.put(26, dev.epro.r0.G15471856606567993098.V0);
        map.put(27, dev.epro.r0.G15471856606567993098.W0);
        map.put(28, dev.epro.r0.G15471856606567993098.g1);
        map.put(29, dev.epro.r0.G15471856606567993098.h1);
        map.put(30, dev.epro.r0.G15471856606567993098.O0);
        map.put(31, dev.epro.r0.G15471856606567993098.Z0);
        map.put(32, dev.epro.r0.G15471856606567993098.a1);
        map.put(33, dev.epro.r0.G15471856606567993098.b1);
        map.put(34, dev.epro.r0.G15471856606567993098.c1);
        map.put(35, dev.epro.r0.G15471856606567993098.d1);
        map.put(36, dev.epro.r0.G15471856606567993098.b);
        map.put(37, dev.epro.r0.G15471856606567993098.u);
        map.put(38, dev.epro.r0.G15471856606567993098.e1);
        map.put(39, dev.epro.r0.G15471856606567993098.f1);
    }

    public static java.util.ArrayList a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dev.epro.r0.L14430836125261710634 l14430836125261710634 = (dev.epro.r0.A1073272897716769208) it.next();
            if (l14430836125261710634 instanceof dev.epro.r0.L14430836125261710634) {
                arrayList.add(l14430836125261710634);
            } else {
                arrayList.add(new dev.epro.r0.L14430836125261710634((dev.epro.r0.G15471856606567993098) a.get(java.lang.Integer.valueOf(l14430836125261710634.a)), l14430836125261710634.a()));
            }
        }
        return arrayList;
    }
}
