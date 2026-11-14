package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.N831923027797546281;
import dev.epro.r0.Q16850748603044648552;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class r6 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ r6(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public void a(View view) {
        if (((N831923027797546281) this.b) == null) {
            this.b = new N831923027797546281();
            view.getViewTreeObserver().addOnWindowFocusChangeListener((N831923027797546281) this.b);
            if (view.hasWindowFocus()) {
                p72.a();
                i6 i6Var = i6.d;
                boolean a = i6Var.a();
                if (i6Var.b != a) {
                    i6Var.b = a;
                    if (i6Var.a) {
                        i6Var.a(a);
                        Q16850748603044648552 q16850748603044648552 = i6Var.c;
                        if (q16850748603044648552 != null) {
                            q16850748603044648552.a(a);
                        }
                    }
                }
            }
        }
    }

    public void a(a62 a62Var) {
        a62Var.a = this;
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        arrayDeque.add(a62Var);
        if (((a62) this.c) == null) {
            a62 a62Var2 = (a62) arrayDeque.poll();
            this.c = a62Var2;
            if (a62Var2 != null) {
                a62Var2.executeOnExecutor((ThreadPoolExecutor) this.a, new Object[0]);
            }
        }
    }
}
