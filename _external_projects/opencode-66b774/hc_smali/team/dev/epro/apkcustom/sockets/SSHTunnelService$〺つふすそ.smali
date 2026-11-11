.class public Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 11

    const/4 v0, 0x1

    sput-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    const/4 v1, 0x0

    sput-boolean v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->〺でおいここ:Z

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-virtual {v4, v2}, Landroid/net/VpnService;->sendBroadcast(Landroid/content/Intent;)V

    sput-boolean v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->おかぷせ〱:Z

    const/4 v2, 0x1

    :goto_20
    sget-boolean v4, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    if-eqz v4, :cond_132

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 1
    invoke-virtual {v4}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->くし〴〺ぅ()Z

    move-result v4

    if-nez v4, :cond_132

    .line 2
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-interface {v4, v5, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    const-string v5, ""

    const-string v6, "\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v4, :cond_f4

    sget-boolean v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->おかぷせ〱:Z

    if-nez v2, :cond_cf

    sput-boolean v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    sput-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->おかぷせ〱:Z

    sget-object v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    sget-object v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    invoke-static {v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v8, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 4
    iget-object v8, v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    .line 5
    invoke-static {v8, v4, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v8, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v9, 0x7f1102f2

    invoke-virtual {v8, v9}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 6
    iget-object v5, v5, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    .line 7
    invoke-static {v5, v4, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v5, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v6, 0x7f1102eb

    invoke-virtual {v5, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 8
    iget-object v5, v5, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    const-string v6, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 9
    invoke-static {v5, v4, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v5, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v6, 0x7f110059

    invoke-virtual {v5, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_cf
    sput-boolean v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    sput-boolean v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->けときぜと:Z

    sput-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->〺でおいここ:Z

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v1, 0x7f1102ce

    invoke-virtual {v0, v1}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->いいにぽつ(Ljava/lang/String;)V

    .line 11
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-virtual {v1, v0}, Landroid/net/VpnService;->sendBroadcast(Landroid/content/Intent;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 12
    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->てぜきぽく()V

    goto :goto_132

    .line 13
    :cond_f4
    sget-object v4, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    sget-object v4, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    invoke-static {v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 14
    iget-object v8, v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    .line 15
    invoke-static {v8, v7, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v6, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$〺つふすそ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v8, 0x7f1102f0

    invoke-virtual {v6, v8}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\u001dc<\u001e6:Nch\u001b4>Lf=Ae9Ab<AklOdm\u001d0mO3"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v4, 0x3e8

    :try_start_12b
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_12e
    .catch Ljava/lang/Exception; {:try_start_12b .. :try_end_12e} :catch_12e

    :catch_12e
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_20

    :cond_132
    :goto_132
    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 1

    return-void
.end method
