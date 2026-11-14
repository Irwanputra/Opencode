package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J6249063375258466235 extends P9893650590651797888 implements F4096073349764486348 {
    public static final J6249063375258466235 j;
    public static final J6249063375258466235 k;
    public static final J6249063375258466235 l;
    public static final J6249063375258466235 m;
    public static final J6249063375258466235 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final J6249063375258466235 f315o;
    public static final J6249063375258466235 p;
    public static final J6249063375258466235 q;
    public static final J6249063375258466235 r;
    public static final J6249063375258466235 s;
    public static final J6249063375258466235 t;
    public static final J6249063375258466235 u;
    public static final J6249063375258466235 v;
    public static final J6249063375258466235 w;
    public static final J6249063375258466235 x;
    public static final J6249063375258466235 y;
    public static final J6249063375258466235 z;
    public final /* synthetic */ byte i;

    static {
        int i = 1;
        j = new J6249063375258466235(i, (byte) 0);
        k = new J6249063375258466235(i, (byte) 1);
        l = new J6249063375258466235(i, (byte) 2);
        m = new J6249063375258466235(i, (byte) 3);
        n = new J6249063375258466235(i, (byte) 4);
        f315o = new J6249063375258466235(i, (byte) 5);
        p = new J6249063375258466235(i, (byte) 6);
        q = new J6249063375258466235(i, (byte) 7);
        r = new J6249063375258466235(i, (byte) 8);
        s = new J6249063375258466235(i, (byte) 9);
        t = new J6249063375258466235(i, (byte) 10);
        u = new J6249063375258466235(i, (byte) 11);
        v = new J6249063375258466235(i, (byte) 12);
        w = new J6249063375258466235(i, (byte) 13);
        x = new J6249063375258466235(i, (byte) 14);
        y = new J6249063375258466235(i, (byte) 15);
        z = new J6249063375258466235(i, (byte) 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J6249063375258466235(int i, byte b) {
        super(i);
        this.i = b;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.i;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return obj;
            case 1:
                return null;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 5:
                long jA = U10174709222559481877.a(((U10174709222559481877) obj).a, E4238948680093459570.x);
                return new E687636901257241786(U10174709222559481877.c(jA), U10174709222559481877.g(jA), U10174709222559481877.f(jA), U10174709222559481877.d(jA));
            case 6:
                return obj;
            case 7:
                long j2 = ((N13757329872968394114) obj).a;
                return new G18404260980254991369(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 8:
                G18404260980254991369 g18404260980254991369 = (G18404260980254991369) obj;
                return new N13757329872968394114(L12240044716294895599.c(g18404260980254991369.a, g18404260980254991369.b));
            case 9:
                return O4077903568229246.Q(0.0f, 0.0f, null, 7);
            case 10:
                long j3 = ((Q13254524308163418711) obj).a;
                return new Q13254524308163418711(0L);
            case 11:
                long j4 = ((Q13254524308163418711) obj).a;
                return new Q13254524308163418711(0L);
            case 12:
                long j5 = ((Q13254524308163418711) obj).a;
                return new Q2551293802323679034(0L);
            case 13:
                Q13254524308163418711 q13254524308163418711 = (Q13254524308163418711) obj;
                long j6 = q13254524308163418711.a;
                return q13254524308163418711;
            case 14:
                return A16574265085128176743.d;
            case 15:
                return o9245300239821758723;
            case 16:
                L17598299826319227431.B((L17598299826319227431) obj, U10174709222559481877.g, 0L, 0L, 0.0f, 126);
                return o9245300239821758723;
            case 17:
                return new Q13254524308163418711((((long) ((int) (((Q13254524308163418711) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 18:
                return new Q13254524308163418711((((long) ((int) (((Q13254524308163418711) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 19:
                return new Q13254524308163418711((((long) ((int) (((Q13254524308163418711) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            default:
                return new Q13254524308163418711((((long) ((int) (((Q13254524308163418711) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
