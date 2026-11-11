.class public Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->onDestroy()V
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->〳ぜぞぜべっ()V

    .line 2
    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 3
    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->づざかべべ()V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 8

    const/4 v0, 0x0

    sput-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    const/4 v1, 0x1

    sput-boolean v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->〺でおいここ:Z

    sput-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->けときぜと:Z

    sget-boolean v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    if-nez v2, :cond_10

    sget-boolean v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->おかぷせ〱:Z

    if-nez v2, :cond_98

    :cond_10
    sput-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    sput-boolean v1, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->おかぷせ〱:Z

    sget-object v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    sget-object v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぺづげぺが:Ljava/lang/String;

    const-string v2, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 1
    iget-object v4, v4, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    const-string v5, "\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2
    invoke-static {v4, v3, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v6, 0x7f1102f3

    invoke-virtual {v4, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 3
    iget-object v4, v4, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    .line 4
    invoke-static {v4, v3, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v5, 0x7f1102eb

    invoke-virtual {v4, v5}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    .line 5
    iget-object v2, v2, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->なぎぱいぢぎ:Ljava/text/SimpleDateFormat;

    const-string v4, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-static {v2, v3, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v4, 0x7f110059

    invoke-virtual {v2, v4}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_98
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v2, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-virtual {v2, v0}, Landroid/net/VpnService;->sendBroadcast(Landroid/content/Intent;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    const v2, 0x7f1102ce

    invoke-virtual {v0, v2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {v0, v2}, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->いいにぽつ(Ljava/lang/String;)V

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_c6

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-virtual {v0, v1}, Landroid/net/VpnService;->stopForeground(Z)V

    :cond_c6
    return-void
.end method
