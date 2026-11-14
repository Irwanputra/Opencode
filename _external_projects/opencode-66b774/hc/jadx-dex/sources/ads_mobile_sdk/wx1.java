package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wx1 implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {
    public final ads_mobile_sdk.jp0 a;
    public final java.lang.ref.WeakReference b;

    public wx1(ads_mobile_sdk.jp0 jp0Var, java.lang.ref.WeakReference weakReference) {
        jp0Var.getClass();
        this.a = jp0Var;
        this.b = weakReference;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wx1.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        ads_mobile_sdk.jp0 jp0Var = this.a;
        jp0Var.e();
        dev.epro.r0.W1307410158614224409 w1307410158614224409 = (dev.epro.r0.W1307410158614224409) jp0Var.c.get();
        if (w1307410158614224409 == null) {
            return false;
        }
        ads_mobile_sdk.kz2 kz2Var = jp0Var.n;
        ads_mobile_sdk.mi3 mi3Var = jp0Var.f62o;
        ads_mobile_sdk.zv1 zv1Var = jp0Var.l;
        ads_mobile_sdk.ew1 ew1Var = (ads_mobile_sdk.ew1) w1307410158614224409;
        android.widget.FrameLayout frameLayoutC = ew1Var.c();
        java.util.Map mapB = ew1Var.b();
        android.widget.ImageView.ScaleType scaleTypeE = ew1Var.e();
        if (scaleTypeE == null) {
            scaleTypeE = android.widget.ImageView.ScaleType.CENTER_INSIDE;
        }
        ads_mobile_sdk.vv1 vv1VarC = dev.epro.r0.G7713175901684004489.c(kz2Var, mi3Var, zv1Var, frameLayoutC, mapB, scaleTypeE);
        java.lang.String strA = jp0Var.a((android.view.View) jp0Var.f.get(), ew1Var.b());
        ads_mobile_sdk.jp0.a(jp0Var, ew1Var.c(), vv1VarC, strA, jp0Var.l.a(strA, jp0Var.E, jp0Var.D), 48);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }
}
