.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;,
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$びぐびあび;,
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$づざかべべ;,
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$げつ〴ぬぐ;,
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$〺つふすそ;,
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$なぎぱいぢぎ;
    }
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u3049\u3072\u306e\u3079\u3044/\u304a\u3050\u3074\u3046\u3038\u305a$\u306a\u304e\u3071\u3044\u3062\u304e;",
            ">;"
        }
    .end annotation
.end field

.field public 〺つふすそ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final ぁごぐすすぃ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u3049\u3072\u306e\u3079\u3044/\u304a\u3050\u3074\u3046\u3038\u305a$\u3065\u3056\u304b\u3079\u3079;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public げつ〴ぬぐ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public づざかべべ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public なぎぱいぢぎ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public びぐびあび:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/util/List;

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->づざかべべ(FF)V

    return-void
.end method


# virtual methods
.method public final 〺つふすそ(F)V
    .registers 6

    .line 1
    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->づざかべべ:F

    cmpl-float v1, v0, p1

    if-nez v1, :cond_7

    return-void

    :cond_7
    sub-float v0, p1, v0

    const/high16 v1, 0x43b40000    # 360.0f

    add-float/2addr v0, v1

    rem-float/2addr v0, v1

    const/high16 v1, 0x43340000    # 180.0f

    cmpl-float v1, v0, v1

    if-lez v1, :cond_14

    return-void

    .line 2
    :cond_14
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;

    .line 3
    iget v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->くし〴〺ぅ:F

    .line 4
    iget v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->びぐびあび:F

    .line 5
    invoke-direct {v1, v2, v3, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;-><init>(FFFF)V

    .line 6
    iget v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->づざかべべ:F

    .line 7
    iput v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->なぎぱいぢぎ:F

    .line 8
    iput v0, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->ぁごぐすすぃ:F

    .line 9
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/util/List;

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$げつ〴ぬぐ;

    invoke-direct {v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->づざかべべ:F

    return-void
.end method

.method public くし〴〺ぅ(Landroid/graphics/Matrix;Landroid/graphics/Path;)V
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_17

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$づざかべべ;

    invoke-virtual {v2, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$づざかべべ;->げつ〴ぬぐ(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_17
    return-void
.end method

.method public げつ〴ぬぐ(FFFFFF)V
    .registers 11

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;

    invoke-direct {v0, p1, p2, p3, p4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;-><init>(FFFF)V

    .line 1
    iput p5, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->なぎぱいぢぎ:F

    .line 2
    iput p6, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->ぁごぐすすぃ:F

    .line 3
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;)V

    add-float v0, p5, p6

    const/4 v2, 0x0

    cmpg-float p6, p6, v2

    if-gez p6, :cond_1c

    const/4 p6, 0x1

    goto :goto_1d

    :cond_1c
    const/4 p6, 0x0

    :goto_1d
    const/high16 v2, 0x43b40000    # 360.0f

    const/high16 v3, 0x43340000    # 180.0f

    if-eqz p6, :cond_25

    add-float/2addr p5, v3

    rem-float/2addr p5, v2

    :cond_25
    if-eqz p6, :cond_2a

    add-float/2addr v3, v0

    rem-float/2addr v3, v2

    goto :goto_2b

    :cond_2a
    move v3, v0

    .line 4
    :goto_2b
    invoke-virtual {p0, p5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〺つふすそ(F)V

    iget-object p5, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/util/List;

    invoke-interface {p5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iput v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->づざかべべ:F

    add-float p5, p1, p3

    const/high16 p6, 0x3f000000    # 0.5f

    mul-float p5, p5, p6

    sub-float/2addr p3, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p3, p1

    float-to-double v0, v0

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float p3, p3, v2

    add-float/2addr p3, p5

    .line 7
    iput p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->くし〴〺ぅ:F

    add-float p3, p2, p4

    mul-float p3, p3, p6

    sub-float/2addr p4, p2

    div-float/2addr p4, p1

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    double-to-float p1, p1

    mul-float p4, p4, p1

    add-float/2addr p4, p3

    .line 9
    iput p4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->びぐびあび:F

    return-void
.end method

.method public づざかべべ(FF)V
    .registers 5

    const/high16 v0, 0x43870000    # 270.0f

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->なぎぱいぢぎ(FFFF)V

    return-void
.end method

.method public なぎぱいぢぎ(FFFF)V
    .registers 5

    .line 1
    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->げつ〴ぬぐ:F

    .line 2
    iput p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〺つふすそ:F

    .line 3
    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->くし〴〺ぅ:F

    .line 4
    iput p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->びぐびあび:F

    .line 5
    iput p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->づざかべべ:F

    add-float/2addr p3, p4

    const/high16 p1, 0x43b40000    # 360.0f

    rem-float/2addr p3, p1

    .line 6
    iput p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->なぎぱいぢぎ:F

    .line 7
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public びぐびあび(FF)V
    .registers 7

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$びぐびあび;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$びぐびあび;-><init>()V

    .line 1
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$びぐびあび;->〺つふすそ:F

    .line 2
    iput p2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$びぐびあび;->くし〴〺ぅ:F

    .line 3
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$〺つふすそ;

    .line 4
    iget v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->くし〴〺ぅ:F

    .line 5
    iget v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->びぐびあび:F

    .line 6
    invoke-direct {v1, v0, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$〺つふすそ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$びぐびあび;FF)V

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$〺つふすそ;->〺つふすそ()F

    move-result v0

    const/high16 v2, 0x43870000    # 270.0f

    add-float/2addr v0, v2

    invoke-virtual {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$〺つふすそ;->〺つふすそ()F

    move-result v3

    add-float/2addr v3, v2

    .line 7
    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〺つふすそ(F)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->〳ぜぞぜべっ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iput v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->づざかべべ:F

    .line 9
    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->くし〴〺ぅ:F

    .line 10
    iput p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;->びぐびあび:F

    return-void
.end method
