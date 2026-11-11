package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p050.C1145;
import p034.p050.C1147;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1195;
import p034.p050.p053.C1260;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1195.InterfaceC1196, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ImageView f195;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1197 f196;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public TextView f197;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public LinearLayout f198;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f199;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public LayoutInflater f200;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Drawable f201;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ImageView f202;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f203;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public TextView f204;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f205;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public CheckBox f206;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Context f207;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public RadioButton f208;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f209;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ImageView f210;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Drawable f211;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1260 m2910 = C1260.m2910(getContext(), attributeSet, C1148.MenuView, i, 0);
        this.f211 = m2910.m2913(C1148.MenuView_android_itemBackground);
        this.f205 = m2910.m2922(C1148.MenuView_android_itemTextAppearance, -1);
        this.f209 = m2910.m2918(C1148.MenuView_preserveIconSpacing, false);
        this.f207 = context;
        this.f201 = m2910.m2913(C1148.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C1264.dropDownListViewStyle, 0);
        this.f199 = obtainStyledAttributes.hasValue(0);
        m2910.f6162.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f200 == null) {
            this.f200 = LayoutInflater.from(getContext());
        }
        return this.f200;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f195;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f210;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f210.getLayoutParams();
        rect.top = this.f210.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    public C1197 getItemData() {
        return this.f196;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f211;
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
        TextView textView = (TextView) findViewById(C1268.title);
        this.f204 = textView;
        int i = this.f205;
        if (i != -1) {
            textView.setTextAppearance(this.f207, i);
        }
        this.f197 = (TextView) findViewById(C1268.shortcut);
        ImageView imageView = (ImageView) findViewById(C1268.submenuarrow);
        this.f195 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f201);
        }
        this.f210 = (ImageView) findViewById(C1268.group_divider);
        this.f198 = (LinearLayout) findViewById(C1268.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f202 != null && this.f209) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f202.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f208 == null && this.f206 == null) {
            return;
        }
        if (this.f196.m2662()) {
            if (this.f208 == null) {
                m93();
            }
            compoundButton = this.f208;
            compoundButton2 = this.f206;
        } else {
            if (this.f206 == null) {
                m94();
            }
            compoundButton = this.f206;
            compoundButton2 = this.f208;
        }
        if (z) {
            compoundButton.setChecked(this.f196.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f206;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f208;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f196.m2662()) {
            if (this.f208 == null) {
                m93();
            }
            compoundButton = this.f208;
        } else {
            if (this.f206 == null) {
                m94();
            }
            compoundButton = this.f206;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f203 = z;
        this.f209 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f210;
        if (imageView != null) {
            imageView.setVisibility((this.f199 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f196.f5937.getClass();
        boolean z = this.f203;
        if (z || this.f209) {
            ImageView imageView = this.f202;
            if (imageView == null && drawable == null && !this.f209) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C1147.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f202 = imageView2;
                LinearLayout linearLayout = this.f198;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f209) {
                this.f202.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f202;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f202.getVisibility() != 0) {
                this.f202.setVisibility(0);
            }
        }
    }

    public void setShortcut(boolean z, char c) {
        int i;
        String sb;
        int i2 = (z && this.f196.m2670()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.f197;
            C1197 c1197 = this.f196;
            char m2665 = c1197.m2665();
            if (m2665 == 0) {
                sb = "";
            } else {
                Resources resources = c1197.f5937.f5774.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(c1197.f5937.f5774).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(C1145.abc_prepend_shortcut_label));
                }
                int i3 = c1197.f5937.mo2635() ? c1197.f5939 : c1197.f5938;
                C1197.m2661(sb2, i3, 65536, resources.getString(C1145.abc_menu_meta_shortcut_label));
                C1197.m2661(sb2, i3, NotificationCompat.FLAG_BUBBLE, resources.getString(C1145.abc_menu_ctrl_shortcut_label));
                C1197.m2661(sb2, i3, 2, resources.getString(C1145.abc_menu_alt_shortcut_label));
                C1197.m2661(sb2, i3, 1, resources.getString(C1145.abc_menu_shift_shortcut_label));
                C1197.m2661(sb2, i3, 4, resources.getString(C1145.abc_menu_sym_shortcut_label));
                C1197.m2661(sb2, i3, 8, resources.getString(C1145.abc_menu_function_shortcut_label));
                if (m2665 == '\b') {
                    i = C1145.abc_menu_delete_shortcut_label;
                } else if (m2665 == '\n') {
                    i = C1145.abc_menu_enter_shortcut_label;
                } else if (m2665 != ' ') {
                    sb2.append(m2665);
                    sb = sb2.toString();
                } else {
                    i = C1145.abc_menu_space_shortcut_label;
                }
                sb2.append(resources.getString(i));
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f197.getVisibility() != i2) {
            this.f197.setVisibility(i2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f204.setText(charSequence);
            if (this.f204.getVisibility() == 0) {
                return;
            }
            textView = this.f204;
            i = 0;
        } else {
            i = 8;
            if (this.f204.getVisibility() == 8) {
                return;
            } else {
                textView = this.f204;
            }
        }
        textView.setVisibility(i);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m93() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C1147.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f208 = radioButton;
        LinearLayout linearLayout = this.f198;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m94() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C1147.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f206 = checkBox;
        LinearLayout linearLayout = this.f198;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    /* renamed from: びぐびあび */
    public void mo88(C1197 c1197, int i) {
        this.f196 = c1197;
        setVisibility(c1197.isVisible() ? 0 : 8);
        setTitle(c1197.f5926);
        setCheckable(c1197.isCheckable());
        setShortcut(c1197.m2670(), c1197.m2665());
        setIcon(c1197.getIcon());
        setEnabled(c1197.isEnabled());
        setSubMenuArrowVisible(c1197.hasSubMenu());
        setContentDescription(c1197.f5919);
    }
}
