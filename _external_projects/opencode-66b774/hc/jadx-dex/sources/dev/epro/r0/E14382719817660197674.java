package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E14382719817660197674 implements dev.epro.r0.I2388620560486547149 {
    public final /* synthetic */ dev.epro.r0.A2789795882633926065 a;
    public final /* synthetic */ dev.epro.r0.X13682529397961211704 b;
    public final /* synthetic */ dev.epro.r0.W5596570651735549214 c;
    public final /* synthetic */ dev.epro.r0.A7209497065939201693 d;

    public E14382719817660197674(dev.epro.r0.A2789795882633926065 a2789795882633926065, dev.epro.r0.X13682529397961211704 x13682529397961211704, dev.epro.r0.W5596570651735549214 w5596570651735549214, dev.epro.r0.A7209497065939201693 a7209497065939201693) {
        this.a = a2789795882633926065;
        this.b = x13682529397961211704;
        this.c = w5596570651735549214;
        this.d = a7209497065939201693;
    }

    public final void d(dev.epro.r0.I4293432593871965076 i4293432593871965076, dev.epro.r0.P72364327365747079 p72364327365747079) {
        boolean z;
        dev.epro.r0.U15014152283416496379 u15014152283416496379C = null;
        switch (dev.epro.r0.G14349327121920866549.a[p72364327365747079.ordinal()]) {
            case 1:
                dev.epro.r0.R7033599853981556291.E(this.a, (dev.epro.r0.G8001132634698687269) null, dev.epro.r0.L856869997670741194.d, new dev.epro.r0.O12152244488187446230(this.d, this.c, i4293432593871965076, this, (dev.epro.r0.R4833348786910499294) null, (byte) 19), 1);
                return;
            case 2:
                dev.epro.r0.X13682529397961211704 x13682529397961211704 = this.b;
                if (x13682529397961211704 != null) {
                    dev.epro.r0.T558270488962777544 t558270488962777544 = (dev.epro.r0.T558270488962777544) x13682529397961211704.c;
                    synchronized (t558270488962777544.b) {
                        try {
                            synchronized (t558270488962777544.b) {
                                z = t558270488962777544.a;
                            }
                            if (!z) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) t558270488962777544.c;
                                t558270488962777544.c = (java.util.ArrayList) t558270488962777544.d;
                                t558270488962777544.d = arrayList;
                                t558270488962777544.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((dev.epro.r0.R4833348786910499294) arrayList.get(i)).resumeWith(dev.epro.r0.O9245300239821758723.a);
                                }
                                arrayList.clear();
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                dev.epro.r0.W5596570651735549214 w5596570651735549214 = this.c;
                synchronized (w5596570651735549214.c) {
                    if (w5596570651735549214.t) {
                        w5596570651735549214.t = false;
                        u15014152283416496379C = w5596570651735549214.C();
                    }
                    break;
                }
                if (u15014152283416496379C != null) {
                    ((dev.epro.r0.H7219028874700587498) u15014152283416496379C).resumeWith(dev.epro.r0.O9245300239821758723.a);
                    return;
                }
                return;
            case 3:
                dev.epro.r0.W5596570651735549214 w55965706517355492142 = this.c;
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
                dev.epro.r0.Z3383101362411723454.g();
                return;
        }
    }
}
