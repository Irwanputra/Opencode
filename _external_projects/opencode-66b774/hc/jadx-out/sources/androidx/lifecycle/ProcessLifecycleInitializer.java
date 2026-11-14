package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import dev.epro.r0.H1785888784825263132;
import dev.epro.r0.H4297221972504886183;
import dev.epro.r0.I4909713222951731791;
import dev.epro.r0.K10140034025345154695;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P72364327365747079;
import dev.epro.r0.Q7316561721656982910;
import dev.epro.r0.R4576572296217797762;
import dev.epro.r0.S10973172697741180971;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements R4576572296217797762 {
    @Override // dev.epro.r0.R4576572296217797762
    public final List a() {
        return O2161699089510411363.a;
    }

    @Override // dev.epro.r0.R4576572296217797762
    public final Object b(Context context) {
        context.getClass();
        Q7316561721656982910 q7316561721656982910D = Q7316561721656982910.D(context);
        q7316561721656982910D.getClass();
        if (!((HashSet) q7316561721656982910D.c).contains(ProcessLifecycleInitializer.class)) {
            S10973172697741180971.m("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!H4297221972504886183.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new K10140034025345154695());
        }
        I4909713222951731791 i4909713222951731791 = I4909713222951731791.i;
        i4909713222951731791.getClass();
        i4909713222951731791.e = new Handler();
        i4909713222951731791.f.e(P72364327365747079.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new H1785888784825263132(i4909713222951731791));
        return i4909713222951731791;
    }
}
