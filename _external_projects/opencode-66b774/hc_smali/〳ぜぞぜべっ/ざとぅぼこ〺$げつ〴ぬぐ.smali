.class public final L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ざとぅぼこ〺;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public 〺つふすそ:Ljava/lang/String;

.field public ぁごぐすすぃ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public くし〴〺ぅ:Ljava/lang/String;

.field public げつ〴ぬぐ:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public づざかべべ:I

.field public final なぎぱいぢぎ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    iput-object v0, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->づざかべべ:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/16 v2, 0x3a

    if-eqz v1, :cond_21

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3b

    :cond_21
    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_36

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_36
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3b
    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_54

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_59

    :cond_54
    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    :goto_59
    iget v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->づざかべべ:I

    if-eq v1, v3, :cond_5e

    goto :goto_64

    :cond_5e
    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-static {v1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび(Ljava/lang/String;)I

    move-result v1

    .line 2
    :goto_64
    iget-object v3, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-static {v3}, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび(Ljava/lang/String;)I

    move-result v3

    if-eq v1, v3, :cond_72

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_72
    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_79
    if-ge v3, v2, :cond_8c

    const/16 v4, 0x2f

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_79

    .line 4
    :cond_8c
    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/util/List;

    if-eqz v1, :cond_9a

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/util/List;

    invoke-static {v0, v1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->いいにぽつ(Ljava/lang/StringBuilder;Ljava/util/List;)V

    :cond_9a
    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/lang/String;

    if-eqz v1, :cond_a8

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(Ljava/lang/String;)L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;
    .registers 8
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_12

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const-string v1, " \"\'<>#"

    move-object v0, p1

    invoke-static/range {v0 .. v5}, L〳ぜぞぜべっ/ざとぅぼこ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->ぇぬぎばつ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    goto :goto_13

    :cond_12
    const/4 p1, 0x0

    :goto_13
    iput-object p1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/util/List;

    return-object p0
.end method

.method public くし〴〺ぅ(L〳ぜぞぜべっ/ざとぅぼこ〺;Ljava/lang/String;)L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;
    .registers 36
    .param p1    # L〳ぜぞぜべっ/ざとぅぼこ〺;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v11, 0x0

    invoke-static {v10, v11, v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->でどあくず(Ljava/lang/String;II)I

    move-result v8

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v10, v8, v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぶでにく〼〳(Ljava/lang/String;II)I

    move-result v12

    sub-int v2, v12, v8

    const/4 v9, 0x2

    const/16 v13, 0x3a

    const/4 v14, -0x1

    const/4 v15, 0x1

    if-ge v2, v9, :cond_22

    :cond_20
    :goto_20
    const/4 v2, -0x1

    goto :goto_62

    .line 1
    :cond_22
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5a

    const/16 v4, 0x7a

    const/16 v5, 0x41

    const/16 v6, 0x61

    if-lt v2, v6, :cond_32

    if-le v2, v4, :cond_37

    :cond_32
    if-lt v2, v5, :cond_20

    if-le v2, v3, :cond_37

    goto :goto_20

    :cond_37
    move v2, v8

    :goto_38
    add-int/2addr v2, v15

    if-ge v2, v12, :cond_20

    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_43

    if-le v7, v4, :cond_5f

    :cond_43
    if-lt v7, v5, :cond_47

    if-le v7, v3, :cond_5f

    :cond_47
    const/16 v3, 0x30

    if-lt v7, v3, :cond_4f

    const/16 v3, 0x39

    if-le v7, v3, :cond_5f

    :cond_4f
    const/16 v3, 0x2b

    if-eq v7, v3, :cond_5f

    const/16 v3, 0x2d

    if-eq v7, v3, :cond_5f

    const/16 v3, 0x2e

    if-ne v7, v3, :cond_5c

    goto :goto_5f

    :cond_5c
    if-ne v7, v13, :cond_20

    goto :goto_62

    :cond_5f
    :goto_5f
    const/16 v3, 0x5a

    goto :goto_38

    :goto_62
    if-eq v2, v14, :cond_91

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x6

    const-string v5, "https:"

    move-object/from16 v2, p2

    move v4, v8

    .line 2
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_79

    const-string v2, "https"

    iput-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    add-int/lit8 v8, v8, 0x6

    goto :goto_97

    :cond_79
    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-string v5, "http:"

    move-object/from16 v2, p2

    move v4, v8

    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_8e

    const-string v2, "http"

    iput-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    add-int/lit8 v8, v8, 0x5

    goto :goto_97

    :cond_8e
    sget-object v1, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    return-object v1

    :cond_91
    if-eqz v1, :cond_358

    iget-object v2, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    :goto_97
    move v2, v8

    const/4 v3, 0x0

    :goto_99
    const/16 v7, 0x2f

    const/16 v6, 0x5c

    if-ge v2, v12, :cond_ac

    .line 3
    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v6, :cond_a7

    if-ne v4, v7, :cond_ac

    :cond_a7
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_99

    :cond_ac
    const/16 v5, 0x3f

    const/16 v4, 0x23

    if-ge v3, v9, :cond_f3

    if-eqz v1, :cond_f3

    .line 4
    iget-object v2, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    iget-object v9, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_bf

    goto :goto_f3

    :cond_bf
    invoke-virtual/range {p1 .. p1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    iget-object v2, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    iput-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    iget v2, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    iput v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->づざかべべ:I

    iget-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->ぁごぐすすぃ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-eq v8, v12, :cond_e9

    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_f0

    :cond_e9
    invoke-virtual/range {p1 .. p1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->〳ぜぞぜべっ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ(Ljava/lang/String;)L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;

    :cond_f0
    const/4 v1, 0x0

    goto/16 :goto_219

    :cond_f3
    :goto_f3
    add-int/2addr v8, v3

    move v2, v8

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_f9
    const-string v1, "@/\\?#"

    invoke-static {v10, v2, v12, v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->いいにぽつ(Ljava/lang/String;IILjava/lang/String;)I

    move-result v9

    if-eq v9, v12, :cond_106

    invoke-virtual {v10, v9}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_107

    :cond_106
    const/4 v1, -0x1

    :goto_107
    if-eq v1, v14, :cond_1ab

    if-eq v1, v4, :cond_1ab

    if-eq v1, v7, :cond_1ab

    if-eq v1, v6, :cond_1ab

    if-eq v1, v5, :cond_1ab

    const/16 v3, 0x40

    if-eq v1, v3, :cond_117

    goto/16 :goto_19e

    :cond_117
    const-string v8, "%40"

    if-nez v16, :cond_174

    invoke-static {v10, v2, v9, v13}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ(Ljava/lang/String;IIC)I

    move-result v3

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const-string v23, " \"\':;<=>@[]^`{}|/\\?#"

    move-object/from16 v1, p2

    move/from16 p1, v3

    move-object/from16 v4, v23

    move/from16 v5, v18

    move/from16 v6, v19

    move/from16 v7, v20

    move-object v14, v8

    move/from16 v8, v21

    move v11, v9

    move-object/from16 v9, v22

    invoke-static/range {v1 .. v9}, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    if-eqz v17, :cond_157

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_157
    iput-object v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    move/from16 v1, p1

    if-eq v1, v11, :cond_171

    add-int/lit8 v2, v1, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    move-object/from16 v1, p2

    move v3, v11

    invoke-static/range {v1 .. v9}, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    const/16 v16, 0x1

    :cond_171
    const/16 v17, 0x1

    goto :goto_19c

    :cond_174
    move-object v14, v8

    move v11, v9

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v14, 0x0

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    move-object/from16 v1, p2

    move v3, v11

    move-object v15, v9

    move-object v9, v14

    invoke-static/range {v1 .. v9}, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    :goto_19c
    add-int/lit8 v2, v11, 0x1

    :goto_19e
    const/16 v4, 0x23

    const/16 v5, 0x3f

    const/16 v6, 0x5c

    const/16 v7, 0x2f

    const/4 v11, 0x0

    const/4 v14, -0x1

    const/4 v15, 0x1

    goto/16 :goto_f9

    :cond_1ab
    move v11, v9

    move v9, v2

    :goto_1ad
    if-ge v9, v11, :cond_1c9

    .line 5
    invoke-virtual {v10, v9}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v1, v13, :cond_1ca

    const/16 v3, 0x5b

    if-eq v1, v3, :cond_1bb

    const/4 v1, 0x1

    goto :goto_1c7

    :cond_1bb
    const/4 v1, 0x1

    :cond_1bc
    add-int/2addr v9, v1

    if-ge v9, v11, :cond_1c7

    invoke-virtual {v10, v9}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5d

    if-ne v3, v4, :cond_1bc

    :cond_1c7
    :goto_1c7
    add-int/2addr v9, v1

    goto :goto_1ad

    :cond_1c9
    move v9, v11

    :cond_1ca
    add-int/lit8 v3, v9, 0x1

    const/4 v1, 0x0

    if-ge v3, v11, :cond_1ff

    .line 6
    invoke-static {v10, v2, v9, v1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->てぜきぽく(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 7
    iput-object v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    :try_start_1d9
    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object/from16 v1, p2

    move v2, v3

    move v3, v11

    .line 8
    invoke-static/range {v1 .. v9}, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_1ec
    .catch Ljava/lang/NumberFormatException; {:try_start_1d9 .. :try_end_1ec} :catch_1f4

    if-lez v1, :cond_1f4

    const v2, 0xffff

    if-gt v1, v2, :cond_1f4

    goto :goto_1f5

    :catch_1f4
    :cond_1f4
    const/4 v1, -0x1

    .line 9
    :goto_1f5
    iput v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->づざかべべ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1fd

    sget-object v1, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    return-object v1

    :cond_1fd
    const/4 v1, 0x0

    goto :goto_211

    .line 10
    :cond_1ff
    invoke-static {v10, v2, v9, v1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->てぜきぽく(Ljava/lang/String;IIZ)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 11
    iput-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    iget-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-static {v2}, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび(Ljava/lang/String;)I

    move-result v2

    iput v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->づざかべべ:I

    :goto_211
    iget-object v2, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    if-nez v2, :cond_218

    sget-object v1, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    return-object v1

    :cond_218
    move v8, v11

    :goto_219
    const-string v2, "?#"

    invoke-static {v10, v8, v12, v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->いいにぽつ(Ljava/lang/String;IILjava/lang/String;)I

    move-result v2

    if-ne v8, v2, :cond_223

    goto/16 :goto_311

    .line 12
    :cond_223
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const-string v4, ""

    const/16 v5, 0x2f

    if-eq v3, v5, :cond_241

    const/16 v5, 0x5c

    if-ne v3, v5, :cond_232

    goto :goto_241

    :cond_232
    iget-object v3, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    invoke-interface {v3, v5, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v7, v0

    move v3, v2

    move-object v5, v10

    goto :goto_250

    :cond_241
    :goto_241
    const/4 v6, 0x1

    iget-object v3, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v3, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v7, v0

    move v3, v2

    move-object v5, v10

    :goto_24f
    add-int/2addr v8, v6

    :cond_250
    :goto_250
    if-ge v8, v3, :cond_311

    const-string v6, "/\\"

    invoke-static {v5, v8, v3, v6}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->いいにぽつ(Ljava/lang/String;IILjava/lang/String;)I

    move-result v6

    if-ge v6, v3, :cond_25c

    const/4 v9, 0x1

    goto :goto_25d

    :cond_25c
    const/4 v9, 0x0

    :goto_25d
    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x1

    const/16 v32, 0x0

    const-string v27, " \"<>^`{}|/\\?#"

    move-object/from16 v24, v5

    move/from16 v25, v8

    move/from16 v26, v6

    .line 13
    invoke-static/range {v24 .. v32}, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    const-string v11, "."

    .line 14
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_286

    const-string v11, "%2e"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_284

    goto :goto_286

    :cond_284
    const/4 v11, 0x0

    goto :goto_287

    :cond_286
    :goto_286
    const/4 v11, 0x1

    :goto_287
    if-eqz v11, :cond_28c

    const/4 v13, -0x1

    goto/16 :goto_30b

    :cond_28c
    const-string v11, ".."

    .line 15
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2af

    const-string v11, "%2e."

    invoke-virtual {v8, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_2af

    const-string v11, ".%2e"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_2af

    const-string v11, "%2e%2e"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_2ad

    goto :goto_2af

    :cond_2ad
    const/4 v11, 0x0

    goto :goto_2b0

    :cond_2af
    :goto_2af
    const/4 v11, 0x1

    :goto_2b0
    if-eqz v11, :cond_2df

    .line 16
    iget-object v8, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    const/4 v13, -0x1

    add-int/2addr v11, v13

    invoke-interface {v8, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2d9

    iget-object v8, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_2d9

    iget-object v8, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    add-int/2addr v11, v13

    invoke-interface {v8, v11, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_30b

    :cond_2d9
    iget-object v8, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_30b

    :cond_2df
    const/4 v13, -0x1

    .line 17
    iget-object v11, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v14

    const/4 v15, 0x1

    sub-int/2addr v14, v15

    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_2ff

    iget-object v11, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v14

    sub-int/2addr v14, v15

    invoke-interface {v11, v14, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_304

    :cond_2ff
    iget-object v11, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v11, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_304
    if-eqz v9, :cond_30b

    iget-object v8, v7, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_30b
    :goto_30b
    move v8, v6

    if-eqz v9, :cond_250

    const/4 v6, 0x1

    goto/16 :goto_24f

    :cond_311
    :goto_311
    if-ge v2, v12, :cond_339

    .line 18
    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x3f

    if-ne v1, v3, :cond_339

    const/16 v11, 0x23

    invoke-static {v10, v2, v12, v11}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ(Ljava/lang/String;IIC)I

    move-result v13

    add-int/lit8 v2, v2, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v4, " \"\'<>#"

    move-object/from16 v1, p2

    move v3, v13

    invoke-static/range {v1 .. v9}, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->ぇぬぎばつ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/util/List;

    move v2, v13

    goto :goto_33b

    :cond_339
    const/16 v11, 0x23

    :goto_33b
    if-ge v2, v12, :cond_355

    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v11, :cond_355

    const/4 v1, 0x1

    add-int/2addr v2, v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v4, ""

    move-object/from16 v1, p2

    move v3, v12

    invoke-static/range {v1 .. v9}, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/lang/String;

    :cond_355
    sget-object v1, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    return-object v1

    :cond_358
    sget-object v1, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ;

    return-object v1
.end method

.method public げつ〴ぬぐ()L〳ぜぞぜべっ/ざとぅぼこ〺;
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    if-eqz v0, :cond_16

    iget-object v0, p0, L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    if-eqz v0, :cond_e

    new-instance v0, L〳ぜぞぜべっ/ざとぅぼこ〺;

    invoke-direct {v0, p0}, L〳ぜぞぜべっ/ざとぅぼこ〺;-><init>(L〳ぜぞぜべっ/ざとぅぼこ〺$げつ〴ぬぐ;)V

    return-object v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
