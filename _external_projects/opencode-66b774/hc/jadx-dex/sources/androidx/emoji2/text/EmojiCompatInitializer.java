package androidx.emoji2.text;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class EmojiCompatInitializer implements dev.epro.r0.R4576572296217797762 {
    public final java.util.List a() {
        return java.util.Collections.singletonList(androidx.lifecycle.ProcessLifecycleInitializer.class);
    }

    public final java.lang.Object b(android.content.Context context) {
        java.lang.Object objX;
        dev.epro.r0.X17355325846973801304 x17355325846973801304 = new dev.epro.r0.X17355325846973801304(new dev.epro.r0.U9296548531947164180(context));
        x17355325846973801304.b = true;
        if (dev.epro.r0.D3638978315442423989.k == null) {
            synchronized (dev.epro.r0.D3638978315442423989.j) {
                try {
                    if (dev.epro.r0.D3638978315442423989.k == null) {
                        dev.epro.r0.D3638978315442423989.k = new dev.epro.r0.D3638978315442423989(x17355325846973801304);
                    }
                } finally {
                }
            }
        }
        dev.epro.r0.Q7316561721656982910 q7316561721656982910D = dev.epro.r0.Q7316561721656982910.D(context);
        q7316561721656982910D.getClass();
        synchronized (dev.epro.r0.Q7316561721656982910.f) {
            try {
                objX = ((java.util.HashMap) q7316561721656982910D.b).get(androidx.lifecycle.ProcessLifecycleInitializer.class);
                if (objX == null) {
                    objX = q7316561721656982910D.x(androidx.lifecycle.ProcessLifecycleInitializer.class, new java.util.HashSet());
                }
            } finally {
            }
        }
        dev.epro.r0.R3192876217964974737 r3192876217964974737J = ((dev.epro.r0.I4293432593871965076) objX).j();
        r3192876217964974737J.a(new dev.epro.r0.C5307487432222052365(this, r3192876217964974737J));
        return java.lang.Boolean.TRUE;
    }
}
