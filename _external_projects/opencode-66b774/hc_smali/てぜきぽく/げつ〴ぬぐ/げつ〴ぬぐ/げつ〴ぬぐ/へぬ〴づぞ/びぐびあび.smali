.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;)V
    .registers 2

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 14

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Mj=H0gN3;N7oH0:\u001c79\u001c19\u001cfi\u001e19\u001a39Ae"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_25

    goto :goto_2f

    .line 3
    :cond_25
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 4
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    :goto_2f
    sget-object v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    sget-object v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    const-string v1, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 5
    iget-object v3, v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    .line 6
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "L4>\u001b0m\u001b7i\u00190oAdi\u0019`lNa:\u001939\u001bdnHc=\u001aj"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 7
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺぁあねじ:Landroid/os/Handler;

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    invoke-static {}, Lorg/bugs4u/proxyserver/core/Tun2Socks;->Stop()V

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 9
    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉざぅち〻:Landroid/os/ParcelFileDescriptor;

    if-nez v1, :cond_7c

    .line 10
    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺふねづ〺()V

    .line 11
    :cond_7c
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    const-string v3, "Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 12
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "@bj\u001e7=\u001e3kIa9\u001e4;N1l\u001a3mK`f\u001e4fI4j\u001cc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_bb

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 13
    iget-object v3, v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉざぅち〻:Landroid/os/ParcelFileDescriptor;

    .line 14
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぶでにく〼〳:Ljava/lang/String;

    .line 15
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 16
    iget-object v5, v5, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->でどあくず:Ljava/lang/String;

    const-string v6, "A7kJflAc9Keh\u001afmHa;\u0019c9A49OgjJgiJj"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-static {v4, v5, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_cf

    :cond_bb
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 18
    iget-object v3, v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉざぅち〻:Landroid/os/ParcelFileDescriptor;

    .line 19
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぶでにく〼〳:Ljava/lang/String;

    .line 20
    invoke-static {v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u001a3>@f:L3jMeg\u001adjJ`fM4j@0o\u001d3f\u001cbjL1"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_cf
    move-object v7, v0

    move-object v11, v1

    move-object v5, v3

    move-object v10, v4

    const/4 v12, 0x1

    const/16 v6, 0x5dc

    const-string v8, "\u001dcmM3k\u001a1i\u001d3n\u001d7:Of>Odi\u001b4g@afO6hJ7"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "AejKcjNd:LjiJa=I4<\u001c`:Id;A7;N1;Aj"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static/range {v5 .. v12}, Lorg/bugs4u/proxyserver/core/Tun2Socks;->Start(Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
