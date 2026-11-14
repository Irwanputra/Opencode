package ads_mobile_sdk;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import dev.epro.r0.G7713175901684004489;
import dev.epro.r0.W1307410158614224409;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class wx1 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final jp0 a;
    public final WeakReference b;

    public wx1(jp0 jp0Var, WeakReference weakReference) {
        jp0Var.getClass();
        this.a = jp0Var;
        this.b = weakReference;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wx1.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        motionEvent.getClass();
        jp0 jp0Var = this.a;
        jp0Var.e();
        W1307410158614224409 w1307410158614224409 = (W1307410158614224409) jp0Var.c.get();
        if (w1307410158614224409 == null) {
            return false;
        }
        kz2 kz2Var = jp0Var.n;
        mi3 mi3Var = jp0Var.f62o;
        zv1 zv1Var = jp0Var.l;
        ew1 ew1Var = (ew1) w1307410158614224409;
        FrameLayout c = ew1Var.c();
        Map b = ew1Var.b();
        ImageView.ScaleType e = ew1Var.e();
        if (e == null) {
            e = ImageView.ScaleType.CENTER_INSIDE;
        }
        vv1 c2 = G7713175901684004489.c(kz2Var, mi3Var, zv1Var, c, b, e);
        String a = jp0Var.a((View) jp0Var.f.get(), ew1Var.b());
        jp0.a(jp0Var, ew1Var.c(), c2, a, jp0Var.l.a(a, jp0Var.E, jp0Var.D), 48);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }
}
