.class public Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;
.super Landroid/net/VpnService;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Ljava/text/SimpleDateFormat;

.field public 〺つふすそ:Ljava/lang/Thread;

.field public ぁごぐすすぃ:Ljava/util/Locale;

.field public いいにぽつ:Ljava/lang/String;

.field public くし〴〺ぅ:Ljava/lang/String;

.field public づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

.field public なぎぱいぢぎ:Landroid/net/VpnService$Builder;

.field public びぐびあび:Landroid/os/ParcelFileDescriptor;

.field public ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

.field public ぺふねづ〺:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "Of=\u001ce9@b9Ac:\u001dkl\u001cfl\u001ca:\u0019aoAeoJ7f\u0019f"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    const-string v0, "N4iOgj\u0019d=\u00197;M39N`jHb=\u0019aiJ7fIkh\u001ce"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->くし〴〺ぅ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onRevoke()V
    .registers 1

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〺つふすそ()V

    invoke-super {p0}, Landroid/net/VpnService;->onRevoke()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .registers 15

    new-instance p2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-direct {p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;-><init>()V

    iput-object p2, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    iput-object p2, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぁごぐすすぃ:Ljava/util/Locale;

    new-instance p2, Landroid/net/VpnService$Builder;

    invoke-direct {p2, p0}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    iput-object p2, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    new-instance p2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p3

    const-string v0, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p2, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〳ぜぞぜべっ:Ljava/text/SimpleDateFormat;

    const/4 p2, 0x1

    if-eqz p1, :cond_241

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p3, "IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_225

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    if-nez p1, :cond_170

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1
    :try_start_47
    sget-object p3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    move-object v1, p3

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v1

    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p3, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    const/16 v1, 0x9

    aget-object p3, p3, v1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_5e
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_47 .. :try_end_5e} :catch_5e
    .catch Ljava/lang/Exception; {:try_start_47 .. :try_end_5e} :catch_5e

    .line 3
    :catch_5e
    sget-object p3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 4
    move-object v1, p3

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v1

    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p3, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    aget-object p3, p3, p2

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_7e

    .line 5
    sget-object p3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object p3

    goto :goto_8f

    .line 7
    :cond_7e
    sget-object p3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 8
    move-object v1, p3

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v1

    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p3, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    aget-object p3, p3, p2

    :goto_8f
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_be

    .line 9
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 10
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b5

    .line 11
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    move-object p3, p1

    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object p3

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, p2

    goto :goto_bd

    .line 13
    :cond_b5
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 14
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object p1

    :goto_bd
    move-object p3, p1

    :cond_be
    const-string p1, "\u00190nLkj\u001b3;\u00190g@d>LcnLf<M6;Nk;@k<\u001c0"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length p3, p1

    if-le p3, p2, :cond_170

    aget-object p3, p1, p2

    const-string v1, "\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    const/4 v2, 0x0

    aget-object p3, p3, v2

    const-string v3, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    aget-object p3, p3, v2

    const/16 v4, 0x50

    aget-object v5, p1, p2

    invoke-virtual {v5, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    array-length v5, v5

    if-le v5, p2, :cond_10f

    aget-object v4, p1, p2

    invoke-virtual {v4, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v2

    invoke-virtual {v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, p2

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    :cond_10f
    iput-object p3, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->いいにぽつ:Ljava/lang/String;

    iput v4, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぺふねづ〺:I

    aget-object p3, p1, v2

    const-string v4, "I`>\u0019`<\u001abgH0kN7gHgj\u001bkg\u001cdhJ0h\u001bbm\u00190"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_170

    aget-object p3, p1, p2

    invoke-virtual {p3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    array-length v4, p3

    if-le v4, p2, :cond_14a

    aget-object v1, p3, p2

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v2

    aget-object v4, p3, p2

    invoke-virtual {v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v4, v4

    if-le v4, p2, :cond_147

    aget-object p3, p3, p2

    invoke-virtual {p3, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    aget-object v0, p3, p2

    :cond_147
    move-object v9, v0

    move-object v8, v1

    goto :goto_15c

    :cond_14a
    aget-object v4, p1, p2

    invoke-virtual {v4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_15a

    aget-object p3, p3, p2

    invoke-virtual {p3, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    aget-object v0, p3, v2

    :cond_15a
    move-object v8, v0

    move-object v9, v8

    :goto_15c
    new-instance p3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    const/16 v4, 0x43a

    const/4 v5, 0x1

    iget-object v6, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->いいにぽつ:Ljava/lang/String;

    iget v7, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぺふねづ〺:I

    aget-object v10, p1, v2

    move-object v3, p3

    invoke-direct/range {v3 .. v10}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;-><init>(IZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p3, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ()V

    :cond_170
    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〺つふすそ:Ljava/lang/Thread;

    if-eqz p1, :cond_17a

    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result p1

    if-nez p1, :cond_241

    :cond_17a
    const-string p1, "\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/net/VpnService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 16
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    const-string v1, "M4>Ma;\u001c6hO4>Jd:\u00190j@1m\u001dklKafNdf@j9\u001c6<N0:\u00193;Ie=H7i\u001e`f\u001cdfHfnIf>MdjI"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f110052

    if-lt p3, v0, :cond_1af

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Landroid/app/NotificationChannel;

    const/4 v3, 0x2

    invoke-direct {v0, v1, p3, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string p3, ""

    invoke-virtual {v0, p3}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 17
    :cond_1af
    new-instance p1, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {p1, p0, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/net/VpnService;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    const-string v0, "Hfk@gfIgiMj;Oj>LfoI1mJgoKb:H`lO7"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/net/wifi/WifiManager;

    invoke-virtual {p3}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    move-result-object p3

    new-instance v0, Ljava/util/Locale;

    const-string v1, "\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    const-string v0, "\u001c7hK6>\u001bdkO4jKeiA`n\u0019a:\u001eg9H4<\u001calIb9Ab<KjoOkg\u001a1>HgmIc:Jkg\u00193oL7mObnN"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "Hcf\u00193mOcgJc=\u001a0:\u0019eoN1>I6o\u001e4mI6k\u001bgnH1h\u001dgjHe<@dn\u001cb<Odj\u001e1=\u001b4lIe<L7k\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 v0, -0x2

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const v0, 0x7f0801b5

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->げつ〴ぬぐ()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Landroid/net/VpnService;->startForeground(ILandroid/app/Notification;)V

    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;

    invoke-direct {v0, p0, p3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;-><init>(Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;Landroid/net/DhcpInfo;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〺つふすそ:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto :goto_241

    :cond_225
    const-string p3, "La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 18
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_241

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〺つふすそ()V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    if-eqz p1, :cond_241

    invoke-virtual {p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;->びぐびあび()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぺぁあねじ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ;

    :cond_241
    :goto_241
    return p2
.end method

.method public final 〺つふすそ()V
    .registers 5

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->びぐびあび:Landroid/os/ParcelFileDescriptor;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    :try_start_5
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->びぐびあび:Landroid/os/ParcelFileDescriptor;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_a} :catch_b

    goto :goto_c

    :catch_b
    nop

    :cond_c
    :goto_c
    invoke-static {}, Lorg/bugs4u/proxyserver/core/Tun2Socks;->Stop()V

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ながふずは:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "J`j\u0019k;\u001e4k\u001dkkIj<KbhN3kM6m\u001d7k\u001defLdiK1fMd<N6fN4nK0k\u001afh\u00194m\u001ajfIfnO4<@1m@cfNa9\u001dki\u001a4<\u00194:A0nAknOc=\u001ebiMk9"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぇとしたべど:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->げがぴうあだ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->にぷきなせこ(Ljava/lang/String;)Z

    iget-object v0, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〺つふすそ:Ljava/lang/Thread;

    if-eqz v0, :cond_51

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〺つふすそ:Ljava/lang/Thread;

    :cond_51
    const-string v0, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〳ぜぞぜべっ:Ljava/text/SimpleDateFormat;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f11003f

    invoke-virtual {p0, v1}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 4
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "\u001cc:\u001c`lH7jMj;IdiLf;\u001ajmH7<\u001a1i\u001cjf\u001b4"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/net/VpnService;->stopForeground(Z)V

    invoke-virtual {p0}, Landroid/net/VpnService;->stopSelf()V

    return-void
.end method

.method public げつ〴ぬぐ()Landroid/app/PendingIntent;
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
