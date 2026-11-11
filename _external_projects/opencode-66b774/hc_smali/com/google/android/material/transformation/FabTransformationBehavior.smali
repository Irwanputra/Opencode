.class public abstract Lcom/google/android/material/transformation/FabTransformationBehavior;
.super Lcom/google/android/material/transformation/ExpandableTransformationBehavior;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:F

.field public ぁごぐすすぃ:F

.field public final くし〴〺ぅ:Landroid/graphics/Rect;

.field public final づざかべべ:Landroid/graphics/RectF;

.field public final なぎぱいぢぎ:[I

.field public final びぐびあび:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->くし〴〺ぅ:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->づざかべべ:Landroid/graphics/RectF;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->なぎぱいぢぎ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->くし〴〺ぅ:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->づざかべべ:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->なぎぱいぢぎ:[I

    return-void
.end method


# virtual methods
.method public final 〺でおいここ(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;)V
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$\u303a\u3064\u3075\u3059\u305d;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    invoke-static {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺふねづ〺(Landroid/view/View;)F

    move-result v0

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺふねづ〺(Landroid/view/View;)F

    move-result p1

    sub-float/2addr v0, p1

    const/4 p1, 0x0

    const/4 v1, 0x1

    if-eqz p3, :cond_1f

    if-nez p4, :cond_13

    neg-float p3, v0

    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationZ(F)V

    :cond_13
    sget-object p3, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    new-array p4, v1, [F

    const/4 v0, 0x0

    aput v0, p4, p1

    invoke-static {p2, p3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    goto :goto_2a

    :cond_1f
    sget-object p3, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    new-array p4, v1, [F

    neg-float v0, v0

    aput v0, p4, p1

    invoke-static {p2, p3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    :goto_2a
    iget-object p2, p5, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p3, "elevation"

    invoke-virtual {p2, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p2

    invoke-virtual {p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-interface {p6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ぃぜぶの〸ぃ(Landroid/view/View;)Landroid/view/ViewGroup;
    .registers 3

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method public ぅみぱぎぎ(Landroid/view/View;Landroid/view/View;ZZ)Landroid/animation/AnimatorSet;
    .registers 30

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v11, p3

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v8, v0, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ながふずは(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;

    move-result-object v12

    if-eqz v11, :cond_1e

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    iput v0, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぁごぐすすぃ:F

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->〳ぜぞぜべっ:F

    :cond_1e
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x15

    if-lt v0, v15, :cond_3d

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object v5, v12

    move-object v6, v13

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/transformation/FabTransformationBehavior;->〺でおいここ(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;)V

    :cond_3d
    iget-object v7, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object v5, v12

    move-object v6, v13

    move-object/from16 v16, v7

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->げがぴうあだ(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;Landroid/graphics/RectF;)V

    invoke-virtual/range {v16 .. v16}, Landroid/graphics/RectF;->width()F

    move-result v21

    invoke-virtual/range {v16 .. v16}, Landroid/graphics/RectF;->height()F

    move-result v22

    .line 1
    iget-object v0, v12, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    invoke-virtual {v8, v9, v10, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぺづげぺが(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F

    move-result v0

    iget-object v1, v12, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    invoke-virtual {v8, v9, v10, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぉひのべい(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F

    move-result v1

    invoke-virtual {v8, v0, v1, v11, v12}, Lcom/google/android/material/transformation/FabTransformationBehavior;->じぜこほぱ(FFZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v4, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    const/4 v5, 0x1

    new-array v6, v5, [F

    if-eqz v11, :cond_78

    goto :goto_7a

    :cond_78
    iget v0, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぁごぐすすぃ:F

    :goto_7a
    const/16 v16, 0x0

    aput v0, v6, v16

    invoke-static {v9, v4, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    sget-object v4, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    new-array v6, v5, [F

    if-eqz v11, :cond_89

    goto :goto_8b

    :cond_89
    iget v1, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->〳ぜぞぜべっ:F

    :goto_8b
    aput v1, v6, v16

    invoke-static {v9, v4, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-virtual {v3, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-virtual {v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    instance-of v0, v10, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;

    if-eqz v0, :cond_f2

    instance-of v1, v9, Landroid/widget/ImageView;

    if-nez v1, :cond_a6

    goto :goto_f2

    :cond_a6
    move-object v1, v10

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;

    move-object v2, v9

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_b3

    goto :goto_f2

    :cond_b3
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    const/16 v3, 0xff

    if-eqz v11, :cond_ca

    if-nez p4, :cond_bf

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_bf
    sget-object v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/びぐびあび;->〺つふすそ:Landroid/util/Property;

    new-array v4, v5, [I

    aput v16, v4, v16

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    move-result-object v3

    goto :goto_d4

    :cond_ca
    sget-object v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/びぐびあび;->〺つふすそ:Landroid/util/Property;

    new-array v5, v5, [I

    aput v3, v5, v16

    invoke-static {v2, v4, v5}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    move-result-object v3

    :goto_d4
    new-instance v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げがぴうあだ/げつ〴ぬぐ;

    invoke-direct {v4, v8, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げがぴうあだ/げつ〴ぬぐ;-><init>(Lcom/google/android/material/transformation/FabTransformationBehavior;Landroid/view/View;)V

    invoke-virtual {v3, v4}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v4, v12, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string v5, "iconFade"

    invoke-virtual {v4, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object v4

    invoke-virtual {v4, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げがぴうあだ/〺つふすそ;

    invoke-direct {v3, v8, v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げがぴうあだ/〺つふすそ;-><init>(Lcom/google/android/material/transformation/FabTransformationBehavior;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f2
    :goto_f2
    if-nez v0, :cond_f7

    move-object v7, v14

    goto/16 :goto_23a

    .line 3
    :cond_f7
    move-object v7, v10

    check-cast v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;

    iget-object v0, v12, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    .line 4
    iget-object v1, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    iget-object v2, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->づざかべべ:Landroid/graphics/RectF;

    .line 5
    invoke-virtual {v8, v9, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    iget v3, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぁごぐすすぃ:F

    iget v4, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->〳ぜぞぜべっ:F

    invoke-virtual {v1, v3, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 6
    invoke-virtual {v8, v10, v2}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    invoke-virtual {v8, v9, v10, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぺづげぺが(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F

    move-result v0

    neg-float v0, v0

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/graphics/RectF;->offset(FF)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget v1, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    .line 7
    iget-object v1, v12, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    .line 8
    iget-object v2, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    iget-object v4, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->づざかべべ:Landroid/graphics/RectF;

    .line 9
    invoke-virtual {v8, v9, v2}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    iget v5, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぁごぐすすぃ:F

    iget v6, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->〳ぜぞぜべっ:F

    invoke-virtual {v2, v5, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 10
    invoke-virtual {v8, v10, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    invoke-virtual {v8, v9, v10, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぉひのべい(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F

    move-result v1

    neg-float v1, v1

    invoke-virtual {v4, v3, v1}, Landroid/graphics/RectF;->offset(FF)V

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    iget v2, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v2

    .line 11
    move-object v2, v9

    check-cast v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object v3, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->くし〴〺ぅ:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->ぁごぐすすぃ(Landroid/graphics/Rect;)Z

    iget-object v2, v8, Lcom/google/android/material/transformation/FabTransformationBehavior;->くし〴〺ぅ:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v6, v2, v3

    iget-object v2, v12, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string v3, "expansion"

    invoke-virtual {v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object v5

    if-eqz v11, :cond_1a5

    if-nez p4, :cond_166

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    invoke-direct {v2, v0, v1, v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;-><init>(FFF)V

    invoke-interface {v7, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;->setRevealInfo(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;)V

    :cond_166
    if-eqz p4, :cond_16f

    invoke-interface {v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;->getRevealInfo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    move-result-object v2

    iget v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    move v6, v2

    :cond_16f
    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v17, v0

    move/from16 v18, v1

    invoke-static/range {v17 .. v22}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へぬ〴づぞ(FFFFFF)F

    move-result v2

    invoke-static {v7, v0, v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〳ぜぞぜべっ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;FFF)Landroid/animation/Animator;

    move-result-object v15

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げがぴうあだ/くし〴〺ぅ;

    invoke-direct {v2, v8, v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/げがぴうあだ/くし〴〺ぅ;-><init>(Lcom/google/android/material/transformation/FabTransformationBehavior;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;)V

    invoke-virtual {v15, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 12
    iget-wide v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:J

    float-to-int v4, v0

    float-to-int v1, v1

    move-object/from16 v0, p0

    move/from16 v17, v1

    move-object/from16 v1, p2

    move-object/from16 v18, v15

    move-object v15, v5

    move/from16 v5, v17

    move-object/from16 v17, v7

    move-object v7, v13

    .line 13
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぇとしたべど(Landroid/view/View;JIIFLjava/util/List;)V

    move-object/from16 v22, v14

    move-object v0, v15

    move-object/from16 v8, v17

    move-object/from16 v15, v18

    goto/16 :goto_22a

    :cond_1a5
    move-object v15, v5

    move-object/from16 v17, v7

    const/16 v7, 0x15

    invoke-interface/range {v17 .. v17}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;->getRevealInfo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    move-result-object v2

    iget v5, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    move-object/from16 v4, v17

    invoke-static {v4, v0, v1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〳ぜぞぜべっ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;FFF)Landroid/animation/Animator;

    move-result-object v17

    .line 14
    iget-wide v2, v15, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:J

    float-to-int v0, v0

    float-to-int v1, v1

    move/from16 v18, v0

    move-object/from16 v0, p0

    move/from16 v19, v1

    move-object/from16 v1, p2

    move-object v8, v4

    move/from16 v4, v18

    move/from16 v20, v5

    move/from16 v5, v19

    move v9, v6

    move/from16 v6, v20

    const/16 v11, 0x15

    move-object v7, v13

    .line 15
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぇとしたべど(Landroid/view/View;JIIFLjava/util/List;)V

    .line 16
    iget-wide v0, v15, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:J

    .line 17
    iget-wide v2, v15, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:J

    .line 18
    iget-object v4, v12, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    .line 19
    iget-object v5, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 20
    iget v5, v5, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    const-wide/16 v6, 0x0

    const/4 v11, 0x0

    :goto_1df
    if-ge v11, v5, :cond_205

    move/from16 v21, v5

    .line 21
    iget-object v5, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v5, v11}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-object/from16 v22, v14

    move-object/from16 v23, v15

    .line 22
    iget-wide v14, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:J

    move-object/from16 v24, v4

    .line 23
    iget-wide v4, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:J

    add-long/2addr v14, v4

    .line 24
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    add-int/lit8 v11, v11, 0x1

    move/from16 v5, v21

    move-object/from16 v14, v22

    move-object/from16 v15, v23

    move-object/from16 v4, v24

    goto :goto_1df

    :cond_205
    move-object/from16 v22, v14

    move-object/from16 v23, v15

    .line 25
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    if-lt v4, v5, :cond_226

    add-long/2addr v0, v2

    cmp-long v2, v0, v6

    if-gez v2, :cond_226

    move/from16 v2, v18

    move/from16 v3, v19

    invoke-static {v10, v2, v3, v9, v9}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    sub-long/2addr v6, v0

    invoke-virtual {v2, v6, v7}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_226
    move-object/from16 v15, v17

    move-object/from16 v0, v23

    .line 26
    :goto_22a
    invoke-virtual {v0, v15}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/げつ〴ぬぐ;

    invoke-direct {v0, v8}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;)V

    move-object/from16 v7, v22

    .line 28
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_23a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object v5, v12

    move-object v6, v13

    .line 29
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/material/transformation/FabTransformationBehavior;->おかぷせ〱(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;)V

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object v4, v12

    move-object v5, v13

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/transformation/FabTransformationBehavior;->けときぜと(Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;)V

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-static {v0, v13}, Lづざかべべ/は〲ぱなで/〺つふすそ;->きぬどぼみ〸(Landroid/animation/AnimatorSet;Ljava/util/List;)V

    new-instance v1, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v4, v10, v3}, Lcom/google/android/material/transformation/FabTransformationBehavior$げつ〴ぬぐ;-><init>(Lcom/google/android/material/transformation/FabTransformationBehavior;ZLandroid/view/View;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_26f
    if-ge v3, v1, :cond_27d

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v0, v4}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_26f

    :cond_27d
    return-object v0
.end method

.method public final ぇとしたべど(Landroid/view/View;JIIFLjava/util/List;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "JIIF",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_19

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_19

    invoke-static {p1, p4, p5, p6, p6}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    invoke-virtual {p1, p2, p3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-interface {p7, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_19
    return-void
.end method

.method public final ぉひのべい(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F
    .registers 7

    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->づざかべべ:Landroid/graphics/RectF;

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    iget p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぁごぐすすぃ:F

    iget v2, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->〳ぜぞぜべっ:F

    invoke-virtual {v0, p1, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 2
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result p2

    sub-float/2addr p1, p2

    const/4 p2, 0x0

    add-float/2addr p1, p2

    return p1
.end method

.method public final おかぷせ〱(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$\u303a\u3064\u3075\u3059\u305d;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;

    if-nez v0, :cond_5

    return-void

    :cond_5
    check-cast p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;

    .line 1
    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺぁあねじ(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Landroid/view/View;->getDrawableState()[I

    move-result-object p1

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v0, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    goto :goto_1c

    :cond_1b
    const/4 p1, 0x0

    :goto_1c
    const v0, 0xffffff

    and-int/2addr v0, p1

    const/4 v2, 0x1

    if-eqz p3, :cond_33

    if-nez p4, :cond_28

    .line 2
    invoke-interface {p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;->setCircularRevealScrimColor(I)V

    :cond_28
    sget-object p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$びぐびあび;->げつ〴ぬぐ:Landroid/util/Property;

    new-array p3, v2, [I

    aput v0, p3, v1

    invoke-static {p2, p1, p3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    move-result-object p1

    goto :goto_3d

    :cond_33
    sget-object p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$びぐびあび;->げつ〴ぬぐ:Landroid/util/Property;

    new-array p4, v2, [I

    aput p1, p4, v1

    invoke-static {p2, p3, p4}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    move-result-object p1

    :goto_3d
    sget-object p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〺つふすそ;

    invoke-virtual {p1, p2}, Landroid/animation/ObjectAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    iget-object p2, p5, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p3, "color"

    invoke-virtual {p2, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p2

    invoke-virtual {p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-interface {p6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final けときぜと(Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$\u303a\u3064\u3075\u3059\u305d;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-nez v0, :cond_5

    return-void

    :cond_5
    instance-of v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;

    if-eqz v0, :cond_e

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ:I

    if-nez v0, :cond_e

    return-void

    .line 1
    :cond_e
    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->mtrl_child_content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1c

    invoke-virtual {p0, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぃぜぶの〸ぃ(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object p1

    goto :goto_2e

    :cond_1c
    instance-of v0, p1, Lcom/google/android/material/transformation/TransformationChildLayout;

    if-nez v0, :cond_24

    instance-of v0, p1, Lcom/google/android/material/transformation/TransformationChildCard;

    if-eqz v0, :cond_2a

    :cond_24
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    :cond_2a
    invoke-virtual {p0, p1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぃぜぶの〸ぃ(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object p1

    :goto_2e
    if-nez p1, :cond_31

    return-void

    :cond_31
    const/4 v0, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_4d

    if-nez p3, :cond_40

    .line 2
    sget-object p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/くし〴〺ぅ;->げつ〴ぬぐ:Landroid/util/Property;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Landroid/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_40
    sget-object p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/くし〴〺ぅ;->げつ〴ぬぐ:Landroid/util/Property;

    new-array p3, v2, [F

    const/high16 v0, 0x3f800000    # 1.0f

    aput v0, p3, v1

    invoke-static {p1, p2, p3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    goto :goto_57

    :cond_4d
    sget-object p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/くし〴〺ぅ;->げつ〴ぬぐ:Landroid/util/Property;

    new-array p3, v2, [F

    aput v0, p3, v1

    invoke-static {p1, p2, p3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    :goto_57
    iget-object p2, p4, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p3, "contentFade"

    invoke-virtual {p2, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p2

    invoke-virtual {p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-interface {p5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final げがぴうあだ(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Ljava/util/List;Landroid/graphics/RectF;)V
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$\u303a\u3064\u3075\u3059\u305d;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;",
            "Landroid/graphics/RectF;",
            ")V"
        }
    .end annotation

    iget-object v0, p5, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぺづげぺが(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F

    move-result v0

    iget-object v1, p5, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;

    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぉひのべい(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F

    move-result p1

    invoke-virtual {p0, v0, p1, p3, p5}, Lcom/google/android/material/transformation/FabTransformationBehavior;->じぜこほぱ(FFZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p3, :cond_5e

    if-nez p4, :cond_26

    neg-float p3, v0

    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationX(F)V

    neg-float p3, p1

    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationY(F)V

    :cond_26
    sget-object p3, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    new-array p4, v4, [F

    const/4 v5, 0x0

    aput v5, p4, v3

    invoke-static {p2, p3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p3

    sget-object p4, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    new-array v4, v4, [F

    aput v5, v4, v3

    invoke-static {p2, p4, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p4

    neg-float v0, v0

    neg-float p1, p1

    .line 1
    invoke-virtual {p0, p5, v2, v0, v5}, Lcom/google/android/material/transformation/FabTransformationBehavior;->せづっ〸ちね(Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;FF)F

    move-result v0

    invoke-virtual {p0, p5, v1, p1, v5}, Lcom/google/android/material/transformation/FabTransformationBehavior;->せづっ〸ちね(Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;FF)F

    move-result p1

    iget-object p5, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->くし〴〺ぅ:Landroid/graphics/Rect;

    invoke-virtual {p2, p5}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget-object v3, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    invoke-virtual {v3, p5}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object p5, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->づざかべべ:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, p5}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    invoke-virtual {p5, v0, p1}, Landroid/graphics/RectF;->offset(FF)V

    invoke-virtual {p5, v3}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    invoke-virtual {p7, p5}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    goto :goto_74

    .line 2
    :cond_5e
    sget-object p3, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    new-array p4, v4, [F

    neg-float p5, v0

    aput p5, p4, v3

    invoke-static {p2, p3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p3

    sget-object p4, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    new-array p5, v4, [F

    neg-float p1, p1

    aput p1, p5, v3

    invoke-static {p2, p4, p5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p4

    :goto_74
    invoke-virtual {v2, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-virtual {v1, p4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    invoke-interface {p6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p6, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final じぜこほぱ(FFZLcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;)Landroid/util/Pair;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$\u303a\u3064\u3075\u3059\u305d;",
            ")",
            "Landroid/util/Pair<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u306e\u3077\u306e\u3061\u3064/\u3033\u305c\u305e\u305c\u3079\u3063;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u306e\u3077\u306e\u3061\u3064/\u3033\u305c\u305e\u305c\u3079\u3063;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_30

    cmpl-float p1, p2, v0

    if-nez p1, :cond_a

    goto :goto_30

    :cond_a
    if-eqz p3, :cond_10

    cmpg-float p1, p2, v0

    if-ltz p1, :cond_16

    :cond_10
    if-nez p3, :cond_23

    cmpl-float p1, p2, v0

    if-lez p1, :cond_23

    :cond_16
    iget-object p1, p4, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p2, "translationXCurveUpwards"

    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p1

    iget-object p2, p4, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p3, "translationYCurveUpwards"

    goto :goto_3c

    :cond_23
    iget-object p1, p4, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p2, "translationXCurveDownwards"

    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p1

    iget-object p2, p4, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p3, "translationYCurveDownwards"

    goto :goto_3c

    :cond_30
    :goto_30
    iget-object p1, p4, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p2, "translationXLinear"

    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p1

    iget-object p2, p4, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string p3, "translationYLinear"

    :goto_3c
    invoke-virtual {p2, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p2

    new-instance p3, Landroid/util/Pair;

    invoke-direct {p3, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final せづっ〸ちね(Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;FF)F
    .registers 13

    .line 1
    iget-wide v0, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:J

    .line 2
    iget-wide v2, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:J

    .line 3
    iget-object p1, p1, Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;

    const-string v4, "expansion"

    invoke-virtual {p1, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぁごぐすすぃ;->なぎぱいぢぎ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object p1

    .line 4
    iget-wide v4, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:J

    .line 5
    iget-wide v6, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:J

    add-long/2addr v4, v6

    const-wide/16 v6, 0x11

    add-long/2addr v4, v6

    sub-long/2addr v4, v0

    long-to-float p1, v4

    long-to-float v0, v2

    div-float/2addr p1, v0

    .line 6
    invoke-virtual {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ()Landroid/animation/TimeInterpolator;

    move-result-object p2

    invoke-interface {p2, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    .line 7
    sget-object p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/TimeInterpolator;

    invoke-static {p4, p3, p1, p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(FFFF)F

    move-result p1

    return p1
.end method

.method public abstract ながふずは(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$〺つふすそ;
.end method

.method public なぎぱいぢぎ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;)V
    .registers 3

    iget v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    if-nez v0, :cond_8

    const/16 v0, 0x50

    iput v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;->〳ぜぞぜべっ:I

    :cond_8
    return-void
.end method

.method public びぐびあび(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .registers 5

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_1d

    instance-of p1, p3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v0, 0x0

    if-eqz p1, :cond_1c

    check-cast p3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getExpandedComponentIdHint()I

    move-result p1

    if-eqz p1, :cond_1b

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    if-ne p1, p2, :cond_1c

    :cond_1b
    const/4 v0, 0x1

    :cond_1c
    return v0

    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V
    .registers 6

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->なぎぱいぢぎ:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    aget v1, v0, v1

    int-to-float v1, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    int-to-float v0, v0

    invoke-virtual {p2, v1, v0}, Landroid/graphics/RectF;->offsetTo(FF)V

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    neg-float v0, v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    neg-float p1, p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->offset(FF)V

    return-void
.end method

.method public final ぺづげぺが(Landroid/view/View;Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/ぺぁあねじ;)F
    .registers 7

    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->びぐびあび:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->づざかべべ:Landroid/graphics/RectF;

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    iget p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぁごぐすすぃ:F

    iget v2, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->〳ぜぞぜべっ:F

    invoke-virtual {v0, p1, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 2
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->ぷぞてのほき(Landroid/view/View;Landroid/graphics/RectF;)V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result p2

    sub-float/2addr p1, p2

    const/4 p2, 0x0

    add-float/2addr p1, p2

    return p1
.end method
