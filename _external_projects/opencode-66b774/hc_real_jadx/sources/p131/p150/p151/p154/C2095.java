package p131.p150.p151.p154;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.balsikandar.crashreporter.ui.CrashReporterActivity;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p034.p035.p043.C1067;
import p131.p150.p151.C2078;
import p131.p150.p151.C2079;
import p131.p150.p151.C2084;
import p131.p150.p151.C2085;

/* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.ぺふねづ〺.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2095 implements Thread.UncaughtExceptionHandler {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Thread.UncaughtExceptionHandler f8897 = Thread.getDefaultUncaughtExceptionHandler();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        int i = C2094.f8896;
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()) + "_crash.txt";
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        String m4173 = TextUtils.isEmpty(null) ? C2094.m4173() : null;
        File file = new File(m4173);
        if (!file.exists() || !file.isDirectory()) {
            m4173 = C2094.m4173();
            String str2 = "Path provided doesn't exists : " + file + "\nSaving crash report at : " + C2094.m4173();
        }
        for (File file2 : file.listFiles()) {
            file2.delete();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(m4173 + File.separator + str));
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception unused) {
        }
        String localizedMessage = th.getLocalizedMessage();
        if (C2085.f8887 == null) {
            try {
                throw new C2093("Initialize CrashReporter : call CrashReporter.initialize(context, crashReportPath)");
            } catch (Exception unused2) {
            }
        }
        Context context = C2085.f8887;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("crashreporter_channel_id", context.getString(C2079.notification_crash_report_title), 3);
            notificationChannel.setDescription("");
            notificationManager.createNotificationChannel(notificationChannel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "crashreporter_channel_id");
        builder.setSmallIcon(C2084.ic_warning_black_24dp);
        Intent flags = new Intent(C2085.f8887, (Class<?>) CrashReporterActivity.class).setFlags(268468224);
        flags.putExtra("landing", true);
        flags.setAction(Long.toString(System.currentTimeMillis()));
        builder.setContentIntent(PendingIntent.getActivity(context, 0, flags, 0));
        builder.setContentTitle(context.getString(C2079.view_crash_report));
        if (TextUtils.isEmpty(localizedMessage)) {
            localizedMessage = context.getString(C2079.check_your_message_here);
        }
        builder.setContentText(localizedMessage);
        builder.setAutoCancel(true);
        builder.setColor(C1067.m2405(context, C2078.colorAccent_CrashReporter));
        notificationManager.notify(1, builder.build());
        this.f8897.uncaughtException(thread, th);
    }
}
