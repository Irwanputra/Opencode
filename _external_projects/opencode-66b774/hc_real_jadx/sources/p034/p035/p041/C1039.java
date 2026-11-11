package p034.p035.p041;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1039 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static Field f5452;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Field f5453;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static Field f5454;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean f5455;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Field f5457;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static Field f5458;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static boolean f5460;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Object f5456 = new Object();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final Object f5459 = new Object();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static Bundle[] m2371(C1051[] c1051Arr) {
        if (c1051Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c1051Arr.length];
        for (int i = 0; i < c1051Arr.length; i++) {
            C1051 c1051 = c1051Arr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", c1051.f5494);
            bundle.putCharSequence("label", c1051.f5491);
            bundle.putCharSequenceArray("choices", c1051.f5493);
            bundle.putBoolean("allowFreeFormInput", c1051.f5497);
            bundle.putBundle("extras", c1051.f5496);
            Set<String> set = c1051.f5492;
            if (set != null && !set.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static boolean m2372() {
        if (f5460) {
            return false;
        }
        try {
            if (f5457 == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f5458 = cls.getDeclaredField("icon");
                f5454 = cls.getDeclaredField("title");
                f5452 = cls.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                f5457 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused) {
            f5460 = true;
        }
        return true ^ f5460;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static NotificationCompat.C0145 m2373(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        C1051[] c1051Arr;
        C1051[] c1051Arr2;
        boolean z;
        if (bundle != null) {
            c1051Arr = m2374(m2376(bundle, "android.support.remoteInputs"));
            c1051Arr2 = m2374(m2376(bundle, "android.support.dataRemoteInputs"));
            z = bundle.getBoolean("android.support.allowGeneratedReplies");
        } else {
            c1051Arr = null;
            c1051Arr2 = null;
            z = false;
        }
        return new NotificationCompat.C0145(i, charSequence, pendingIntent, bundle, c1051Arr, c1051Arr2, z, 0, true, false);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1051[] m2374(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        C1051[] c1051Arr = new C1051[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            c1051Arr[i] = new C1051(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return c1051Arr;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static SparseArray<Bundle> m2375(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Bundle[] m2376(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static Bundle m2377(Notification notification) {
        synchronized (f5456) {
            if (f5455) {
                return null;
            }
            try {
                if (f5453 == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f5455 = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f5453 = declaredField;
                }
                Bundle bundle = (Bundle) f5453.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f5453.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f5455 = true;
                return null;
            }
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Object[] m2378(Notification notification) {
        synchronized (f5459) {
            if (!m2372()) {
                return null;
            }
            try {
                return (Object[]) f5457.get(notification);
            } catch (IllegalAccessException unused) {
                f5460 = true;
                return null;
            }
        }
    }
}
