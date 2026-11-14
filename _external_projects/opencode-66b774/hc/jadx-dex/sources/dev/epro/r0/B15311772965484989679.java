package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B15311772965484989679 {
    public static final dev.epro.r0.A4559761392562572984 a;

    public static dev.epro.r0.W5596570651735549214 a(android.view.View view, dev.epro.r0.G8001132634698687269 g8001132634698687269, int i) {
        dev.epro.r0.G8001132634698687269 g80011326346986872692;
        dev.epro.r0.X13682529397961211704 x13682529397961211704;
        if ((i & 1) != 0) {
            g8001132634698687269 = dev.epro.r0.I3826119971291161142.a;
        }
        if (g8001132634698687269.get(dev.epro.r0.T13350664027331345869.s) == null || g8001132634698687269.get(dev.epro.r0.N5158094851646208854.j) == null) {
            dev.epro.r0.O12494175665883759871 o12494175665883759871 = dev.epro.r0.C18359104897526640234.m;
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                g80011326346986872692 = (dev.epro.r0.G8001132634698687269) dev.epro.r0.C18359104897526640234.m.getValue();
            } else {
                g80011326346986872692 = (dev.epro.r0.G8001132634698687269) dev.epro.r0.C18359104897526640234.n.get();
                if (g80011326346986872692 == null) {
                    dev.epro.r0.S10973172697741180971.m("no AndroidUiDispatcher for this thread");
                    return null;
                }
            }
            g8001132634698687269 = g80011326346986872692.plus(g8001132634698687269);
        }
        dev.epro.r0.X13682529397961211704 x136825293979612117042 = g8001132634698687269.get(dev.epro.r0.N5158094851646208854.j);
        if (x136825293979612117042 != null) {
            x13682529397961211704 = new dev.epro.r0.X13682529397961211704(x136825293979612117042);
            dev.epro.r0.T558270488962777544 t558270488962777544 = (dev.epro.r0.T558270488962777544) x13682529397961211704.c;
            synchronized (t558270488962777544.b) {
                t558270488962777544.a = false;
            }
        } else {
            x13682529397961211704 = null;
        }
        dev.epro.r0.A7209497065939201693 a7209497065939201693 = new dev.epro.r0.A7209497065939201693();
        dev.epro.r0.J10602487083330765269 j10602487083330765269 = (dev.epro.r0.R1924881055215602246) g8001132634698687269.get(dev.epro.r0.T13350664027331345869.z);
        if (j10602487083330765269 == null) {
            j10602487083330765269 = new dev.epro.r0.J10602487083330765269(view.getContext().getApplicationContext());
            a7209497065939201693.a = j10602487083330765269;
        }
        dev.epro.r0.G8001132634698687269 g8001132634698687269Plus = g8001132634698687269.plus(x13682529397961211704 != null ? x13682529397961211704 : dev.epro.r0.I3826119971291161142.a).plus(j10602487083330765269);
        dev.epro.r0.W5596570651735549214 w5596570651735549214 = new dev.epro.r0.W5596570651735549214(g8001132634698687269Plus);
        synchronized (w5596570651735549214.c) {
            w5596570651735549214.t = true;
        }
        dev.epro.r0.A2789795882633926065 a2789795882633926065A = dev.epro.r0.O8620973563946607355.a(g8001132634698687269Plus);
        dev.epro.r0.I4293432593871965076 i4293432593871965076M = dev.epro.r0.U8836654130139556418.m(view);
        dev.epro.r0.R3192876217964974737 r3192876217964974737J = i4293432593871965076M != null ? i4293432593871965076M.j() : null;
        if (r3192876217964974737J != null) {
            view.addOnAttachStateChangeListener(new dev.epro.r0.K1405385328614949895(view, w5596570651735549214));
            r3192876217964974737J.a(new dev.epro.r0.E14382719817660197674(a2789795882633926065A, x13682529397961211704, w5596570651735549214, a7209497065939201693));
            return w5596570651735549214;
        }
        dev.epro.r0.P753981624812481271.c("ViewTreeLifecycleOwner not found from " + view);
        dev.epro.r0.Z3383101362411723454.n();
        return null;
    }

    public static final dev.epro.r0.Y5209789131793062978 b(android.view.View view) {
        java.lang.Object tag = view.getTag(2131296340);
        if (tag instanceof dev.epro.r0.Y5209789131793062978) {
            return (dev.epro.r0.Y5209789131793062978) tag;
        }
        return null;
    }

    public static final native dev.epro.r0.W5596570651735549214 c(android.view.View view);

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(652);
        long[] jArr = dev.epro.r0.X4026756943680612204.a;
        a = new dev.epro.r0.A4559761392562572984();
    }
}
