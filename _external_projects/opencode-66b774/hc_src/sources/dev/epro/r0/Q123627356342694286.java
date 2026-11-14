package dev.epro.r0;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q123627356342694286 implements View.OnTouchListener {
    public final /* synthetic */ M10701816181309613444 a;

    public Q123627356342694286(M10701816181309613444 m10701816181309613444) {
        this.a = m10701816181309613444;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        M10701816181309613444 m10701816181309613444 = this.a;
        O1721407113567964106 o1721407113567964106 = m10701816181309613444.r;
        Handler handler = m10701816181309613444.v;
        F6594473573882211675 f6594473573882211675 = m10701816181309613444.z;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && f6594473573882211675 != null && f6594473573882211675.isShowing() && x >= 0 && x < f6594473573882211675.getWidth() && y >= 0 && y < f6594473573882211675.getHeight()) {
            handler.postDelayed(o1721407113567964106, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(o1721407113567964106);
        return false;
    }
}
