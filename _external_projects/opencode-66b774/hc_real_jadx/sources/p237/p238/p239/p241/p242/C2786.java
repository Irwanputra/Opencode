package p237.p238.p239.p241.p242;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.C0726;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034.p035.C1122;
import p034.p035.p038.C1010;
import p034.p035.p038.p039.C1014;
import p034.p035.p038.p039.C1017;
import p034.p035.p038.p039.InterfaceC1013;
import p034.p035.p038.p039.InterfaceC1015;
import p034.p035.p040.C1026;
import p034.p035.p043.p044.C1062;
import p034.p035.p043.p044.C1064;
import p034.p035.p043.p044.C1066;
import p034.p035.p043.p044.InterfaceC1058;
import p034.p035.p047.ActionModeCallbackC1131;
import p034.p035.p047.InterfaceC1129;
import p034.p035.p049.C1134;
import p034.p050.p053.InterfaceC1221;
import p034.p050.p053.ViewOnLongClickListenerC1255;
import p034.p065.p066.AbstractC1385;
import p034.p086.p087.p088.C1515;
import p034.p086.p087.p088.C1517;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.C1546;
import p034.p086.p087.p088.p089.C1540;
import p131.p155.p156.p157.C2098;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2786 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static boolean f10430;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static boolean f10431;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static boolean f10432;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static Field f10433;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static boolean f10434;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static boolean f10435;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static boolean f10436;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static Field f10437;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static Field f10438;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static Method f10439;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Class<?> f10440;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Field f10441;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static boolean f10442;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static Method f10443;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static boolean f10444;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Field f10445;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static boolean f10446;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static boolean f10447;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static boolean f10448;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static boolean f10449;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static Method f10450;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static Field f10451;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static Field f10452;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static boolean f10453;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static Field f10454;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static boolean f10455;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static Method f10456;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static Method f10457;

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public static Drawable m4758(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof InterfaceC1015) ? new C1017(drawable) : drawable : !(drawable instanceof InterfaceC1015) ? new C1014(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public static <T extends Drawable> T m4759(Drawable drawable) {
        return drawable instanceof InterfaceC1013 ? (T) ((InterfaceC1013) drawable).mo2356() : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public static void m4760(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof InterfaceC1129) {
            ((InterfaceC1129) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public static ByteBuffer m4761(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } finally {
                try {
                    openFileDescriptor.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static int m4762(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public static List<List<byte[]>> m4763(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m4832(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m4832(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public static void m4764(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        ViewOnLongClickListenerC1255 viewOnLongClickListenerC1255 = ViewOnLongClickListenerC1255.f6144;
        if (viewOnLongClickListenerC1255 != null && viewOnLongClickListenerC1255.f6146 == view) {
            ViewOnLongClickListenerC1255.m2903(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC1255(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1255 viewOnLongClickListenerC12552 = ViewOnLongClickListenerC1255.f6143;
        if (viewOnLongClickListenerC12552 != null && viewOnLongClickListenerC12552.f6146 == view) {
            viewOnLongClickListenerC12552.m2904();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d1, code lost:
    
        if (r3[r17].f6999.f7000 == r9) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        if (r4[r2].f6999.f7000 == r5) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x071d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x075b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0778 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0708 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4765(p034.p086.p087.p088.C1520 r37, p034.p086.p087.C1558 r38, java.util.ArrayList<p034.p086.p087.p088.C1544> r39, int r40) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p237.p238.p239.p241.p242.C2786.m4765(づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.づざかべべ, づざかべべ.なぎぱいぢぎ.〺つふすそ.びぐびあび, java.util.ArrayList, int):void");
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static int m4766(TextView textView) {
        int i;
        Field field;
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        Field field2 = null;
        if (!f10449) {
            try {
                field = TextView.class.getDeclaredField("mMaxMode");
                try {
                    field.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
            } catch (NoSuchFieldException unused2) {
                field = null;
            }
            f10452 = field;
            f10449 = true;
        }
        Field field3 = f10452;
        if (field3 == null) {
            return -1;
        }
        try {
            i = field3.getInt(textView);
        } catch (IllegalAccessException unused3) {
            field3.getName();
            i = -1;
        }
        if (i != 1) {
            return -1;
        }
        if (!f10435) {
            try {
                field2 = TextView.class.getDeclaredField("mMaximum");
                field2.setAccessible(true);
            } catch (NoSuchFieldException unused4) {
            }
            f10437 = field2;
            f10435 = true;
        }
        Field field4 = f10437;
        if (field4 == null) {
            return -1;
        }
        try {
            return field4.getInt(textView);
        } catch (IllegalAccessException unused5) {
            field4.getName();
            return -1;
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static C1010[] m4767(C1010[] c1010Arr) {
        if (c1010Arr == null) {
            return null;
        }
        C1010[] c1010Arr2 = new C1010[c1010Arr.length];
        for (int i = 0; i < c1010Arr.length; i++) {
            c1010Arr2[i] = new C1010(c1010Arr[i]);
        }
        return c1010Arr2;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static boolean m4768(C1010[] c1010Arr, C1010[] c1010Arr2) {
        if (c1010Arr == null || c1010Arr2 == null || c1010Arr.length != c1010Arr2.length) {
            return false;
        }
        for (int i = 0; i < c1010Arr.length; i++) {
            if (c1010Arr[i].f5386 != c1010Arr2[i].f5386 || c1010Arr[i].f5385.length != c1010Arr2[i].f5385.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public static void m4769(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (i >= 21) {
            if (!f10432) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f10454 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f10432 = true;
            }
            Field field = f10454;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public static boolean m4770(C1544.EnumC1545 enumC1545, C1544.EnumC1545 enumC15452, C1544.EnumC1545 enumC15453, C1544.EnumC1545 enumC15454) {
        C1544.EnumC1545 enumC15455 = C1544.EnumC1545.MATCH_PARENT;
        C1544.EnumC1545 enumC15456 = C1544.EnumC1545.WRAP_CONTENT;
        C1544.EnumC1545 enumC15457 = C1544.EnumC1545.FIXED;
        return (enumC15453 == enumC15457 || enumC15453 == enumC15456 || (enumC15453 == enumC15455 && enumC1545 != enumC15456)) || (enumC15454 == enumC15457 || enumC15454 == enumC15456 || (enumC15454 == enumC15455 && enumC15452 != enumC15456));
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static Intent m4771(Context context, ComponentName componentName) {
        String m4811 = m4811(context, componentName);
        if (m4811 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m4811);
        return m4811(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static int m4772(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i = Build.VERSION.SDK_INT;
            String permissionToOp = i >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            return (i >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) : 1) != 0 ? -2 : 0;
        }
        return -1;
    }

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public static ActionMode.Callback m4773(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC1131)) ? callback : new ActionModeCallbackC1131(callback, textView);
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public static void m4774(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static int m4775(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static C1540 m4776(C1544 c1544, int i, ArrayList<C1540> arrayList, C1540 c1540) {
        C1517 c1517;
        int i2;
        int i3 = i == 0 ? c1544.f7223 : c1544.f7215;
        if (i3 != -1 && (c1540 == null || i3 != c1540.f7146)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C1540 c15402 = arrayList.get(i4);
                if (c15402.f7146 == i3) {
                    if (c1540 != null) {
                        c1540.m3403(i, c15402);
                        arrayList.remove(c1540);
                    }
                    c1540 = c15402;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c1540;
        }
        if (c1540 == null) {
            if (c1544 instanceof C1546) {
                C1546 c1546 = (C1546) c1544;
                int i5 = 0;
                while (true) {
                    if (i5 >= c1546.f7242) {
                        i2 = -1;
                        break;
                    }
                    C1544 c15442 = c1546.f7243[i5];
                    if ((i == 0 && (i2 = c15442.f7223) != -1) || (i == 1 && (i2 = c15442.f7215) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C1540 c15403 = arrayList.get(i6);
                        if (c15403.f7146 == i2) {
                            c1540 = c15403;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c1540 == null) {
                c1540 = new C1540(i);
            }
            arrayList.add(c1540);
        }
        if (c1540.m3402(c1544)) {
            if (c1544 instanceof C1515) {
                C1515 c1515 = (C1515) c1544;
                c1515.f6991.m3327(c1515.f6989 == 0 ? 1 : 0, arrayList, c1540);
            }
            if (i == 0) {
                c1544.f7223 = c1540.f7146;
                c1544.f7235.m3327(i, arrayList, c1540);
                c1517 = c1544.f7202;
            } else {
                c1544.f7215 = c1540.f7146;
                c1544.f7179.m3327(i, arrayList, c1540);
                c1544.f7189.m3327(i, arrayList, c1540);
                c1517 = c1544.f7228;
            }
            c1517.m3327(i, arrayList, c1540);
            c1544.f7173.m3327(i, arrayList, c1540);
        }
        return c1540;
    }

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public static void m4777(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public static String m4778(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C2098.m4208("?", i);
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static int m4779(RecyclerView.C0224 c0224, AbstractC1385 abstractC1385, View view, View view2, RecyclerView.AbstractC0219 abstractC0219, boolean z) {
        if (abstractC0219.m836() == 0 || c0224.m881() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0224.m881();
        }
        return (int) (((abstractC1385.mo3127(view2) - abstractC1385.mo3133(view)) / (Math.abs(abstractC0219.m857(view) - abstractC0219.m857(view2)) + 1)) * c0224.m881());
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public static File m4780(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder m4207 = C2098.m4207(".font");
        m4207.append(Process.myPid());
        m4207.append("-");
        m4207.append(Process.myTid());
        m4207.append("-");
        String sb = m4207.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, C2098.m4208(sb, i));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static boolean m4781(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? C0726.m1986(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static float[] m4782(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public static boolean m4783(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f10455) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f10450 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f10455 = true;
            }
            Method method = f10450;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception unused2) {
                    f10450 = null;
                }
            }
        }
        return false;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static Drawable[] m4784(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = textView.getLayoutDirection() == 1;
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static int m4785(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static int m4786(RecyclerView.C0224 c0224, AbstractC1385 abstractC1385, View view, View view2, RecyclerView.AbstractC0219 abstractC0219, boolean z, boolean z2) {
        if (abstractC0219.m836() == 0 || c0224.m881() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0224.m881() - Math.max(abstractC0219.m857(view), abstractC0219.m857(view2))) - 1) : Math.max(0, Math.min(abstractC0219.m857(view), abstractC0219.m857(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC1385.mo3127(view2) - abstractC1385.mo3133(view)) / (Math.abs(abstractC0219.m857(view) - abstractC0219.m857(view2)) + 1))) + (abstractC1385.mo3140() - abstractC1385.mo3133(view)));
        }
        return max;
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public static InterfaceC1058 m4787(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (!xmlPullParser.getName().equals("font-family")) {
            m4809(xmlPullParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1122.FontFamily);
        String string = obtainAttributes.getString(C1122.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C1122.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C1122.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C1122.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C1122.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C1122.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m4809(xmlPullParser);
            }
            return new C1064(new C1026(string, string2, string3, m4763(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1122.FontFamilyFont);
                    int i = C1122.FontFamilyFont_fontWeight;
                    if (!obtainAttributes2.hasValue(i)) {
                        i = C1122.FontFamilyFont_android_fontWeight;
                    }
                    int i2 = obtainAttributes2.getInt(i, 400);
                    int i3 = C1122.FontFamilyFont_fontStyle;
                    if (!obtainAttributes2.hasValue(i3)) {
                        i3 = C1122.FontFamilyFont_android_fontStyle;
                    }
                    boolean z = 1 == obtainAttributes2.getInt(i3, 0);
                    int i4 = C1122.FontFamilyFont_ttcIndex;
                    if (!obtainAttributes2.hasValue(i4)) {
                        i4 = C1122.FontFamilyFont_android_ttcIndex;
                    }
                    int i5 = C1122.FontFamilyFont_fontVariationSettings;
                    if (!obtainAttributes2.hasValue(i5)) {
                        i5 = C1122.FontFamilyFont_android_fontVariationSettings;
                    }
                    String string4 = obtainAttributes2.getString(i5);
                    int i6 = obtainAttributes2.getInt(i4, 0);
                    int i7 = C1122.FontFamilyFont_font;
                    if (!obtainAttributes2.hasValue(i7)) {
                        i7 = C1122.FontFamilyFont_android_font;
                    }
                    int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                    String string5 = obtainAttributes2.getString(i7);
                    obtainAttributes2.recycle();
                    while (xmlPullParser.next() != 3) {
                        m4809(xmlPullParser);
                    }
                    arrayList.add(new C1066(string5, i2, z, string4, i6, resourceId2));
                } else {
                    m4809(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1062((C1066[]) arrayList.toArray(new C1066[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public static void m4788(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC1015) {
            ((InterfaceC1015) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public static void m4789(TextView textView, int i) {
        m4762(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = (i2 < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public static void m4790(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (i < 17) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable5 = z ? drawable3 : drawable;
        if (!z) {
            drawable = drawable3;
        }
        textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public static InputConnection m4791(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC1221) {
                    editorInfo.hintText = ((InterfaceC1221) parent).m2828();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean m4792(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public static int m4793(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i2));
        }
        height = (rect.height() / 2) + rect.top;
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i2));
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static int m4794(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public static String m4795(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4796(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public static boolean m4797(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static ColorStateList m4798(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m4800(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public static int m4799(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r8.hasValue(r12) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList m4800(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p237.p238.p239.p241.p242.C2786.m4800(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static boolean m4801(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m4823 = m4823(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return m4823;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public static void m4802(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC1015) {
            ((InterfaceC1015) drawable).setTintMode(mode);
        }
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public static void m4803(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static Drawable m4804(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f10442) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f10451 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10442 = true;
        }
        Field field = f10451;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f10451 = null;
            }
        }
        return null;
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public static void m4805(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public static void m4806(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC1015) {
            ((InterfaceC1015) drawable).setTint(i);
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static int m4807(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f10436) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f10439 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f10436 = true;
            }
            Method method = f10439;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    f10439 = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public static String m4808(MotionLayout motionLayout, int i) {
        return i == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i);
    }

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public static void m4809(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean m4810(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public static String m4811(Context context, ComponentName componentName) {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        if (i >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static int m4812(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:
    
        if (r13 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: NumberFormatException -> 0x00ba, LOOP:3: B:29:0x006d->B:40:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:40:0x0098, B:44:0x009d, B:49:0x00ad, B:61:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7 A[SYNTHETIC] */
    /* renamed from: でどあくず, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p034.p035.p038.C1010[] m4813(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p237.p238.p239.p241.p242.C2786.m4813(java.lang.String):づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.くし〴〺ぅ[]");
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static void m4814(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f10444) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f10438 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10444 = true;
        }
        Field field = f10438;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                String str = "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.";
            }
        }
    }

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public static void m4815(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m4814(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m4814(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static Intent m4816(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        try {
            String m4811 = m4811(activity, activity.getComponentName());
            if (m4811 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m4811);
            try {
                return m4811(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m4817(Object obj, StringBuilder sb) {
        String hexString;
        int lastIndexOf;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static void m4818(Object obj) {
        if (!f10453) {
            try {
                f10440 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f10453 = true;
        }
        Class<?> cls = f10440;
        if (cls == null) {
            return;
        }
        if (!f10448) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f10445 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f10448 = true;
        }
        Field field = f10445;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public static void m4819(TextView textView, int i) {
        m4762(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public static int m4820(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public static void m4821(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static void m4822(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable mo2356;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 || i < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            mo2356 = ((InsetDrawable) drawable).getDrawable();
        } else {
            if (!(drawable instanceof InterfaceC1013)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        m4822(child);
                    }
                }
                return;
            }
            mo2356 = ((InterfaceC1013) drawable).mo2356();
        }
        m4822(mo2356);
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static boolean m4823(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public static void m4824(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r10 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r4 != false) goto L35;
     */
    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p034.p035.p049.C1134.C1135 m4825(android.widget.TextView r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.くし〴〺ぅ$げつ〴ぬぐ r0 = new づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.くし〴〺ぅ$げつ〴ぬぐ
            android.text.PrecomputedText$Params r10 = r10.getTextMetricsParams()
            r0.<init>(r10)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r10.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 23
            r6 = 1
            if (r3 < r5) goto L24
            r7 = 1
            r8 = 1
            goto L26
        L24:
            r7 = 0
            r8 = 0
        L26:
            r9 = 18
            if (r3 < r9) goto L2d
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L2e
        L2d:
            r3 = 0
        L2e:
            if (r0 < r5) goto L38
            int r7 = r10.getBreakStrategy()
            int r8 = r10.getHyphenationFrequency()
        L38:
            if (r0 < r9) goto L8c
            android.text.method.TransformationMethod r3 = r10.getTransformationMethod()
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod
            if (r3 == 0) goto L46
        L42:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.LTR
        L44:
            r3 = r10
            goto L8c
        L46:
            if (r0 < r1) goto L6d
            int r0 = r10.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L6d
            java.util.Locale r10 = r10.getTextLocale()
            android.icu.text.DecimalFormatSymbols r10 = android.icu.text.DecimalFormatSymbols.getInstance(r10)
            java.lang.String[] r10 = r10.getDigitStrings()
            r10 = r10[r4]
            int r10 = r10.codePointAt(r4)
            byte r10 = java.lang.Character.getDirectionality(r10)
            if (r10 == r6) goto L86
            r0 = 2
            if (r10 != r0) goto L42
            goto L86
        L6d:
            int r0 = r10.getLayoutDirection()
            if (r0 != r6) goto L74
            r4 = 1
        L74:
            int r10 = r10.getTextDirection()
            switch(r10) {
                case 2: goto L89;
                case 3: goto L42;
                case 4: goto L86;
                case 5: goto L83;
                case 6: goto L80;
                case 7: goto L7d;
                default: goto L7b;
            }
        L7b:
            if (r4 == 0) goto L80
        L7d:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L44
        L80:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L44
        L83:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.LOCALE
            goto L44
        L86:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.RTL
            goto L44
        L89:
            android.text.TextDirectionHeuristic r10 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L44
        L8c:
            づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.くし〴〺ぅ$げつ〴ぬぐ r10 = new づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.くし〴〺ぅ$げつ〴ぬぐ
            r10.<init>(r2, r3, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p237.p238.p239.p241.p242.C2786.m4825(android.widget.TextView):づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.くし〴〺ぅ$げつ〴ぬぐ");
    }

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public static void m4826(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f10447) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f10443 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f10447 = true;
        }
        Method method = f10443;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static C1540 m4827(ArrayList<C1540> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1540 c1540 = arrayList.get(i2);
            if (i == c1540.f7146) {
                return c1540;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m4828(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m4810(r9, r10, r11)
            boolean r1 = m4810(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = 1
            goto L46
        L45:
            r7 = 0
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = m4820(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = 1
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p237.p238.p239.p241.p242.C2786.m4828(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public static void m4829(TextView textView, int i) {
        m4762(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static Path m4830(String str) {
        Path path = new Path();
        C1010[] m4813 = m4813(str);
        if (m4813 == null) {
            return null;
        }
        try {
            C1010.m2348(m4813, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(C2098.m4205("Error in parsing ", str), e);
        }
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static String m4831() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder m4207 = C2098.m4207(".(");
        m4207.append(stackTraceElement.getFileName());
        m4207.append(":");
        m4207.append(stackTraceElement.getLineNumber());
        m4207.append(")");
        return m4207.toString();
    }

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public static List<byte[]> m4832(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public static void m4833(TextView textView, C1134 c1134) {
        if (Build.VERSION.SDK_INT >= 29) {
            c1134.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        C1134.C1135 m4825 = m4825(textView);
        c1134.getClass();
        if (!m4825.m2569(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(c1134);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static int m4834(RecyclerView.C0224 c0224, AbstractC1385 abstractC1385, View view, View view2, RecyclerView.AbstractC0219 abstractC0219, boolean z) {
        if (abstractC0219.m836() == 0 || c0224.m881() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0219.m857(view) - abstractC0219.m857(view2)) + 1;
        }
        return Math.min(abstractC1385.mo3134(), abstractC1385.mo3127(view2) - abstractC1385.mo3133(view));
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public static void m4835(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static <T> T m4836(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public static boolean m4837(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static ColorStateList m4838(CompoundButton compoundButton) {
        return Build.VERSION.SDK_INT >= 21 ? compoundButton.getButtonTintList() : ((InterfaceC1129) compoundButton).getSupportButtonTintList();
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static float m4839(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }
}
