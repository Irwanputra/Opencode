.class public Landroidx/constraintlayout/utils/widget/MotionTelltales;
.super Landroidx/constraintlayout/utils/widget/MockView;
.source ""


# instance fields
.field public ぇぬぎばつ:Landroid/graphics/Matrix;

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:[F

.field public ざとぅぼこ〺:I

.field public のぷのちつ:Landroid/graphics/Paint;

.field public は〲ぱなで:F

.field public へぬ〴づぞ:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0, p1}, Landroidx/constraintlayout/utils/widget/MockView;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->のぷのちつ:Landroid/graphics/Paint;

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->おぐぴう〸ず:[F

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぇぬぎばつ:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぉざぅち〻:I

    const v0, -0xff01

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ざとぅぼこ〺:I

    const/high16 v0, 0x3e800000    # 0.25f

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->は〲ぱなで:F

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/utils/widget/MotionTelltales;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->のぷのちつ:Landroid/graphics/Paint;

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->おぐぴう〸ず:[F

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぇぬぎばつ:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぉざぅち〻:I

    const v0, -0xff01

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ざとぅぼこ〺:I

    const/high16 v0, 0x3e800000    # 0.25f

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->は〲ぱなで:F

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionTelltales;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/utils/widget/MockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->のぷのちつ:Landroid/graphics/Paint;

    const/4 p3, 0x2

    new-array p3, p3, [F

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->おぐぴう〸ず:[F

    new-instance p3, Landroid/graphics/Matrix;

    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぇぬぎばつ:Landroid/graphics/Matrix;

    const/4 p3, 0x0

    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぉざぅち〻:I

    const p3, -0xff01

    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ざとぅぼこ〺:I

    const/high16 p3, 0x3e800000    # 0.25f

    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->は〲ぱなで:F

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionTelltales;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    if-eqz p2, :cond_3f

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->MotionTelltales:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_d
    if-ge v0, p2, :cond_3c

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v1

    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->MotionTelltales_telltales_tailColor:I

    if-ne v1, v2, :cond_20

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ざとぅぼこ〺:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ざとぅぼこ〺:I

    goto :goto_39

    :cond_20
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->MotionTelltales_telltales_velocityMode:I

    if-ne v1, v2, :cond_2d

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぉざぅち〻:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぉざぅち〻:I

    goto :goto_39

    :cond_2d
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->MotionTelltales_telltales_tailScale:I

    if-ne v1, v2, :cond_39

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->は〲ぱなで:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->は〲ぱなで:F

    :cond_39
    :goto_39
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_3c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3f
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->のぷのちつ:Landroid/graphics/Paint;

    iget p2, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ざとぅぼこ〺:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->のぷのちつ:Landroid/graphics/Paint;

    const/high16 p2, 0x40a00000    # 5.0f

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 33

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Landroidx/constraintlayout/utils/widget/MockView;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    iget-object v2, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぇぬぎばつ:Landroid/graphics/Matrix;

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v1, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->へぬ〴づぞ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    if-nez v1, :cond_1f

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    if-eqz v2, :cond_1e

    check-cast v1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    iput-object v1, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->へぬ〴づぞ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    :cond_1e
    return-void

    :cond_1f
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    const/4 v3, 0x5

    new-array v4, v3, [F

    fill-array-data v4, :array_2e2

    const/4 v6, 0x0

    :goto_2e
    if-ge v6, v3, :cond_2e1

    aget v14, v4, v6

    const/4 v15, 0x0

    :goto_33
    if-ge v15, v3, :cond_2d7

    aget v13, v4, v15

    iget-object v7, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->へぬ〴づぞ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v12, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->おぐぴう〸ず:[F

    iget v11, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぉざぅち〻:I

    .line 1
    iget v8, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->ぶでにく〼〳:F

    iget v9, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->せづっ〸ちね:F

    iget-object v10, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->でどあくず:Landroid/view/animation/Interpolator;

    if-eqz v10, :cond_69

    const v8, 0x3727c5ac    # 1.0E-5f

    iget v10, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->けときぜと:F

    sub-float/2addr v10, v9

    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    move-result v9

    iget-object v10, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->でどあくず:Landroid/view/animation/Interpolator;

    iget v3, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->せづっ〸ちね:F

    add-float/2addr v3, v8

    invoke-interface {v10, v3}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    iget-object v10, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->でどあくず:Landroid/view/animation/Interpolator;

    iget v5, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->せづっ〸ちね:F

    invoke-interface {v10, v5}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v5

    sub-float/2addr v3, v5

    div-float/2addr v3, v8

    mul-float v3, v3, v9

    iget v8, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->ぺづげぺが:F

    div-float v8, v3, v8

    move v9, v5

    :cond_69
    iget-object v3, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->でどあくず:Landroid/view/animation/Interpolator;

    instance-of v5, v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/へぬ〴づぞ;

    if-eqz v5, :cond_75

    check-cast v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/へぬ〴づぞ;

    invoke-virtual {v3}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/へぬ〴づぞ;->げつ〴ぬぐ()F

    move-result v8

    :cond_75
    move v3, v8

    iget-object v5, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->ぅみぱぎぎ:Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;

    and-int/lit8 v7, v11, 0x1

    const/16 v16, 0x1

    if-nez v7, :cond_27d

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v17

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v18

    .line 2
    iget-object v7, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ざっざへづ:[F

    invoke-virtual {v5, v9, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->げつ〴ぬぐ(F[F)F

    move-result v7

    iget-object v8, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v9, "translationX"

    if-nez v8, :cond_9a

    const/4 v8, 0x0

    goto :goto_a0

    :cond_9a
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;

    :goto_a0
    iget-object v10, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〻ぞまぎな〻:Ljava/util/HashMap;

    move-object/from16 v20, v4

    const-string v4, "translationY"

    if-nez v10, :cond_ac

    move/from16 v21, v11

    const/4 v10, 0x0

    goto :goto_b4

    :cond_ac
    invoke-virtual {v10, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;

    move/from16 v21, v11

    :goto_b4
    iget-object v11, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〻ぞまぎな〻:Ljava/util/HashMap;

    move/from16 v22, v6

    const-string v6, "rotation"

    if-nez v11, :cond_c0

    move/from16 v23, v15

    const/4 v11, 0x0

    goto :goto_c8

    :cond_c0
    invoke-virtual {v11, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;

    move/from16 v23, v15

    :goto_c8
    iget-object v15, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〻ぞまぎな〻:Ljava/util/HashMap;

    move/from16 v24, v2

    const-string v2, "scaleX"

    if-nez v15, :cond_d4

    move/from16 v25, v1

    const/4 v15, 0x0

    goto :goto_dc

    :cond_d4
    invoke-virtual {v15, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;

    move/from16 v25, v1

    :goto_dc
    iget-object v1, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "scaleY"

    if-nez v1, :cond_e6

    move/from16 v26, v3

    const/4 v1, 0x0

    goto :goto_ee

    :cond_e6
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;

    move/from16 v26, v3

    :goto_ee
    iget-object v3, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ぉ〲なぱぽた:Ljava/util/HashMap;

    if-nez v3, :cond_f4

    const/4 v3, 0x0

    goto :goto_fa

    :cond_f4
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;

    :goto_fa
    iget-object v9, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ぉ〲なぱぽた:Ljava/util/HashMap;

    if-nez v9, :cond_100

    const/4 v4, 0x0

    goto :goto_106

    :cond_100
    invoke-virtual {v9, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;

    :goto_106
    iget-object v9, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ぉ〲なぱぽた:Ljava/util/HashMap;

    if-nez v9, :cond_10c

    const/4 v6, 0x0

    goto :goto_112

    :cond_10c
    invoke-virtual {v9, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;

    :goto_112
    iget-object v9, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ぉ〲なぱぽた:Ljava/util/HashMap;

    if-nez v9, :cond_118

    const/4 v2, 0x0

    goto :goto_11e

    :cond_118
    invoke-virtual {v9, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;

    :goto_11e
    iget-object v9, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ぉ〲なぱぽた:Ljava/util/HashMap;

    if-nez v9, :cond_124

    const/4 v0, 0x0

    goto :goto_12a

    :cond_124
    invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;

    :goto_12a
    new-instance v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;

    invoke-direct {v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;-><init>()V

    move-object/from16 v19, v12

    const/4 v12, 0x0

    .line 3
    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:F

    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:F

    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:F

    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:F

    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:F

    .line 4
    invoke-virtual {v9, v11, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V

    invoke-virtual {v9, v8, v10, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V

    invoke-virtual {v9, v15, v1, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V

    if-eqz v6, :cond_14d

    .line 5
    invoke-virtual {v6, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result v12

    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:F

    :cond_14d
    if-eqz v3, :cond_155

    .line 6
    invoke-virtual {v3, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result v12

    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:F

    :cond_155
    if-eqz v4, :cond_15d

    invoke-virtual {v4, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result v12

    iput v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:F

    .line 7
    :cond_15d
    invoke-virtual {v9, v2, v0, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;F)V

    iget-object v12, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ぺぁあねじ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v12, :cond_19f

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->へぬ〴づぞ:[D

    array-length v1, v0

    if-lez v1, :cond_18b

    float-to-double v1, v7

    invoke-virtual {v12, v1, v2, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ(D[D)V

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ぺぁあねじ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    iget-object v3, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->おぐぴう〸ず:[D

    invoke-virtual {v0, v1, v2, v3}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ(D[D)V

    iget-object v7, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;

    iget-object v11, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->のぷのちつ:[I

    iget-object v12, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->おぐぴう〸ず:[D

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->へぬ〴づぞ:[D

    move v8, v13

    move-object v1, v9

    move v9, v14

    move-object/from16 v10, v19

    move/from16 v2, v21

    move-object/from16 v3, v19

    move v4, v13

    move-object v13, v0

    invoke-virtual/range {v7 .. v13}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->づざかべべ(FF[F[I[D[D)V

    goto :goto_191

    :cond_18b
    move-object v1, v9

    move v4, v13

    move-object/from16 v3, v19

    move/from16 v2, v21

    :goto_191
    move-object v7, v1

    move v8, v4

    move v9, v14

    move/from16 v10, v17

    move/from16 v11, v18

    move-object v12, v3

    invoke-virtual/range {v7 .. v12}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ(FFII[F)V

    move v1, v2

    move v2, v4

    goto :goto_1fb

    :cond_19f
    move-object/from16 v12, v19

    move-object/from16 v19, v9

    iget-object v9, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〳ぜぞぜべっ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v9, :cond_200

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ざっざへづ:[F

    invoke-virtual {v5, v7, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->げつ〴ぬぐ(F[F)F

    move-result v0

    iget-object v1, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〳ぜぞぜべっ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    float-to-double v3, v0

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->おぐぴう〸ず:[D

    invoke-virtual {v1, v3, v4, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ(D[D)V

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〳ぜぞぜべっ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    aget-object v0, v0, v2

    iget-object v1, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->へぬ〴づぞ:[D

    invoke-virtual {v0, v3, v4, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ(D[D)V

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->ざっざへづ:[F

    aget v0, v0, v2

    const/4 v1, 0x0

    :goto_1c6
    iget-object v2, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->おぐぴう〸ず:[D

    array-length v3, v2

    if-ge v1, v3, :cond_1de

    aget-wide v3, v2, v1

    float-to-double v6, v0

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v6

    aput-wide v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1c6

    :cond_1de
    iget-object v7, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;

    iget-object v11, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->のぷのちつ:[I

    iget-object v0, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->へぬ〴づぞ:[D

    move v8, v13

    move/from16 v1, v21

    move v9, v14

    move-object v10, v12

    move-object v3, v12

    move-object v12, v2

    move v2, v13

    move-object v13, v0

    invoke-virtual/range {v7 .. v13}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->づざかべべ(FF[F[I[D[D)V

    move-object/from16 v7, v19

    move v8, v2

    move/from16 v10, v17

    move/from16 v11, v18

    move-object v12, v3

    invoke-virtual/range {v7 .. v12}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ(FFII[F)V

    :goto_1fb
    move v0, v1

    move v13, v2

    move-object v1, v3

    goto/16 :goto_28e

    :cond_200
    iget-object v9, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->づざかべべ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;

    move-object/from16 v27, v0

    iget v0, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->なぎぱいぢぎ:F

    iget-object v5, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;

    move-object/from16 v28, v2

    iget v2, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->なぎぱいぢぎ:F

    sub-float/2addr v0, v2

    iget v2, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->ぁごぐすすぃ:F

    move-object/from16 v29, v4

    iget v4, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->ぁごぐすすぃ:F

    sub-float/2addr v2, v4

    iget v4, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->〳ぜぞぜべっ:F

    move-object/from16 v30, v3

    iget v3, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->〳ぜぞぜべっ:F

    sub-float/2addr v4, v3

    iget v3, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->ぺぁあねじ:F

    iget v5, v5, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/おぐぴう〸ず;->ぺぁあねじ:F

    sub-float/2addr v3, v5

    add-float/2addr v4, v0

    add-float/2addr v3, v2

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float v9, v5, v13

    mul-float v9, v9, v0

    mul-float v4, v4, v13

    add-float/2addr v4, v9

    const/4 v0, 0x0

    aput v4, v12, v0

    sub-float/2addr v5, v14

    mul-float v5, v5, v2

    mul-float v3, v3, v14

    add-float/2addr v3, v5

    aput v3, v12, v16

    move-object/from16 v0, v19

    const/4 v2, 0x0

    .line 8
    iput v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:F

    iput v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:F

    iput v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:F

    iput v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:F

    iput v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:F

    .line 9
    invoke-virtual {v0, v11, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V

    invoke-virtual {v0, v8, v10, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V

    invoke-virtual {v0, v15, v1, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V

    if-eqz v6, :cond_254

    .line 10
    invoke-virtual {v6, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result v1

    iput v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:F

    :cond_254
    if-eqz v30, :cond_25e

    move-object/from16 v3, v30

    .line 11
    invoke-virtual {v3, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result v1

    iput v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:F

    :cond_25e
    if-eqz v29, :cond_268

    move-object/from16 v4, v29

    invoke-virtual {v4, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result v1

    iput v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:F

    :cond_268
    move-object/from16 v1, v27

    move-object/from16 v2, v28

    .line 12
    invoke-virtual {v0, v2, v1, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;F)V

    move-object v7, v0

    move v8, v13

    move/from16 v0, v21

    move v9, v14

    move/from16 v10, v17

    move/from16 v11, v18

    move-object v1, v12

    invoke-virtual/range {v7 .. v12}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ(FFII[F)V

    goto :goto_28e

    :cond_27d
    move/from16 v25, v1

    move/from16 v24, v2

    move/from16 v26, v3

    move-object/from16 v20, v4

    move/from16 v22, v6

    move v0, v11

    move-object v1, v12

    move/from16 v23, v15

    .line 13
    invoke-virtual {v5, v9, v13, v14, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〺つふすそ(FFF[F)V

    :goto_28e
    const/4 v2, 0x2

    if-ge v0, v2, :cond_29e

    const/4 v0, 0x0

    aget v2, v1, v0

    mul-float v2, v2, v26

    aput v2, v1, v0

    aget v0, v1, v16

    mul-float v0, v0, v26

    aput v0, v1, v16

    :cond_29e
    move-object/from16 v0, p0

    .line 14
    iget-object v1, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぇぬぎばつ:Landroid/graphics/Matrix;

    iget-object v2, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->おぐぴう〸ず:[F

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapVectors([F)V

    move/from16 v1, v25

    int-to-float v2, v1

    mul-float v4, v2, v13

    move/from16 v2, v24

    int-to-float v3, v2

    mul-float v5, v3, v14

    iget-object v3, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->おぐぴう〸ず:[F

    const/4 v9, 0x0

    aget v6, v3, v9

    iget v7, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->は〲ぱなで:F

    mul-float v6, v6, v7

    sub-float v6, v4, v6

    aget v8, v3, v16

    mul-float v8, v8, v7

    sub-float v7, v5, v8

    iget-object v8, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->ぇぬぎばつ:Landroid/graphics/Matrix;

    invoke-virtual {v8, v3}, Landroid/graphics/Matrix;->mapVectors([F)V

    iget-object v8, v0, Landroidx/constraintlayout/utils/widget/MotionTelltales;->のぷのちつ:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v15, v23, 0x1

    move-object/from16 v4, v20

    move/from16 v6, v22

    const/4 v3, 0x5

    goto/16 :goto_33

    :cond_2d7
    move-object/from16 v20, v4

    move/from16 v22, v6

    const/4 v9, 0x0

    add-int/lit8 v6, v22, 0x1

    const/4 v3, 0x5

    goto/16 :goto_2e

    :cond_2e1
    return-void

    :array_2e2
    .array-data 4
        0x3dcccccd    # 0.1f
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f666666    # 0.9f
    .end array-data
.end method

.method public onLayout(ZIIII)V
    .registers 6

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .registers 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->ぁごぐすすぃ:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
