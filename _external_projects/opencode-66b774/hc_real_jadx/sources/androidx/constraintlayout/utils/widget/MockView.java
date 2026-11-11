package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MockView extends View {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Rect f819;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Paint f820;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String f821;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f822;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Paint f823;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f824;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f825;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f826;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Paint f827;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f828;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f829;

    public MockView(Context context) {
        super(context);
        this.f820 = new Paint();
        this.f823 = new Paint();
        this.f827 = new Paint();
        this.f824 = true;
        this.f826 = true;
        this.f821 = null;
        this.f819 = new Rect();
        this.f828 = Color.argb(Base64.BASELENGTH, 0, 0, 0);
        this.f822 = Color.argb(Base64.BASELENGTH, 200, 200, 200);
        this.f829 = Color.argb(Base64.BASELENGTH, 50, 50, 50);
        this.f825 = 4;
        m295(context, null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f820 = new Paint();
        this.f823 = new Paint();
        this.f827 = new Paint();
        this.f824 = true;
        this.f826 = true;
        this.f821 = null;
        this.f819 = new Rect();
        this.f828 = Color.argb(Base64.BASELENGTH, 0, 0, 0);
        this.f822 = Color.argb(Base64.BASELENGTH, 200, 200, 200);
        this.f829 = Color.argb(Base64.BASELENGTH, 50, 50, 50);
        this.f825 = 4;
        m295(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f820 = new Paint();
        this.f823 = new Paint();
        this.f827 = new Paint();
        this.f824 = true;
        this.f826 = true;
        this.f821 = null;
        this.f819 = new Rect();
        this.f828 = Color.argb(Base64.BASELENGTH, 0, 0, 0);
        this.f822 = Color.argb(Base64.BASELENGTH, 200, 200, 200);
        this.f829 = Color.argb(Base64.BASELENGTH, 50, 50, 50);
        this.f825 = 4;
        m295(context, attributeSet);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f824) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f820);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f820);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f820);
            canvas.drawLine(f, 0.0f, f, f2, this.f820);
            canvas.drawLine(f, f2, 0.0f, f2, this.f820);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f820);
        }
        String str = this.f821;
        if (str == null || !this.f826) {
            return;
        }
        this.f823.getTextBounds(str, 0, str.length(), this.f819);
        float width2 = (width - this.f819.width()) / 2.0f;
        float height2 = ((height - this.f819.height()) / 2.0f) + this.f819.height();
        this.f819.offset((int) width2, (int) height2);
        Rect rect = this.f819;
        int i = rect.left;
        int i2 = this.f825;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.f819, this.f827);
        canvas.drawText(this.f821, width2, height2, this.f823);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m295(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.MockView_mock_label) {
                    this.f821 = obtainStyledAttributes.getString(index);
                } else if (index == C1575.MockView_mock_showDiagonals) {
                    this.f824 = obtainStyledAttributes.getBoolean(index, this.f824);
                } else if (index == C1575.MockView_mock_diagonalsColor) {
                    this.f828 = obtainStyledAttributes.getColor(index, this.f828);
                } else if (index == C1575.MockView_mock_labelBackgroundColor) {
                    this.f829 = obtainStyledAttributes.getColor(index, this.f829);
                } else if (index == C1575.MockView_mock_labelColor) {
                    this.f822 = obtainStyledAttributes.getColor(index, this.f822);
                } else if (index == C1575.MockView_mock_showLabel) {
                    this.f826 = obtainStyledAttributes.getBoolean(index, this.f826);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f821 == null) {
            try {
                this.f821 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f820.setColor(this.f828);
        this.f820.setAntiAlias(true);
        this.f823.setColor(this.f822);
        this.f823.setAntiAlias(true);
        this.f827.setColor(this.f829);
        this.f825 = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f825);
    }
}
