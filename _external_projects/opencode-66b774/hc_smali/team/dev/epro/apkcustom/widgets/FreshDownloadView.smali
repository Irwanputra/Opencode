.class public Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;
.super Landroid/view/View;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;,
        Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/graphics/RectF;

.field public 〺つふすそ:F

.field public 〺でおいここ:F

.field public 〻ぞまぎな〻:Z

.field public ぁごぐすすぃ:Landroid/graphics/Rect;

.field public ぃぜぶの〸ぃ:Landroid/graphics/DashPathEffect;

.field public いいにぽつ:Z

.field public ぅみぱぎぎ:Landroid/graphics/Path;

.field public ぇ〳〲〺すっ:Z

.field public ぇとしたべど:F

.field public ぇぬぎばつ:Landroid/animation/AnimatorSet;

.field public えがぐせほち:Landroid/animation/AnimatorSet;

.field public ぉ〲なぱぽた:F

.field public ぉざぅち〻:F

.field public ぉひのべい:Landroid/graphics/PathMeasure;

.field public おかぷせ〱:F

.field public おぐぴう〸ず:Landroid/animation/AnimatorSet;

.field public くし〴〺ぅ:I

.field public けときぜと:F

.field public げがぴうあだ:Landroid/graphics/DashPathEffect;

.field public ごづごきえ:Z

.field public ざっざへづ:F

.field public ざとぅぼこ〺:F

.field public じぜこほぱ:Landroid/graphics/Path;

.field public せづっ〸ちね:Landroid/graphics/PathMeasure;

.field public ち〴みぎ〻び:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

.field public づざかべべ:F

.field public ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

.field public てぜきぽく:F

.field public でどあくず:F

.field public どぇぞほだ:Landroid/graphics/Path;

.field public ながふずは:Landroid/graphics/DashPathEffect;

.field public なぎぱいぢぎ:F

.field public なぶひせが:Landroid/graphics/Paint;

.field public のぷのちつ:Landroid/graphics/Rect;

.field public は〲ぱなで:F

.field public ばおぢでぎか:F

.field public びえぁぜい:Landroid/graphics/Path;

.field public びぐびあび:I

.field public ぶでにく〼〳:F

.field public ぷぞてのほき:F

.field public へぬ〴づぞ:F

.field public ぺぁあねじ:F

.field public ぺづげぺが:Landroid/graphics/PathMeasure;

.field public ぺふねづ〺:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-class p3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    const/4 p3, 0x0

    iput-boolean p3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->いいにぽつ:Z

    iput-boolean p3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇ〳〲〺すっ:Z

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->びえぁぜい:Landroid/graphics/Path;

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->〺つふすそ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0700a7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ:F

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぁごぐすすぃ:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〳ぜぞぜべっ:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぅみぱぎぎ:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->じぜこほぱ:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/PathMeasure;

    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    new-instance v0, Landroid/graphics/PathMeasure;

    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉひのべい:Landroid/graphics/PathMeasure;

    new-instance v0, Landroid/graphics/PathMeasure;

    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->せづっ〸ちね:Landroid/graphics/PathMeasure;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->のぷのちつ:Landroid/graphics/Rect;

    sget-object v0, Lのぷのちつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->FreshDownloadView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p1, :cond_d7

    const/4 v0, 0x2

    .line 1
    :try_start_72
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07006c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->setRadius(F)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    invoke-virtual {p0, p3}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->setCircularColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f06004c

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    invoke-virtual {p0, p3}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->setProgressColor(I)V

    const/4 p3, 0x3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07006a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    invoke-virtual {p0, p3}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->setCircularWidth(F)V

    const/4 p3, 0x4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07006d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    invoke-virtual {p0, p3}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->setProgressTextSize(F)V
    :try_end_ce
    .catchall {:try_start_72 .. :try_end_ce} :catchall_d2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_d7

    :catchall_d2
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2

    .line 2
    :cond_d7
    :goto_d7
    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getCircularWidth()F

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method private getCurrentHeight()I
    .registers 4

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v0, v0, v1

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ:F

    mul-float v2, v2, v1

    add-float/2addr v2, v0

    float-to-int v0, v2

    return v0
.end method

.method private getCurrentWidth()I
    .registers 4

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v0, v0, v1

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ:F

    mul-float v2, v2, v1

    add-float/2addr v2, v0

    float-to-int v0, v2

    return v0
.end method

.method private getDownLoadErrorAnimator()Landroid/animation/AnimatorSet;
    .registers 7

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v1, 0x2

    new-array v2, v1, [F

    fill-array-data v2, :array_58

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v3, 0x12c

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v5, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v5}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-virtual {v2, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v5, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$くし〴〺ぅ;

    invoke-direct {v5, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$くし〴〺ぅ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v2, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v1, v1, [F

    fill-array-data v1, :array_60

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v3, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v3}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$びぐびあび;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$びぐびあび;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet$Builder;->after(J)Landroid/animation/AnimatorSet$Builder;

    new-instance v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$づざかべべ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$づざかべべ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0

    nop

    :array_58
    .array-data 4
        0x3e4ccccd    # 0.2f
        0x3f4ccccd    # 0.8f
    .end array-data

    :array_60
    .array-data 4
        0x3e4ccccd    # 0.2f
        0x3f4ccccd    # 0.8f
    .end array-data
.end method

.method private getDownloadOkAnimator()Landroid/animation/AnimatorSet;
    .registers 9

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v1, 0x2

    new-array v2, v1, [F

    fill-array-data v2, :array_7c

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v3, 0x64

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぺふねづ〺;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぺふねづ〺;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$てぜきぽく;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$てぜきぽく;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-array v1, v1, [F

    fill-array-data v1, :array_84

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    const-wide/16 v3, 0xc8

    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v5}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v5, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$のぷのちつ;

    invoke-direct {v5, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$のぷのちつ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v1, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v5, 0x3

    new-array v5, v5, [F

    fill-array-data v5, :array_8c

    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v5

    const-wide/16 v6, 0x1f4

    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v5

    new-instance v6, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$へぬ〴づぞ;

    invoke-direct {v6, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$へぬ〴づぞ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v6, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$げつ〴ぬぐ;

    invoke-direct {v6, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    invoke-virtual {v0, v5}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Landroid/animation/AnimatorSet$Builder;->after(J)Landroid/animation/AnimatorSet$Builder;

    new-instance v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$〺つふすそ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0

    nop

    :array_7c
    .array-data 4
        0x0
        0x42820000    # 65.0f
    .end array-data

    :array_84
    .array-data 4
        0x0
        0x3f333333    # 0.7f
    .end array-data

    :array_8c
    .array-data 4
        0x0
        0x3eb33333    # 0.35f
        0x3e4ccccd    # 0.2f
    .end array-data
.end method

.method private getPrepareAnimator()Landroid/animation/AnimatorSet;
    .registers 6

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v1, 0x3

    new-array v1, v1, [F

    fill-array-data v1, :array_66

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v2, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$なぎぱいぢぎ;

    invoke-direct {v2, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$なぎぱいぢぎ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_70

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v3, 0x320

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$〳ぜぞぜべっ;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$〳ぜぞぜべっ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぺぁあねじ;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぺぁあねじ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->before(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    new-instance v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$いいにぽつ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$いいにぽつ;-><init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0

    nop

    :array_66
    .array-data 4
        0x0
        0x3e99999a    # 0.3f
        0x0
    .end array-data

    :array_70
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public getCircularColor()I
    .registers 2

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->くし〴〺ぅ:I

    return v0
.end method

.method public getCircularWidth()F
    .registers 2

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->づざかべべ:F

    return v0
.end method

.method public getProgressColor()I
    .registers 2

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->びぐびあび:I

    return v0
.end method

.method public getProgressTextSize()F
    .registers 2

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->てぜきぽく:F

    return v0
.end method

.method public getRadius()F
    .registers 2

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    return v0
.end method

.method public onAttachedToWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 10

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getCircularColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〳ぜぞぜべっ:Landroid/graphics/RectF;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぁごぐすすぃ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ:F

    invoke-virtual {v0, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v7, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    const/4 v4, 0x0

    const/high16 v5, 0x43b40000    # 360.0f

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, v0

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_fb

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_cd

    const/4 v4, 0x2

    if-eq v1, v4, :cond_87

    const/4 v0, 0x3

    if-eq v1, v0, :cond_41

    goto/16 :goto_134

    .line 1
    :cond_41
    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇ〳〲〺すっ:Z

    if-eqz v0, :cond_4a

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ばおぢでぎか:F

    invoke-virtual {p0, p1, v0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->げつ〴ぬぐ(Landroid/graphics/Canvas;F)V

    :cond_4a
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->びえぁぜい:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    iget v4, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ざっざへづ:F

    const v5, 0x3e4ccccd    # 0.2f

    mul-float v6, v4, v5

    iget v7, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぶでにく〼〳:F

    mul-float v7, v7, v4

    invoke-virtual {v1, v6, v7, v0, v3}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉひのべい:Landroid/graphics/PathMeasure;

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->でどあくず:F

    mul-float v5, v5, v2

    iget v4, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉ〲なぱぽた:F

    mul-float v4, v4, v2

    invoke-virtual {v1, v5, v4, v0, v3}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_134

    .line 2
    :cond_87
    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ち〴みぎ〻び:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぇぬぎばつ;

    iget v4, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉざぅち〻:F

    .line 3
    iget-object v5, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getProgressColor()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_bd

    if-eq v1, v3, :cond_9e

    goto/16 :goto_134

    :cond_9e
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->びえぁぜい:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->は〲ぱなで:F

    iget v4, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->へぬ〴づぞ:F

    mul-float v5, v2, v4

    iget v6, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ざとぅぼこ〺:F

    add-float/2addr v2, v6

    mul-float v2, v2, v4

    invoke-virtual {v1, v5, v2, v0, v3}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_134

    :cond_bd
    const/high16 v1, 0x43870000    # 270.0f

    sub-float v4, v1, v4

    const v5, 0x3eb851ec    # 0.36f

    const/4 v6, 0x0

    iget-object v7, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    move-object v2, p1

    move-object v3, v0

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_134

    .line 4
    :cond_cd
    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ばおぢでぎか:F

    iget-object v3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getProgressColor()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    cmpg-float v2, v1, v2

    if-gtz v2, :cond_e9

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v0, v2

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺふねづ〺:F

    iget-object v3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    goto :goto_f7

    :cond_e9
    const/high16 v4, -0x3d4c0000    # -90.0f

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v5, v1, v2

    const/4 v6, 0x0

    iget-object v7, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    move-object v2, p1

    move-object v3, v0

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :goto_f7
    invoke-virtual {p0, p1, v1}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->げつ〴ぬぐ(Landroid/graphics/Canvas;F)V

    goto :goto_134

    .line 5
    :cond_fb
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getProgressColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->げがぴうあだ:Landroid/graphics/DashPathEffect;

    if-eqz v0, :cond_10d

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_10d
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ながふずは:Landroid/graphics/DashPathEffect;

    if-eqz v0, :cond_11d

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_11d
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぅみぱぎぎ:Landroid/graphics/Path;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぃぜぶの〸ぃ:Landroid/graphics/DashPathEffect;

    if-eqz v0, :cond_12d

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_12d
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->じぜこほぱ:Landroid/graphics/Path;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_134
    return-void
.end method

.method public onMeasure(II)V
    .registers 7

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    invoke-direct {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getCurrentWidth()I

    move-result v0

    add-int/2addr v1, v0

    const/4 v0, 0x0

    add-int/2addr v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v2

    invoke-direct {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getCurrentHeight()I

    move-result v2

    add-int/2addr v3, v2

    add-int/2addr v3, v0

    invoke-static {v1, p1, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    invoke-static {v3, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_8a

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "\u001agk\u001bej\u00196h\u001ddmM4:\u00193iLbm\u0019a=MekI3:\u001da"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->くし〴〺ぅ:I

    const-string v0, "\u0019k;Kfh\u001969N`i\u001eji\u001b`iIb<O7n\u001d6iMb:K3nJefNclKd<I3i\u001c1m\u001d7gJdjNcgAglK7fJ"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->びぐびあび:I

    const-string v0, "\u001c6=\u001c3lOcnA4;Kei\u001a0<@foLknJ7nK79L6"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->づざかべべ:F

    const-string v0, "\u001b7>@fl\u00190>H4nK4=\u001d0;L3nO1mL`m\u001ea>Me"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ばおぢでぎか:F

    const-string v0, "Igg\u001cgf\u00191fAc;O4j\u0019c<\u001a69O7gLkf\u001d6<\u001ee"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    const-string v0, "LcgL7<\u0019a>OjmO6jHkiAe>@a;\u001aa=KkjH1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    const-string v0, "\u00196iL0>\u001c49K4o\u001b0gMcn\u001a1>Jag\u0019a=\u0019joM0<L1oL6fLf;M3o@7k\u001d1m\u001eg=Jf>O1jKagL"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->てぜきぽく:F

    const-string v0, "\u001ajkLe=\u001a0<Ha9\u001a6l\u001c6iJ4gMjn\u001c6f\u0019j9J1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8a
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    const-string v2, "\u001ajkLe=\u001a0<Ha9\u001a6l\u001c6iJ4gMjn\u001c6f\u0019j9J1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->くし〴〺ぅ:I

    const-string v2, "\u001agk\u001bej\u00196h\u001ddmM4:\u00193iLbm\u0019a=MekI3:\u001da"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->びぐびあび:I

    const-string v2, "\u0019k;Kfh\u001969N`i\u001eji\u001b`iIb<O7n\u001d6iMb:K3nJefNclKd<I3i\u001c1m\u001d7gJdjNcgAglK7fJ"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->づざかべべ:F

    const-string v2, "\u001c6=\u001c3lOcnA4;Kei\u001a0<@foLknJ7nK79L6"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ばおぢでぎか:F

    const-string v2, "\u001b7>@fl\u00190>H4nK4=\u001d0;L3nO1mL`m\u001ea>Me"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    const-string v2, "Igg\u001cgf\u00191fAc;O4j\u0019c<\u001a69O7gLkf\u001d6<\u001ee"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    const-string v2, "LcgL7<\u0019a>OjmO6jHkiAe>@a;\u001aa=KkjH1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->てぜきぽく:F

    const-string v2, "\u00196iL0>\u001c49K4o\u001b0gMcn\u001a1>Jag\u0019a=\u0019joM0<L1oL6fLf;M3o@7k\u001d1m\u001eg=Jf>O1jKagL"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .registers 6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    add-int/lit8 p1, p1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p2, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    add-int/lit8 p3, p3, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    sub-int/2addr p4, v0

    .line 1
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぁごぐすすぃ:Landroid/graphics/Rect;

    invoke-virtual {v0, p3, p1, p4, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 2
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result p2

    invoke-virtual {p0, p1, p3, p2}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ(IIF)V

    return-void
.end method

.method public setCircularColor(I)V
    .registers 2

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->くし〴〺ぅ:I

    return-void
.end method

.method public setCircularWidth(F)V
    .registers 2

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->づざかべべ:F

    return-void
.end method

.method public setProgressColor(I)V
    .registers 2

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->びぐびあび:I

    return-void
.end method

.method public declared-synchronized setProgressInternal(F)V
    .registers 4

    monitor-enter p0

    :try_start_1
    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ばおぢでぎか:F

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    sget-object v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->〺つふすそ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    if-ne v0, v1, :cond_1f

    .line 1
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->えがぐせほち:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_12

    iget-boolean v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->いいにぽつ:Z

    if-eqz v1, :cond_12

    goto :goto_1f

    :cond_12
    if-nez v0, :cond_1a

    invoke-direct {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getPrepareAnimator()Landroid/animation/AnimatorSet;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->えがぐせほち:Landroid/animation/AnimatorSet;

    :cond_1a
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->えがぐせほち:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 2
    :cond_1f
    :goto_1f
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_2b

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->づざかべべ()V
    :try_end_2b
    .catchall {:try_start_1 .. :try_end_2b} :catchall_2d

    :cond_2b
    monitor-exit p0

    return-void

    :catchall_2d
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setProgressTextSize(F)V
    .registers 2

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->てぜきぽく:F

    return-void
.end method

.method public setRadius(F)V
    .registers 2

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    return-void
.end method

.method public final 〺つふすそ(IIF)V
    .registers 5

    int-to-float p1, p1

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ:F

    add-float/2addr p1, v0

    int-to-float p2, p2

    add-float/2addr p2, v0

    iput p2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺふねづ〺:F

    const p2, 0x3ef5c28f    # 0.48f

    mul-float p3, p3, p2

    add-float/2addr p3, p1

    iput p3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->けときぜと:F

    iput p3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    sget-object p1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->〺つふすそ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ()V

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 3

    .line 1
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    sget-object v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    if-eq v0, v1, :cond_2e

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->いいにぽつ:Z

    if-nez v0, :cond_2e

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〻ぞまぎな〻:Z

    if-nez v0, :cond_2e

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ごづごきえ:Z

    if-eqz v0, :cond_13

    goto :goto_2e

    :cond_13
    sget-object v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->〺つふすそ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->けときぜと:F

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ()V

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    const/4 v0, 0x0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ばおぢでぎか:F

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ざとぅぼこ〺:F

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉざぅち〻:F

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->は〲ぱなで:F

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉ〲なぱぽた:F

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぶでにく〼〳:F

    :cond_2e
    :goto_2e
    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/graphics/Canvas;F)V
    .registers 9

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float p2, p2, v0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぁごぐすすぃ:Landroid/graphics/Rect;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getProgressTextSize()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    sub-int/2addr v2, v3

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v2, v1

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, v2

    iget-object v3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    iget-object v4, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->のぷのちつ:Landroid/graphics/Rect;

    const/4 v5, 0x0

    invoke-virtual {v1, p2, v5, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getProgressTextSize()F

    move-result v1

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v1, v3

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result p2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->のぷのちつ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    int-to-float p2, v0

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    const v1, 0x3dcccccd    # 0.1f

    mul-float v0, v0, v1

    add-float/2addr v0, p2

    iget-object p2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぶひせが:Landroid/graphics/Paint;

    const-string v1, "L7<\u001c6kAakMkj@0=M3l\u00191>\u001ekf@f;OaiH1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v2, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public づざかべべ()V
    .registers 19

    move-object/from16 v0, p0

    sget-object v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->びぐびあび:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    iput-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    .line 1
    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    const-wide/high16 v3, 0x4039000000000000L    # 25.0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v7

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v7

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v7

    const-wide v7, 0x404a800000000000L    # 53.0

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    mul-double v9, v9, v11

    mul-double v9, v9, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    mul-double v11, v11, v9

    iget-object v13, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    int-to-double v14, v1

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v7, v14, v5

    double-to-float v1, v7

    move-wide/from16 v16, v5

    int-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v5, v3

    double-to-float v2, v5

    invoke-virtual {v13, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    add-double/2addr v7, v11

    double-to-float v3, v7

    const-wide v7, 0x404a800000000000L    # 53.0

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    mul-double v7, v7, v9

    add-double/2addr v7, v5

    double-to-float v4, v7

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    add-double v14, v14, v16

    double-to-float v3, v14

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    iget-object v2, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v1

    iput v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->へぬ〴づぞ:F

    .line 2
    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->おぐぴう〸ず:Landroid/animation/AnimatorSet;

    if-eqz v1, :cond_c0

    iget-boolean v2, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ごづごきえ:Z

    if-eqz v2, :cond_c0

    return-void

    :cond_c0
    if-nez v1, :cond_c8

    invoke-direct/range {p0 .. p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getDownloadOkAnimator()Landroid/animation/AnimatorSet;

    move-result-object v1

    iput-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->おぐぴう〸ず:Landroid/animation/AnimatorSet;

    :cond_c8
    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->おぐぴう〸ず:Landroid/animation/AnimatorSet;

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method public final なぎぱいぢぎ()V
    .registers 13

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぅみぱぎぎ:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->じぜこほぱ:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v1, v2

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v1, v2

    iget v3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    add-float/2addr v3, v2

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぅみぱぎぎ:Landroid/graphics/Path;

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v1, v2

    iget v3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    add-float/2addr v3, v2

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぅみぱぎぎ:Landroid/graphics/Path;

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v1, v2

    float-to-double v1, v1

    const-wide/high16 v3, 0x4044000000000000L    # 40.0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->tan(D)D

    move-result-wide v5

    iget v7, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    float-to-double v8, v7

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v8

    const-wide v8, 0x3fdd70a3e0000000L    # 0.46000000834465027

    mul-double v5, v5, v8

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v1, v5

    double-to-float v1, v1

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    add-float/2addr v2, v7

    const v5, 0x3eeb851f    # 0.46f

    mul-float v7, v7, v5

    sub-float/2addr v2, v7

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->じぜこほぱ:Landroid/graphics/Path;

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v1, v2

    iget v6, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    add-float/2addr v6, v2

    invoke-virtual {v0, v1, v6}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->じぜこほぱ:Landroid/graphics/Path;

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->tan(D)D

    move-result-wide v3

    iget v6, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    float-to-double v10, v6

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v10

    mul-double v3, v3, v8

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v1

    double-to-float v1, v3

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    add-float/2addr v2, v6

    mul-float v6, v6, v5

    sub-float/2addr v2, v6

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉひのべい:Landroid/graphics/PathMeasure;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぅみぱぎぎ:Landroid/graphics/Path;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->せづっ〸ちね:Landroid/graphics/PathMeasure;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->じぜこほぱ:Landroid/graphics/Path;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇとしたべど:F

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉひのべい:Landroid/graphics/PathMeasure;

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->おかぷせ〱:F

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->せづっ〸ちね:Landroid/graphics/PathMeasure;

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺でおいここ:F

    return-void
.end method

.method public びぐびあび()V
    .registers 14

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;->づざかべべ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ておぞぞはね:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$おぐぴう〸ず;

    .line 1
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぁごぐすすぃ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    iget-object v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    int-to-double v3, v1

    const-wide v5, 0x4046800000000000L    # 45.0

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v1

    float-to-double v9, v1

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v9

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v7, v3, v7

    double-to-float v1, v7

    int-to-double v7, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v0

    float-to-double v11, v0

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v11

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v9, v7, v9

    double-to-float v0, v9

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v9

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v9

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v1, v3

    double-to-float v1, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v2

    float-to-double v11, v2

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v11

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v7

    double-to-float v2, v9

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺづげぺが:Landroid/graphics/PathMeasure;

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ざっざへづ:F

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v1

    float-to-double v11, v1

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v11

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v3

    double-to-float v1, v9

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v11

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v11

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v9, v7, v9

    double-to-float v9, v9

    invoke-virtual {v0, v1, v9}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v1

    float-to-double v11, v1

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v11

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v3, v9

    double-to-float v1, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v7

    double-to-float v3, v3

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉひのべい:Landroid/graphics/PathMeasure;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぉひのべい:Landroid/graphics/PathMeasure;

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->でどあくず:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇぬぎばつ:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_149

    iget-boolean v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〻ぞまぎな〻:Z

    if-eqz v1, :cond_149

    return-void

    :cond_149
    if-nez v0, :cond_151

    invoke-direct {p0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getDownLoadErrorAnimator()Landroid/animation/AnimatorSet;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇぬぎばつ:Landroid/animation/AnimatorSet;

    :cond_151
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇぬぎばつ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method
