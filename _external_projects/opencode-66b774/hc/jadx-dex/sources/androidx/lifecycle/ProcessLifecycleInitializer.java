package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ProcessLifecycleInitializer implements dev.epro.r0.R4576572296217797762 {
    public final java.util.List a() {
        return dev.epro.r0.O2161699089510411363.a;
    }

    public final java.lang.Object b(android.content.Context context) {
        context.getClass();
        dev.epro.r0.Q7316561721656982910 q7316561721656982910D = dev.epro.r0.Q7316561721656982910.D(context);
        q7316561721656982910D.getClass();
        if (!((java.util.HashSet) q7316561721656982910D.c).contains(androidx.lifecycle.ProcessLifecycleInitializer.class)) {
            dev.epro.r0.S10973172697741180971.m("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!dev.epro.r0.H4297221972504886183.a.getAndSet(true)) {
            android.content.Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new dev.epro.r0.K10140034025345154695());
        }
        dev.epro.r0.I4909713222951731791 i4909713222951731791 = dev.epro.r0.I4909713222951731791.i;
        i4909713222951731791.getClass();
        i4909713222951731791.e = new android.os.Handler();
        i4909713222951731791.f.e(dev.epro.r0.P72364327365747079.ON_CREATE);
        android.content.Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((android.app.Application) applicationContext2).registerActivityLifecycleCallbacks(new dev.epro.r0.H1785888784825263132(i4909713222951731791));
        return i4909713222951731791;
    }
}
