package p131.p161.p162.p163.p185;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2265 implements InterfaceC2285 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2266 f9448;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.てぜきぽく$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2266 extends ViewGroup {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ViewGroup f9449;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public View f9450;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C2265 f9451;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f9452;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ArrayList<Drawable> f9453;

        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public C2266(Context context, ViewGroup viewGroup, View view, C2265 c2265) {
            super(context);
            this.f9453 = null;
            this.f9449 = viewGroup;
            this.f9450 = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f9451 = c2265;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f9449.getLocationOnScreen(new int[2]);
            this.f9450.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f9450.getWidth(), this.f9450.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f9453;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f9453.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f9449 == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f9449;
            if (viewGroup == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            this.f9450.getLocationOnScreen(iArr3);
            int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
            rect.offset(iArr4[0], iArr4[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f9453) != null && arrayList.contains(drawable));
        }
    }

    public C2265(Context context, ViewGroup viewGroup, View view) {
        this.f9448 = new C2266(context, viewGroup, view, this);
    }

    @Override // p131.p161.p162.p163.p185.InterfaceC2285
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo4436(Drawable drawable) {
        C2266 c2266 = this.f9448;
        ArrayList<Drawable> arrayList = c2266.f9453;
        if (arrayList != null) {
            arrayList.remove(drawable);
            c2266.invalidate(drawable.getBounds());
            drawable.setCallback(null);
            if (c2266.getChildCount() == 0) {
                ArrayList<Drawable> arrayList2 = c2266.f9453;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    c2266.f9452 = true;
                    c2266.f9449.removeView(c2266);
                }
            }
        }
    }

    @Override // p131.p161.p162.p163.p185.InterfaceC2285
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo4437(Drawable drawable) {
        C2266 c2266 = this.f9448;
        if (c2266.f9452) {
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }
        if (c2266.f9453 == null) {
            c2266.f9453 = new ArrayList<>();
        }
        if (c2266.f9453.contains(drawable)) {
            return;
        }
        c2266.f9453.add(drawable);
        c2266.invalidate(drawable.getBounds());
        drawable.setCallback(c2266);
    }
}
