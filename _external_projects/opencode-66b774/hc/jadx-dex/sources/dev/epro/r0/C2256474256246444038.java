package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C2256474256246444038 {
    public static final dev.epro.r0.C2256474256246444038 c = new dev.epro.r0.C2256474256246444038();
    public final java.util.concurrent.ConcurrentHashMap b = new java.util.concurrent.ConcurrentHashMap();
    public final dev.epro.r0.H12843822278061842084 a = new dev.epro.r0.H12843822278061842084((byte) 3);

    public final dev.epro.r0.Y3341182438442346389 a(java.lang.Class cls) {
        dev.epro.r0.N11883436969612056524 n11883436969612056524;
        dev.epro.r0.C16454110057029070726 c16454110057029070726Z;
        dev.epro.r0.S15638288480382345131.a("messageType", cls);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.b;
        dev.epro.r0.Y3341182438442346389 y3341182438442346389 = (dev.epro.r0.Y3341182438442346389) concurrentHashMap.get(cls);
        if (y3341182438442346389 != null) {
            return y3341182438442346389;
        }
        java.lang.Class cls2 = dev.epro.r0.W3646014350333091735.a;
        if (!dev.epro.r0.Z14368087615735085238.class.isAssignableFrom(cls)) {
            java.lang.Class cls3 = dev.epro.r0.E6993330184355272251.a;
            java.lang.Class cls4 = dev.epro.r0.W3646014350333091735.a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                dev.epro.r0.S10973172697741180971.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        dev.epro.r0.J14415172299974100388 j14415172299974100388A = ((dev.epro.r0.Z17811827500574349708) this.a.b).a(cls);
        if ((j14415172299974100388A.d & 2) == 2) {
            java.lang.Class cls5 = dev.epro.r0.E6993330184355272251.a;
            if (dev.epro.r0.Z14368087615735085238.class.isAssignableFrom(cls)) {
                c16454110057029070726Z = new dev.epro.r0.C16454110057029070726(dev.epro.r0.W3646014350333091735.c, dev.epro.r0.V9657943390133166886.a, j14415172299974100388A.a);
            } else {
                dev.epro.r0.R1604357493379982192 r1604357493379982192 = dev.epro.r0.W3646014350333091735.b;
                dev.epro.r0.N11883436969612056524 n118834369696120565242 = dev.epro.r0.V9657943390133166886.b;
                if (n118834369696120565242 == null) {
                    dev.epro.r0.S10973172697741180971.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                c16454110057029070726Z = new dev.epro.r0.C16454110057029070726(r1604357493379982192, n118834369696120565242, j14415172299974100388A.a);
            }
        } else {
            java.lang.Class cls6 = dev.epro.r0.E6993330184355272251.a;
            if (dev.epro.r0.Z14368087615735085238.class.isAssignableFrom(cls)) {
                c16454110057029070726Z = dev.epro.r0.O6762602046924520025.z(j14415172299974100388A, dev.epro.r0.W13506957901810483762.b, dev.epro.r0.N2059931192635908863.b, dev.epro.r0.W3646014350333091735.c, dev.epro.r0.L11610354117192841236.A(j14415172299974100388A.a()) != 1 ? dev.epro.r0.V9657943390133166886.a : null, dev.epro.r0.G7531848148988854188.b);
            } else {
                dev.epro.r0.J11813598540494406709 j11813598540494406709 = dev.epro.r0.W13506957901810483762.a;
                dev.epro.r0.J8782244783781293484 j8782244783781293484 = dev.epro.r0.N2059931192635908863.a;
                dev.epro.r0.R1604357493379982192 r16043574933799821922 = dev.epro.r0.W3646014350333091735.b;
                if (dev.epro.r0.L11610354117192841236.A(j14415172299974100388A.a()) != 1) {
                    dev.epro.r0.N11883436969612056524 n118834369696120565243 = dev.epro.r0.V9657943390133166886.b;
                    if (n118834369696120565243 == null) {
                        dev.epro.r0.S10973172697741180971.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    n11883436969612056524 = n118834369696120565243;
                } else {
                    n11883436969612056524 = null;
                }
                c16454110057029070726Z = dev.epro.r0.O6762602046924520025.z(j14415172299974100388A, j11813598540494406709, j8782244783781293484, r16043574933799821922, n11883436969612056524, dev.epro.r0.G7531848148988854188.a);
            }
        }
        dev.epro.r0.Y3341182438442346389 y33411824384423463892 = (dev.epro.r0.Y3341182438442346389) concurrentHashMap.putIfAbsent(cls, c16454110057029070726Z);
        return y33411824384423463892 != null ? y33411824384423463892 : c16454110057029070726Z;
    }
}
