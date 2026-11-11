.class public Lcom/github/clans/fab/FloatingActionButton;
.super Landroid/widget/ImageButton;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;,
        Lcom/github/clans/fab/FloatingActionButton$づざかべべ;,
        Lcom/github/clans/fab/FloatingActionButton$びぐびあび;
    }
.end annotation


# static fields
.field public static final ぺがぅす〹ち:Landroid/graphics/Xfermode;


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:I

.field public 〺でおいここ:I

.field public 〻ぞまぎな〻:I

.field public ぁごぐすすぃ:I

.field public ぃぜぶの〸ぃ:I

.field public いいにぽつ:I

.field public ぅみぱぎぎ:Landroid/graphics/Paint;

.field public ぇ〳〲〺すっ:F

.field public ぇとしたべど:F

.field public ぇぬぎばつ:Ljava/lang/String;

.field public えがぐせほち:Z

.field public ぉ〲なぱぽた:Z

.field public ぉざぅち〻:Landroid/view/View$OnClickListener;

.field public ぉひのべい:J

.field public おかぷせ〱:Z

.field public おぐぴう〸ず:Landroid/view/animation/Animation;

.field public くし〴〺ぅ:Z

.field public けときぜと:D

.field public げがぴうあだ:F

.field public こ〲しでおか:Landroid/view/GestureDetector;

.field public ごづごきえ:Z

.field public ごまけがぢは:Z

.field public ざっざへづ:Z

.field public ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

.field public じぜこほぱ:Landroid/graphics/Paint;

.field public せづっ〸ちね:F

.field public ち〴みぎ〻び:Z

.field public づざかべべ:I

.field public ておぞぞはね:Z

.field public てぜきぽく:Landroid/graphics/drawable/Drawable;

.field public でどあくず:I

.field public どぇぞほだ:Landroid/graphics/RectF;

.field public ながふずは:F

.field public なぎぱいぢぎ:I

.field public なぶひせが:Z

.field public のぷのちつ:I

.field public は〲ぱなで:Z

.field public ばおぢでぎか:I

.field public びえぁぜい:F

.field public びぐびあび:I

.field public ぶでにく〼〳:I

.field public ぷぞてのほき:J

.field public へぬ〴づぞ:Landroid/view/animation/Animation;

.field public ぺぁあねじ:I

.field public ぺづげぺが:Z

.field public ぺふねづ〺:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    sput-object v0, Lcom/github/clans/fab/FloatingActionButton;->ぺがぅす〹ち:Landroid/graphics/Xfermode;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/github/clans/fab/FloatingActionButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/github/clans/fab/FloatingActionButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 8

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->のぷのちつ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇ〳〲〺すっ:F

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->びえぁぜい:F

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->どぇぞほだ:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぅみぱぎぎ:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->じぜこほぱ:Landroid/graphics/Paint;

    const/high16 v0, 0x43430000    # 195.0f

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->せづっ〸ちね:F

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぷぞてのほき:J

    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->おかぷせ〱:Z

    const/16 v0, 0x10

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->〺でおいここ:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ばおぢでぎか:I

    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;

    invoke-direct {v3, p0}, Lcom/github/clans/fab/FloatingActionButton$〺つふすそ;-><init>(Lcom/github/clans/fab/FloatingActionButton;)V

    invoke-direct {v0, v2, v3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->こ〲しでおか:Landroid/view/GestureDetector;

    .line 1
    sget-object v0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_colorNormal:I

    const p3, -0x25bcca

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_colorPressed:I

    const p3, -0x18afbd

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_colorDisabled:I

    const p3, -0x555556

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->いいにぽつ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_colorRipple:I

    const p3, -0x66000001

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_showShadow:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_shadowColor:I

    const/high16 p3, 0x66000000

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_shadowRadius:I

    iget p3, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_shadowXOffset:I

    iget p3, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_shadowYOffset:I

    iget p3, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_size:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_label:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇぬぎばつ:Ljava/lang/String;

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_progress_indeterminate:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ち〴みぎ〻び:Z

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_progress_color:I

    const p3, -0xff6978

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぶでにく〼〳:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_progress_backgroundColor:I

    const/high16 p3, 0x4d000000    # 1.34217728E8f

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->〻ぞまぎな〻:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_progress_max:I

    iget p3, p0, Lcom/github/clans/fab/FloatingActionButton;->ばおぢでぎか:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ばおぢでぎか:I

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_progress_showBackground:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ごまけがぢは:Z

    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_progress:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_12f

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I

    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->えがぐせほち:Z

    :cond_12f
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_elevationCompat:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_149

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/widget/ImageButton;->isInEditMode()Z

    move-result p3

    if-eqz p3, :cond_146

    invoke-virtual {p0, p2}, Lcom/github/clans/fab/FloatingActionButton;->setElevation(F)V

    goto :goto_149

    :cond_146
    invoke-virtual {p0, p2}, Lcom/github/clans/fab/FloatingActionButton;->setElevationCompat(F)V

    .line 2
    :cond_149
    :goto_149
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_showAnimation:I

    sget p3, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_scale_up:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionButton;->へぬ〴づぞ:Landroid/view/animation/Animation;

    .line 3
    sget p2, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺;->FloatingActionButton_fab_hideAnimation:I

    sget p3, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->fab_scale_down:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p2

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず:Landroid/view/animation/Animation;

    .line 4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Landroid/widget/ImageButton;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_18a

    iget-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ち〴みぎ〻び:Z

    if-eqz p1, :cond_17e

    invoke-virtual {p0, v1}, Lcom/github/clans/fab/FloatingActionButton;->setIndeterminate(Z)V

    goto :goto_18a

    :cond_17e
    iget-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->えがぐせほち:Z

    if-eqz p1, :cond_18a

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく()V

    iget p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I

    invoke-virtual {p0, p1, v2}, Lcom/github/clans/fab/FloatingActionButton;->setProgress(IZ)V

    :cond_18a
    :goto_18a
    invoke-virtual {p0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    return-void
.end method

.method private getCircleSize()I
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ:I

    if-nez v1, :cond_b

    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->fab_size_normal:I

    goto :goto_d

    :cond_b
    sget v1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->fab_size_mini:I

    :goto_d
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private getShadowX()I
    .registers 3

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method private getShadowY()I
    .registers 3

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method private setBackgroundCompat(Landroid/graphics/drawable/Drawable;)V
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_f

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/ImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_12

    :cond_f
    invoke-virtual {p0, p1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_12
    return-void
.end method

.method public static synthetic げつ〴ぬぐ(Lcom/github/clans/fab/FloatingActionButton;)I
    .registers 1

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getCircleSize()I

    move-result p0

    return p0
.end method


# virtual methods
.method public getButtonSize()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ:I

    return v0
.end method

.method public getColorDisabled()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->いいにぽつ:I

    return v0
.end method

.method public getColorNormal()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ:I

    return v0
.end method

.method public getColorPressed()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ:I

    return v0
.end method

.method public getColorRipple()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺:I

    return v0
.end method

.method public getHideAnimation()Landroid/view/animation/Animation;
    .registers 2

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず:Landroid/view/animation/Animation;

    return-object v0
.end method

.method public getIconDrawable()Landroid/graphics/drawable/Drawable;
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0
.end method

.method public getLabelText()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇぬぎばつ:Ljava/lang/String;

    return-object v0
.end method

.method public getLabelView()Lcom/github/clans/fab/Label;
    .registers 2

    sget v0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/clans/fab/Label;

    return-object v0
.end method

.method public getLabelVisibility()I
    .registers 2

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getLabelView()Lcom/github/clans/fab/Label;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    return v0

    :cond_b
    const/4 v0, -0x1

    return v0
.end method

.method public declared-synchronized getMax()I
    .registers 2

    monitor-enter p0

    :try_start_1
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ばおぢでぎか:I
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    monitor-exit p0

    return v0

    :catchall_5
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getOnClickListener()Landroid/view/View$OnClickListener;
    .registers 2

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉざぅち〻:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public declared-synchronized getProgress()I
    .registers 2

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺづげぺが:Z

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    goto :goto_9

    :cond_7
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I
    :try_end_9
    .catchall {:try_start_1 .. :try_end_9} :catchall_b

    :goto_9
    monitor-exit p0

    return v0

    :catchall_b
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getShadowColor()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    return v0
.end method

.method public getShadowRadius()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    return v0
.end method

.method public getShadowXOffset()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    return v0
.end method

.method public getShadowYOffset()I
    .registers 2

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    return v0
.end method

.method public getShowAnimation()Landroid/view/animation/Animation;
    .registers 2

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->へぬ〴づぞ:Landroid/view/animation/Animation;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 12

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onDraw(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz v0, :cond_10b

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ごまけがぢは:Z

    if-eqz v0, :cond_18

    iget-object v2, p0, Lcom/github/clans/fab/FloatingActionButton;->どぇぞほだ:Landroid/graphics/RectF;

    const/high16 v3, 0x43b40000    # 360.0f

    const/high16 v4, 0x43b40000    # 360.0f

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/github/clans/fab/FloatingActionButton;->ぅみぱぎぎ:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_18
    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺづげぺが:Z

    const/high16 v2, 0x447a0000    # 1000.0f

    const/4 v3, 0x1

    if-eqz v1, :cond_c7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉひのべい:J

    sub-long/2addr v0, v4

    long-to-float v4, v0

    iget v5, p0, Lcom/github/clans/fab/FloatingActionButton;->せづっ〸ちね:F

    mul-float v4, v4, v5

    div-float/2addr v4, v2

    .line 1
    iget-wide v5, p0, Lcom/github/clans/fab/FloatingActionButton;->ぷぞてのほき:J

    const-wide/16 v7, 0xc8

    cmp-long v2, v5, v7

    if-ltz v2, :cond_8c

    iget-wide v5, p0, Lcom/github/clans/fab/FloatingActionButton;->けときぜと:D

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v5, v0

    iput-wide v5, p0, Lcom/github/clans/fab/FloatingActionButton;->けときぜと:D

    const-wide v0, 0x407f400000000000L    # 500.0

    cmpl-double v2, v5, v0

    if-lez v2, :cond_56

    sub-double/2addr v5, v0

    iput-wide v5, p0, Lcom/github/clans/fab/FloatingActionButton;->けときぜと:D

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Lcom/github/clans/fab/FloatingActionButton;->ぷぞてのほき:J

    iget-boolean v2, p0, Lcom/github/clans/fab/FloatingActionButton;->おかぷせ〱:Z

    xor-int/2addr v2, v3

    iput-boolean v2, p0, Lcom/github/clans/fab/FloatingActionButton;->おかぷせ〱:Z

    :cond_56
    iget-wide v5, p0, Lcom/github/clans/fab/FloatingActionButton;->けときぜと:D

    div-double/2addr v5, v0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v5, v0

    const-wide v0, 0x400921fb54442d18L    # Math.PI

    mul-double v5, v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->〺でおいここ:I

    rsub-int v1, v1, 0x10e

    int-to-float v1, v1

    iget-boolean v2, p0, Lcom/github/clans/fab/FloatingActionButton;->おかぷせ〱:Z

    if-eqz v2, :cond_7c

    mul-float v0, v0, v1

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇとしたべど:F

    goto :goto_8f

    :cond_7c
    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, v0

    mul-float v2, v2, v1

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇとしたべど:F

    sub-float/2addr v1, v2

    add-float/2addr v1, v0

    iput v1, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    iput v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇとしたべど:F

    goto :goto_8f

    :cond_8c
    add-long/2addr v5, v0

    iput-wide v5, p0, Lcom/github/clans/fab/FloatingActionButton;->ぷぞてのほき:J

    .line 2
    :goto_8f
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    add-float/2addr v0, v4

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    const/high16 v1, 0x43b40000    # 360.0f

    cmpl-float v2, v0, v1

    if-lez v2, :cond_9d

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    :cond_9d
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉひのべい:J

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    const/high16 v1, 0x42b40000    # 90.0f

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->〺でおいここ:I

    int-to-float v1, v1

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇとしたべど:F

    add-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/widget/ImageButton;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_bb

    const/4 v0, 0x0

    const/high16 v1, 0x43070000    # 135.0f

    const/4 v6, 0x0

    const/high16 v7, 0x43070000    # 135.0f

    goto :goto_bd

    :cond_bb
    move v6, v0

    move v7, v1

    :goto_bd
    iget-object v5, p0, Lcom/github/clans/fab/FloatingActionButton;->どぇぞほだ:Landroid/graphics/RectF;

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/github/clans/fab/FloatingActionButton;->じぜこほぱ:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_106

    :cond_c7
    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    iget v4, p0, Lcom/github/clans/fab/FloatingActionButton;->ながふずは:F

    cmpl-float v1, v1, v4

    if-eqz v1, :cond_f8

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉひのべい:J

    sub-long/2addr v0, v4

    long-to-float v0, v0

    div-float/2addr v0, v2

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->せづっ〸ちね:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ながふずは:F

    cmpl-float v4, v1, v2

    if-lez v4, :cond_ea

    sub-float/2addr v1, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_ef

    :cond_ea
    add-float/2addr v1, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    :goto_ef
    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉひのべい:J

    const/4 v0, 0x1

    :cond_f8
    iget-object v2, p0, Lcom/github/clans/fab/FloatingActionButton;->どぇぞほだ:Landroid/graphics/RectF;

    const/high16 v3, -0x3d4c0000    # -90.0f

    iget v4, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/github/clans/fab/FloatingActionButton;->じぜこほぱ:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    move v3, v0

    :goto_106
    if-eqz v3, :cond_10b

    invoke-virtual {p0}, Landroid/widget/ImageButton;->invalidate()V

    :cond_10b
    return-void
.end method

.method public onMeasure(II)V
    .registers 3

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ()I

    move-result p1

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/widget/ImageButton;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 4

    instance-of v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ImageButton;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〺つふすそ:F

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->くし〴〺ぅ:F

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ながふずは:F

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->びぐびあび:F

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->せづっ〸ちね:F

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->なぎぱいぢぎ:I

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぁごぐすすぃ:I

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぶでにく〼〳:I

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〳ぜぞぜべっ:I

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->〻ぞまぎな〻:I

    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->てぜきぽく:Z

    iput-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ち〴みぎ〻び:Z

    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->のぷのちつ:Z

    iput-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->えがぐせほち:Z

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->づざかべべ:I

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I

    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->へぬ〴づぞ:Z

    iput-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ておぞぞはね:Z

    iget-boolean p1, p1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->おぐぴう〸ず:Z

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ごまけがぢは:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉひのべい:J

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 4

    invoke-super {p0}, Landroid/widget/ImageButton;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;

    invoke-direct {v1, v0}, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;-><init>(Landroid/os/Parcelable;)V

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    iput v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〺つふすそ:F

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ながふずは:F

    iput v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->くし〴〺ぅ:F

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->せづっ〸ちね:F

    iput v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->びぐびあび:F

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    iput v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->なぎぱいぢぎ:I

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぶでにく〼〳:I

    iput v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->ぁごぐすすぃ:I

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->〻ぞまぎな〻:I

    iput v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->〳ぜぞぜべっ:I

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺづげぺが:Z

    iput-boolean v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->てぜきぽく:Z

    iget-boolean v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz v2, :cond_31

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I

    if-lez v2, :cond_31

    if-nez v0, :cond_31

    const/4 v0, 0x1

    goto :goto_32

    :cond_31
    const/4 v0, 0x0

    :goto_32
    iput-boolean v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->のぷのちつ:Z

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I

    iput v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->づざかべべ:I

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ておぞぞはね:Z

    iput-boolean v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->へぬ〴づぞ:Z

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ごまけがぢは:Z

    iput-boolean v0, v1, Lcom/github/clans/fab/FloatingActionButton$ProgressSavedState;->おぐぴう〸ず:Z

    return-object v1
.end method

.method public onSizeChanged(IIII)V
    .registers 9

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく()V

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ち〴みぎ〻び:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/github/clans/fab/FloatingActionButton;->setIndeterminate(Z)V

    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ち〴みぎ〻び:Z

    goto :goto_68

    :cond_f
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->えがぐせほち:Z

    if-eqz v0, :cond_1d

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I

    iget-boolean v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ておぞぞはね:Z

    invoke-virtual {p0, v0, v2}, Lcom/github/clans/fab/FloatingActionButton;->setProgress(IZ)V

    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->えがぐせほち:Z

    goto :goto_68

    :cond_1d
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉ〲なぱぽた:Z

    if-eqz v0, :cond_68

    .line 1
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz v0, :cond_5c

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇ〳〲〺すっ:F

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getX()F

    move-result v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_38

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getX()F

    move-result v0

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    goto :goto_40

    :cond_38
    invoke-virtual {p0}, Landroid/widget/ImageButton;->getX()F

    move-result v0

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    int-to-float v2, v2

    sub-float/2addr v0, v2

    :goto_40
    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->びえぁぜい:F

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getY()F

    move-result v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_53

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getY()F

    move-result v2

    iget v3, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    goto :goto_60

    :cond_53
    invoke-virtual {p0}, Landroid/widget/ImageButton;->getY()F

    move-result v2

    iget v3, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    goto :goto_60

    :cond_5c
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇ〳〲〺すっ:F

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->びえぁぜい:F

    :goto_60
    invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->setX(F)V

    invoke-virtual {p0, v2}, Landroid/widget/ImageButton;->setY(F)V

    .line 2
    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉ〲なぱぽた:Z

    :cond_68
    :goto_68
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageButton;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->のぷのちつ()V

    .line 3
    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぅみぱぎぎ:Landroid/graphics/Paint;

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton;->〻ぞまぎな〻:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぅみぱぎぎ:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぅみぱぎぎ:Landroid/graphics/Paint;

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->じぜこほぱ:Landroid/graphics/Paint;

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ぶでにく〼〳:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->じぜこほぱ:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->じぜこほぱ:Landroid/graphics/Paint;

    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉざぅち〻:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2f

    invoke-virtual {p0}, Landroid/widget/ImageButton;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2f

    sget v0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/clans/fab/Label;

    if-nez v0, :cond_19

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_24

    const/4 v2, 0x3

    if-eq v1, v2, :cond_24

    goto :goto_2a

    :cond_24
    invoke-virtual {v0}, Lcom/github/clans/fab/Label;->びぐびあび()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺()V

    :goto_2a
    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->こ〲しでおか:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_2f
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setButtonSize(I)V
    .registers 3

    if-eqz p1, :cond_e

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    goto :goto_e

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Use @FabSize constants only!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_e
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ:I

    if-eq v0, p1, :cond_17

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ:I

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_17
    return-void
.end method

.method public setColorDisabled(I)V
    .registers 3

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->いいにぽつ:I

    if-eq p1, v0, :cond_9

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->いいにぽつ:I

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_9
    return-void
.end method

.method public setColorDisabledResId(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorDisabled(I)V

    return-void
.end method

.method public setColorNormal(I)V
    .registers 3

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ:I

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_9
    return-void
.end method

.method public setColorNormalResId(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorNormal(I)V

    return-void
.end method

.method public setColorPressed(I)V
    .registers 3

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ:I

    if-eq p1, v0, :cond_9

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ:I

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_9
    return-void
.end method

.method public setColorPressedResId(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorPressed(I)V

    return-void
.end method

.method public setColorRipple(I)V
    .registers 3

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺:I

    if-eq p1, v0, :cond_9

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺:I

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_9
    return-void
.end method

.method public setColorRippleResId(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setColorRipple(I)V

    return-void
.end method

.method public setElevation(F)V
    .registers 3

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v0

    if-eqz v0, :cond_1d

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1d

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setElevation(F)V

    invoke-virtual {p0}, Landroid/widget/ImageButton;->isInEditMode()Z

    move-result p1

    if-nez p1, :cond_1a

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->は〲ぱなで:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    :cond_1a
    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_1d
    return-void
.end method

.method public setElevationCompat(F)V
    .registers 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/high16 v0, 0x26000000

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ:I

    if-nez v2, :cond_16

    move v0, p1

    :cond_16
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_37

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setElevation(F)V

    iput-boolean v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ごづごきえ:Z

    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_3c

    invoke-virtual {p0, p1}, Lcom/github/clans/fab/FloatingActionButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3c

    :cond_37
    iput-boolean v2, p0, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_3c
    :goto_3c
    return-void
.end method

.method public setEnabled(Z)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    sget v0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/clans/fab/Label;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    :cond_10
    return-void
.end method

.method public setHideAnimation(Landroid/view/animation/Animation;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず:Landroid/view/animation/Animation;

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_9

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_9
    return-void
.end method

.method public setImageResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_11

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_11
    return-void
.end method

.method public declared-synchronized setIndeterminate(Z)V
    .registers 4

    monitor-enter p0

    if-nez p1, :cond_6

    const/4 v0, 0x0

    :try_start_4
    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    :cond_6
    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉ〲なぱぽた:Z

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺづげぺが:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉひのべい:J

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->のぷのちつ()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V
    :try_end_19
    .catchall {:try_start_4 .. :try_end_19} :catchall_1b

    monitor-exit p0

    return-void

    :catchall_1b
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setLabelColors(III)V
    .registers 9

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getLabelView()Lcom/github/clans/fab/Label;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v4

    .line 1
    iput p1, v0, Lcom/github/clans/fab/Label;->いいにぽつ:I

    iput p2, v0, Lcom/github/clans/fab/Label;->ぺふねづ〺:I

    iput p3, v0, Lcom/github/clans/fab/Label;->てぜきぽく:I

    .line 2
    invoke-virtual {v0}, Lcom/github/clans/fab/Label;->づざかべべ()V

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    return-void
.end method

.method public setLabelText(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇぬぎばつ:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getLabelView()Lcom/github/clans/fab/Label;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_b
    return-void
.end method

.method public setLabelTextColor(I)V
    .registers 3

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getLabelView()Lcom/github/clans/fab/Label;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setLabelTextColor(Landroid/content/res/ColorStateList;)V
    .registers 3

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getLabelView()Lcom/github/clans/fab/Label;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setLabelVisibility(I)V
    .registers 3

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getLabelView()Lcom/github/clans/fab/Label;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    if-nez p1, :cond_d

    const/4 p1, 0x1

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    invoke-virtual {v0, p1}, Lcom/github/clans/fab/Label;->setHandleVisibilityChanges(Z)V

    :cond_11
    return-void
.end method

.method public setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_2f

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ごづごきえ:Z

    if-eqz v0, :cond_2f

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowX()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowY()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowX()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowY()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_2f
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public declared-synchronized setMax(I)V
    .registers 2

    monitor-enter p0

    :try_start_1
    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ばおぢでぎか:I
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    monitor-exit p0

    return-void

    :catchall_5
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉざぅち〻:Landroid/view/View$OnClickListener;

    sget p1, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {p0, p1}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_17

    new-instance v0, Lcom/github/clans/fab/FloatingActionButton$くし〴〺ぅ;

    invoke-direct {v0, p0}, Lcom/github/clans/fab/FloatingActionButton$くし〴〺ぅ;-><init>(Lcom/github/clans/fab/FloatingActionButton;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_17
    return-void
.end method

.method public declared-synchronized setProgress(IZ)V
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺづげぺが:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_52

    if-eqz v0, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_7
    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぃぜぶの〸ぃ:I

    iput-boolean p2, p0, Lcom/github/clans/fab/FloatingActionButton;->ておぞぞはね:Z

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->なぶひせが:Z

    const/4 v1, 0x1

    if-nez v0, :cond_14

    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->えがぐせほち:Z
    :try_end_12
    .catchall {:try_start_7 .. :try_end_12} :catchall_52

    monitor-exit p0

    return-void

    :cond_14
    :try_start_14
    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    iput-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉ〲なぱぽた:Z

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->のぷのちつ()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->てぜきぽく()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    if-gez p1, :cond_25

    const/4 p1, 0x0

    goto :goto_2a

    :cond_25
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ばおぢでぎか:I

    if-le p1, v0, :cond_2a

    move p1, v0

    :cond_2a
    :goto_2a
    int-to-float p1, p1

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ながふずは:F
    :try_end_2d
    .catchall {:try_start_14 .. :try_end_2d} :catchall_52

    cmpl-float v0, p1, v0

    if-nez v0, :cond_33

    monitor-exit p0

    return-void

    :cond_33
    :try_start_33
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ばおぢでぎか:I

    if-lez v0, :cond_3e

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float p1, p1, v0

    goto :goto_3f

    :cond_3e
    const/4 p1, 0x0

    :goto_3f
    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ながふずは:F

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぉひのべい:J

    if-nez p2, :cond_4d

    iget p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ながふずは:F

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->げがぴうあだ:F

    :cond_4d
    invoke-virtual {p0}, Landroid/widget/ImageButton;->invalidate()V
    :try_end_50
    .catchall {:try_start_33 .. :try_end_50} :catchall_52

    monitor-exit p0

    return-void

    :catchall_52
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setShadowColor(I)V
    .registers 3

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_9
    return-void
.end method

.method public setShadowColorResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    if-eq v0, p1, :cond_11

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_11
    return-void
.end method

.method public setShadowRadius(F)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->requestLayout()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    return-void
.end method

.method public setShadowRadius(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    if-eq v0, p1, :cond_14

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->requestLayout()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_14
    return-void
.end method

.method public setShadowXOffset(F)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->requestLayout()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    return-void
.end method

.method public setShadowXOffset(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    if-eq v0, p1, :cond_14

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->requestLayout()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_14
    return-void
.end method

.method public setShadowYOffset(F)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉざぅち〻(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->requestLayout()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    return-void
.end method

.method public setShadowYOffset(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    if-eq v0, p1, :cond_14

    iput p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-virtual {p0}, Landroid/widget/ImageButton;->requestLayout()V

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_14
    return-void
.end method

.method public setShowAnimation(Landroid/view/animation/Animation;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->へぬ〴づぞ:Landroid/view/animation/Animation;

    return-void
.end method

.method public declared-synchronized setShowProgressBackground(Z)V
    .registers 2

    monitor-enter p0

    :try_start_1
    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->ごまけがぢは:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    monitor-exit p0

    return-void

    :catchall_5
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setShowShadow(Z)V
    .registers 3

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    if-eq v0, p1, :cond_9

    iput-boolean p1, p0, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず()V

    :cond_9
    return-void
.end method

.method public setVisibility(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setVisibility(I)V

    sget v0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ;->fab_label:I

    invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/clans/fab/Label;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_10
    return-void
.end method

.method public 〳ぜぞぜべっ()Z
    .registers 2

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->は〲ぱなで:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ:Z

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public final 〺つふすそ()F
    .registers 2

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    return v0
.end method

.method public final ぁごぐすすぃ()Landroid/graphics/drawable/Drawable;
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, -0x101009e

    const/4 v4, 0x0

    aput v3, v2, v4

    iget v3, p0, Lcom/github/clans/fab/FloatingActionButton;->いいにぽつ:I

    invoke-virtual {p0, v3}, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v2, v1, [I

    const v3, 0x10100a7

    aput v3, v2, v4

    iget v3, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺぁあねじ:I

    invoke-virtual {p0, v3}, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v2, v4, [I

    iget v3, p0, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ:I

    invoke-virtual {p0, v3}, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v2

    if-eqz v2, :cond_5d

    new-instance v2, Landroid/graphics/drawable/RippleDrawable;

    new-instance v3, Landroid/content/res/ColorStateList;

    new-array v5, v1, [[I

    new-array v6, v4, [I

    aput-object v6, v5, v4

    new-array v6, v1, [I

    iget v7, p0, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺:I

    aput v7, v6, v4

    invoke-direct {v3, v5, v6}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    const/4 v4, 0x0

    invoke-direct {v2, v3, v0, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Lcom/github/clans/fab/FloatingActionButton$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lcom/github/clans/fab/FloatingActionButton$げつ〴ぬぐ;-><init>(Lcom/github/clans/fab/FloatingActionButton;)V

    invoke-virtual {p0, v0}, Landroid/widget/ImageButton;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    invoke-virtual {p0, v1}, Landroid/widget/ImageButton;->setClipToOutline(Z)V

    iput-object v2, p0, Lcom/github/clans/fab/FloatingActionButton;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    return-object v2

    :cond_5d
    iput-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public いいにぽつ()V
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/StateListDrawable;

    const/4 v2, 0x2

    if-eqz v1, :cond_12

    check-cast v0, Landroid/graphics/drawable/StateListDrawable;

    new-array v1, v2, [I

    fill-array-data v1, :array_34

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z

    goto :goto_33

    :cond_12
    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v0

    if-eqz v0, :cond_33

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    new-array v1, v2, [I

    fill-array-data v1, :array_3c

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/RippleDrawable;->setState([I)Z

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ()F

    move-result v1

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/RippleDrawable;->setHotspot(FF)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/RippleDrawable;->setVisible(ZZ)Z

    :cond_33
    :goto_33
    return-void

    :array_34
    .array-data 4
        0x101009e
        0x10100a7
    .end array-data

    :array_3c
    .array-data 4
        0x101009e
        0x10100a7
    .end array-data
.end method

.method public おぐぴう〸ず()V
    .registers 13

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_26

    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    new-instance v5, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;-><init>(Lcom/github/clans/fab/FloatingActionButton;Lcom/github/clans/fab/FloatingActionButton$げつ〴ぬぐ;)V

    aput-object v5, v4, v2

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-direct {v0, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    goto :goto_39

    :cond_26
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    new-array v4, v3, [Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-direct {v0, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    :goto_39
    const/4 v4, -0x1

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_54

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->getIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_54
    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getCircleSize()I

    move-result v5

    if-lez v4, :cond_5b

    goto :goto_5d

    :cond_5b
    iget v4, p0, Lcom/github/clans/fab/FloatingActionButton;->のぷのちつ:I

    :goto_5d
    sub-int/2addr v5, v4

    div-int/2addr v5, v3

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v4

    if-eqz v4, :cond_6f

    iget v4, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    iget v6, p0, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    add-int/2addr v6, v4

    goto :goto_70

    :cond_6f
    const/4 v6, 0x0

    :goto_70
    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v4

    if-eqz v4, :cond_7f

    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    iget v4, p0, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    add-int/2addr v2, v4

    :cond_7f
    iget-boolean v4, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz v4, :cond_87

    iget v4, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    add-int/2addr v6, v4

    add-int/2addr v2, v4

    :cond_87
    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v4

    if-eqz v4, :cond_8f

    const/4 v7, 0x2

    goto :goto_90

    :cond_8f
    const/4 v7, 0x1

    :goto_90
    add-int v10, v6, v5

    add-int v11, v2, v5

    move-object v6, v0

    move v8, v10

    move v9, v11

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    invoke-direct {p0, v0}, Lcom/github/clans/fab/FloatingActionButton;->setBackgroundCompat(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final くし〴〺ぅ()F
    .registers 2

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    return v0
.end method

.method public final づざかべべ()I
    .registers 3

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getCircleSize()I

    move-result v0

    .line 1
    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowX()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    goto :goto_12

    :cond_11
    const/4 v1, 0x0

    :goto_12
    add-int/2addr v0, v1

    .line 2
    iget-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz v1, :cond_1c

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    :cond_1c
    return v0
.end method

.method public final てぜきぽく()V
    .registers 3

    iget-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->なぶひせが:Z

    if-nez v0, :cond_21

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇ〳〲〺すっ:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_12

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getX()F

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ぇ〳〲〺すっ:F

    :cond_12
    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->びえぁぜい:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1e

    invoke-virtual {p0}, Landroid/widget/ImageButton;->getY()F

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton;->びえぁぜい:F

    :cond_1e
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/clans/fab/FloatingActionButton;->なぶひせが:Z

    :cond_21
    return-void
.end method

.method public final なぎぱいぢぎ(I)Landroid/graphics/drawable/Drawable;
    .registers 5

    new-instance v0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;-><init>(Lcom/github/clans/fab/FloatingActionButton;Landroid/graphics/drawable/shapes/Shape;Lcom/github/clans/fab/FloatingActionButton$げつ〴ぬぐ;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object v0
.end method

.method public final のぷのちつ()V
    .registers 7

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowX()I

    move-result v0

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowY()I

    move-result v1

    :cond_17
    new-instance v2, Landroid/graphics/RectF;

    iget v3, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    div-int/lit8 v4, v3, 0x2

    add-int/2addr v4, v0

    int-to-float v4, v4

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v1

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ()I

    move-result v5

    sub-int/2addr v5, v0

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v5, v0

    int-to-float v0, v5

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび()I

    move-result v5

    sub-int/2addr v5, v1

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v5, v1

    int-to-float v1, v5

    invoke-direct {v2, v4, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/github/clans/fab/FloatingActionButton;->どぇぞほだ:Landroid/graphics/RectF;

    return-void
.end method

.method public final びぐびあび()I
    .registers 3

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getCircleSize()I

    move-result v0

    .line 1
    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-direct {p0}, Lcom/github/clans/fab/FloatingActionButton;->getShadowY()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    goto :goto_12

    :cond_11
    const/4 v1, 0x0

    :goto_12
    add-int/2addr v0, v1

    .line 2
    iget-boolean v1, p0, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz v1, :cond_1c

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    :cond_1c
    return v0
.end method

.method public へぬ〴づぞ(Z)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_1c

    if-eqz p1, :cond_19

    .line 2
    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->cancel()V

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->へぬ〴づぞ:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ImageButton;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    :cond_19
    invoke-super {p0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    :cond_1c
    return-void
.end method

.method public ぺぁあねじ(Z)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_9

    const/4 v0, 0x1

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    if-nez v0, :cond_1b

    if-eqz p1, :cond_18

    .line 2
    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->へぬ〴づぞ:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->cancel()V

    iget-object p1, p0, Lcom/github/clans/fab/FloatingActionButton;->おぐぴう〸ず:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ImageButton;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    :cond_18
    invoke-super {p0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    :cond_1b
    return-void
.end method

.method public ぺふねづ〺()V
    .registers 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/StateListDrawable;

    const v2, 0x101009e

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_15

    check-cast v0, Landroid/graphics/drawable/StateListDrawable;

    new-array v1, v4, [I

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z

    goto :goto_34

    :cond_15
    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v0

    if-eqz v0, :cond_34

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton;->ざとぅぼこ〺:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    new-array v1, v4, [I

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/RippleDrawable;->setState([I)Z

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ()F

    move-result v1

    invoke-virtual {p0}, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/RippleDrawable;->setHotspot(FF)V

    invoke-virtual {v0, v4, v4}, Landroid/graphics/drawable/RippleDrawable;->setVisible(ZZ)Z

    :cond_34
    :goto_34
    return-void
.end method
