package p034.p050.p060;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p034.p080.C1493;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1309 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object[] f6320 = new Object[2];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Class<?>[] f6316 = {Context.class, AttributeSet.class};

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final int[] f6317 = {R.attr.onClick};

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final String[] f6319 = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C1493<String, Constructor<? extends View>> f6318 = new C1493<>();

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ごづごきえ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class ViewOnClickListenerC1310 implements View.OnClickListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final View f6321;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final String f6322;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Context f6323;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Method f6324;

        public ViewOnClickListenerC1310(View view, String str) {
            this.f6321 = view;
            this.f6322 = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String sb;
            Method method;
            if (this.f6324 == null) {
                Context context = this.f6321.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f6322, View.class)) != null) {
                            this.f6324 = method;
                            this.f6323 = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f6321.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder m4207 = C2098.m4207(" with id '");
                    m4207.append(this.f6321.getContext().getResources().getResourceEntryName(id));
                    m4207.append("'");
                    sb = m4207.toString();
                }
                StringBuilder m42072 = C2098.m4207("Could not find method ");
                m42072.append(this.f6322);
                m42072.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                m42072.append(this.f6321.getClass());
                m42072.append(sb);
                throw new IllegalStateException(m42072.toString());
            }
            try {
                this.f6324.invoke(this.f6323, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m2962(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: 〺つふすそ */
    public AppCompatButton mo1547(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final View m2963(Context context, String str, String str2) {
        String str3;
        C1493<String, Constructor<? extends View>> c1493 = f6318;
        Constructor<? extends View> orDefault = c1493.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6316);
            c1493.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f6320);
    }

    /* renamed from: くし〴〺ぅ */
    public AppCompatCheckBox mo1548(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: げつ〴ぬぐ */
    public AppCompatAutoCompleteTextView mo1549(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: づざかべべ */
    public AppCompatTextView mo1550(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public View m2964() {
        return null;
    }

    /* renamed from: びぐびあび */
    public AppCompatRadioButton mo1551(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }
}
