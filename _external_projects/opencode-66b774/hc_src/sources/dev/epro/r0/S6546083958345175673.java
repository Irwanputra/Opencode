package dev.epro.r0;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S6546083958345175673 implements Y15793652731717703673 {
    public final N2892298408695128503 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final boolean e;
    public final V5656221289452463152 f;
    public G14438155262350387569 g;

    public S6546083958345175673(N2892298408695128503 n2892298408695128503, ArrayList arrayList, int i, int i2, boolean z, V5656221289452463152 v5656221289452463152) {
        this.a = n2892298408695128503;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = v5656221289452463152;
        if (arrayList.size() > 1) {
            return;
        }
        Y16081827717826519461.c("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + ".");
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final boolean a() {
        return this.e;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 b() {
        return this.e ? g() : j();
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 c(long j) {
        G14438155262350387569 g14438155262350387569 = this.g;
        if (g14438155262350387569 == null) {
            g14438155262350387569 = new G14438155262350387569();
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                R3610722646682213723 r3610722646682213723 = (R3610722646682213723) arrayList.get(i);
                long j2 = r3610722646682213723.a;
                int c = g14438155262350387569.c(j2);
                Object[] objArr = g14438155262350387569.c;
                Object obj = objArr[c];
                g14438155262350387569.b[c] = j2;
                objArr[c] = r3610722646682213723;
            }
            this.g = g14438155262350387569;
        }
        return (R3610722646682213723) g14438155262350387569.e(j);
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final V5656221289452463152 d() {
        return this.f;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final G14438155262350387569 e(V5656221289452463152 v5656221289452463152) {
        return U8836654130139556418.i(v5656221289452463152, this.b, new P16607035664026122700((byte) 16), new Q15027034467569330017(v5656221289452463152, (byte) 3), new R15623402566349216748(v5656221289452463152, (byte) 0));
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 f() {
        return l() == M16210313685714734865.a ? j() : g();
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 g() {
        return (R3610722646682213723) this.b.get(p(this.c, true));
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final int h() {
        return this.c;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final int i() {
        return this.d;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final R3610722646682213723 j() {
        return (R3610722646682213723) this.b.get(p(this.d, false));
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final boolean k(Y15793652731717703673 y15793652731717703673) {
        if (this.f != null && y15793652731717703673 != null && (y15793652731717703673 instanceof S6546083958345175673)) {
            S6546083958345175673 s6546083958345175673 = (S6546083958345175673) y15793652731717703673;
            ArrayList arrayList = s6546083958345175673.b;
            if (this.e == s6546083958345175673.e && this.c == s6546083958345175673.c && this.d == s6546083958345175673.d) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() == arrayList.size()) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        R3610722646682213723 r3610722646682213723 = (R3610722646682213723) arrayList2.get(i);
                        R3610722646682213723 r36107226466822137232 = (R3610722646682213723) arrayList.get(i);
                        if (r3610722646682213723.a != r36107226466822137232.a || r3610722646682213723.c != r36107226466822137232.c || r3610722646682213723.d != r36107226466822137232.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final M16210313685714734865 l() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return M16210313685714734865.b;
        }
        if (i > i2) {
            return M16210313685714734865.a;
        }
        return ((R3610722646682213723) this.b.get(i / 2)).b();
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final int m() {
        return this.b.size();
    }

    @Override // dev.epro.r0.Y15793652731717703673
    public final void n(S5549144459901335415 s5549144459901335415) {
        int o2 = o(f().a);
        int o3 = o((l() == M16210313685714734865.a ? g() : j()).a);
        int i = o2 + 1;
        if (i >= o3) {
            return;
        }
        while (i < o3) {
            s5549144459901335415.invoke(this.b.get(i));
            i++;
        }
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(E12098517352909843120.k(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int ordinal = l().ordinal();
        int i2 = z;
        if (ordinal == 0) {
            if (z != 0) {
                i2 = 0;
                return (i - (i2 ^ 1)) / 2;
            }
            i2 = 1;
            return (i - (i2 ^ 1)) / 2;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                Z3383101362411723454.g();
                return 0;
            }
            i2 = 1;
        }
        return (i - (i2 ^ 1)) / 2;
    }

    public final String toString() {
        boolean z = true;
        float f = (this.c + 1) / 2.0f;
        float f2 = (this.d + 1) / 2.0f;
        M16210313685714734865 l = l();
        StringBuilder sb = new StringBuilder("[\n\t");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            R3610722646682213723 r3610722646682213723 = (R3610722646682213723) arrayList.get(i);
            if (z) {
                z = false;
            } else {
                sb.append(",\n\t");
            }
            i++;
            sb.append(i + " -> " + r3610722646682213723);
        }
        sb.append("\n]");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb3.append(this.e);
        sb3.append(", startPosition=");
        sb3.append(f);
        sb3.append(", endPosition=");
        sb3.append(f2);
        sb3.append(", crossed=");
        sb3.append(l);
        sb3.append(", infos=");
        return G6547577305291411977.u(sb3, sb2, ")");
    }
}
