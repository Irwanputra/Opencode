package p034.p050.p053;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p034.p050.C1147;
import p034.p050.C1268;
import p034.p050.C1288;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.けときぜと, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1220 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final View f6020;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int[] f6021;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final TextView f6022;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f6023;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Rect f6024;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int[] f6025;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final WindowManager.LayoutParams f6026;

    public C1220(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f6026 = layoutParams;
        this.f6024 = new Rect();
        this.f6025 = new int[2];
        this.f6021 = new int[2];
        this.f6023 = context;
        View inflate = LayoutInflater.from(context).inflate(C1147.abc_tooltip, (ViewGroup) null);
        this.f6020 = inflate;
        this.f6022 = (TextView) inflate.findViewById(C1268.message);
        layoutParams.setTitle(C1220.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1288.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2827() {
        if (this.f6020.getParent() != null) {
            ((WindowManager) this.f6023.getSystemService("window")).removeView(this.f6020);
        }
    }
}
