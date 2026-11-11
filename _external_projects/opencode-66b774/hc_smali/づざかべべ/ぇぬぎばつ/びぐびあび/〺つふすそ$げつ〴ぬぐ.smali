.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

.field public げつ〴ぬぐ:J


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    if-nez v0, :cond_b

    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_2b

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "xx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2b
    return-object v0
.end method

.method public 〳ぜぞぜべっ(I)V
    .registers 6

    const/16 v0, 0x40

    if-lt p1, v0, :cond_e

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ()V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〳ぜぞぜべっ(I)V

    goto :goto_16

    :cond_e
    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    :goto_16
    return-void
.end method

.method public 〺つふすそ(I)I
    .registers 8

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    const/16 v1, 0x40

    const-wide/16 v2, 0x1

    if-nez v0, :cond_18

    if-lt p1, v1, :cond_11

    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    :goto_c
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_11
    :goto_11
    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    shl-long v4, v2, p1

    sub-long/2addr v4, v2

    and-long/2addr v0, v4

    goto :goto_c

    :cond_18
    if-ge p1, v1, :cond_1b

    goto :goto_11

    :cond_1b
    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(I)I

    move-result p1

    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public ぁごぐすすぃ()V
    .registers 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->ぁごぐすすぃ()V

    :cond_b
    return-void
.end method

.method public final くし〴〺ぅ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    :cond_b
    return-void
.end method

.method public げつ〴ぬぐ(I)V
    .registers 8

    const/16 v0, 0x40

    if-lt p1, v0, :cond_d

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    if-eqz v1, :cond_18

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    goto :goto_18

    :cond_d
    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    const-wide/16 v4, -0x1

    xor-long/2addr v2, v4

    and-long/2addr v0, v2

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    :cond_18
    :goto_18
    return-void
.end method

.method public づざかべべ(IZ)V
    .registers 15

    const/16 v0, 0x40

    if-lt p1, v0, :cond_e

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ()V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->づざかべべ(IZ)V

    goto :goto_44

    :cond_e
    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    const-wide/high16 v2, -0x8000000000000000L

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    cmp-long v8, v2, v4

    if-eqz v8, :cond_1d

    const/4 v2, 0x1

    goto :goto_1e

    :cond_1d
    const/4 v2, 0x0

    :goto_1e
    const-wide/16 v3, 0x1

    shl-long v8, v3, p1

    sub-long/2addr v8, v3

    and-long v3, v0, v8

    const-wide/16 v10, -0x1

    xor-long/2addr v8, v10

    and-long/2addr v0, v8

    shl-long/2addr v0, v6

    or-long/2addr v0, v3

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    if-eqz p2, :cond_33

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〳ぜぞぜべっ(I)V

    goto :goto_36

    :cond_33
    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    :goto_36
    if-nez v2, :cond_3c

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    if-eqz p1, :cond_44

    :cond_3c
    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ()V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p1, v7, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->づざかべべ(IZ)V

    :cond_44
    :goto_44
    return-void
.end method

.method public なぎぱいぢぎ(I)Z
    .registers 15

    const/16 v0, 0x40

    if-lt p1, v0, :cond_f

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ()V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ(I)Z

    move-result p1

    return p1

    :cond_f
    const-wide/16 v0, 0x1

    shl-long v2, v0, p1

    iget-wide v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    and-long v6, v4, v2

    const-wide/16 v8, 0x0

    const/4 p1, 0x1

    const/4 v10, 0x0

    cmp-long v11, v6, v8

    if-eqz v11, :cond_21

    const/4 v6, 0x1

    goto :goto_22

    :cond_21
    const/4 v6, 0x0

    :goto_22
    const-wide/16 v7, -0x1

    xor-long v11, v2, v7

    and-long/2addr v4, v11

    iput-wide v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    sub-long/2addr v2, v0

    and-long v0, v4, v2

    xor-long/2addr v2, v7

    and-long/2addr v2, v4

    invoke-static {v2, v3, p1}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    if-eqz p1, :cond_49

    invoke-virtual {p1, v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->びぐびあび(I)Z

    move-result p1

    if-eqz p1, :cond_44

    const/16 p1, 0x3f

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〳ぜぞぜべっ(I)V

    :cond_44
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p1, v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ(I)Z

    :cond_49
    return v6
.end method

.method public びぐびあび(I)Z
    .registers 6

    const/16 v0, 0x40

    if-lt p1, v0, :cond_f

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ()V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->びぐびあび(I)Z

    move-result p1

    return p1

    :cond_f
    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1d

    const/4 p1, 0x1

    goto :goto_1e

    :cond_1d
    const/4 p1, 0x0

    :goto_1e
    return p1
.end method
