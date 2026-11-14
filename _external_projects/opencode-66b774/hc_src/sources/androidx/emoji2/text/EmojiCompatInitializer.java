package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import dev.epro.r0.C5307487432222052365;
import dev.epro.r0.D3638978315442423989;
import dev.epro.r0.I4293432593871965076;
import dev.epro.r0.Q7316561721656982910;
import dev.epro.r0.R3192876217964974737;
import dev.epro.r0.R4576572296217797762;
import dev.epro.r0.U9296548531947164180;
import dev.epro.r0.X17355325846973801304;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements R4576572296217797762 {
    @Override // dev.epro.r0.R4576572296217797762
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // dev.epro.r0.R4576572296217797762
    public final Object b(Context context) {
        Object obj;
        X17355325846973801304 x17355325846973801304 = new X17355325846973801304(new U9296548531947164180(context));
        x17355325846973801304.b = true;
        if (D3638978315442423989.k == null) {
            synchronized (D3638978315442423989.j) {
                try {
                    if (D3638978315442423989.k == null) {
                        D3638978315442423989.k = new D3638978315442423989(x17355325846973801304);
                    }
                } finally {
                }
            }
        }
        Q7316561721656982910 D = Q7316561721656982910.D(context);
        D.getClass();
        synchronized (Q7316561721656982910.f) {
            try {
                obj = ((HashMap) D.b).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = D.x(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        R3192876217964974737 j = ((I4293432593871965076) obj).j();
        j.a(new C5307487432222052365(this, j));
        return Boolean.TRUE;
    }
}
