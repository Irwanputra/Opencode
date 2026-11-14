package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C17035605743733350795 extends dev.epro.r0.T7441316690157960089 implements dev.epro.r0.L12639328004344855510 {
    public int t;
    public int u;
    public int v;
    public boolean w;
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ dev.epro.r0.N5080615404647649127 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17035605743733350795(dev.epro.r0.N5080615404647649127 n5080615404647649127, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.y = n5080615404647649127;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        dev.epro.r0.C17035605743733350795 c17035605743733350795 = new dev.epro.r0.C17035605743733350795(this.y, r4833348786910499294);
        c17035605743733350795.x = obj;
        return c17035605743733350795;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.N3180492300688416475) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.N3180492300688416475 n3180492300688416475;
        int i;
        int i2;
        int i3;
        java.lang.String strL;
        int i4;
        int i5;
        java.lang.String str;
        dev.epro.r0.N5080615404647649127 n5080615404647649127 = this.y;
        dev.epro.r0.U9803441765912152712 u9803441765912152712 = n5080615404647649127.a;
        dev.epro.r0.G1892398518770611911 g1892398518770611911 = n5080615404647649127.c;
        boolean z = this.w;
        if (!z) {
            dev.epro.r0.E17665849472693074628.k(obj);
            n3180492300688416475 = (dev.epro.r0.N3180492300688416475) this.x;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.v;
            i2 = this.u;
            i3 = this.t;
            n3180492300688416475 = (dev.epro.r0.N3180492300688416475) this.x;
            dev.epro.r0.E17665849472693074628.k(obj);
        }
        if (i3 >= java.lang.Math.min(n5080615404647649127.d + 10, g1892398518770611911.b)) {
            return dev.epro.r0.O9245300239821758723.a;
        }
        int i6 = i3 + 1;
        int iC = g1892398518770611911.c(i3);
        switch (iC) {
            case 0:
                strL = "up";
                break;
            case 1:
                java.lang.Object objF = u9803441765912152712.f(i2);
                i2++;
                strL = "down " + objF;
                break;
            case 2:
                strL = dev.epro.r0.E12098517352909843120.l("remove ", g1892398518770611911.c(i6), g1892398518770611911.c(i3 + 2), " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = g1892398518770611911.c(i6);
                int iC3 = g1892398518770611911.c(i3 + 2);
                int iC4 = g1892398518770611911.c(i3 + 3);
                java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(iC2, iC3, "move ", " ", " ");
                sbP.append(iC4);
                strL = sbP.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strL = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC5 = g1892398518770611911.c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + u9803441765912152712.f(i2);
                int i7 = i4;
                strL = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC6 = g1892398518770611911.c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + u9803441765912152712.f(i2);
                int i72 = i4;
                strL = str;
                i6 = i72;
                i2 = i5;
                break;
            case 7:
                java.lang.Object objF2 = u9803441765912152712.f(i2);
                objF2.getClass();
                dev.epro.r0.V12319504402545346730.s(2, objF2);
                i2 += 2;
                strL = "apply " + ((dev.epro.r0.L12639328004344855510) objF2);
                break;
            case 8:
                strL = "reuse " + n5080615404647649127.b.f(i);
                i++;
                break;
            case 9:
                strL = "recompose pending";
                break;
            default:
                strL = dev.epro.r0.G6547577305291411977.n(iC, "unknown op: ");
                break;
        }
        this.x = n3180492300688416475;
        this.t = i6;
        this.u = i2;
        this.v = i;
        this.w = true;
        n3180492300688416475.c(this, i3 + ": " + strL);
        return dev.epro.r0.Z3437138737604933638.a;
    }
}
