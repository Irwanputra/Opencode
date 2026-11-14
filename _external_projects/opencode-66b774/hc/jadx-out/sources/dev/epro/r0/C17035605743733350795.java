package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C17035605743733350795 extends T7441316690157960089 implements L12639328004344855510 {
    public int t;
    public int u;
    public int v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ N5080615404647649127 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17035605743733350795(N5080615404647649127 n5080615404647649127, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.y = n5080615404647649127;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        C17035605743733350795 c17035605743733350795 = new C17035605743733350795(this.y, r4833348786910499294);
        c17035605743733350795.x = obj;
        return c17035605743733350795;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((C17035605743733350795) create((R4833348786910499294) obj2, (N3180492300688416475) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        N3180492300688416475 n3180492300688416475;
        int i;
        int i2;
        int i3;
        String strL;
        int i4;
        int i5;
        String str;
        N5080615404647649127 n5080615404647649127 = this.y;
        U9803441765912152712 u9803441765912152712 = n5080615404647649127.a;
        G1892398518770611911 g1892398518770611911 = n5080615404647649127.c;
        boolean z = this.w;
        if (!z) {
            E17665849472693074628.k(obj);
            n3180492300688416475 = (N3180492300688416475) this.x;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.v;
            i2 = this.u;
            i3 = this.t;
            n3180492300688416475 = (N3180492300688416475) this.x;
            E17665849472693074628.k(obj);
        }
        if (i3 >= Math.min(n5080615404647649127.d + 10, g1892398518770611911.b)) {
            return O9245300239821758723.a;
        }
        int i6 = i3 + 1;
        int iC = g1892398518770611911.c(i3);
        switch (iC) {
            case 0:
                strL = "up";
                break;
            case 1:
                Object objF = u9803441765912152712.f(i2);
                i2++;
                strL = "down " + objF;
                break;
            case 2:
                strL = E12098517352909843120.l("remove ", g1892398518770611911.c(i6), g1892398518770611911.c(i3 + 2), " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = g1892398518770611911.c(i6);
                int iC3 = g1892398518770611911.c(i3 + 2);
                int iC4 = g1892398518770611911.c(i3 + 3);
                StringBuilder sbP = E12098517352909843120.p(iC2, iC3, "move ", " ", " ");
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
                Object objF2 = u9803441765912152712.f(i2);
                objF2.getClass();
                V12319504402545346730.s(2, objF2);
                i2 += 2;
                strL = "apply " + ((L12639328004344855510) objF2);
                break;
            case 8:
                strL = "reuse " + n5080615404647649127.b.f(i);
                i++;
                break;
            case 9:
                strL = "recompose pending";
                break;
            default:
                strL = G6547577305291411977.n(iC, "unknown op: ");
                break;
        }
        this.x = n3180492300688416475;
        this.t = i6;
        this.u = i2;
        this.v = i;
        this.w = true;
        n3180492300688416475.c(this, i3 + ": " + strL);
        return Z3437138737604933638.a;
    }
}
