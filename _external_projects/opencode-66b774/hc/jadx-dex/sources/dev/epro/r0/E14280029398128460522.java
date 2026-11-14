package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class E14280029398128460522 extends dev.epro.r0.M8065676928355175142 {
    public final /* synthetic */ byte d;
    public final java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E14280029398128460522(java.lang.Object obj, dev.epro.r0.G8001132634698687269 g8001132634698687269, int i, dev.epro.r0.T1542296375665870064 t1542296375665870064, byte b) {
        super(g8001132634698687269, i, t1542296375665870064);
        this.d = b;
        this.e = obj;
    }

    public java.lang.Object c(dev.epro.r0.A2558500182237595544 a2558500182237595544, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        byte b = this.d;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.Object obj = this.e;
        switch (b) {
            case 0:
                java.lang.Object objInvoke = ((dev.epro.r0.L12639328004344855510) obj).invoke(a2558500182237595544, r4833348786910499294);
                return objInvoke == dev.epro.r0.Z3437138737604933638.a ? objInvoke : o9245300239821758723;
            default:
                dev.epro.r0.U8261505478335382944 u8261505478335382944 = new dev.epro.r0.U8261505478335382944(a2558500182237595544);
                java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                while (it.hasNext()) {
                    dev.epro.r0.R7033599853981556291.E(a2558500182237595544, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.Y14354959068095823168((dev.epro.r0.J12043550928838212009) it.next(), u8261505478335382944, (dev.epro.r0.R4833348786910499294) null, (byte) 11), 3);
                }
                return o9245300239821758723;
        }
    }

    public dev.epro.r0.M8065676928355175142 d(dev.epro.r0.G8001132634698687269 g8001132634698687269, int i, dev.epro.r0.T1542296375665870064 t1542296375665870064) {
        byte b = this.d;
        java.lang.Object obj = this.e;
        switch (b) {
            case 0:
                return new dev.epro.r0.E14280029398128460522((dev.epro.r0.L12639328004344855510) obj, g8001132634698687269, i, t1542296375665870064, (byte) 0);
            default:
                return new dev.epro.r0.E14280029398128460522((java.lang.Iterable) obj, g8001132634698687269, i, t1542296375665870064, (byte) 1);
        }
    }

    public dev.epro.r0.E5386183571211952538 f(dev.epro.r0.W5797197595347441198 w5797197595347441198) {
        switch (this.d) {
            case 1:
                dev.epro.r0.Y14354959068095823168 y14354959068095823168 = new dev.epro.r0.Y14354959068095823168(this, (dev.epro.r0.R4833348786910499294) null, (byte) 9);
                dev.epro.r0.J17843656891628349757 j17843656891628349757 = new dev.epro.r0.J17843656891628349757(dev.epro.r0.E12775674050813925581.H(w5797197595347441198, ((dev.epro.r0.M8065676928355175142) this).a), dev.epro.r0.I3887072968740112330.a(((dev.epro.r0.M8065676928355175142) this).b, 4, dev.epro.r0.T1542296375665870064.a));
                j17843656891628349757.h0(dev.epro.r0.L856869997670741194.a, j17843656891628349757, y14354959068095823168);
                return j17843656891628349757;
            default:
                return super.f(w5797197595347441198);
        }
    }

    public java.lang.String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((dev.epro.r0.L12639328004344855510) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
