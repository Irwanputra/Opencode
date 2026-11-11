.class public final Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;
.super Landroid/view/animation/Animation;
.source ""


# static fields
.field public static final ざとぅぼこ〺:Z

.field public static final は〲ぱなで:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u3041\u3054\u3050\u3059\u3059\u3043/\u304f\u3057\u3034\u303a\u3045/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〳ぜぞぜべっ:F

.field public final 〺つふすそ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public ぁごぐすすぃ:F

.field public いいにぽつ:F

.field public final ぇぬぎばつ:Landroid/graphics/RectF;

.field public final ぉざぅち〻:Landroid/graphics/Matrix;

.field public final おぐぴう〸ず:Landroid/graphics/RectF;

.field public final くし〴〺ぅ:Landroid/graphics/Camera;

.field public づざかべべ:F

.field public てぜきぽく:F

.field public なぎぱいぢぎ:F

.field public のぷのちつ:F

.field public びぐびあび:Z

.field public へぬ〴づぞ:F

.field public ぺぁあねじ:F

.field public ぺふねづ〺:F


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    sput-boolean v0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ざとぅぼこ〺:Z

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->は〲ぱなで:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .registers 4

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    new-instance v0, Landroid/graphics/Camera;

    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/graphics/Camera;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->づざかべべ:F

    iput v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぺふねづ〺:F

    iput v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->てぜきぽく:F

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぇぬぎばつ:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぉざぅち〻:Landroid/graphics/Matrix;

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static なぎぱいぢぎ(Landroid/view/View;)Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;
    .registers 4

    sget-object v0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->は〲ぱなで:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;

    if-eqz v1, :cond_10

    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v2

    if-eq v1, v2, :cond_18

    :cond_10
    new-instance v1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    return-object v1
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 4

    iget-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_16

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->づざかべべ:F

    invoke-virtual {p2, v0}, Landroid/view/animation/Transformation;->setAlpha(F)V

    invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->づざかべべ(Landroid/graphics/Matrix;Landroid/view/View;)V

    :cond_16
    return-void
.end method

.method public final 〺つふすそ()V
    .registers 8

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_44

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_11

    goto :goto_44

    :cond_11
    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぇぬぎばつ:Landroid/graphics/RectF;

    invoke-virtual {p0, v1, v0}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/graphics/RectF;Landroid/view/View;)V

    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/RectF;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v3, v1, Landroid/graphics/RectF;->top:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v3, v3

    iget v4, v1, Landroid/graphics/RectF;->right:F

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v1, v5

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/view/View;->invalidate(IIII)V

    :cond_44
    :goto_44
    return-void
.end method

.method public final くし〴〺ぅ()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_f

    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/RectF;

    invoke-virtual {p0, v1, v0}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/graphics/RectF;Landroid/view/View;)V

    :cond_f
    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/graphics/RectF;Landroid/view/View;)V
    .registers 6

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぉざぅち〻:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {p0, v0, p2}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->づざかべべ(Landroid/graphics/Matrix;Landroid/view/View;)V

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぉざぅち〻:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, v0, p2}, Landroid/graphics/RectF;->offset(FF)V

    iget p2, p1, Landroid/graphics/RectF;->right:F

    iget v0, p1, Landroid/graphics/RectF;->left:F

    cmpg-float v1, p2, v0

    if-gez v1, :cond_34

    iput v0, p1, Landroid/graphics/RectF;->right:F

    iput p2, p1, Landroid/graphics/RectF;->left:F

    :cond_34
    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    iget v0, p1, Landroid/graphics/RectF;->top:F

    cmpg-float v1, p2, v0

    if-gez v1, :cond_40

    iput p2, p1, Landroid/graphics/RectF;->top:F

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    :cond_40
    return-void
.end method

.method public final づざかべべ(Landroid/graphics/Matrix;Landroid/view/View;)V
    .registers 11

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    iget-boolean v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->びぐびあび:Z

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v1, :cond_13

    iget v3, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:F

    goto :goto_15

    :cond_13
    div-float v3, v0, v2

    :goto_15
    if-eqz v1, :cond_1a

    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぁごぐすすぃ:F

    goto :goto_1c

    :cond_1a
    div-float v1, p2, v2

    :goto_1c
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〳ぜぞぜべっ:F

    iget v4, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぺぁあねじ:F

    iget v5, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->いいにぽつ:F

    const/4 v6, 0x0

    cmpl-float v7, v2, v6

    if-nez v7, :cond_2f

    cmpl-float v7, v4, v6

    if-nez v7, :cond_2f

    cmpl-float v6, v5, v6

    if-eqz v6, :cond_4c

    :cond_2f
    iget-object v6, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/graphics/Camera;

    invoke-virtual {v6}, Landroid/graphics/Camera;->save()V

    invoke-virtual {v6, v2}, Landroid/graphics/Camera;->rotateX(F)V

    invoke-virtual {v6, v4}, Landroid/graphics/Camera;->rotateY(F)V

    neg-float v2, v5

    invoke-virtual {v6, v2}, Landroid/graphics/Camera;->rotateZ(F)V

    invoke-virtual {v6, p1}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v6}, Landroid/graphics/Camera;->restore()V

    neg-float v2, v3

    neg-float v4, v1

    invoke-virtual {p1, v2, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-virtual {p1, v3, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :cond_4c
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->ぺふねづ〺:F

    iget v4, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->てぜきぽく:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v6, v2, v5

    if-nez v6, :cond_5a

    cmpl-float v5, v4, v5

    if-eqz v5, :cond_6e

    :cond_5a
    invoke-virtual {p1, v2, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    div-float/2addr v3, v0

    neg-float v3, v3

    mul-float v2, v2, v0

    sub-float/2addr v2, v0

    mul-float v2, v2, v3

    div-float/2addr v1, p2

    neg-float v0, v1

    mul-float v4, v4, p2

    sub-float/2addr v4, p2

    mul-float v4, v4, v0

    invoke-virtual {p1, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :cond_6e
    iget p2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->のぷのちつ:F

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->へぬ〴づぞ:F

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method public びぐびあび(F)V
    .registers 3

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->づざかべべ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_15

    iput p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->づざかべべ:F

    iget-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_15

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_15
    return-void
.end method
