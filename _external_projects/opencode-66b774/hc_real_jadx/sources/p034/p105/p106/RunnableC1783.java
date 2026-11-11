package p034.p105.p106;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1783 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8022;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Map f8023;

    public RunnableC1783(AbstractC1787 abstractC1787, ArrayList arrayList, Map map) {
        this.f8022 = arrayList;
        this.f8023 = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f8022.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f8022.get(i);
            String m2497 = C1096.m2497(view);
            if (m2497 != null) {
                Iterator it = this.f8023.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (m2497.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                C1096.m2498(view, str);
            }
        }
    }
}
