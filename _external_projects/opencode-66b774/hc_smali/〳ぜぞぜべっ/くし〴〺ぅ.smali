.class public final L〳ぜぞぜべっ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〳ぜぞぜべっ:I

.field public final 〺つふすそ:Z

.field public final ぁごぐすすぃ:Z

.field public final いいにぽつ:Z

.field public final くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Z

.field public final づざかべべ:Z

.field public final てぜきぽく:Z

.field public final なぎぱいぢぎ:Z

.field public のぷのちつ:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final びぐびあび:I

.field public final ぺぁあねじ:I

.field public final ぺふねづ〺:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const v1, 0x7fffffff

    int-to-long v1, v1

    .line 1
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    return-void
.end method

.method public constructor <init>(ZZIIZZZIIZZZLjava/lang/String;)V
    .registers 14
    .param p13    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->げつ〴ぬぐ:Z

    iput-boolean p2, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->〺つふすそ:Z

    iput p3, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:I

    iput p4, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->びぐびあび:I

    iput-boolean p5, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->づざかべべ:Z

    iput-boolean p6, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->なぎぱいぢぎ:Z

    iput-boolean p7, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->ぁごぐすすぃ:Z

    iput p8, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->〳ぜぞぜべっ:I

    iput p9, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->ぺぁあねじ:I

    iput-boolean p10, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->いいにぽつ:Z

    iput-boolean p11, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->ぺふねづ〺:Z

    iput-boolean p12, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->てぜきぽく:Z

    iput-object p13, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->のぷのちつ:Ljava/lang/String;

    return-void
.end method

.method public static げつ〴ぬぐ(L〳ぜぞぜべっ/ぉざぅち〻;)L〳ぜぞぜべっ/くし〴〺ぅ;
    .registers 23

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, L〳ぜぞぜべっ/ぉざぅち〻;->づざかべべ()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, -0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_1a
    if-ge v6, v1, :cond_150

    invoke-virtual {v0, v6}, L〳ぜぞぜべっ/ぉざぅち〻;->〺つふすそ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v6}, L〳ぜぞぜべっ/ぉざぅち〻;->なぎぱいぢぎ(I)Ljava/lang/String;

    move-result-object v4

    const-string v3, "Cache-Control"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_31

    if-eqz v8, :cond_2f

    goto :goto_39

    :cond_2f
    move-object v8, v4

    goto :goto_3a

    :cond_31
    const-string v3, "Pragma"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_149

    :goto_39
    const/4 v7, 0x0

    :goto_3a
    const/4 v2, 0x0

    :goto_3b
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_149

    const-string v3, "=,;"

    invoke-static {v4, v2, v3}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->づざかべべ(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v3, v5, :cond_a9

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v0, 0x2c

    if-eq v5, v0, :cond_a9

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x3b

    if-ne v0, v5, :cond_79

    goto :goto_a9

    .line 1
    :goto_66
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v3, v0, :cond_7c

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x20

    if-eq v0, v5, :cond_79

    const/16 v5, 0x9

    if-eq v0, v5, :cond_79

    goto :goto_7c

    :cond_79
    add-int/lit8 v3, v3, 0x1

    goto :goto_66

    .line 2
    :cond_7c
    :goto_7c
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v3, v0, :cond_99

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x22

    if-ne v0, v5, :cond_99

    add-int/lit8 v3, v3, 0x1

    const-string v0, "\""

    invoke-static {v4, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->づざかべべ(Ljava/lang/String;ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    add-int/2addr v0, v5

    goto :goto_ae

    :cond_99
    const/4 v5, 0x1

    const-string v0, ",;"

    invoke-static {v4, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->づざかべべ(Ljava/lang/String;ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    goto :goto_ae

    :cond_a9
    :goto_a9
    const/4 v5, 0x1

    add-int/lit8 v3, v3, 0x1

    move v0, v3

    const/4 v3, 0x0

    :goto_ae
    const-string v5, "no-cache"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_ba

    const/4 v5, -0x1

    const/4 v9, 0x1

    goto/16 :goto_144

    :cond_ba
    const-string v5, "no-store"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c6

    const/4 v5, -0x1

    const/4 v10, 0x1

    goto/16 :goto_144

    :cond_c6
    const-string v5, "max-age"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d5

    const/4 v5, -0x1

    invoke-static {v3, v5}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;I)I

    move-result v11

    goto/16 :goto_144

    :cond_d5
    const-string v5, "s-maxage"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e3

    const/4 v5, -0x1

    invoke-static {v3, v5}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;I)I

    move-result v12

    goto :goto_144

    :cond_e3
    const-string v5, "private"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_ee

    const/4 v5, -0x1

    const/4 v13, 0x1

    goto :goto_144

    :cond_ee
    const-string v5, "public"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f9

    const/4 v5, -0x1

    const/4 v14, 0x1

    goto :goto_144

    :cond_f9
    const-string v5, "must-revalidate"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_104

    const/4 v5, -0x1

    const/4 v15, 0x1

    goto :goto_144

    :cond_104
    const-string v5, "max-stale"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_115

    const v2, 0x7fffffff

    invoke-static {v3, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;I)I

    move-result v16

    const/4 v5, -0x1

    goto :goto_144

    :cond_115
    const-string v5, "min-fresh"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_123

    const/4 v5, -0x1

    invoke-static {v3, v5}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;I)I

    move-result v17

    goto :goto_144

    :cond_123
    const/4 v5, -0x1

    const-string v3, "only-if-cached"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12f

    const/16 v18, 0x1

    goto :goto_144

    :cond_12f
    const-string v3, "no-transform"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13a

    const/16 v19, 0x1

    goto :goto_144

    :cond_13a
    const-string v3, "immutable"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_144

    const/16 v20, 0x1

    :cond_144
    :goto_144
    move v2, v0

    move-object/from16 v0, p0

    goto/16 :goto_3b

    :cond_149
    const/4 v5, -0x1

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_1a

    :cond_150
    if-nez v7, :cond_155

    const/16 v21, 0x0

    goto :goto_157

    :cond_155
    move-object/from16 v21, v8

    :goto_157
    new-instance v0, L〳ぜぞぜべっ/くし〴〺ぅ;

    move-object v8, v0

    invoke-direct/range {v8 .. v21}, L〳ぜぞぜべっ/くし〴〺ぅ;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->のぷのちつ:Ljava/lang/String;

    if-eqz v0, :cond_6

    goto/16 :goto_b6

    .line 1
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->げつ〴ぬぐ:Z

    if-eqz v1, :cond_14

    const-string v1, "no-cache, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->〺つふすそ:Z

    if-eqz v1, :cond_1d

    const-string v1, "no-store, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1d
    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:I

    const-string v2, ", "

    const/4 v3, -0x1

    if-eq v1, v3, :cond_31

    const-string v1, "max-age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_31
    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->びぐびあび:I

    if-eq v1, v3, :cond_42

    const-string v1, "s-maxage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_42
    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->づざかべべ:Z

    if-eqz v1, :cond_4b

    const-string v1, "private, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4b
    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->なぎぱいぢぎ:Z

    if-eqz v1, :cond_54

    const-string v1, "public, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_54
    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_5d

    const-string v1, "must-revalidate, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5d
    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->〳ぜぞぜべっ:I

    if-eq v1, v3, :cond_6e

    const-string v1, "max-stale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->〳ぜぞぜべっ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6e
    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->ぺぁあねじ:I

    if-eq v1, v3, :cond_7f

    const-string v1, "min-fresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->ぺぁあねじ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7f
    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->いいにぽつ:Z

    if-eqz v1, :cond_88

    const-string v1, "only-if-cached, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_88
    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->ぺふねづ〺:Z

    if-eqz v1, :cond_91

    const-string v1, "no-transform, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_91
    iget-boolean v1, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->てぜきぽく:Z

    if-eqz v1, :cond_9a

    const-string v1, "immutable, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_a3

    const-string v0, ""

    goto :goto_b4

    :cond_a3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    :goto_b4
    iput-object v0, p0, L〳ぜぞぜべっ/くし〴〺ぅ;->のぷのちつ:Ljava/lang/String;

    :goto_b6
    return-object v0
.end method
