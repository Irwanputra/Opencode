.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public ぁごぐすすぃ:D

.field public づざかべべ:D

.field public なぎぱいぢぎ:D

.field public びぐびあび:D


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 7

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;-><init>()V

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    const/16 v0, 0x28

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/16 v1, 0x2c

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    iput-wide v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:D

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ:D

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->なぎぱいぢぎ:D

    add-int/lit8 v1, v1, 0x1

    const/16 v0, 0x29

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->ぁごぐすすぃ:D

    return-void
.end method


# virtual methods
.method public 〺つふすそ(D)D
    .registers 12

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    move-wide v2, v0

    move-wide v4, v2

    :goto_4
    const-wide v6, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpl-double v8, v2, v6

    if-lez v8, :cond_1b

    invoke-virtual {p0, v4, v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide v6

    mul-double v2, v2, v0

    cmpg-double v8, v6, p1

    if-gez v8, :cond_19

    add-double/2addr v4, v2

    goto :goto_4

    :cond_19
    sub-double/2addr v4, v2

    goto :goto_4

    :cond_1b
    sub-double p1, v4, v2

    invoke-virtual {p0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide v0

    add-double/2addr v4, v2

    invoke-virtual {p0, v4, v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide v2

    invoke-virtual {p0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ(D)D

    move-result-wide p1

    invoke-virtual {p0, v4, v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ(D)D

    move-result-wide v4

    sub-double/2addr v4, p1

    sub-double/2addr v2, v0

    div-double/2addr v4, v2

    return-wide v4
.end method

.method public げつ〴ぬぐ(D)D
    .registers 12

    const-wide/16 v0, 0x0

    cmpg-double v2, p1, v0

    if-gtz v2, :cond_7

    return-wide v0

    :cond_7
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, p1, v0

    if-ltz v2, :cond_e

    return-wide v0

    :cond_e
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    move-wide v2, v0

    move-wide v4, v2

    :goto_12
    const-wide v6, 0x3f847ae147ae147bL    # 0.01

    cmpl-double v8, v2, v6

    if-lez v8, :cond_29

    invoke-virtual {p0, v4, v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide v6

    mul-double v2, v2, v0

    cmpg-double v8, v6, p1

    if-gez v8, :cond_27

    add-double/2addr v4, v2

    goto :goto_12

    :cond_27
    sub-double/2addr v4, v2

    goto :goto_12

    :cond_29
    sub-double v0, v4, v2

    invoke-virtual {p0, v0, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide v6

    add-double/2addr v4, v2

    invoke-virtual {p0, v4, v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide v2

    invoke-virtual {p0, v0, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ(D)D

    move-result-wide v0

    invoke-virtual {p0, v4, v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ(D)D

    move-result-wide v4

    sub-double/2addr v4, v0

    sub-double/2addr p1, v6

    mul-double p1, p1, v4

    sub-double/2addr v2, v6

    div-double/2addr p1, v2

    add-double/2addr p1, v0

    return-wide p1
.end method

.method public final づざかべべ(D)D
    .registers 9

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p1

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    mul-double v2, v2, v0

    mul-double v0, v0, v2

    mul-double v0, v0, p1

    mul-double v2, v2, p1

    mul-double v2, v2, p1

    mul-double v4, p1, p1

    mul-double v4, v4, p1

    iget-wide p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ:D

    mul-double p1, p1, v0

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->ぁごぐすすぃ:D

    mul-double v0, v0, v2

    add-double/2addr v0, p1

    add-double/2addr v0, v4

    return-wide v0
.end method

.method public final びぐびあび(D)D
    .registers 9

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, p1

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    mul-double v2, v2, v0

    mul-double v0, v0, v2

    mul-double v0, v0, p1

    mul-double v2, v2, p1

    mul-double v2, v2, p1

    mul-double v4, p1, p1

    mul-double v4, v4, p1

    iget-wide p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:D

    mul-double p1, p1, v0

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ$げつ〴ぬぐ;->なぎぱいぢぎ:D

    mul-double v0, v0, v2

    add-double/2addr v0, p1

    add-double/2addr v0, v4

    return-wide v0
.end method
