package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Runnable f1065;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Runnable f1066;

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0153 implements Runnable {
        public RunnableC0153() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar.this.getClass();
            ContentLoadingProgressBar.this.getClass();
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            System.currentTimeMillis();
            contentLoadingProgressBar.getClass();
            ContentLoadingProgressBar.this.setVisibility(0);
        }
    }

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0154 implements Runnable {
        public RunnableC0154() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentLoadingProgressBar.this.getClass();
            ContentLoadingProgressBar.this.getClass();
            ContentLoadingProgressBar.this.setVisibility(8);
        }
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1065 = new RunnableC0154();
        this.f1066 = new RunnableC0153();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f1065);
        removeCallbacks(this.f1066);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1065);
        removeCallbacks(this.f1066);
    }
}
