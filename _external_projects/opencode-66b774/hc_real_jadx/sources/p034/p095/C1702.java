package p034.p095;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: づざかべべ.は〲ぱなで.ぉひのべい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1702 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1703 f7842;

    /* renamed from: づざかべべ.は〲ぱなで.ぉひのべい$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1703 extends ViewGroup {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ViewGroup f7843;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public View f7844;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C1702 f7845;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f7846;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ArrayList<Drawable> f7847;

        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public C1703(Context context, ViewGroup viewGroup, View view, C1702 c1702) {
            super(context);
            this.f7847 = null;
            this.f7843 = viewGroup;
            this.f7844 = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f7845 = c1702;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f7843.getLocationOnScreen(new int[2]);
            this.f7844.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f7844.getWidth(), this.f7844.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f7847;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f7847.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f7843 == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f7843;
            if (!(viewGroup instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            this.f7844.getLocationOnScreen(iArr3);
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
            return super.verifyDrawable(drawable) || ((arrayList = this.f7847) != null && arrayList.contains(drawable));
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m3755() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f7847;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f7846 = true;
                    this.f7843.removeView(this);
                }
            }
        }
    }

    public C1702(Context context, ViewGroup viewGroup, View view) {
        this.f7842 = new C1703(context, viewGroup, view, this);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1702 m3754(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        while (true) {
            if (view2 == null) {
                viewGroup = null;
                break;
            }
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                viewGroup = (ViewGroup) view2;
                break;
            }
            if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C1703) {
                return ((C1703) childAt).f7845;
            }
        }
        return new C1732(viewGroup.getContext(), viewGroup, view);
    }
}
