package p034.p065.p066;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1389 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f6561;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6562;

    public RunnableC1389(C1412 c1412, ArrayList arrayList) {
        this.f6562 = c1412;
        this.f6561 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f6561.iterator();
        while (it.hasNext()) {
            RecyclerView.AbstractC0207 abstractC0207 = (RecyclerView.AbstractC0207) it.next();
            C1412 c1412 = this.f6562;
            c1412.getClass();
            View view = abstractC0207.f1476;
            ViewPropertyAnimator animate = view.animate();
            c1412.f6653.add(abstractC0207);
            animate.alpha(1.0f).setDuration(c1412.f1558).setListener(new C1371(c1412, abstractC0207, view, animate)).start();
        }
        this.f6561.clear();
        this.f6562.f6655.remove(this.f6561);
    }
}
