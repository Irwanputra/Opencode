package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E14382719817660197674 implements I2388620560486547149 {
    public final /* synthetic */ A2789795882633926065 a;
    public final /* synthetic */ X13682529397961211704 b;
    public final /* synthetic */ W5596570651735549214 c;
    public final /* synthetic */ A7209497065939201693 d;

    public E14382719817660197674(A2789795882633926065 a2789795882633926065, X13682529397961211704 x13682529397961211704, W5596570651735549214 w5596570651735549214, A7209497065939201693 a7209497065939201693) {
        this.a = a2789795882633926065;
        this.b = x13682529397961211704;
        this.c = w5596570651735549214;
        this.d = a7209497065939201693;
    }

    @Override // dev.epro.r0.I2388620560486547149
    public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
        boolean z;
        U15014152283416496379 u15014152283416496379C = null;
        switch (G14349327121920866549.a[p72364327365747079.ordinal()]) {
            case 1:
                R7033599853981556291.E(this.a, null, L856869997670741194.d, new O12152244488187446230(this.d, this.c, i4293432593871965076, this, (R4833348786910499294) null, (byte) 19), 1);
                return;
            case 2:
                X13682529397961211704 x13682529397961211704 = this.b;
                if (x13682529397961211704 != null) {
                    T558270488962777544 t558270488962777544 = (T558270488962777544) x13682529397961211704.c;
                    synchronized (t558270488962777544.b) {
                        try {
                            synchronized (t558270488962777544.b) {
                                z = t558270488962777544.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) t558270488962777544.c;
                                t558270488962777544.c = (ArrayList) t558270488962777544.d;
                                t558270488962777544.d = arrayList;
                                t558270488962777544.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((R4833348786910499294) arrayList.get(i)).resumeWith(O9245300239821758723.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                W5596570651735549214 w5596570651735549214 = this.c;
                synchronized (w5596570651735549214.c) {
                    if (w5596570651735549214.t) {
                        w5596570651735549214.t = false;
                        u15014152283416496379C = w5596570651735549214.C();
                    }
                    break;
                }
                if (u15014152283416496379C != null) {
                    ((H7219028874700587498) u15014152283416496379C).resumeWith(O9245300239821758723.a);
                    return;
                }
                return;
            case 3:
                W5596570651735549214 w55965706517355492142 = this.c;
                synchronized (w55965706517355492142.c) {
                    w55965706517355492142.t = true;
                }
                return;
            case 4:
                this.c.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                Z3383101362411723454.g();
                return;
        }
    }
}
