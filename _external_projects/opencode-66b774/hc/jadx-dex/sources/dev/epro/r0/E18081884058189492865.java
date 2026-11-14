package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E18081884058189492865 {
    public static void a(android.app.Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static final void b(dev.epro.r0.R6653624393204003746 r6653624393204003746, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        dev.epro.r0.E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        java.lang.Object objG = e10198359844879945462.a.g(dev.epro.r0.D10671166500636893138.M);
        if (objG == null) {
            objG = null;
        }
        dev.epro.r0.D7213087464567441683 d7213087464567441683 = (dev.epro.r0.D7213087464567441683) objG;
        java.lang.Object objG2 = e10198359844879945462.a.g(dev.epro.r0.D10671166500636893138.I);
        int i = ((dev.epro.r0.F12478849263529740365) (objG2 != null ? objG2 : null)) != null ? 1 : 0;
        if (d7213087464567441683 != null && d7213087464567441683.b) {
            i |= 4;
        }
        if (d7213087464567441683 != null && d7213087464567441683.a) {
            i |= 2;
        }
        accessibilityEvent.setTextChangeTypes(i | accessibilityEvent.getTextChangeTypes());
    }

    public static void c(android.app.Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }
}
