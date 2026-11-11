package p034.p050.p060;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p050.C1264;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceC1343 extends DialogC1317 implements DialogInterface {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final AlertController f6450;

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ぺぁあねじ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1344 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f6451;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final AlertController.C0038 f6452;

        public C1344(Context context) {
            this(context, DialogInterfaceC1343.m3027(context, 0));
        }

        public C1344(Context context, int i) {
            this.f6452 = new AlertController.C0038(new ContextThemeWrapper(context, DialogInterfaceC1343.m3027(context, i)));
            this.f6451 = i;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1344 m3029(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0038 c0038 = this.f6452;
            c0038.f176 = charSequence;
            c0038.f163 = onClickListener;
            return this;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1344 m3030(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0038 c0038 = this.f6452;
            c0038.f162 = charSequence;
            c0038.f160 = onClickListener;
            return this;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public DialogInterfaceC1343 m3031() {
            DialogInterfaceC1343 dialogInterfaceC1343 = new DialogInterfaceC1343(this.f6452.f168, this.f6451);
            AlertController.C0038 c0038 = this.f6452;
            AlertController alertController = dialogInterfaceC1343.f6450;
            View view = c0038.f170;
            if (view != null) {
                alertController.f127 = view;
            } else {
                CharSequence charSequence = c0038.f174;
                if (charSequence != null) {
                    alertController.f140 = charSequence;
                    TextView textView = alertController.f137;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = c0038.f167;
                if (drawable != null) {
                    alertController.f144 = drawable;
                    alertController.f147 = 0;
                    ImageView imageView = alertController.f121;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f121.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = c0038.f172;
            if (charSequence2 != null) {
                alertController.f146 = charSequence2;
                TextView textView2 = alertController.f156;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = c0038.f162;
            if (charSequence3 != null) {
                alertController.m70(-1, charSequence3, c0038.f160, null, null);
            }
            CharSequence charSequence4 = c0038.f176;
            if (charSequence4 != null) {
                alertController.m70(-2, charSequence4, c0038.f163, null, null);
            }
            if (c0038.f175 != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0038.f161.inflate(alertController.f116, (ViewGroup) null);
                int i = c0038.f165 ? alertController.f132 : alertController.f145;
                ListAdapter listAdapter = c0038.f175;
                if (listAdapter == null) {
                    listAdapter = new AlertController.C0041(c0038.f168, i, R.id.text1, null);
                }
                alertController.f138 = listAdapter;
                alertController.f153 = c0038.f169;
                if (c0038.f166 != null) {
                    recycleListView.setOnItemClickListener(new C1289(c0038, alertController));
                }
                if (c0038.f165) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f118 = recycleListView;
            }
            View view2 = c0038.f164;
            if (view2 != null) {
                alertController.f114 = view2;
                alertController.f155 = 0;
                alertController.f154 = false;
            }
            dialogInterfaceC1343.setCancelable(this.f6452.f177);
            if (this.f6452.f177) {
                dialogInterfaceC1343.setCanceledOnTouchOutside(true);
            }
            this.f6452.getClass();
            dialogInterfaceC1343.setOnCancelListener(null);
            dialogInterfaceC1343.setOnDismissListener(this.f6452.f171);
            DialogInterface.OnKeyListener onKeyListener = this.f6452.f173;
            if (onKeyListener != null) {
                dialogInterfaceC1343.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC1343;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public DialogInterfaceC1343 m3032() {
            DialogInterfaceC1343 m3031 = m3031();
            m3031.show();
            return m3031;
        }
    }

    public DialogInterfaceC1343(Context context, int i) {
        super(context, m3027(context, i));
        this.f6450 = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static int m3027(Context context, int i) {
        if (((i >>> 24) & Base64.BASELENGTH) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1264.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0325, code lost:
    
        if (r7 != null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e5, code lost:
    
        r3.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e3, code lost:
    
        if (r3 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02da, code lost:
    
        if (r3 != null) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.p050.p060.DialogC1317, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.DialogInterfaceC1343.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6450.f150;
        if (nestedScrollView != null && nestedScrollView.m414(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6450.f150;
        if (nestedScrollView != null && nestedScrollView.m414(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p034.p050.p060.DialogC1317, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f6450;
        alertController.f140 = charSequence;
        TextView textView = alertController.f137;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Button m3028(int i) {
        AlertController alertController = this.f6450;
        alertController.getClass();
        if (i == -3) {
            return alertController.f152;
        }
        if (i == -2) {
            return alertController.f149;
        }
        if (i != -1) {
            return null;
        }
        return alertController.f129;
    }
}
