package dev.epro.r0;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N16051260170022852138 extends WindowInsetsAnimation$Callback {
    public final F3160751278268780235 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public N16051260170022852138(F3160751278268780235 f3160751278268780235) {
        super(f3160751278268780235.a);
        this.d = new HashMap();
        this.a = f3160751278268780235;
    }

    public final Q12598757537405990809 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        Q12598757537405990809 q12598757537405990809 = (Q12598757537405990809) map.get(windowInsetsAnimation);
        if (q12598757537405990809 != null) {
            return q12598757537405990809;
        }
        Q12598757537405990809 q125987575374059908092 = new Q12598757537405990809(0, null, 0L);
        q125987575374059908092.a = new F994825664896018988(windowInsetsAnimation);
        map.put(windowInsetsAnimation, q125987575374059908092);
        return q125987575374059908092;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = I2796715180830478750.j(list.get(size));
            Q12598757537405990809 q12598757537405990809A = a(windowInsetsAnimationJ);
            q12598757537405990809A.a.e(windowInsetsAnimationJ.getFraction());
            this.c.add(q12598757537405990809A);
        }
        return this.a.f(N3121440022506799205.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        V10300877997588547986 v10300877997588547986G = this.a.g(a(windowInsetsAnimation), new V10300877997588547986(bounds));
        v10300877997588547986G.getClass();
        Q10109392975126564544.n();
        return Q10109392975126564544.i(((Z1975157152518754667) v10300877997588547986G.b).d(), ((Z1975157152518754667) v10300877997588547986G.c).d());
    }
}
