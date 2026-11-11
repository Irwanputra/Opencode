.class public Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;
.super Ljava/io/InputStream;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lぺぁあねじ/づざかべべ;->どぇぞほだ()Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lぺぁあねじ/づざかべべ;


# direct methods
.method public constructor <init>(Lぺぁあねじ/づざかべべ;)V
    .registers 2

    iput-object p1, p0, Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public available()I
    .registers 5

    iget-object v0, p0, Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v0, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/32 v2, 0x7fffffff

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public close()V
    .registers 1

    return-void
.end method

.method public read()I
    .registers 7

    iget-object v0, p0, Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_11

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_11
    const/4 v0, -0x1

    return v0
.end method

.method public read([BII)I
    .registers 5

    iget-object v0, p0, Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2, p3}, Lぺぁあねじ/づざかべべ;->ぷぞてのほき([BII)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
