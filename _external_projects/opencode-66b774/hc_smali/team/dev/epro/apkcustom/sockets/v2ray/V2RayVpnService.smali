.class public Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;
.super Landroid/net/VpnService;
.source ""

# interfaces
.implements Llibv2ray/V2RayVPNServiceSupportsSet;
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final synthetic ぉざぅち〻:I


# instance fields
.field public 〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

.field public 〺つふすそ:Landroid/os/ParcelFileDescriptor;

.field public ぁごぐすすぃ:Landroid/app/NotificationManager;

.field public いいにぽつ:Landroid/os/PowerManager;

.field public ぇぬぎばつ:Ljava/net/HttpURLConnection;

.field public おぐぴう〸ず:Landroid/os/Handler;

.field public くし〴〺ぅ:Llibv2ray/V2RayPoint;

.field public づざかべべ:Ljava/lang/Thread;

.field public てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

.field public なぎぱいぢぎ:Landroid/content/Context;

.field public のぷのちつ:Z

.field public びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

.field public へぬ〴づぞ:Ldev/epro/v2ray/util/GuardProcess;

.field public ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

.field public ぺふねづ〺:Landroid/os/PowerManager$WakeLock;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .registers 10

    iget p1, p1, Landroid/os/Message;->what:I

    const-string v0, "K4l@gkL`jHb9L7oH3lKch\u001dj>\u001a3f\u001cj;Jk"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p1, v2, :cond_a3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_32

    const/4 v0, 0x3

    if-eq p1, v0, :cond_22

    goto/16 :goto_163

    :cond_22
    sput-boolean v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->〺でおいここ:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->けときぜと:Z

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    goto :goto_9b

    :cond_32
    const p1, 0x7f1102d0

    invoke-virtual {p0, p1}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2
    invoke-static {v4, v5, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    const v5, 0x7f110055

    invoke-virtual {p0, v5}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v4, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    const v4, 0x7f0801b1

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->げつ〴ぬぐ()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぁごぐすすぃ:Landroid/app/NotificationManager;

    invoke-virtual {v4, v5, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぁごぐすすぃ:Landroid/app/NotificationManager;

    invoke-virtual {p1, v5}, Landroid/app/NotificationManager;->cancel(I)V

    .line 3
    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    sput-boolean v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->〺でおいここ:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->けときぜと:Z

    .line 4
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 5
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    :goto_9b
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/net/VpnService;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_163

    :cond_a3
    const p1, 0x7f110052

    invoke-virtual {p0, p1}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v4, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    const-string v7, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v7, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v5, 0x7f110058

    invoke-virtual {p0, v5}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0x7f0801ae

    const v4, 0x7f11035c

    invoke-virtual {p0, v4}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, p1, v4, v2}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〺つふすそ(ILjava/lang/String;Z)V

    .line 6
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 7
    invoke-virtual {p0, v5}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, -0x100

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v4, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    sput-boolean v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    sput-boolean v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->〺でおいここ:Z

    sput-boolean v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->けときぜと:Z

    .line 8
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/net/VpnService;->sendBroadcast(Landroid/content/Intent;)V

    .line 10
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_155

    .line 12
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-interface {p1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_163

    :cond_155
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    if-nez p1, :cond_163

    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-direct {p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ()V

    :cond_163
    :goto_163
    return v3
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 3

    new-instance p1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService$げつ〴ぬぐ;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;)V

    return-object p1
.end method

.method public onCreate()V
    .registers 8

    invoke-super {p0}, Landroid/net/VpnService;->onCreate()V

    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    const-string v2, "HfgLdi\u001d4kAfn\u001deh\u001eco\u001dbnNa>\u001a`>\u001c6j\u001ab"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->のぷのちつ:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->おぐぴう〸ず:Landroid/os/Handler;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-direct {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    const-string v0, "\u001ed<\u00197gI4kMkmA4lA`<\u001aao\u001de>Od;\u001e3i\u001aa"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-static {p0}, Llibv2ray/Libv2ray;->newV2RayPoint(Llibv2ray/V2RayVPNServiceSupportsSet;)Llibv2ray/V2RayPoint;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {p0}, Landroid/net/VpnService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->なぎぱいぢぎ:Landroid/content/Context;

    const-string v1, ""

    if-eqz v0, :cond_92

    iget-object v2, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "JdfJgkObh\u001b7:Lb=\u001e4hN3:Nd;Akk\u001af9\u001e1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {v2, v0}, Llibv2ray/V2RayPoint;->setPackageName(Ljava/lang/String;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->なぎぱいぢぎ:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Llibv2ray/V2RayPoint;->setPackageCodePath(Ljava/lang/String;)V

    :cond_92
    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->userAssetPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llibv2ray/Libv2ray;->initV2Env(Ljava/lang/String;)V

    const-string v0, "\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぁごぐすすぃ:Landroid/app/NotificationManager;

    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    const-string v4, "J3k\u001a3h\u001e6jH`gI0i\u001a1hO`>A3hJjiKdf\u0019amMfg\u00191jA`iN`<\u001e0iL6>\u001dbf\u001d3lJ4>\u001abn\u001c"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f110052

    if-lt v2, v3, :cond_ce

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/app/NotificationChannel;

    const/4 v6, 0x2

    invoke-direct {v3, v4, v2, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v3, v1}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 6
    :cond_ce
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v0, p0, v4}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    .line 7
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 8
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_152

    const-string v0, "\u001b`<\u0019ah@fiObfJ4mH`:O1<@bmLj:LdnKe"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->いいにぽつ:Landroid/os/PowerManager;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v5}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u001e6j\u001e6n\u001cfn\u001adhA`:If<\u0019c;A7i\u001ekn\u001a4>\u001dalIkjNc;AenIa>\u001a7l\u001ebj\u001d0:\u001a0<Ibh\u001cbfJ"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぺふねづ〺:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    invoke-virtual {p0, v5}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v3, "Oaf\u001e1kAk>Oan\u001ediN0i\u001dc;HkoJgf\u001bemL4=A`gKg>\u001adfJglOagI3k\u0019el\u0019dmK0i\u00190:\u001b"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->どぇぞほだ(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    :cond_152
    return-void
.end method

.method public onEmitStatus(JLjava/lang/String;)J
    .registers 8

    invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Ij:\u001edmIcmJko\u0019j>\u001c3;K3f\u001c`j@kjJbfL0"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    goto/16 :goto_104

    :cond_16
    invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Jgg\u00191f\u0019`f\u001af;\u001cdj\u001dk=JdnKfmL4oJb=\u001c1"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_104

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 p2, 0x1

    const-string p3, "Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 2
    invoke-interface {p1, p3, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const-string p2, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f110052

    if-eqz p1, :cond_9a

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぺふねづ〺:Landroid/os/PowerManager$WakeLock;

    if-eqz p1, :cond_9a

    :try_start_58
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result p1

    if-eqz p1, :cond_9a

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぺふねづ〺:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, p2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "O0l\u001c`nKgjO3f\u00193;O0=K7g@g=\u001e49Ock@df\u001bjn\u001ea=LdgJ1gMek\u00196:L3=@4:HdoHjoN"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_98
    .catch Ljava/lang/Exception; {:try_start_58 .. :try_end_98} :catch_99

    goto :goto_9a

    :catch_99
    nop

    .line 3
    :cond_9a
    :goto_9a
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_bf

    .line 5
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_c9

    :cond_bf
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    if-eqz p1, :cond_c9

    invoke-virtual {p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ()V

    const/4 p1, 0x0

    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    :cond_c9
    invoke-virtual {p0, v0}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, p2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x7f110059

    invoke-virtual {p0, p2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_104
    :goto_104
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public onRevoke()V
    .registers 4

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "L1oLen\u001dbgL3fNal@fnA4=\u001befI1jOdi\u001dk"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .registers 20

    move-object/from16 v1, p0

    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->おぐぴう〸ず:Landroid/os/Handler;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    const v0, 0x7f110066

    invoke-virtual {v1, v0}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f0801b0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〺つふすそ(ILjava/lang/String;Z)V

    const/4 v0, 0x1

    if-eqz p1, :cond_4a5

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const-string v4, "IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "L1oLen\u001dbgL3fNal@fnA4=\u001befI1jOdi\u001dk"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_481

    .line 1
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    invoke-static {v2, v5, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 3
    iget-object v2, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v2}, Llibv2ray/V2RayPoint;->getIsRunning()Z

    move-result v2

    if-nez v2, :cond_4a5

    .line 4
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 5
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〴ねぷぐくぼ()V

    .line 6
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const-string v5, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v2, :cond_6f

    .line 8
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 9
    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_e5

    .line 10
    :cond_6f
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v6, "Jeo@alI4<\u001aagNb:\u001ejk\u001efjOenI1>\u001ae;\u001aa"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 11
    invoke-static {v2, v6, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 12
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v6, "K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 13
    invoke-static {v2, v6, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 14
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v6, "\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 15
    invoke-static {v2, v6, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 16
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v6, "\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-static {v2, v6, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 18
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v6, "I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 19
    invoke-static {v2, v6, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 20
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v6, "\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 21
    invoke-static {v2, v6, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    iget-object v2, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    if-nez v2, :cond_e5

    new-instance v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-direct {v2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;-><init>()V

    iput-object v2, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_e0

    iget-object v2, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    iget-boolean v2, v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->びぐびあび:Z

    if-nez v2, :cond_e5

    :cond_e0
    iget-object v2, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->のぷのちつ()V

    .line 22
    :cond_e5
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 23
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x2

    aget-object v2, v2, v6

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    const/16 v7, 0x1a

    const-string v8, ""

    if-eqz v2, :cond_112

    .line 24
    :try_start_fe
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 25
    move-object v9, v2

    check-cast v9, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v9

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v7
    :try_end_10f
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_fe .. :try_end_10f} :catch_110

    goto :goto_13b

    :catch_110
    move-object v2, v8

    goto :goto_13b

    .line 26
    :cond_112
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v9, "NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 27
    invoke-interface {v2, v9, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_13b

    .line 28
    :try_start_128
    sget-object v9, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 29
    move-object v10, v9

    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v10

    check-cast v9, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v9, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    aget-object v2, v9, v7
    :try_end_139
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_128 .. :try_end_139} :catch_13a

    goto :goto_13b

    :catch_13a
    nop

    :cond_13b
    :goto_13b
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_151

    .line 30
    sget-object v7, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v9, "Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 31
    invoke-interface {v7, v9, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_151
    :try_start_151
    invoke-static {v2}, Ldev/epro/v2ray/util/V2rayConfigUtil;->isValidConfig(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_39f

    new-instance v7, Ldev/epro/v2ray/util/VmessBean;

    invoke-direct {v7}, Ldev/epro/v2ray/util/VmessBean;-><init>()V

    sget-object v9, Ldev/epro/v2ray/util/EConfigType;->CUSTOM:Ldev/epro/v2ray/util/EConfigType;

    invoke-virtual {v9}, Ldev/epro/v2ray/util/EConfigType;->getValue()I

    move-result v9

    invoke-virtual {v7, v9}, Ldev/epro/v2ray/util/VmessBean;->setConfigType(I)V

    invoke-static {v1, v7, v2}, Ldev/epro/v2ray/util/V2rayConfigUtil;->getV2rayConfig(Landroid/content/Context;Ldev/epro/v2ray/util/VmessBean;Ljava/lang/String;)Ldev/epro/v2ray/util/Result;

    move-result-object v2

    invoke-virtual {v2}, Ldev/epro/v2ray/util/Result;->getContent()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;

    invoke-direct {v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;-><init>()V

    const-class v9, Ljava/lang/Double;

    new-instance v10, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/〺つふすそ;

    invoke-direct {v10, v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;)V

    invoke-virtual {v7, v9, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;->〺つふすそ(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;

    .line 32
    iput-boolean v0, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;->いいにぽつ:Z

    .line 33
    invoke-virtual {v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    move-result-object v7

    const-class v9, Ldev/epro/v2ray/model/V2Ray;

    invoke-virtual {v7, v2, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/model/V2Ray;

    new-instance v9, Ldev/epro/v2ray/model/log/LogObject;

    invoke-direct {v9}, Ldev/epro/v2ray/model/log/LogObject;-><init>()V

    const-string v10, "Kd=Ld<\u001eaiHkf@c;\u001dakOj=L`>HggJbfOc"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ldev/epro/v2ray/model/log/LogObject;->setLoglevel(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ldev/epro/v2ray/model/V2Ray;->setLog(Ldev/epro/v2ray/model/log/LogObject;)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ldev/epro/v2ray/model/V2Ray;->getInbounds()Ljava/util/List;

    move-result-object v10
    :try_end_1a8
    .catch Ljava/lang/Exception; {:try_start_151 .. :try_end_1a8} :catch_3ea

    const-string v11, "\u001b0:O7h\u001c3;HckJc=If=Ke9Jf=KgfK1<\u001cc"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\u001d`nKam\u001bd;Af<M0n\u001bjf\u001e79\u001b4jAek\u001dei\u001dj"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v10, :cond_1e8

    :try_start_1be
    invoke-virtual {v2}, Ldev/epro/v2ray/model/V2Ray;->getInbounds()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v13, 0x0

    :goto_1c7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1e9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ldev/epro/v2ray/model/inbounds/InboundObject;

    invoke-virtual {v14}, Ldev/epro/v2ray/model/inbounds/InboundObject;->getProtocol()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_1e4

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_1e4

    invoke-virtual {v14, v11}, Ldev/epro/v2ray/model/inbounds/InboundObject;->setPort(Ljava/lang/String;)V

    const/4 v13, 0x1

    goto :goto_1c7

    :cond_1e4
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1e7
    .catch Ljava/lang/Exception; {:try_start_1be .. :try_end_1e7} :catch_3ea

    goto :goto_1c7

    :cond_1e8
    const/4 v13, 0x0

    :cond_1e9
    const-string v10, "Hg=L0o@`l\u001a1i@4kL0nHdfA0;@6lK`>@c"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v14, "HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-nez v13, :cond_255

    :try_start_1ff
    new-instance v13, Ldev/epro/v2ray/model/inbounds/InboundObject;

    invoke-direct {v13}, Ldev/epro/v2ray/model/inbounds/InboundObject;-><init>()V

    invoke-virtual {v13, v11}, Ldev/epro/v2ray/model/inbounds/InboundObject;->setPort(Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Ldev/epro/v2ray/model/inbounds/InboundObject;->setListen(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ldev/epro/v2ray/model/inbounds/InboundObject;->setProtocol(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ldev/epro/v2ray/model/inbounds/InboundObject;->setTag(Ljava/lang/String;)V

    new-instance v11, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;

    invoke-direct {v11}, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;-><init>()V

    const-string v12, "\u001e6mKb>\u001dan\u001a1=\u001b1<AjjO1;@ffIai\u001a1nMf"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->setAuth(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->setUdp(Z)V

    const/16 v12, 0x8

    invoke-virtual {v11, v12}, Ldev/epro/v2ray/model/protocols/socks/InboundConfigurationObject;->setUserLevel(I)V

    invoke-virtual {v13, v11}, Ldev/epro/v2ray/model/inbounds/InboundObject;->setSettings(Ljava/lang/Object;)V

    new-instance v11, Ldev/epro/v2ray/model/inbounds/SniffingObject;

    invoke-direct {v11}, Ldev/epro/v2ray/model/inbounds/SniffingObject;-><init>()V

    invoke-virtual {v11, v0}, Ldev/epro/v2ray/model/inbounds/SniffingObject;->setEnabled(Z)V

    new-array v12, v6, [Ljava/lang/String;

    aput-object v10, v12, v3

    const-string v15, "\u001b4mKc;M0jN`:@c>\u001b0g\u001cciK1<\u001d`kJ4:A1"

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    aput-object v15, v12, v0

    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v11, v0}, Ldev/epro/v2ray/model/inbounds/SniffingObject;->setDestOverride(Ljava/util/List;)V

    invoke-virtual {v13, v11}, Ldev/epro/v2ray/model/inbounds/InboundObject;->setSniffing(Ldev/epro/v2ray/model/inbounds/SniffingObject;)V

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v9}, Ldev/epro/v2ray/model/V2Ray;->setInbounds(Ljava/util/List;)V

    .line 34
    :cond_255
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v9, "Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 35
    invoke-interface {v0, v9, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2df

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ldev/epro/v2ray/model/V2Ray;->getDns()Ldev/epro/v2ray/model/dns/DnsObject;

    move-result-object v3
    :try_end_270
    .catch Ljava/lang/Exception; {:try_start_1ff .. :try_end_270} :catch_3ea

    const-string v9, "I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v3, :cond_2c9

    :try_start_286
    invoke-virtual {v3}, Ldev/epro/v2ray/model/dns/DnsObject;->getServers()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_28e
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2af

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    instance-of v6, v15, Ljava/lang/String;

    if-eqz v6, :cond_2ad

    invoke-virtual {v15, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2a8

    invoke-virtual {v15, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2ad

    :cond_2a8
    check-cast v15, Ljava/lang/String;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2ad
    const/4 v6, 0x2

    goto :goto_28e

    :cond_2af
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v13, 0x2

    if-ge v6, v13, :cond_2d9

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2bf

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2bf
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d9

    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2d9

    :cond_2c9
    new-instance v3, Ldev/epro/v2ray/model/dns/DnsObject;

    invoke-direct {v3}, Ldev/epro/v2ray/model/dns/DnsObject;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2d9
    :goto_2d9
    invoke-virtual {v3, v12}, Ldev/epro/v2ray/model/dns/DnsObject;->setServers(Ljava/util/List;)V

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/model/V2Ray;->setDns(Ldev/epro/v2ray/model/dns/DnsObject;)V

    .line 36
    :cond_2df
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 v3, 0x0

    .line 37
    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2f0

    .line 38
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 39
    invoke-interface {v0, v5, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_399

    :cond_2f0
    invoke-virtual {v2}, Ldev/epro/v2ray/model/V2Ray;->getOutbounds()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2f8
    const/4 v4, 0x0

    :cond_2f9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5
    :try_end_2fd
    .catch Ljava/lang/Exception; {:try_start_286 .. :try_end_2fd} :catch_3ea

    const/16 v6, 0x22b8

    const-string v9, "A69\u001ac:LdmJdkMblAamHglH0;Nf>Hbf\u001d`"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v5, :cond_368

    :try_start_30b
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldev/epro/v2ray/model/outbounds/OutboundObject;

    invoke-virtual {v5}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->getProxySettings()Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;

    move-result-object v11

    if-nez v11, :cond_31c

    new-instance v11, Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;

    invoke-direct {v11}, Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;-><init>()V

    :cond_31c
    invoke-virtual {v11, v9}, Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;->setTag(Ljava/lang/String;)V

    invoke-virtual {v5}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->getProtocol()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_364

    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_364

    invoke-virtual {v5}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->getSettings()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v7, v11}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->ぁごぐすすぃ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-class v12, Ldev/epro/v2ray/model/protocols/http/OutboundConfigurationObject;

    invoke-virtual {v7, v11, v12}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ldev/epro/v2ray/model/protocols/http/OutboundConfigurationObject;

    invoke-virtual {v11}, Ldev/epro/v2ray/model/protocols/http/OutboundConfigurationObject;->getServers()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_343
    :goto_343
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2f9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ldev/epro/v2ray/model/protocols/http/ServerObject;

    invoke-virtual {v12}, Ldev/epro/v2ray/model/protocols/http/ServerObject;->getAddress()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_343

    invoke-virtual {v12}, Ldev/epro/v2ray/model/protocols/http/ServerObject;->getPort()I

    move-result v12

    if-ne v12, v6, :cond_343

    invoke-virtual {v5, v9}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->setTag(Ljava/lang/String;)V

    const/4 v4, 0x1

    goto :goto_343

    :cond_364
    invoke-virtual {v5, v11}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->setProxySettings(Ldev/epro/v2ray/model/outbounds/ProxySettingsObject;)V

    goto :goto_2f8

    :cond_368
    if-nez v4, :cond_399

    new-instance v3, Ldev/epro/v2ray/model/protocols/http/ServerObject;

    invoke-direct {v3}, Ldev/epro/v2ray/model/protocols/http/ServerObject;-><init>()V

    invoke-virtual {v3, v14}, Ldev/epro/v2ray/model/protocols/http/ServerObject;->setAddress(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ldev/epro/v2ray/model/protocols/http/ServerObject;->setPort(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ldev/epro/v2ray/model/protocols/http/OutboundConfigurationObject;

    invoke-direct {v3}, Ldev/epro/v2ray/model/protocols/http/OutboundConfigurationObject;-><init>()V

    invoke-virtual {v3, v4}, Ldev/epro/v2ray/model/protocols/http/OutboundConfigurationObject;->setServers(Ljava/util/List;)V

    new-instance v4, Ldev/epro/v2ray/model/outbounds/OutboundObject;

    invoke-direct {v4}, Ldev/epro/v2ray/model/outbounds/OutboundObject;-><init>()V

    invoke-virtual {v4, v10}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->setProtocol(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->setSettings(Ljava/lang/Object;)V

    invoke-virtual {v4, v9}, Ldev/epro/v2ray/model/outbounds/OutboundObject;->setTag(Ljava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v0}, Ldev/epro/v2ray/model/V2Ray;->setOutbounds(Ljava/util/List;)V

    :cond_399
    invoke-virtual {v7, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->ぁごぐすすぃ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x1

    goto :goto_3a2

    :cond_39f
    invoke-virtual {v1, v0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V

    :goto_3a2
    const-string v3, "\u0019do@4gIkiO6k\u001aao\u001b`:K`m\u001ajj\u001c0n\u001df=H6"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3b5

    iput-boolean v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->のぷのちつ:Z

    goto :goto_3b8

    :cond_3b5
    const/4 v0, 0x0

    iput-boolean v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->のぷのちつ:Z

    :goto_3b8
    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v0, v2}, Llibv2ray/V2RayPoint;->setConfigureFileContent(Ljava/lang/String;)V

    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    .line 40
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "HfgLdi\u001d4kAfn\u001deh\u001eco\u001dbnNa>\u001a`>\u001c6j\u001ab"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 41
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v2}, Llibv2ray/V2RayPoint;->setEnableLocalDNS(Z)V

    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v0, v4}, Llibv2ray/V2RayPoint;->setForwardIpv6(Z)V

    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    sget-object v2, Ldev/epro/v2ray/util/V2rayConfigUtil;->PREF_CURR_CONFIG_DOMAIN:Ljava/lang/String;

    invoke-virtual {v0, v2}, Llibv2ray/V2RayPoint;->setDomainName(Ljava/lang/String;)V

    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v0, v4}, Llibv2ray/V2RayPoint;->setProxyOnly(Z)V

    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v0}, Llibv2ray/V2RayPoint;->runLoop()V
    :try_end_3e9
    .catch Ljava/lang/Exception; {:try_start_30b .. :try_end_3e9} :catch_3ea

    goto :goto_3f3

    :catch_3ea
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V

    :goto_3f3
    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v0}, Llibv2ray/V2RayPoint;->getIsRunning()Z

    move-result v0

    if-eqz v0, :cond_431

    const v0, 0x7f110052

    invoke-virtual {v1, v0}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    const-string v5, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v4, "Mk;Jef\u001agm\u001aan\u00197gJak\u001e3>IejJeg\u001af=Oc"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->どぇぞほだ(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4a4

    :cond_431
    iget-object v0, v1, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->おぐぴう〸ず:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    if-eqz v8, :cond_4a4

    const-string v0, "\u0019k;\u0019al\u001e7;\u001a1h\u001a3kMcfK7m\u001aj;\u0019bnI`=\u001ak"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4a4

    const-string v0, "ObmKk>@39\u001aejMa=\u001c1g\u001a3kJanNa9Jf>\u0019g"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    aget-object v0, v0, v4

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-instance v3, Landroid/os/Handler;

    invoke-virtual/range {p0 .. p0}, Landroid/net/VpnService;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/くし〴〺ぅ;

    invoke-direct {v4, v1, v2, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/くし〴〺ぅ;-><init>(Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;[Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4a4

    :cond_481
    const-string v0, "La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4a4

    .line 43
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 44
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v5, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v0, 0x1

    .line 45
    invoke-virtual {v1, v0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V

    goto :goto_4a5

    :cond_4a4
    :goto_4a4
    const/4 v0, 0x1

    :cond_4a5
    :goto_4a5
    return v0
.end method

.method public prepare()J
    .registers 3

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public protect(J)J
    .registers 3

    long-to-int p2, p1

    .line 1
    invoke-virtual {p0, p2}, Landroid/net/VpnService;->protect(I)Z

    move-result p1

    if-eqz p1, :cond_a

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_a
    const-wide/16 p1, 0x1

    return-wide p1
.end method

.method public setup(Ljava/lang/String;)J
    .registers 4

    :try_start_0
    invoke-virtual {p0, p1}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3} :catch_6

    const-wide/16 v0, 0x0

    return-wide v0

    :catch_6
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public shutdown()J
    .registers 3

    const/4 v0, 0x1

    :try_start_1
    invoke-virtual {p0, v0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_4} :catch_7

    const-wide/16 v0, 0x0

    return-wide v0

    :catch_7
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final 〺つふすそ(ILjava/lang/String;Z)V
    .registers 7

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    const v2, 0x7f110052

    invoke-virtual {p0, v2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p2, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->げつ〴ぬぐ()Landroid/app/PendingIntent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    const-string p1, "\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p3, :cond_4b

    .line 1
    sget-object p3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    invoke-static {p3, p1, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setUsesChronometer(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Landroidx/core/app/NotificationCompat$Builder;->setWhen(J)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_5a

    .line 3
    :cond_4b
    sget-object p3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 4
    invoke-static {p3, p1, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setUsesChronometer(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    :goto_5a
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〳ぜぞぜべっ:Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    iget-object p2, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぁごぐすすぃ:Landroid/app/NotificationManager;

    const p3, 0x7f110055

    invoke-virtual {p2, p3, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    invoke-virtual {p0, p3, p1}, Landroid/net/VpnService;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method

.method public final くし〴〺ぅ(Ljava/lang/String;)V
    .registers 15

    invoke-static {p0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_b

    invoke-virtual {p0, v1}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V

    return-void

    :cond_b
    new-instance v0, Landroid/net/VpnService$Builder;

    invoke-direct {v0, p0}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    const-string v2, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_21
    const/4 v5, 0x3

    const/16 v6, 0xc

    const/16 v7, 0x8

    const/4 v8, 0x2

    if-ge v4, v2, :cond_190

    aget-object v9, p1, v4

    const-string v10, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    aget-object v10, v9, v3

    const-string v11, "O`k\u001edjNc9@jj@`<LefA`n@dl\u001agjOfnA3"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_54

    aget-object v10, v9, v1

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v0, v10}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    :cond_54
    aget-object v10, v9, v3

    const-string v11, "\u00196lLc;\u001d`hAffMji\u001d1o@egMag\u001acnL4:Ja"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6b

    aget-object v10, v9, v1

    invoke-virtual {v0, v10}, Landroid/net/VpnService$Builder;->addSearchDomain(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    :cond_6b
    aget-object v10, v9, v3

    const-string v11, "H3;HjlL0jN4k\u001ac<\u00194=L1<\u001c6;\u001c`f\u001a3hJc"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_88

    aget-object v10, v9, v1

    aget-object v11, v9, v8

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v0, v10, v11}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    :cond_88
    aget-object v10, v9, v3

    const-string v11, "MkkOd:\u001b`:\u001df:\u001bfl\u001ag=Kfn\u001b6o\u001a0=K4l\u001dk"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_175

    iget-object v10, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v11, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v12, "\u001b0mM6:L0fKe>KcmM1l\u0019jnN1kMkhI6<\u001af"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 1
    iget-object v10, v10, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-static {v11, v1, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    .line 2
    iget-object v10, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v11, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v12, "JjoLdjMdkI3nL3=\u001e7g\u001aalNe<\u001c`m\u001c6>I4"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12, v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 3
    iget-object v7, v10, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-static {v11, v3, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    .line 4
    iget-object v7, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v10, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v11, "K4k@1;NboOemH0l\u001eemOei\u00191gKcg\u001e4gJa"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 5
    iget-object v6, v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-static {v10, v3, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    .line 6
    iget-object v6, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const/16 v10, 0x10

    const-string v11, "\u00197o\u001ea:\u001bd9Nkg\u0019fl@go\u001eef@c=I4f\u001c`g\u001c3"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v7, v11, v10}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 7
    iget-object v6, v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-static {v7, v3, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    .line 8
    sget-object v6, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v7, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 9
    invoke-interface {v6, v7, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    const-string v7, "@cmNkmH3kHbl\u001c6fAbmK3h\u001daoHbk\u001cbkMj"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v6, :cond_13b

    .line 10
    sget-object v6, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v10, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 11
    invoke-interface {v6, v10, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_123

    goto :goto_13b

    :cond_123
    aget-object v5, v9, v1

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_12f

    invoke-virtual {v0, v7, v3}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    goto :goto_175

    :cond_12f
    aget-object v5, v9, v1

    aget-object v6, v9, v8

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v5, v6}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    goto :goto_175

    :cond_13b
    :goto_13b
    aget-object v6, v9, v1

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_151

    const-string v6, "Le9Le=KchA`oJcoOjn\u001echKe>\u001benJbf\u001de"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v5}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    goto :goto_175

    :cond_151
    iget-object v5, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ()Ljava/util/Collection;

    move-result-object v5

    check-cast v5, Ljava/util/Vector;

    invoke-virtual {v5}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_15d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_175

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    :try_start_169
    invoke-virtual {v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ()Ljava/lang/String;

    move-result-object v7

    iget v6, v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v0, v7, v6}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;
    :try_end_172
    .catch Ljava/lang/IllegalArgumentException; {:try_start_169 .. :try_end_172} :catch_173

    goto :goto_15d

    :catch_173
    nop

    goto :goto_15d

    :cond_175
    :goto_175
    aget-object v5, v9, v3

    const-string v6, "A`o\u001affH`:\u001b4;\u001c19Adi\u001ck=Ij:M7oMjg@0"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18c

    aget-object v5, v9, v1

    invoke-virtual {v0, v5}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    :cond_18c
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_21

    :cond_190
    iget-boolean p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->のぷのちつ:Z

    if-nez p1, :cond_1e0

    .line 12
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1e0

    .line 14
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-interface {p1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 16
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 17
    invoke-interface {p1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 18
    :cond_1e0
    sget-object p1, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const v2, 0x7f110052

    .line 19
    invoke-virtual {p1, v2}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    :try_start_1ec
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〺つふすそ:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1f1
    .catch Ljava/lang/Exception; {:try_start_1ec .. :try_end_1f1} :catch_1f1

    :catch_1f1
    :try_start_1f1
    invoke-virtual {v0}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〺つふすそ:Landroid/os/ParcelFileDescriptor;
    :try_end_1f7
    .catch Ljava/lang/Exception; {:try_start_1f1 .. :try_end_1f7} :catch_1f8

    goto :goto_1fb

    :catch_1f8
    invoke-virtual {p0, v1}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V

    :goto_1fb
    invoke-virtual {p0, v2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    const-string v9, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v2, v9, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v4, "\u001e1f\u001ceiNemI4lOeo\u001cj;Mb=JagO`h\u001b4;\u001cgf\u0019eh\u001a19OknJj=Ojl\u001d4oO0o\u001e`gKf9\u001c6kH"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v0, v4, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->どぇぞほだ(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xe

    new-array v0, p1, [Ljava/lang/String;

    .line 20
    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->なぎぱいぢぎ:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v9, "Mk9Ijh\u001dj9I1h@3gNgk@0jA4i\u001d6n\u001a7kAk"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v2, v4, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    const-string v2, "\u001de<NeiA6:\u001a79@69Kj=Iaj\u00197:\u001e4nLe9\u001a4"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "LcoKjnMbkJ4nA1hO6j\u001e7;O7<@b=@`;\u001d3"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v8

    const-string v1, "A3=I4nJ0lNfk\u00190<@`>H7iKdhK4lA0lMk"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    const/4 v1, 0x4

    const-string v2, "Hg>\u001ek:\u001bdhAf>\u001e4;O6f\u001e`mN7oO7;\u001d19N`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "\u001bghN`j\u001c`>O3k\u001b1<HkfI79OjlN4=IafHgfKdiH4gJjm@7jI6n\u00191fN6<\u001e0:NgfJcmK"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "AejKcjNd:LjiJa=I4<\u001c`:Id;A7;N1;Aj"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "@fn\u001bdfJ0lL7o\u001eb>\u001bchHj=\u001d3nH6n\u001eeo@4"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "O4i\u001a7fAg<Nj;\u0019fgM`=Jg=Kbm\u001eai\u001ec:I`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v7

    const/16 v1, 0x9

    const-string v2, "KfgAe>Kf<N3kNcoK1fLjfHg9O3;\u001b7gA7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "\u001bgkAb<K7=Oc<\u00197=L`nI3hA1jMdjAkj\u001bd"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v4, "\u001e4:Jd9@`oJ09K4kHeh\u001ecjHfgOajAegK6=H0>Odo\u001dj;\u001dg:Lgl\u001a1kN`:MegLdkKg:I"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    const-string v1, "NbkN3:\u001c6i\u0019`j\u001c3n@bg@ek\u001edh\u00191=\u001ca=Og"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    const/16 v1, 0xd

    const-string v4, "J`;@cgHd=OklIboLejJc<H4iI0lKckKf"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_2fb
    if-ge v3, p1, :cond_305

    aget-object v4, v0, v3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2fb

    :cond_305
    iget-boolean p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->のぷのちつ:Z

    if-eqz p1, :cond_323

    const-string p1, "\u001dj>@4>Mcg@4nAe9Jg;K3o\u001ek=\u001dekI7:\u001aj"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string p1, "Jk;Ie<Jf;\u001ccgHbjKcg\u001bj<JkhMagKblN6"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_323
    new-instance p1, Ldev/epro/v2ray/util/GuardProcess;

    invoke-direct {p1, v1}, Ldev/epro/v2ray/util/GuardProcess;-><init>(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldev/epro/v2ray/util/GuardProcess;->start(Ldev/epro/v2ray/util/Callback;Landroid/content/Context;)Ldev/epro/v2ray/util/GuardProcess;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->へぬ〴づぞ:Ldev/epro/v2ray/util/GuardProcess;

    .line 21
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〺つふすそ:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->なぎぱいぢぎ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;

    invoke-direct {v1, p0, v0, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;Ljava/lang/String;Ljava/io/FileDescriptor;)V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->づざかべべ:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final げつ〴ぬぐ()Landroid/app/PendingIntent;
    .registers 4

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/net/VpnService;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object v2
.end method

.method public final びぐびあび(Z)V
    .registers 6

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "L1oLen\u001dbgL3fNal@fnA4=\u001befI1jOdi\u001dk"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 2
    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 3
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v0}, Llibv2ray/V2RayPoint;->getIsRunning()Z

    move-result v0

    if-eqz v0, :cond_1f

    :try_start_18
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->くし〴〺ぅ:Llibv2ray/V2RayPoint;

    invoke-virtual {v0}, Llibv2ray/V2RayPoint;->stopLoop()V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_1d} :catch_1e

    goto :goto_1f

    :catch_1e
    nop

    :cond_1f
    :goto_1f
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->おぐぴう〸ず:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 4
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4a

    .line 6
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_61

    :cond_4a
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    if-eqz v0, :cond_61

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_5a

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    iget-boolean v0, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->びぐびあび:Z

    if-eqz v0, :cond_61

    :cond_5a
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->へぬ〴づぞ()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->てぜきぽく:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    :cond_61
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->づざかべべ:Ljava/lang/Thread;

    if-eqz v0, :cond_6a

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->づざかべべ:Ljava/lang/Thread;

    :cond_6a
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_73

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    :cond_73
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->へぬ〴づぞ:Ldev/epro/v2ray/util/GuardProcess;

    if-eqz v0, :cond_7c

    invoke-virtual {v0}, Ldev/epro/v2ray/util/GuardProcess;->destroy()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->へぬ〴づぞ:Ldev/epro/v2ray/util/GuardProcess;

    :cond_7c
    if-eqz p1, :cond_86

    :try_start_7e
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->〺つふすそ:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_83
    .catch Ljava/lang/Exception; {:try_start_7e .. :try_end_83} :catch_83

    :catch_83
    invoke-virtual {p0}, Landroid/net/VpnService;->stopSelf()V

    :cond_86
    return-void
.end method
