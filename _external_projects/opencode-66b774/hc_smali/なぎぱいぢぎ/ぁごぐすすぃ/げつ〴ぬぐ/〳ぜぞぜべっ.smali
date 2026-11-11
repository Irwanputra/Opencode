.class public Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

.field public くし〴〺ぅ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

.field public げつ〴ぬぐ:I

.field public づざかべべ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

.field public びぐびあび:Landroid/view/animation/Interpolator;


# direct methods
.method public varargs constructor <init>([Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    iput v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    iput-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    iput-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 1
    iget-object p1, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    .line 2
    iput-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, " "

    const/4 v1, 0x0

    :goto_3
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    if-ge v1, v2, :cond_26

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_26
    return-object v0
.end method

.method public 〺つふすそ(F)Ljava/lang/Object;
    .registers 6

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_20

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    :cond_d
    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_20
    const/4 v2, 0x0

    const/4 v3, 0x1

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_4e

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v1, :cond_36

    .line 2
    invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    :cond_36
    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 3
    iget v2, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr p1, v2

    iget v3, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr v3, v2

    div-float/2addr p1, v3

    .line 4
    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    invoke-virtual {v1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, p1, v1, v0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4e
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v2

    if-ltz v2, :cond_81

    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 5
    iget-object v1, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v1, :cond_67

    .line 6
    invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    .line 7
    :cond_67
    iget v1, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr p1, v1

    .line 8
    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 9
    iget v2, v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr v2, v1

    div-float/2addr p1, v2

    .line 10
    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, p1, v0, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_81
    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    :goto_83
    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    if-ge v3, v1, :cond_b7

    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 11
    iget v2, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    cmpg-float v2, p1, v2

    if-gez v2, :cond_b3

    .line 12
    iget-object v2, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v2, :cond_9d

    .line 13
    invoke-interface {v2, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    .line 14
    :cond_9d
    iget v2, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr p1, v2

    iget v3, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr v3, v2

    div-float/2addr p1, v3

    .line 15
    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, p1, v0, v1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b3
    add-int/lit8 v3, v3, 0x1

    move-object v0, v1

    goto :goto_83

    :cond_b7
    iget-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public げつ〴ぬぐ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v1, :cond_1a

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v4}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_1a
    new-instance v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;

    invoke-direct {v0, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;-><init>([Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;)V

    return-object v0
.end method
