.class public Lteam/dev/epro/apkcustom/widgets/ConnectivityBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 6

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_15

    return-void

    .line 1
    :cond_15
    sget-object p2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    sget-object v0, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 3
    const-class v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p2, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    .line 4
    sget-object p2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 5
    sget-object v0, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 6
    const-class v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p2, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_2f

    return-void

    :cond_2f
    sget-boolean p2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    if-nez p2, :cond_a1

    sget-boolean p2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    if-eqz p2, :cond_38

    goto :goto_a1

    .line 7
    :cond_38
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 8
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_4c

    return-void

    .line 9
    :cond_4c
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-interface {p2, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_5f

    return-void

    .line 11
    :cond_5f
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 12
    invoke-interface {p2, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_a0

    .line 13
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 14
    invoke-interface {p2, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_a0

    new-instance p2, Landroid/content/Intent;

    const-class v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {p2, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 15
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 16
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance p2, Landroid/content/Intent;

    const-class v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {p2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 17
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 p2, 0x1

    .line 18
    invoke-static {p1, v0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    :cond_a0
    return-void

    :cond_a1
    :goto_a1
    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    sget-boolean p1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    return-void
.end method
