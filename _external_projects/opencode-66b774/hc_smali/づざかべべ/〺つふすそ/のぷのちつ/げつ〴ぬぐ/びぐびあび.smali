.class public Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;
.super Landroid/graphics/drawable/Drawable;
.source ""


# static fields
.field public static final のぷのちつ:F


# instance fields
.field public final 〳ぜぞぜべっ:I

.field public 〺つふすそ:F

.field public final ぁごぐすすぃ:Landroid/graphics/Path;

.field public いいにぽつ:F

.field public くし〴〺ぅ:F

.field public final げつ〴ぬぐ:Landroid/graphics/Paint;

.field public づざかべべ:F

.field public てぜきぽく:I

.field public なぎぱいぢぎ:Z

.field public びぐびあび:F

.field public ぺぁあねじ:Z

.field public ぺふねづ〺:F


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float v0, v0

    sput v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->のぷのちつ:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 11

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Z

    const/4 v2, 0x2

    iput v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->てぜきぽく:I

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v2, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    sget-object v2, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v3, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle:[I

    sget v4, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->drawerArrowStyle:I

    sget v5, Lづざかべべ/〺つふすそ/ぺぁあねじ;->Base_Widget_AppCompat_DrawerArrowToggle:I

    const/4 v6, 0x0

    invoke-virtual {p1, v6, v3, v4, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v3, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_color:I

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 1
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v4

    if-eq v3, v4, :cond_4b

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 2
    :cond_4b
    sget v3, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_thickness:I

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v5

    cmpl-float v5, v5, v3

    if-eqz v5, :cond_76

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v3, v0

    float-to-double v5, v3

    sget v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->のぷのちつ:F

    float-to-double v7, v0

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v5

    double-to-float v0, v7

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺふねづ〺:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    :cond_76
    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_spinBars:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 5
    iget-boolean v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->なぎぱいぢぎ:Z

    if-eq v2, v0, :cond_85

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->なぎぱいぢぎ:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    :cond_85
    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_gapBetweenBars:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    .line 7
    iget v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->づざかべべ:F

    cmpl-float v2, v0, v2

    if-eqz v2, :cond_9b

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->づざかべべ:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    :cond_9b
    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_drawableSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->〳ぜぞぜべっ:I

    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_barLength:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:F

    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_arrowHeadLength:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:F

    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->DrawerArrowToggle_arrowShaftLength:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->びぐびあび:F

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static げつ〴ぬぐ(FFF)F
    .registers 3

    invoke-static {p1, p0, p2, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(FFFF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    iget v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->てぜきぽく:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_21

    if-eq v3, v5, :cond_20

    const/4 v6, 0x3

    if-eq v3, v6, :cond_1a

    invoke-static/range {p0 .. p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->せづっ〸ちね(Landroid/graphics/drawable/Drawable;)I

    move-result v3

    if-ne v3, v5, :cond_21

    goto :goto_20

    :cond_1a
    invoke-static/range {p0 .. p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->せづっ〸ちね(Landroid/graphics/drawable/Drawable;)I

    move-result v3

    if-nez v3, :cond_21

    :cond_20
    :goto_20
    const/4 v4, 0x1

    :cond_21
    iget v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:F

    mul-float v3, v3, v3

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v3, v3, v6

    float-to-double v7, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    double-to-float v3, v7

    iget v7, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:F

    iget v8, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    invoke-static {v7, v3, v8}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ(FFF)F

    move-result v3

    iget v7, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:F

    iget v8, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->びぐびあび:F

    iget v9, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    invoke-static {v7, v8, v9}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ(FFF)F

    move-result v7

    iget v8, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺふねづ〺:F

    iget v9, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    const/4 v10, 0x0

    invoke-static {v10, v8, v9}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ(FFF)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    int-to-float v8, v8

    sget v9, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->のぷのちつ:F

    iget v11, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    invoke-static {v10, v9, v11}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ(FFF)F

    move-result v9

    if-eqz v4, :cond_5b

    const/4 v11, 0x0

    goto :goto_5d

    :cond_5b
    const/high16 v11, -0x3ccc0000    # -180.0f

    :goto_5d
    const/high16 v12, 0x43340000    # 180.0f

    if-eqz v4, :cond_64

    const/high16 v13, 0x43340000    # 180.0f

    goto :goto_65

    :cond_64
    const/4 v13, 0x0

    :goto_65
    iget v14, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    invoke-static {v11, v13, v14}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ(FFF)F

    move-result v11

    float-to-double v13, v3

    move v15, v11

    float-to-double v10, v9

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v16, v16, v13

    move v9, v4

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-float v3, v3

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v13

    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    move-result-wide v10

    long-to-float v4, v10

    iget-object v10, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->rewind()V

    iget v10, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->づざかべべ:F

    iget-object v11, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {v11}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v11

    add-float/2addr v11, v10

    iget v10, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺふねづ〺:F

    neg-float v10, v10

    iget v13, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    invoke-static {v11, v10, v13}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ(FFF)F

    move-result v10

    neg-float v11, v7

    div-float/2addr v11, v6

    iget-object v13, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    add-float v14, v11, v8

    const/4 v5, 0x0

    invoke-virtual {v13, v14, v5}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v13, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    mul-float v8, v8, v6

    sub-float/2addr v7, v8

    invoke-virtual {v13, v7, v5}, Landroid/graphics/Path;->rLineTo(FF)V

    iget-object v5, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    invoke-virtual {v5, v11, v10}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v5, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    invoke-virtual {v5, v3, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    iget-object v5, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    neg-float v7, v10

    invoke-virtual {v5, v11, v7}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v5, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    neg-float v4, v4

    invoke-virtual {v5, v3, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    iget-object v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget-object v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x40400000    # 3.0f

    mul-float v5, v5, v3

    sub-float/2addr v4, v5

    iget v5, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->づざかべべ:F

    mul-float v6, v6, v5

    sub-float/2addr v4, v6

    float-to-int v4, v4

    div-int/lit8 v4, v4, 0x4

    mul-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    const/high16 v6, 0x3fc00000    # 1.5f

    mul-float v3, v3, v6

    add-float/2addr v3, v5

    add-float/2addr v3, v4

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerX()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-boolean v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->なぎぱいぢぎ:Z

    if-eqz v2, :cond_10e

    iget-boolean v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Z

    xor-int/2addr v2, v9

    if-eqz v2, :cond_106

    const/4 v5, -0x1

    goto :goto_107

    :cond_106
    const/4 v5, 0x1

    :goto_107
    int-to-float v2, v5

    mul-float v11, v15, v2

    invoke-virtual {v1, v11}, Landroid/graphics/Canvas;->rotate(F)V

    goto :goto_113

    :cond_10e
    if-eqz v9, :cond_113

    invoke-virtual {v1, v12}, Landroid/graphics/Canvas;->rotate(F)V

    :cond_113
    :goto_113
    iget-object v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Landroid/graphics/Path;

    iget-object v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public getIntrinsicHeight()I
    .registers 2

    iget v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->〳ぜぞぜべっ:I

    return v0
.end method

.method public getIntrinsicWidth()I
    .registers 2

    iget v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->〳ぜぞぜべっ:I

    return v0
.end method

.method public getOpacity()I
    .registers 2

    const/4 v0, -0x3

    return v0
.end method

.method public setAlpha(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    if-eq p1, v0, :cond_10

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_10
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
