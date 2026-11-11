.class public final Landroidx/transition/ChangeBounds$〺つふすそ;
.super Landroid/util/Property;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroidx/transition/ChangeBounds$\u3044\u3044\u306b\u307d\u3064;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Landroidx/transition/ChangeBounds$いいにぽつ;

    const/4 p1, 0x0

    return-object p1
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 7

    check-cast p1, Landroidx/transition/ChangeBounds$いいにぽつ;

    check-cast p2, Landroid/graphics/PointF;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->げつ〴ぬぐ:I

    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iput p2, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->〺つふすそ:I

    iget v0, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->なぎぱいぢぎ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->なぎぱいぢぎ:I

    iget v1, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->ぁごぐすすぃ:I

    if-ne v0, v1, :cond_31

    .line 2
    iget-object v0, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->づざかべべ:Landroid/view/View;

    iget v1, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->げつ〴ぬぐ:I

    iget v2, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->くし〴〺ぅ:I

    iget v3, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->びぐびあび:I

    invoke-static {v0, v1, p2, v2, v3}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->くし〴〺ぅ(Landroid/view/View;IIII)V

    const/4 p2, 0x0

    iput p2, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->なぎぱいぢぎ:I

    iput p2, p1, Landroidx/transition/ChangeBounds$いいにぽつ;->ぁごぐすすぃ:I

    :cond_31
    return-void
.end method
