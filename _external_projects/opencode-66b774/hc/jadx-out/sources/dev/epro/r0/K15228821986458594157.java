package dev.epro.r0;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K15228821986458594157 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ E3889562084885881810 b;

    public /* synthetic */ K15228821986458594157(E3889562084885881810 e3889562084885881810, byte b) {
        this.a = b;
        this.b = e3889562084885881810;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        E3889562084885881810 e3889562084885881810 = this.b;
        switch (b) {
            case 0:
                e3889562084885881810.q = (F4096073349764486348) obj;
                return o9245300239821758723;
            case 1:
                Y633750919412282388 y633750919412282388 = (Y633750919412282388) obj;
                S7974369370986781936 s7974369370986781936 = y633750919412282388 instanceof S7974369370986781936 ? (S7974369370986781936) y633750919412282388 : null;
                if (s7974369370986781936 != null) {
                    s7974369370986781936.getAndroidViewsHandler$ui().removeViewInLayout(e3889562084885881810);
                    V12319504402545346730.r(s7974369370986781936.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(s7974369370986781936.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(e3889562084885881810));
                    e3889562084885881810.setImportantForAccessibility(0);
                }
                e3889562084885881810.removeAllViewsInLayout();
                return o9245300239821758723;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = e3889562084885881810.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = e3889562084885881810.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
