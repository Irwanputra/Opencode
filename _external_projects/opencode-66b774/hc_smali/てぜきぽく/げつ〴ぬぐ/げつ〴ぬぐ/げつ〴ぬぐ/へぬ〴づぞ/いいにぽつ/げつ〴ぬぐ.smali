.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Ljava/lang/String;

.field public final synthetic くし〴〺ぅ:Ljava/io/FileDescriptor;

.field public final synthetic びぐびあび:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;Ljava/lang/String;Ljava/io/FileDescriptor;)V
    .registers 4

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/FileDescriptor;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 11

    const-string v0, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_16
    const-wide/16 v4, 0x3e8

    shl-long/2addr v4, v3

    const v6, 0x7f110052

    const/4 v7, 0x1

    :try_start_1d
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    new-instance v4, Landroid/net/LocalSocket;

    invoke-direct {v4}, Landroid/net/LocalSocket;-><init>()V

    new-instance v5, Landroid/net/LocalSocketAddress;

    iget-object v8, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    sget-object v9, Landroid/net/LocalSocketAddress$Namespace;->FILESYSTEM:Landroid/net/LocalSocketAddress$Namespace;

    invoke-direct {v5, v8, v9}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;Landroid/net/LocalSocketAddress$Namespace;)V

    invoke-virtual {v4, v5}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V

    new-array v5, v7, [Ljava/io/FileDescriptor;

    iget-object v8, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/FileDescriptor;

    aput-object v8, v5, v2

    invoke-virtual {v4, v5}, Landroid/net/LocalSocket;->setFileDescriptorsForSend([Ljava/io/FileDescriptor;)V

    invoke-virtual {v4}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    const/16 v5, 0x2a

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write(I)V

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;

    invoke-virtual {v4, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v8, v0, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\u001aekJ0kO6<H6;\u001bdf@fmN1:\u001a3iL7n\u001ec:\u001b3<Ne>\u00193fOco\u001e4jNdlK4;Ojh\u001e6i\u001cegH1l\u001c"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7a
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_7a} :catch_7b

    goto :goto_7f

    :catch_7b
    nop

    const/4 v4, 0x5

    if-le v3, v4, :cond_1ad

    :goto_7f
    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;

    invoke-virtual {v3, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v5, v0, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v8, "\u001c0:\u001939\u00194:NcgJb=M1hA1nA7:\u001cc>NenJj;N1:AalH3n\u001d`:J6lI6=NcgAgjKa:M7fA"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v4, v8, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->どぇぞほだ(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;

    .line 1
    sget v4, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぉざぅち〻:I

    .line 2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_a6
    new-instance v4, Ljava/net/URL;

    const-string v5, "\u001daiNegLdnOdfH6>\u001c`:Aa<\u001b0hJj>\u0019anLe"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "I`9LglMk<\u001bffH1mL0>\u00190i\u0019foMb:L6<@d"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "\u001bf:@al\u001d4n\u001eelMklIfnL1:\u001e6>@fn\u00193k\u001e0"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v4, v5, v8, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;

    iput-object v4, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    const/16 v5, 0xbb8

    invoke-virtual {v4, v5}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    iget-object v4, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v5}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    iget-object v4, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    const-string v5, "\u001939LcjAf=\u001d7m\u001c6:Nkl\u001a1kKghId=\u001delJg"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "K1g\u001cajL6oAahA49\u001aagJamMch@b:Oe;Ha"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v5, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    iget-object v4, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    iget-object v2, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const/16 v4, 0xcc

    if-eq v2, v4, :cond_124

    const/16 v4, 0xc8

    if-ne v2, v4, :cond_15e

    iget-object v2, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    .line 3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x18

    if-lt v4, v5, :cond_119

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentLengthLong()J

    move-result-wide v4

    goto :goto_11e

    :cond_119
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v2

    int-to-long v4, v2

    :goto_11e
    const-wide/16 v8, 0x0

    cmp-long v2, v4, v8

    if-nez v2, :cond_15e

    .line 4
    :cond_124
    invoke-virtual {v3, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v5, v0, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\u00194hOgjLb<\u001bjoAflJfgK3gHf;H1m\u001b39H3"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->おぐぴう〸ず:Landroid/os/Handler;

    invoke-virtual {v2, v7}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_15e
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_15e} :catch_165
    .catchall {:try_start_a6 .. :try_end_15e} :catchall_163

    :cond_15e
    iget-object v0, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1a4

    goto :goto_1a1

    :catchall_163
    move-exception v0

    goto :goto_1a5

    :catch_165
    :try_start_165
    invoke-virtual {v3, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v1, v0, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g=\u0019`kKa:Of=Mc:L0o\u0019jj\u001cblJa<\u00196>\u00193nOe:\u001a1<K`mHakLk:A4jH3;\u001dao\u001d7<\u001ae=Ljf\u0019`f\u001e69M3kAko\u001a`iNai\u001c0oJ`hN`;Oj=\u001a`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v3, v7}, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->びぐびあび(Z)V
    :try_end_19d
    .catchall {:try_start_165 .. :try_end_19d} :catchall_163

    .line 6
    iget-object v0, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1a4

    :goto_1a1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1a4
    return-void

    :goto_1a5
    iget-object v1, v3, Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;->ぇぬぎばつ:Ljava/net/HttpURLConnection;

    if-eqz v1, :cond_1ac

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1ac
    throw v0

    :cond_1ad
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_16
.end method
