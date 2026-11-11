package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.p060.DialogC1317;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AlertController {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public View f114;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final DialogC1317 f115;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public int f116;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public CharSequence f117;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ListView f118;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public boolean f119;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f120;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public ImageView f121;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public Drawable f122;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public int f123;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public CharSequence f124;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public Message f125;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Message f126;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public View f127;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public int f128;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Button f129;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Window f130;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public int f131;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public int f132;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f133;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public CharSequence f134;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public Message f135;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Drawable f136;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public TextView f137;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public ListAdapter f138;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public CharSequence f140;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public Handler f141;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f142;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Drawable f143;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public Drawable f144;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public int f145;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public CharSequence f146;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f148;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Button f149;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public NestedScrollView f150;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f151;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public Button f152;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f155;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public TextView f156;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f157;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f154 = false;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f147 = 0;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int f153 = -1;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public final View.OnClickListener f139 = new ViewOnClickListenerC0040();

    public static class RecycleListView extends ListView {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f158;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f159;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.RecycleListView);
            this.f159 = obtainStyledAttributes.getDimensionPixelOffset(C1148.RecycleListView_paddingBottomNoButtons, -1);
            this.f158 = obtainStyledAttributes.getDimensionPixelOffset(C1148.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f158, getPaddingRight(), z2 ? getPaddingBottom() : this.f159);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$〺つふすそ, reason: contains not printable characters */
    public static class C0038 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f160;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final LayoutInflater f161;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public CharSequence f162;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f163;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public View f164;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public boolean f165;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public DialogInterface.OnClickListener f166;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Drawable f167;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Context f168;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public View f170;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public DialogInterface.OnDismissListener f171;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public CharSequence f172;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public DialogInterface.OnKeyListener f173;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public CharSequence f174;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public ListAdapter f175;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public CharSequence f176;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public int f169 = -1;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f177 = true;

        public C0038(Context context) {
            this.f168 = context;
            this.f161 = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$くし〴〺ぅ, reason: contains not printable characters */
    public static final class HandlerC0039 extends Handler {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public WeakReference<DialogInterface> f178;

        public HandlerC0039(DialogInterface dialogInterface) {
            this.f178 = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f178.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0040 implements View.OnClickListener {
        public ViewOnClickListenerC0040() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f129 || (message2 = alertController.f126) == null) && (view != alertController.f149 || (message2 = alertController.f135) == null)) ? (view != alertController.f152 || (message = alertController.f125) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f141.obtainMessage(1, alertController2.f115).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$びぐびあび, reason: contains not printable characters */
    public static class C0041 extends ArrayAdapter<CharSequence> {
        public C0041(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC1317 dialogC1317, Window window) {
        this.f133 = context;
        this.f115 = dialogC1317;
        this.f130 = window;
        this.f141 = new HandlerC0039(dialogC1317);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1148.AlertDialog, C1264.alertDialogStyle, 0);
        this.f131 = obtainStyledAttributes.getResourceId(C1148.AlertDialog_android_layout, 0);
        this.f128 = obtainStyledAttributes.getResourceId(C1148.AlertDialog_buttonPanelSideLayout, 0);
        this.f116 = obtainStyledAttributes.getResourceId(C1148.AlertDialog_listLayout, 0);
        this.f123 = obtainStyledAttributes.getResourceId(C1148.AlertDialog_multiChoiceItemLayout, 0);
        this.f132 = obtainStyledAttributes.getResourceId(C1148.AlertDialog_singleChoiceItemLayout, 0);
        this.f145 = obtainStyledAttributes.getResourceId(C1148.AlertDialog_listItemLayout, 0);
        this.f119 = obtainStyledAttributes.getBoolean(C1148.AlertDialog_showTitle, true);
        this.f151 = obtainStyledAttributes.getDimensionPixelSize(C1148.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC1317.m2967().mo2992(1);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m67(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m68(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m68(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m69(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m70(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.f141.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f117 = charSequence;
            this.f125 = obtainMessage;
            this.f122 = null;
        } else if (i == -2) {
            this.f134 = charSequence;
            this.f135 = obtainMessage;
            this.f143 = null;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f124 = charSequence;
            this.f126 = obtainMessage;
            this.f136 = null;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final ViewGroup m71(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
