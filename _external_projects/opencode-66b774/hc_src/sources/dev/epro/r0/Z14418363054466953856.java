package dev.epro.r0;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z14418363054466953856 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ L17198367453683279477 a;

    public Z14418363054466953856(L17198367453683279477 l17198367453683279477) {
        this.a = l17198367453683279477;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        L17198367453683279477 l17198367453683279477 = this.a;
        U15792790160341789301 u15792790160341789301 = l17198367453683279477.a;
        if (!l17198367453683279477.c) {
            int i = l17198367453683279477.b;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((D10236220797215130727) u15792790160341789301.b.getFocusOwner()).h(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((D10236220797215130727) u15792790160341789301.b.getFocusOwner()).h(f2 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
