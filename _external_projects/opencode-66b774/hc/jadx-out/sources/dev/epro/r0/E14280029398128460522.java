package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class E14280029398128460522 extends M8065676928355175142 {
    public final /* synthetic */ byte d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E14280029398128460522(Object obj, G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064, byte b) {
        super(g8001132634698687269, i, t1542296375665870064);
        this.d = b;
        this.e = obj;
    }

    @Override // dev.epro.r0.M8065676928355175142
    public Object c(A2558500182237595544 a2558500182237595544, R4833348786910499294 r4833348786910499294) {
        byte b = this.d;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                Object objInvoke = ((L12639328004344855510) obj).invoke(a2558500182237595544, r4833348786910499294);
                return objInvoke == Z3437138737604933638.a ? objInvoke : o9245300239821758723;
            default:
                U8261505478335382944 u8261505478335382944 = new U8261505478335382944(a2558500182237595544);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    R7033599853981556291.E(a2558500182237595544, null, null, new Y14354959068095823168((J12043550928838212009) it.next(), u8261505478335382944, null, (byte) 11), 3);
                }
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.M8065676928355175142
    public M8065676928355175142 d(G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new E14280029398128460522((L12639328004344855510) obj, g8001132634698687269, i, t1542296375665870064, (byte) 0);
            default:
                return new E14280029398128460522((Iterable) obj, g8001132634698687269, i, t1542296375665870064, (byte) 1);
        }
    }

    @Override // dev.epro.r0.M8065676928355175142
    public E5386183571211952538 f(W5797197595347441198 w5797197595347441198) {
        switch (this.d) {
            case 1:
                L12639328004344855510 y14354959068095823168 = new Y14354959068095823168((Object) this, (R4833348786910499294) null, (byte) 9);
                J17843656891628349757 j17843656891628349757 = new J17843656891628349757(E12775674050813925581.H(w5797197595347441198, this.a), I3887072968740112330.a(this.b, 4, T1542296375665870064.a));
                j17843656891628349757.h0(L856869997670741194.a, j17843656891628349757, y14354959068095823168);
                return j17843656891628349757;
            default:
                return super.f(w5797197595347441198);
        }
    }

    @Override // dev.epro.r0.M8065676928355175142
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((L12639328004344855510) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
