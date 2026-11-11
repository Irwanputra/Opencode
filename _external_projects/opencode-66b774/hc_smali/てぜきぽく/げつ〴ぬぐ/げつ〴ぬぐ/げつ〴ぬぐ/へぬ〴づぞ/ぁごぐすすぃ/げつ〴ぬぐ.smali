.class public final synthetic Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぁごぐすすぃ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;


# direct methods
.method public synthetic constructor <init>(Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 8

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->のぷのちつ:[Ljava/lang/String;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_7
    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    invoke-virtual {v1}, Lca/psiphon/PsiphonTunnel;->startRouting()Z

    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぺぁあねじ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    const-string v2, ""

    goto :goto_37

    :cond_19
    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->〺つふすそ:Lca/psiphon/PsiphonTunnel;

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->のぷのちつ:[Ljava/lang/String;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_24
    if-ge v5, v4, :cond_33

    aget-object v6, v3, v5

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\n"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_24

    :cond_33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4
    :goto_37
    invoke-virtual {v1, v2}, Lca/psiphon/PsiphonTunnel;->startTunneling(Ljava/lang/String;)V
    :try_end_3a
    .catch Lca/psiphon/PsiphonTunnel$〺つふすそ; {:try_start_7 .. :try_end_3a} :catch_3b

    goto :goto_8b

    :catch_3b
    move-exception v1

    const v2, 0x7f110052

    invoke-virtual {v0, v2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

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

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    :goto_8b
    return-void
.end method
