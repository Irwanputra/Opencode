.class public final L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements L〳ぜぞぜべっ/は〲ぱなで;


# instance fields
.field public final 〺つふすそ:Z

.field public volatile くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

.field public volatile づざかべべ:Z

.field public びぐびあび:Ljava/lang/Object;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/でどあくず;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    iput-boolean p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ:Z

    return-void
.end method


# virtual methods
.method public final 〺つふすそ(L〳ぜぞぜべっ/ざとぅぼこ〺;)L〳ぜぞぜべっ/げつ〴ぬぐ;
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    const-string v3, "https"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1b

    .line 2
    iget-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 3
    iget-object v3, v2, L〳ぜぞぜべっ/でどあくず;->のぷのちつ:Ljavax/net/ssl/SSLSocketFactory;

    .line 4
    iget-object v4, v2, L〳ぜぞぜべっ/でどあくず;->おぐぴう〸ず:Ljavax/net/ssl/HostnameVerifier;

    .line 5
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->ぇぬぎばつ:L〳ぜぞぜべっ/づざかべべ;

    move-object v12, v2

    move-object v10, v3

    move-object v11, v4

    goto :goto_1e

    :cond_1b
    move-object v10, v3

    move-object v11, v10

    move-object v12, v11

    .line 6
    :goto_1e
    new-instance v2, L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 7
    iget-object v6, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 8
    iget v7, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    .line 9
    iget-object v1, v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 10
    iget-object v8, v1, L〳ぜぞぜべっ/でどあくず;->ごづごきえ:L〳ぜぞぜべっ/てぜきぽく;

    .line 11
    iget-object v9, v1, L〳ぜぞぜべっ/でどあくず;->てぜきぽく:Ljavax/net/SocketFactory;

    .line 12
    iget-object v13, v1, L〳ぜぞぜべっ/でどあくず;->ぉざぅち〻:L〳ぜぞぜべっ/〺つふすそ;

    .line 13
    iget-object v14, v1, L〳ぜぞぜべっ/でどあくず;->くし〴〺ぅ:Ljava/net/Proxy;

    .line 14
    iget-object v15, v1, L〳ぜぞぜべっ/でどあくず;->びぐびあび:Ljava/util/List;

    .line 15
    iget-object v3, v1, L〳ぜぞぜべっ/でどあくず;->づざかべべ:Ljava/util/List;

    .line 16
    iget-object v1, v1, L〳ぜぞぜべっ/でどあくず;->ぺぁあねじ:Ljava/net/ProxySelector;

    move-object v5, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v1

    .line 17
    invoke-direct/range {v5 .. v17}, L〳ぜぞぜべっ/げつ〴ぬぐ;-><init>(Ljava/lang/String;IL〳ぜぞぜべっ/てぜきぽく;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;L〳ぜぞぜべっ/づざかべべ;L〳ぜぞぜべっ/〺つふすそ;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v2
.end method

.method public final くし〴〺ぅ(Ljava/io/IOException;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;ZL〳ぜぞぜべっ/ぉ〲なぱぽた;)Z
    .registers 7

    invoke-virtual {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〳ぜぞぜべっ(Ljava/io/IOException;)V

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 1
    iget-boolean v0, v0, L〳ぜぞぜべっ/でどあくず;->ぶでにく〼〳:Z

    const/4 v1, 0x0

    if-nez v0, :cond_b

    return v1

    :cond_b
    if-eqz p3, :cond_f

    .line 2
    iget-object p4, p4, L〳ぜぞぜべっ/ぉ〲なぱぽた;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    .line 3
    :cond_f
    instance-of p4, p1, Ljava/net/ProtocolException;

    const/4 v0, 0x1

    if-eqz p4, :cond_15

    goto :goto_31

    :cond_15
    instance-of p4, p1, Ljava/io/InterruptedIOException;

    if-eqz p4, :cond_20

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_31

    if-nez p3, :cond_31

    goto :goto_33

    :cond_20
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_2d

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_2d

    goto :goto_31

    :cond_2d
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_33

    :cond_31
    :goto_31
    const/4 p1, 0x0

    goto :goto_34

    :cond_33
    :goto_33
    const/4 p1, 0x1

    :goto_34
    if-nez p1, :cond_37

    return v1

    .line 4
    :cond_37
    iget-object p1, p2, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    if-nez p1, :cond_50

    iget-object p1, p2, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;

    if-eqz p1, :cond_45

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ()Z

    move-result p1

    if-nez p1, :cond_50

    :cond_45
    iget-object p1, p2, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ()Z

    move-result p1

    if-eqz p1, :cond_4e

    goto :goto_50

    :cond_4e
    const/4 p1, 0x0

    goto :goto_51

    :cond_50
    :goto_50
    const/4 p1, 0x1

    :goto_51
    if-nez p1, :cond_54

    return v1

    :cond_54
    return v0
.end method

.method public げつ〴ぬぐ(L〳ぜぞぜべっ/は〲ぱなで$げつ〴ぬぐ;)L〳ぜぞぜべっ/なぶひせが;
    .registers 16

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;

    .line 1
    iget-object v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 2
    iget-object v7, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->ぁごぐすすぃ:L〳ぜぞぜべっ/びぐびあび;

    .line 3
    iget-object v8, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 4
    new-instance v9, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 5
    iget-object v2, v1, L〳ぜぞぜべっ/でどあくず;->は〲ぱなで:L〳ぜぞぜべっ/ぁごぐすすぃ;

    .line 6
    iget-object v1, v0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 7
    invoke-virtual {p0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ(L〳ぜぞぜべっ/ざとぅぼこ〺;)L〳ぜぞぜべっ/げつ〴ぬぐ;

    move-result-object v3

    iget-object v6, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->びぐびあび:Ljava/lang/Object;

    move-object v1, v9

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(L〳ぜぞぜべっ/ぁごぐすすぃ;L〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;Ljava/lang/Object;)V

    iput-object v9, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    move-object v2, v11

    :goto_22
    iget-boolean v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->づざかべべ:Z

    if-nez v3, :cond_217

    const/4 v3, 0x1

    :try_start_27
    invoke-virtual {p1, v0, v9, v11, v11}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〺つふすそ(L〳ぜぞぜべっ/ぉ〲なぱぽた;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;)L〳ぜぞぜべっ/なぶひせが;

    move-result-object v0
    :try_end_2b
    .catch L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ; {:try_start_27 .. :try_end_2b} :catch_202
    .catch Ljava/io/IOException; {:try_start_27 .. :try_end_2b} :catch_1f2
    .catchall {:try_start_27 .. :try_end_2b} :catchall_1f0

    if-eqz v2, :cond_50

    .line 8
    new-instance v4, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    invoke-direct {v4, v0}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/なぶひせが;)V

    new-instance v0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    invoke-direct {v0, v2}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/なぶひせが;)V

    .line 9
    iput-object v11, v0, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 10
    invoke-virtual {v0}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object v0

    .line 11
    iget-object v2, v0, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    if-nez v2, :cond_48

    .line 12
    iput-object v0, v4, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->いいにぽつ:L〳ぜぞぜべっ/なぶひせが;

    .line 13
    invoke-virtual {v4}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object v0

    goto :goto_50

    .line 14
    :cond_48
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_50
    :goto_50
    iget-object v2, v9, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 16
    iget v4, v0, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    .line 17
    iget-object v5, v0, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 18
    iget-object v5, v5, L〳ぜぞぜべっ/ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/String;

    const/16 v6, 0x133

    const-string v12, "GET"

    if-eq v4, v6, :cond_ce

    const/16 v6, 0x134

    if-eq v4, v6, :cond_ce

    const/16 v6, 0x191

    if-eq v4, v6, :cond_c6

    const/16 v6, 0x1f7

    if-eq v4, v6, :cond_af

    const/16 v6, 0x197

    if-eq v4, v6, :cond_91

    const/16 v2, 0x198

    if-eq v4, v2, :cond_77

    packed-switch v4, :pswitch_data_224

    goto/16 :goto_128

    .line 19
    :cond_77
    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 20
    iget-boolean v3, v3, L〳ぜぞぜべっ/でどあくず;->ぶでにく〼〳:Z

    if-nez v3, :cond_7f

    goto/16 :goto_128

    .line 21
    :cond_7f
    iget-object v3, v0, L〳ぜぞぜべっ/なぶひせが;->ぺふねづ〺:L〳ぜぞぜべっ/なぶひせが;

    if-eqz v3, :cond_89

    .line 22
    iget v3, v3, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    if-ne v3, v2, :cond_89

    goto/16 :goto_128

    .line 23
    :cond_89
    invoke-virtual {p0, v0, v10}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->びぐびあび(L〳ぜぞぜべっ/なぶひせが;I)I

    move-result v2

    if-lez v2, :cond_c2

    goto/16 :goto_128

    :cond_91
    if-eqz v2, :cond_96

    .line 24
    iget-object v2, v2, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    goto :goto_9a

    .line 25
    :cond_96
    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 26
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->くし〴〺ぅ:Ljava/net/Proxy;

    .line 27
    :goto_9a
    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_a7

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 28
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->ぉざぅち〻:L〳ぜぞぜべっ/〺つふすそ;

    goto :goto_ca

    .line 29
    :cond_a7
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :cond_af
    iget-object v2, v0, L〳ぜぞぜべっ/なぶひせが;->ぺふねづ〺:L〳ぜぞぜべっ/なぶひせが;

    if-eqz v2, :cond_b9

    .line 31
    iget v2, v2, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    if-ne v2, v6, :cond_b9

    goto/16 :goto_128

    :cond_b9
    const v2, 0x7fffffff

    .line 32
    invoke-virtual {p0, v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->びぐびあび(L〳ぜぞぜべっ/なぶひせが;I)I

    move-result v2

    if-nez v2, :cond_128

    .line 33
    :cond_c2
    iget-object v2, v0, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    goto/16 :goto_17d

    .line 34
    :cond_c6
    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 35
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->ざとぅぼこ〺:L〳ぜぞぜべっ/〺つふすそ;

    .line 36
    :goto_ca
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_128

    :cond_ce
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_dd

    const-string v2, "HEAD"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_dd

    goto :goto_128

    :cond_dd
    :pswitch_dd
    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 37
    iget-boolean v2, v2, L〳ぜぞぜべっ/でどあくず;->でどあくず:Z

    if-nez v2, :cond_e4

    goto :goto_128

    .line 38
    :cond_e4
    iget-object v2, v0, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v4, "Location"

    invoke-virtual {v2, v4}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_ef

    goto :goto_f0

    :cond_ef
    move-object v2, v11

    :goto_f0
    if-nez v2, :cond_f3

    goto :goto_128

    .line 39
    :cond_f3
    iget-object v4, v0, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 40
    iget-object v4, v4, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    new-instance v6, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;

    invoke-direct {v6}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;-><init>()V

    invoke-virtual {v6, v4, v2}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ(L〳ぜぞぜべっ/ざとぅぼこ〺;Ljava/lang/String;)L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    move-result-object v2

    sget-object v4, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    if-ne v2, v4, :cond_108

    goto :goto_109

    :cond_108
    move-object v6, v11

    :goto_109
    if-eqz v6, :cond_110

    .line 43
    invoke-virtual {v6}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/ざとぅぼこ〺;

    move-result-object v2

    goto :goto_111

    :cond_110
    move-object v2, v11

    :goto_111
    if-nez v2, :cond_114

    goto :goto_128

    .line 44
    :cond_114
    iget-object v4, v2, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    .line 45
    iget-object v6, v0, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 46
    iget-object v6, v6, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 47
    iget-object v6, v6, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    .line 48
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12a

    iget-object v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 49
    iget-boolean v4, v4, L〳ぜぞぜべっ/でどあくず;->ざっざへづ:Z

    if-nez v4, :cond_12a

    :cond_128
    :goto_128
    move-object v12, v11

    goto :goto_17e

    .line 50
    :cond_12a
    iget-object v4, v0, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 51
    new-instance v6, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-direct {v6, v4}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/ぉ〲なぱぽた;)V

    .line 52
    invoke-static {v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->な〱ちぉじ(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_16a

    const-string v4, "PROPFIND"

    .line 53
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    .line 54
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v3, v4

    if-eqz v3, :cond_148

    .line 55
    invoke-virtual {v6, v12, v11}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    goto :goto_153

    :cond_148
    if-eqz v13, :cond_14f

    .line 56
    iget-object v3, v0, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 57
    iget-object v3, v3, L〳ぜぞぜべっ/ぉ〲なぱぽた;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    goto :goto_150

    :cond_14f
    move-object v3, v11

    .line 58
    :goto_150
    invoke-virtual {v6, v5, v3}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    :goto_153
    if-nez v13, :cond_16a

    .line 59
    iget-object v3, v6, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    const-string v4, "Transfer-Encoding"

    invoke-virtual {v3, v4}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    iget-object v3, v6, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    const-string v4, "Content-Length"

    invoke-virtual {v3, v4}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    iget-object v3, v6, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    const-string v4, "Content-Type"

    invoke-virtual {v3, v4}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 60
    :cond_16a
    invoke-virtual {p0, v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->づざかべべ(L〳ぜぞぜべっ/なぶひせが;L〳ぜぞぜべっ/ざとぅぼこ〺;)Z

    move-result v3

    if-nez v3, :cond_177

    .line 61
    iget-object v3, v6, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    const-string v4, "Authorization"

    invoke-virtual {v3, v4}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 62
    :cond_177
    iput-object v2, v6, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 63
    invoke-virtual {v6}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ()L〳ぜぞぜべっ/ぉ〲なぱぽた;

    move-result-object v2

    :goto_17d
    move-object v12, v2

    :goto_17e
    if-nez v12, :cond_188

    .line 64
    iget-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ:Z

    if-nez p1, :cond_187

    invoke-virtual {v9}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_187
    return-object v0

    .line 65
    :cond_188
    iget-object v2, v0, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 66
    invoke-static {v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->づざかべべ(Ljava/io/Closeable;)V

    add-int/lit8 v13, v1, 0x1

    const/16 v1, 0x14

    if-gt v13, v1, :cond_1e1

    .line 67
    iget-object v1, v12, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 68
    invoke-virtual {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->づざかべべ(L〳ぜぞぜべっ/なぶひせが;L〳ぜぞぜべっ/ざとぅぼこ〺;)Z

    move-result v1

    if-nez v1, :cond_1b5

    invoke-virtual {v9}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->ぁごぐすすぃ()V

    new-instance v9, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 69
    iget-object v2, v1, L〳ぜぞぜべっ/でどあくず;->は〲ぱなで:L〳ぜぞぜべっ/ぁごぐすすぃ;

    .line 70
    iget-object v1, v12, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 71
    invoke-virtual {p0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ(L〳ぜぞぜべっ/ざとぅぼこ〺;)L〳ぜぞぜべっ/げつ〴ぬぐ;

    move-result-object v3

    iget-object v6, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->びぐびあび:Ljava/lang/Object;

    move-object v1, v9

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(L〳ぜぞぜべっ/ぁごぐすすぃ;L〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;Ljava/lang/Object;)V

    iput-object v9, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    goto :goto_1bd

    .line 72
    :cond_1b5
    iget-object v1, v9, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->びぐびあび:L〳ぜぞぜべっ/ぁごぐすすぃ;

    monitor-enter v1

    :try_start_1b8
    iget-object v2, v9, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->へぬ〴づぞ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;

    monitor-exit v1
    :try_end_1bb
    .catchall {:try_start_1b8 .. :try_end_1bb} :catchall_1de

    if-nez v2, :cond_1c2

    :goto_1bd
    move-object v2, v0

    move-object v0, v12

    move v1, v13

    goto/16 :goto_22

    .line 73
    :cond_1c2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closing the body of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " didn\'t close its backing stream. Bad interceptor?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1de
    move-exception p1

    .line 74
    :try_start_1df
    monitor-exit v1
    :try_end_1e0
    .catchall {:try_start_1df .. :try_end_1e0} :catchall_1de

    throw p1

    .line 75
    :cond_1e1
    invoke-virtual {v9}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->ぁごぐすすぃ()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Too many follow-up requests: "

    invoke-static {v0, v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1f0
    move-exception p1

    goto :goto_210

    :catch_1f2
    move-exception v4

    :try_start_1f3
    instance-of v5, v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/げつ〴ぬぐ;

    if-nez v5, :cond_1f8

    goto :goto_1f9

    :cond_1f8
    const/4 v3, 0x0

    :goto_1f9
    invoke-virtual {p0, v4, v9, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->くし〴〺ぅ(Ljava/io/IOException;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;ZL〳ぜぞぜべっ/ぉ〲なぱぽた;)Z

    move-result v3

    if-eqz v3, :cond_201

    goto/16 :goto_22

    :cond_201
    throw v4

    :catch_202
    move-exception v3

    .line 76
    iget-object v4, v3, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;->〺つふすそ:Ljava/io/IOException;

    .line 77
    invoke-virtual {p0, v4, v9, v10, v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->くし〴〺ぅ(Ljava/io/IOException;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;ZL〳ぜぞぜべっ/ぉ〲なぱぽた;)Z

    move-result v4

    if-eqz v4, :cond_20d

    goto/16 :goto_22

    .line 78
    :cond_20d
    iget-object p1, v3, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;->〺つふすそ:Ljava/io/IOException;

    .line 79
    throw p1
    :try_end_210
    .catchall {:try_start_1f3 .. :try_end_210} :catchall_1f0

    :goto_210
    invoke-virtual {v9, v11}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〳ぜぞぜべっ(Ljava/io/IOException;)V

    invoke-virtual {v9}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->ぁごぐすすぃ()V

    throw p1

    :cond_217
    invoke-virtual {v9}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->ぁごぐすすぃ()V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_223

    :goto_222
    throw p1

    :goto_223
    goto :goto_222

    :pswitch_data_224
    .packed-switch 0x12c
        :pswitch_dd
        :pswitch_dd
        :pswitch_dd
        :pswitch_dd
    .end packed-switch
.end method

.method public final づざかべべ(L〳ぜぞぜべっ/なぶひせが;L〳ぜぞぜべっ/ざとぅぼこ〺;)Z
    .registers 5

    .line 1
    iget-object p1, p1, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 2
    iget-object p1, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 3
    iget-object v0, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    iget-object v1, p2, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 5
    iget v0, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    iget v1, p2, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    if-ne v0, v1, :cond_20

    .line 6
    iget-object p1, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    iget-object p2, p2, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_20

    const/4 p1, 0x1

    goto :goto_21

    :cond_20
    const/4 p1, 0x0

    :goto_21
    return p1
.end method

.method public final びぐびあび(L〳ぜぞぜべっ/なぶひせが;I)I
    .registers 4

    .line 1
    iget-object p1, p1, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v0, "Retry-After"

    invoke-virtual {p1, v0}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    if-nez p1, :cond_f

    return p2

    :cond_f
    const-string p2, "\\d+"

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_20

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_20
    const p1, 0x7fffffff

    return p1
.end method
