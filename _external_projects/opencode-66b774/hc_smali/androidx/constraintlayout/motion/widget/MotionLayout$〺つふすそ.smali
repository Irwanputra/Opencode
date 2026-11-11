.class public Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/へぬ〴づぞ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:F

.field public くし〴〺ぅ:F

.field public げつ〴ぬぐ:F

.field public final synthetic びぐびあび:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 2

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->びぐびあび:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/へぬ〴づぞ;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->げつ〴ぬぐ:F

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->〺つふすそ:F

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .registers 7

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->げつ〴ぬぐ:F

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x0

    cmpl-float v2, v0, v2

    if-lez v2, :cond_27

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->くし〴〺ぅ:F

    div-float v3, v0, v2

    cmpg-float v3, v3, p1

    if-gez v3, :cond_13

    div-float p1, v0, v2

    :cond_13
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->びぐびあび:Landroidx/constraintlayout/motion/widget/MotionLayout;

    mul-float v4, v2, p1

    sub-float v4, v0, v4

    iput v4, v3, Landroidx/constraintlayout/motion/widget/MotionLayout;->ぶでにく〼〳:F

    mul-float v0, v0, p1

    mul-float v2, v2, p1

    mul-float v2, v2, p1

    div-float/2addr v2, v1

    sub-float/2addr v0, v2

    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->〺つふすそ:F

    add-float/2addr v0, p1

    return v0

    :cond_27
    neg-float v2, v0

    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->くし〴〺ぅ:F

    div-float/2addr v2, v3

    cmpg-float v2, v2, p1

    if-gez v2, :cond_31

    neg-float p1, v0

    div-float/2addr p1, v3

    :cond_31
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->びぐびあび:Landroidx/constraintlayout/motion/widget/MotionLayout;

    mul-float v4, v3, p1

    add-float/2addr v4, v0

    iput v4, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->ぶでにく〼〳:F

    mul-float v0, v0, p1

    mul-float v3, v3, p1

    mul-float v3, v3, p1

    div-float/2addr v3, v1

    add-float/2addr v3, v0

    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->〺つふすそ:F

    add-float/2addr v3, p1

    return v3
.end method

.method public げつ〴ぬぐ()F
    .registers 2

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$〺つふすそ;->びぐびあび:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ぶでにく〼〳:F

    return v0
.end method
