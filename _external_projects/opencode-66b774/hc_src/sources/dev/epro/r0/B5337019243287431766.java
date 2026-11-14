package dev.epro.r0;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class B5337019243287431766 {
    public static final S6976414540931251790 a = B14824868959299866349.p;

    public static final boolean a(Y1086209215650239921 y1086209215650239921) {
        MotionEvent a2;
        List list = y1086209215650239921.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((N13196868278329319633) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = y1086209215650239921.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = y1086209215650239921.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
