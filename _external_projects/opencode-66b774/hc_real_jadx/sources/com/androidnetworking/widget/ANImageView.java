package com.androidnetworking.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p131.p135.p138.C1990;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ANImageView extends AppCompatImageView {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1990.C1995 f1998;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f1999;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2000;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f2001;

    /* renamed from: com.androidnetworking.widget.ANImageView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0331 implements C1990.InterfaceC1994 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ boolean f2003;

        /* renamed from: com.androidnetworking.widget.ANImageView$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC0332 implements Runnable {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ C1990.C1995 f2004;

            public RunnableC0332(C1990.C1995 c1995) {
                this.f2004 = c1995;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0331.this.m1108(this.f2004, false);
            }
        }

        public C0331(boolean z) {
            this.f2003 = z;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m1108(C1990.C1995 c1995, boolean z) {
            if (z && this.f2003) {
                ANImageView.this.post(new RunnableC0332(c1995));
                return;
            }
            Bitmap bitmap = c1995.f8706;
            if (bitmap != null) {
                ANImageView.this.setImageBitmap(bitmap);
                return;
            }
            ANImageView aNImageView = ANImageView.this;
            int i = aNImageView.f1999;
            if (i != 0) {
                aNImageView.setImageResource(i);
            }
        }
    }

    public ANImageView(Context context) {
        this(context, null);
    }

    public ANImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ANImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        C1990.C1995 c1995 = this.f1998;
        if (c1995 != null) {
            c1995.m4106();
            setImageBitmap(null);
            this.f1998 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m1107(true);
    }

    public void setDefaultImageResId(int i) {
        this.f1999 = i;
    }

    public void setErrorImageResId(int i) {
        this.f2000 = i;
    }

    public void setImageUrl(String str) {
        this.f2001 = str;
        m1107(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1107(boolean r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidnetworking.widget.ANImageView.m1107(boolean):void");
    }
}
