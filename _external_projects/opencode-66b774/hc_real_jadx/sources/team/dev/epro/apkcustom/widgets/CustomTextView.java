package team.dev.epro.apkcustom.widgets;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CustomTextView extends AppCompatTextView {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f4127;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Runnable f4128;

    /* renamed from: team.dev.epro.apkcustom.widgets.CustomTextView$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0564 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f4129;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ TextView.BufferType f4130;

        public RunnableC0564(CharSequence charSequence, TextView.BufferType bufferType) {
            this.f4129 = charSequence;
            this.f4130 = bufferType;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomTextView.this.setText(this.f4129, this.f4130);
        }
    }

    public CustomTextView(Context context) {
        super(context);
        this.f4127 = true;
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4127 = true;
    }

    public CustomTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4127 = true;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f4127) {
            removeCallbacks(this.f4128);
            String charSequence2 = charSequence.toString();
            super.setText(Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(charSequence2, 0) : Html.fromHtml(charSequence2), TextView.BufferType.NORMAL);
        } else {
            super.setText(charSequence, bufferType);
            RunnableC0564 runnableC0564 = new RunnableC0564(charSequence, bufferType);
            this.f4128 = runnableC0564;
            post(runnableC0564);
        }
    }
}
