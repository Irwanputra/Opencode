.class public Lde/blinkt/openvpn/core/OpenVPNService;
.super Landroid/net/VpnService;
.source ""

# interfaces
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$びぐびあび;
.implements Landroid/os/Handler$Callback;
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/blinkt/openvpn/core/OpenVPNService$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static どぇぞほだ:Z


# instance fields
.field public 〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

.field public final 〺つふすそ:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public 〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

.field public ぁごぐすすぃ:Ljava/lang/Thread;

.field public いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

.field public ぇ〳〲〺すっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

.field public ぇぬぎばつ:J

.field public ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

.field public ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

.field public おぐぴう〸ず:Z

.field public final くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

.field public ごづごきえ:Ljava/lang/String;

.field public ざっざへづ:Landroid/os/Handler;

.field public final ざとぅぼこ〺:Landroid/os/IBinder;

.field public final づざかべべ:Ljava/lang/Object;

.field public てぜきぽく:Ljava/lang/String;

.field public でどあくず:Landroid/widget/Toast;

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public なぶひせが:Landroid/os/PowerManager$WakeLock;

.field public のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

.field public は〲ぱなで:Ljava/lang/String;

.field public びえぁぜい:Landroid/os/PowerManager;

.field public final びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

.field public ぶでにく〼〳:Ljava/lang/Runnable;

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:Ljava/lang/String;

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-direct {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-direct {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->づざかべべ:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぁごぐすすぃ:Ljava/lang/Thread;

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぺぁあねじ:Ljava/lang/String;

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->へぬ〴づぞ:Z

    iput-boolean v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->おぐぴう〸ず:Z

    new-instance v1, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;-><init>(Lde/blinkt/openvpn/core/OpenVPNService;)V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ざとぅぼこ〺:Landroid/os/IBinder;

    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    return-void
.end method

.method public static けときぜと(JZLandroid/content/res/Resources;)Ljava/lang/String;
    .registers 11

    if-eqz p2, :cond_6

    const-wide/16 v0, 0x8

    mul-long p0, p0, v0

    :cond_6
    if-eqz p2, :cond_b

    const/16 v0, 0x3e8

    goto :goto_d

    :cond_b
    const/16 v0, 0x400

    :goto_d
    long-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide v1

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    move-result-wide v5

    div-double/2addr v1, v5

    double-to-int v0, v1

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v5, v0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p0, v2

    double-to-float p0, p0

    const/4 p1, 0x2

    const/4 v2, 0x1

    if-eqz p2, :cond_77

    if-eqz v0, :cond_67

    if-eq v0, v2, :cond_57

    if-eq v0, p1, :cond_47

    const p1, 0x7f11014d

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_47
    const p1, 0x7f1101a5

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_57
    const p1, 0x7f11018b

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_67
    const p1, 0x7f110070

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_77
    if-eqz v0, :cond_ad

    if-eq v0, v2, :cond_9d

    if-eq v0, p1, :cond_8d

    const p1, 0x7f110362

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8d
    const p1, 0x7f110364

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9d
    const p1, 0x7f110363

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_ad
    const p1, 0x7f110361

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, p2, v1

    invoke-virtual {p3, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .registers 2

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ざとぅぼこ〺:Landroid/os/IBinder;

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .registers 2

    invoke-virtual {p1}, Landroid/os/Message;->getCallback()Ljava/lang/Runnable;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    const/4 p1, 0x1

    return p1

    :cond_b
    const/4 p1, 0x0

    return p1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 3

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_19

    const-string v0, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    iget-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ざとぅぼこ〺:Landroid/os/IBinder;

    return-object p1

    :cond_19
    new-instance p1, Lde/blinkt/openvpn/core/OpenVPNService$くし〴〺ぅ;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lde/blinkt/openvpn/core/OpenVPNService$くし〴〺ぅ;-><init>(Lde/blinkt/openvpn/core/OpenVPNService;Lde/blinkt/openvpn/core/OpenVPNService$げつ〴ぬぐ;)V

    return-object p1
.end method

.method public onCreate()V
    .registers 4

    invoke-super {p0}, Landroid/net/VpnService;->onCreate()V

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 v1, 0x1

    const-string v2, "\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-static {v0, v2, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    return-void
.end method

.method public onDestroy()V
    .registers 8

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "I`=N6o\u001eaf\u001ea;Ng=\u001b1mLjo\u001da9\u001e`fLbfId"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 2
    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 3
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    .line 4
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7f

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->なぶひせが:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_7f

    :try_start_27
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_7f

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->なぶひせが:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    const-class v0, Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "O0l\u001c`nKgjO3f\u00193;O0=K7g@g=\u001e49Ock@df\u001bjn\u001ea=LdgJ1gMek\u00196:L3=@4:HdoHjoN"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7d
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_7d} :catch_7e

    goto :goto_7f

    :catch_7e
    nop

    .line 5
    :cond_7f
    :goto_7f
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a4

    .line 7
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_dc

    .line 9
    :cond_a4
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "\u001d1iL7:J1n\u001dkmAj9Jc>\u0019g=\u001b0=@jn\u001ealL6"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c0

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v0, :cond_dc

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;->びぐびあび()V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    goto :goto_dc

    :cond_c0
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    if-eqz v0, :cond_dc

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_d0

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    iget-boolean v0, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->びぐびあび:Z

    if-eqz v0, :cond_dc

    :cond_d0
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->へぬ〴づぞ()V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    .line 13
    :cond_dc
    :goto_dc
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_100

    .line 15
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 16
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_109

    :cond_100
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇ〳〲〺すっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    if-eqz v0, :cond_109

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ()V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇ〳〲〺すっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    :cond_109
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->づざかべべ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_10c
    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぁごぐすすぃ:Ljava/lang/Thread;

    if-eqz v1, :cond_115

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {v1, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Z)Z

    :cond_115
    monitor-exit v0
    :try_end_116
    .catchall {:try_start_10c .. :try_end_116} :catchall_121

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    if-eqz v0, :cond_11d

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_11d
    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ざっざへづ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$びぐびあび;)V

    return-void

    :catchall_121
    move-exception v1

    :try_start_122
    monitor-exit v0
    :try_end_123
    .catchall {:try_start_122 .. :try_end_123} :catchall_121

    throw v1
.end method

.method public onRevoke()V
    .registers 3

    const/4 v0, 0x1

    :try_start_1
    invoke-virtual {p0, v0}, Lde/blinkt/openvpn/core/OpenVPNService;->げつ〴ぬぐ(Z)Z
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_4} :catch_4

    :catch_4
    const v0, 0x7f110239

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Z)Z

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぉひのべい()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .registers 25

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p3

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x1

    .line 2
    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_88

    const-string v0, "\u001b`<\u0019ah@fiObfJ4mH`:O1<@bmLj:LdnKe"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/net/VpnService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->びえぁぜい:Landroid/os/PowerManager;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f110051

    invoke-virtual {v7, v2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u001e6j\u001e6n\u001cfn\u001adhA`:If<\u0019c;A7i\u001ekn\u001a4>\u001dalIkjNc;AenIa>\u001a7l\u001ebj\u001d0:\u001a0<Ibh\u001cbfJ"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->なぶひせが:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    const-class v0, Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

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

    .line 3
    :cond_88
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x0

    .line 4
    invoke-interface {v0, v1, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v12, 0x0

    if-nez v0, :cond_ae

    .line 5
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-interface {v0, v1, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_295

    .line 7
    :cond_ae
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "Jeo@alI4<\u001aagNb:\u001ejk\u001efjOenI1>\u001ae;\u001aa"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v0, v1, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 9
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-static {v0, v1, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 11
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-static {v0, v1, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 13
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v0, v1, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 15
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-static {v0, v1, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 17
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-static {v0, v1, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->てぜきぽく(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 19
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001d1iL7:J1n\u001dkmAj9Jc>\u0019g=\u001b0=@jn\u001ealL6"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-interface {v0, v1, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_277

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    :try_start_11c
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 22
    move-object v2, v1

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v2

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_133
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_11c .. :try_end_133} :catch_134
    .catch Ljava/lang/Exception; {:try_start_11c .. :try_end_133} :catch_134

    goto :goto_135

    :catch_134
    nop

    .line 23
    :goto_135
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 24
    move-object v2, v1

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v2

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v10

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_155

    .line 25
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 26
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object v1

    goto :goto_166

    .line 27
    :cond_155
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 28
    move-object v2, v1

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v2

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v10

    :goto_166
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_195

    .line 29
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 30
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18c

    .line 31
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 32
    move-object v1, v0

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v10

    goto :goto_194

    .line 33
    :cond_18c
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 34
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object v0

    :goto_194
    move-object v1, v0

    :cond_195
    const-string v0, "\u00190nLkj\u001b3;\u00190g@d>LcnLf<M6;Nk;@k<\u001c0"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-le v1, v10, :cond_295

    aget-object v1, v0, v10

    const-string v2, "\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v11

    const-string v3, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v16, v1, v11

    aget-object v1, v0, v10

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-le v1, v10, :cond_1e6

    aget-object v1, v0, v10

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v11

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v10

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    goto :goto_1ea

    :cond_1e6
    const/16 v1, 0x50

    const/16 v17, 0x50

    :goto_1ea
    aget-object v1, v0, v11

    const-string v4, "\u001d`nKam\u001bd;Af<M0n\u001bjf\u001e79\u001b4jAek\u001dei\u001dj"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_220

    aget-object v1, v0, v11

    const-string v4, "IcnL1mA0fHff\u001c0jNfh\u001c0<Ab9\u001egh@4gM3"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_220

    aget-object v1, v0, v11

    const-string v4, "Jdm\u001edk\u001b7nIg:KjfOj;A0hAdm\u001cd9J7lN3"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_295

    :cond_220
    aget-object v1, v0, v10

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v4, v1

    if-le v4, v10, :cond_24c

    aget-object v2, v1, v10

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v11

    aget-object v4, v1, v10

    invoke-virtual {v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v4, v4

    if-le v4, v10, :cond_247

    aget-object v1, v1, v10

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v10

    move-object/from16 v19, v1

    move-object/from16 v18, v2

    goto :goto_262

    :cond_247
    move-object/from16 v18, v2

    move-object/from16 v19, v12

    goto :goto_262

    :cond_24c
    aget-object v4, v0, v10

    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_25d

    aget-object v1, v1, v10

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v11

    goto :goto_25e

    :cond_25d
    move-object v1, v12

    :goto_25e
    move-object/from16 v18, v1

    move-object/from16 v19, v18

    :goto_262
    const/16 v14, 0x22b8

    iget-object v1, v7, Lde/blinkt/openvpn/core/OpenVPNService;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    if-nez v1, :cond_295

    new-instance v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    const/4 v15, 0x1

    aget-object v20, v0, v11

    move-object v13, v1

    invoke-direct/range {v13 .. v20}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;-><init>(IZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, v7, Lde/blinkt/openvpn/core/OpenVPNService;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ()V

    goto :goto_295

    :cond_277
    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    if-nez v0, :cond_295

    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-direct {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;-><init>()V

    iput-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_290

    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    iget-boolean v0, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->びぐびあび:Z

    if-nez v0, :cond_295

    :cond_290
    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->のぷのちつ()V

    :cond_295
    :goto_295
    if-eqz v8, :cond_2a9

    const-string v0, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bm\u001cai@6=Ofg@cl@4gHai\u001bklH0gLem\u001efnKdiL7;M0jL3gOb9\u001akoLdhMk>\u001ejh\u001e4jN3lHg:Aei\u001ea:A3<A1j@`j\u001d1kMfnHei\u001cc<H`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2a9

    sput-boolean v10, Lde/blinkt/openvpn/core/OpenVPNService;->どぇぞほだ:Z

    :cond_2a9
    invoke-static/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〺つふすそ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$びぐびあび;)V

    invoke-static/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;)V

    new-instance v0, Landroid/os/Handler;

    invoke-virtual/range {p0 .. p0}, Landroid/net/VpnService;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->ざっざへづ:Landroid/os/Handler;

    const/4 v13, 0x2

    if-eqz v8, :cond_2d9

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019boNk>H7gOdfJcl\u001d3n\u001edhK4mO`mN1<\u0019go\u001cel\u001egiJcf\u001a4k\u001cajJ7g\u001damH6gOajOam\u001d4;"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d9

    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    if-eqz v0, :cond_2d8

    invoke-virtual {v0, v10}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ(Z)V

    :cond_2d8
    return v13

    :cond_2d9
    if-eqz v8, :cond_2f7

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b>\u001eg=Njg\u001dj<M6o\u001dgjAcgJ79@3;\u001cdjLggHff\u001ablAfjHgjMki\u001c1f\u001e1h\u001cgkN4<\u001aeoK3f"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2f7

    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    if-eqz v0, :cond_2f6

    invoke-virtual {v0, v11}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ(Z)V

    :cond_2f6
    return v13

    :cond_2f7
    if-eqz v8, :cond_30e

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30e

    return v13

    :cond_30e
    if-eqz v8, :cond_326

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Ac9K0fO1k\u001d7mH7<\u001d6hJ`h\u001dghJ1gOj<J3n"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_326

    const/4 v0, 0x3

    return v0

    :cond_326
    new-array v0, v11, [Ljava/lang/Object;

    const v1, 0x7f11007b

    invoke-static {v1, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    sget-object v6, Lde/blinkt/openvpn/core/ConnectionStatus;->〳ぜぞぜべっ:Lde/blinkt/openvpn/core/ConnectionStatus;

    const-string v0, "\u00197g\u001d1n\u0019d;J1=\u0019k:O1>\u001d4h\u0019a<\u001a7jK6m\u001delAjm\u001cej@0f\u001a4f\u001adh\u001bd>\u001egf\u00190i\u00194jLd=L"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-static {v0, v2, v1, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V

    invoke-static/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->くし〴〺ぅ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->くし〴〺ぅ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v4, 0x0

    const-string v3, "K0h\u00196i@e9\u0019j>\u001bdi\u0019e9A1gJgh\u001b3iOjg\u001dj"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lde/blinkt/openvpn/core/OpenVPNService;->ながふずは(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLde/blinkt/openvpn/core/ConnectionStatus;)V

    if-eqz v8, :cond_3d6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/net/VpnService;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Lgl\u001egnA0kJ3kHbnMe;\u001bg:\u001b7<\u001bg9\u001eamL0"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3d6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/net/VpnService;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/net/VpnService;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u001bjkMkj\u001c4<MfgK3<\u0019jn\u001ejjJ6jJboH7k\u001bd"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1, v11}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const/16 v2, 0x64

    invoke-static {v7, v0, v1, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->びぐびあび(Landroid/content/Context;Ljava/lang/String;II)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    move-result-object v0

    iput-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x19

    if-lt v1, v2, :cond_439

    if-nez v0, :cond_3c6

    goto :goto_439

    .line 35
    :cond_3c6
    const-class v1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v7, v1}, Landroid/net/VpnService;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/pm/ShortcutManager;->reportShortcutUsed(Ljava/lang/String;)V

    goto :goto_439

    .line 36
    :cond_3d6
    invoke-static/range {p0 .. p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "Ljj\u001cdf\u0019ekAegMboNbi\u0019g>Akj\u001c`g\u0019a<KdfO7m\u001efiHboOfj\u001d39Hbj\u001dgi\u001e7gO0:K79A"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3ef

    invoke-static {v7, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->くし〴〺ぅ(Landroid/content/Context;Ljava/lang/String;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    move-result-object v0

    goto :goto_3f0

    :cond_3ef
    move-object v0, v12

    .line 37
    :goto_3f0
    iput-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    const v0, 0x7f1102cc

    new-array v1, v11, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    if-nez v0, :cond_41f

    .line 38
    invoke-static/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->〺つふすそ(Landroid/content/Context;)V

    invoke-static/range {p0 .. p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "H0nH0f\u00190kHki\u0019bn\u001bjgKf;K7hIc9MaoK`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->づざかべべ(Ljava/lang/String;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    move-result-object v0

    .line 39
    iput-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    if-nez v0, :cond_41f

    invoke-virtual {v7, v9}, Landroid/net/VpnService;->stopSelf(I)V

    return v13

    :cond_41f
    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 40
    iget v1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    if-eq v1, v13, :cond_428

    const/4 v2, 0x7

    if-ne v1, v2, :cond_439

    :cond_428
    iget-object v1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぎきぁ〱ぢ:Ljava/security/PrivateKey;

    if-nez v1, :cond_439

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;

    invoke-direct {v2, v0, v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Landroid/content/Context;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 41
    :cond_439
    :goto_439
    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    if-nez v0, :cond_441

    invoke-virtual {v7, v9}, Landroid/net/VpnService;->stopSelf(I)V

    return v13

    :cond_441
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lde/blinkt/openvpn/core/OpenVPNService$〺つふすそ;

    invoke-direct {v1, v7}, Lde/blinkt/openvpn/core/OpenVPNService$〺つふすそ;-><init>(Lde/blinkt/openvpn/core/OpenVPNService;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-static {v7, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->ぺふねづ〺(Landroid/content/Context;Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;)V

    iget-object v0, v7, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->でどあくず(Ljava/lang/String;)V

    return v10
.end method

.method public 〺つふすそ(JJJJ)V
    .registers 22

    move-object v0, p0

    iget-boolean v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->へぬ〴づぞ:Z

    const/4 v2, 0x4

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_64

    const v1, 0x7f110311

    invoke-virtual {p0, v1}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/net/VpnService;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    move-wide v7, p1

    invoke-static {p1, p2, v4, v6}, Lde/blinkt/openvpn/core/OpenVPNService;->けときぜと(JZLandroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    const-wide/16 v6, 0x2

    div-long v8, p5, v6

    invoke-virtual {p0}, Landroid/net/VpnService;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-static {v8, v9, v3, v10}, Lde/blinkt/openvpn/core/OpenVPNService;->けときぜと(JZLandroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v5, v3

    const/4 v8, 0x2

    invoke-virtual {p0}, Landroid/net/VpnService;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    move-wide/from16 v10, p3

    invoke-static {v10, v11, v4, v9}, Lde/blinkt/openvpn/core/OpenVPNService;->けときぜと(JZLandroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v5, v8

    const/4 v8, 0x3

    div-long v6, p7, v6

    invoke-virtual {p0}, Landroid/net/VpnService;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-static {v6, v7, v3, v9}, Lde/blinkt/openvpn/core/OpenVPNService;->けときぜと(JZLandroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    iget-wide v6, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇぬぎばつ:J

    sget-object v8, Lde/blinkt/openvpn/core/ConnectionStatus;->〺つふすそ:Lde/blinkt/openvpn/core/ConnectionStatus;

    const-string v9, "L4hLe<O4fIghK4n\u0019bg\u001e6hKek\u001d6>\u001cd9Lg"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object p1, p0

    move-object p2, v1

    move-object/from16 p3, v5

    move-object/from16 p4, v9

    move-wide/from16 p5, v6

    move-object/from16 p7, v8

    invoke-virtual/range {p1 .. p7}, Lde/blinkt/openvpn/core/OpenVPNService;->ながふずは(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLde/blinkt/openvpn/core/ConnectionStatus;)V

    .line 1
    :cond_64
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2
    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_21a

    .line 3
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 4
    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_21a

    .line 5
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    move-object v5, v1

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v5

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v2

    const-string v5, "Ae:MdhKa>\u001cbg\u001cd:Ogf\u00190kAkjKbm\u0019ajHa"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21a

    :try_start_a9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_ab
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_a9 .. :try_end_ab} :catch_175
    .catch Ljava/lang/Exception; {:try_start_a9 .. :try_end_ab} :catch_175

    const/16 v5, 0x11

    const v6, 0x10808000

    const-string v7, "KcfLgn@b>L1kJ`kA4<Ia9\u001b3oNc<A0gLkk\u001a3i\u001a6iK7gJgn\u001b6gNc<Lak\u0019c:JaoK7m\u0019"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const v8, 0x7f11010b

    const-string v9, ""

    const/4 v10, 0x5

    const-string v11, "O`;Lfl\u001a3;\u0019gfL0<\u001b39L4fNflM0oOdk\u001cd"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\u001edfAk:\u001dj:M19A4nN1;Oeg\u001dgfAk>\u001e1lLg"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-lt v1, v5, :cond_129

    :try_start_d6
    invoke-virtual {p0}, Landroid/net/VpnService;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v12}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_ea

    invoke-virtual {p0}, Landroid/net/VpnService;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v11}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_175

    .line 7
    :cond_ea
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 8
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    new-instance v5, Ljava/lang/String;

    .line 9
    sget-object v11, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 10
    check-cast v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v11, v10, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v10

    invoke-direct {v5, v10}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v1, v5, v9}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 11
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぷちぅぐね()V

    invoke-virtual {p0, v8}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/net/VpnService;->startActivity(Landroid/content/Intent;)V

    :goto_121
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Landroid/os/Process;->killProcess(I)V

    goto :goto_175

    :cond_129
    invoke-virtual {p0}, Landroid/net/VpnService;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v12}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_13d

    invoke-virtual {p0}, Landroid/net/VpnService;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v11}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_175

    .line 13
    :cond_13d
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 14
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    new-instance v5, Ljava/lang/String;

    .line 15
    sget-object v11, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 16
    check-cast v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v11, v10, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v10

    invoke-direct {v5, v10}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v1, v5, v9}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 17
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 18
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぷちぅぐね()V

    invoke-virtual {p0, v8}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/net/VpnService;->startActivity(Landroid/content/Intent;)V
    :try_end_174
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_d6 .. :try_end_174} :catch_175
    .catch Ljava/lang/Exception; {:try_start_d6 .. :try_end_174} :catch_175

    goto :goto_121

    :catch_175
    :cond_175
    :goto_175
    :try_start_175
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v3, "I1j\u001aejOb:\u001banH0iHkh\u001c3=AehNdi\u00196<\u001ag"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 19
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 20
    move-object v6, v5

    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v6

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v2, v5, v2

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v1

    if-gez v1, :cond_21a

    .line 21
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 22
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぷちぅぐね()V

    const-string v1, "O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v5, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v3, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x7f110105

    invoke-virtual {p0, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->づざかべべ()Z

    move-result v1

    if-eqz v1, :cond_21a

    iget-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {v1, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Z)Z

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぉひのべい()V
    :try_end_21a
    .catch Ljava/text/ParseException; {:try_start_175 .. :try_end_21a} :catch_21a
    .catch Ljava/lang/Exception; {:try_start_175 .. :try_end_21a} :catch_21a

    :catch_21a
    :cond_21a
    return-void
.end method

.method public final 〺でおいここ(Ljava/lang/String;)Z
    .registers 3

    if-eqz p1, :cond_34

    const-string v0, "@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_32

    const-string v0, "\u001d6n\u001ba>@`h\u001cg<\u001a3hOkm@egH3lA1fLa>@`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    const-string v0, "\u0019kmK`fI6l\u001eclL1oOf<O3:\u001b4lJjg\u001d`m@c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_34

    :cond_32
    const/4 p1, 0x1

    goto :goto_35

    :cond_34
    const/4 p1, 0x0

    :goto_35
    return p1
.end method

.method public declared-synchronized ぃぜぶの〸ぃ()V
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_12

    if-eqz v0, :cond_d

    :try_start_5
    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->は〲ぱなで(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;)V

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_d} :catch_d
    .catchall {:try_start_5 .. :try_end_d} :catchall_12

    :catch_d
    :cond_d
    const/4 v0, 0x0

    :try_start_e
    iput-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->のぷのちつ:Lde/blinkt/openvpn/core/DeviceStateReceiver;
    :try_end_10
    .catchall {:try_start_e .. :try_end_10} :catchall_12

    monitor-exit p0

    return-void

    :catchall_12
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public ぅみぱぎぎ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 12

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-direct {v0, p1, p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Lde/blinkt/openvpn/core/OpenVPNService;->〺でおいここ(Ljava/lang/String;)Z

    move-result p4

    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    new-instance v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const/16 v3, 0x20

    invoke-direct {v2, p3, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    iget-object v2, p0, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    if-nez v2, :cond_28

    const-string p1, "I0nOaiMbh@ffM6kK7;Nk<OfjJd<Nf=O1k\u001b1o\u001e3i@0o\u0019b=\u001b6o\u001d19\u001eb<\u0019f9H`m\u001caiJam\u001c4:Lj:\u001d0>ObgLakNdiA6hLjf\u001b3n\u001e6=O7<A1<Adj\u001e0fNdg\u001aglOjgO6lL0=KcfAj;H1:\u001cfo\u00197kN7nH1:Ic:\u0019fj\u001aa>O3mN7hL0lI1h\u001ejh\u001eb=MdmK6nJe=Nd;O19\u001cjk\u001e`<Hkk\u001b3:\u001b3h\u001c6i@k9A`=Mkf\u001bafIjkL4:IciIjhJ0hN3k@0=\u00191i\u001eblNb=LkgA39\u001bfmL1<@g9H3gAdnL1g\u001ac<Na<AenIag\u0019fn\u001dbnK6f@0kN3:He>HanLklNafA0fIbj\u001d6nN3"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    return-void

    :cond_28
    new-instance v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    const/4 v6, 0x1

    invoke-direct {v5, v2, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v5, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;)Z

    move-result v1

    if-eqz v1, :cond_35

    const/4 p4, 0x1

    :cond_35
    const-string v1, "\u0019b=\u001cgl\u001d4n\u001dblOk=L7iAb:IcjL7l\u001cai@f"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz p3, :cond_50

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4f

    iget-object v2, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ごづごきえ:Ljava/lang/String;

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_50

    :cond_4f
    const/4 p4, 0x1

    :cond_50
    iget p3, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    const/4 v2, 0x2

    if-ne p3, v3, :cond_67

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_67

    const p3, 0x7f110298

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v4

    aput-object p2, v1, v6

    invoke-static {p3, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇぬぎばつ(I[Ljava/lang/Object;)V

    :cond_67
    invoke-virtual {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ()Z

    move-result p2

    if-eqz p2, :cond_84

    const p2, 0x7f110299

    const/4 p3, 0x3

    new-array p3, p3, [Ljava/lang/Object;

    aput-object p1, p3, v4

    iget p1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p3, v6

    iget-object p1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    aput-object p1, p3, v2

    invoke-static {p2, p3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇぬぎばつ(I[Ljava/lang/Object;)V

    :cond_84
    iget-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 1
    iget-object p1, p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-static {v0, p4, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    return-void
.end method

.method public ぇ〳〲〺すっ(Ljava/lang/String;)V
    .registers 2

    return-void
.end method

.method public final ぇとしたべど(ILandroid/app/Notification$Builder;)V
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    if-eqz p1, :cond_4b

    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "\u001a`gO6;M7iAfl\u001d3kKchOdoIcgLbm\u001b4:J7"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v5

    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "J69\u001d3n\u001d1mJb>H6fM0h\u001dfjH`9\u001b0;H7j@cgAehLeh\u001cg:\u001e3gIa;@1<Ifh@bo\u0019am\u001b1g\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v5

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v1, v0, v5

    invoke-virtual {p1, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_48
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_48} :catch_49
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_48} :catch_49
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_48} :catch_49
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_48} :catch_49

    goto :goto_4b

    .line 1
    :catch_49
    sget-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :cond_4b
    :goto_4b
    return-void
.end method

.method public ぉざぅち〻(Ljava/lang/String;)V
    .registers 5

    .line 1
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const-string v2, "A7;\u001b7o\u001d`gMeh\u001c1;\u001ejl\u001b1oKej\u001cg=\u001ed>\u0019f"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    const-string v0, "Jj9K39\u001a4fH`<\u001d69\u001bfg\u001d0jJcj\u0019d;\u001bg<\u0019k"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final ぉひのべい()V
    .registers 3

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->づざかべべ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_4
    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぁごぐすすぃ:Ljava/lang/Thread;

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_4 .. :try_end_7} :catchall_28

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->は〲ぱなで(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;)V

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぃぜぶの〸ぃ()V

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->てぜきぽく(Landroid/content/Context;)V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぶでにく〼〳:Ljava/lang/Runnable;

    iget-boolean v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->おぐぴう〸ず:Z

    if-nez v0, :cond_27

    sget-boolean v0, Lde/blinkt/openvpn/core/OpenVPNService;->どぇぞほだ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->stopForeground(Z)V

    sget-boolean v0, Lde/blinkt/openvpn/core/OpenVPNService;->どぇぞほだ:Z

    if-nez v0, :cond_27

    invoke-virtual {p0}, Landroid/net/VpnService;->stopSelf()V

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ざっざへづ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$びぐびあび;)V

    :cond_27
    return-void

    :catchall_28
    move-exception v1

    :try_start_29
    monitor-exit v0
    :try_end_2a
    .catchall {:try_start_29 .. :try_end_2a} :catchall_28

    throw v1
.end method

.method public おかぷせ〱(Ljava/lang/String;)Z
    .registers 5

    if-nez p1, :cond_c

    const-string p1, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bg\u001d4mI6nNd:O1hO0gOel\u001dk:OfmNj>LcgLdl\u0019ah\u001eci\u0019ek\u001b`9O7k\u001ab>\u001e4f\u001d7=\u001e49\u001c6n"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1
    :cond_c
    invoke-static {p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const-string v2, "A7;\u001b7o\u001d`gMeh\u001c1;\u001ejl\u001b1oKej\u001cg=\u001ed>\u0019f"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    const/4 p1, 0x1

    goto :goto_48

    .line 3
    :cond_2b
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lde/blinkt/openvpn/api/ConfirmDialog;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3=A4m\u001b7m\u001ckkOf:\u001e6h\u001ak<Kcl@km\u001ejg\u00196kNk>Kbi\u00191hOghJ7hH`=K4i\u001cfo\u001a4j\u001c`9M1l"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x0

    :goto_48
    return p1
.end method

.method public final げがぴうあだ()Z
    .registers 3

    const-string v0, "OfiI3jM6lOajI`>\u001cfiK0<Mcf\u0019alNe=\u0019e"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/UiModeManager;

    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_19

    const/4 v0, 0x1

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    return v0
.end method

.method public げつ〴ぬぐ(Z)Z
    .registers 8

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "I`=N6o\u001eaf\u001ea;Ng=\u001b1mLjo\u001da9\u001e`fLbfId"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 2
    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 3
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    if-eqz v0, :cond_114

    .line 4
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 v1, 0x1

    const-string v3, "Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_83

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->なぶひせが:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_83

    :try_start_2b
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_83

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->なぶひせが:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    const-class v0, Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "O0l\u001c`nKgjO3f\u00193;O0=K7g@g=\u001e49Ock@df\u001bjn\u001ea=LdgJ1gMek\u00196:L3=@4:HdoHjoN"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_81} :catch_82

    goto :goto_83

    :catch_82
    nop

    .line 6
    :cond_83
    :goto_83
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a8

    .line 8
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_e0

    .line 10
    :cond_a8
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "\u001d1iL7:J1n\u001dkmAj9Jc>\u0019g=\u001b0=@jn\u001ealL6"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c4

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v0, :cond_e0

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;->びぐびあび()V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    goto :goto_e0

    :cond_c4
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    if-eqz v0, :cond_e0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_d4

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    iget-boolean v0, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->びぐびあび:Z

    if-eqz v0, :cond_e0

    :cond_d4
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->へぬ〴づぞ()V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〻ぞまぎな〻:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    .line 14
    :cond_e0
    :goto_e0
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_104

    .line 16
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_10d

    :cond_104
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇ〳〲〺すっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    if-eqz v0, :cond_10d

    invoke-virtual {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ()V

    iput-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇ〳〲〺すっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    .line 18
    :cond_10d
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    .line 19
    invoke-interface {v0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Z)Z

    move-result p1

    return p1

    :cond_114
    return v2
.end method

.method public じぜこほぱ(Ljava/lang/String;Z)V
    .registers 6

    const-string v0, "J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_f
    aget-object v1, p1, v0

    invoke-static {v1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v1

    aget-object v0, v1, v0

    check-cast v0, Ljava/net/Inet6Address;

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 1
    iget-object v1, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v2, v0, p1, p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Ljava/net/Inet6Address;IZ)V

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_2c
    .catch Ljava/net/UnknownHostException; {:try_start_f .. :try_end_2c} :catch_2d

    goto :goto_2f

    .line 2
    :catch_2d
    sget-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :goto_2f
    return-void
.end method

.method public せづっ〸ちね()Landroid/app/PendingIntent;
    .registers 4

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/net/VpnService;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public final ながふずは(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLde/blinkt/openvpn/core/ConnectionStatus;)V
    .registers 13

    const-string v0, "\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 1
    invoke-virtual {p6}, Ljava/lang/Enum;->ordinal()I

    move-result p6

    const/4 v1, 0x1

    if-eqz p6, :cond_2e

    if-eq p6, v1, :cond_2a

    const/4 v2, 0x4

    if-eq p6, v2, :cond_26

    const/4 v2, 0x5

    if-eq p6, v2, :cond_26

    const/4 v2, 0x7

    if-eq p6, v2, :cond_26

    const p6, 0x7f0801b0

    goto :goto_31

    :cond_26
    const p6, 0x7f0801b1

    goto :goto_31

    :cond_2a
    const p6, 0x7f08019e

    goto :goto_31

    :cond_2e
    const p6, 0x7f0801ae

    .line 2
    :goto_31
    new-instance v2, Landroid/app/Notification$Builder;

    invoke-direct {v2, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    const-string v3, "L4hLe<O4fIghK4n\u0019bg\u001e6hKek\u001d6>\u001cd9Lg"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_48

    const/4 v3, -0x2

    goto :goto_5b

    :cond_48
    const-string v3, "Kdl\u001cdiH0:AfnJ6kJemI4oAfmN6f@0j\u001af"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5a

    const/4 v3, 0x2

    goto :goto_5b

    :cond_5a
    const/4 v3, 0x0

    :goto_5b
    iget-object v4, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    if-eqz v4, :cond_63

    const v4, 0x7f110052

    goto :goto_66

    :cond_63
    const v4, 0x7f110206

    :goto_66
    invoke-virtual {p0, v4}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    invoke-virtual {v2, p1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    invoke-virtual {v2, p6}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/OpenVPNService;->せづっ〸ちね()Landroid/app/PendingIntent;

    move-result-object p6

    invoke-virtual {v2, p6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    const-wide/16 v4, 0x0

    cmp-long p6, p4, v4

    if-eqz p6, :cond_89

    invoke-virtual {v2, p4, p5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    :cond_89
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p5, 0x10

    if-lt p4, p5, :cond_92

    invoke-virtual {p0, v3, v2}, Lde/blinkt/openvpn/core/OpenVPNService;->ぇとしたべど(ILandroid/app/Notification$Builder;)V

    :cond_92
    const/16 p5, 0x15

    if-lt p4, p5, :cond_a6

    const-string p5, "\u001bkh@4n\u001deh\u001cgiIc9Oj=L09OjgO3>N7h\u001b3"

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    .line 3
    invoke-virtual {v2, p5}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    :cond_a6
    const/16 p5, 0x1a

    if-lt p4, p5, :cond_b8

    .line 4
    invoke-virtual {v2, p3}, Landroid/app/Notification$Builder;->setChannelId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object p4, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    if-eqz p4, :cond_b8

    invoke-virtual {p4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v2, p4}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_b8
    if-eqz p2, :cond_c5

    const-string p4, ""

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_c5

    invoke-virtual {v2, p2}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    :cond_c5
    invoke-virtual {v2}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object p2

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p4

    invoke-virtual {v0, p4, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    invoke-virtual {p0, p4, p2}, Landroid/net/VpnService;->startForeground(ILandroid/app/Notification;)V

    iget-object p2, p0, Lde/blinkt/openvpn/core/OpenVPNService;->なぎぱいぢぎ:Ljava/lang/String;

    if-eqz p2, :cond_e6

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_e6

    iget-object p2, p0, Lde/blinkt/openvpn/core/OpenVPNService;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_e6
    iput-object p3, p0, Lde/blinkt/openvpn/core/OpenVPNService;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/OpenVPNService;->げがぴうあだ()Z

    move-result p2

    if-eqz p2, :cond_fa

    if-ltz v3, :cond_fa

    iget-object p2, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ざっざへづ:Landroid/os/Handler;

    new-instance p3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;

    invoke-direct {p3, p0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺふねづ〺;-><init>(Lde/blinkt/openvpn/core/OpenVPNService;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_fa
    return-void
.end method

.method public final ぷぞてのほき()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v1, "\u001ej=@0:\u001d`g\u001ddhH1nH1<MeiMbn\u001c1>\u00197nN3hN0<J1:I`9\u001ad<\u00191>H4oLjmA0fIdn\u001bfjM"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1f

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-virtual {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1f
    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    if-eqz v0, :cond_30

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_30
    const-string v0, "LggOa:K3l\u001ag;K7=\u0019f;Oe=\u0019e;@f>\u001bfl@1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v1

    const-string v3, "\u001dan@cn\u001cjkN3:\u001c`9Afm\u001c6:Ib:\u00194iJ69Hg"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v1, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u00191g\u00194g\u001b4l@4oOfg\u001b6<K4<\u001c19\u001ccgHghI1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v1, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ka=Mf;Kcl\u001e`oNb9\u001ckoNfhAcmOjfJjh\u0019d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u0019ckKe=Lbm\u001d7m\u001cd>M`;\u001bamOef@`9\u001c6gJc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぺぁあねじ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001djnNb=MdfN4kM7<N1j\u001c3iI4<Ja:@a;\u001ea"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぺふねづ〺:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ぺづげぺが(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    if-eqz v0, :cond_20

    const-string v0, "\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {v0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->づざかべべ(Ljava/lang/String;)V

    :cond_20
    return-void
.end method

.method public ぺふねづ〺(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;Landroid/content/Intent;)V
    .registers 13

    .line 1
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string p3, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019blN`l\u001dcl\u001a7j\u001ebn\u0019k:\u001b4nIb:Ial\u001d19@7f\u001eek\u001cj9\u001c3nH6jJk;@a9Je9\u001c3>L6i\u001ach\u001eeo"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p5, "LcgL7<\u0019a>OjmO6jHkiAe>@a;\u001aa=KkjH1"

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p2, p5, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p3, "\u0019giH6>\u001b4h\u001d0g\u001cd:\u001ce:\u001dc;\u001dcmKcf\u0019d<N3"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck9J4lO69Jc:\u001d3:\u00193oOcoLfoKf:Lf;L3lI79\u001e7oLk:\u001d7hM0fMjnNjhAei\u001afgI6=@`g"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Landroid/net/VpnService;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぁごぐすすぃ:Ljava/lang/Thread;

    if-nez p1, :cond_46

    sget-boolean p1, Lde/blinkt/openvpn/core/OpenVPNService;->どぇぞほだ:Z

    if-nez p1, :cond_46

    return-void

    :cond_46
    const-string p1, "K0h\u00196i@e9\u0019j>\u001bdi\u0019e9A1gJgh\u001b3iOjg\u001dj"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lde/blinkt/openvpn/core/ConnectionStatus;->〺つふすそ:Lde/blinkt/openvpn/core/ConnectionStatus;

    const/4 p3, 0x0

    if-ne p4, p2, :cond_b0

    .line 3
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string p5, "I`=N6o\u001eaf\u001ea;Ng=\u001b1mLjo\u001da9\u001e`fLbfId"

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    const/4 v0, 0x1

    .line 4
    invoke-static {p2, p5, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    iput-boolean v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->へぬ〴づぞ:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇぬぎばつ:J

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/OpenVPNService;->げがぴうあだ()Z

    move-result p2

    if-nez p2, :cond_7d

    const-string p1, "L4hLe<O4fIghK4n\u0019bg\u001e6hKek\u001d6>\u001cd9Lg"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    :cond_7d
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string p5, "O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    .line 6
    invoke-interface {p2, p5, p3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_a1

    .line 7
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string p5, "Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1"

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    .line 8
    invoke-interface {p2, p5, p3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_b2

    :cond_a1
    iget-object p2, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇ〳〲〺すっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    if-nez p2, :cond_b2

    new-instance p2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-direct {p2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;-><init>()V

    iput-object p2, p0, Lde/blinkt/openvpn/core/OpenVPNService;->ぇ〳〲〺すっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {p2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ()V

    goto :goto_b2

    :cond_b0
    iput-boolean p3, p0, Lde/blinkt/openvpn/core/OpenVPNService;->へぬ〴づぞ:Z

    :cond_b2
    :goto_b2
    move-object v3, p1

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->くし〴〺ぅ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->くし〴〺ぅ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lde/blinkt/openvpn/core/OpenVPNService;->ながふずは(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLde/blinkt/openvpn/core/ConnectionStatus;)V

    return-void
.end method
