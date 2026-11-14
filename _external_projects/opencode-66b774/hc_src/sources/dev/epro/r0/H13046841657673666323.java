package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H13046841657673666323 implements Y15793652731717703673 {
    public final boolean a;
    public final int b;
    public final int c;
    public final V5656221289452463152 d;
    public final R3610722646682213723 e;

    public H13046841657673666323(boolean z, int i, int i2, V5656221289452463152 v5656221289452463152, R3610722646682213723 r3610722646682213723) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = v5656221289452463152;
        this.e = r3610722646682213723;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final boolean a() {
        return this.a;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 b() {
        return this.e;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 c(long j) {
        R3610722646682213723 r3610722646682213723 = this.e;
        if (j == r3610722646682213723.a) {
            return r3610722646682213723;
        }
        return null;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final V5656221289452463152 d() {
        return this.d;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final G14438155262350387569 e(V5656221289452463152 v5656221289452463152) {
        boolean z = v5656221289452463152.c;
        Z6884774333691094167 z6884774333691094167 = v5656221289452463152.b;
        Z6884774333691094167 z68847743336910941672 = v5656221289452463152.a;
        if ((!z && z68847743336910941672.b > z6884774333691094167.b) || (z && z68847743336910941672.b <= z6884774333691094167.b)) {
            v5656221289452463152 = V5656221289452463152.a(v5656221289452463152, null, null, !z, 3);
        }
        long j = this.e.a;
        G14438155262350387569 g14438155262350387569 = S11299071591039262705.a;
        G14438155262350387569 g144381552623503875692 = new G14438155262350387569();
        g144381552623503875692.i(j, v5656221289452463152);
        return g144381552623503875692;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 f() {
        return this.e;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 g() {
        return this.e;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final int h() {
        return this.b;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final int i() {
        return this.c;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 j() {
        return this.e;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final boolean k(Y15793652731717703673 y15793652731717703673) {
        if (this.d == null || y15793652731717703673 == null || !(y15793652731717703673 instanceof H13046841657673666323)) {
            return true;
        }
        H13046841657673666323 h13046841657673666323 = (H13046841657673666323) y15793652731717703673;
        if (this.b != h13046841657673666323.b || this.c != h13046841657673666323.c || this.a != h13046841657673666323.a) {
            return true;
        }
        R3610722646682213723 r3610722646682213723 = h13046841657673666323.e;
        R3610722646682213723 r36107226466822137232 = this.e;
        return (r36107226466822137232.a == r3610722646682213723.a && r36107226466822137232.c == r3610722646682213723.c && r36107226466822137232.d == r3610722646682213723.d) ? false : true;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final M16210313685714734865 l() {
        int i = this.b;
        int i2 = this.c;
        return i < i2 ? M16210313685714734865.b : i > i2 ? M16210313685714734865.a : this.e.b();
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final int m() {
        return 1;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + l() + ", info=\n\t" + this.e + ")";
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final void n(S5549144459901335415 s5549144459901335415) {
    }
}
