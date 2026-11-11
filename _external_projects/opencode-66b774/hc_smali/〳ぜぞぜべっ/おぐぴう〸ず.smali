.class public final L〳ぜぞぜべっ/おぐぴう〸ず;
.super L〳ぜぞぜべっ/びえぁぜい;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/おぐぴう〸ず$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final くし〴〺ぅ:L〳ぜぞぜべっ/ごづごきえ;


# instance fields
.field public final 〺つふすそ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "application/x-www-form-urlencoded"

    invoke-static {v0}, L〳ぜぞぜべっ/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ごづごきえ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/おぐぴう〸ず;->くし〴〺ぅ:L〳ぜぞぜべっ/ごづごきえ;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, L〳ぜぞぜべっ/びえぁぜい;-><init>()V

    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, L〳ぜぞぜべっ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/List;

    invoke-static {p2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, L〳ぜぞぜべっ/おぐぴう〸ず;->〺つふすそ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()L〳ぜぞぜべっ/ごづごきえ;
    .registers 2

    sget-object v0, L〳ぜぞぜべっ/おぐぴう〸ず;->くし〴〺ぅ:L〳ぜぞぜべっ/ごづごきえ;

    return-object v0
.end method

.method public げつ〴ぬぐ()J
    .registers 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, L〳ぜぞぜべっ/おぐぴう〸ず;->なぎぱいぢぎ(Lぺぁあねじ/なぎぱいぢぎ;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, L〳ぜぞぜべっ/おぐぴう〸ず;->なぎぱいぢぎ(Lぺぁあねじ/なぎぱいぢぎ;Z)J

    return-void
.end method

.method public final なぎぱいぢぎ(Lぺぁあねじ/なぎぱいぢぎ;Z)J
    .registers 6
    .param p1    # Lぺぁあねじ/なぎぱいぢぎ;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_8

    new-instance p1, Lぺぁあねじ/づざかべべ;

    invoke-direct {p1}, Lぺぁあねじ/づざかべべ;-><init>()V

    goto :goto_c

    :cond_8
    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object p1

    :goto_c
    const/4 v0, 0x0

    iget-object v1, p0, L〳ぜぞぜべっ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_13
    if-ge v0, v1, :cond_3a

    if-lez v0, :cond_1c

    const/16 v2, 0x26

    invoke-virtual {p1, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    :cond_1c
    iget-object v2, p0, L〳ぜぞぜべっ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lぺぁあねじ/づざかべべ;->くねねぱす〻(Ljava/lang/String;)Lぺぁあねじ/づざかべべ;

    const/16 v2, 0x3d

    invoke-virtual {p1, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    iget-object v2, p0, L〳ぜぞぜべっ/おぐぴう〸ず;->〺つふすそ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lぺぁあねじ/づざかべべ;->くねねぱす〻(Ljava/lang/String;)Lぺぁあねじ/づざかべべ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_13

    :cond_3a
    if-eqz p2, :cond_42

    .line 1
    iget-wide v0, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 2
    invoke-virtual {p1}, Lぺぁあねじ/づざかべべ;->じぜこほぱ()V

    goto :goto_44

    :cond_42
    const-wide/16 v0, 0x0

    :goto_44
    return-wide v0
.end method
