package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A3453968838033651878 extends androidx.appcompat.widget.ContentFrameLayout {
    public final /* synthetic */ dev.epro.r0.L9687083612725928934 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3453968838033651878(dev.epro.r0.L9687083612725928934 l9687083612725928934, dev.epro.r0.H16785758874348248089 h16785758874348248089) {
        super(h16785758874348248089);
        this.i = l9687083612725928934;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.i.s(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                dev.epro.r0.L9687083612725928934 l9687083612725928934 = this.i;
                l9687083612725928934.q(l9687083612725928934.x(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(dev.epro.r0.M9216324016624295870.G(getContext(), i));
    }
}
