package dev.epro.r0;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
@E9219781366349246739("activity")
public class V14103802012446701729 extends E4135271276212975889 {
    public final Activity c;

    public V14103802012446701729(Context context) {
        Object next;
        context.getClass();
        Iterator it = T2881242016550624223.D(context, new M14716691558468128220((byte) 6)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.c = (Activity) next;
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final V7801742040189616406 c(V7801742040189616406 v7801742040189616406) {
        throw new IllegalStateException(G6547577305291411977.o(((U11255333181154900556) v7801742040189616406).b.a, "Destination ", " does not have an Intent set.").toString());
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
