.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$ぶでにく〼〳;
.super Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/String;ILいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$ぺふねづ〺;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual/range {p1 .. p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ()Z

    move-result v3

    if-eqz v3, :cond_25

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぉざぅち〻:Ljava/util/List;

    .line 2
    iget-object v3, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    iput-object v3, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->てぜきぽく:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    .line 3
    sget-object v3, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    .line 4
    iput-object v3, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    .line 5
    iput-object v1, v2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v3, v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    .line 6
    :cond_25
    invoke-virtual/range {p1 .. p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_32

    .line 7
    check-cast v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    .line 8
    invoke-virtual {v2, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ざっざへづ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;)V

    return v4

    :cond_32
    invoke-virtual/range {p1 .. p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3d

    invoke-virtual {v2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    return v4

    :cond_3d
    invoke-virtual/range {p1 .. p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->なぎぱいぢぎ()Z

    move-result v3

    const-string v4, "tr"

    const-string v5, "thead"

    const-string v6, "th"

    const-string v7, "tfoot"

    const-string v8, "td"

    const-string v9, "col"

    const-string v10, "caption"

    const-string v11, "tbody"

    const-string v12, "colgroup"

    const-string v13, "table"

    const/4 v14, 0x3

    if-eqz v3, :cond_13b

    .line 9
    move-object v3, v1

    check-cast v3, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    .line 10
    iget-object v15, v3, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    .line 11
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6f

    invoke-virtual/range {p2 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺぁあねじ()V

    invoke-virtual/range {p2 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぉ〲なぱぽた()V

    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->は〲ぱなで(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;)Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    sget-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->てぜきぽく:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    goto :goto_a9

    :cond_6f
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7e

    invoke-virtual/range {p2 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺぁあねじ()V

    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->は〲ぱなで(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;)Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    sget-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->のぷのちつ:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    goto :goto_a9

    :cond_7e
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_90

    invoke-virtual {v2, v12}, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->びぐびあび(Ljava/lang/String;)Z

    .line 12
    iput-object v1, v2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    iget-object v3, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v3, v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    :cond_90
    new-array v9, v14, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object v11, v9, v10

    const/4 v10, 0x1

    aput-object v7, v9, v10

    const/4 v7, 0x2

    aput-object v5, v9, v7

    .line 13
    invoke-static {v15, v9}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_ad

    invoke-virtual/range {p2 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺぁあねじ()V

    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->は〲ぱなで(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;)Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    sget-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    .line 14
    :goto_a9
    iput-object v1, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    goto/16 :goto_134

    :cond_ad
    new-array v5, v14, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v8, v5, v7

    const/4 v7, 0x1

    aput-object v6, v5, v7

    const/4 v6, 0x2

    aput-object v4, v5, v6

    .line 15
    invoke-static {v15, v5}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_ca

    invoke-virtual {v2, v11}, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->びぐびあび(Ljava/lang/String;)Z

    .line 16
    iput-object v1, v2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    iget-object v3, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v3, v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    .line 17
    :cond_ca
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e2

    invoke-virtual {v2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    invoke-virtual {v2, v13}, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_134

    .line 18
    iput-object v1, v2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    iget-object v3, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v3, v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    :cond_e2
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "style"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "script"

    const/4 v6, 0x1

    aput-object v5, v4, v6

    .line 19
    invoke-static {v15, v4}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_fe

    sget-object v3, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->づざかべべ:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    .line 20
    iput-object v1, v2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v3, v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    :cond_fe
    const-string v4, "input"

    .line 21
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11f

    iget-object v4, v3, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    const-string v5, "type"

    invoke-virtual {v4, v5}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->なぎぱいぢぎ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "hidden"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_11b

    invoke-virtual/range {p0 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$ぶでにく〼〳;->びぐびあび(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    :cond_11b
    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->でどあくず(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;)Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    goto :goto_134

    :cond_11f
    const-string v4, "form"

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_136

    invoke-virtual {v2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    .line 22
    iget-object v1, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->おぐぴう〸ず:Lいいにぽつ/〺つふすそ/びぐびあび/ぺふねづ〺;

    if-eqz v1, :cond_130

    const/4 v1, 0x0

    return v1

    :cond_130
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v2, v3, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぶでにく〼〳(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;Z)Lいいにぽつ/〺つふすそ/びぐびあび/ぺふねづ〺;

    :cond_134
    :goto_134
    const/4 v1, 0x1

    return v1

    :cond_136
    invoke-virtual/range {p0 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$ぶでにく〼〳;->びぐびあび(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    :cond_13b
    invoke-virtual/range {p1 .. p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->づざかべべ()Z

    move-result v3

    const-string v14, "html"

    if-eqz v3, :cond_19b

    .line 24
    move-object v3, v1

    check-cast v3, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    .line 25
    iget-object v3, v3, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    .line 26
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_161

    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_159

    invoke-virtual {v2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    const/4 v1, 0x0

    return v1

    :cond_159
    invoke-virtual {v2, v13}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ぺづげぺが(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->〺でおいここ()V

    const/4 v1, 0x1

    return v1

    :cond_161
    const/4 v13, 0x0

    const/16 v15, 0xb

    new-array v15, v15, [Ljava/lang/String;

    const-string v16, "body"

    aput-object v16, v15, v13

    const/4 v13, 0x1

    aput-object v10, v15, v13

    const/4 v10, 0x2

    aput-object v9, v15, v10

    const/4 v9, 0x3

    aput-object v12, v15, v9

    const/4 v9, 0x4

    aput-object v14, v15, v9

    const/4 v9, 0x5

    aput-object v11, v15, v9

    const/4 v9, 0x6

    aput-object v8, v15, v9

    const/4 v8, 0x7

    aput-object v7, v15, v8

    const/16 v7, 0x8

    aput-object v6, v15, v7

    const/16 v6, 0x9

    aput-object v5, v15, v6

    const/16 v5, 0xa

    aput-object v4, v15, v5

    invoke-static {v3, v15}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_196

    invoke-virtual {v2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    const/4 v1, 0x0

    return v1

    :cond_196
    invoke-virtual/range {p0 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$ぶでにく〼〳;->びぐびあび(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1

    :cond_19b
    invoke-virtual/range {p1 .. p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->びぐびあび()Z

    move-result v3

    if-eqz v3, :cond_1b4

    invoke-virtual/range {p2 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->げつ〴ぬぐ()Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    move-result-object v1

    invoke-virtual {v1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b2

    invoke-virtual {v2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    :cond_1b2
    const/4 v1, 0x1

    return v1

    :cond_1b4
    invoke-virtual/range {p0 .. p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ$ぶでにく〼〳;->びぐびあび(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result v1

    return v1
.end method

.method public びぐびあび(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z
    .registers 10

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {p2, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;)V

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->げつ〴ぬぐ()Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    move-result-object v1

    invoke-virtual {v1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "table"

    aput-object v4, v2, v3

    const/4 v4, 0x1

    const-string v5, "tbody"

    aput-object v5, v2, v4

    const/4 v5, 0x2

    const-string v6, "tfoot"

    aput-object v6, v2, v5

    const/4 v5, 0x3

    const-string v6, "thead"

    aput-object v6, v2, v5

    const/4 v5, 0x4

    const-string v6, "tr"

    aput-object v6, v2, v5

    invoke-static {v1, v2}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3a

    .line 1
    iput-boolean v4, p2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ごづごきえ:Z

    .line 2
    iput-object p1, p2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v0, p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result p1

    .line 3
    iput-boolean v3, p2, Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;->ごづごきえ:Z

    goto :goto_40

    .line 4
    :cond_3a
    iput-object p1, p2, Lいいにぽつ/〺つふすそ/づざかべべ/てぜきぽく;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v0, p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;Lいいにぽつ/〺つふすそ/づざかべべ/〺つふすそ;)Z

    move-result p1

    :goto_40
    return p1
.end method
