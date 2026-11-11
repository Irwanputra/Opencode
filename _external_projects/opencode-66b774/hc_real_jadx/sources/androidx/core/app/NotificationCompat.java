package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;
import p034.p035.C1003;
import p034.p035.p041.C1039;
import p034.p035.p041.C1051;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public ArrayList<C0145> mActions;
        public boolean mAllowSystemGeneratedContextualActions;
        public int mBadgeIcon;
        public RemoteViews mBigContentView;
        public C0146 mBubbleMetadata;
        public String mCategory;
        public String mChannelId;
        public boolean mChronometerCountDown;
        public int mColor;
        public boolean mColorized;
        public boolean mColorizedSet;
        public CharSequence mContentInfo;
        public PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public RemoteViews mContentView;
        public Context mContext;
        public Bundle mExtras;
        public PendingIntent mFullScreenIntent;
        public int mGroupAlertBehavior;
        public String mGroupKey;
        public boolean mGroupSummary;
        public RemoteViews mHeadsUpContentView;
        public ArrayList<C0145> mInvisibleActions;
        public Bitmap mLargeIcon;
        public boolean mLocalOnly;
        public Notification mNotification;
        public int mNumber;

        @Deprecated
        public ArrayList<String> mPeople;
        public int mPriority;
        public int mProgress;
        public boolean mProgressIndeterminate;
        public int mProgressMax;
        public Notification mPublicVersion;
        public CharSequence[] mRemoteInputHistory;
        public String mShortcutId;
        public boolean mShowWhen;
        public boolean mSilent;
        public String mSortKey;
        public AbstractC0148 mStyle;
        public CharSequence mSubText;
        public RemoteViews mTickerView;
        public long mTimeout;
        public boolean mUseChronometer;
        public int mVisibility;

        @Deprecated
        public Builder(Context context) {
            this(context, null);
        }

        public Builder(Context context, String str) {
            this.mActions = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        public static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > MAX_CHARSEQUENCE_LENGTH) ? charSequence.subSequence(0, MAX_CHARSEQUENCE_LENGTH) : charSequence;
        }

        private Bitmap reduceLargeIconSize(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C1003.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C1003.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = dimensionPixelSize;
            double max = Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = dimensionPixelSize2;
            double max2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * min);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
        }

        private void setFlag(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.mNotification;
                i2 = i | notification.flags;
            } else {
                notification = this.mNotification;
                i2 = (i ^ (-1)) & notification.flags;
            }
            notification.flags = i2;
        }

        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mActions.add(new C0145(i, charSequence, pendingIntent));
            return this;
        }

        public Builder addAction(C0145 c0145) {
            this.mActions.add(c0145);
            return this;
        }

        public Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public Builder addInvisibleAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return addInvisibleAction(new C0145(i, charSequence, pendingIntent));
        }

        public Builder addInvisibleAction(C0145 c0145) {
            this.mInvisibleActions.add(c0145);
            return this;
        }

        public Builder addPerson(String str) {
            this.mPeople.add(str);
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0161, code lost:
        
            r3.bigContentView = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x015f, code lost:
        
            if (r4 != null) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0051, code lost:
        
            if (r0.f5465 == 1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
        
            r0.m2379(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x009b, code lost:
        
            if (r0.f5465 == 1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x00e0, code lost:
        
            if (r0.f5465 == 1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x010f, code lost:
        
            if (r4 != null) goto L102;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.app.Notification build() {
            /*
                Method dump skipped, instructions count: 401
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Builder.build():android.app.Notification");
        }

        public Builder extend(InterfaceC0149 interfaceC0149) {
            interfaceC0149.m384(this);
            return this;
        }

        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        public C0146 getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        public int getColor() {
            return this.mColor;
        }

        public RemoteViews getContentView() {
            return this.mContentView;
        }

        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @Deprecated
        public Notification getNotification() {
            return build();
        }

        public int getPriority() {
            return this.mPriority;
        }

        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        public Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        public Builder setBadgeIconType(int i) {
            this.mBadgeIcon = i;
            return this;
        }

        public Builder setBubbleMetadata(C0146 c0146) {
            this.mBubbleMetadata = c0146;
            return this;
        }

        public Builder setCategory(String str) {
            this.mCategory = str;
            return this;
        }

        public Builder setChannelId(String str) {
            this.mChannelId = str;
            return this;
        }

        public Builder setChronometerCountDown(boolean z) {
            this.mChronometerCountDown = z;
            this.mExtras.putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        public Builder setColor(int i) {
            this.mColor = i;
            return this;
        }

        public Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setContent(RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        public Builder setContentInfo(CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        public Builder setCustomContentView(RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        public Builder setDefaults(int i) {
            Notification notification = this.mNotification;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(NotificationCompat.FLAG_HIGH_PRIORITY, z);
            return this;
        }

        public Builder setGroup(String str) {
            this.mGroupKey = str;
            return this;
        }

        public Builder setGroupAlertBehavior(int i) {
            this.mGroupAlertBehavior = i;
            return this;
        }

        public Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = reduceLargeIconSize(bitmap);
            return this;
        }

        public Builder setLights(int i, int i2, int i3) {
            Notification notification = this.mNotification;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        public Builder setNumber(int i) {
            this.mNumber = i;
            return this;
        }

        public Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        public Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        public Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        public Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        public Builder setPublicVersion(Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        public Builder setShortcutId(String str) {
            this.mShortcutId = str;
            return this;
        }

        public Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        public Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        public Builder setSmallIcon(int i, int i2) {
            Notification notification = this.mNotification;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        public Builder setSortKey(String str) {
            this.mSortKey = str;
            return this;
        }

        public Builder setSound(Uri uri) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public Builder setSound(Uri uri, int i) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = i;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            }
            return this;
        }

        public Builder setStyle(AbstractC0148 abstractC0148) {
            AbstractC0148 abstractC01482 = this.mStyle;
            if (abstractC01482 == abstractC0148 || abstractC01482 == null) {
                return this;
            }
            throw null;
        }

        public Builder setSubText(CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setTicker(CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        public Builder setTimeoutAfter(long j) {
            this.mTimeout = j;
            return this;
        }

        public Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        public Builder setVibrate(long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        public Builder setVisibility(int i) {
            this.mVisibility = i;
            return this;
        }

        public Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$〺つふすそ, reason: contains not printable characters */
    public static class C0145 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final boolean f1025;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public IconCompat f1026;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final int f1027;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public CharSequence f1028;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final C1051[] f1029;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Bundle f1030;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f1031;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f1032;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final C1051[] f1033;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        @Deprecated
        public int f1034;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public PendingIntent f1035;

        public C0145(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m395(null, "", i) : null, charSequence, pendingIntent, new Bundle(), (C1051[]) null, (C1051[]) null, true, 0, true, false);
        }

        public C0145(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1051[] c1051Arr, C1051[] c1051Arr2, boolean z, int i2, boolean z2, boolean z3) {
            this(i != 0 ? IconCompat.m395(null, "", i) : null, charSequence, pendingIntent, bundle, c1051Arr, c1051Arr2, z, i2, z2, z3);
        }

        public C0145(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1051[] c1051Arr, C1051[] c1051Arr2, boolean z, int i, boolean z2, boolean z3) {
            this.f1032 = true;
            this.f1026 = iconCompat;
            if (iconCompat != null && iconCompat.m400() == 2) {
                this.f1034 = iconCompat.m404();
            }
            this.f1028 = Builder.limitCharSequenceLength(charSequence);
            this.f1035 = pendingIntent;
            this.f1030 = bundle == null ? new Bundle() : bundle;
            this.f1029 = c1051Arr;
            this.f1033 = c1051Arr2;
            this.f1031 = z;
            this.f1027 = i;
            this.f1032 = z2;
            this.f1025 = z3;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public IconCompat m383() {
            int i;
            if (this.f1026 == null && (i = this.f1034) != 0) {
                this.f1026 = IconCompat.m395(null, "", i);
            }
            return this.f1026;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$くし〴〺ぅ, reason: contains not printable characters */
    public static final class C0146 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public PendingIntent f1036;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public IconCompat f1037;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public PendingIntent f1038;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1039;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1040;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1041;

        public C0146(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, C0147 c0147) {
            this.f1038 = pendingIntent;
            this.f1037 = iconCompat;
            this.f1041 = i;
            this.f1039 = i2;
            this.f1036 = pendingIntent2;
            this.f1040 = i3;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$づざかべべ, reason: contains not printable characters */
    public static abstract class AbstractC0148 {
    }

    /* renamed from: androidx.core.app.NotificationCompat$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0149 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        Builder m384(Builder builder);
    }

    @Deprecated
    public NotificationCompat() {
    }

    public static C0145 getAction(Notification notification, int i) {
        SparseArray sparseParcelableArray;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            return getActionCompatFromAction(notification.actions[i]);
        }
        C0145 c0145 = null;
        c0145 = null;
        if (i2 >= 19) {
            Notification.Action action = notification.actions[i];
            SparseArray sparseParcelableArray2 = notification.extras.getSparseParcelableArray("android.support.actionExtras");
            return C1039.m2373(action.icon, action.title, action.actionIntent, sparseParcelableArray2 != null ? (Bundle) sparseParcelableArray2.get(i) : null);
        }
        if (i2 < 16) {
            return null;
        }
        synchronized (C1039.f5459) {
            try {
                Object[] m2378 = C1039.m2378(notification);
                if (m2378 != null) {
                    Object obj = m2378[i];
                    Bundle m2377 = C1039.m2377(notification);
                    c0145 = C1039.m2373(C1039.f5458.getInt(obj), (CharSequence) C1039.f5454.get(obj), (PendingIntent) C1039.f5452.get(obj), (m2377 == null || (sparseParcelableArray = m2377.getSparseParcelableArray("android.support.actionExtras")) == null) ? null : (Bundle) sparseParcelableArray.get(i));
                }
            } catch (IllegalAccessException unused) {
                C1039.f5460 = true;
            } finally {
            }
        }
        return c0145;
    }

    public static C0145 getActionCompatFromAction(Notification.Action action) {
        C1051[] c1051Arr;
        int i;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        if (remoteInputs == null) {
            c1051Arr = null;
        } else {
            C1051[] c1051Arr2 = new C1051[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                RemoteInput remoteInput = remoteInputs[i2];
                c1051Arr2[i2] = new C1051(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null);
            }
            c1051Arr = c1051Arr2;
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean z = i3 >= 24 ? action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies() : action.getExtras().getBoolean("android.support.allowGeneratedReplies");
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = i3 >= 28 ? action.getSemanticAction() : action.getExtras().getInt("android.support.action.semanticAction", 0);
        boolean isContextual = i3 >= 29 ? action.isContextual() : false;
        if (i3 < 23) {
            return new C0145(action.icon, action.title, action.actionIntent, action.getExtras(), c1051Arr, (C1051[]) null, z, semanticAction, z2, isContextual);
        }
        if (action.getIcon() == null && (i = action.icon) != 0) {
            return new C0145(i, action.title, action.actionIntent, action.getExtras(), c1051Arr, (C1051[]) null, z, semanticAction, z2, isContextual);
        }
        if (action.getIcon() != null) {
            Icon icon = action.getIcon();
            if (IconCompat.m398(icon) != 2 || IconCompat.m397(icon) != 0) {
                iconCompat = IconCompat.m396(icon);
            }
        }
        return new C0145(iconCompat, action.title, action.actionIntent, action.getExtras(), c1051Arr, (C1051[]) null, z, semanticAction, z2, isContextual);
    }

    public static int getActionCount(Notification notification) {
        int length;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null) {
                return actionArr.length;
            }
            return 0;
        }
        if (i < 16) {
            return 0;
        }
        synchronized (C1039.f5459) {
            Object[] m2378 = C1039.m2378(notification);
            length = m2378 != null ? m2378.length : 0;
        }
        return length;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    public static int getBadgeIconType(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    public static C0146 getBubbleMetadata(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 29 || (bubbleMetadata = notification.getBubbleMetadata()) == null) {
            return null;
        }
        boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        PendingIntent deleteIntent = bubbleMetadata.getDeleteIntent();
        IconCompat m396 = IconCompat.m396(bubbleMetadata.getIcon());
        if (m396.m400() == 1) {
            throw new IllegalArgumentException("When using bitmap based icons, Bubbles require TYPE_ADAPTIVE_BITMAP, please use IconCompat#createWithAdaptiveBitmap instead");
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        if (intent == null) {
            throw new IllegalArgumentException("Bubble requires non-null pending intent");
        }
        int i3 = bubbleMetadata.isNotificationSuppressed() ? (autoExpandBubble ? 1 : 0) | 2 : (autoExpandBubble ? 1 : 0) & (-3);
        int max = bubbleMetadata.getDesiredHeight() != 0 ? Math.max(bubbleMetadata.getDesiredHeight(), 0) : 0;
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            i2 = bubbleMetadata.getDesiredHeightResId();
            i = 0;
        } else {
            i = max;
            i2 = 0;
        }
        return new C0146(intent, deleteIntent, m396, i, i2, i3, null);
    }

    public static String getCategory(Notification notification) {
        if (Build.VERSION.SDK_INT >= 21) {
            return notification.category;
        }
        return null;
    }

    public static String getChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    public static Bundle getExtras(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C1039.m2377(notification);
        }
        return null;
    }

    public static String getGroup(Notification notification) {
        Bundle m2377;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getGroup();
        }
        if (i >= 19) {
            m2377 = notification.extras;
        } else {
            if (i < 16) {
                return null;
            }
            m2377 = C1039.m2377(notification);
        }
        return m2377.getString("android.support.groupKey");
    }

    public static int getGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    public static List<C0145> getInvisibleActions(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                Bundle bundle3 = bundle.getBundle(Integer.toString(i));
                Object obj = C1039.f5456;
                Bundle bundle4 = bundle3.getBundle("extras");
                arrayList.add(new C0145(bundle3.getInt("icon"), bundle3.getCharSequence("title"), (PendingIntent) bundle3.getParcelable("actionIntent"), bundle3.getBundle("extras"), C1039.m2374(C1039.m2376(bundle3, "remoteInputs")), C1039.m2374(C1039.m2376(bundle3, "dataOnlyRemoteInputs")), bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        Bundle m2377;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return (notification.flags & FLAG_LOCAL_ONLY) != 0;
        }
        if (i >= 19) {
            m2377 = notification.extras;
        } else {
            if (i < 16) {
                return false;
            }
            m2377 = C1039.m2377(notification);
        }
        return m2377.getBoolean("android.support.localOnly");
    }

    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static String getShortcutId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static String getSortKey(Notification notification) {
        Bundle m2377;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return notification.getSortKey();
        }
        if (i >= 19) {
            m2377 = notification.extras;
        } else {
            if (i < 16) {
                return null;
            }
            m2377 = C1039.m2377(notification);
        }
        return m2377.getString("android.support.sortKey");
    }

    public static long getTimeoutAfter(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0L;
    }

    public static boolean isGroupSummary(Notification notification) {
        Bundle m2377;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            return (notification.flags & 512) != 0;
        }
        if (i >= 19) {
            m2377 = notification.extras;
        } else {
            if (i < 16) {
                return false;
            }
            m2377 = C1039.m2377(notification);
        }
        return m2377.getBoolean("android.support.isGroupSummary");
    }
}
