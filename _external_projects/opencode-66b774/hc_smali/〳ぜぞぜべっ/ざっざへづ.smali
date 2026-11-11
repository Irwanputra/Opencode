.class public final L〳ぜぞぜべっ/ざっざへづ;
.super L〳ぜぞぜべっ/びえぁぜい;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ざっざへづ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final 〳ぜぞぜべっ:[B

.field public static final ぁごぐすすぃ:[B

.field public static final づざかべべ:L〳ぜぞぜべっ/ごづごきえ;

.field public static final なぎぱいぢぎ:L〳ぜぞぜべっ/ごづごきえ;

.field public static final ぺぁあねじ:[B


# instance fields
.field public final 〺つふすそ:L〳ぜぞぜべっ/ごづごきえ;

.field public final くし〴〺ぅ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3056\u3063\u3056\u3078\u3065$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

.field public びぐびあび:J


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-string v0, "multipart/mixed"

    invoke-static {v0}, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ごづごきえ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ざっざへづ;->づざかべべ:L〳ぜぞぜべっ/ごづごきえ;

    const-string v0, "multipart/alternative"

    invoke-static {v0}, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ごづごきえ;

    const-string v0, "multipart/digest"

    invoke-static {v0}, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ごづごきえ;

    const-string v0, "multipart/parallel"

    invoke-static {v0}, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ごづごきえ;

    const-string v0, "multipart/form-data"

    invoke-static {v0}, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ごづごきえ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ざっざへづ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ごづごきえ;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_36

    sput-object v1, L〳ぜぞぜべっ/ざっざへづ;->ぁごぐすすぃ:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_3c

    sput-object v1, L〳ぜぞぜべっ/ざっざへづ;->〳ぜぞぜべっ:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_42

    sput-object v0, L〳ぜぞぜべっ/ざっざへづ;->ぺぁあねじ:[B

    return-void

    :array_36
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_3c
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_42
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Lぺぁあねじ/〳ぜぞぜべっ;L〳ぜぞぜべっ/ごづごきえ;Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u307a\u3041\u3042\u306d\u3058/\u3033\u305c\u305e\u305c\u3079\u3063;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3054\u3065\u3054\u304d\u3048;",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3056\u3063\u3056\u3078\u3065$\u3052\u3064\u3034\u306c\u3050;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, L〳ぜぞぜべっ/びえぁぜい;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, L〳ぜぞぜべっ/ざっざへづ;->びぐびあび:J

    iput-object p1, p0, L〳ぜぞぜべっ/ざっざへづ;->げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lぺぁあねじ/〳ぜぞぜべっ;->おぐぴう〸ず()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ごづごきえ;

    move-result-object p1

    iput-object p1, p0, L〳ぜぞぜべっ/ざっざへづ;->〺つふすそ:L〳ぜぞぜべっ/ごづごきえ;

    invoke-static {p3}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, L〳ぜぞぜべっ/ざっざへづ;->くし〴〺ぅ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()L〳ぜぞぜべっ/ごづごきえ;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ざっざへづ;->〺つふすそ:L〳ぜぞぜべっ/ごづごきえ;

    return-object v0
.end method

.method public げつ〴ぬぐ()J
    .registers 6

    iget-wide v0, p0, L〳ぜぞぜべっ/ざっざへづ;->びぐびあび:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_9

    return-wide v0

    :cond_9
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, L〳ぜぞぜべっ/ざっざへづ;->なぎぱいぢぎ(Lぺぁあねじ/なぎぱいぢぎ;Z)J

    move-result-wide v0

    iput-wide v0, p0, L〳ぜぞぜべっ/ざっざへづ;->びぐびあび:J

    return-wide v0
.end method

.method public づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, L〳ぜぞぜべっ/ざっざへづ;->なぎぱいぢぎ(Lぺぁあねじ/なぎぱいぢぎ;Z)J

    return-void
.end method

.method public final なぎぱいぢぎ(Lぺぁあねじ/なぎぱいぢぎ;Z)J
    .registers 15
    .param p1    # Lぺぁあねじ/なぎぱいぢぎ;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_9

    new-instance p1, Lぺぁあねじ/づざかべべ;

    invoke-direct {p1}, Lぺぁあねじ/づざかべべ;-><init>()V

    move-object v0, p1

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    iget-object v1, p0, L〳ぜぞぜべっ/ざっざへづ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    :goto_14
    if-ge v5, v1, :cond_a2

    iget-object v6, p0, L〳ぜぞぜべっ/ざっざへづ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, L〳ぜぞぜべっ/ざっざへづ$げつ〴ぬぐ;

    iget-object v7, v6, L〳ぜぞぜべっ/ざっざへづ$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉざぅち〻;

    iget-object v6, v6, L〳ぜぞぜべっ/ざっざへづ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/びえぁぜい;

    sget-object v8, L〳ぜぞぜべっ/ざっざへづ;->ぺぁあねじ:[B

    invoke-interface {p1, v8}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object v8, p0, L〳ぜぞぜべっ/ざっざへづ;->げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-interface {p1, v8}, Lぺぁあねじ/なぎぱいぢぎ;->ざとぅぼこ〺(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/なぎぱいぢぎ;

    sget-object v8, L〳ぜぞぜべっ/ざっざへづ;->〳ぜぞぜべっ:[B

    invoke-interface {p1, v8}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    if-eqz v7, :cond_58

    invoke-virtual {v7}, L〳ぜぞぜべっ/ぉざぅち〻;->づざかべべ()I

    move-result v8

    const/4 v9, 0x0

    :goto_38
    if-ge v9, v8, :cond_58

    invoke-virtual {v7, v9}, L〳ぜぞぜべっ/ぉざぅち〻;->〺つふすそ(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {p1, v10}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v10

    sget-object v11, L〳ぜぞぜべっ/ざっざへづ;->ぁごぐすすぃ:[B

    invoke-interface {v10, v11}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v10

    invoke-virtual {v7, v9}, L〳ぜぞぜべっ/ぉざぅち〻;->なぎぱいぢぎ(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v10

    sget-object v11, L〳ぜぞぜべっ/ざっざへづ;->〳ぜぞぜべっ:[B

    invoke-interface {v10, v11}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    add-int/lit8 v9, v9, 0x1

    goto :goto_38

    :cond_58
    invoke-virtual {v6}, L〳ぜぞぜべっ/びえぁぜい;->〺つふすそ()L〳ぜぞぜべっ/ごづごきえ;

    move-result-object v7

    if-eqz v7, :cond_6f

    const-string v8, "Content-Type: "

    invoke-interface {p1, v8}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v8

    .line 1
    iget-object v7, v7, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 2
    invoke-interface {v8, v7}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v7

    sget-object v8, L〳ぜぞぜべっ/ざっざへづ;->〳ぜぞぜべっ:[B

    invoke-interface {v7, v8}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    :cond_6f
    invoke-virtual {v6}, L〳ぜぞぜべっ/びえぁぜい;->げつ〴ぬぐ()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-eqz v11, :cond_89

    const-string v9, "Content-Length: "

    invoke-interface {p1, v9}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v9

    invoke-interface {v9, v7, v8}, Lぺぁあねじ/なぎぱいぢぎ;->ぇ〳〲〺すっ(J)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v9

    sget-object v10, L〳ぜぞぜべっ/ざっざへづ;->〳ぜぞぜべっ:[B

    invoke-interface {v9, v10}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    goto :goto_8f

    :cond_89
    if-eqz p2, :cond_8f

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->じぜこほぱ()V

    return-wide v9

    :cond_8f
    :goto_8f
    sget-object v9, L〳ぜぞぜべっ/ざっざへづ;->〳ぜぞぜべっ:[B

    invoke-interface {p1, v9}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    if-eqz p2, :cond_98

    add-long/2addr v3, v7

    goto :goto_9b

    :cond_98
    invoke-virtual {v6, p1}, L〳ぜぞぜべっ/びえぁぜい;->づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V

    :goto_9b
    invoke-interface {p1, v9}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_14

    :cond_a2
    sget-object v1, L〳ぜぞぜべっ/ざっざへづ;->ぺぁあねじ:[B

    invoke-interface {p1, v1}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object v2, p0, L〳ぜぞぜべっ/ざっざへづ;->げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-interface {p1, v2}, Lぺぁあねじ/なぎぱいぢぎ;->ざとぅぼこ〺(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1, v1}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    sget-object v1, L〳ぜぞぜべっ/ざっざへづ;->〳ぜぞぜべっ:[B

    invoke-interface {p1, v1}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    if-eqz p2, :cond_bc

    .line 3
    iget-wide p1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    add-long/2addr v3, p1

    .line 4
    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->じぜこほぱ()V

    :cond_bc
    return-wide v3
.end method
