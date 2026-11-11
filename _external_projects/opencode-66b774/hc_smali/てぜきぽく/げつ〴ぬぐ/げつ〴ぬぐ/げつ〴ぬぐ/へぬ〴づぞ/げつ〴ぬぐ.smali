.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;
.super Ljava/lang/Thread;
.source ""


# static fields
.field public static final ぁごぐすすぃ:Ljava/lang/String;


# instance fields
.field public volatile 〺つふすそ:Z

.field public くし〴〺ぅ:I

.field public づざかべべ:Ljava/lang/String;

.field public なぎぱいぢぎ:Landroid/net/ConnectivityManager;

.field public びぐびあび:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ:I

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/net/ConnectivityManager;)Z
    .registers 4

    const/4 v0, 0x0

    if-eqz p0, :cond_43

    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_43

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v1

    if-eqz v1, :cond_43

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const-string v2, "N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    if-eqz v1, :cond_35

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_35

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    if-nez v1, :cond_35

    const/4 v1, 0x1

    goto :goto_36

    :cond_35
    const/4 v1, 0x0

    :goto_36
    if-eqz v1, :cond_43

    .line 3
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object p0

    sget-object v0, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    invoke-virtual {p0, v0}, Landroid/net/NetworkInfo$State;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_43
    return v0
.end method


# virtual methods
.method public run()V
    .registers 12

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ:Z

    if-nez v0, :cond_8

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_8
    const-wide/16 v0, 0x3e8

    :try_start_a
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_d
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_d} :catch_d

    .line 1
    :catch_d
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const-string v3, "N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v2, v3}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    iput-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->なぎぱいぢぎ:Landroid/net/ConnectivityManager;

    const/4 v2, 0x0

    :try_start_22
    const-string v3, "J`>\u001e7f\u001cff\u001bg9Kf<N1hMek@ff\u001d`mHa<\u00194oI1hAj>IdjN3f\u001cbmJb;\u001ed:NdoL0gM7>\u001c"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 3
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;

    const-string v4, "Kfj\u001b19\u001d6;J3n@6>H0jIef\u00191hN6fK0o\u001d`"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 4
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0xa

    .line 5
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    mul-int/lit16 v4, v4, 0x3e8

    invoke-virtual {v3, v4}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    const-string v4, "HjnHbn@1l@1>N3>Nf;\u001cdfLdnOdm\u001ceoKk"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    sget-object v5, Lteam/dev/epro/apkcustom/App;->なぎぱいぢぎ:Ljava/lang/String;

    .line 7
    invoke-virtual {v3, v4, v5}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    :goto_7d
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_87

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_7d

    :cond_87
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v3
    :try_end_94
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_94} :catch_95

    goto :goto_96

    :catch_95
    const/4 v3, 0x0

    .line 8
    :goto_96
    iput v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->びぐびあび:I

    sget-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/String;

    .line 9
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    const-string v6, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v4, :cond_fa

    iget v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 v8, 0x4

    if-ne v4, v8, :cond_fa

    iput v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->なぎぱいぢぎ:Landroid/net/ConnectivityManager;

    invoke-static {v4}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/net/ConnectivityManager;)Z

    move-result v4

    if-eqz v4, :cond_fa

    sget-boolean v4, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    if-nez v4, :cond_d9

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->づざかべべ()Z

    move-result v4

    if-eqz v4, :cond_fa

    :cond_d9
    invoke-static {v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v8, v6, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v9, "J`;Ac>Ak=\u001aj>Ibm@0n\u001e7gMjiMk<\u001c0jIcf\u001a6kHjo\u001db=\u001af;\u001dbhLghKejAe:\u001eej\u001a`m@"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v4, v9, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->どぇぞほだ(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->いおてぢび(Z)V

    :cond_fa
    const/16 v4, 0xc8

    iget v8, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->びぐびあび:I

    const/4 v9, 0x1

    if-gt v4, v8, :cond_13e

    const/16 v4, 0x18f

    if-gt v8, v4, :cond_13e

    invoke-static {v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    invoke-direct {v8, v6, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v10, "Ndk@`=M7iJkhNgi\u001dkmAcf\u001dd:Na;If>\u001b3kJdmAeiJg9\u001cdlNg9Ikh\u001dk;M0<\u001d79Jfo@"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v4, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget v8, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_15d

    :cond_13e
    invoke-static {v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    invoke-direct {v8, v6, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v10, "\u001dam\u001a6f@k9K69MknA`=LfiN`9H0>HgfNaj\u001a4<O0iAkiHd9L4>H1oLk9\u001cg9O4mLg9A"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v4, v10, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->どぇぞほだ(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    iget v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ:I

    add-int/2addr v3, v9

    iput v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->くし〴〺ぅ:I

    .line 13
    :goto_15d
    sget-object v3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 14
    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_197

    :try_start_165
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_168
    .catch Ljava/lang/InterruptedException; {:try_start_165 .. :try_end_168} :catch_169

    goto :goto_16a

    :catch_169
    nop

    :goto_16a
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->なぎぱいぢぎ:Landroid/net/ConnectivityManager;

    invoke-static {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/net/ConnectivityManager;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/String;

    invoke-static {v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v6, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v3, "\u001beh@f;K3>\u001bj;Oa=L3:\u001a`=\u001c`l@ej\u00191mKfnA1kJk:Mf9HdgK`<\u001b`fIj=N1iJ`j@ei\u001d"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->どぇぞほだ(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 16
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->いおてぢび(Z)V

    goto/16 :goto_0

    :cond_197
    const-wide/16 v0, 0x1388

    :try_start_199
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_19c
    .catch Ljava/lang/InterruptedException; {:try_start_199 .. :try_end_19c} :catch_19e

    goto/16 :goto_0

    :catch_19e
    nop

    goto/16 :goto_0
.end method

.method public 〺つふすそ()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    :cond_c
    return-void
.end method
