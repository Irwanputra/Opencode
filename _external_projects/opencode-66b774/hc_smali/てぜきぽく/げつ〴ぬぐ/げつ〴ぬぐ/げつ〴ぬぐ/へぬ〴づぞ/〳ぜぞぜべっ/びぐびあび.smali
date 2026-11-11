.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;Landroid/net/DhcpInfo;)V
    .registers 3

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 14

    const-string v0, "I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1
    :try_start_14
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->え〱さぽぜ()Ljava/lang/String;

    move-result-object v2

    .line 3
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 4
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->しげにけぃ(Ljava/lang/String;)I

    move-result v3

    .line 5
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〺〲に〼へ〸(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 7
    iget-object v5, v4, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 8
    iget-object v4, v4, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->くし〴〺ぅ:Ljava/lang/String;

    .line 9
    invoke-virtual {v5, v4}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 10
    iget-object v5, v4, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 11
    invoke-virtual {v4}, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->げつ〴ぬぐ()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/net/VpnService$Builder;->setConfigureIntent(Landroid/app/PendingIntent;)Landroid/net/VpnService$Builder;

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 12
    iget-object v4, v4, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    const/16 v5, 0x5dc

    .line 13
    invoke-virtual {v4, v5}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 14
    iget-object v4, v4, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 15
    invoke-virtual {v4, v2, v3}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 16
    iget-object v3, v3, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 17
    invoke-virtual {v3, v1}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 18
    iget-object v3, v3, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 19
    invoke-virtual {v3, v0}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 20
    iget-object v3, v3, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 21
    new-instance v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const/16 v5, 0x20

    invoke-direct {v4, v1, v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 22
    iget-object v1, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    const/4 v6, 0x1

    invoke-direct {v3, v4, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v1, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 23
    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 24
    iget-object v1, v1, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 25
    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-direct {v3, v0, v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 26
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v1, v3, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 28
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 29
    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v3, "\u001b0mM6:L0fKe>KcmM1l\u0019jnN1kMkhI6<\u001af"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 30
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v3, v1, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v0, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 31
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 32
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 33
    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v3, "JjoLdjMdkI3nL3=\u001e7g\u001aalNe<\u001c`m\u001c6>I4"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x8

    invoke-direct {v1, v3, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 34
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v3, v1, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v0, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 35
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 36
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 37
    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v3, "K4k@1;NboOemH0l\u001eemOei\u00191gKcg\u001e4gJa"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    invoke-direct {v1, v3, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 38
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v3, v1, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v0, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 39
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 40
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 41
    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v3, "\u00197o\u001ea:\u001bd9Nkg\u0019fl@go\u001eef@c=I4f\u001c`g\u001c3"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x10

    invoke-direct {v1, v3, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 42
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v3, v1, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v0, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 43
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 44
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->いいにぽつ:Ljava/lang/String;

    if-eqz v0, :cond_127

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 46
    iget-object v1, v1, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 47
    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 48
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {v1, v3, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 49
    :cond_127
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 50
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 51
    invoke-virtual {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_135
    :goto_135
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;
    :try_end_141
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_141} :catch_203
    .catchall {:try_start_14 .. :try_end_141} :catchall_2bf

    :try_start_141
    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 52
    iget-object v3, v3, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 53
    invoke-virtual {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ()Ljava/lang/String;

    move-result-object v4

    iget v1, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v3, v4, v1}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;
    :try_end_14e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_141 .. :try_end_14e} :catch_135
    .catch Ljava/lang/Exception; {:try_start_141 .. :try_end_14e} :catch_203
    .catchall {:try_start_141 .. :try_end_14e} :catchall_2bf

    goto :goto_135

    :cond_14f
    :try_start_14f
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_151
    .catch Ljava/lang/Exception; {:try_start_14f .. :try_end_151} :catch_203
    .catchall {:try_start_14f .. :try_end_151} :catchall_2bf

    const/16 v1, 0x15

    if-lt v0, v1, :cond_160

    :try_start_155
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 54
    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 55
    invoke-virtual {v0}, Landroid/net/VpnService;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_160
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_155 .. :try_end_160} :catch_160
    .catch Ljava/lang/Exception; {:try_start_155 .. :try_end_160} :catch_203
    .catchall {:try_start_155 .. :try_end_160} :catchall_2bf

    :catch_160
    :cond_160
    :try_start_160
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 56
    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->なぎぱいぢぎ:Landroid/net/VpnService$Builder;

    .line 57
    invoke-virtual {v1}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    .line 58
    iput-object v1, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->びぐびあび:Landroid/os/ParcelFileDescriptor;

    .line 59
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 60
    iget-object v1, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->びぐびあび:Landroid/os/ParcelFileDescriptor;
    :try_end_16e
    .catch Ljava/lang/Exception; {:try_start_160 .. :try_end_16e} :catch_203
    .catchall {:try_start_160 .. :try_end_16e} :catchall_2bf

    const-string v3, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v1, :cond_20b

    .line 61
    :try_start_184
    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〺つふすそ()V

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 63
    iget-object v1, v1, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〳ぜぞぜべっ:Ljava/text/SimpleDateFormat;

    .line 64
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] <font color=#FF0000>VPNService can\'t establish, any 2 ways to fix it choose one of both"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 65
    iget-object v1, v1, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〳ぜぞぜべっ:Ljava/text/SimpleDateFormat;

    .line 66
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gk\u001eb9KjgAbk\u001akoOaf\u001cjoMgoH3k\u001d3h\u0019jl\u001ce:O4nNcn\u001adg\u001afhI4i\u001dcgMbhA7hM1m\u001e1h"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 67
    iget-object v1, v1, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〳ぜぞぜべっ:Ljava/text/SimpleDateFormat;

    .line 68
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g:N4l\u001d1fI1>N4n\u0019ah\u001bbfAcgL7h\u001eai\u001c`>\u001ek>A6i\u001c3m\u001dj;\u001c`mKcmKk>\u001ae;\u001cdi\u001defJ`fH4h\u001c7iM6j\u001c`n@d=\u0019ah\u001def\u0019d:\u001b7f\u001979\u001akhNc9L6mN3lH6h@ci\u001c6:@`<\u001d3l\u00191lM`=\u001b0:Le<OakKkj\u001b7;\u001e3gIkjMbmAa:M`9\u001c0i\u001cfkK3;Odo\u001e7jLa<\u001agn\u00193h\u001a3mMk9Ajn\u001ad"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_203
    .catch Ljava/lang/Exception; {:try_start_184 .. :try_end_203} :catch_203
    .catchall {:try_start_184 .. :try_end_203} :catchall_2bf

    :catch_203
    :goto_203
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 69
    iget-object v0, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぁごぐすすぃ:Ljava/util/Locale;

    .line 70
    invoke-static {v0}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    return-void

    :cond_20b
    :try_start_20b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 71
    iget-object v1, v1, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->〳ぜぞぜべっ:Ljava/text/SimpleDateFormat;

    .line 72
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    const v3, 0x7f11003e

    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ながふずは:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Ofl\u0019c>L6>I`iMe<\u001c1=M0<\u001e4l\u001ec<K1lH7oMem\u001d1kMagO4>\u001cdmA7>Jdo\u0019k<\u001eb:\u001benM6fLalM0i@3:Ma<Afk\u001dfmMe>\u001b1<\u001d3>@kj"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぇとしたべど:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->げがぴうあだ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->にぷきなせこ(Ljava/lang/String;)Z

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 75
    iget-object v5, v0, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->びぐびあび:Landroid/os/ParcelFileDescriptor;

    const/16 v6, 0x5dc

    const-string v8, "\u001dcmM3k\u001a1i\u001d3n\u001d7:Of>Odi\u001b4g@afO6hJ7"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "\u001ajfAb=@`<M6<\u001c6nO`f\u001bcn\u001b4m@`;Kj;Jb"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "A7kJflAc9Keh\u001afmHa;\u0019c9A49OgjJgiJj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "\u001ajfAb=@`<M6<\u001c6nO`f\u001bcn\u001b4m@`;Kj;Jb"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x1

    invoke-static/range {v5 .. v12}, Lorg/bugs4u/proxyserver/core/Tun2Socks;->Start(Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_2bd
    .catch Ljava/lang/Exception; {:try_start_20b .. :try_end_2bd} :catch_203
    .catchall {:try_start_20b .. :try_end_2bd} :catchall_2bf

    goto/16 :goto_203

    :catchall_2bf
    move-exception v0

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/びぐびあび;->〺つふすそ:Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;

    .line 77
    iget-object v1, v1, Lteam/dev/epro/apkcustom/sockets/socks/SocksVPNService;->ぁごぐすすぃ:Ljava/util/Locale;

    .line 78
    invoke-static {v1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    goto :goto_2c9

    :goto_2c8
    throw v0

    :goto_2c9
    goto :goto_2c8
.end method
