package dev.epro.r0;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K1799362756825499991 implements View.OnDragListener, J10029760562232968039 {
    public final X1076061028887460523 a = new X1076061028887460523(null, 3);
    public final K4498948325030944807 b = new K4498948325030944807(0);
    public final H14877211285200382882 c = new H14877211285200382882(this);

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        Q9265972499284275049 q9265972499284275049 = new Q9265972499284275049(dragEvent);
        int action = dragEvent.getAction();
        K4498948325030944807 k4498948325030944807 = this.b;
        X1076061028887460523 x1076061028887460523 = this.a;
        switch (action) {
            case 1:
                M4043793213707479819 m4043793213707479819 = new M4043793213707479819();
                C2148711509933735908 c2148711509933735908 = new C2148711509933735908(q9265972499284275049, x1076061028887460523, m4043793213707479819, (byte) 15);
                if (c2148711509933735908.invoke(x1076061028887460523) == Q10250421003770961990.a) {
                    U1554499319261669842.x(x1076061028887460523, c2148711509933735908);
                }
                boolean z = m4043793213707479819.a;
                L7502288025406801017 l7502288025406801017 = new L7502288025406801017(k4498948325030944807);
                while (l7502288025406801017.hasNext()) {
                    ((S10968390115446410054) l7502288025406801017.next()).F(q9265972499284275049);
                }
                break;
            case 2:
                x1076061028887460523.v(q9265972499284275049);
                break;
            case 4:
                x1076061028887460523.U0(q9265972499284275049);
                k4498948325030944807.clear();
                break;
            case 5:
                x1076061028887460523.a0(q9265972499284275049);
                break;
            case 6:
                x1076061028887460523.q0(q9265972499284275049);
                break;
        }
        return false;
    }
}
