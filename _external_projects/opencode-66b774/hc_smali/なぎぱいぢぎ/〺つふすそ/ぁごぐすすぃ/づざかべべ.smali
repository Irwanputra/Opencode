.class public final Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;


# direct methods
.method public static constructor <clinit>()V
    .registers 6

    .line 1
    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    if-nez v0, :cond_28

    .line 2
    new-instance v0, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v0}, L〳ぜぞぜべっ/でどあくず;-><init>()V

    .line 3
    new-instance v1, L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    invoke-direct {v1, v0}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;-><init>(L〳ぜぞぜべっ/でどあくず;)V

    .line 4
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-virtual {v1, v2, v3, v0}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->げつ〴ぬぐ(JLjava/util/concurrent/TimeUnit;)L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    const-string v4, "timeout"

    .line 5
    invoke-static {v4, v2, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->くし〴〺ぅ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v5

    iput v5, v1, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->〻ぞまぎな〻:I

    .line 6
    invoke-static {v4, v2, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->くし〴〺ぅ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v0

    iput v0, v1, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->ぉ〲なぱぽた:I

    .line 7
    new-instance v0, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v0, v1}, L〳ぜぞぜべっ/でどあくず;-><init>(L〳ぜぞぜべっ/でどあくず$〺つふすそ;)V

    .line 8
    :cond_28
    sput-object v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    return-void
.end method

.method public static 〺つふすそ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)L〳ぜぞぜべっ/なぶひせが;
    .registers 16

    :try_start_0
    new-instance v0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;-><init>()V

    invoke-virtual {p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->いいにぽつ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->づざかべべ(Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-static {v0, p0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    const-string v1, "GET"

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v0, v1, v2}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    .line 2
    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ()L〳ぜぞぜべっ/ぉ〲なぱぽた;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぅみぱぎぎ:L〳ぜぞぜべっ/でどあくず;

    if-eqz v1, :cond_39

    .line 4
    new-instance v3, L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    invoke-direct {v3, v1}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;-><init>(L〳ぜぞぜべっ/でどあくず;)V

    .line 5
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    iput-object v2, v3, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/づざかべべ;

    .line 8
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    .line 9
    iget-object v2, v3, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v1, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v1, v3}, L〳ぜぞぜべっ/でどあくず;-><init>(L〳ぜぞぜべっ/でどあくず$〺つふすそ;)V

    goto :goto_52

    .line 11
    :cond_39
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    invoke-direct {v2, v1}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;-><init>(L〳ぜぞぜべっ/でどあくず;)V

    .line 13
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ$〺つふすそ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ$〺つふすそ;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    .line 14
    iget-object v3, v2, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v1, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v1, v2}, L〳ぜぞぜべっ/でどあくず;-><init>(L〳ぜぞぜべっ/でどあくず$〺つふすそ;)V

    .line 16
    :goto_52
    invoke-virtual {v1, v0}, L〳ぜぞぜべっ/でどあくず;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた;)L〳ぜぞぜべっ/びぐびあび;

    move-result-object v0

    .line 17
    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざとぅぼこ〺:L〳ぜぞぜべっ/びぐびあび;

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    move-result-wide v2

    .line 19
    iget-object v4, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざとぅぼこ〺:L〳ぜぞぜべっ/びぐびあび;

    .line 20
    check-cast v4, L〳ぜぞぜべっ/〻ぞまぎな〻;

    invoke-virtual {v4}, L〳ぜぞぜべっ/〻ぞまぎな〻;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object v4

    .line 21
    iget-object v5, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->おぐぴう〸ず:Ljava/lang/String;

    .line 22
    iget-object v6, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぇぬぎばつ:Ljava/lang/String;

    .line 23
    invoke-static {v4, v5, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へぼ〳〻び(L〳ぜぞぜべっ/なぶひせが;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long v8, v5, v0

    .line 24
    iget-object v0, v4, L〳ぜぞぜべっ/なぶひせが;->いいにぽつ:L〳ぜぞぜべっ/なぶひせが;

    if-nez v0, :cond_a4

    .line 25
    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    move-result-wide v0

    const-wide/16 v5, -0x1

    cmp-long v7, v2, v5

    if-eqz v7, :cond_8a

    cmp-long v7, v0, v5

    if-nez v7, :cond_88

    goto :goto_8a

    :cond_88
    sub-long/2addr v0, v2

    goto :goto_90

    .line 26
    :cond_8a
    :goto_8a
    iget-object v0, v4, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 27
    invoke-virtual {v0}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v0

    :goto_90
    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    move-result-object v2

    invoke-virtual {v2, v0, v1, v8, v9}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(JJ)V

    const/4 v7, 0x0

    const-wide/16 v10, -0x1

    .line 28
    iget-object v0, v4, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 29
    invoke-virtual {v0}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v12

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぁないぼぎへ(Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;JJJZ)V
    :try_end_a4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_a4} :catch_a5

    :cond_a4
    return-object v4

    :catch_a5
    move-exception v0

    :try_start_a6
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    iget-object v3, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->おぐぴう〸ず:Ljava/lang/String;

    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    iget-object p0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぇぬぎばつ:Ljava/lang/String;

    .line 33
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_cc

    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_cc
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_cc} :catch_cc

    :catch_cc
    :cond_cc
    new-instance p0, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {p0, v0}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    throw p0
.end method

.method public static くし〴〺ぅ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)L〳ぜぞぜべっ/なぶひせが;
    .registers 18

    move-object/from16 v0, p0

    :try_start_2
    new-instance v1, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-direct {v1}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->いいにぽつ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->づざかべべ(Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-static {v1, v0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    .line 1
    iget v2, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->げつ〴ぬぐ:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_d6

    goto :goto_51

    :pswitch_18
    const-string v2, "OPTIONS"

    .line 2
    invoke-virtual {v1, v2, v3}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    goto :goto_51

    :pswitch_1e
    invoke-virtual/range {p0 .. p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぺぁあねじ()L〳ぜぞぜべっ/びえぁぜい;

    move-result-object v2

    const-string v4, "PATCH"

    .line 3
    invoke-virtual {v1, v4, v2}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    goto :goto_52

    :pswitch_28
    const-string v2, "HEAD"

    .line 4
    invoke-virtual {v1, v2, v3}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    goto :goto_51

    .line 5
    :pswitch_2e
    invoke-virtual/range {p0 .. p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぺぁあねじ()L〳ぜぞぜべっ/びえぁぜい;

    move-result-object v2

    const-string v4, "DELETE"

    .line 6
    invoke-virtual {v1, v4, v2}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    goto :goto_52

    .line 7
    :pswitch_38
    invoke-virtual/range {p0 .. p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぺぁあねじ()L〳ぜぞぜべっ/びえぁぜい;

    move-result-object v2

    const-string v4, "PUT"

    .line 8
    invoke-virtual {v1, v4, v2}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    goto :goto_52

    .line 9
    :pswitch_42
    invoke-virtual/range {p0 .. p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぺぁあねじ()L〳ぜぞぜべっ/びえぁぜい;

    move-result-object v2

    const-string v4, "POST"

    .line 10
    invoke-virtual {v1, v4, v2}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    goto :goto_52

    :pswitch_4c
    const-string v2, "GET"

    .line 11
    invoke-virtual {v1, v2, v3}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    :goto_51
    move-object v2, v3

    .line 12
    :goto_52
    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ()L〳ぜぞぜべっ/ぉ〲なぱぽた;

    move-result-object v1

    .line 13
    iget-object v4, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぅみぱぎぎ:L〳ぜぞぜべっ/でどあくず;

    if-eqz v4, :cond_70

    .line 14
    new-instance v5, L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    invoke-direct {v5, v4}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;-><init>(L〳ぜぞぜべっ/でどあくず;)V

    .line 15
    sget-object v4, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    iput-object v3, v5, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/づざかべべ;

    .line 18
    new-instance v3, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v3, v5}, L〳ぜぞぜべっ/でどあくず;-><init>(L〳ぜぞぜべっ/でどあくず$〺つふすそ;)V

    .line 19
    :goto_6b
    invoke-virtual {v3, v1}, L〳ぜぞぜべっ/でどあくず;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた;)L〳ぜぞぜべっ/びぐびあび;

    move-result-object v1

    goto :goto_73

    :cond_70
    sget-object v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    goto :goto_6b

    .line 20
    :goto_73
    iput-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざとぅぼこ〺:L〳ぜぞぜべっ/びぐびあび;

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    move-result-wide v5

    .line 22
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざとぅぼこ〺:L〳ぜぞぜべっ/びぐびあび;

    .line 23
    check-cast v0, L〳ぜぞぜべっ/〻ぞまぎな〻;

    invoke-virtual {v0}, L〳ぜぞぜべっ/〻ぞまぎな〻;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long v10, v7, v3

    .line 24
    iget-object v1, v0, L〳ぜぞぜべっ/なぶひせが;->いいにぽつ:L〳ぜぞぜべっ/なぶひせが;

    if-nez v1, :cond_cc

    .line 25
    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    move-result-wide v3

    const-wide/16 v7, -0x1

    cmp-long v1, v5, v7

    if-eqz v1, :cond_a0

    cmp-long v1, v3, v7

    if-nez v1, :cond_9e

    goto :goto_a0

    :cond_9e
    sub-long/2addr v3, v5

    goto :goto_a6

    .line 26
    :cond_a0
    :goto_a0
    iget-object v1, v0, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 27
    invoke-virtual {v1}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v3

    :goto_a6
    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v10, v11}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(JJ)V

    const/4 v9, 0x0

    if-eqz v2, :cond_c0

    invoke-virtual {v2}, L〳ぜぞぜべっ/びえぁぜい;->げつ〴ぬぐ()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c0

    invoke-virtual {v2}, L〳ぜぞぜべっ/びえぁぜい;->げつ〴ぬぐ()J

    move-result-wide v1

    move-wide v12, v1

    goto :goto_c1

    :cond_c0
    move-wide v12, v7

    .line 28
    :goto_c1
    iget-object v1, v0, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 29
    invoke-virtual {v1}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v14

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぁないぼぎへ(Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;JJJZ)V
    :try_end_cc
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_cc} :catch_cd

    :cond_cc
    return-object v0

    :catch_cd
    move-exception v0

    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    goto :goto_d5

    :goto_d4
    throw v1

    :goto_d5
    goto :goto_d4

    :pswitch_data_d6
    .packed-switch 0x0
        :pswitch_4c
        :pswitch_42
        :pswitch_38
        :pswitch_2e
        :pswitch_28
        :pswitch_1e
        :pswitch_18
    .end packed-switch
.end method

.method public static げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V
    .registers 8

    .line 1
    iget-object v0, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->じぜこほぱ:Ljava/lang/String;

    const-string v1, "User-Agent"

    if-eqz v0, :cond_19

    .line 2
    iget-object v2, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 3
    invoke-virtual {v2, v1, v0}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v3, v2, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, v2, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_19
    new-instance v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;-><init>()V

    :try_start_1e
    iget-object v2, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->〳ぜぞぜべっ:Ljava/util/HashMap;

    if-eqz v2, :cond_59

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_59

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_2a

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_48
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_57} :catch_58

    goto :goto_48

    :catch_58
    nop

    .line 6
    :cond_59
    iget-object v0, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 7
    new-instance v2, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v2}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;-><init>()V

    iget-object v3, v2, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-static {v3, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 8
    iput-object v2, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 9
    iget-object v2, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->じぜこほぱ:Ljava/lang/String;

    if-eqz v2, :cond_9d

    .line 10
    new-instance v2, Ljava/util/TreeSet;

    sget-object v3, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v2, v3}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 11
    array-length v3, v0

    div-int/lit8 v3, v3, 0x2

    const/4 v4, 0x0

    :goto_82
    if-ge v4, v3, :cond_8e

    mul-int/lit8 v5, v4, 0x2

    .line 12
    aget-object v5, v0, v5

    .line 13
    invoke-virtual {v2, v5}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_82

    :cond_8e
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 14
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9d

    .line 15
    iget-object p1, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->じぜこほぱ:Ljava/lang/String;

    .line 16
    invoke-virtual {p0, v1, p1}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    :cond_9d
    return-void
.end method

.method public static びぐびあび(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)L〳ぜぞぜべっ/なぶひせが;
    .registers 5

    :try_start_0
    new-instance v0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;-><init>()V

    invoke-virtual {p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->いいにぽつ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->づざかべべ(Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-static {v0, p0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    invoke-virtual {p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->〳ぜぞぜべっ()L〳ぜぞぜべっ/びえぁぜい;

    move-result-object v1

    invoke-virtual {v1}, L〳ぜぞぜべっ/びえぁぜい;->げつ〴ぬぐ()J

    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;

    .line 1
    new-instance v3, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/くし〴〺ぅ;

    invoke-direct {v3, p0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/くし〴〺ぅ;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V

    .line 2
    invoke-direct {v2, v1, v3}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;-><init>(L〳ぜぞぜべっ/びえぁぜい;Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;)V

    const-string v1, "POST"

    .line 3
    invoke-virtual {v0, v1, v2}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;L〳ぜぞぜべっ/びえぁぜい;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    .line 4
    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ()L〳ぜぞぜべっ/ぉ〲なぱぽた;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぅみぱぎぎ:L〳ぜぞぜべっ/でどあくず;

    if-eqz v1, :cond_44

    .line 6
    new-instance v2, L〳ぜぞぜべっ/でどあくず$〺つふすそ;

    invoke-direct {v2, v1}, L〳ぜぞぜべっ/でどあくず$〺つふすそ;-><init>(L〳ぜぞぜべっ/でどあくず;)V

    .line 7
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 9
    iput-object v1, v2, L〳ぜぞぜべっ/でどあくず$〺つふすそ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/づざかべべ;

    .line 10
    new-instance v1, L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v1, v2}, L〳ぜぞぜべっ/でどあくず;-><init>(L〳ぜぞぜべっ/でどあくず$〺つふすそ;)V

    .line 11
    :goto_3f
    invoke-virtual {v1, v0}, L〳ぜぞぜべっ/でどあくず;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた;)L〳ぜぞぜべっ/びぐびあび;

    move-result-object v0

    goto :goto_47

    :cond_44
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    goto :goto_3f

    .line 12
    :goto_47
    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざとぅぼこ〺:L〳ぜぞぜべっ/びぐびあび;

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    iget-object p0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ざとぅぼこ〺:L〳ぜぞぜべっ/びぐびあび;

    .line 15
    check-cast p0, L〳ぜぞぜべっ/〻ぞまぎな〻;

    invoke-virtual {p0}, L〳ぜぞぜべっ/〻ぞまぎな〻;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_57
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_57} :catch_58

    return-object p0

    :catch_58
    move-exception p0

    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    goto :goto_60

    :goto_5f
    throw v0

    :goto_60
    goto :goto_5f
.end method
